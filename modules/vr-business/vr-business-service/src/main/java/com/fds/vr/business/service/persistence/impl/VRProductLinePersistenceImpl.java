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

import com.fds.vr.business.exception.NoSuchVRProductLineException;
import com.fds.vr.business.model.VRProductLine;
import com.fds.vr.business.model.impl.VRProductLineImpl;
import com.fds.vr.business.model.impl.VRProductLineModelImpl;
import com.fds.vr.business.service.persistence.VRProductLinePersistence;

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
 * The persistence implementation for the vr product line service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductLinePersistence
 * @see com.fds.vr.business.service.persistence.VRProductLineUtil
 * @generated
 */
@ProviderType
public class VRProductLinePersistenceImpl extends BasePersistenceImpl<VRProductLine>
	implements VRProductLinePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductLineUtil} to access the vr product line persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductLineImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineModelImpl.FINDER_CACHE_ENABLED,
			VRProductLineImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineModelImpl.FINDER_CACHE_ENABLED,
			VRProductLineImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTPLANTID =
		new FinderPath(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineModelImpl.FINDER_CACHE_ENABLED,
			VRProductLineImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductPlantID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID =
		new FinderPath(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineModelImpl.FINDER_CACHE_ENABLED,
			VRProductLineImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductPlantID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRProductLineModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductLineModelImpl.PRODUCTPLANTID_COLUMN_BITMASK |
			VRProductLineModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTPLANTID = new FinderPath(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByproductPlantID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @return the matching vr product lines
	 */
	@Override
	public List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID) {
		return findByproductPlantID(mtCore, productPlantID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param start the lower bound of the range of vr product lines
	 * @param end the upper bound of the range of vr product lines (not inclusive)
	 * @return the range of matching vr product lines
	 */
	@Override
	public List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end) {
		return findByproductPlantID(mtCore, productPlantID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param start the lower bound of the range of vr product lines
	 * @param end the upper bound of the range of vr product lines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr product lines
	 */
	@Override
	public List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end,
		OrderByComparator<VRProductLine> orderByComparator) {
		return findByproductPlantID(mtCore, productPlantID, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param start the lower bound of the range of vr product lines
	 * @param end the upper bound of the range of vr product lines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr product lines
	 */
	@Override
	public List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end,
		OrderByComparator<VRProductLine> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID;
			finderArgs = new Object[] { mtCore, productPlantID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTPLANTID;
			finderArgs = new Object[] {
					mtCore, productPlantID,
					
					start, end, orderByComparator
				};
		}

		List<VRProductLine> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductLine>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductLine vrProductLine : list) {
					if ((mtCore != vrProductLine.getMtCore()) ||
							(productPlantID != vrProductLine.getProductPlantID())) {
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

			query.append(_SQL_SELECT_VRPRODUCTLINE_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTPLANTID_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTPLANTID_PRODUCTPLANTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductLineModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(productPlantID);

				if (!pagination) {
					list = (List<VRProductLine>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductLine>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr product line
	 * @throws NoSuchVRProductLineException if a matching vr product line could not be found
	 */
	@Override
	public VRProductLine findByproductPlantID_First(long mtCore,
		long productPlantID, OrderByComparator<VRProductLine> orderByComparator)
		throws NoSuchVRProductLineException {
		VRProductLine vrProductLine = fetchByproductPlantID_First(mtCore,
				productPlantID, orderByComparator);

		if (vrProductLine != null) {
			return vrProductLine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productPlantID=");
		msg.append(productPlantID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductLineException(msg.toString());
	}

	/**
	 * Returns the first vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr product line, or <code>null</code> if a matching vr product line could not be found
	 */
	@Override
	public VRProductLine fetchByproductPlantID_First(long mtCore,
		long productPlantID, OrderByComparator<VRProductLine> orderByComparator) {
		List<VRProductLine> list = findByproductPlantID(mtCore, productPlantID,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr product line
	 * @throws NoSuchVRProductLineException if a matching vr product line could not be found
	 */
	@Override
	public VRProductLine findByproductPlantID_Last(long mtCore,
		long productPlantID, OrderByComparator<VRProductLine> orderByComparator)
		throws NoSuchVRProductLineException {
		VRProductLine vrProductLine = fetchByproductPlantID_Last(mtCore,
				productPlantID, orderByComparator);

		if (vrProductLine != null) {
			return vrProductLine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productPlantID=");
		msg.append(productPlantID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductLineException(msg.toString());
	}

	/**
	 * Returns the last vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr product line, or <code>null</code> if a matching vr product line could not be found
	 */
	@Override
	public VRProductLine fetchByproductPlantID_Last(long mtCore,
		long productPlantID, OrderByComparator<VRProductLine> orderByComparator) {
		int count = countByproductPlantID(mtCore, productPlantID);

		if (count == 0) {
			return null;
		}

		List<VRProductLine> list = findByproductPlantID(mtCore, productPlantID,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr product lines before and after the current vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param id the primary key of the current vr product line
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr product line
	 * @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	 */
	@Override
	public VRProductLine[] findByproductPlantID_PrevAndNext(long id,
		long mtCore, long productPlantID,
		OrderByComparator<VRProductLine> orderByComparator)
		throws NoSuchVRProductLineException {
		VRProductLine vrProductLine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductLine[] array = new VRProductLineImpl[3];

			array[0] = getByproductPlantID_PrevAndNext(session, vrProductLine,
					mtCore, productPlantID, orderByComparator, true);

			array[1] = vrProductLine;

			array[2] = getByproductPlantID_PrevAndNext(session, vrProductLine,
					mtCore, productPlantID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRProductLine getByproductPlantID_PrevAndNext(Session session,
		VRProductLine vrProductLine, long mtCore, long productPlantID,
		OrderByComparator<VRProductLine> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRPRODUCTLINE_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTPLANTID_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTPLANTID_PRODUCTPLANTID_2);

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
			query.append(VRProductLineModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(productPlantID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductLine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductLine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr product lines where mtCore = &#63; and productPlantID = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 */
	@Override
	public void removeByproductPlantID(long mtCore, long productPlantID) {
		for (VRProductLine vrProductLine : findByproductPlantID(mtCore,
				productPlantID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductLine);
		}
	}

	/**
	 * Returns the number of vr product lines where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @return the number of matching vr product lines
	 */
	@Override
	public int countByproductPlantID(long mtCore, long productPlantID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTPLANTID;

		Object[] finderArgs = new Object[] { mtCore, productPlantID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRPRODUCTLINE_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTPLANTID_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTPLANTID_PRODUCTPLANTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(productPlantID);

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

	private static final String _FINDER_COLUMN_PRODUCTPLANTID_MTCORE_2 = "vrProductLine.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTPLANTID_PRODUCTPLANTID_2 = "vrProductLine.productPlantID = ?";

	public VRProductLinePersistenceImpl() {
		setModelClass(VRProductLine.class);
	}

	/**
	 * Caches the vr product line in the entity cache if it is enabled.
	 *
	 * @param vrProductLine the vr product line
	 */
	@Override
	public void cacheResult(VRProductLine vrProductLine) {
		entityCache.putResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineImpl.class, vrProductLine.getPrimaryKey(),
			vrProductLine);

		vrProductLine.resetOriginalValues();
	}

	/**
	 * Caches the vr product lines in the entity cache if it is enabled.
	 *
	 * @param vrProductLines the vr product lines
	 */
	@Override
	public void cacheResult(List<VRProductLine> vrProductLines) {
		for (VRProductLine vrProductLine : vrProductLines) {
			if (entityCache.getResult(
						VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
						VRProductLineImpl.class, vrProductLine.getPrimaryKey()) == null) {
				cacheResult(vrProductLine);
			}
			else {
				vrProductLine.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr product lines.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductLineImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr product line.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRProductLine vrProductLine) {
		entityCache.removeResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineImpl.class, vrProductLine.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRProductLine> vrProductLines) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductLine vrProductLine : vrProductLines) {
			entityCache.removeResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
				VRProductLineImpl.class, vrProductLine.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr product line with the primary key. Does not add the vr product line to the database.
	 *
	 * @param id the primary key for the new vr product line
	 * @return the new vr product line
	 */
	@Override
	public VRProductLine create(long id) {
		VRProductLine vrProductLine = new VRProductLineImpl();

		vrProductLine.setNew(true);
		vrProductLine.setPrimaryKey(id);

		return vrProductLine;
	}

	/**
	 * Removes the vr product line with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr product line
	 * @return the vr product line that was removed
	 * @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	 */
	@Override
	public VRProductLine remove(long id) throws NoSuchVRProductLineException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr product line with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr product line
	 * @return the vr product line that was removed
	 * @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	 */
	@Override
	public VRProductLine remove(Serializable primaryKey)
		throws NoSuchVRProductLineException {
		Session session = null;

		try {
			session = openSession();

			VRProductLine vrProductLine = (VRProductLine)session.get(VRProductLineImpl.class,
					primaryKey);

			if (vrProductLine == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductLineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductLine);
		}
		catch (NoSuchVRProductLineException nsee) {
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
	protected VRProductLine removeImpl(VRProductLine vrProductLine) {
		vrProductLine = toUnwrappedModel(vrProductLine);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductLine)) {
				vrProductLine = (VRProductLine)session.get(VRProductLineImpl.class,
						vrProductLine.getPrimaryKeyObj());
			}

			if (vrProductLine != null) {
				session.delete(vrProductLine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductLine != null) {
			clearCache(vrProductLine);
		}

		return vrProductLine;
	}

	@Override
	public VRProductLine updateImpl(VRProductLine vrProductLine) {
		vrProductLine = toUnwrappedModel(vrProductLine);

		boolean isNew = vrProductLine.isNew();

		VRProductLineModelImpl vrProductLineModelImpl = (VRProductLineModelImpl)vrProductLine;

		Session session = null;

		try {
			session = openSession();

			if (vrProductLine.isNew()) {
				session.save(vrProductLine);

				vrProductLine.setNew(false);
			}
			else {
				vrProductLine = (VRProductLine)session.merge(vrProductLine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRProductLineModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductLineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductLineModelImpl.getOriginalMtCore(),
						vrProductLineModelImpl.getOriginalProductPlantID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTPLANTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID,
					args);

				args = new Object[] {
						vrProductLineModelImpl.getMtCore(),
						vrProductLineModelImpl.getProductPlantID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTPLANTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID,
					args);
			}
		}

		entityCache.putResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
			VRProductLineImpl.class, vrProductLine.getPrimaryKey(),
			vrProductLine, false);

		vrProductLine.resetOriginalValues();

		return vrProductLine;
	}

	protected VRProductLine toUnwrappedModel(VRProductLine vrProductLine) {
		if (vrProductLine instanceof VRProductLineImpl) {
			return vrProductLine;
		}

		VRProductLineImpl vrProductLineImpl = new VRProductLineImpl();

		vrProductLineImpl.setNew(vrProductLine.isNew());
		vrProductLineImpl.setPrimaryKey(vrProductLine.getPrimaryKey());

		vrProductLineImpl.setId(vrProductLine.getId());
		vrProductLineImpl.setMtCore(vrProductLine.getMtCore());
		vrProductLineImpl.setProductPlantID(vrProductLine.getProductPlantID());
		vrProductLineImpl.setProductTypeID(vrProductLine.getProductTypeID());
		vrProductLineImpl.setSequenceNo(vrProductLine.getSequenceNo());
		vrProductLineImpl.setTrademark(vrProductLine.getTrademark());
		vrProductLineImpl.setTrademarkName(vrProductLine.getTrademarkName());
		vrProductLineImpl.setCommercialName(vrProductLine.getCommercialName());
		vrProductLineImpl.setModelCode(vrProductLine.getModelCode());
		vrProductLineImpl.setModifyDate(vrProductLine.getModifyDate());
		vrProductLineImpl.setSyncDate(vrProductLine.getSyncDate());

		return vrProductLineImpl;
	}

	/**
	 * Returns the vr product line with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr product line
	 * @return the vr product line
	 * @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	 */
	@Override
	public VRProductLine findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRProductLineException {
		VRProductLine vrProductLine = fetchByPrimaryKey(primaryKey);

		if (vrProductLine == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductLineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductLine;
	}

	/**
	 * Returns the vr product line with the primary key or throws a {@link NoSuchVRProductLineException} if it could not be found.
	 *
	 * @param id the primary key of the vr product line
	 * @return the vr product line
	 * @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	 */
	@Override
	public VRProductLine findByPrimaryKey(long id)
		throws NoSuchVRProductLineException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr product line with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr product line
	 * @return the vr product line, or <code>null</code> if a vr product line with the primary key could not be found
	 */
	@Override
	public VRProductLine fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
				VRProductLineImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductLine vrProductLine = (VRProductLine)serializable;

		if (vrProductLine == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductLine = (VRProductLine)session.get(VRProductLineImpl.class,
						primaryKey);

				if (vrProductLine != null) {
					cacheResult(vrProductLine);
				}
				else {
					entityCache.putResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
						VRProductLineImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
					VRProductLineImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductLine;
	}

	/**
	 * Returns the vr product line with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr product line
	 * @return the vr product line, or <code>null</code> if a vr product line with the primary key could not be found
	 */
	@Override
	public VRProductLine fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductLine> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductLine> map = new HashMap<Serializable, VRProductLine>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductLine vrProductLine = fetchByPrimaryKey(primaryKey);

			if (vrProductLine != null) {
				map.put(primaryKey, vrProductLine);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
					VRProductLineImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRProductLine)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTLINE_WHERE_PKS_IN);

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

			for (VRProductLine vrProductLine : (List<VRProductLine>)q.list()) {
				map.put(vrProductLine.getPrimaryKeyObj(), vrProductLine);

				cacheResult(vrProductLine);

				uncachedPrimaryKeys.remove(vrProductLine.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductLineModelImpl.ENTITY_CACHE_ENABLED,
					VRProductLineImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr product lines.
	 *
	 * @return the vr product lines
	 */
	@Override
	public List<VRProductLine> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr product lines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr product lines
	 * @param end the upper bound of the range of vr product lines (not inclusive)
	 * @return the range of vr product lines
	 */
	@Override
	public List<VRProductLine> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr product lines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr product lines
	 * @param end the upper bound of the range of vr product lines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr product lines
	 */
	@Override
	public List<VRProductLine> findAll(int start, int end,
		OrderByComparator<VRProductLine> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr product lines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr product lines
	 * @param end the upper bound of the range of vr product lines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr product lines
	 */
	@Override
	public List<VRProductLine> findAll(int start, int end,
		OrderByComparator<VRProductLine> orderByComparator,
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

		List<VRProductLine> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductLine>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTLINE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTLINE;

				if (pagination) {
					sql = sql.concat(VRProductLineModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductLine>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductLine>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the vr product lines from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductLine vrProductLine : findAll()) {
			remove(vrProductLine);
		}
	}

	/**
	 * Returns the number of vr product lines.
	 *
	 * @return the number of vr product lines
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTLINE);

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
		return VRProductLineModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr product line persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductLineImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTLINE = "SELECT vrProductLine FROM VRProductLine vrProductLine";
	private static final String _SQL_SELECT_VRPRODUCTLINE_WHERE_PKS_IN = "SELECT vrProductLine FROM VRProductLine vrProductLine WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTLINE_WHERE = "SELECT vrProductLine FROM VRProductLine vrProductLine WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTLINE = "SELECT COUNT(vrProductLine) FROM VRProductLine vrProductLine";
	private static final String _SQL_COUNT_VRPRODUCTLINE_WHERE = "SELECT COUNT(vrProductLine) FROM VRProductLine vrProductLine WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductLine.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductLine exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductLine exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductLinePersistenceImpl.class);
}