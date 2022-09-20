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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCNPart3Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XCNPart3;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart3Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart3ModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XCNPart3Persistence;

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
 * The persistence implementation for the vr technical spec_xcn part3 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCNPart3Persistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XCNPart3Util
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNPart3PersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XCNPart3>
	implements VRTechnicalSpec_XCNPart3Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XCNPart3Util} to access the vr technical spec_xcn part3 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XCNPart3Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCNPart3ModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcn part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XCNPart3.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XCNPart3.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
				query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcn part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcn part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		List<VRTechnicalSpec_XCNPart3> list = findByDossierNo(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCNPart3> list = findByDossierNo(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcn part3s before and after the current vr technical spec_xcn part3 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcn part3
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3[] array = new VRTechnicalSpec_XCNPart3Impl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCNPart3;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, dossierNo, mtCore,
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

	protected VRTechnicalSpec_XCNPart3 getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
			query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCNPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCNPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcn part3s where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcn part3s
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XCNPart3.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XCNPart3.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XCNPart3.dossierNo IS NULL OR vrTechnicalSpec_XCNPart3.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XCNPart3.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCNPart3ModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcn part3s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierIdCTN(
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierIdCTN(
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XCNPart3.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
				query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcn part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcn part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		List<VRTechnicalSpec_XCNPart3> list = findByDossierIdCTN(dossierIdCTN,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCNPart3> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcn part3s before and after the current vr technical spec_xcn part3 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcn part3
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3[] array = new VRTechnicalSpec_XCNPart3Impl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, dossierIdCTN, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCNPart3;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_XCNPart3 getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
			query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCNPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCNPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcn part3s where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xcn part3s
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XCNPart3.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XCNPart3.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XCNPart3.dossierIdCTN IS NULL OR vrTechnicalSpec_XCNPart3.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCNPart3ModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcn part3s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XCNPart3.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
				query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcn part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcn part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		List<VRTechnicalSpec_XCNPart3> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCNPart3> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcn part3s before and after the current vr technical spec_xcn part3 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcn part3
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3[] array = new VRTechnicalSpec_XCNPart3Impl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, deliverableCode,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCNPart3;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, deliverableCode,
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

	protected VRTechnicalSpec_XCNPart3 getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
			query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCNPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCNPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcn part3s where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xcn part3s
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
		"vrTechnicalSpec_XCNPart3.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XCNPart3.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XCNPart3.deliverableCode IS NULL OR vrTechnicalSpec_XCNPart3.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCNPart3ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcn part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : list) {
					if ((dossierId != vrTechnicalSpec_XCNPart3.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XCNPart3.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcn part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcn part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		List<VRTechnicalSpec_XCNPart3> list = findByDossierId(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCNPart3> list = findByDossierId(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcn part3s before and after the current vr technical spec_xcn part3 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcn part3
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3[] array = new VRTechnicalSpec_XCNPart3Impl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCNPart3;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, dossierId, mtCore,
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

	protected VRTechnicalSpec_XCNPart3 getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
			query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCNPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCNPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcn part3s where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcn part3s
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCNPart3.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XCNPart3.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XCNPart3ModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcn part3s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : list) {
					if ((convertAssembleId != vrTechnicalSpec_XCNPart3.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcn part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcn part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		List<VRTechnicalSpec_XCNPart3> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCNPart3> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcn part3s before and after the current vr technical spec_xcn part3 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcn part3
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3[] array = new VRTechnicalSpec_XCNPart3Impl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCNPart3;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, convertAssembleId,
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

	protected VRTechnicalSpec_XCNPart3 getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
			query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCNPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCNPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcn part3s where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xcn part3s
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
		"vrTechnicalSpec_XCNPart3.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCNPart3ModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcn part3s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByReferenceUid(
		String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByReferenceUid(
		String referenceUid, int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XCNPart3.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
				query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcn part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcn part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		List<VRTechnicalSpec_XCNPart3> list = findByReferenceUid(referenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCNPart3> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcn part3s before and after the current vr technical spec_xcn part3 in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcn part3
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3[] array = new VRTechnicalSpec_XCNPart3Impl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, referenceUid, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCNPart3;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_XCNPart3 getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
			query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCNPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCNPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcn part3s where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xcn part3s
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XCNPart3.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XCNPart3.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XCNPart3.referenceUid IS NULL OR vrTechnicalSpec_XCNPart3.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCNPart3ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcn part3s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : list) {
					if ((dossierId != vrTechnicalSpec_XCNPart3.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcn part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcn part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		List<VRTechnicalSpec_XCNPart3> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCNPart3> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcn part3s before and after the current vr technical spec_xcn part3 in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcn part3
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3[] array = new VRTechnicalSpec_XCNPart3Impl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCNPart3;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, dossierId, orderByComparator,
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

	protected VRTechnicalSpec_XCNPart3 getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
			query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCNPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCNPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcn part3s where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xcn part3s
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCNPart3.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCNPart3ModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCNPart3ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcn part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XCNPart3.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcn part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcn part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		List<VRTechnicalSpec_XCNPart3> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCNPart3 != null) {
			return vrTechnicalSpec_XCNPart3;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCNPart3Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcn part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcn part3, or <code>null</code> if a matching vr technical spec_xcn part3 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCNPart3> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcn part3s before and after the current vr technical spec_xcn part3 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcn part3
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3[] array = new VRTechnicalSpec_XCNPart3Impl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCNPart3;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCNPart3, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XCNPart3 getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
			query.append(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCNPart3);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCNPart3> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcn part3s where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xcn part3s
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE);

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
		"vrTechnicalSpec_XCNPart3.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XCNPart3PersistenceImpl() {
		setModelClass(VRTechnicalSpec_XCNPart3.class);
	}

	/**
	 * Caches the vr technical spec_xcn part3 in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCNPart3 the vr technical spec_xcn part3
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		entityCache.putResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			vrTechnicalSpec_XCNPart3.getPrimaryKey(), vrTechnicalSpec_XCNPart3);

		vrTechnicalSpec_XCNPart3.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xcn part3s in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCNPart3s the vr technical spec_xcn part3s
	 */
	@Override
	public void cacheResult(
		List<VRTechnicalSpec_XCNPart3> vrTechnicalSpec_XCNPart3s) {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : vrTechnicalSpec_XCNPart3s) {
			if (entityCache.getResult(
						VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCNPart3Impl.class,
						vrTechnicalSpec_XCNPart3.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XCNPart3);
			}
			else {
				vrTechnicalSpec_XCNPart3.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xcn part3s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XCNPart3Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xcn part3.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		entityCache.removeResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			vrTechnicalSpec_XCNPart3.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRTechnicalSpec_XCNPart3> vrTechnicalSpec_XCNPart3s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : vrTechnicalSpec_XCNPart3s) {
			entityCache.removeResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCNPart3Impl.class,
				vrTechnicalSpec_XCNPart3.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xcn part3 with the primary key. Does not add the vr technical spec_xcn part3 to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xcn part3
	 * @return the new vr technical spec_xcn part3
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 create(long id) {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = new VRTechnicalSpec_XCNPart3Impl();

		vrTechnicalSpec_XCNPart3.setNew(true);
		vrTechnicalSpec_XCNPart3.setPrimaryKey(id);

		return vrTechnicalSpec_XCNPart3;
	}

	/**
	 * Removes the vr technical spec_xcn part3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xcn part3
	 * @return the vr technical spec_xcn part3 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 remove(long id)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xcn part3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcn part3
	 * @return the vr technical spec_xcn part3 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = (VRTechnicalSpec_XCNPart3)session.get(VRTechnicalSpec_XCNPart3Impl.class,
					primaryKey);

			if (vrTechnicalSpec_XCNPart3 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XCNPart3Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XCNPart3);
		}
		catch (NoSuchVRTechnicalSpec_XCNPart3Exception nsee) {
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
	protected VRTechnicalSpec_XCNPart3 removeImpl(
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		vrTechnicalSpec_XCNPart3 = toUnwrappedModel(vrTechnicalSpec_XCNPart3);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XCNPart3)) {
				vrTechnicalSpec_XCNPart3 = (VRTechnicalSpec_XCNPart3)session.get(VRTechnicalSpec_XCNPart3Impl.class,
						vrTechnicalSpec_XCNPart3.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XCNPart3 != null) {
				session.delete(vrTechnicalSpec_XCNPart3);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XCNPart3 != null) {
			clearCache(vrTechnicalSpec_XCNPart3);
		}

		return vrTechnicalSpec_XCNPart3;
	}

	@Override
	public VRTechnicalSpec_XCNPart3 updateImpl(
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		vrTechnicalSpec_XCNPart3 = toUnwrappedModel(vrTechnicalSpec_XCNPart3);

		boolean isNew = vrTechnicalSpec_XCNPart3.isNew();

		VRTechnicalSpec_XCNPart3ModelImpl vrTechnicalSpec_XCNPart3ModelImpl = (VRTechnicalSpec_XCNPart3ModelImpl)vrTechnicalSpec_XCNPart3;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XCNPart3.isNew()) {
				session.save(vrTechnicalSpec_XCNPart3);

				vrTechnicalSpec_XCNPart3.setNew(false);
			}
			else {
				vrTechnicalSpec_XCNPart3 = (VRTechnicalSpec_XCNPart3)session.merge(vrTechnicalSpec_XCNPart3);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XCNPart3ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XCNPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getDossierNo(),
						vrTechnicalSpec_XCNPart3ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XCNPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XCNPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XCNPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getDossierId(),
						vrTechnicalSpec_XCNPart3ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCNPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XCNPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XCNPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCNPart3ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCNPart3ModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCNPart3Impl.class,
			vrTechnicalSpec_XCNPart3.getPrimaryKey(), vrTechnicalSpec_XCNPart3,
			false);

		vrTechnicalSpec_XCNPart3.resetOriginalValues();

		return vrTechnicalSpec_XCNPart3;
	}

	protected VRTechnicalSpec_XCNPart3 toUnwrappedModel(
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		if (vrTechnicalSpec_XCNPart3 instanceof VRTechnicalSpec_XCNPart3Impl) {
			return vrTechnicalSpec_XCNPart3;
		}

		VRTechnicalSpec_XCNPart3Impl vrTechnicalSpec_XCNPart3Impl = new VRTechnicalSpec_XCNPart3Impl();

		vrTechnicalSpec_XCNPart3Impl.setNew(vrTechnicalSpec_XCNPart3.isNew());
		vrTechnicalSpec_XCNPart3Impl.setPrimaryKey(vrTechnicalSpec_XCNPart3.getPrimaryKey());

		vrTechnicalSpec_XCNPart3Impl.setId(vrTechnicalSpec_XCNPart3.getId());
		vrTechnicalSpec_XCNPart3Impl.setMtCore(vrTechnicalSpec_XCNPart3.getMtCore());
		vrTechnicalSpec_XCNPart3Impl.setConvertAssembleId(vrTechnicalSpec_XCNPart3.getConvertAssembleId());
		vrTechnicalSpec_XCNPart3Impl.setDossierId(vrTechnicalSpec_XCNPart3.getDossierId());
		vrTechnicalSpec_XCNPart3Impl.setDossierNo(vrTechnicalSpec_XCNPart3.getDossierNo());
		vrTechnicalSpec_XCNPart3Impl.setReferenceUid(vrTechnicalSpec_XCNPart3.getReferenceUid());
		vrTechnicalSpec_XCNPart3Impl.setDossierIdCTN(vrTechnicalSpec_XCNPart3.getDossierIdCTN());
		vrTechnicalSpec_XCNPart3Impl.setDeliverableCode(vrTechnicalSpec_XCNPart3.getDeliverableCode());
		vrTechnicalSpec_XCNPart3Impl.setVehicleTypeCertificateId(vrTechnicalSpec_XCNPart3.getVehicleTypeCertificateId());
		vrTechnicalSpec_XCNPart3Impl.setXCN01336(vrTechnicalSpec_XCNPart3.getXCN01336());
		vrTechnicalSpec_XCNPart3Impl.setXCN01337(vrTechnicalSpec_XCNPart3.getXCN01337());
		vrTechnicalSpec_XCNPart3Impl.setXCN01338(vrTechnicalSpec_XCNPart3.getXCN01338());
		vrTechnicalSpec_XCNPart3Impl.setXCN01339(vrTechnicalSpec_XCNPart3.getXCN01339());
		vrTechnicalSpec_XCNPart3Impl.setXCN01340(vrTechnicalSpec_XCNPart3.getXCN01340());
		vrTechnicalSpec_XCNPart3Impl.setXCN01341(vrTechnicalSpec_XCNPart3.getXCN01341());
		vrTechnicalSpec_XCNPart3Impl.setXCN01342(vrTechnicalSpec_XCNPart3.getXCN01342());
		vrTechnicalSpec_XCNPart3Impl.setXCN01343(vrTechnicalSpec_XCNPart3.getXCN01343());
		vrTechnicalSpec_XCNPart3Impl.setXCN01344(vrTechnicalSpec_XCNPart3.getXCN01344());
		vrTechnicalSpec_XCNPart3Impl.setXCN01345(vrTechnicalSpec_XCNPart3.getXCN01345());
		vrTechnicalSpec_XCNPart3Impl.setXCN01346(vrTechnicalSpec_XCNPart3.getXCN01346());
		vrTechnicalSpec_XCNPart3Impl.setXCN01347(vrTechnicalSpec_XCNPart3.getXCN01347());
		vrTechnicalSpec_XCNPart3Impl.setXCN01348(vrTechnicalSpec_XCNPart3.getXCN01348());
		vrTechnicalSpec_XCNPart3Impl.setXCN01349(vrTechnicalSpec_XCNPart3.getXCN01349());
		vrTechnicalSpec_XCNPart3Impl.setXCN01350(vrTechnicalSpec_XCNPart3.getXCN01350());
		vrTechnicalSpec_XCNPart3Impl.setXCN01351(vrTechnicalSpec_XCNPart3.getXCN01351());
		vrTechnicalSpec_XCNPart3Impl.setXCN01352(vrTechnicalSpec_XCNPart3.getXCN01352());
		vrTechnicalSpec_XCNPart3Impl.setXCN01353(vrTechnicalSpec_XCNPart3.getXCN01353());
		vrTechnicalSpec_XCNPart3Impl.setXCN01354(vrTechnicalSpec_XCNPart3.getXCN01354());
		vrTechnicalSpec_XCNPart3Impl.setXCN01355(vrTechnicalSpec_XCNPart3.getXCN01355());
		vrTechnicalSpec_XCNPart3Impl.setXCN01356(vrTechnicalSpec_XCNPart3.getXCN01356());
		vrTechnicalSpec_XCNPart3Impl.setXCN01357(vrTechnicalSpec_XCNPart3.getXCN01357());
		vrTechnicalSpec_XCNPart3Impl.setXCN01358(vrTechnicalSpec_XCNPart3.getXCN01358());
		vrTechnicalSpec_XCNPart3Impl.setXCN01359(vrTechnicalSpec_XCNPart3.getXCN01359());
		vrTechnicalSpec_XCNPart3Impl.setXCN01360(vrTechnicalSpec_XCNPart3.getXCN01360());
		vrTechnicalSpec_XCNPart3Impl.setXCN01361(vrTechnicalSpec_XCNPart3.getXCN01361());
		vrTechnicalSpec_XCNPart3Impl.setXCN01362(vrTechnicalSpec_XCNPart3.getXCN01362());
		vrTechnicalSpec_XCNPart3Impl.setXCN01363(vrTechnicalSpec_XCNPart3.getXCN01363());
		vrTechnicalSpec_XCNPart3Impl.setXCN01364(vrTechnicalSpec_XCNPart3.getXCN01364());
		vrTechnicalSpec_XCNPart3Impl.setXCN01365(vrTechnicalSpec_XCNPart3.getXCN01365());
		vrTechnicalSpec_XCNPart3Impl.setXCN01366(vrTechnicalSpec_XCNPart3.getXCN01366());
		vrTechnicalSpec_XCNPart3Impl.setXCN01367(vrTechnicalSpec_XCNPart3.getXCN01367());
		vrTechnicalSpec_XCNPart3Impl.setXCN01368(vrTechnicalSpec_XCNPart3.getXCN01368());
		vrTechnicalSpec_XCNPart3Impl.setXCN01369(vrTechnicalSpec_XCNPart3.getXCN01369());
		vrTechnicalSpec_XCNPart3Impl.setXCN01370(vrTechnicalSpec_XCNPart3.getXCN01370());
		vrTechnicalSpec_XCNPart3Impl.setXCN01371(vrTechnicalSpec_XCNPart3.getXCN01371());
		vrTechnicalSpec_XCNPart3Impl.setXCN01372(vrTechnicalSpec_XCNPart3.getXCN01372());
		vrTechnicalSpec_XCNPart3Impl.setXCN01373(vrTechnicalSpec_XCNPart3.getXCN01373());
		vrTechnicalSpec_XCNPart3Impl.setXCN01374(vrTechnicalSpec_XCNPart3.getXCN01374());
		vrTechnicalSpec_XCNPart3Impl.setXCN01375(vrTechnicalSpec_XCNPart3.getXCN01375());
		vrTechnicalSpec_XCNPart3Impl.setXCN01376(vrTechnicalSpec_XCNPart3.getXCN01376());
		vrTechnicalSpec_XCNPart3Impl.setXCN01377(vrTechnicalSpec_XCNPart3.getXCN01377());
		vrTechnicalSpec_XCNPart3Impl.setXCN01378(vrTechnicalSpec_XCNPart3.getXCN01378());
		vrTechnicalSpec_XCNPart3Impl.setXCN01379(vrTechnicalSpec_XCNPart3.getXCN01379());
		vrTechnicalSpec_XCNPart3Impl.setXCN01380(vrTechnicalSpec_XCNPart3.getXCN01380());
		vrTechnicalSpec_XCNPart3Impl.setXCN01381(vrTechnicalSpec_XCNPart3.getXCN01381());
		vrTechnicalSpec_XCNPart3Impl.setXCN01382(vrTechnicalSpec_XCNPart3.getXCN01382());
		vrTechnicalSpec_XCNPart3Impl.setXCN01383(vrTechnicalSpec_XCNPart3.getXCN01383());
		vrTechnicalSpec_XCNPart3Impl.setXCN01384(vrTechnicalSpec_XCNPart3.getXCN01384());
		vrTechnicalSpec_XCNPart3Impl.setXCN01385(vrTechnicalSpec_XCNPart3.getXCN01385());
		vrTechnicalSpec_XCNPart3Impl.setXCN01386(vrTechnicalSpec_XCNPart3.getXCN01386());
		vrTechnicalSpec_XCNPart3Impl.setXCN01387(vrTechnicalSpec_XCNPart3.getXCN01387());
		vrTechnicalSpec_XCNPart3Impl.setXCN01388(vrTechnicalSpec_XCNPart3.getXCN01388());
		vrTechnicalSpec_XCNPart3Impl.setXCN01389(vrTechnicalSpec_XCNPart3.getXCN01389());
		vrTechnicalSpec_XCNPart3Impl.setXCN01390(vrTechnicalSpec_XCNPart3.getXCN01390());
		vrTechnicalSpec_XCNPart3Impl.setXCN01391(vrTechnicalSpec_XCNPart3.getXCN01391());
		vrTechnicalSpec_XCNPart3Impl.setXCN01392(vrTechnicalSpec_XCNPart3.getXCN01392());
		vrTechnicalSpec_XCNPart3Impl.setXCN01393(vrTechnicalSpec_XCNPart3.getXCN01393());
		vrTechnicalSpec_XCNPart3Impl.setXCN01394(vrTechnicalSpec_XCNPart3.getXCN01394());
		vrTechnicalSpec_XCNPart3Impl.setXCN01395(vrTechnicalSpec_XCNPart3.getXCN01395());
		vrTechnicalSpec_XCNPart3Impl.setXCN01396(vrTechnicalSpec_XCNPart3.getXCN01396());
		vrTechnicalSpec_XCNPart3Impl.setXCN01397(vrTechnicalSpec_XCNPart3.getXCN01397());
		vrTechnicalSpec_XCNPart3Impl.setXCN01398(vrTechnicalSpec_XCNPart3.getXCN01398());
		vrTechnicalSpec_XCNPart3Impl.setXCN01399(vrTechnicalSpec_XCNPart3.getXCN01399());
		vrTechnicalSpec_XCNPart3Impl.setXCN01400(vrTechnicalSpec_XCNPart3.getXCN01400());
		vrTechnicalSpec_XCNPart3Impl.setXCN01401(vrTechnicalSpec_XCNPart3.getXCN01401());
		vrTechnicalSpec_XCNPart3Impl.setXCN01402(vrTechnicalSpec_XCNPart3.getXCN01402());
		vrTechnicalSpec_XCNPart3Impl.setXCN01403(vrTechnicalSpec_XCNPart3.getXCN01403());
		vrTechnicalSpec_XCNPart3Impl.setXCN01404(vrTechnicalSpec_XCNPart3.getXCN01404());
		vrTechnicalSpec_XCNPart3Impl.setXCN01405(vrTechnicalSpec_XCNPart3.getXCN01405());
		vrTechnicalSpec_XCNPart3Impl.setXCN01406(vrTechnicalSpec_XCNPart3.getXCN01406());
		vrTechnicalSpec_XCNPart3Impl.setXCN01407(vrTechnicalSpec_XCNPart3.getXCN01407());
		vrTechnicalSpec_XCNPart3Impl.setXCN01408(vrTechnicalSpec_XCNPart3.getXCN01408());
		vrTechnicalSpec_XCNPart3Impl.setXCN01409(vrTechnicalSpec_XCNPart3.getXCN01409());
		vrTechnicalSpec_XCNPart3Impl.setXCN01410(vrTechnicalSpec_XCNPart3.getXCN01410());
		vrTechnicalSpec_XCNPart3Impl.setXCN01411(vrTechnicalSpec_XCNPart3.getXCN01411());
		vrTechnicalSpec_XCNPart3Impl.setXCN01412(vrTechnicalSpec_XCNPart3.getXCN01412());
		vrTechnicalSpec_XCNPart3Impl.setXCN01413(vrTechnicalSpec_XCNPart3.getXCN01413());
		vrTechnicalSpec_XCNPart3Impl.setXCN01414(vrTechnicalSpec_XCNPart3.getXCN01414());
		vrTechnicalSpec_XCNPart3Impl.setXCN01415(vrTechnicalSpec_XCNPart3.getXCN01415());
		vrTechnicalSpec_XCNPart3Impl.setXCN01416(vrTechnicalSpec_XCNPart3.getXCN01416());
		vrTechnicalSpec_XCNPart3Impl.setXCN01417(vrTechnicalSpec_XCNPart3.getXCN01417());
		vrTechnicalSpec_XCNPart3Impl.setXCN01418(vrTechnicalSpec_XCNPart3.getXCN01418());
		vrTechnicalSpec_XCNPart3Impl.setXCN01419(vrTechnicalSpec_XCNPart3.getXCN01419());
		vrTechnicalSpec_XCNPart3Impl.setXCN01420(vrTechnicalSpec_XCNPart3.getXCN01420());
		vrTechnicalSpec_XCNPart3Impl.setXCN01421(vrTechnicalSpec_XCNPart3.getXCN01421());
		vrTechnicalSpec_XCNPart3Impl.setXCN01422(vrTechnicalSpec_XCNPart3.getXCN01422());
		vrTechnicalSpec_XCNPart3Impl.setXCN01423(vrTechnicalSpec_XCNPart3.getXCN01423());
		vrTechnicalSpec_XCNPart3Impl.setXCN01424(vrTechnicalSpec_XCNPart3.getXCN01424());
		vrTechnicalSpec_XCNPart3Impl.setXCN01425(vrTechnicalSpec_XCNPart3.getXCN01425());
		vrTechnicalSpec_XCNPart3Impl.setXCN01426(vrTechnicalSpec_XCNPart3.getXCN01426());
		vrTechnicalSpec_XCNPart3Impl.setXCN01427(vrTechnicalSpec_XCNPart3.getXCN01427());
		vrTechnicalSpec_XCNPart3Impl.setXCN01428(vrTechnicalSpec_XCNPart3.getXCN01428());
		vrTechnicalSpec_XCNPart3Impl.setXCN01429(vrTechnicalSpec_XCNPart3.getXCN01429());
		vrTechnicalSpec_XCNPart3Impl.setXCN01430(vrTechnicalSpec_XCNPart3.getXCN01430());
		vrTechnicalSpec_XCNPart3Impl.setXCN01431(vrTechnicalSpec_XCNPart3.getXCN01431());
		vrTechnicalSpec_XCNPart3Impl.setXCN01432(vrTechnicalSpec_XCNPart3.getXCN01432());
		vrTechnicalSpec_XCNPart3Impl.setXCN01433(vrTechnicalSpec_XCNPart3.getXCN01433());
		vrTechnicalSpec_XCNPart3Impl.setXCN01434(vrTechnicalSpec_XCNPart3.getXCN01434());
		vrTechnicalSpec_XCNPart3Impl.setXCN01435(vrTechnicalSpec_XCNPart3.getXCN01435());
		vrTechnicalSpec_XCNPart3Impl.setXCN01436(vrTechnicalSpec_XCNPart3.getXCN01436());
		vrTechnicalSpec_XCNPart3Impl.setXCN01437(vrTechnicalSpec_XCNPart3.getXCN01437());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN001(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN001());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN002(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN002());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN003(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN003());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN004(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN004());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN005(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN005());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN006(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN006());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN012(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN012());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN013(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN013());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN014(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN014());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN015(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN015());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN016(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN016());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN017(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN017());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN018(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN018());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN019(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN019());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN020(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN020());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN021(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN021());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN022(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN022());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN026(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN026());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN027(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN027());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN028(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN028());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN033(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN033());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN034(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN034());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN037(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN037());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN038(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN038());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN039(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN039());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN040(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN040());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN041(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN041());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN042(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN042());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN043(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN043());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN044(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN044());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN045(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN045());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN046(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN046());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN047(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN047());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN053(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN053());
		vrTechnicalSpec_XCNPart3Impl.setBBCNCLKLXCN054(vrTechnicalSpec_XCNPart3.getBBCNCLKLXCN054());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN001(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN001());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN002(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN002());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN003(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN003());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN004(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN004());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN005(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN005());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN006(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN006());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN007(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN007());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN008(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN008());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN009(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN009());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN012(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN012());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN013(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN013());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN014(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN014());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN015(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN015());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN016(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN016());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN017(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN017());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN018(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN018());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN019(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN019());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN020(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN020());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN021(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN021());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN022(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN022());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN023(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN023());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN024(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN024());
		vrTechnicalSpec_XCNPart3Impl.setBBKTSPMXCN025(vrTechnicalSpec_XCNPart3.getBBKTSPMXCN025());
		vrTechnicalSpec_XCNPart3Impl.setModifyDate(vrTechnicalSpec_XCNPart3.getModifyDate());
		vrTechnicalSpec_XCNPart3Impl.setSyncDate(vrTechnicalSpec_XCNPart3.getSyncDate());

		return vrTechnicalSpec_XCNPart3Impl;
	}

	/**
	 * Returns the vr technical spec_xcn part3 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcn part3
	 * @return the vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XCNPart3 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XCNPart3Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XCNPart3;
	}

	/**
	 * Returns the vr technical spec_xcn part3 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCNPart3Exception} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcn part3
	 * @return the vr technical spec_xcn part3
	 * @throws NoSuchVRTechnicalSpec_XCNPart3Exception if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCNPart3Exception {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xcn part3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcn part3
	 * @return the vr technical spec_xcn part3, or <code>null</code> if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCNPart3Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = (VRTechnicalSpec_XCNPart3)serializable;

		if (vrTechnicalSpec_XCNPart3 == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XCNPart3 = (VRTechnicalSpec_XCNPart3)session.get(VRTechnicalSpec_XCNPart3Impl.class,
						primaryKey);

				if (vrTechnicalSpec_XCNPart3 != null) {
					cacheResult(vrTechnicalSpec_XCNPart3);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCNPart3Impl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCNPart3Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XCNPart3;
	}

	/**
	 * Returns the vr technical spec_xcn part3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcn part3
	 * @return the vr technical spec_xcn part3, or <code>null</code> if a vr technical spec_xcn part3 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCNPart3 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XCNPart3> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XCNPart3> map = new HashMap<Serializable, VRTechnicalSpec_XCNPart3>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XCNPart3 != null) {
				map.put(primaryKey, vrTechnicalSpec_XCNPart3);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCNPart3Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XCNPart3)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : (List<VRTechnicalSpec_XCNPart3>)q.list()) {
				map.put(vrTechnicalSpec_XCNPart3.getPrimaryKeyObj(),
					vrTechnicalSpec_XCNPart3);

				cacheResult(vrTechnicalSpec_XCNPart3);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XCNPart3.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XCNPart3ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCNPart3Impl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xcn part3s.
	 *
	 * @return the vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcn part3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @return the range of vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcn part3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcn part3s
	 * @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xcn part3s
	 */
	@Override
	public List<VRTechnicalSpec_XCNPart3> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCNPart3> orderByComparator,
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

		List<VRTechnicalSpec_XCNPart3> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCNPart3>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XCNPART3);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XCNPART3;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XCNPart3ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCNPart3>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xcn part3s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 : findAll()) {
			remove(vrTechnicalSpec_XCNPart3);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcn part3s.
	 *
	 * @return the number of vr technical spec_xcn part3s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XCNPART3);

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
		return VRTechnicalSpec_XCNPart3ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xcn part3 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XCNPart3Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCNPART3 = "SELECT vrTechnicalSpec_XCNPart3 FROM VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE_PKS_IN =
		"SELECT vrTechnicalSpec_XCNPart3 FROM VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCNPART3_WHERE = "SELECT vrTechnicalSpec_XCNPart3 FROM VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCNPART3 = "SELECT COUNT(vrTechnicalSpec_XCNPart3) FROM VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCNPART3_WHERE = "SELECT COUNT(vrTechnicalSpec_XCNPart3) FROM VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XCNPart3.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XCNPart3 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XCNPart3 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCNPart3PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}