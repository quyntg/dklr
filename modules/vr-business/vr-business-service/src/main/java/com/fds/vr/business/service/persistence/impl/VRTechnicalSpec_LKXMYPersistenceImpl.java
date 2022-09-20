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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXMYException;
import com.fds.vr.business.model.VRTechnicalSpec_LKXMY;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_LKXMYPersistence;

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
 * The persistence implementation for the vr technical spec_lkxmy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXMYPersistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_LKXMYUtil
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXMYPersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_LKXMY>
	implements VRTechnicalSpec_LKXMYPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_LKXMYUtil} to access the vr technical spec_lkxmy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_LKXMYImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_LKXMYModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxmies where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_LKXMY.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_LKXMY.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
				query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxmy in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxmy in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		List<VRTechnicalSpec_LKXMY> list = findByDossierNo(dossierNo, mtCore,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXMY> list = findByDossierNo(dossierNo, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxmies before and after the current vr technical spec_lkxmy in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxmy
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY[] array = new VRTechnicalSpec_LKXMYImpl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXMY;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, dossierNo, mtCore,
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

	protected VRTechnicalSpec_LKXMY getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
			query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXMY);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXMY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxmies where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_lkxmies
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_LKXMY.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_LKXMY.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_LKXMY.dossierNo IS NULL OR vrTechnicalSpec_LKXMY.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_LKXMY.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_LKXMYModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxmies where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierIdCTN(String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierIdCTN(String dossierIdCTN,
		int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_LKXMY.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
				query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxmy in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByDossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxmy in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		List<VRTechnicalSpec_LKXMY> list = findByDossierIdCTN(dossierIdCTN, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXMY> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxmies before and after the current vr technical spec_lkxmy in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxmy
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY[] array = new VRTechnicalSpec_LKXMYImpl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, dossierIdCTN, orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXMY;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_LKXMY getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
			query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXMY);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXMY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxmies where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_lkxmies
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_LKXMY.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_LKXMY.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_LKXMY.dossierIdCTN IS NULL OR vrTechnicalSpec_LKXMY.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_LKXMYModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxmies where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_LKXMY.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
				query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxmy in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxmy in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		List<VRTechnicalSpec_LKXMY> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXMY> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxmies before and after the current vr technical spec_lkxmy in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxmy
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY[] findByDeliverableCode_PrevAndNext(long id,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY[] array = new VRTechnicalSpec_LKXMYImpl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, deliverableCode, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_LKXMY;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, deliverableCode, orderByComparator,
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

	protected VRTechnicalSpec_LKXMY getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
			query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXMY);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXMY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxmies where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_lkxmies
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE);

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
		"vrTechnicalSpec_LKXMY.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_LKXMY.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_LKXMY.deliverableCode IS NULL OR vrTechnicalSpec_LKXMY.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_LKXMYModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxmies where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : list) {
					if ((dossierId != vrTechnicalSpec_LKXMY.getDossierId()) ||
							(mtCore != vrTechnicalSpec_LKXMY.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxmy in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxmy in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		List<VRTechnicalSpec_LKXMY> list = findByDossierId(dossierId, mtCore,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXMY> list = findByDossierId(dossierId, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxmies before and after the current vr technical spec_lkxmy in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxmy
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY[] array = new VRTechnicalSpec_LKXMYImpl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXMY;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, dossierId, mtCore,
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

	protected VRTechnicalSpec_LKXMY getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
			query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXMY);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXMY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxmies where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_lkxmies
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_LKXMY.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_LKXMY.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_LKXMYModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxmies where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : list) {
					if ((dossierId != vrTechnicalSpec_LKXMY.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxmy in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxmy in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		List<VRTechnicalSpec_LKXMY> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXMY> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxmies before and after the current vr technical spec_lkxmy in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxmy
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY[] array = new VRTechnicalSpec_LKXMYImpl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXMY;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_LKXMY getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
			query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXMY);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXMY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxmies where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_lkxmies
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_LKXMY.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_LKXMYModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxmies where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : list) {
					if ((convertAssembleId != vrTechnicalSpec_LKXMY.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxmy in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxmy in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		List<VRTechnicalSpec_LKXMY> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXMY> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxmies before and after the current vr technical spec_lkxmy in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxmy
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY[] array = new VRTechnicalSpec_LKXMYImpl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXMY;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, convertAssembleId,
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

	protected VRTechnicalSpec_LKXMY getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
			query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXMY);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXMY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxmies where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_lkxmies
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE);

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
		"vrTechnicalSpec_LKXMY.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_LKXMYModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxmies where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByReferenceUid(String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByReferenceUid(String referenceUid,
		int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_LKXMY.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
				query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxmy in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByReferenceUid_First(String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxmy in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		List<VRTechnicalSpec_LKXMY> list = findByReferenceUid(referenceUid, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXMY> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxmies before and after the current vr technical spec_lkxmy in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxmy
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY[] array = new VRTechnicalSpec_LKXMYImpl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, referenceUid, orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXMY;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_LKXMY getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
			query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXMY);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXMY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxmies where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_lkxmies
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_LKXMY.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_LKXMY.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_LKXMY.referenceUid IS NULL OR vrTechnicalSpec_LKXMY.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_LKXMYModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_LKXMYModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_lkxmies where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_LKXMY.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_lkxmy in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_lkxmy in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		List<VRTechnicalSpec_LKXMY> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_LKXMY != null) {
			return vrTechnicalSpec_LKXMY;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_LKXMYException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_lkxmy in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_lkxmy, or <code>null</code> if a matching vr technical spec_lkxmy could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_LKXMY> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_lkxmies before and after the current vr technical spec_lkxmy in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_lkxmy
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY[] array = new VRTechnicalSpec_LKXMYImpl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_LKXMY;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_LKXMY, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_LKXMY getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE);

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
			query.append(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_LKXMY);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_LKXMY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_lkxmies where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_lkxmies
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE);

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
		"vrTechnicalSpec_LKXMY.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_LKXMYPersistenceImpl() {
		setModelClass(VRTechnicalSpec_LKXMY.class);
	}

	/**
	 * Caches the vr technical spec_lkxmy in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_LKXMY the vr technical spec_lkxmy
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		entityCache.putResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			vrTechnicalSpec_LKXMY.getPrimaryKey(), vrTechnicalSpec_LKXMY);

		vrTechnicalSpec_LKXMY.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_lkxmies in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_LKXMYs the vr technical spec_lkxmies
	 */
	@Override
	public void cacheResult(List<VRTechnicalSpec_LKXMY> vrTechnicalSpec_LKXMYs) {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : vrTechnicalSpec_LKXMYs) {
			if (entityCache.getResult(
						VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_LKXMYImpl.class,
						vrTechnicalSpec_LKXMY.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_LKXMY);
			}
			else {
				vrTechnicalSpec_LKXMY.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_lkxmies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_LKXMYImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_lkxmy.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		entityCache.removeResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			vrTechnicalSpec_LKXMY.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRTechnicalSpec_LKXMY> vrTechnicalSpec_LKXMYs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : vrTechnicalSpec_LKXMYs) {
			entityCache.removeResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_LKXMYImpl.class,
				vrTechnicalSpec_LKXMY.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_lkxmy with the primary key. Does not add the vr technical spec_lkxmy to the database.
	 *
	 * @param id the primary key for the new vr technical spec_lkxmy
	 * @return the new vr technical spec_lkxmy
	 */
	@Override
	public VRTechnicalSpec_LKXMY create(long id) {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = new VRTechnicalSpec_LKXMYImpl();

		vrTechnicalSpec_LKXMY.setNew(true);
		vrTechnicalSpec_LKXMY.setPrimaryKey(id);

		return vrTechnicalSpec_LKXMY;
	}

	/**
	 * Removes the vr technical spec_lkxmy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_lkxmy
	 * @return the vr technical spec_lkxmy that was removed
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY remove(long id)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_lkxmy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_lkxmy
	 * @return the vr technical spec_lkxmy that was removed
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = (VRTechnicalSpec_LKXMY)session.get(VRTechnicalSpec_LKXMYImpl.class,
					primaryKey);

			if (vrTechnicalSpec_LKXMY == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_LKXMYException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_LKXMY);
		}
		catch (NoSuchVRTechnicalSpec_LKXMYException nsee) {
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
	protected VRTechnicalSpec_LKXMY removeImpl(
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		vrTechnicalSpec_LKXMY = toUnwrappedModel(vrTechnicalSpec_LKXMY);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_LKXMY)) {
				vrTechnicalSpec_LKXMY = (VRTechnicalSpec_LKXMY)session.get(VRTechnicalSpec_LKXMYImpl.class,
						vrTechnicalSpec_LKXMY.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_LKXMY != null) {
				session.delete(vrTechnicalSpec_LKXMY);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_LKXMY != null) {
			clearCache(vrTechnicalSpec_LKXMY);
		}

		return vrTechnicalSpec_LKXMY;
	}

	@Override
	public VRTechnicalSpec_LKXMY updateImpl(
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		vrTechnicalSpec_LKXMY = toUnwrappedModel(vrTechnicalSpec_LKXMY);

		boolean isNew = vrTechnicalSpec_LKXMY.isNew();

		VRTechnicalSpec_LKXMYModelImpl vrTechnicalSpec_LKXMYModelImpl = (VRTechnicalSpec_LKXMYModelImpl)vrTechnicalSpec_LKXMY;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_LKXMY.isNew()) {
				session.save(vrTechnicalSpec_LKXMY);

				vrTechnicalSpec_LKXMY.setNew(false);
			}
			else {
				vrTechnicalSpec_LKXMY = (VRTechnicalSpec_LKXMY)session.merge(vrTechnicalSpec_LKXMY);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_LKXMYModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_LKXMYModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_LKXMYModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getDossierNo(),
						vrTechnicalSpec_LKXMYModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_LKXMYModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_LKXMYModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_LKXMYModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_LKXMYModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getDossierId(),
						vrTechnicalSpec_LKXMYModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_LKXMYModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_LKXMYModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_LKXMYModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_LKXMYModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_LKXMYModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_LKXMYImpl.class,
			vrTechnicalSpec_LKXMY.getPrimaryKey(), vrTechnicalSpec_LKXMY, false);

		vrTechnicalSpec_LKXMY.resetOriginalValues();

		return vrTechnicalSpec_LKXMY;
	}

	protected VRTechnicalSpec_LKXMY toUnwrappedModel(
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		if (vrTechnicalSpec_LKXMY instanceof VRTechnicalSpec_LKXMYImpl) {
			return vrTechnicalSpec_LKXMY;
		}

		VRTechnicalSpec_LKXMYImpl vrTechnicalSpec_LKXMYImpl = new VRTechnicalSpec_LKXMYImpl();

		vrTechnicalSpec_LKXMYImpl.setNew(vrTechnicalSpec_LKXMY.isNew());
		vrTechnicalSpec_LKXMYImpl.setPrimaryKey(vrTechnicalSpec_LKXMY.getPrimaryKey());

		vrTechnicalSpec_LKXMYImpl.setId(vrTechnicalSpec_LKXMY.getId());
		vrTechnicalSpec_LKXMYImpl.setMtCore(vrTechnicalSpec_LKXMY.getMtCore());
		vrTechnicalSpec_LKXMYImpl.setConvertAssembleId(vrTechnicalSpec_LKXMY.getConvertAssembleId());
		vrTechnicalSpec_LKXMYImpl.setDossierId(vrTechnicalSpec_LKXMY.getDossierId());
		vrTechnicalSpec_LKXMYImpl.setDossierNo(vrTechnicalSpec_LKXMY.getDossierNo());
		vrTechnicalSpec_LKXMYImpl.setReferenceUid(vrTechnicalSpec_LKXMY.getReferenceUid());
		vrTechnicalSpec_LKXMYImpl.setDossierIdCTN(vrTechnicalSpec_LKXMY.getDossierIdCTN());
		vrTechnicalSpec_LKXMYImpl.setDeliverableCode(vrTechnicalSpec_LKXMY.getDeliverableCode());
		vrTechnicalSpec_LKXMYImpl.setVehicleTypeCertificateId(vrTechnicalSpec_LKXMY.getVehicleTypeCertificateId());
		vrTechnicalSpec_LKXMYImpl.setXMY01001(vrTechnicalSpec_LKXMY.getXMY01001());
		vrTechnicalSpec_LKXMYImpl.setXMY01002(vrTechnicalSpec_LKXMY.getXMY01002());
		vrTechnicalSpec_LKXMYImpl.setXMY01003(vrTechnicalSpec_LKXMY.getXMY01003());
		vrTechnicalSpec_LKXMYImpl.setXMY01004(vrTechnicalSpec_LKXMY.getXMY01004());
		vrTechnicalSpec_LKXMYImpl.setXMY01005(vrTechnicalSpec_LKXMY.getXMY01005());
		vrTechnicalSpec_LKXMYImpl.setXMY01006(vrTechnicalSpec_LKXMY.getXMY01006());
		vrTechnicalSpec_LKXMYImpl.setXMY01007(vrTechnicalSpec_LKXMY.getXMY01007());
		vrTechnicalSpec_LKXMYImpl.setXMY01008(vrTechnicalSpec_LKXMY.getXMY01008());
		vrTechnicalSpec_LKXMYImpl.setXMY01009(vrTechnicalSpec_LKXMY.getXMY01009());
		vrTechnicalSpec_LKXMYImpl.setXMY01010(vrTechnicalSpec_LKXMY.getXMY01010());
		vrTechnicalSpec_LKXMYImpl.setXMY01011(vrTechnicalSpec_LKXMY.getXMY01011());
		vrTechnicalSpec_LKXMYImpl.setXMY01012(vrTechnicalSpec_LKXMY.getXMY01012());
		vrTechnicalSpec_LKXMYImpl.setXMY01013(vrTechnicalSpec_LKXMY.getXMY01013());
		vrTechnicalSpec_LKXMYImpl.setXMY01014(vrTechnicalSpec_LKXMY.getXMY01014());
		vrTechnicalSpec_LKXMYImpl.setXMY01016(vrTechnicalSpec_LKXMY.getXMY01016());
		vrTechnicalSpec_LKXMYImpl.setXMY01017(vrTechnicalSpec_LKXMY.getXMY01017());
		vrTechnicalSpec_LKXMYImpl.setXMY01019(vrTechnicalSpec_LKXMY.getXMY01019());
		vrTechnicalSpec_LKXMYImpl.setXMY01020(vrTechnicalSpec_LKXMY.getXMY01020());
		vrTechnicalSpec_LKXMYImpl.setXMY01021(vrTechnicalSpec_LKXMY.getXMY01021());
		vrTechnicalSpec_LKXMYImpl.setXMY01022(vrTechnicalSpec_LKXMY.getXMY01022());
		vrTechnicalSpec_LKXMYImpl.setXMY01030(vrTechnicalSpec_LKXMY.getXMY01030());
		vrTechnicalSpec_LKXMYImpl.setXMY01031(vrTechnicalSpec_LKXMY.getXMY01031());
		vrTechnicalSpec_LKXMYImpl.setXMY01032(vrTechnicalSpec_LKXMY.getXMY01032());
		vrTechnicalSpec_LKXMYImpl.setXMY01033(vrTechnicalSpec_LKXMY.getXMY01033());
		vrTechnicalSpec_LKXMYImpl.setXMY01034(vrTechnicalSpec_LKXMY.getXMY01034());
		vrTechnicalSpec_LKXMYImpl.setXMY01035(vrTechnicalSpec_LKXMY.getXMY01035());
		vrTechnicalSpec_LKXMYImpl.setXMY01036(vrTechnicalSpec_LKXMY.getXMY01036());
		vrTechnicalSpec_LKXMYImpl.setXMY01037(vrTechnicalSpec_LKXMY.getXMY01037());
		vrTechnicalSpec_LKXMYImpl.setXMY01038(vrTechnicalSpec_LKXMY.getXMY01038());
		vrTechnicalSpec_LKXMYImpl.setXMY01039(vrTechnicalSpec_LKXMY.getXMY01039());
		vrTechnicalSpec_LKXMYImpl.setXMY01040(vrTechnicalSpec_LKXMY.getXMY01040());
		vrTechnicalSpec_LKXMYImpl.setXMY01041(vrTechnicalSpec_LKXMY.getXMY01041());
		vrTechnicalSpec_LKXMYImpl.setXMY01042(vrTechnicalSpec_LKXMY.getXMY01042());
		vrTechnicalSpec_LKXMYImpl.setXMY01043(vrTechnicalSpec_LKXMY.getXMY01043());
		vrTechnicalSpec_LKXMYImpl.setXMY01044(vrTechnicalSpec_LKXMY.getXMY01044());
		vrTechnicalSpec_LKXMYImpl.setXMY01045(vrTechnicalSpec_LKXMY.getXMY01045());
		vrTechnicalSpec_LKXMYImpl.setXMY01046(vrTechnicalSpec_LKXMY.getXMY01046());
		vrTechnicalSpec_LKXMYImpl.setXMY01047(vrTechnicalSpec_LKXMY.getXMY01047());
		vrTechnicalSpec_LKXMYImpl.setXMY01050(vrTechnicalSpec_LKXMY.getXMY01050());
		vrTechnicalSpec_LKXMYImpl.setXMY01051(vrTechnicalSpec_LKXMY.getXMY01051());
		vrTechnicalSpec_LKXMYImpl.setXMY01052(vrTechnicalSpec_LKXMY.getXMY01052());
		vrTechnicalSpec_LKXMYImpl.setXMY01053(vrTechnicalSpec_LKXMY.getXMY01053());
		vrTechnicalSpec_LKXMYImpl.setXMY01054(vrTechnicalSpec_LKXMY.getXMY01054());
		vrTechnicalSpec_LKXMYImpl.setXMY01055(vrTechnicalSpec_LKXMY.getXMY01055());
		vrTechnicalSpec_LKXMYImpl.setXMY01056(vrTechnicalSpec_LKXMY.getXMY01056());
		vrTechnicalSpec_LKXMYImpl.setXMY01057(vrTechnicalSpec_LKXMY.getXMY01057());
		vrTechnicalSpec_LKXMYImpl.setXMY01058(vrTechnicalSpec_LKXMY.getXMY01058());
		vrTechnicalSpec_LKXMYImpl.setXMY01059(vrTechnicalSpec_LKXMY.getXMY01059());
		vrTechnicalSpec_LKXMYImpl.setXMY01060(vrTechnicalSpec_LKXMY.getXMY01060());
		vrTechnicalSpec_LKXMYImpl.setXMY01062(vrTechnicalSpec_LKXMY.getXMY01062());
		vrTechnicalSpec_LKXMYImpl.setXMY01063(vrTechnicalSpec_LKXMY.getXMY01063());
		vrTechnicalSpec_LKXMYImpl.setXMY01064(vrTechnicalSpec_LKXMY.getXMY01064());
		vrTechnicalSpec_LKXMYImpl.setXMY01065(vrTechnicalSpec_LKXMY.getXMY01065());
		vrTechnicalSpec_LKXMYImpl.setLKXMY01050(vrTechnicalSpec_LKXMY.getLKXMY01050());
		vrTechnicalSpec_LKXMYImpl.setLKXMY01051(vrTechnicalSpec_LKXMY.getLKXMY01051());
		vrTechnicalSpec_LKXMYImpl.setLKXMY01052(vrTechnicalSpec_LKXMY.getLKXMY01052());
		vrTechnicalSpec_LKXMYImpl.setLKXMY01053(vrTechnicalSpec_LKXMY.getLKXMY01053());
		vrTechnicalSpec_LKXMYImpl.setLKXMY01026(vrTechnicalSpec_LKXMY.getLKXMY01026());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0401(vrTechnicalSpec_LKXMY.getLKXMY0401());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0402(vrTechnicalSpec_LKXMY.getLKXMY0402());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0403(vrTechnicalSpec_LKXMY.getLKXMY0403());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0404(vrTechnicalSpec_LKXMY.getLKXMY0404());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0405(vrTechnicalSpec_LKXMY.getLKXMY0405());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0406(vrTechnicalSpec_LKXMY.getLKXMY0406());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1307(vrTechnicalSpec_LKXMY.getLKXMY1307());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1308(vrTechnicalSpec_LKXMY.getLKXMY1308());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1309(vrTechnicalSpec_LKXMY.getLKXMY1309());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1310(vrTechnicalSpec_LKXMY.getLKXMY1310());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1311(vrTechnicalSpec_LKXMY.getLKXMY1311());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1312(vrTechnicalSpec_LKXMY.getLKXMY1312());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1207(vrTechnicalSpec_LKXMY.getLKXMY1207());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1208(vrTechnicalSpec_LKXMY.getLKXMY1208());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1209(vrTechnicalSpec_LKXMY.getLKXMY1209());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1210(vrTechnicalSpec_LKXMY.getLKXMY1210());
		vrTechnicalSpec_LKXMYImpl.setLKXMY1211(vrTechnicalSpec_LKXMY.getLKXMY1211());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0201(vrTechnicalSpec_LKXMY.getLKXMY0201());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0202(vrTechnicalSpec_LKXMY.getLKXMY0202());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0203(vrTechnicalSpec_LKXMY.getLKXMY0203());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0204(vrTechnicalSpec_LKXMY.getLKXMY0204());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0205(vrTechnicalSpec_LKXMY.getLKXMY0205());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0206(vrTechnicalSpec_LKXMY.getLKXMY0206());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0207(vrTechnicalSpec_LKXMY.getLKXMY0207());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0208(vrTechnicalSpec_LKXMY.getLKXMY0208());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0209(vrTechnicalSpec_LKXMY.getLKXMY0209());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0210(vrTechnicalSpec_LKXMY.getLKXMY0210());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0211(vrTechnicalSpec_LKXMY.getLKXMY0211());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0212(vrTechnicalSpec_LKXMY.getLKXMY0212());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0213(vrTechnicalSpec_LKXMY.getLKXMY0213());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0214(vrTechnicalSpec_LKXMY.getLKXMY0214());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0215(vrTechnicalSpec_LKXMY.getLKXMY0215());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0216(vrTechnicalSpec_LKXMY.getLKXMY0216());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0217(vrTechnicalSpec_LKXMY.getLKXMY0217());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0218(vrTechnicalSpec_LKXMY.getLKXMY0218());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0219(vrTechnicalSpec_LKXMY.getLKXMY0219());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0040(vrTechnicalSpec_LKXMY.getLKXMY0040());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0041(vrTechnicalSpec_LKXMY.getLKXMY0041());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0042(vrTechnicalSpec_LKXMY.getLKXMY0042());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0043(vrTechnicalSpec_LKXMY.getLKXMY0043());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0044(vrTechnicalSpec_LKXMY.getLKXMY0044());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0045(vrTechnicalSpec_LKXMY.getLKXMY0045());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0046(vrTechnicalSpec_LKXMY.getLKXMY0046());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0048(vrTechnicalSpec_LKXMY.getLKXMY0048());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0049(vrTechnicalSpec_LKXMY.getLKXMY0049());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0050(vrTechnicalSpec_LKXMY.getLKXMY0050());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0051(vrTechnicalSpec_LKXMY.getLKXMY0051());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0052(vrTechnicalSpec_LKXMY.getLKXMY0052());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0054(vrTechnicalSpec_LKXMY.getLKXMY0054());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0055(vrTechnicalSpec_LKXMY.getLKXMY0055());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0056(vrTechnicalSpec_LKXMY.getLKXMY0056());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0057(vrTechnicalSpec_LKXMY.getLKXMY0057());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0058(vrTechnicalSpec_LKXMY.getLKXMY0058());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0059(vrTechnicalSpec_LKXMY.getLKXMY0059());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0060(vrTechnicalSpec_LKXMY.getLKXMY0060());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0061(vrTechnicalSpec_LKXMY.getLKXMY0061());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0062(vrTechnicalSpec_LKXMY.getLKXMY0062());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0063(vrTechnicalSpec_LKXMY.getLKXMY0063());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0109(vrTechnicalSpec_LKXMY.getLKXMY0109());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0110(vrTechnicalSpec_LKXMY.getLKXMY0110());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0111(vrTechnicalSpec_LKXMY.getLKXMY0111());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0112(vrTechnicalSpec_LKXMY.getLKXMY0112());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0113(vrTechnicalSpec_LKXMY.getLKXMY0113());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0114(vrTechnicalSpec_LKXMY.getLKXMY0114());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0115(vrTechnicalSpec_LKXMY.getLKXMY0115());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0116(vrTechnicalSpec_LKXMY.getLKXMY0116());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0117(vrTechnicalSpec_LKXMY.getLKXMY0117());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0118(vrTechnicalSpec_LKXMY.getLKXMY0118());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0119(vrTechnicalSpec_LKXMY.getLKXMY0119());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0120(vrTechnicalSpec_LKXMY.getLKXMY0120());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0121(vrTechnicalSpec_LKXMY.getLKXMY0121());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0122(vrTechnicalSpec_LKXMY.getLKXMY0122());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0123(vrTechnicalSpec_LKXMY.getLKXMY0123());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0124(vrTechnicalSpec_LKXMY.getLKXMY0124());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0125(vrTechnicalSpec_LKXMY.getLKXMY0125());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0126(vrTechnicalSpec_LKXMY.getLKXMY0126());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0127(vrTechnicalSpec_LKXMY.getLKXMY0127());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0128(vrTechnicalSpec_LKXMY.getLKXMY0128());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0129(vrTechnicalSpec_LKXMY.getLKXMY0129());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0130(vrTechnicalSpec_LKXMY.getLKXMY0130());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0131(vrTechnicalSpec_LKXMY.getLKXMY0131());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0064(vrTechnicalSpec_LKXMY.getLKXMY0064());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0132(vrTechnicalSpec_LKXMY.getLKXMY0132());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0133(vrTechnicalSpec_LKXMY.getLKXMY0133());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0134(vrTechnicalSpec_LKXMY.getLKXMY0134());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0135(vrTechnicalSpec_LKXMY.getLKXMY0135());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0136(vrTechnicalSpec_LKXMY.getLKXMY0136());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0137(vrTechnicalSpec_LKXMY.getLKXMY0137());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0138(vrTechnicalSpec_LKXMY.getLKXMY0138());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0139(vrTechnicalSpec_LKXMY.getLKXMY0139());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0140(vrTechnicalSpec_LKXMY.getLKXMY0140());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0066(vrTechnicalSpec_LKXMY.getLKXMY0066());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0141(vrTechnicalSpec_LKXMY.getLKXMY0141());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0142(vrTechnicalSpec_LKXMY.getLKXMY0142());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0143(vrTechnicalSpec_LKXMY.getLKXMY0143());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0144(vrTechnicalSpec_LKXMY.getLKXMY0144());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0145(vrTechnicalSpec_LKXMY.getLKXMY0145());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0146(vrTechnicalSpec_LKXMY.getLKXMY0146());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0147(vrTechnicalSpec_LKXMY.getLKXMY0147());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0148(vrTechnicalSpec_LKXMY.getLKXMY0148());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0149(vrTechnicalSpec_LKXMY.getLKXMY0149());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0150(vrTechnicalSpec_LKXMY.getLKXMY0150());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0153(vrTechnicalSpec_LKXMY.getLKXMY0153());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0154(vrTechnicalSpec_LKXMY.getLKXMY0154());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0155(vrTechnicalSpec_LKXMY.getLKXMY0155());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0156(vrTechnicalSpec_LKXMY.getLKXMY0156());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0157(vrTechnicalSpec_LKXMY.getLKXMY0157());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0158(vrTechnicalSpec_LKXMY.getLKXMY0158());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0159(vrTechnicalSpec_LKXMY.getLKXMY0159());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0160(vrTechnicalSpec_LKXMY.getLKXMY0160());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0151(vrTechnicalSpec_LKXMY.getLKXMY0151());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0161(vrTechnicalSpec_LKXMY.getLKXMY0161());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0162(vrTechnicalSpec_LKXMY.getLKXMY0162());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0163(vrTechnicalSpec_LKXMY.getLKXMY0163());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0164(vrTechnicalSpec_LKXMY.getLKXMY0164());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0165(vrTechnicalSpec_LKXMY.getLKXMY0165());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0166(vrTechnicalSpec_LKXMY.getLKXMY0166());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0167(vrTechnicalSpec_LKXMY.getLKXMY0167());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0168(vrTechnicalSpec_LKXMY.getLKXMY0168());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0169(vrTechnicalSpec_LKXMY.getLKXMY0169());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0170(vrTechnicalSpec_LKXMY.getLKXMY0170());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0171(vrTechnicalSpec_LKXMY.getLKXMY0171());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0172(vrTechnicalSpec_LKXMY.getLKXMY0172());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0173(vrTechnicalSpec_LKXMY.getLKXMY0173());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0174(vrTechnicalSpec_LKXMY.getLKXMY0174());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0175(vrTechnicalSpec_LKXMY.getLKXMY0175());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0176(vrTechnicalSpec_LKXMY.getLKXMY0176());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0177(vrTechnicalSpec_LKXMY.getLKXMY0177());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0178(vrTechnicalSpec_LKXMY.getLKXMY0178());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0179(vrTechnicalSpec_LKXMY.getLKXMY0179());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0407(vrTechnicalSpec_LKXMY.getLKXMY0407());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0408(vrTechnicalSpec_LKXMY.getLKXMY0408());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0409(vrTechnicalSpec_LKXMY.getLKXMY0409());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0410(vrTechnicalSpec_LKXMY.getLKXMY0410());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0412(vrTechnicalSpec_LKXMY.getLKXMY0412());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0413(vrTechnicalSpec_LKXMY.getLKXMY0413());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0414(vrTechnicalSpec_LKXMY.getLKXMY0414());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0415(vrTechnicalSpec_LKXMY.getLKXMY0415());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0416(vrTechnicalSpec_LKXMY.getLKXMY0416());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0417(vrTechnicalSpec_LKXMY.getLKXMY0417());
		vrTechnicalSpec_LKXMYImpl.setLKXMY0418(vrTechnicalSpec_LKXMY.getLKXMY0418());
		vrTechnicalSpec_LKXMYImpl.setModifyDate(vrTechnicalSpec_LKXMY.getModifyDate());
		vrTechnicalSpec_LKXMYImpl.setSyncDate(vrTechnicalSpec_LKXMY.getSyncDate());

		return vrTechnicalSpec_LKXMYImpl;
	}

	/**
	 * Returns the vr technical spec_lkxmy with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_lkxmy
	 * @return the vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_LKXMY == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_LKXMYException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_LKXMY;
	}

	/**
	 * Returns the vr technical spec_lkxmy with the primary key or throws a {@link NoSuchVRTechnicalSpec_LKXMYException} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_lkxmy
	 * @return the vr technical spec_lkxmy
	 * @throws NoSuchVRTechnicalSpec_LKXMYException if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_LKXMYException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_lkxmy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_lkxmy
	 * @return the vr technical spec_lkxmy, or <code>null</code> if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_LKXMYImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = (VRTechnicalSpec_LKXMY)serializable;

		if (vrTechnicalSpec_LKXMY == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_LKXMY = (VRTechnicalSpec_LKXMY)session.get(VRTechnicalSpec_LKXMYImpl.class,
						primaryKey);

				if (vrTechnicalSpec_LKXMY != null) {
					cacheResult(vrTechnicalSpec_LKXMY);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_LKXMYImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_LKXMYImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_LKXMY;
	}

	/**
	 * Returns the vr technical spec_lkxmy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_lkxmy
	 * @return the vr technical spec_lkxmy, or <code>null</code> if a vr technical spec_lkxmy with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_LKXMY fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_LKXMY> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_LKXMY> map = new HashMap<Serializable, VRTechnicalSpec_LKXMY>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_LKXMY != null) {
				map.put(primaryKey, vrTechnicalSpec_LKXMY);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_LKXMYImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_LKXMY)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : (List<VRTechnicalSpec_LKXMY>)q.list()) {
				map.put(vrTechnicalSpec_LKXMY.getPrimaryKeyObj(),
					vrTechnicalSpec_LKXMY);

				cacheResult(vrTechnicalSpec_LKXMY);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_LKXMY.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_LKXMYModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_LKXMYImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_lkxmies.
	 *
	 * @return the vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_lkxmies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @return the range of vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_lkxmies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_lkxmies
	 * @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_lkxmies
	 */
	@Override
	public List<VRTechnicalSpec_LKXMY> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXMY> orderByComparator,
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

		List<VRTechnicalSpec_LKXMY> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_LKXMY>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_LKXMY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_LKXMY;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_LKXMYModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_LKXMY>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_lkxmies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY : findAll()) {
			remove(vrTechnicalSpec_LKXMY);
		}
	}

	/**
	 * Returns the number of vr technical spec_lkxmies.
	 *
	 * @return the number of vr technical spec_lkxmies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_LKXMY);

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
		return VRTechnicalSpec_LKXMYModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_lkxmy persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_LKXMYImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_LKXMY = "SELECT vrTechnicalSpec_LKXMY FROM VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE_PKS_IN = "SELECT vrTechnicalSpec_LKXMY FROM VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_LKXMY_WHERE = "SELECT vrTechnicalSpec_LKXMY FROM VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_LKXMY = "SELECT COUNT(vrTechnicalSpec_LKXMY) FROM VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_LKXMY_WHERE = "SELECT COUNT(vrTechnicalSpec_LKXMY) FROM VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_LKXMY.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_LKXMY exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_LKXMY exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_LKXMYPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}