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

import com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException;
import com.fds.vr.business.model.VRProductionPlantEquipmentMarkup;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupModelImpl;
import com.fds.vr.business.service.persistence.VRProductionPlantEquipmentMarkupPersistence;

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
import java.util.Set;

/**
 * The persistence implementation for the vr production plant equipment markup service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEquipmentMarkupPersistence
 * @see com.fds.vr.business.service.persistence.VRProductionPlantEquipmentMarkupUtil
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentMarkupPersistenceImpl
	extends BasePersistenceImpl<VRProductionPlantEquipmentMarkup>
	implements VRProductionPlantEquipmentMarkupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductionPlantEquipmentMarkupUtil} to access the vr production plant equipment markup persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductionPlantEquipmentMarkupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTEQUIPMENTID =
		new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantEquipmentId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTEQUIPMENTID =
		new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantEquipmentId",
			new String[] { Long.class.getName() },
			VRProductionPlantEquipmentMarkupModelImpl.PRODUCTIONPLANTEQUIPMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTEQUIPMENTID =
		new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantEquipmentId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @return the matching vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId) {
		return findByproductionPlantEquipmentId(productionPlantEquipmentId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @return the range of matching vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end) {
		return findByproductionPlantEquipmentId(productionPlantEquipmentId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		return findByproductionPlantEquipmentId(productionPlantEquipmentId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTEQUIPMENTID;
			finderArgs = new Object[] { productionPlantEquipmentId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTEQUIPMENTID;
			finderArgs = new Object[] {
					productionPlantEquipmentId,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlantEquipmentMarkup> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantEquipmentMarkup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : list) {
					if ((productionPlantEquipmentId != vrProductionPlantEquipmentMarkup.getProductionPlantEquipmentId())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTEQUIPMENTID_PRODUCTIONPLANTEQUIPMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantEquipmentMarkupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productionPlantEquipmentId);

				if (!pagination) {
					list = (List<VRProductionPlantEquipmentMarkup>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantEquipmentMarkup>)QueryUtil.list(q,
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
	 * Returns the first vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant equipment markup
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a matching vr production plant equipment markup could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup findByproductionPlantEquipmentId_First(
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = fetchByproductionPlantEquipmentId_First(productionPlantEquipmentId,
				orderByComparator);

		if (vrProductionPlantEquipmentMarkup != null) {
			return vrProductionPlantEquipmentMarkup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantEquipmentId=");
		msg.append(productionPlantEquipmentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantEquipmentMarkupException(msg.toString());
	}

	/**
	 * Returns the first vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant equipment markup, or <code>null</code> if a matching vr production plant equipment markup could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup fetchByproductionPlantEquipmentId_First(
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		List<VRProductionPlantEquipmentMarkup> list = findByproductionPlantEquipmentId(productionPlantEquipmentId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant equipment markup
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a matching vr production plant equipment markup could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup findByproductionPlantEquipmentId_Last(
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = fetchByproductionPlantEquipmentId_Last(productionPlantEquipmentId,
				orderByComparator);

		if (vrProductionPlantEquipmentMarkup != null) {
			return vrProductionPlantEquipmentMarkup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantEquipmentId=");
		msg.append(productionPlantEquipmentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantEquipmentMarkupException(msg.toString());
	}

	/**
	 * Returns the last vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant equipment markup, or <code>null</code> if a matching vr production plant equipment markup could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup fetchByproductionPlantEquipmentId_Last(
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		int count = countByproductionPlantEquipmentId(productionPlantEquipmentId);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlantEquipmentMarkup> list = findByproductionPlantEquipmentId(productionPlantEquipmentId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plant equipment markups before and after the current vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	 *
	 * @param id the primary key of the current vr production plant equipment markup
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant equipment markup
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup[] findByproductionPlantEquipmentId_PrevAndNext(
		long id, long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlantEquipmentMarkup[] array = new VRProductionPlantEquipmentMarkupImpl[3];

			array[0] = getByproductionPlantEquipmentId_PrevAndNext(session,
					vrProductionPlantEquipmentMarkup,
					productionPlantEquipmentId, orderByComparator, true);

			array[1] = vrProductionPlantEquipmentMarkup;

			array[2] = getByproductionPlantEquipmentId_PrevAndNext(session,
					vrProductionPlantEquipmentMarkup,
					productionPlantEquipmentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRProductionPlantEquipmentMarkup getByproductionPlantEquipmentId_PrevAndNext(
		Session session,
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup,
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator,
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

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTEQUIPMENTID_PRODUCTIONPLANTEQUIPMENTID_2);

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
			query.append(VRProductionPlantEquipmentMarkupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(productionPlantEquipmentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlantEquipmentMarkup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlantEquipmentMarkup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plant equipment markups where productionPlantEquipmentId = &#63; from the database.
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 */
	@Override
	public void removeByproductionPlantEquipmentId(
		long productionPlantEquipmentId) {
		for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : findByproductionPlantEquipmentId(
				productionPlantEquipmentId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlantEquipmentMarkup);
		}
	}

	/**
	 * Returns the number of vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	 *
	 * @param productionPlantEquipmentId the production plant equipment ID
	 * @return the number of matching vr production plant equipment markups
	 */
	@Override
	public int countByproductionPlantEquipmentId(
		long productionPlantEquipmentId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTEQUIPMENTID;

		Object[] finderArgs = new Object[] { productionPlantEquipmentId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTEQUIPMENTID_PRODUCTIONPLANTEQUIPMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productionPlantEquipmentId);

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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTEQUIPMENTID_PRODUCTIONPLANTEQUIPMENTID_2 =
		"vrProductionPlantEquipmentMarkup.productionPlantEquipmentId = ?";

	public VRProductionPlantEquipmentMarkupPersistenceImpl() {
		setModelClass(VRProductionPlantEquipmentMarkup.class);
	}

	/**
	 * Caches the vr production plant equipment markup in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantEquipmentMarkup the vr production plant equipment markup
	 */
	@Override
	public void cacheResult(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		entityCache.putResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			vrProductionPlantEquipmentMarkup.getPrimaryKey(),
			vrProductionPlantEquipmentMarkup);

		vrProductionPlantEquipmentMarkup.resetOriginalValues();
	}

	/**
	 * Caches the vr production plant equipment markups in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantEquipmentMarkups the vr production plant equipment markups
	 */
	@Override
	public void cacheResult(
		List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups) {
		for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : vrProductionPlantEquipmentMarkups) {
			if (entityCache.getResult(
						VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantEquipmentMarkupImpl.class,
						vrProductionPlantEquipmentMarkup.getPrimaryKey()) == null) {
				cacheResult(vrProductionPlantEquipmentMarkup);
			}
			else {
				vrProductionPlantEquipmentMarkup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr production plant equipment markups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductionPlantEquipmentMarkupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr production plant equipment markup.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		entityCache.removeResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			vrProductionPlantEquipmentMarkup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : vrProductionPlantEquipmentMarkups) {
			entityCache.removeResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantEquipmentMarkupImpl.class,
				vrProductionPlantEquipmentMarkup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr production plant equipment markup with the primary key. Does not add the vr production plant equipment markup to the database.
	 *
	 * @param id the primary key for the new vr production plant equipment markup
	 * @return the new vr production plant equipment markup
	 */
	@Override
	public VRProductionPlantEquipmentMarkup create(long id) {
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = new VRProductionPlantEquipmentMarkupImpl();

		vrProductionPlantEquipmentMarkup.setNew(true);
		vrProductionPlantEquipmentMarkup.setPrimaryKey(id);

		return vrProductionPlantEquipmentMarkup;
	}

	/**
	 * Removes the vr production plant equipment markup with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup that was removed
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup remove(long id)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr production plant equipment markup with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup that was removed
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup remove(Serializable primaryKey)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		Session session = null;

		try {
			session = openSession();

			VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)session.get(VRProductionPlantEquipmentMarkupImpl.class,
					primaryKey);

			if (vrProductionPlantEquipmentMarkup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductionPlantEquipmentMarkupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductionPlantEquipmentMarkup);
		}
		catch (NoSuchVRProductionPlantEquipmentMarkupException nsee) {
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
	protected VRProductionPlantEquipmentMarkup removeImpl(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		vrProductionPlantEquipmentMarkup = toUnwrappedModel(vrProductionPlantEquipmentMarkup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductionPlantEquipmentMarkup)) {
				vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)session.get(VRProductionPlantEquipmentMarkupImpl.class,
						vrProductionPlantEquipmentMarkup.getPrimaryKeyObj());
			}

			if (vrProductionPlantEquipmentMarkup != null) {
				session.delete(vrProductionPlantEquipmentMarkup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductionPlantEquipmentMarkup != null) {
			clearCache(vrProductionPlantEquipmentMarkup);
		}

		return vrProductionPlantEquipmentMarkup;
	}

	@Override
	public VRProductionPlantEquipmentMarkup updateImpl(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		vrProductionPlantEquipmentMarkup = toUnwrappedModel(vrProductionPlantEquipmentMarkup);

		boolean isNew = vrProductionPlantEquipmentMarkup.isNew();

		VRProductionPlantEquipmentMarkupModelImpl vrProductionPlantEquipmentMarkupModelImpl =
			(VRProductionPlantEquipmentMarkupModelImpl)vrProductionPlantEquipmentMarkup;

		Session session = null;

		try {
			session = openSession();

			if (vrProductionPlantEquipmentMarkup.isNew()) {
				session.save(vrProductionPlantEquipmentMarkup);

				vrProductionPlantEquipmentMarkup.setNew(false);
			}
			else {
				vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)session.merge(vrProductionPlantEquipmentMarkup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!VRProductionPlantEquipmentMarkupModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductionPlantEquipmentMarkupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTEQUIPMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantEquipmentMarkupModelImpl.getOriginalProductionPlantEquipmentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTEQUIPMENTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTEQUIPMENTID,
					args);

				args = new Object[] {
						vrProductionPlantEquipmentMarkupModelImpl.getProductionPlantEquipmentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTEQUIPMENTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTEQUIPMENTID,
					args);
			}
		}

		entityCache.putResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			vrProductionPlantEquipmentMarkup.getPrimaryKey(),
			vrProductionPlantEquipmentMarkup, false);

		vrProductionPlantEquipmentMarkup.resetOriginalValues();

		return vrProductionPlantEquipmentMarkup;
	}

	protected VRProductionPlantEquipmentMarkup toUnwrappedModel(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		if (vrProductionPlantEquipmentMarkup instanceof VRProductionPlantEquipmentMarkupImpl) {
			return vrProductionPlantEquipmentMarkup;
		}

		VRProductionPlantEquipmentMarkupImpl vrProductionPlantEquipmentMarkupImpl =
			new VRProductionPlantEquipmentMarkupImpl();

		vrProductionPlantEquipmentMarkupImpl.setNew(vrProductionPlantEquipmentMarkup.isNew());
		vrProductionPlantEquipmentMarkupImpl.setPrimaryKey(vrProductionPlantEquipmentMarkup.getPrimaryKey());

		vrProductionPlantEquipmentMarkupImpl.setId(vrProductionPlantEquipmentMarkup.getId());
		vrProductionPlantEquipmentMarkupImpl.setProductClassificationCode(vrProductionPlantEquipmentMarkup.getProductClassificationCode());
		vrProductionPlantEquipmentMarkupImpl.setProductionPlantEquipmentId(vrProductionPlantEquipmentMarkup.getProductionPlantEquipmentId());
		vrProductionPlantEquipmentMarkupImpl.setStatus(vrProductionPlantEquipmentMarkup.getStatus());

		return vrProductionPlantEquipmentMarkupImpl;
	}

	/**
	 * Returns the vr production plant equipment markup with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = fetchByPrimaryKey(primaryKey);

		if (vrProductionPlantEquipmentMarkup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductionPlantEquipmentMarkupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductionPlantEquipmentMarkup;
	}

	/**
	 * Returns the vr production plant equipment markup with the primary key or throws a {@link NoSuchVRProductionPlantEquipmentMarkupException} if it could not be found.
	 *
	 * @param id the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr production plant equipment markup with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup, or <code>null</code> if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantEquipmentMarkupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)serializable;

		if (vrProductionPlantEquipmentMarkup == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)session.get(VRProductionPlantEquipmentMarkupImpl.class,
						primaryKey);

				if (vrProductionPlantEquipmentMarkup != null) {
					cacheResult(vrProductionPlantEquipmentMarkup);
				}
				else {
					entityCache.putResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantEquipmentMarkupImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentMarkupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductionPlantEquipmentMarkup;
	}

	/**
	 * Returns the vr production plant equipment markup with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup, or <code>null</code> if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductionPlantEquipmentMarkup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductionPlantEquipmentMarkup> map = new HashMap<Serializable, VRProductionPlantEquipmentMarkup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = fetchByPrimaryKey(primaryKey);

			if (vrProductionPlantEquipmentMarkup != null) {
				map.put(primaryKey, vrProductionPlantEquipmentMarkup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentMarkupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(VRProductionPlantEquipmentMarkup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE_PKS_IN);

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

			for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : (List<VRProductionPlantEquipmentMarkup>)q.list()) {
				map.put(vrProductionPlantEquipmentMarkup.getPrimaryKeyObj(),
					vrProductionPlantEquipmentMarkup);

				cacheResult(vrProductionPlantEquipmentMarkup);

				uncachedPrimaryKeys.remove(vrProductionPlantEquipmentMarkup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentMarkupImpl.class, primaryKey,
					nullModel);
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
	 * Returns all the vr production plant equipment markups.
	 *
	 * @return the vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant equipment markups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @return the range of vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipment markups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipment markups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator,
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

		List<VRProductionPlantEquipmentMarkup> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantEquipmentMarkup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP;

				if (pagination) {
					sql = sql.concat(VRProductionPlantEquipmentMarkupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductionPlantEquipmentMarkup>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantEquipmentMarkup>)QueryUtil.list(q,
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
	 * Removes all the vr production plant equipment markups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : findAll()) {
			remove(vrProductionPlantEquipmentMarkup);
		}
	}

	/**
	 * Returns the number of vr production plant equipment markups.
	 *
	 * @return the number of vr production plant equipment markups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENTMARKUP);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return VRProductionPlantEquipmentMarkupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr production plant equipment markup persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductionPlantEquipmentMarkupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP = "SELECT vrProductionPlantEquipmentMarkup FROM VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE_PKS_IN =
		"SELECT vrProductionPlantEquipmentMarkup FROM VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE =
		"SELECT vrProductionPlantEquipmentMarkup FROM VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENTMARKUP = "SELECT COUNT(vrProductionPlantEquipmentMarkup) FROM VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE =
		"SELECT COUNT(vrProductionPlantEquipmentMarkup) FROM VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductionPlantEquipmentMarkup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductionPlantEquipmentMarkup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductionPlantEquipmentMarkup exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductionPlantEquipmentMarkupPersistenceImpl.class);
}