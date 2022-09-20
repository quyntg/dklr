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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XDDException;
import com.fds.vr.business.model.VRTechnicalSpec_XDD;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XDDImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XDDModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XDDPersistence;

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
 * The persistence implementation for the vr technical spec_xdd service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XDDPersistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XDDUtil
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XDDPersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XDD>
	implements VRTechnicalSpec_XDDPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XDDUtil} to access the vr technical spec_xdd persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XDDImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XDDModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xdds where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XDD.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XDD.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
				query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xdd in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xdd in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		List<VRTechnicalSpec_XDD> list = findByDossierNo(dossierNo, mtCore, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XDD> list = findByDossierNo(dossierNo, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xdds before and after the current vr technical spec_xdd in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xdd
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD[] array = new VRTechnicalSpec_XDDImpl[3];

			array[0] = getByDossierNo_PrevAndNext(session, vrTechnicalSpec_XDD,
					dossierNo, mtCore, orderByComparator, true);

			array[1] = vrTechnicalSpec_XDD;

			array[2] = getByDossierNo_PrevAndNext(session, vrTechnicalSpec_XDD,
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

	protected VRTechnicalSpec_XDD getByDossierNo_PrevAndNext(Session session,
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD, String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
			query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XDD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XDD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xdds where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xdds
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XDD.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XDD.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XDD.dossierNo IS NULL OR vrTechnicalSpec_XDD.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XDD.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XDDModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xdds where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierIdCTN(String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierIdCTN(String dossierIdCTN,
		int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XDD.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
				query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xdd in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByDossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xdd in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByDossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		List<VRTechnicalSpec_XDD> list = findByDossierIdCTN(dossierIdCTN, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XDD> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xdds before and after the current vr technical spec_xdd in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xdd
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD[] array = new VRTechnicalSpec_XDDImpl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XDD, dossierIdCTN, orderByComparator, true);

			array[1] = vrTechnicalSpec_XDD;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XDD, dossierIdCTN, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XDD getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XDD vrTechnicalSpec_XDD,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
			query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XDD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XDD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xdds where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xdds
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XDD.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XDD.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XDD.dossierIdCTN IS NULL OR vrTechnicalSpec_XDD.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XDDModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xdds where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XDD.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
				query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xdd in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xdd in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		List<VRTechnicalSpec_XDD> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XDD> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xdds before and after the current vr technical spec_xdd in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xdd
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD[] findByDeliverableCode_PrevAndNext(long id,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD[] array = new VRTechnicalSpec_XDDImpl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XDD, deliverableCode, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XDD;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XDD, deliverableCode, orderByComparator,
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

	protected VRTechnicalSpec_XDD getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XDD vrTechnicalSpec_XDD,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
			query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XDD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XDD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xdds where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xdds
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE);

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
		"vrTechnicalSpec_XDD.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XDD.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XDD.deliverableCode IS NULL OR vrTechnicalSpec_XDD.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XDDModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xdds where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierId(long dossierId, long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : list) {
					if ((dossierId != vrTechnicalSpec_XDD.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XDD.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xdd in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xdd in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		List<VRTechnicalSpec_XDD> list = findByDossierId(dossierId, mtCore, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XDD> list = findByDossierId(dossierId, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xdds before and after the current vr technical spec_xdd in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xdd
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD[] array = new VRTechnicalSpec_XDDImpl[3];

			array[0] = getByDossierId_PrevAndNext(session, vrTechnicalSpec_XDD,
					dossierId, mtCore, orderByComparator, true);

			array[1] = vrTechnicalSpec_XDD;

			array[2] = getByDossierId_PrevAndNext(session, vrTechnicalSpec_XDD,
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

	protected VRTechnicalSpec_XDD getByDossierId_PrevAndNext(Session session,
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD, long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
			query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XDD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XDD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xdds where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xdds
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XDD.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XDD.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XDDModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xdds where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : list) {
					if ((dossierId != vrTechnicalSpec_XDD.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xdd in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xdd in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		List<VRTechnicalSpec_XDD> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XDD> list = findBy_DossierId(dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xdds before and after the current vr technical spec_xdd in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xdd
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD[] findBy_DossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD[] array = new VRTechnicalSpec_XDDImpl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XDD, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XDD;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XDD, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XDD getBy_DossierId_PrevAndNext(Session session,
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD, long dossierId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
			query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XDD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XDD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xdds where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xdds
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XDD.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XDDModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xdds where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : list) {
					if ((convertAssembleId != vrTechnicalSpec_XDD.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xdd in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xdd in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		List<VRTechnicalSpec_XDD> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XDD> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xdds before and after the current vr technical spec_xdd in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xdd
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD[] findByConvertAssembleId_PrevAndNext(long id,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD[] array = new VRTechnicalSpec_XDDImpl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XDD, convertAssembleId, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XDD;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XDD, convertAssembleId, orderByComparator,
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

	protected VRTechnicalSpec_XDD getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XDD vrTechnicalSpec_XDD,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
			query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XDD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XDD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xdds where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xdds
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE);

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
		"vrTechnicalSpec_XDD.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XDDModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xdds where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByReferenceUid(String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByReferenceUid(String referenceUid,
		int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XDD.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
				query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xdd in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByReferenceUid_First(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xdd in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByReferenceUid_First(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		List<VRTechnicalSpec_XDD> list = findByReferenceUid(referenceUid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XDD> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xdds before and after the current vr technical spec_xdd in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xdd
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD[] array = new VRTechnicalSpec_XDDImpl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XDD, referenceUid, orderByComparator, true);

			array[1] = vrTechnicalSpec_XDD;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XDD, referenceUid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XDD getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XDD vrTechnicalSpec_XDD,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
			query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XDD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XDD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xdds where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xdds
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XDD.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XDD.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XDD.referenceUid IS NULL OR vrTechnicalSpec_XDD.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XDDModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XDDModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xdds where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XDD.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xdd in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xdd in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		List<VRTechnicalSpec_XDD> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XDD != null) {
			return vrTechnicalSpec_XDD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XDDException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xdd in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xdd, or <code>null</code> if a matching vr technical spec_xdd could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XDD> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xdds before and after the current vr technical spec_xdd in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xdd
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD[] array = new VRTechnicalSpec_XDDImpl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XDD, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XDD;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XDD, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XDD getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XDD vrTechnicalSpec_XDD,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE);

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
			query.append(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XDD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XDD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xdds where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xdds
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE);

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
		"vrTechnicalSpec_XDD.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XDDPersistenceImpl() {
		setModelClass(VRTechnicalSpec_XDD.class);
	}

	/**
	 * Caches the vr technical spec_xdd in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XDD the vr technical spec_xdd
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		entityCache.putResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class, vrTechnicalSpec_XDD.getPrimaryKey(),
			vrTechnicalSpec_XDD);

		vrTechnicalSpec_XDD.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xdds in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XDDs the vr technical spec_xdds
	 */
	@Override
	public void cacheResult(List<VRTechnicalSpec_XDD> vrTechnicalSpec_XDDs) {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : vrTechnicalSpec_XDDs) {
			if (entityCache.getResult(
						VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XDDImpl.class,
						vrTechnicalSpec_XDD.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XDD);
			}
			else {
				vrTechnicalSpec_XDD.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xdds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XDDImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xdd.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		entityCache.removeResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class, vrTechnicalSpec_XDD.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRTechnicalSpec_XDD> vrTechnicalSpec_XDDs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : vrTechnicalSpec_XDDs) {
			entityCache.removeResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XDDImpl.class,
				vrTechnicalSpec_XDD.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xdd with the primary key. Does not add the vr technical spec_xdd to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xdd
	 * @return the new vr technical spec_xdd
	 */
	@Override
	public VRTechnicalSpec_XDD create(long id) {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = new VRTechnicalSpec_XDDImpl();

		vrTechnicalSpec_XDD.setNew(true);
		vrTechnicalSpec_XDD.setPrimaryKey(id);

		return vrTechnicalSpec_XDD;
	}

	/**
	 * Removes the vr technical spec_xdd with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xdd
	 * @return the vr technical spec_xdd that was removed
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD remove(long id)
		throws NoSuchVRTechnicalSpec_XDDException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xdd with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xdd
	 * @return the vr technical spec_xdd that was removed
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XDDException {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XDD vrTechnicalSpec_XDD = (VRTechnicalSpec_XDD)session.get(VRTechnicalSpec_XDDImpl.class,
					primaryKey);

			if (vrTechnicalSpec_XDD == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XDDException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XDD);
		}
		catch (NoSuchVRTechnicalSpec_XDDException nsee) {
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
	protected VRTechnicalSpec_XDD removeImpl(
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		vrTechnicalSpec_XDD = toUnwrappedModel(vrTechnicalSpec_XDD);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XDD)) {
				vrTechnicalSpec_XDD = (VRTechnicalSpec_XDD)session.get(VRTechnicalSpec_XDDImpl.class,
						vrTechnicalSpec_XDD.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XDD != null) {
				session.delete(vrTechnicalSpec_XDD);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XDD != null) {
			clearCache(vrTechnicalSpec_XDD);
		}

		return vrTechnicalSpec_XDD;
	}

	@Override
	public VRTechnicalSpec_XDD updateImpl(
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		vrTechnicalSpec_XDD = toUnwrappedModel(vrTechnicalSpec_XDD);

		boolean isNew = vrTechnicalSpec_XDD.isNew();

		VRTechnicalSpec_XDDModelImpl vrTechnicalSpec_XDDModelImpl = (VRTechnicalSpec_XDDModelImpl)vrTechnicalSpec_XDD;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XDD.isNew()) {
				session.save(vrTechnicalSpec_XDD);

				vrTechnicalSpec_XDD.setNew(false);
			}
			else {
				vrTechnicalSpec_XDD = (VRTechnicalSpec_XDD)session.merge(vrTechnicalSpec_XDD);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XDDModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XDDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XDDModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getDossierNo(),
						vrTechnicalSpec_XDDModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XDDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XDDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XDDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XDDModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getDossierId(),
						vrTechnicalSpec_XDDModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XDDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] { vrTechnicalSpec_XDDModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XDDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XDDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XDDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XDDModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XDDImpl.class, vrTechnicalSpec_XDD.getPrimaryKey(),
			vrTechnicalSpec_XDD, false);

		vrTechnicalSpec_XDD.resetOriginalValues();

		return vrTechnicalSpec_XDD;
	}

	protected VRTechnicalSpec_XDD toUnwrappedModel(
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		if (vrTechnicalSpec_XDD instanceof VRTechnicalSpec_XDDImpl) {
			return vrTechnicalSpec_XDD;
		}

		VRTechnicalSpec_XDDImpl vrTechnicalSpec_XDDImpl = new VRTechnicalSpec_XDDImpl();

		vrTechnicalSpec_XDDImpl.setNew(vrTechnicalSpec_XDD.isNew());
		vrTechnicalSpec_XDDImpl.setPrimaryKey(vrTechnicalSpec_XDD.getPrimaryKey());

		vrTechnicalSpec_XDDImpl.setId(vrTechnicalSpec_XDD.getId());
		vrTechnicalSpec_XDDImpl.setMtCore(vrTechnicalSpec_XDD.getMtCore());
		vrTechnicalSpec_XDDImpl.setConvertAssembleId(vrTechnicalSpec_XDD.getConvertAssembleId());
		vrTechnicalSpec_XDDImpl.setDossierId(vrTechnicalSpec_XDD.getDossierId());
		vrTechnicalSpec_XDDImpl.setDossierNo(vrTechnicalSpec_XDD.getDossierNo());
		vrTechnicalSpec_XDDImpl.setReferenceUid(vrTechnicalSpec_XDD.getReferenceUid());
		vrTechnicalSpec_XDDImpl.setDossierIdCTN(vrTechnicalSpec_XDD.getDossierIdCTN());
		vrTechnicalSpec_XDDImpl.setDeliverableCode(vrTechnicalSpec_XDD.getDeliverableCode());
		vrTechnicalSpec_XDDImpl.setVehicleTypeCertificateId(vrTechnicalSpec_XDD.getVehicleTypeCertificateId());
		vrTechnicalSpec_XDDImpl.setXDD01001(vrTechnicalSpec_XDD.getXDD01001());
		vrTechnicalSpec_XDDImpl.setXDD01002(vrTechnicalSpec_XDD.getXDD01002());
		vrTechnicalSpec_XDDImpl.setXDD01003(vrTechnicalSpec_XDD.getXDD01003());
		vrTechnicalSpec_XDDImpl.setXDD01004(vrTechnicalSpec_XDD.getXDD01004());
		vrTechnicalSpec_XDDImpl.setXDD01005(vrTechnicalSpec_XDD.getXDD01005());
		vrTechnicalSpec_XDDImpl.setXDD01006(vrTechnicalSpec_XDD.getXDD01006());
		vrTechnicalSpec_XDDImpl.setXDD01007(vrTechnicalSpec_XDD.getXDD01007());
		vrTechnicalSpec_XDDImpl.setXDD01008(vrTechnicalSpec_XDD.getXDD01008());
		vrTechnicalSpec_XDDImpl.setXDD01009(vrTechnicalSpec_XDD.getXDD01009());
		vrTechnicalSpec_XDDImpl.setXDD01010(vrTechnicalSpec_XDD.getXDD01010());
		vrTechnicalSpec_XDDImpl.setXDD01011(vrTechnicalSpec_XDD.getXDD01011());
		vrTechnicalSpec_XDDImpl.setXDD01012(vrTechnicalSpec_XDD.getXDD01012());
		vrTechnicalSpec_XDDImpl.setXDD01013(vrTechnicalSpec_XDD.getXDD01013());
		vrTechnicalSpec_XDDImpl.setXDD01014(vrTechnicalSpec_XDD.getXDD01014());
		vrTechnicalSpec_XDDImpl.setXDD01016(vrTechnicalSpec_XDD.getXDD01016());
		vrTechnicalSpec_XDDImpl.setXDD01017(vrTechnicalSpec_XDD.getXDD01017());
		vrTechnicalSpec_XDDImpl.setXDD01019(vrTechnicalSpec_XDD.getXDD01019());
		vrTechnicalSpec_XDDImpl.setXDD01020(vrTechnicalSpec_XDD.getXDD01020());
		vrTechnicalSpec_XDDImpl.setXDD01021(vrTechnicalSpec_XDD.getXDD01021());
		vrTechnicalSpec_XDDImpl.setXDD01022(vrTechnicalSpec_XDD.getXDD01022());
		vrTechnicalSpec_XDDImpl.setXDD01024(vrTechnicalSpec_XDD.getXDD01024());
		vrTechnicalSpec_XDDImpl.setXDD01025(vrTechnicalSpec_XDD.getXDD01025());
		vrTechnicalSpec_XDDImpl.setXDD01026(vrTechnicalSpec_XDD.getXDD01026());
		vrTechnicalSpec_XDDImpl.setXDD01027(vrTechnicalSpec_XDD.getXDD01027());
		vrTechnicalSpec_XDDImpl.setXDD01028(vrTechnicalSpec_XDD.getXDD01028());
		vrTechnicalSpec_XDDImpl.setXDD01030(vrTechnicalSpec_XDD.getXDD01030());
		vrTechnicalSpec_XDDImpl.setXDD01031(vrTechnicalSpec_XDD.getXDD01031());
		vrTechnicalSpec_XDDImpl.setXDD01032(vrTechnicalSpec_XDD.getXDD01032());
		vrTechnicalSpec_XDDImpl.setXDD01033(vrTechnicalSpec_XDD.getXDD01033());
		vrTechnicalSpec_XDDImpl.setXDD01034(vrTechnicalSpec_XDD.getXDD01034());
		vrTechnicalSpec_XDDImpl.setXDD01035(vrTechnicalSpec_XDD.getXDD01035());
		vrTechnicalSpec_XDDImpl.setXDD01036(vrTechnicalSpec_XDD.getXDD01036());
		vrTechnicalSpec_XDDImpl.setXDD01037(vrTechnicalSpec_XDD.getXDD01037());
		vrTechnicalSpec_XDDImpl.setXDD01038(vrTechnicalSpec_XDD.getXDD01038());
		vrTechnicalSpec_XDDImpl.setXDD01039(vrTechnicalSpec_XDD.getXDD01039());
		vrTechnicalSpec_XDDImpl.setXDD01040(vrTechnicalSpec_XDD.getXDD01040());
		vrTechnicalSpec_XDDImpl.setXDD01041(vrTechnicalSpec_XDD.getXDD01041());
		vrTechnicalSpec_XDDImpl.setXDD01042(vrTechnicalSpec_XDD.getXDD01042());
		vrTechnicalSpec_XDDImpl.setXDD01043(vrTechnicalSpec_XDD.getXDD01043());
		vrTechnicalSpec_XDDImpl.setXDD01044(vrTechnicalSpec_XDD.getXDD01044());
		vrTechnicalSpec_XDDImpl.setXDD01045(vrTechnicalSpec_XDD.getXDD01045());
		vrTechnicalSpec_XDDImpl.setXDD01046(vrTechnicalSpec_XDD.getXDD01046());
		vrTechnicalSpec_XDDImpl.setXDD01047(vrTechnicalSpec_XDD.getXDD01047());
		vrTechnicalSpec_XDDImpl.setXDD01049(vrTechnicalSpec_XDD.getXDD01049());
		vrTechnicalSpec_XDDImpl.setXDD01050(vrTechnicalSpec_XDD.getXDD01050());
		vrTechnicalSpec_XDDImpl.setXDD01051(vrTechnicalSpec_XDD.getXDD01051());
		vrTechnicalSpec_XDDImpl.setXDD01052(vrTechnicalSpec_XDD.getXDD01052());
		vrTechnicalSpec_XDDImpl.setXDD01053(vrTechnicalSpec_XDD.getXDD01053());
		vrTechnicalSpec_XDDImpl.setXDD01054(vrTechnicalSpec_XDD.getXDD01054());
		vrTechnicalSpec_XDDImpl.setXDD01055(vrTechnicalSpec_XDD.getXDD01055());
		vrTechnicalSpec_XDDImpl.setXDD01056(vrTechnicalSpec_XDD.getXDD01056());
		vrTechnicalSpec_XDDImpl.setXDD01057(vrTechnicalSpec_XDD.getXDD01057());
		vrTechnicalSpec_XDDImpl.setXDD01058(vrTechnicalSpec_XDD.getXDD01058());
		vrTechnicalSpec_XDDImpl.setXDD01059(vrTechnicalSpec_XDD.getXDD01059());
		vrTechnicalSpec_XDDImpl.setXDD01060(vrTechnicalSpec_XDD.getXDD01060());
		vrTechnicalSpec_XDDImpl.setXDD0076(vrTechnicalSpec_XDD.getXDD0076());
		vrTechnicalSpec_XDDImpl.setXDD0077(vrTechnicalSpec_XDD.getXDD0077());
		vrTechnicalSpec_XDDImpl.setXDD0078(vrTechnicalSpec_XDD.getXDD0078());
		vrTechnicalSpec_XDDImpl.setXDD0079(vrTechnicalSpec_XDD.getXDD0079());
		vrTechnicalSpec_XDDImpl.setXDD0080(vrTechnicalSpec_XDD.getXDD0080());
		vrTechnicalSpec_XDDImpl.setXDD0081(vrTechnicalSpec_XDD.getXDD0081());
		vrTechnicalSpec_XDDImpl.setXDD0082(vrTechnicalSpec_XDD.getXDD0082());
		vrTechnicalSpec_XDDImpl.setXDD0083(vrTechnicalSpec_XDD.getXDD0083());
		vrTechnicalSpec_XDDImpl.setXDD0084(vrTechnicalSpec_XDD.getXDD0084());
		vrTechnicalSpec_XDDImpl.setXDD0085(vrTechnicalSpec_XDD.getXDD0085());
		vrTechnicalSpec_XDDImpl.setXDD0086(vrTechnicalSpec_XDD.getXDD0086());
		vrTechnicalSpec_XDDImpl.setXDD0087(vrTechnicalSpec_XDD.getXDD0087());
		vrTechnicalSpec_XDDImpl.setXDD0088(vrTechnicalSpec_XDD.getXDD0088());
		vrTechnicalSpec_XDDImpl.setXDD0089(vrTechnicalSpec_XDD.getXDD0089());
		vrTechnicalSpec_XDDImpl.setXDD0090(vrTechnicalSpec_XDD.getXDD0090());
		vrTechnicalSpec_XDDImpl.setXDD0091(vrTechnicalSpec_XDD.getXDD0091());
		vrTechnicalSpec_XDDImpl.setXDD0092(vrTechnicalSpec_XDD.getXDD0092());
		vrTechnicalSpec_XDDImpl.setXDD0093(vrTechnicalSpec_XDD.getXDD0093());
		vrTechnicalSpec_XDDImpl.setXDD0094(vrTechnicalSpec_XDD.getXDD0094());
		vrTechnicalSpec_XDDImpl.setXDD0095(vrTechnicalSpec_XDD.getXDD0095());
		vrTechnicalSpec_XDDImpl.setXDD0096(vrTechnicalSpec_XDD.getXDD0096());
		vrTechnicalSpec_XDDImpl.setXDD0097(vrTechnicalSpec_XDD.getXDD0097());
		vrTechnicalSpec_XDDImpl.setXDD0098(vrTechnicalSpec_XDD.getXDD0098());
		vrTechnicalSpec_XDDImpl.setXDD0099(vrTechnicalSpec_XDD.getXDD0099());
		vrTechnicalSpec_XDDImpl.setXDD0100(vrTechnicalSpec_XDD.getXDD0100());
		vrTechnicalSpec_XDDImpl.setXDD0101(vrTechnicalSpec_XDD.getXDD0101());
		vrTechnicalSpec_XDDImpl.setXDD0102(vrTechnicalSpec_XDD.getXDD0102());
		vrTechnicalSpec_XDDImpl.setXDD0103(vrTechnicalSpec_XDD.getXDD0103());
		vrTechnicalSpec_XDDImpl.setXDD0104(vrTechnicalSpec_XDD.getXDD0104());
		vrTechnicalSpec_XDDImpl.setXDD0105(vrTechnicalSpec_XDD.getXDD0105());
		vrTechnicalSpec_XDDImpl.setXDD0106(vrTechnicalSpec_XDD.getXDD0106());
		vrTechnicalSpec_XDDImpl.setXDD0107(vrTechnicalSpec_XDD.getXDD0107());
		vrTechnicalSpec_XDDImpl.setXDD0108(vrTechnicalSpec_XDD.getXDD0108());
		vrTechnicalSpec_XDDImpl.setXDD0109(vrTechnicalSpec_XDD.getXDD0109());
		vrTechnicalSpec_XDDImpl.setXDD0110(vrTechnicalSpec_XDD.getXDD0110());
		vrTechnicalSpec_XDDImpl.setXDD0111(vrTechnicalSpec_XDD.getXDD0111());
		vrTechnicalSpec_XDDImpl.setXDD0112(vrTechnicalSpec_XDD.getXDD0112());
		vrTechnicalSpec_XDDImpl.setXDD0113(vrTechnicalSpec_XDD.getXDD0113());
		vrTechnicalSpec_XDDImpl.setXDD0114(vrTechnicalSpec_XDD.getXDD0114());
		vrTechnicalSpec_XDDImpl.setXDD0115(vrTechnicalSpec_XDD.getXDD0115());
		vrTechnicalSpec_XDDImpl.setXDD0116(vrTechnicalSpec_XDD.getXDD0116());
		vrTechnicalSpec_XDDImpl.setXDD0117(vrTechnicalSpec_XDD.getXDD0117());
		vrTechnicalSpec_XDDImpl.setXDD0118(vrTechnicalSpec_XDD.getXDD0118());
		vrTechnicalSpec_XDDImpl.setXDD0119(vrTechnicalSpec_XDD.getXDD0119());
		vrTechnicalSpec_XDDImpl.setXDD0120(vrTechnicalSpec_XDD.getXDD0120());
		vrTechnicalSpec_XDDImpl.setXDD0121(vrTechnicalSpec_XDD.getXDD0121());
		vrTechnicalSpec_XDDImpl.setXDD0122(vrTechnicalSpec_XDD.getXDD0122());
		vrTechnicalSpec_XDDImpl.setXDD0123(vrTechnicalSpec_XDD.getXDD0123());
		vrTechnicalSpec_XDDImpl.setXDD0124(vrTechnicalSpec_XDD.getXDD0124());
		vrTechnicalSpec_XDDImpl.setXDD0125(vrTechnicalSpec_XDD.getXDD0125());
		vrTechnicalSpec_XDDImpl.setXDD0126(vrTechnicalSpec_XDD.getXDD0126());
		vrTechnicalSpec_XDDImpl.setXDD0127(vrTechnicalSpec_XDD.getXDD0127());
		vrTechnicalSpec_XDDImpl.setXDD0128(vrTechnicalSpec_XDD.getXDD0128());
		vrTechnicalSpec_XDDImpl.setXDD0129(vrTechnicalSpec_XDD.getXDD0129());
		vrTechnicalSpec_XDDImpl.setXDD0130(vrTechnicalSpec_XDD.getXDD0130());
		vrTechnicalSpec_XDDImpl.setXDD0131(vrTechnicalSpec_XDD.getXDD0131());
		vrTechnicalSpec_XDDImpl.setXDD0132(vrTechnicalSpec_XDD.getXDD0132());
		vrTechnicalSpec_XDDImpl.setXDD0133(vrTechnicalSpec_XDD.getXDD0133());
		vrTechnicalSpec_XDDImpl.setXDD0134(vrTechnicalSpec_XDD.getXDD0134());
		vrTechnicalSpec_XDDImpl.setXDD0135(vrTechnicalSpec_XDD.getXDD0135());
		vrTechnicalSpec_XDDImpl.setXDD0136(vrTechnicalSpec_XDD.getXDD0136());
		vrTechnicalSpec_XDDImpl.setXDD0137(vrTechnicalSpec_XDD.getXDD0137());
		vrTechnicalSpec_XDDImpl.setXDD0138(vrTechnicalSpec_XDD.getXDD0138());
		vrTechnicalSpec_XDDImpl.setXDD0139(vrTechnicalSpec_XDD.getXDD0139());
		vrTechnicalSpec_XDDImpl.setXDD0140(vrTechnicalSpec_XDD.getXDD0140());
		vrTechnicalSpec_XDDImpl.setXDD0141(vrTechnicalSpec_XDD.getXDD0141());
		vrTechnicalSpec_XDDImpl.setXDD0142(vrTechnicalSpec_XDD.getXDD0142());
		vrTechnicalSpec_XDDImpl.setXDD0143(vrTechnicalSpec_XDD.getXDD0143());
		vrTechnicalSpec_XDDImpl.setXDD0144(vrTechnicalSpec_XDD.getXDD0144());
		vrTechnicalSpec_XDDImpl.setXDD0145(vrTechnicalSpec_XDD.getXDD0145());
		vrTechnicalSpec_XDDImpl.setXDD0146(vrTechnicalSpec_XDD.getXDD0146());
		vrTechnicalSpec_XDDImpl.setXDD0147(vrTechnicalSpec_XDD.getXDD0147());
		vrTechnicalSpec_XDDImpl.setXDD0148(vrTechnicalSpec_XDD.getXDD0148());
		vrTechnicalSpec_XDDImpl.setXDD0149(vrTechnicalSpec_XDD.getXDD0149());
		vrTechnicalSpec_XDDImpl.setXDD0150(vrTechnicalSpec_XDD.getXDD0150());
		vrTechnicalSpec_XDDImpl.setXDD0151(vrTechnicalSpec_XDD.getXDD0151());
		vrTechnicalSpec_XDDImpl.setXDD0152(vrTechnicalSpec_XDD.getXDD0152());
		vrTechnicalSpec_XDDImpl.setXDD0153(vrTechnicalSpec_XDD.getXDD0153());
		vrTechnicalSpec_XDDImpl.setXDD0154(vrTechnicalSpec_XDD.getXDD0154());
		vrTechnicalSpec_XDDImpl.setXDD0155(vrTechnicalSpec_XDD.getXDD0155());
		vrTechnicalSpec_XDDImpl.setXDD0156(vrTechnicalSpec_XDD.getXDD0156());
		vrTechnicalSpec_XDDImpl.setXDD0157(vrTechnicalSpec_XDD.getXDD0157());
		vrTechnicalSpec_XDDImpl.setXDD0158(vrTechnicalSpec_XDD.getXDD0158());
		vrTechnicalSpec_XDDImpl.setXDD0159(vrTechnicalSpec_XDD.getXDD0159());
		vrTechnicalSpec_XDDImpl.setXDD0160(vrTechnicalSpec_XDD.getXDD0160());
		vrTechnicalSpec_XDDImpl.setXDD0161(vrTechnicalSpec_XDD.getXDD0161());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD001(vrTechnicalSpec_XDD.getBBCNCLKLXDD001());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD002(vrTechnicalSpec_XDD.getBBCNCLKLXDD002());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD003(vrTechnicalSpec_XDD.getBBCNCLKLXDD003());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD004(vrTechnicalSpec_XDD.getBBCNCLKLXDD004());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD005(vrTechnicalSpec_XDD.getBBCNCLKLXDD005());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD006(vrTechnicalSpec_XDD.getBBCNCLKLXDD006());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD007(vrTechnicalSpec_XDD.getBBCNCLKLXDD007());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD008(vrTechnicalSpec_XDD.getBBCNCLKLXDD008());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD009(vrTechnicalSpec_XDD.getBBCNCLKLXDD009());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD010(vrTechnicalSpec_XDD.getBBCNCLKLXDD010());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD011(vrTechnicalSpec_XDD.getBBCNCLKLXDD011());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD012(vrTechnicalSpec_XDD.getBBCNCLKLXDD012());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD013(vrTechnicalSpec_XDD.getBBCNCLKLXDD013());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD014(vrTechnicalSpec_XDD.getBBCNCLKLXDD014());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD015(vrTechnicalSpec_XDD.getBBCNCLKLXDD015());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD016(vrTechnicalSpec_XDD.getBBCNCLKLXDD016());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD019(vrTechnicalSpec_XDD.getBBCNCLKLXDD019());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD017(vrTechnicalSpec_XDD.getBBCNCLKLXDD017());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD020(vrTechnicalSpec_XDD.getBBCNCLKLXDD020());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD018(vrTechnicalSpec_XDD.getBBCNCLKLXDD018());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD021(vrTechnicalSpec_XDD.getBBCNCLKLXDD021());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD022(vrTechnicalSpec_XDD.getBBCNCLKLXDD022());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD023(vrTechnicalSpec_XDD.getBBCNCLKLXDD023());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD024(vrTechnicalSpec_XDD.getBBCNCLKLXDD024());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD025(vrTechnicalSpec_XDD.getBBCNCLKLXDD025());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD026(vrTechnicalSpec_XDD.getBBCNCLKLXDD026());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD027(vrTechnicalSpec_XDD.getBBCNCLKLXDD027());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD028(vrTechnicalSpec_XDD.getBBCNCLKLXDD028());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD029(vrTechnicalSpec_XDD.getBBCNCLKLXDD029());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD031(vrTechnicalSpec_XDD.getBBCNCLKLXDD031());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD032(vrTechnicalSpec_XDD.getBBCNCLKLXDD032());
		vrTechnicalSpec_XDDImpl.setBBCNCLKLXDD033(vrTechnicalSpec_XDD.getBBCNCLKLXDD033());
		vrTechnicalSpec_XDDImpl.setModifyDate(vrTechnicalSpec_XDD.getModifyDate());
		vrTechnicalSpec_XDDImpl.setSyncDate(vrTechnicalSpec_XDD.getSyncDate());

		return vrTechnicalSpec_XDDImpl;
	}

	/**
	 * Returns the vr technical spec_xdd with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xdd
	 * @return the vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XDDException {
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XDD == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XDDException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XDD;
	}

	/**
	 * Returns the vr technical spec_xdd with the primary key or throws a {@link NoSuchVRTechnicalSpec_XDDException} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xdd
	 * @return the vr technical spec_xdd
	 * @throws NoSuchVRTechnicalSpec_XDDException if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XDDException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xdd with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xdd
	 * @return the vr technical spec_xdd, or <code>null</code> if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XDDImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XDD vrTechnicalSpec_XDD = (VRTechnicalSpec_XDD)serializable;

		if (vrTechnicalSpec_XDD == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XDD = (VRTechnicalSpec_XDD)session.get(VRTechnicalSpec_XDDImpl.class,
						primaryKey);

				if (vrTechnicalSpec_XDD != null) {
					cacheResult(vrTechnicalSpec_XDD);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XDDImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XDDImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XDD;
	}

	/**
	 * Returns the vr technical spec_xdd with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xdd
	 * @return the vr technical spec_xdd, or <code>null</code> if a vr technical spec_xdd with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XDD fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XDD> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XDD> map = new HashMap<Serializable, VRTechnicalSpec_XDD>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XDD vrTechnicalSpec_XDD = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XDD != null) {
				map.put(primaryKey, vrTechnicalSpec_XDD);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XDDImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XDD)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : (List<VRTechnicalSpec_XDD>)q.list()) {
				map.put(vrTechnicalSpec_XDD.getPrimaryKeyObj(),
					vrTechnicalSpec_XDD);

				cacheResult(vrTechnicalSpec_XDD);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XDD.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XDDModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XDDImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xdds.
	 *
	 * @return the vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xdds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @return the range of vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xdds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xdds
	 * @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xdds
	 */
	@Override
	public List<VRTechnicalSpec_XDD> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XDD> orderByComparator,
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

		List<VRTechnicalSpec_XDD> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XDD>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XDD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XDD;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XDDModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XDD>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xdds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XDD vrTechnicalSpec_XDD : findAll()) {
			remove(vrTechnicalSpec_XDD);
		}
	}

	/**
	 * Returns the number of vr technical spec_xdds.
	 *
	 * @return the number of vr technical spec_xdds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XDD);

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
		return VRTechnicalSpec_XDDModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xdd persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XDDImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XDD = "SELECT vrTechnicalSpec_XDD FROM VRTechnicalSpec_XDD vrTechnicalSpec_XDD";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE_PKS_IN = "SELECT vrTechnicalSpec_XDD FROM VRTechnicalSpec_XDD vrTechnicalSpec_XDD WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XDD_WHERE = "SELECT vrTechnicalSpec_XDD FROM VRTechnicalSpec_XDD vrTechnicalSpec_XDD WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XDD = "SELECT COUNT(vrTechnicalSpec_XDD) FROM VRTechnicalSpec_XDD vrTechnicalSpec_XDD";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XDD_WHERE = "SELECT COUNT(vrTechnicalSpec_XDD) FROM VRTechnicalSpec_XDD vrTechnicalSpec_XDD WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XDD.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XDD exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XDD exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XDDPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}