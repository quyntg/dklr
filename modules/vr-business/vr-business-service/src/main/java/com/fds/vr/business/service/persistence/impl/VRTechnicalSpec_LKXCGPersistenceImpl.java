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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException;
import com.fds.vr.business.model.VRTechnicalSpec_LKXCG;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXCGImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXCGModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_LKXCGPersistence;

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
 * The persistence implementation for the vr technical spec_lkxcg service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXCGPersistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_LKXCGUtil
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXCGPersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_LKXCG>
	implements VRTechnicalSpec_LKXCGPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_LKXCGUtil} to access the vr technical spec_lkxcg persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_LKXCGImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_LKXCGModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_LKXCG.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_LKXCG.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
				query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		List<VRTechnicalSpec_LKXCG> list = findByDossierNo(dossierNo, mtCore,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXCG> list = findByDossierNo(dossierNo, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxcg
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG[] array = new VRTechnicalSpec_LKXCGImpl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXCG;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, dossierNo, mtCore,
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

	protected VRTechnicalSpec_LKXCG getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
			query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_lkxcgs
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_LKXCG.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_LKXCG.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_LKXCG.dossierNo IS NULL OR vrTechnicalSpec_LKXCG.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_LKXCG.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_LKXCGModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(String dossierIdCTN,
		int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_LKXCG.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
				query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByDossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		List<VRTechnicalSpec_LKXCG> list = findByDossierIdCTN(dossierIdCTN, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXCG> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxcg
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG[] array = new VRTechnicalSpec_LKXCGImpl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, dossierIdCTN, orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXCG;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_LKXCG getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
			query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxcgs where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_lkxcgs
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_LKXCG.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_LKXCG.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_LKXCG.dossierIdCTN IS NULL OR vrTechnicalSpec_LKXCG.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_LKXCGModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_LKXCG.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
				query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		List<VRTechnicalSpec_LKXCG> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXCG> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxcg
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG[] findByDeliverableCode_PrevAndNext(long id,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG[] array = new VRTechnicalSpec_LKXCGImpl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, deliverableCode, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_LKXCG;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, deliverableCode, orderByComparator,
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

	protected VRTechnicalSpec_LKXCG getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
			query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxcgs where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_lkxcgs
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE);

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
		"vrTechnicalSpec_LKXCG.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_LKXCG.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_LKXCG.deliverableCode IS NULL OR vrTechnicalSpec_LKXCG.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_LKXCGModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : list) {
					if ((dossierId != vrTechnicalSpec_LKXCG.getDossierId()) ||
							(mtCore != vrTechnicalSpec_LKXCG.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		List<VRTechnicalSpec_LKXCG> list = findByDossierId(dossierId, mtCore,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXCG> list = findByDossierId(dossierId, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxcg
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG[] array = new VRTechnicalSpec_LKXCGImpl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXCG;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, dossierId, mtCore,
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

	protected VRTechnicalSpec_LKXCG getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
			query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_lkxcgs
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_LKXCG.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_LKXCG.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_LKXCGModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxcgs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : list) {
					if ((dossierId != vrTechnicalSpec_LKXCG.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		List<VRTechnicalSpec_LKXCG> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXCG> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxcg
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG[] array = new VRTechnicalSpec_LKXCGImpl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXCG;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_LKXCG getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
			query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxcgs where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_lkxcgs
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_LKXCG.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_LKXCGModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : list) {
					if ((convertAssembleId != vrTechnicalSpec_LKXCG.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		List<VRTechnicalSpec_LKXCG> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXCG> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxcg
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG[] array = new VRTechnicalSpec_LKXCGImpl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXCG;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, convertAssembleId,
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

	protected VRTechnicalSpec_LKXCG getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
			query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxcgs where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_lkxcgs
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE);

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
		"vrTechnicalSpec_LKXCG.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_LKXCGModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxcgs where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByReferenceUid(String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByReferenceUid(String referenceUid,
		int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_LKXCG.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
				query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByReferenceUid_First(String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		List<VRTechnicalSpec_LKXCG> list = findByReferenceUid(referenceUid, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXCG> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxcg
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG[] array = new VRTechnicalSpec_LKXCGImpl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, referenceUid, orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXCG;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_LKXCG getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
			query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxcgs where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_lkxcgs
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_LKXCG.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_LKXCG.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_LKXCG.referenceUid IS NULL OR vrTechnicalSpec_LKXCG.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_LKXCGModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_LKXCG.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		List<VRTechnicalSpec_LKXCG> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_LKXCG != null) {
			return vrTechnicalSpec_LKXCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXCG> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxcg
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG[] array = new VRTechnicalSpec_LKXCGImpl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXCG;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_LKXCG, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_LKXCG getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE);

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
			query.append(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_lkxcgs
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE);

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
		"vrTechnicalSpec_LKXCG.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_LKXCGPersistenceImpl() {
		setModelClass(VRTechnicalSpec_LKXCG.class);
	}

	/**
	 * Caches the vr technical spec_lkxcg in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_LKXCG the vr technical spec_lkxcg
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		entityCache.putResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			vrTechnicalSpec_LKXCG.getPrimaryKey(), vrTechnicalSpec_LKXCG);

		vrTechnicalSpec_LKXCG.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_lkxcgs in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_LKXCGs the vr technical spec_lkxcgs
	 */
	@Override
	public void cacheResult(List<VRTechnicalSpec_LKXCG> vrTechnicalSpec_LKXCGs) {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : vrTechnicalSpec_LKXCGs) {
			if (entityCache.getResult(
						VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_LKXCGImpl.class,
						vrTechnicalSpec_LKXCG.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_LKXCG);
			}
			else {
				vrTechnicalSpec_LKXCG.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_lkxcgs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_LKXCGImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_lkxcg.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		entityCache.removeResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			vrTechnicalSpec_LKXCG.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRTechnicalSpec_LKXCG> vrTechnicalSpec_LKXCGs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : vrTechnicalSpec_LKXCGs) {
			entityCache.removeResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_LKXCGImpl.class,
				vrTechnicalSpec_LKXCG.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_lkxcg with the primary key. Does not add the vr technical spec_lkxcg to the database.
	 *
	 * @param id the primary key for the new vr technical spec_lkxcg
	 * @return the new vr technical spec_lkxcg
	 */
	@Override
	public VRTechnicalSpec_LKXCG create(long id) {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = new VRTechnicalSpec_LKXCGImpl();

		vrTechnicalSpec_LKXCG.setNew(true);
		vrTechnicalSpec_LKXCG.setPrimaryKey(id);

		return vrTechnicalSpec_LKXCG;
	}

	/**
	 * Removes the vr technical spec_lkxcg with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_lkxcg
	 * @return the vr technical spec_lkxcg that was removed
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG remove(long id)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_lkxcg with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_lkxcg
	 * @return the vr technical spec_lkxcg that was removed
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = (VRTechnicalSpec_LKXCG)session.get(VRTechnicalSpec_LKXCGImpl.class,
					primaryKey);

			if (vrTechnicalSpec_LKXCG == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_LKXCGException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_LKXCG);
		}
		catch (NoSuchVRTechnicalSpec_LKXCGException nsee) {
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
	protected VRTechnicalSpec_LKXCG removeImpl(
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		vrTechnicalSpec_LKXCG = toUnwrappedModel(vrTechnicalSpec_LKXCG);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_LKXCG)) {
				vrTechnicalSpec_LKXCG = (VRTechnicalSpec_LKXCG)session.get(VRTechnicalSpec_LKXCGImpl.class,
						vrTechnicalSpec_LKXCG.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_LKXCG != null) {
				session.delete(vrTechnicalSpec_LKXCG);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_LKXCG != null) {
			clearCache(vrTechnicalSpec_LKXCG);
		}

		return vrTechnicalSpec_LKXCG;
	}

	@Override
	public VRTechnicalSpec_LKXCG updateImpl(
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		vrTechnicalSpec_LKXCG = toUnwrappedModel(vrTechnicalSpec_LKXCG);

		boolean isNew = vrTechnicalSpec_LKXCG.isNew();

		VRTechnicalSpec_LKXCGModelImpl vrTechnicalSpec_LKXCGModelImpl = (VRTechnicalSpec_LKXCGModelImpl)vrTechnicalSpec_LKXCG;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_LKXCG.isNew()) {
				session.save(vrTechnicalSpec_LKXCG);

				vrTechnicalSpec_LKXCG.setNew(false);
			}
			else {
				vrTechnicalSpec_LKXCG = (VRTechnicalSpec_LKXCG)session.merge(vrTechnicalSpec_LKXCG);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_LKXCGModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_LKXCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_LKXCGModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getDossierNo(),
						vrTechnicalSpec_LKXCGModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_LKXCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_LKXCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_LKXCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_LKXCGModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getDossierId(),
						vrTechnicalSpec_LKXCGModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_LKXCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_LKXCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_LKXCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_LKXCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXCGModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXCGImpl.class,
			vrTechnicalSpec_LKXCG.getPrimaryKey(), vrTechnicalSpec_LKXCG, false);

		vrTechnicalSpec_LKXCG.resetOriginalValues();

		return vrTechnicalSpec_LKXCG;
	}

	protected VRTechnicalSpec_LKXCG toUnwrappedModel(
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		if (vrTechnicalSpec_LKXCG instanceof VRTechnicalSpec_LKXCGImpl) {
			return vrTechnicalSpec_LKXCG;
		}

		VRTechnicalSpec_LKXCGImpl vrTechnicalSpec_LKXCGImpl = new VRTechnicalSpec_LKXCGImpl();

		vrTechnicalSpec_LKXCGImpl.setNew(vrTechnicalSpec_LKXCG.isNew());
		vrTechnicalSpec_LKXCGImpl.setPrimaryKey(vrTechnicalSpec_LKXCG.getPrimaryKey());

		vrTechnicalSpec_LKXCGImpl.setId(vrTechnicalSpec_LKXCG.getId());
		vrTechnicalSpec_LKXCGImpl.setMtCore(vrTechnicalSpec_LKXCG.getMtCore());
		vrTechnicalSpec_LKXCGImpl.setConvertAssembleId(vrTechnicalSpec_LKXCG.getConvertAssembleId());
		vrTechnicalSpec_LKXCGImpl.setDossierId(vrTechnicalSpec_LKXCG.getDossierId());
		vrTechnicalSpec_LKXCGImpl.setDossierNo(vrTechnicalSpec_LKXCG.getDossierNo());
		vrTechnicalSpec_LKXCGImpl.setReferenceUid(vrTechnicalSpec_LKXCG.getReferenceUid());
		vrTechnicalSpec_LKXCGImpl.setDossierIdCTN(vrTechnicalSpec_LKXCG.getDossierIdCTN());
		vrTechnicalSpec_LKXCGImpl.setDeliverableCode(vrTechnicalSpec_LKXCG.getDeliverableCode());
		vrTechnicalSpec_LKXCGImpl.setVehicleTypeCertificateId(vrTechnicalSpec_LKXCG.getVehicleTypeCertificateId());
		vrTechnicalSpec_LKXCGImpl.setXCG01001(vrTechnicalSpec_LKXCG.getXCG01001());
		vrTechnicalSpec_LKXCGImpl.setXCG01002(vrTechnicalSpec_LKXCG.getXCG01002());
		vrTechnicalSpec_LKXCGImpl.setXCG01003(vrTechnicalSpec_LKXCG.getXCG01003());
		vrTechnicalSpec_LKXCGImpl.setXCG01004(vrTechnicalSpec_LKXCG.getXCG01004());
		vrTechnicalSpec_LKXCGImpl.setXCG01005(vrTechnicalSpec_LKXCG.getXCG01005());
		vrTechnicalSpec_LKXCGImpl.setXCG01006(vrTechnicalSpec_LKXCG.getXCG01006());
		vrTechnicalSpec_LKXCGImpl.setXCG01007(vrTechnicalSpec_LKXCG.getXCG01007());
		vrTechnicalSpec_LKXCGImpl.setXCG01008(vrTechnicalSpec_LKXCG.getXCG01008());
		vrTechnicalSpec_LKXCGImpl.setXCG01009(vrTechnicalSpec_LKXCG.getXCG01009());
		vrTechnicalSpec_LKXCGImpl.setXCG01010(vrTechnicalSpec_LKXCG.getXCG01010());
		vrTechnicalSpec_LKXCGImpl.setXCG01011(vrTechnicalSpec_LKXCG.getXCG01011());
		vrTechnicalSpec_LKXCGImpl.setXCG01012(vrTechnicalSpec_LKXCG.getXCG01012());
		vrTechnicalSpec_LKXCGImpl.setXCG01013(vrTechnicalSpec_LKXCG.getXCG01013());
		vrTechnicalSpec_LKXCGImpl.setXCG01014(vrTechnicalSpec_LKXCG.getXCG01014());
		vrTechnicalSpec_LKXCGImpl.setXCG01016(vrTechnicalSpec_LKXCG.getXCG01016());
		vrTechnicalSpec_LKXCGImpl.setXCG01017(vrTechnicalSpec_LKXCG.getXCG01017());
		vrTechnicalSpec_LKXCGImpl.setXCG01019(vrTechnicalSpec_LKXCG.getXCG01019());
		vrTechnicalSpec_LKXCGImpl.setXCG01020(vrTechnicalSpec_LKXCG.getXCG01020());
		vrTechnicalSpec_LKXCGImpl.setXCG01021(vrTechnicalSpec_LKXCG.getXCG01021());
		vrTechnicalSpec_LKXCGImpl.setXCG01022(vrTechnicalSpec_LKXCG.getXCG01022());
		vrTechnicalSpec_LKXCGImpl.setXCG01024(vrTechnicalSpec_LKXCG.getXCG01024());
		vrTechnicalSpec_LKXCGImpl.setXCG01025(vrTechnicalSpec_LKXCG.getXCG01025());
		vrTechnicalSpec_LKXCGImpl.setXCG01026(vrTechnicalSpec_LKXCG.getXCG01026());
		vrTechnicalSpec_LKXCGImpl.setXCG01027(vrTechnicalSpec_LKXCG.getXCG01027());
		vrTechnicalSpec_LKXCGImpl.setXCG01028(vrTechnicalSpec_LKXCG.getXCG01028());
		vrTechnicalSpec_LKXCGImpl.setXCG01030(vrTechnicalSpec_LKXCG.getXCG01030());
		vrTechnicalSpec_LKXCGImpl.setXCG01031(vrTechnicalSpec_LKXCG.getXCG01031());
		vrTechnicalSpec_LKXCGImpl.setXCG01032(vrTechnicalSpec_LKXCG.getXCG01032());
		vrTechnicalSpec_LKXCGImpl.setXCG01033(vrTechnicalSpec_LKXCG.getXCG01033());
		vrTechnicalSpec_LKXCGImpl.setXCG01034(vrTechnicalSpec_LKXCG.getXCG01034());
		vrTechnicalSpec_LKXCGImpl.setXCG01035(vrTechnicalSpec_LKXCG.getXCG01035());
		vrTechnicalSpec_LKXCGImpl.setXCG01036(vrTechnicalSpec_LKXCG.getXCG01036());
		vrTechnicalSpec_LKXCGImpl.setXCG01037(vrTechnicalSpec_LKXCG.getXCG01037());
		vrTechnicalSpec_LKXCGImpl.setXCG01038(vrTechnicalSpec_LKXCG.getXCG01038());
		vrTechnicalSpec_LKXCGImpl.setXCG01039(vrTechnicalSpec_LKXCG.getXCG01039());
		vrTechnicalSpec_LKXCGImpl.setXCG01040(vrTechnicalSpec_LKXCG.getXCG01040());
		vrTechnicalSpec_LKXCGImpl.setXCG01041(vrTechnicalSpec_LKXCG.getXCG01041());
		vrTechnicalSpec_LKXCGImpl.setXCG01042(vrTechnicalSpec_LKXCG.getXCG01042());
		vrTechnicalSpec_LKXCGImpl.setXCG01043(vrTechnicalSpec_LKXCG.getXCG01043());
		vrTechnicalSpec_LKXCGImpl.setXCG01044(vrTechnicalSpec_LKXCG.getXCG01044());
		vrTechnicalSpec_LKXCGImpl.setXCG01045(vrTechnicalSpec_LKXCG.getXCG01045());
		vrTechnicalSpec_LKXCGImpl.setXCG01046(vrTechnicalSpec_LKXCG.getXCG01046());
		vrTechnicalSpec_LKXCGImpl.setXCG01047(vrTechnicalSpec_LKXCG.getXCG01047());
		vrTechnicalSpec_LKXCGImpl.setXCG01049(vrTechnicalSpec_LKXCG.getXCG01049());
		vrTechnicalSpec_LKXCGImpl.setXCG01050(vrTechnicalSpec_LKXCG.getXCG01050());
		vrTechnicalSpec_LKXCGImpl.setXCG01051(vrTechnicalSpec_LKXCG.getXCG01051());
		vrTechnicalSpec_LKXCGImpl.setXCG01052(vrTechnicalSpec_LKXCG.getXCG01052());
		vrTechnicalSpec_LKXCGImpl.setXCG01053(vrTechnicalSpec_LKXCG.getXCG01053());
		vrTechnicalSpec_LKXCGImpl.setXCG01054(vrTechnicalSpec_LKXCG.getXCG01054());
		vrTechnicalSpec_LKXCGImpl.setXCG01055(vrTechnicalSpec_LKXCG.getXCG01055());
		vrTechnicalSpec_LKXCGImpl.setXCG01056(vrTechnicalSpec_LKXCG.getXCG01056());
		vrTechnicalSpec_LKXCGImpl.setXCG01057(vrTechnicalSpec_LKXCG.getXCG01057());
		vrTechnicalSpec_LKXCGImpl.setXCG01058(vrTechnicalSpec_LKXCG.getXCG01058());
		vrTechnicalSpec_LKXCGImpl.setXCG01059(vrTechnicalSpec_LKXCG.getXCG01059());
		vrTechnicalSpec_LKXCGImpl.setXCG01060(vrTechnicalSpec_LKXCG.getXCG01060());
		vrTechnicalSpec_LKXCGImpl.setXCG01062(vrTechnicalSpec_LKXCG.getXCG01062());
		vrTechnicalSpec_LKXCGImpl.setXCG01063(vrTechnicalSpec_LKXCG.getXCG01063());
		vrTechnicalSpec_LKXCGImpl.setXCG01064(vrTechnicalSpec_LKXCG.getXCG01064());
		vrTechnicalSpec_LKXCGImpl.setXCG01065(vrTechnicalSpec_LKXCG.getXCG01065());
		vrTechnicalSpec_LKXCGImpl.setXCG01066(vrTechnicalSpec_LKXCG.getXCG01066());
		vrTechnicalSpec_LKXCGImpl.setXCG01067(vrTechnicalSpec_LKXCG.getXCG01067());
		vrTechnicalSpec_LKXCGImpl.setXCG01068(vrTechnicalSpec_LKXCG.getXCG01068());
		vrTechnicalSpec_LKXCGImpl.setXCG01069(vrTechnicalSpec_LKXCG.getXCG01069());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0407(vrTechnicalSpec_LKXCG.getLKXCG0407());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0408(vrTechnicalSpec_LKXCG.getLKXCG0408());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0409(vrTechnicalSpec_LKXCG.getLKXCG0409());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0410(vrTechnicalSpec_LKXCG.getLKXCG0410());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0411(vrTechnicalSpec_LKXCG.getLKXCG0411());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0412(vrTechnicalSpec_LKXCG.getLKXCG0412());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0413(vrTechnicalSpec_LKXCG.getLKXCG0413());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0414(vrTechnicalSpec_LKXCG.getLKXCG0414());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0415(vrTechnicalSpec_LKXCG.getLKXCG0415());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0416(vrTechnicalSpec_LKXCG.getLKXCG0416());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0507(vrTechnicalSpec_LKXCG.getLKXCG0507());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0508(vrTechnicalSpec_LKXCG.getLKXCG0508());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0509(vrTechnicalSpec_LKXCG.getLKXCG0509());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0510(vrTechnicalSpec_LKXCG.getLKXCG0510());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0511(vrTechnicalSpec_LKXCG.getLKXCG0511());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0512(vrTechnicalSpec_LKXCG.getLKXCG0512());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0708(vrTechnicalSpec_LKXCG.getLKXCG0708());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0709(vrTechnicalSpec_LKXCG.getLKXCG0709());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0710(vrTechnicalSpec_LKXCG.getLKXCG0710());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0711(vrTechnicalSpec_LKXCG.getLKXCG0711());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0713(vrTechnicalSpec_LKXCG.getLKXCG0713());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0714(vrTechnicalSpec_LKXCG.getLKXCG0714());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0715(vrTechnicalSpec_LKXCG.getLKXCG0715());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0716(vrTechnicalSpec_LKXCG.getLKXCG0716());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0717(vrTechnicalSpec_LKXCG.getLKXCG0717());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0718(vrTechnicalSpec_LKXCG.getLKXCG0718());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0719(vrTechnicalSpec_LKXCG.getLKXCG0719());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0720(vrTechnicalSpec_LKXCG.getLKXCG0720());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0721(vrTechnicalSpec_LKXCG.getLKXCG0721());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0722(vrTechnicalSpec_LKXCG.getLKXCG0722());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0723(vrTechnicalSpec_LKXCG.getLKXCG0723());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0724(vrTechnicalSpec_LKXCG.getLKXCG0724());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0725(vrTechnicalSpec_LKXCG.getLKXCG0725());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0726(vrTechnicalSpec_LKXCG.getLKXCG0726());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0727(vrTechnicalSpec_LKXCG.getLKXCG0727());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0728(vrTechnicalSpec_LKXCG.getLKXCG0728());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0606(vrTechnicalSpec_LKXCG.getLKXCG0606());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0607(vrTechnicalSpec_LKXCG.getLKXCG0607());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0608(vrTechnicalSpec_LKXCG.getLKXCG0608());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0609(vrTechnicalSpec_LKXCG.getLKXCG0609());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0610(vrTechnicalSpec_LKXCG.getLKXCG0610());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0611(vrTechnicalSpec_LKXCG.getLKXCG0611());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0612(vrTechnicalSpec_LKXCG.getLKXCG0612());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0613(vrTechnicalSpec_LKXCG.getLKXCG0613());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0614(vrTechnicalSpec_LKXCG.getLKXCG0614());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0615(vrTechnicalSpec_LKXCG.getLKXCG0615());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0616(vrTechnicalSpec_LKXCG.getLKXCG0616());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0620(vrTechnicalSpec_LKXCG.getLKXCG0620());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0807(vrTechnicalSpec_LKXCG.getLKXCG0807());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0808(vrTechnicalSpec_LKXCG.getLKXCG0808());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0809(vrTechnicalSpec_LKXCG.getLKXCG0809());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0810(vrTechnicalSpec_LKXCG.getLKXCG0810());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0812(vrTechnicalSpec_LKXCG.getLKXCG0812());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0813(vrTechnicalSpec_LKXCG.getLKXCG0813());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0814(vrTechnicalSpec_LKXCG.getLKXCG0814());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0815(vrTechnicalSpec_LKXCG.getLKXCG0815());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0816(vrTechnicalSpec_LKXCG.getLKXCG0816());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0817(vrTechnicalSpec_LKXCG.getLKXCG0817());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0818(vrTechnicalSpec_LKXCG.getLKXCG0818());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0819(vrTechnicalSpec_LKXCG.getLKXCG0819());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0820(vrTechnicalSpec_LKXCG.getLKXCG0820());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0907(vrTechnicalSpec_LKXCG.getLKXCG0907());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0908(vrTechnicalSpec_LKXCG.getLKXCG0908());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0909(vrTechnicalSpec_LKXCG.getLKXCG0909());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0910(vrTechnicalSpec_LKXCG.getLKXCG0910());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0911(vrTechnicalSpec_LKXCG.getLKXCG0911());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0912(vrTechnicalSpec_LKXCG.getLKXCG0912());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0913(vrTechnicalSpec_LKXCG.getLKXCG0913());
		vrTechnicalSpec_LKXCGImpl.setLKXCG0914(vrTechnicalSpec_LKXCG.getLKXCG0914());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG001(vrTechnicalSpec_LKXCG.getBBLKXCG001());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG002(vrTechnicalSpec_LKXCG.getBBLKXCG002());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG003(vrTechnicalSpec_LKXCG.getBBLKXCG003());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG004(vrTechnicalSpec_LKXCG.getBBLKXCG004());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG005(vrTechnicalSpec_LKXCG.getBBLKXCG005());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG006(vrTechnicalSpec_LKXCG.getBBLKXCG006());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG007(vrTechnicalSpec_LKXCG.getBBLKXCG007());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG008(vrTechnicalSpec_LKXCG.getBBLKXCG008());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG009(vrTechnicalSpec_LKXCG.getBBLKXCG009());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG010(vrTechnicalSpec_LKXCG.getBBLKXCG010());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG011(vrTechnicalSpec_LKXCG.getBBLKXCG011());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG012(vrTechnicalSpec_LKXCG.getBBLKXCG012());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG013(vrTechnicalSpec_LKXCG.getBBLKXCG013());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG014(vrTechnicalSpec_LKXCG.getBBLKXCG014());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG015(vrTechnicalSpec_LKXCG.getBBLKXCG015());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG016(vrTechnicalSpec_LKXCG.getBBLKXCG016());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG017(vrTechnicalSpec_LKXCG.getBBLKXCG017());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG018(vrTechnicalSpec_LKXCG.getBBLKXCG018());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG019(vrTechnicalSpec_LKXCG.getBBLKXCG019());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG020(vrTechnicalSpec_LKXCG.getBBLKXCG020());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG021(vrTechnicalSpec_LKXCG.getBBLKXCG021());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG022(vrTechnicalSpec_LKXCG.getBBLKXCG022());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG023(vrTechnicalSpec_LKXCG.getBBLKXCG023());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG024(vrTechnicalSpec_LKXCG.getBBLKXCG024());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG025(vrTechnicalSpec_LKXCG.getBBLKXCG025());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG026(vrTechnicalSpec_LKXCG.getBBLKXCG026());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG027(vrTechnicalSpec_LKXCG.getBBLKXCG027());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG028(vrTechnicalSpec_LKXCG.getBBLKXCG028());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG029(vrTechnicalSpec_LKXCG.getBBLKXCG029());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG030(vrTechnicalSpec_LKXCG.getBBLKXCG030());
		vrTechnicalSpec_LKXCGImpl.setBBLKXCG031(vrTechnicalSpec_LKXCG.getBBLKXCG031());
		vrTechnicalSpec_LKXCGImpl.setModifyDate(vrTechnicalSpec_LKXCG.getModifyDate());
		vrTechnicalSpec_LKXCGImpl.setSyncDate(vrTechnicalSpec_LKXCG.getSyncDate());

		return vrTechnicalSpec_LKXCGImpl;
	}

	/**
	 * Returns the vr technical spec_lkxcg with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_lkxcg
	 * @return the vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_LKXCG == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_LKXCGException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_LKXCG;
	}

	/**
	 * Returns the vr technical spec_lkxcg with the primary key or throws a {@link NoSuchVRTechnicalSpec_LKXCGException} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_lkxcg
	 * @return the vr technical spec_lkxcg
	 * @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_LKXCGException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_lkxcg with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_lkxcg
	 * @return the vr technical spec_lkxcg, or <code>null</code> if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_LKXCGImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = (VRTechnicalSpec_LKXCG)serializable;

		if (vrTechnicalSpec_LKXCG == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_LKXCG = (VRTechnicalSpec_LKXCG)session.get(VRTechnicalSpec_LKXCGImpl.class,
						primaryKey);

				if (vrTechnicalSpec_LKXCG != null) {
					cacheResult(vrTechnicalSpec_LKXCG);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_LKXCGImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_LKXCGImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_LKXCG;
	}

	/**
	 * Returns the vr technical spec_lkxcg with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_lkxcg
	 * @return the vr technical spec_lkxcg, or <code>null</code> if a vr technical spec_lkxcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXCG fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_LKXCG> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_LKXCG> map = new HashMap<Serializable, VRTechnicalSpec_LKXCG>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_LKXCG != null) {
				map.put(primaryKey, vrTechnicalSpec_LKXCG);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_LKXCGImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_LKXCG)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : (List<VRTechnicalSpec_LKXCG>)q.list()) {
				map.put(vrTechnicalSpec_LKXCG.getPrimaryKeyObj(),
					vrTechnicalSpec_LKXCG);

				cacheResult(vrTechnicalSpec_LKXCG);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_LKXCG.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_LKXCGModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_LKXCGImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_lkxcgs.
	 *
	 * @return the vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxcgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @return the range of vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxcgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_lkxcgs
	 * @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_lkxcgs
	 */
	@Override
	public List<VRTechnicalSpec_LKXCG> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
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

		List<VRTechnicalSpec_LKXCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXCG>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXCG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_LKXCG;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_LKXCGModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXCG>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_lkxcgs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG : findAll()) {
			remove(vrTechnicalSpec_LKXCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxcgs.
	 *
	 * @return the number of vr technical spec_lkxcgs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_LKXCG);

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
		return VRTechnicalSpec_LKXCGModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_lkxcg persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_LKXCGImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_LKXCG = "SELECT vrTechnicalSpec_LKXCG FROM VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE_PKS_IN = "SELECT vrTechnicalSpec_LKXCG FROM VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_LKXCG_WHERE = "SELECT vrTechnicalSpec_LKXCG FROM VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_LKXCG = "SELECT COUNT(vrTechnicalSpec_LKXCG) FROM VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_LKXCG_WHERE = "SELECT COUNT(vrTechnicalSpec_LKXCG) FROM VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_LKXCG.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_LKXCG exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_LKXCG exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_LKXCGPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}