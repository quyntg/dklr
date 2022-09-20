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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCHException;
import com.fds.vr.business.model.VRTechnicalSpec_XCH;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCHImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCHModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XCHPersistence;

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
 * The persistence implementation for the vr technical spec_xch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCHPersistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XCHUtil
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCHPersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XCH>
	implements VRTechnicalSpec_XCHPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XCHUtil} to access the vr technical spec_xch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XCHImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCHModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xchs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XCH.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XCH.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
				query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		List<VRTechnicalSpec_XCH> list = findByDossierNo(dossierNo, mtCore, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCH> list = findByDossierNo(dossierNo, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xchs before and after the current vr technical spec_xch in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH[] array = new VRTechnicalSpec_XCHImpl[3];

			array[0] = getByDossierNo_PrevAndNext(session, vrTechnicalSpec_XCH,
					dossierNo, mtCore, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCH;

			array[2] = getByDossierNo_PrevAndNext(session, vrTechnicalSpec_XCH,
					dossierNo, mtCore, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCH getByDossierNo_PrevAndNext(Session session,
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH, String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
			query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCH);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xchs where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xchs
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XCH.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XCH.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XCH.dossierNo IS NULL OR vrTechnicalSpec_XCH.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XCH.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCHModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xchs where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierIdCTN(String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierIdCTN(String dossierIdCTN,
		int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XCH.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
				query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByDossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByDossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		List<VRTechnicalSpec_XCH> list = findByDossierIdCTN(dossierIdCTN, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCH> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xchs before and after the current vr technical spec_xch in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH[] array = new VRTechnicalSpec_XCHImpl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCH, dossierIdCTN, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCH;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCH, dossierIdCTN, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCH getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XCH vrTechnicalSpec_XCH,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
			query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCH);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xchs where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xchs
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XCH.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XCH.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XCH.dossierIdCTN IS NULL OR vrTechnicalSpec_XCH.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCHModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xchs where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XCH.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
				query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		List<VRTechnicalSpec_XCH> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCH> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xchs before and after the current vr technical spec_xch in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH[] findByDeliverableCode_PrevAndNext(long id,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH[] array = new VRTechnicalSpec_XCHImpl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCH, deliverableCode, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCH;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCH, deliverableCode, orderByComparator,
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

	protected VRTechnicalSpec_XCH getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XCH vrTechnicalSpec_XCH,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
			query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCH);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xchs where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xchs
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE);

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
		"vrTechnicalSpec_XCH.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XCH.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XCH.deliverableCode IS NULL OR vrTechnicalSpec_XCH.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCHModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xchs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierId(long dossierId, long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : list) {
					if ((dossierId != vrTechnicalSpec_XCH.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XCH.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		List<VRTechnicalSpec_XCH> list = findByDossierId(dossierId, mtCore, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCH> list = findByDossierId(dossierId, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xchs before and after the current vr technical spec_xch in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH[] array = new VRTechnicalSpec_XCHImpl[3];

			array[0] = getByDossierId_PrevAndNext(session, vrTechnicalSpec_XCH,
					dossierId, mtCore, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCH;

			array[2] = getByDossierId_PrevAndNext(session, vrTechnicalSpec_XCH,
					dossierId, mtCore, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCH getByDossierId_PrevAndNext(Session session,
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH, long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
			query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCH);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xchs where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xchs
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCH.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XCH.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCHModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xchs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : list) {
					if ((dossierId != vrTechnicalSpec_XCH.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		List<VRTechnicalSpec_XCH> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCH> list = findBy_DossierId(dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xchs before and after the current vr technical spec_xch in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH[] findBy_DossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH[] array = new VRTechnicalSpec_XCHImpl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCH, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCH;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCH, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCH getBy_DossierId_PrevAndNext(Session session,
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH, long dossierId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
			query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCH);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xchs where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xchs
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCH.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XCHModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xchs where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : list) {
					if ((convertAssembleId != vrTechnicalSpec_XCH.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		List<VRTechnicalSpec_XCH> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCH> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xchs before and after the current vr technical spec_xch in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH[] findByConvertAssembleId_PrevAndNext(long id,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH[] array = new VRTechnicalSpec_XCHImpl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCH, convertAssembleId, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCH;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCH, convertAssembleId, orderByComparator,
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

	protected VRTechnicalSpec_XCH getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XCH vrTechnicalSpec_XCH,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
			query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCH);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xchs where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xchs
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE);

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
		"vrTechnicalSpec_XCH.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCHModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xchs where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByReferenceUid(String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByReferenceUid(String referenceUid,
		int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XCH.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
				query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByReferenceUid_First(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByReferenceUid_First(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		List<VRTechnicalSpec_XCH> list = findByReferenceUid(referenceUid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCH> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xchs before and after the current vr technical spec_xch in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH[] array = new VRTechnicalSpec_XCHImpl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCH, referenceUid, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCH;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCH, referenceUid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCH getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XCH vrTechnicalSpec_XCH,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
			query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCH);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xchs where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xchs
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XCH.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XCH.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XCH.referenceUid IS NULL OR vrTechnicalSpec_XCH.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCHModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xchs where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XCH.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		List<VRTechnicalSpec_XCH> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCH != null) {
			return vrTechnicalSpec_XCH;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch, or <code>null</code> if a matching vr technical spec_xch could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCH> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xchs before and after the current vr technical spec_xch in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH[] array = new VRTechnicalSpec_XCHImpl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCH, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCH;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCH, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XCH getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XCH vrTechnicalSpec_XCH,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE);

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
			query.append(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCH);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xchs where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xchs
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE);

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
		"vrTechnicalSpec_XCH.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XCHPersistenceImpl() {
		setModelClass(VRTechnicalSpec_XCH.class);
	}

	/**
	 * Caches the vr technical spec_xch in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCH the vr technical spec_xch
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		entityCache.putResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class, vrTechnicalSpec_XCH.getPrimaryKey(),
			vrTechnicalSpec_XCH);

		vrTechnicalSpec_XCH.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xchs in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCHs the vr technical spec_xchs
	 */
	@Override
	public void cacheResult(List<VRTechnicalSpec_XCH> vrTechnicalSpec_XCHs) {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : vrTechnicalSpec_XCHs) {
			if (entityCache.getResult(
						VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCHImpl.class,
						vrTechnicalSpec_XCH.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XCH);
			}
			else {
				vrTechnicalSpec_XCH.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xchs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XCHImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xch.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		entityCache.removeResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class, vrTechnicalSpec_XCH.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRTechnicalSpec_XCH> vrTechnicalSpec_XCHs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : vrTechnicalSpec_XCHs) {
			entityCache.removeResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCHImpl.class,
				vrTechnicalSpec_XCH.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xch with the primary key. Does not add the vr technical spec_xch to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xch
	 * @return the new vr technical spec_xch
	 */
	@Override
	public VRTechnicalSpec_XCH create(long id) {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = new VRTechnicalSpec_XCHImpl();

		vrTechnicalSpec_XCH.setNew(true);
		vrTechnicalSpec_XCH.setPrimaryKey(id);

		return vrTechnicalSpec_XCH;
	}

	/**
	 * Removes the vr technical spec_xch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xch
	 * @return the vr technical spec_xch that was removed
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH remove(long id)
		throws NoSuchVRTechnicalSpec_XCHException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xch
	 * @return the vr technical spec_xch that was removed
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCHException {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCH vrTechnicalSpec_XCH = (VRTechnicalSpec_XCH)session.get(VRTechnicalSpec_XCHImpl.class,
					primaryKey);

			if (vrTechnicalSpec_XCH == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XCHException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XCH);
		}
		catch (NoSuchVRTechnicalSpec_XCHException nsee) {
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
	protected VRTechnicalSpec_XCH removeImpl(
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		vrTechnicalSpec_XCH = toUnwrappedModel(vrTechnicalSpec_XCH);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XCH)) {
				vrTechnicalSpec_XCH = (VRTechnicalSpec_XCH)session.get(VRTechnicalSpec_XCHImpl.class,
						vrTechnicalSpec_XCH.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XCH != null) {
				session.delete(vrTechnicalSpec_XCH);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XCH != null) {
			clearCache(vrTechnicalSpec_XCH);
		}

		return vrTechnicalSpec_XCH;
	}

	@Override
	public VRTechnicalSpec_XCH updateImpl(
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		vrTechnicalSpec_XCH = toUnwrappedModel(vrTechnicalSpec_XCH);

		boolean isNew = vrTechnicalSpec_XCH.isNew();

		VRTechnicalSpec_XCHModelImpl vrTechnicalSpec_XCHModelImpl = (VRTechnicalSpec_XCHModelImpl)vrTechnicalSpec_XCH;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XCH.isNew()) {
				session.save(vrTechnicalSpec_XCH);

				vrTechnicalSpec_XCH.setNew(false);
			}
			else {
				vrTechnicalSpec_XCH = (VRTechnicalSpec_XCH)session.merge(vrTechnicalSpec_XCH);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XCHModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XCHModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XCHModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getDossierNo(),
						vrTechnicalSpec_XCHModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XCHModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XCHModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XCHModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XCHModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getDossierId(),
						vrTechnicalSpec_XCHModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCHModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] { vrTechnicalSpec_XCHModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCHModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XCHModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XCHModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHImpl.class, vrTechnicalSpec_XCH.getPrimaryKey(),
			vrTechnicalSpec_XCH, false);

		vrTechnicalSpec_XCH.resetOriginalValues();

		return vrTechnicalSpec_XCH;
	}

	protected VRTechnicalSpec_XCH toUnwrappedModel(
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		if (vrTechnicalSpec_XCH instanceof VRTechnicalSpec_XCHImpl) {
			return vrTechnicalSpec_XCH;
		}

		VRTechnicalSpec_XCHImpl vrTechnicalSpec_XCHImpl = new VRTechnicalSpec_XCHImpl();

		vrTechnicalSpec_XCHImpl.setNew(vrTechnicalSpec_XCH.isNew());
		vrTechnicalSpec_XCHImpl.setPrimaryKey(vrTechnicalSpec_XCH.getPrimaryKey());

		vrTechnicalSpec_XCHImpl.setId(vrTechnicalSpec_XCH.getId());
		vrTechnicalSpec_XCHImpl.setMtCore(vrTechnicalSpec_XCH.getMtCore());
		vrTechnicalSpec_XCHImpl.setConvertAssembleId(vrTechnicalSpec_XCH.getConvertAssembleId());
		vrTechnicalSpec_XCHImpl.setDossierId(vrTechnicalSpec_XCH.getDossierId());
		vrTechnicalSpec_XCHImpl.setDossierNo(vrTechnicalSpec_XCH.getDossierNo());
		vrTechnicalSpec_XCHImpl.setReferenceUid(vrTechnicalSpec_XCH.getReferenceUid());
		vrTechnicalSpec_XCHImpl.setDossierIdCTN(vrTechnicalSpec_XCH.getDossierIdCTN());
		vrTechnicalSpec_XCHImpl.setDeliverableCode(vrTechnicalSpec_XCH.getDeliverableCode());
		vrTechnicalSpec_XCHImpl.setVehicleTypeCertificateId(vrTechnicalSpec_XCH.getVehicleTypeCertificateId());
		vrTechnicalSpec_XCHImpl.setXCH01001(vrTechnicalSpec_XCH.getXCH01001());
		vrTechnicalSpec_XCHImpl.setXCH01002(vrTechnicalSpec_XCH.getXCH01002());
		vrTechnicalSpec_XCHImpl.setXCH01003(vrTechnicalSpec_XCH.getXCH01003());
		vrTechnicalSpec_XCHImpl.setXCH01004(vrTechnicalSpec_XCH.getXCH01004());
		vrTechnicalSpec_XCHImpl.setXCH01005(vrTechnicalSpec_XCH.getXCH01005());
		vrTechnicalSpec_XCHImpl.setXCH01006(vrTechnicalSpec_XCH.getXCH01006());
		vrTechnicalSpec_XCHImpl.setXCH01007(vrTechnicalSpec_XCH.getXCH01007());
		vrTechnicalSpec_XCHImpl.setXCH01008(vrTechnicalSpec_XCH.getXCH01008());
		vrTechnicalSpec_XCHImpl.setXCH01009(vrTechnicalSpec_XCH.getXCH01009());
		vrTechnicalSpec_XCHImpl.setXCH01010(vrTechnicalSpec_XCH.getXCH01010());
		vrTechnicalSpec_XCHImpl.setXCH01011(vrTechnicalSpec_XCH.getXCH01011());
		vrTechnicalSpec_XCHImpl.setXCH01012(vrTechnicalSpec_XCH.getXCH01012());
		vrTechnicalSpec_XCHImpl.setXCH01013(vrTechnicalSpec_XCH.getXCH01013());
		vrTechnicalSpec_XCHImpl.setXCH01014(vrTechnicalSpec_XCH.getXCH01014());
		vrTechnicalSpec_XCHImpl.setXCH01016(vrTechnicalSpec_XCH.getXCH01016());
		vrTechnicalSpec_XCHImpl.setXCH01017(vrTechnicalSpec_XCH.getXCH01017());
		vrTechnicalSpec_XCHImpl.setXCH01019(vrTechnicalSpec_XCH.getXCH01019());
		vrTechnicalSpec_XCHImpl.setXCH01020(vrTechnicalSpec_XCH.getXCH01020());
		vrTechnicalSpec_XCHImpl.setXCH01021(vrTechnicalSpec_XCH.getXCH01021());
		vrTechnicalSpec_XCHImpl.setXCH01022(vrTechnicalSpec_XCH.getXCH01022());
		vrTechnicalSpec_XCHImpl.setXCH01024(vrTechnicalSpec_XCH.getXCH01024());
		vrTechnicalSpec_XCHImpl.setXCH01025(vrTechnicalSpec_XCH.getXCH01025());
		vrTechnicalSpec_XCHImpl.setXCH01026(vrTechnicalSpec_XCH.getXCH01026());
		vrTechnicalSpec_XCHImpl.setXCH01027(vrTechnicalSpec_XCH.getXCH01027());
		vrTechnicalSpec_XCHImpl.setXCH01028(vrTechnicalSpec_XCH.getXCH01028());
		vrTechnicalSpec_XCHImpl.setXCH01030(vrTechnicalSpec_XCH.getXCH01030());
		vrTechnicalSpec_XCHImpl.setXCH01031(vrTechnicalSpec_XCH.getXCH01031());
		vrTechnicalSpec_XCHImpl.setXCH01032(vrTechnicalSpec_XCH.getXCH01032());
		vrTechnicalSpec_XCHImpl.setXCH01033(vrTechnicalSpec_XCH.getXCH01033());
		vrTechnicalSpec_XCHImpl.setXCH01034(vrTechnicalSpec_XCH.getXCH01034());
		vrTechnicalSpec_XCHImpl.setXCH01035(vrTechnicalSpec_XCH.getXCH01035());
		vrTechnicalSpec_XCHImpl.setXCH01036(vrTechnicalSpec_XCH.getXCH01036());
		vrTechnicalSpec_XCHImpl.setXCH01037(vrTechnicalSpec_XCH.getXCH01037());
		vrTechnicalSpec_XCHImpl.setXCH01038(vrTechnicalSpec_XCH.getXCH01038());
		vrTechnicalSpec_XCHImpl.setXCH01039(vrTechnicalSpec_XCH.getXCH01039());
		vrTechnicalSpec_XCHImpl.setXCH01040(vrTechnicalSpec_XCH.getXCH01040());
		vrTechnicalSpec_XCHImpl.setXCH01041(vrTechnicalSpec_XCH.getXCH01041());
		vrTechnicalSpec_XCHImpl.setXCH01042(vrTechnicalSpec_XCH.getXCH01042());
		vrTechnicalSpec_XCHImpl.setXCH01043(vrTechnicalSpec_XCH.getXCH01043());
		vrTechnicalSpec_XCHImpl.setXCH01044(vrTechnicalSpec_XCH.getXCH01044());
		vrTechnicalSpec_XCHImpl.setXCH01045(vrTechnicalSpec_XCH.getXCH01045());
		vrTechnicalSpec_XCHImpl.setXCH01046(vrTechnicalSpec_XCH.getXCH01046());
		vrTechnicalSpec_XCHImpl.setXCH01047(vrTechnicalSpec_XCH.getXCH01047());
		vrTechnicalSpec_XCHImpl.setXCH01049(vrTechnicalSpec_XCH.getXCH01049());
		vrTechnicalSpec_XCHImpl.setXCH01050(vrTechnicalSpec_XCH.getXCH01050());
		vrTechnicalSpec_XCHImpl.setXCH01051(vrTechnicalSpec_XCH.getXCH01051());
		vrTechnicalSpec_XCHImpl.setXCH01052(vrTechnicalSpec_XCH.getXCH01052());
		vrTechnicalSpec_XCHImpl.setXCH01053(vrTechnicalSpec_XCH.getXCH01053());
		vrTechnicalSpec_XCHImpl.setXCH01054(vrTechnicalSpec_XCH.getXCH01054());
		vrTechnicalSpec_XCHImpl.setXCH01055(vrTechnicalSpec_XCH.getXCH01055());
		vrTechnicalSpec_XCHImpl.setXCH01056(vrTechnicalSpec_XCH.getXCH01056());
		vrTechnicalSpec_XCHImpl.setXCH01057(vrTechnicalSpec_XCH.getXCH01057());
		vrTechnicalSpec_XCHImpl.setXCH01058(vrTechnicalSpec_XCH.getXCH01058());
		vrTechnicalSpec_XCHImpl.setXCH01059(vrTechnicalSpec_XCH.getXCH01059());
		vrTechnicalSpec_XCHImpl.setXCH01060(vrTechnicalSpec_XCH.getXCH01060());
		vrTechnicalSpec_XCHImpl.setXCH01062(vrTechnicalSpec_XCH.getXCH01062());
		vrTechnicalSpec_XCHImpl.setXCH01063(vrTechnicalSpec_XCH.getXCH01063());
		vrTechnicalSpec_XCHImpl.setXCH01064(vrTechnicalSpec_XCH.getXCH01064());
		vrTechnicalSpec_XCHImpl.setXCH01065(vrTechnicalSpec_XCH.getXCH01065());
		vrTechnicalSpec_XCHImpl.setXCH01066(vrTechnicalSpec_XCH.getXCH01066());
		vrTechnicalSpec_XCHImpl.setXCH01067(vrTechnicalSpec_XCH.getXCH01067());
		vrTechnicalSpec_XCHImpl.setXCH01068(vrTechnicalSpec_XCH.getXCH01068());
		vrTechnicalSpec_XCHImpl.setXCH01069(vrTechnicalSpec_XCH.getXCH01069());
		vrTechnicalSpec_XCHImpl.setXCH01100(vrTechnicalSpec_XCH.getXCH01100());
		vrTechnicalSpec_XCHImpl.setXCH01101(vrTechnicalSpec_XCH.getXCH01101());
		vrTechnicalSpec_XCHImpl.setXCH01102(vrTechnicalSpec_XCH.getXCH01102());
		vrTechnicalSpec_XCHImpl.setXCH01103(vrTechnicalSpec_XCH.getXCH01103());
		vrTechnicalSpec_XCHImpl.setXCH01104(vrTechnicalSpec_XCH.getXCH01104());
		vrTechnicalSpec_XCHImpl.setXCH01105(vrTechnicalSpec_XCH.getXCH01105());
		vrTechnicalSpec_XCHImpl.setXCH01106(vrTechnicalSpec_XCH.getXCH01106());
		vrTechnicalSpec_XCHImpl.setXCH01107(vrTechnicalSpec_XCH.getXCH01107());
		vrTechnicalSpec_XCHImpl.setXCH01108(vrTechnicalSpec_XCH.getXCH01108());
		vrTechnicalSpec_XCHImpl.setXCH01109(vrTechnicalSpec_XCH.getXCH01109());
		vrTechnicalSpec_XCHImpl.setXCH01110(vrTechnicalSpec_XCH.getXCH01110());
		vrTechnicalSpec_XCHImpl.setXCH01111(vrTechnicalSpec_XCH.getXCH01111());
		vrTechnicalSpec_XCHImpl.setXCH01112(vrTechnicalSpec_XCH.getXCH01112());
		vrTechnicalSpec_XCHImpl.setXCH01113(vrTechnicalSpec_XCH.getXCH01113());
		vrTechnicalSpec_XCHImpl.setXCH01114(vrTechnicalSpec_XCH.getXCH01114());
		vrTechnicalSpec_XCHImpl.setXCH01115(vrTechnicalSpec_XCH.getXCH01115());
		vrTechnicalSpec_XCHImpl.setXCH01116(vrTechnicalSpec_XCH.getXCH01116());
		vrTechnicalSpec_XCHImpl.setXCH01117(vrTechnicalSpec_XCH.getXCH01117());
		vrTechnicalSpec_XCHImpl.setXCH01118(vrTechnicalSpec_XCH.getXCH01118());
		vrTechnicalSpec_XCHImpl.setXCH01119(vrTechnicalSpec_XCH.getXCH01119());
		vrTechnicalSpec_XCHImpl.setXCH01120(vrTechnicalSpec_XCH.getXCH01120());
		vrTechnicalSpec_XCHImpl.setXCH01121(vrTechnicalSpec_XCH.getXCH01121());
		vrTechnicalSpec_XCHImpl.setXCH01122(vrTechnicalSpec_XCH.getXCH01122());
		vrTechnicalSpec_XCHImpl.setXCH01123(vrTechnicalSpec_XCH.getXCH01123());
		vrTechnicalSpec_XCHImpl.setXCH01124(vrTechnicalSpec_XCH.getXCH01124());
		vrTechnicalSpec_XCHImpl.setXCH01125(vrTechnicalSpec_XCH.getXCH01125());
		vrTechnicalSpec_XCHImpl.setXCH01126(vrTechnicalSpec_XCH.getXCH01126());
		vrTechnicalSpec_XCHImpl.setXCH01127(vrTechnicalSpec_XCH.getXCH01127());
		vrTechnicalSpec_XCHImpl.setXCH01128(vrTechnicalSpec_XCH.getXCH01128());
		vrTechnicalSpec_XCHImpl.setXCH01129(vrTechnicalSpec_XCH.getXCH01129());
		vrTechnicalSpec_XCHImpl.setXCH01130(vrTechnicalSpec_XCH.getXCH01130());
		vrTechnicalSpec_XCHImpl.setXCH01131(vrTechnicalSpec_XCH.getXCH01131());
		vrTechnicalSpec_XCHImpl.setXCH01132(vrTechnicalSpec_XCH.getXCH01132());
		vrTechnicalSpec_XCHImpl.setXCH01133(vrTechnicalSpec_XCH.getXCH01133());
		vrTechnicalSpec_XCHImpl.setXCH01134(vrTechnicalSpec_XCH.getXCH01134());
		vrTechnicalSpec_XCHImpl.setXCH01135(vrTechnicalSpec_XCH.getXCH01135());
		vrTechnicalSpec_XCHImpl.setXCH01136(vrTechnicalSpec_XCH.getXCH01136());
		vrTechnicalSpec_XCHImpl.setXCH01137(vrTechnicalSpec_XCH.getXCH01137());
		vrTechnicalSpec_XCHImpl.setXCH01138(vrTechnicalSpec_XCH.getXCH01138());
		vrTechnicalSpec_XCHImpl.setXCH01139(vrTechnicalSpec_XCH.getXCH01139());
		vrTechnicalSpec_XCHImpl.setXCH01140(vrTechnicalSpec_XCH.getXCH01140());
		vrTechnicalSpec_XCHImpl.setXCH01141(vrTechnicalSpec_XCH.getXCH01141());
		vrTechnicalSpec_XCHImpl.setXCH01142(vrTechnicalSpec_XCH.getXCH01142());
		vrTechnicalSpec_XCHImpl.setXCH01143(vrTechnicalSpec_XCH.getXCH01143());
		vrTechnicalSpec_XCHImpl.setXCH01144(vrTechnicalSpec_XCH.getXCH01144());
		vrTechnicalSpec_XCHImpl.setXCH01145(vrTechnicalSpec_XCH.getXCH01145());
		vrTechnicalSpec_XCHImpl.setXCH01146(vrTechnicalSpec_XCH.getXCH01146());
		vrTechnicalSpec_XCHImpl.setXCH01147(vrTechnicalSpec_XCH.getXCH01147());
		vrTechnicalSpec_XCHImpl.setXCH01148(vrTechnicalSpec_XCH.getXCH01148());
		vrTechnicalSpec_XCHImpl.setXCH01149(vrTechnicalSpec_XCH.getXCH01149());
		vrTechnicalSpec_XCHImpl.setXCH01150(vrTechnicalSpec_XCH.getXCH01150());
		vrTechnicalSpec_XCHImpl.setXCH01151(vrTechnicalSpec_XCH.getXCH01151());
		vrTechnicalSpec_XCHImpl.setXCH01152(vrTechnicalSpec_XCH.getXCH01152());
		vrTechnicalSpec_XCHImpl.setXCH01153(vrTechnicalSpec_XCH.getXCH01153());
		vrTechnicalSpec_XCHImpl.setXCH01154(vrTechnicalSpec_XCH.getXCH01154());
		vrTechnicalSpec_XCHImpl.setXCH01155(vrTechnicalSpec_XCH.getXCH01155());
		vrTechnicalSpec_XCHImpl.setXCH01156(vrTechnicalSpec_XCH.getXCH01156());
		vrTechnicalSpec_XCHImpl.setXCH01157(vrTechnicalSpec_XCH.getXCH01157());
		vrTechnicalSpec_XCHImpl.setXCH01158(vrTechnicalSpec_XCH.getXCH01158());
		vrTechnicalSpec_XCHImpl.setXCH01159(vrTechnicalSpec_XCH.getXCH01159());
		vrTechnicalSpec_XCHImpl.setXCH01160(vrTechnicalSpec_XCH.getXCH01160());
		vrTechnicalSpec_XCHImpl.setXCH01161(vrTechnicalSpec_XCH.getXCH01161());
		vrTechnicalSpec_XCHImpl.setXCH01162(vrTechnicalSpec_XCH.getXCH01162());
		vrTechnicalSpec_XCHImpl.setXCH01163(vrTechnicalSpec_XCH.getXCH01163());
		vrTechnicalSpec_XCHImpl.setXCH01164(vrTechnicalSpec_XCH.getXCH01164());
		vrTechnicalSpec_XCHImpl.setXCH01165(vrTechnicalSpec_XCH.getXCH01165());
		vrTechnicalSpec_XCHImpl.setXCH01166(vrTechnicalSpec_XCH.getXCH01166());
		vrTechnicalSpec_XCHImpl.setXCH01167(vrTechnicalSpec_XCH.getXCH01167());
		vrTechnicalSpec_XCHImpl.setXCH01168(vrTechnicalSpec_XCH.getXCH01168());
		vrTechnicalSpec_XCHImpl.setXCH01169(vrTechnicalSpec_XCH.getXCH01169());
		vrTechnicalSpec_XCHImpl.setXCH01170(vrTechnicalSpec_XCH.getXCH01170());
		vrTechnicalSpec_XCHImpl.setXCH01171(vrTechnicalSpec_XCH.getXCH01171());
		vrTechnicalSpec_XCHImpl.setXCH01172(vrTechnicalSpec_XCH.getXCH01172());
		vrTechnicalSpec_XCHImpl.setXCH01173(vrTechnicalSpec_XCH.getXCH01173());
		vrTechnicalSpec_XCHImpl.setXCH01174(vrTechnicalSpec_XCH.getXCH01174());
		vrTechnicalSpec_XCHImpl.setXCH01175(vrTechnicalSpec_XCH.getXCH01175());
		vrTechnicalSpec_XCHImpl.setXCH01176(vrTechnicalSpec_XCH.getXCH01176());
		vrTechnicalSpec_XCHImpl.setXCH01177(vrTechnicalSpec_XCH.getXCH01177());
		vrTechnicalSpec_XCHImpl.setXCH01178(vrTechnicalSpec_XCH.getXCH01178());
		vrTechnicalSpec_XCHImpl.setXCH01179(vrTechnicalSpec_XCH.getXCH01179());
		vrTechnicalSpec_XCHImpl.setXCH01180(vrTechnicalSpec_XCH.getXCH01180());
		vrTechnicalSpec_XCHImpl.setXCH01181(vrTechnicalSpec_XCH.getXCH01181());
		vrTechnicalSpec_XCHImpl.setXCH01182(vrTechnicalSpec_XCH.getXCH01182());
		vrTechnicalSpec_XCHImpl.setXCH01183(vrTechnicalSpec_XCH.getXCH01183());
		vrTechnicalSpec_XCHImpl.setXCH01184(vrTechnicalSpec_XCH.getXCH01184());
		vrTechnicalSpec_XCHImpl.setXCH01185(vrTechnicalSpec_XCH.getXCH01185());
		vrTechnicalSpec_XCHImpl.setXCH01186(vrTechnicalSpec_XCH.getXCH01186());
		vrTechnicalSpec_XCHImpl.setXCH01187(vrTechnicalSpec_XCH.getXCH01187());
		vrTechnicalSpec_XCHImpl.setXCH01188(vrTechnicalSpec_XCH.getXCH01188());
		vrTechnicalSpec_XCHImpl.setXCH01189(vrTechnicalSpec_XCH.getXCH01189());
		vrTechnicalSpec_XCHImpl.setXCH01190(vrTechnicalSpec_XCH.getXCH01190());
		vrTechnicalSpec_XCHImpl.setXCH01191(vrTechnicalSpec_XCH.getXCH01191());
		vrTechnicalSpec_XCHImpl.setXCH01192(vrTechnicalSpec_XCH.getXCH01192());
		vrTechnicalSpec_XCHImpl.setXCH01193(vrTechnicalSpec_XCH.getXCH01193());
		vrTechnicalSpec_XCHImpl.setXCH01194(vrTechnicalSpec_XCH.getXCH01194());
		vrTechnicalSpec_XCHImpl.setXCH01195(vrTechnicalSpec_XCH.getXCH01195());
		vrTechnicalSpec_XCHImpl.setXCH01196(vrTechnicalSpec_XCH.getXCH01196());
		vrTechnicalSpec_XCHImpl.setXCH01197(vrTechnicalSpec_XCH.getXCH01197());
		vrTechnicalSpec_XCHImpl.setXCH01198(vrTechnicalSpec_XCH.getXCH01198());
		vrTechnicalSpec_XCHImpl.setXCH01199(vrTechnicalSpec_XCH.getXCH01199());
		vrTechnicalSpec_XCHImpl.setXCH01200(vrTechnicalSpec_XCH.getXCH01200());
		vrTechnicalSpec_XCHImpl.setXCH01201(vrTechnicalSpec_XCH.getXCH01201());
		vrTechnicalSpec_XCHImpl.setXCH01202(vrTechnicalSpec_XCH.getXCH01202());
		vrTechnicalSpec_XCHImpl.setXCH01203(vrTechnicalSpec_XCH.getXCH01203());
		vrTechnicalSpec_XCHImpl.setXCH01204(vrTechnicalSpec_XCH.getXCH01204());
		vrTechnicalSpec_XCHImpl.setXCH01205(vrTechnicalSpec_XCH.getXCH01205());
		vrTechnicalSpec_XCHImpl.setXCH01206(vrTechnicalSpec_XCH.getXCH01206());
		vrTechnicalSpec_XCHImpl.setXCH01207(vrTechnicalSpec_XCH.getXCH01207());
		vrTechnicalSpec_XCHImpl.setXCH01208(vrTechnicalSpec_XCH.getXCH01208());
		vrTechnicalSpec_XCHImpl.setXCH01209(vrTechnicalSpec_XCH.getXCH01209());
		vrTechnicalSpec_XCHImpl.setXCH01210(vrTechnicalSpec_XCH.getXCH01210());
		vrTechnicalSpec_XCHImpl.setXCH01211(vrTechnicalSpec_XCH.getXCH01211());
		vrTechnicalSpec_XCHImpl.setXCH01212(vrTechnicalSpec_XCH.getXCH01212());
		vrTechnicalSpec_XCHImpl.setXCH01213(vrTechnicalSpec_XCH.getXCH01213());
		vrTechnicalSpec_XCHImpl.setXCH01214(vrTechnicalSpec_XCH.getXCH01214());
		vrTechnicalSpec_XCHImpl.setXCH01215(vrTechnicalSpec_XCH.getXCH01215());
		vrTechnicalSpec_XCHImpl.setXCH01216(vrTechnicalSpec_XCH.getXCH01216());
		vrTechnicalSpec_XCHImpl.setXCH01217(vrTechnicalSpec_XCH.getXCH01217());
		vrTechnicalSpec_XCHImpl.setXCH01218(vrTechnicalSpec_XCH.getXCH01218());
		vrTechnicalSpec_XCHImpl.setXCH01219(vrTechnicalSpec_XCH.getXCH01219());
		vrTechnicalSpec_XCHImpl.setXCH01220(vrTechnicalSpec_XCH.getXCH01220());
		vrTechnicalSpec_XCHImpl.setXCH01221(vrTechnicalSpec_XCH.getXCH01221());
		vrTechnicalSpec_XCHImpl.setXCH01222(vrTechnicalSpec_XCH.getXCH01222());
		vrTechnicalSpec_XCHImpl.setXCH01223(vrTechnicalSpec_XCH.getXCH01223());
		vrTechnicalSpec_XCHImpl.setXCH01224(vrTechnicalSpec_XCH.getXCH01224());
		vrTechnicalSpec_XCHImpl.setXCH01225(vrTechnicalSpec_XCH.getXCH01225());
		vrTechnicalSpec_XCHImpl.setXCH01226(vrTechnicalSpec_XCH.getXCH01226());
		vrTechnicalSpec_XCHImpl.setXCH01227(vrTechnicalSpec_XCH.getXCH01227());
		vrTechnicalSpec_XCHImpl.setXCH01228(vrTechnicalSpec_XCH.getXCH01228());
		vrTechnicalSpec_XCHImpl.setXCH01229(vrTechnicalSpec_XCH.getXCH01229());
		vrTechnicalSpec_XCHImpl.setXCH01230(vrTechnicalSpec_XCH.getXCH01230());
		vrTechnicalSpec_XCHImpl.setXCH01231(vrTechnicalSpec_XCH.getXCH01231());
		vrTechnicalSpec_XCHImpl.setXCH01232(vrTechnicalSpec_XCH.getXCH01232());
		vrTechnicalSpec_XCHImpl.setXCH01233(vrTechnicalSpec_XCH.getXCH01233());
		vrTechnicalSpec_XCHImpl.setXCH01234(vrTechnicalSpec_XCH.getXCH01234());
		vrTechnicalSpec_XCHImpl.setXCH01235(vrTechnicalSpec_XCH.getXCH01235());
		vrTechnicalSpec_XCHImpl.setXCH01236(vrTechnicalSpec_XCH.getXCH01236());
		vrTechnicalSpec_XCHImpl.setXCH01237(vrTechnicalSpec_XCH.getXCH01237());
		vrTechnicalSpec_XCHImpl.setXCH01238(vrTechnicalSpec_XCH.getXCH01238());
		vrTechnicalSpec_XCHImpl.setXCH01239(vrTechnicalSpec_XCH.getXCH01239());
		vrTechnicalSpec_XCHImpl.setXCH01240(vrTechnicalSpec_XCH.getXCH01240());
		vrTechnicalSpec_XCHImpl.setXCH01241(vrTechnicalSpec_XCH.getXCH01241());
		vrTechnicalSpec_XCHImpl.setXCH01242(vrTechnicalSpec_XCH.getXCH01242());
		vrTechnicalSpec_XCHImpl.setXCH01243(vrTechnicalSpec_XCH.getXCH01243());
		vrTechnicalSpec_XCHImpl.setXCH01244(vrTechnicalSpec_XCH.getXCH01244());
		vrTechnicalSpec_XCHImpl.setXCH01245(vrTechnicalSpec_XCH.getXCH01245());
		vrTechnicalSpec_XCHImpl.setXCH01246(vrTechnicalSpec_XCH.getXCH01246());
		vrTechnicalSpec_XCHImpl.setXCH01247(vrTechnicalSpec_XCH.getXCH01247());
		vrTechnicalSpec_XCHImpl.setXCH01248(vrTechnicalSpec_XCH.getXCH01248());
		vrTechnicalSpec_XCHImpl.setXCH01249(vrTechnicalSpec_XCH.getXCH01249());
		vrTechnicalSpec_XCHImpl.setXCH01250(vrTechnicalSpec_XCH.getXCH01250());
		vrTechnicalSpec_XCHImpl.setXCH01251(vrTechnicalSpec_XCH.getXCH01251());
		vrTechnicalSpec_XCHImpl.setXCH01252(vrTechnicalSpec_XCH.getXCH01252());
		vrTechnicalSpec_XCHImpl.setXCH01253(vrTechnicalSpec_XCH.getXCH01253());
		vrTechnicalSpec_XCHImpl.setXCH01254(vrTechnicalSpec_XCH.getXCH01254());
		vrTechnicalSpec_XCHImpl.setXCH01255(vrTechnicalSpec_XCH.getXCH01255());
		vrTechnicalSpec_XCHImpl.setXCH01256(vrTechnicalSpec_XCH.getXCH01256());
		vrTechnicalSpec_XCHImpl.setXCH01257(vrTechnicalSpec_XCH.getXCH01257());
		vrTechnicalSpec_XCHImpl.setXCH01258(vrTechnicalSpec_XCH.getXCH01258());
		vrTechnicalSpec_XCHImpl.setXCH01259(vrTechnicalSpec_XCH.getXCH01259());
		vrTechnicalSpec_XCHImpl.setXCH01260(vrTechnicalSpec_XCH.getXCH01260());
		vrTechnicalSpec_XCHImpl.setXCH01261(vrTechnicalSpec_XCH.getXCH01261());
		vrTechnicalSpec_XCHImpl.setXCH01262(vrTechnicalSpec_XCH.getXCH01262());
		vrTechnicalSpec_XCHImpl.setXCH01263(vrTechnicalSpec_XCH.getXCH01263());
		vrTechnicalSpec_XCHImpl.setXCH01264(vrTechnicalSpec_XCH.getXCH01264());
		vrTechnicalSpec_XCHImpl.setXCH01265(vrTechnicalSpec_XCH.getXCH01265());
		vrTechnicalSpec_XCHImpl.setXCH01266(vrTechnicalSpec_XCH.getXCH01266());
		vrTechnicalSpec_XCHImpl.setXCH01267(vrTechnicalSpec_XCH.getXCH01267());
		vrTechnicalSpec_XCHImpl.setXCH01268(vrTechnicalSpec_XCH.getXCH01268());
		vrTechnicalSpec_XCHImpl.setXCH01269(vrTechnicalSpec_XCH.getXCH01269());
		vrTechnicalSpec_XCHImpl.setXCH01270(vrTechnicalSpec_XCH.getXCH01270());
		vrTechnicalSpec_XCHImpl.setXCH01271(vrTechnicalSpec_XCH.getXCH01271());
		vrTechnicalSpec_XCHImpl.setXCH01272(vrTechnicalSpec_XCH.getXCH01272());
		vrTechnicalSpec_XCHImpl.setModifyDate(vrTechnicalSpec_XCH.getModifyDate());
		vrTechnicalSpec_XCHImpl.setSyncDate(vrTechnicalSpec_XCH.getSyncDate());

		return vrTechnicalSpec_XCHImpl;
	}

	/**
	 * Returns the vr technical spec_xch with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xch
	 * @return the vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCHException {
		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XCH == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XCHException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XCH;
	}

	/**
	 * Returns the vr technical spec_xch with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCHException} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xch
	 * @return the vr technical spec_xch
	 * @throws NoSuchVRTechnicalSpec_XCHException if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCHException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xch
	 * @return the vr technical spec_xch, or <code>null</code> if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCHImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XCH vrTechnicalSpec_XCH = (VRTechnicalSpec_XCH)serializable;

		if (vrTechnicalSpec_XCH == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XCH = (VRTechnicalSpec_XCH)session.get(VRTechnicalSpec_XCHImpl.class,
						primaryKey);

				if (vrTechnicalSpec_XCH != null) {
					cacheResult(vrTechnicalSpec_XCH);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCHImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCHImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XCH;
	}

	/**
	 * Returns the vr technical spec_xch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xch
	 * @return the vr technical spec_xch, or <code>null</code> if a vr technical spec_xch with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCH fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XCH> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XCH> map = new HashMap<Serializable, VRTechnicalSpec_XCH>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XCH vrTechnicalSpec_XCH = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XCH != null) {
				map.put(primaryKey, vrTechnicalSpec_XCH);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCHImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XCH)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : (List<VRTechnicalSpec_XCH>)q.list()) {
				map.put(vrTechnicalSpec_XCH.getPrimaryKeyObj(),
					vrTechnicalSpec_XCH);

				cacheResult(vrTechnicalSpec_XCH);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XCH.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XCHModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCHImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xchs.
	 *
	 * @return the vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @return the range of vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xchs
	 * @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xchs
	 */
	@Override
	public List<VRTechnicalSpec_XCH> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCH> orderByComparator,
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

		List<VRTechnicalSpec_XCH> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCH>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XCH;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XCHModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCH>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xchs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XCH vrTechnicalSpec_XCH : findAll()) {
			remove(vrTechnicalSpec_XCH);
		}
	}

	/**
	 * Returns the number of vr technical spec_xchs.
	 *
	 * @return the number of vr technical spec_xchs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XCH);

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
		return VRTechnicalSpec_XCHModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xch persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XCHImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCH = "SELECT vrTechnicalSpec_XCH FROM VRTechnicalSpec_XCH vrTechnicalSpec_XCH";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE_PKS_IN = "SELECT vrTechnicalSpec_XCH FROM VRTechnicalSpec_XCH vrTechnicalSpec_XCH WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCH_WHERE = "SELECT vrTechnicalSpec_XCH FROM VRTechnicalSpec_XCH vrTechnicalSpec_XCH WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCH = "SELECT COUNT(vrTechnicalSpec_XCH) FROM VRTechnicalSpec_XCH vrTechnicalSpec_XCH";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCH_WHERE = "SELECT COUNT(vrTechnicalSpec_XCH) FROM VRTechnicalSpec_XCH vrTechnicalSpec_XCH WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XCH.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XCH exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XCH exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCHPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}