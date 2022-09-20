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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XMYPart3Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XMYPart3;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart3Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart3ModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XMYPart3Persistence;

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
 * The persistence implementation for the vr technical spec_xmy part3 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMYPart3Persistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XMYPart3Util
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XMYPart3PersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XMYPart3>
	implements VRTechnicalSpec_XMYPart3Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XMYPart3Util} to access the vr technical spec_xmy part3 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XMYPart3Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XMYPart3ModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XMYPart3.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XMYPart3.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
				query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		List<VRTechnicalSpec_XMYPart3> list = findByDossierNo(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart3> list = findByDossierNo(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part3s before and after the current vr technical spec_xmy part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part3
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3[] array = new VRTechnicalSpec_XMYPart3Impl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart3;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, dossierNo, mtCore,
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

	protected VRTechnicalSpec_XMYPart3 getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part3s where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xmy part3s
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XMYPart3.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XMYPart3.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XMYPart3.dossierNo IS NULL OR vrTechnicalSpec_XMYPart3.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XMYPart3.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XMYPart3ModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part3s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierIdCTN(
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierIdCTN(
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XMYPart3.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
				query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		List<VRTechnicalSpec_XMYPart3> list = findByDossierIdCTN(dossierIdCTN,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart3> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part3s before and after the current vr technical spec_xmy part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part3
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3[] array = new VRTechnicalSpec_XMYPart3Impl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, dossierIdCTN, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XMYPart3;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_XMYPart3 getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part3s where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xmy part3s
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XMYPart3.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XMYPart3.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XMYPart3.dossierIdCTN IS NULL OR vrTechnicalSpec_XMYPart3.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XMYPart3ModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part3s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XMYPart3.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
				query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		List<VRTechnicalSpec_XMYPart3> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart3> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part3s before and after the current vr technical spec_xmy part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part3
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3[] array = new VRTechnicalSpec_XMYPart3Impl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, deliverableCode,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart3;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, deliverableCode,
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

	protected VRTechnicalSpec_XMYPart3 getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part3s where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xmy part3s
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
		"vrTechnicalSpec_XMYPart3.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XMYPart3.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XMYPart3.deliverableCode IS NULL OR vrTechnicalSpec_XMYPart3.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XMYPart3ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : list) {
					if ((dossierId != vrTechnicalSpec_XMYPart3.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XMYPart3.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		List<VRTechnicalSpec_XMYPart3> list = findByDossierId(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart3> list = findByDossierId(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part3s before and after the current vr technical spec_xmy part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part3
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3[] array = new VRTechnicalSpec_XMYPart3Impl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart3;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, dossierId, mtCore,
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

	protected VRTechnicalSpec_XMYPart3 getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part3s where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xmy part3s
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XMYPart3.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XMYPart3.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XMYPart3ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part3s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : list) {
					if ((dossierId != vrTechnicalSpec_XMYPart3.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		List<VRTechnicalSpec_XMYPart3> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart3> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part3s before and after the current vr technical spec_xmy part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part3
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3[] array = new VRTechnicalSpec_XMYPart3Impl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart3;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, dossierId, orderByComparator,
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

	protected VRTechnicalSpec_XMYPart3 getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part3s where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xmy part3s
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XMYPart3.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XMYPart3ModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part3s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : list) {
					if ((convertAssembleId != vrTechnicalSpec_XMYPart3.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		List<VRTechnicalSpec_XMYPart3> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart3> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part3s before and after the current vr technical spec_xmy part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part3
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3[] array = new VRTechnicalSpec_XMYPart3Impl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart3;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, convertAssembleId,
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

	protected VRTechnicalSpec_XMYPart3 getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part3s where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xmy part3s
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
		"vrTechnicalSpec_XMYPart3.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XMYPart3ModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part3s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByReferenceUid(
		String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByReferenceUid(
		String referenceUid, int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XMYPart3.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
				query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		List<VRTechnicalSpec_XMYPart3> list = findByReferenceUid(referenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart3> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part3s before and after the current vr technical spec_xmy part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part3
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3[] array = new VRTechnicalSpec_XMYPart3Impl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, referenceUid, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XMYPart3;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_XMYPart3 getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part3s where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xmy part3s
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XMYPart3.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XMYPart3.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XMYPart3.referenceUid IS NULL OR vrTechnicalSpec_XMYPart3.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XMYPart3ModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XMYPart3.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		List<VRTechnicalSpec_XMYPart3> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart3 != null) {
			return vrTechnicalSpec_XMYPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part3, or <code>null</code> if a matching vr technical spec_xmy part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart3> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part3s before and after the current vr technical spec_xmy part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part3
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3[] array = new VRTechnicalSpec_XMYPart3Impl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart3;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart3, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XMYPart3 getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part3s where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xmy part3s
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE);

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
		"vrTechnicalSpec_XMYPart3.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XMYPart3PersistenceImpl() {
		setModelClass(VRTechnicalSpec_XMYPart3.class);
	}

	/**
	 * Caches the vr technical spec_xmy part3 in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XMYPart3 the vr technical spec_xmy part3
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3) {
		entityCache.putResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			vrTechnicalSpec_XMYPart3.getPrimaryKey(), vrTechnicalSpec_XMYPart3);

		vrTechnicalSpec_XMYPart3.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xmy part3s in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XMYPart3s the vr technical spec_xmy part3s
	 */
	@Override
	public void cacheResult(
		List<VRTechnicalSpec_XMYPart3> vrTechnicalSpec_XMYPart3s) {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : vrTechnicalSpec_XMYPart3s) {
			if (entityCache.getResult(
						VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XMYPart3Impl.class,
						vrTechnicalSpec_XMYPart3.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XMYPart3);
			}
			else {
				vrTechnicalSpec_XMYPart3.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xmy part3s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XMYPart3Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xmy part3.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3) {
		entityCache.removeResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			vrTechnicalSpec_XMYPart3.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRTechnicalSpec_XMYPart3> vrTechnicalSpec_XMYPart3s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : vrTechnicalSpec_XMYPart3s) {
			entityCache.removeResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XMYPart3Impl.class,
				vrTechnicalSpec_XMYPart3.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xmy part3 with the primary key. Does not add the vr technical spec_xmy part3 to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xmy part3
	 * @return the new vr technical spec_xmy part3
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 create(long id) {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = new VRTechnicalSpec_XMYPart3Impl();

		vrTechnicalSpec_XMYPart3.setNew(true);
		vrTechnicalSpec_XMYPart3.setPrimaryKey(id);

		return vrTechnicalSpec_XMYPart3;
	}

	/**
	 * Removes the vr technical spec_xmy part3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xmy part3
	 * @return the vr technical spec_xmy part3 that was removed
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 remove(long id)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xmy part3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xmy part3
	 * @return the vr technical spec_xmy part3 that was removed
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = (VRTechnicalSpec_XMYPart3)session.get(VRTechnicalSpec_XMYPart3Impl.class,
					primaryKey);

			if (vrTechnicalSpec_XMYPart3 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XMYPart3Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XMYPart3);
		}
		catch (NoSuchVRTechnicalSpec_XMYPart3Exception nsee) {
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
	protected VRTechnicalSpec_XMYPart3 removeImpl(
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3) {
		vrTechnicalSpec_XMYPart3 = toUnwrappedModel(vrTechnicalSpec_XMYPart3);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XMYPart3)) {
				vrTechnicalSpec_XMYPart3 = (VRTechnicalSpec_XMYPart3)session.get(VRTechnicalSpec_XMYPart3Impl.class,
						vrTechnicalSpec_XMYPart3.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XMYPart3 != null) {
				session.delete(vrTechnicalSpec_XMYPart3);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XMYPart3 != null) {
			clearCache(vrTechnicalSpec_XMYPart3);
		}

		return vrTechnicalSpec_XMYPart3;
	}

	@Override
	public VRTechnicalSpec_XMYPart3 updateImpl(
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3) {
		vrTechnicalSpec_XMYPart3 = toUnwrappedModel(vrTechnicalSpec_XMYPart3);

		boolean isNew = vrTechnicalSpec_XMYPart3.isNew();

		VRTechnicalSpec_XMYPart3ModelImpl vrTechnicalSpec_XMYPart3ModelImpl = (VRTechnicalSpec_XMYPart3ModelImpl)vrTechnicalSpec_XMYPart3;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XMYPart3.isNew()) {
				session.save(vrTechnicalSpec_XMYPart3);

				vrTechnicalSpec_XMYPart3.setNew(false);
			}
			else {
				vrTechnicalSpec_XMYPart3 = (VRTechnicalSpec_XMYPart3)session.merge(vrTechnicalSpec_XMYPart3);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XMYPart3ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XMYPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getDossierNo(),
						vrTechnicalSpec_XMYPart3ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XMYPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XMYPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XMYPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getDossierId(),
						vrTechnicalSpec_XMYPart3ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XMYPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XMYPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XMYPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XMYPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart3ModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart3Impl.class,
			vrTechnicalSpec_XMYPart3.getPrimaryKey(), vrTechnicalSpec_XMYPart3,
			false);

		vrTechnicalSpec_XMYPart3.resetOriginalValues();

		return vrTechnicalSpec_XMYPart3;
	}

	protected VRTechnicalSpec_XMYPart3 toUnwrappedModel(
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3) {
		if (vrTechnicalSpec_XMYPart3 instanceof VRTechnicalSpec_XMYPart3Impl) {
			return vrTechnicalSpec_XMYPart3;
		}

		VRTechnicalSpec_XMYPart3Impl vrTechnicalSpec_XMYPart3Impl = new VRTechnicalSpec_XMYPart3Impl();

		vrTechnicalSpec_XMYPart3Impl.setNew(vrTechnicalSpec_XMYPart3.isNew());
		vrTechnicalSpec_XMYPart3Impl.setPrimaryKey(vrTechnicalSpec_XMYPart3.getPrimaryKey());

		vrTechnicalSpec_XMYPart3Impl.setId(vrTechnicalSpec_XMYPart3.getId());
		vrTechnicalSpec_XMYPart3Impl.setMtCore(vrTechnicalSpec_XMYPart3.getMtCore());
		vrTechnicalSpec_XMYPart3Impl.setConvertAssembleId(vrTechnicalSpec_XMYPart3.getConvertAssembleId());
		vrTechnicalSpec_XMYPart3Impl.setDossierId(vrTechnicalSpec_XMYPart3.getDossierId());
		vrTechnicalSpec_XMYPart3Impl.setDossierNo(vrTechnicalSpec_XMYPart3.getDossierNo());
		vrTechnicalSpec_XMYPart3Impl.setReferenceUid(vrTechnicalSpec_XMYPart3.getReferenceUid());
		vrTechnicalSpec_XMYPart3Impl.setDossierIdCTN(vrTechnicalSpec_XMYPart3.getDossierIdCTN());
		vrTechnicalSpec_XMYPart3Impl.setDeliverableCode(vrTechnicalSpec_XMYPart3.getDeliverableCode());
		vrTechnicalSpec_XMYPart3Impl.setVehicleTypeCertificateId(vrTechnicalSpec_XMYPart3.getVehicleTypeCertificateId());
		vrTechnicalSpec_XMYPart3Impl.setXMY0149(vrTechnicalSpec_XMYPart3.getXMY0149());
		vrTechnicalSpec_XMYPart3Impl.setXMY0150(vrTechnicalSpec_XMYPart3.getXMY0150());
		vrTechnicalSpec_XMYPart3Impl.setXMY0151(vrTechnicalSpec_XMYPart3.getXMY0151());
		vrTechnicalSpec_XMYPart3Impl.setXMY0152(vrTechnicalSpec_XMYPart3.getXMY0152());
		vrTechnicalSpec_XMYPart3Impl.setXMY0153(vrTechnicalSpec_XMYPart3.getXMY0153());
		vrTechnicalSpec_XMYPart3Impl.setXMY0154(vrTechnicalSpec_XMYPart3.getXMY0154());
		vrTechnicalSpec_XMYPart3Impl.setXMY0155(vrTechnicalSpec_XMYPart3.getXMY0155());
		vrTechnicalSpec_XMYPart3Impl.setXMY0156(vrTechnicalSpec_XMYPart3.getXMY0156());
		vrTechnicalSpec_XMYPart3Impl.setXMY0157(vrTechnicalSpec_XMYPart3.getXMY0157());
		vrTechnicalSpec_XMYPart3Impl.setXMY0158(vrTechnicalSpec_XMYPart3.getXMY0158());
		vrTechnicalSpec_XMYPart3Impl.setXMY0159(vrTechnicalSpec_XMYPart3.getXMY0159());
		vrTechnicalSpec_XMYPart3Impl.setXMY0160(vrTechnicalSpec_XMYPart3.getXMY0160());
		vrTechnicalSpec_XMYPart3Impl.setXMY0161(vrTechnicalSpec_XMYPart3.getXMY0161());
		vrTechnicalSpec_XMYPart3Impl.setXMY0162(vrTechnicalSpec_XMYPart3.getXMY0162());
		vrTechnicalSpec_XMYPart3Impl.setXMY0163(vrTechnicalSpec_XMYPart3.getXMY0163());
		vrTechnicalSpec_XMYPart3Impl.setXMY0164(vrTechnicalSpec_XMYPart3.getXMY0164());
		vrTechnicalSpec_XMYPart3Impl.setXMY0165(vrTechnicalSpec_XMYPart3.getXMY0165());
		vrTechnicalSpec_XMYPart3Impl.setXMY0166(vrTechnicalSpec_XMYPart3.getXMY0166());
		vrTechnicalSpec_XMYPart3Impl.setXMY0167(vrTechnicalSpec_XMYPart3.getXMY0167());
		vrTechnicalSpec_XMYPart3Impl.setXMY0168(vrTechnicalSpec_XMYPart3.getXMY0168());
		vrTechnicalSpec_XMYPart3Impl.setXMY0169(vrTechnicalSpec_XMYPart3.getXMY0169());
		vrTechnicalSpec_XMYPart3Impl.setXMY0170(vrTechnicalSpec_XMYPart3.getXMY0170());
		vrTechnicalSpec_XMYPart3Impl.setXMY0171(vrTechnicalSpec_XMYPart3.getXMY0171());
		vrTechnicalSpec_XMYPart3Impl.setXMY0172(vrTechnicalSpec_XMYPart3.getXMY0172());
		vrTechnicalSpec_XMYPart3Impl.setXMY0173(vrTechnicalSpec_XMYPart3.getXMY0173());
		vrTechnicalSpec_XMYPart3Impl.setXMY0174(vrTechnicalSpec_XMYPart3.getXMY0174());
		vrTechnicalSpec_XMYPart3Impl.setXMY0175(vrTechnicalSpec_XMYPart3.getXMY0175());
		vrTechnicalSpec_XMYPart3Impl.setXMY0176(vrTechnicalSpec_XMYPart3.getXMY0176());
		vrTechnicalSpec_XMYPart3Impl.setXMY0177(vrTechnicalSpec_XMYPart3.getXMY0177());
		vrTechnicalSpec_XMYPart3Impl.setXMY0178(vrTechnicalSpec_XMYPart3.getXMY0178());
		vrTechnicalSpec_XMYPart3Impl.setXMY0179(vrTechnicalSpec_XMYPart3.getXMY0179());
		vrTechnicalSpec_XMYPart3Impl.setXMY0180(vrTechnicalSpec_XMYPart3.getXMY0180());
		vrTechnicalSpec_XMYPart3Impl.setXMY0181(vrTechnicalSpec_XMYPart3.getXMY0181());
		vrTechnicalSpec_XMYPart3Impl.setXMY0182(vrTechnicalSpec_XMYPart3.getXMY0182());
		vrTechnicalSpec_XMYPart3Impl.setXMY0183(vrTechnicalSpec_XMYPart3.getXMY0183());
		vrTechnicalSpec_XMYPart3Impl.setXMY0184(vrTechnicalSpec_XMYPart3.getXMY0184());
		vrTechnicalSpec_XMYPart3Impl.setXMY0185(vrTechnicalSpec_XMYPart3.getXMY0185());
		vrTechnicalSpec_XMYPart3Impl.setXMY0186(vrTechnicalSpec_XMYPart3.getXMY0186());
		vrTechnicalSpec_XMYPart3Impl.setXMY0187(vrTechnicalSpec_XMYPart3.getXMY0187());
		vrTechnicalSpec_XMYPart3Impl.setXMY0188(vrTechnicalSpec_XMYPart3.getXMY0188());
		vrTechnicalSpec_XMYPart3Impl.setXMY0189(vrTechnicalSpec_XMYPart3.getXMY0189());
		vrTechnicalSpec_XMYPart3Impl.setXMY0190(vrTechnicalSpec_XMYPart3.getXMY0190());
		vrTechnicalSpec_XMYPart3Impl.setXMY0191(vrTechnicalSpec_XMYPart3.getXMY0191());
		vrTechnicalSpec_XMYPart3Impl.setXMY0192(vrTechnicalSpec_XMYPart3.getXMY0192());
		vrTechnicalSpec_XMYPart3Impl.setXMY0193(vrTechnicalSpec_XMYPart3.getXMY0193());
		vrTechnicalSpec_XMYPart3Impl.setXMY0194(vrTechnicalSpec_XMYPart3.getXMY0194());
		vrTechnicalSpec_XMYPart3Impl.setXMY0195(vrTechnicalSpec_XMYPart3.getXMY0195());
		vrTechnicalSpec_XMYPart3Impl.setXMY0196(vrTechnicalSpec_XMYPart3.getXMY0196());
		vrTechnicalSpec_XMYPart3Impl.setXMY0197(vrTechnicalSpec_XMYPart3.getXMY0197());
		vrTechnicalSpec_XMYPart3Impl.setXMY0198(vrTechnicalSpec_XMYPart3.getXMY0198());
		vrTechnicalSpec_XMYPart3Impl.setXMY0199(vrTechnicalSpec_XMYPart3.getXMY0199());
		vrTechnicalSpec_XMYPart3Impl.setXMY0200(vrTechnicalSpec_XMYPart3.getXMY0200());
		vrTechnicalSpec_XMYPart3Impl.setXMY0201(vrTechnicalSpec_XMYPart3.getXMY0201());
		vrTechnicalSpec_XMYPart3Impl.setXMY0202(vrTechnicalSpec_XMYPart3.getXMY0202());
		vrTechnicalSpec_XMYPart3Impl.setXMY0203(vrTechnicalSpec_XMYPart3.getXMY0203());
		vrTechnicalSpec_XMYPart3Impl.setXMY0204(vrTechnicalSpec_XMYPart3.getXMY0204());
		vrTechnicalSpec_XMYPart3Impl.setXMY0205(vrTechnicalSpec_XMYPart3.getXMY0205());
		vrTechnicalSpec_XMYPart3Impl.setXMY0207(vrTechnicalSpec_XMYPart3.getXMY0207());
		vrTechnicalSpec_XMYPart3Impl.setXMY0208(vrTechnicalSpec_XMYPart3.getXMY0208());
		vrTechnicalSpec_XMYPart3Impl.setXMY0209(vrTechnicalSpec_XMYPart3.getXMY0209());
		vrTechnicalSpec_XMYPart3Impl.setXMY0210(vrTechnicalSpec_XMYPart3.getXMY0210());
		vrTechnicalSpec_XMYPart3Impl.setXMY0211(vrTechnicalSpec_XMYPart3.getXMY0211());
		vrTechnicalSpec_XMYPart3Impl.setXMY0212(vrTechnicalSpec_XMYPart3.getXMY0212());
		vrTechnicalSpec_XMYPart3Impl.setXMY0213(vrTechnicalSpec_XMYPart3.getXMY0213());
		vrTechnicalSpec_XMYPart3Impl.setXMY0214(vrTechnicalSpec_XMYPart3.getXMY0214());
		vrTechnicalSpec_XMYPart3Impl.setXMY0215(vrTechnicalSpec_XMYPart3.getXMY0215());
		vrTechnicalSpec_XMYPart3Impl.setXMY0216(vrTechnicalSpec_XMYPart3.getXMY0216());
		vrTechnicalSpec_XMYPart3Impl.setXMY0217(vrTechnicalSpec_XMYPart3.getXMY0217());
		vrTechnicalSpec_XMYPart3Impl.setXMY0218(vrTechnicalSpec_XMYPart3.getXMY0218());
		vrTechnicalSpec_XMYPart3Impl.setXMY0219(vrTechnicalSpec_XMYPart3.getXMY0219());
		vrTechnicalSpec_XMYPart3Impl.setXMY0220(vrTechnicalSpec_XMYPart3.getXMY0220());
		vrTechnicalSpec_XMYPart3Impl.setXMY0221(vrTechnicalSpec_XMYPart3.getXMY0221());
		vrTechnicalSpec_XMYPart3Impl.setXMY0222(vrTechnicalSpec_XMYPart3.getXMY0222());
		vrTechnicalSpec_XMYPart3Impl.setXMY0223(vrTechnicalSpec_XMYPart3.getXMY0223());
		vrTechnicalSpec_XMYPart3Impl.setXMY0224(vrTechnicalSpec_XMYPart3.getXMY0224());
		vrTechnicalSpec_XMYPart3Impl.setXMY0225(vrTechnicalSpec_XMYPart3.getXMY0225());
		vrTechnicalSpec_XMYPart3Impl.setXMY0226(vrTechnicalSpec_XMYPart3.getXMY0226());
		vrTechnicalSpec_XMYPart3Impl.setXMY0227(vrTechnicalSpec_XMYPart3.getXMY0227());
		vrTechnicalSpec_XMYPart3Impl.setXMY0228(vrTechnicalSpec_XMYPart3.getXMY0228());
		vrTechnicalSpec_XMYPart3Impl.setXMY0229(vrTechnicalSpec_XMYPart3.getXMY0229());
		vrTechnicalSpec_XMYPart3Impl.setXMY0230(vrTechnicalSpec_XMYPart3.getXMY0230());
		vrTechnicalSpec_XMYPart3Impl.setXMY0231(vrTechnicalSpec_XMYPart3.getXMY0231());
		vrTechnicalSpec_XMYPart3Impl.setXMY0232(vrTechnicalSpec_XMYPart3.getXMY0232());
		vrTechnicalSpec_XMYPart3Impl.setXMY0233(vrTechnicalSpec_XMYPart3.getXMY0233());
		vrTechnicalSpec_XMYPart3Impl.setXMY0234(vrTechnicalSpec_XMYPart3.getXMY0234());
		vrTechnicalSpec_XMYPart3Impl.setXMY0235(vrTechnicalSpec_XMYPart3.getXMY0235());
		vrTechnicalSpec_XMYPart3Impl.setXMY0236(vrTechnicalSpec_XMYPart3.getXMY0236());
		vrTechnicalSpec_XMYPart3Impl.setXMY0237(vrTechnicalSpec_XMYPart3.getXMY0237());
		vrTechnicalSpec_XMYPart3Impl.setXMY0238(vrTechnicalSpec_XMYPart3.getXMY0238());
		vrTechnicalSpec_XMYPart3Impl.setXMY0239(vrTechnicalSpec_XMYPart3.getXMY0239());
		vrTechnicalSpec_XMYPart3Impl.setXMY0240(vrTechnicalSpec_XMYPart3.getXMY0240());
		vrTechnicalSpec_XMYPart3Impl.setXMY0241(vrTechnicalSpec_XMYPart3.getXMY0241());
		vrTechnicalSpec_XMYPart3Impl.setXMY0242(vrTechnicalSpec_XMYPart3.getXMY0242());
		vrTechnicalSpec_XMYPart3Impl.setXMY0243(vrTechnicalSpec_XMYPart3.getXMY0243());
		vrTechnicalSpec_XMYPart3Impl.setXMY0244(vrTechnicalSpec_XMYPart3.getXMY0244());
		vrTechnicalSpec_XMYPart3Impl.setXMY0245(vrTechnicalSpec_XMYPart3.getXMY0245());
		vrTechnicalSpec_XMYPart3Impl.setXMY0246(vrTechnicalSpec_XMYPart3.getXMY0246());
		vrTechnicalSpec_XMYPart3Impl.setXMY0247(vrTechnicalSpec_XMYPart3.getXMY0247());
		vrTechnicalSpec_XMYPart3Impl.setXMY0248(vrTechnicalSpec_XMYPart3.getXMY0248());
		vrTechnicalSpec_XMYPart3Impl.setXMY0249(vrTechnicalSpec_XMYPart3.getXMY0249());
		vrTechnicalSpec_XMYPart3Impl.setXMY0250(vrTechnicalSpec_XMYPart3.getXMY0250());
		vrTechnicalSpec_XMYPart3Impl.setXMY0251(vrTechnicalSpec_XMYPart3.getXMY0251());
		vrTechnicalSpec_XMYPart3Impl.setXMY0252(vrTechnicalSpec_XMYPart3.getXMY0252());
		vrTechnicalSpec_XMYPart3Impl.setXMY0253(vrTechnicalSpec_XMYPart3.getXMY0253());
		vrTechnicalSpec_XMYPart3Impl.setXMY0254(vrTechnicalSpec_XMYPart3.getXMY0254());
		vrTechnicalSpec_XMYPart3Impl.setXMY0255(vrTechnicalSpec_XMYPart3.getXMY0255());
		vrTechnicalSpec_XMYPart3Impl.setXMY0256(vrTechnicalSpec_XMYPart3.getXMY0256());
		vrTechnicalSpec_XMYPart3Impl.setXMY0257(vrTechnicalSpec_XMYPart3.getXMY0257());
		vrTechnicalSpec_XMYPart3Impl.setXMY0258(vrTechnicalSpec_XMYPart3.getXMY0258());
		vrTechnicalSpec_XMYPart3Impl.setXMY0259(vrTechnicalSpec_XMYPart3.getXMY0259());
		vrTechnicalSpec_XMYPart3Impl.setXMY0260(vrTechnicalSpec_XMYPart3.getXMY0260());
		vrTechnicalSpec_XMYPart3Impl.setXMY0261(vrTechnicalSpec_XMYPart3.getXMY0261());
		vrTechnicalSpec_XMYPart3Impl.setXMY0262(vrTechnicalSpec_XMYPart3.getXMY0262());
		vrTechnicalSpec_XMYPart3Impl.setXMY0263(vrTechnicalSpec_XMYPart3.getXMY0263());
		vrTechnicalSpec_XMYPart3Impl.setXMY0264(vrTechnicalSpec_XMYPart3.getXMY0264());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY001(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY001());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY002(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY002());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY003(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY003());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY004(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY004());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY005(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY005());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY006(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY006());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY012(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY012());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY013(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY013());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY014(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY014());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY015(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY015());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY016(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY016());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY017(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY017());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY018(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY018());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY019(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY019());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY020(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY020());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY021(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY021());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY022(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY022());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY024(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY024());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY026(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY026());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY027(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY027());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY028(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY028());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY029(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY029());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY033(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY033());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY034(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY034());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY037(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY037());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY038(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY038());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY039(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY039());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY040(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY040());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY041(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY041());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY042(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY042());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY043(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY043());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY044(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY044());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY045(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY045());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXDD030(vrTechnicalSpec_XMYPart3.getBBCNCLKLXDD030());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY046(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY046());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY047(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY047());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY053(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY053());
		vrTechnicalSpec_XMYPart3Impl.setBBCNCLKLXMY054(vrTechnicalSpec_XMYPart3.getBBCNCLKLXMY054());
		vrTechnicalSpec_XMYPart3Impl.setModifyDate(vrTechnicalSpec_XMYPart3.getModifyDate());
		vrTechnicalSpec_XMYPart3Impl.setSyncDate(vrTechnicalSpec_XMYPart3.getSyncDate());

		return vrTechnicalSpec_XMYPart3Impl;
	}

	/**
	 * Returns the vr technical spec_xmy part3 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xmy part3
	 * @return the vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XMYPart3 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XMYPart3Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XMYPart3;
	}

	/**
	 * Returns the vr technical spec_xmy part3 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XMYPart3Exception} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xmy part3
	 * @return the vr technical spec_xmy part3
	 * @throws NoSuchVRTechnicalSpec_XMYPart3Exception if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XMYPart3Exception {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xmy part3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xmy part3
	 * @return the vr technical spec_xmy part3, or <code>null</code> if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XMYPart3Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = (VRTechnicalSpec_XMYPart3)serializable;

		if (vrTechnicalSpec_XMYPart3 == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XMYPart3 = (VRTechnicalSpec_XMYPart3)session.get(VRTechnicalSpec_XMYPart3Impl.class,
						primaryKey);

				if (vrTechnicalSpec_XMYPart3 != null) {
					cacheResult(vrTechnicalSpec_XMYPart3);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XMYPart3Impl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XMYPart3Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XMYPart3;
	}

	/**
	 * Returns the vr technical spec_xmy part3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xmy part3
	 * @return the vr technical spec_xmy part3, or <code>null</code> if a vr technical spec_xmy part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart3 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XMYPart3> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XMYPart3> map = new HashMap<Serializable, VRTechnicalSpec_XMYPart3>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XMYPart3 != null) {
				map.put(primaryKey, vrTechnicalSpec_XMYPart3);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XMYPart3Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XMYPart3)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : (List<VRTechnicalSpec_XMYPart3>)q.list()) {
				map.put(vrTechnicalSpec_XMYPart3.getPrimaryKeyObj(),
					vrTechnicalSpec_XMYPart3);

				cacheResult(vrTechnicalSpec_XMYPart3);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XMYPart3.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XMYPart3ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XMYPart3Impl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xmy part3s.
	 *
	 * @return the vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @return the range of vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xmy part3s
	 * @param end the upper bound of the range of vr technical spec_xmy part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xmy part3s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart3> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart3> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart3>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART3);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XMYPART3;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XMYPart3ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart3>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xmy part3s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 : findAll()) {
			remove(vrTechnicalSpec_XMYPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part3s.
	 *
	 * @return the number of vr technical spec_xmy part3s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XMYPART3);

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
		return VRTechnicalSpec_XMYPart3ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xmy part3 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XMYPart3Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XMYPART3 = "SELECT vrTechnicalSpec_XMYPart3 FROM VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE_PKS_IN =
		"SELECT vrTechnicalSpec_XMYPart3 FROM VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XMYPART3_WHERE = "SELECT vrTechnicalSpec_XMYPart3 FROM VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XMYPART3 = "SELECT COUNT(vrTechnicalSpec_XMYPart3) FROM VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XMYPART3_WHERE = "SELECT COUNT(vrTechnicalSpec_XMYPart3) FROM VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XMYPart3.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XMYPart3 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XMYPart3 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XMYPart3PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}