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

import com.fds.vr.business.exception.NoSuchVRProductClassificationException;
import com.fds.vr.business.model.VRProductClassification;
import com.fds.vr.business.model.impl.VRProductClassificationImpl;
import com.fds.vr.business.model.impl.VRProductClassificationModelImpl;
import com.fds.vr.business.service.persistence.VRProductClassificationPersistence;

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
 * The persistence implementation for the vr product classification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductClassificationPersistence
 * @see com.fds.vr.business.service.persistence.VRProductClassificationUtil
 * @generated
 */
@ProviderType
public class VRProductClassificationPersistenceImpl extends BasePersistenceImpl<VRProductClassification>
	implements VRProductClassificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductClassificationUtil} to access the vr product classification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductClassificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTPLANTID =
		new FinderPath(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByproductPlantID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID =
		new FinderPath(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByproductPlantID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRProductClassificationModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductClassificationModelImpl.PRODUCTPLANTID_COLUMN_BITMASK |
			VRProductClassificationModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTPLANTID = new FinderPath(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByproductPlantID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @return the matching vr product classifications
	 */
	@Override
	public List<VRProductClassification> findByproductPlantID(long mtCore,
		long productPlantID) {
		return findByproductPlantID(mtCore, productPlantID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param start the lower bound of the range of vr product classifications
	 * @param end the upper bound of the range of vr product classifications (not inclusive)
	 * @return the range of matching vr product classifications
	 */
	@Override
	public List<VRProductClassification> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end) {
		return findByproductPlantID(mtCore, productPlantID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param start the lower bound of the range of vr product classifications
	 * @param end the upper bound of the range of vr product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr product classifications
	 */
	@Override
	public List<VRProductClassification> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator) {
		return findByproductPlantID(mtCore, productPlantID, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param start the lower bound of the range of vr product classifications
	 * @param end the upper bound of the range of vr product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr product classifications
	 */
	@Override
	public List<VRProductClassification> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator,
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

		List<VRProductClassification> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductClassification>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductClassification vrProductClassification : list) {
					if ((mtCore != vrProductClassification.getMtCore()) ||
							(productPlantID != vrProductClassification.getProductPlantID())) {
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

			query.append(_SQL_SELECT_VRPRODUCTCLASSIFICATION_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTPLANTID_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTPLANTID_PRODUCTPLANTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductClassificationModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRProductClassification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductClassification>)QueryUtil.list(q,
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
	 * Returns the first vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr product classification
	 * @throws NoSuchVRProductClassificationException if a matching vr product classification could not be found
	 */
	@Override
	public VRProductClassification findByproductPlantID_First(long mtCore,
		long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator)
		throws NoSuchVRProductClassificationException {
		VRProductClassification vrProductClassification = fetchByproductPlantID_First(mtCore,
				productPlantID, orderByComparator);

		if (vrProductClassification != null) {
			return vrProductClassification;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productPlantID=");
		msg.append(productPlantID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductClassificationException(msg.toString());
	}

	/**
	 * Returns the first vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr product classification, or <code>null</code> if a matching vr product classification could not be found
	 */
	@Override
	public VRProductClassification fetchByproductPlantID_First(long mtCore,
		long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator) {
		List<VRProductClassification> list = findByproductPlantID(mtCore,
				productPlantID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr product classification
	 * @throws NoSuchVRProductClassificationException if a matching vr product classification could not be found
	 */
	@Override
	public VRProductClassification findByproductPlantID_Last(long mtCore,
		long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator)
		throws NoSuchVRProductClassificationException {
		VRProductClassification vrProductClassification = fetchByproductPlantID_Last(mtCore,
				productPlantID, orderByComparator);

		if (vrProductClassification != null) {
			return vrProductClassification;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productPlantID=");
		msg.append(productPlantID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductClassificationException(msg.toString());
	}

	/**
	 * Returns the last vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr product classification, or <code>null</code> if a matching vr product classification could not be found
	 */
	@Override
	public VRProductClassification fetchByproductPlantID_Last(long mtCore,
		long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator) {
		int count = countByproductPlantID(mtCore, productPlantID);

		if (count == 0) {
			return null;
		}

		List<VRProductClassification> list = findByproductPlantID(mtCore,
				productPlantID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr product classifications before and after the current vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param id the primary key of the current vr product classification
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr product classification
	 * @throws NoSuchVRProductClassificationException if a vr product classification with the primary key could not be found
	 */
	@Override
	public VRProductClassification[] findByproductPlantID_PrevAndNext(long id,
		long mtCore, long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator)
		throws NoSuchVRProductClassificationException {
		VRProductClassification vrProductClassification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductClassification[] array = new VRProductClassificationImpl[3];

			array[0] = getByproductPlantID_PrevAndNext(session,
					vrProductClassification, mtCore, productPlantID,
					orderByComparator, true);

			array[1] = vrProductClassification;

			array[2] = getByproductPlantID_PrevAndNext(session,
					vrProductClassification, mtCore, productPlantID,
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

	protected VRProductClassification getByproductPlantID_PrevAndNext(
		Session session, VRProductClassification vrProductClassification,
		long mtCore, long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator,
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

		query.append(_SQL_SELECT_VRPRODUCTCLASSIFICATION_WHERE);

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
			query.append(VRProductClassificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(productPlantID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductClassification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductClassification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr product classifications where mtCore = &#63; and productPlantID = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 */
	@Override
	public void removeByproductPlantID(long mtCore, long productPlantID) {
		for (VRProductClassification vrProductClassification : findByproductPlantID(
				mtCore, productPlantID, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrProductClassification);
		}
	}

	/**
	 * Returns the number of vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productPlantID the product plant ID
	 * @return the number of matching vr product classifications
	 */
	@Override
	public int countByproductPlantID(long mtCore, long productPlantID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTPLANTID;

		Object[] finderArgs = new Object[] { mtCore, productPlantID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRPRODUCTCLASSIFICATION_WHERE);

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

	private static final String _FINDER_COLUMN_PRODUCTPLANTID_MTCORE_2 = "vrProductClassification.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTPLANTID_PRODUCTPLANTID_2 = "vrProductClassification.productPlantID = ?";

	public VRProductClassificationPersistenceImpl() {
		setModelClass(VRProductClassification.class);
	}

	/**
	 * Caches the vr product classification in the entity cache if it is enabled.
	 *
	 * @param vrProductClassification the vr product classification
	 */
	@Override
	public void cacheResult(VRProductClassification vrProductClassification) {
		entityCache.putResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationImpl.class,
			vrProductClassification.getPrimaryKey(), vrProductClassification);

		vrProductClassification.resetOriginalValues();
	}

	/**
	 * Caches the vr product classifications in the entity cache if it is enabled.
	 *
	 * @param vrProductClassifications the vr product classifications
	 */
	@Override
	public void cacheResult(
		List<VRProductClassification> vrProductClassifications) {
		for (VRProductClassification vrProductClassification : vrProductClassifications) {
			if (entityCache.getResult(
						VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
						VRProductClassificationImpl.class,
						vrProductClassification.getPrimaryKey()) == null) {
				cacheResult(vrProductClassification);
			}
			else {
				vrProductClassification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr product classifications.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductClassificationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr product classification.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRProductClassification vrProductClassification) {
		entityCache.removeResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationImpl.class,
			vrProductClassification.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRProductClassification> vrProductClassifications) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductClassification vrProductClassification : vrProductClassifications) {
			entityCache.removeResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
				VRProductClassificationImpl.class,
				vrProductClassification.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr product classification with the primary key. Does not add the vr product classification to the database.
	 *
	 * @param id the primary key for the new vr product classification
	 * @return the new vr product classification
	 */
	@Override
	public VRProductClassification create(long id) {
		VRProductClassification vrProductClassification = new VRProductClassificationImpl();

		vrProductClassification.setNew(true);
		vrProductClassification.setPrimaryKey(id);

		return vrProductClassification;
	}

	/**
	 * Removes the vr product classification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr product classification
	 * @return the vr product classification that was removed
	 * @throws NoSuchVRProductClassificationException if a vr product classification with the primary key could not be found
	 */
	@Override
	public VRProductClassification remove(long id)
		throws NoSuchVRProductClassificationException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr product classification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr product classification
	 * @return the vr product classification that was removed
	 * @throws NoSuchVRProductClassificationException if a vr product classification with the primary key could not be found
	 */
	@Override
	public VRProductClassification remove(Serializable primaryKey)
		throws NoSuchVRProductClassificationException {
		Session session = null;

		try {
			session = openSession();

			VRProductClassification vrProductClassification = (VRProductClassification)session.get(VRProductClassificationImpl.class,
					primaryKey);

			if (vrProductClassification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductClassificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductClassification);
		}
		catch (NoSuchVRProductClassificationException nsee) {
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
	protected VRProductClassification removeImpl(
		VRProductClassification vrProductClassification) {
		vrProductClassification = toUnwrappedModel(vrProductClassification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductClassification)) {
				vrProductClassification = (VRProductClassification)session.get(VRProductClassificationImpl.class,
						vrProductClassification.getPrimaryKeyObj());
			}

			if (vrProductClassification != null) {
				session.delete(vrProductClassification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductClassification != null) {
			clearCache(vrProductClassification);
		}

		return vrProductClassification;
	}

	@Override
	public VRProductClassification updateImpl(
		VRProductClassification vrProductClassification) {
		vrProductClassification = toUnwrappedModel(vrProductClassification);

		boolean isNew = vrProductClassification.isNew();

		VRProductClassificationModelImpl vrProductClassificationModelImpl = (VRProductClassificationModelImpl)vrProductClassification;

		Session session = null;

		try {
			session = openSession();

			if (vrProductClassification.isNew()) {
				session.save(vrProductClassification);

				vrProductClassification.setNew(false);
			}
			else {
				vrProductClassification = (VRProductClassification)session.merge(vrProductClassification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRProductClassificationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductClassificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductClassificationModelImpl.getOriginalMtCore(),
						vrProductClassificationModelImpl.getOriginalProductPlantID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTPLANTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID,
					args);

				args = new Object[] {
						vrProductClassificationModelImpl.getMtCore(),
						vrProductClassificationModelImpl.getProductPlantID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTPLANTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTPLANTID,
					args);
			}
		}

		entityCache.putResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductClassificationImpl.class,
			vrProductClassification.getPrimaryKey(), vrProductClassification,
			false);

		vrProductClassification.resetOriginalValues();

		return vrProductClassification;
	}

	protected VRProductClassification toUnwrappedModel(
		VRProductClassification vrProductClassification) {
		if (vrProductClassification instanceof VRProductClassificationImpl) {
			return vrProductClassification;
		}

		VRProductClassificationImpl vrProductClassificationImpl = new VRProductClassificationImpl();

		vrProductClassificationImpl.setNew(vrProductClassification.isNew());
		vrProductClassificationImpl.setPrimaryKey(vrProductClassification.getPrimaryKey());

		vrProductClassificationImpl.setId(vrProductClassification.getId());
		vrProductClassificationImpl.setMtCore(vrProductClassification.getMtCore());
		vrProductClassificationImpl.setProductPlantID(vrProductClassification.getProductPlantID());
		vrProductClassificationImpl.setSequenceNo(vrProductClassification.getSequenceNo());
		vrProductClassificationImpl.setProductClassificationCode(vrProductClassification.getProductClassificationCode());
		vrProductClassificationImpl.setProductClassificationDescription(vrProductClassification.getProductClassificationDescription());
		vrProductClassificationImpl.setModifyDate(vrProductClassification.getModifyDate());
		vrProductClassificationImpl.setSyncDate(vrProductClassification.getSyncDate());

		return vrProductClassificationImpl;
	}

	/**
	 * Returns the vr product classification with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr product classification
	 * @return the vr product classification
	 * @throws NoSuchVRProductClassificationException if a vr product classification with the primary key could not be found
	 */
	@Override
	public VRProductClassification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRProductClassificationException {
		VRProductClassification vrProductClassification = fetchByPrimaryKey(primaryKey);

		if (vrProductClassification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductClassificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductClassification;
	}

	/**
	 * Returns the vr product classification with the primary key or throws a {@link NoSuchVRProductClassificationException} if it could not be found.
	 *
	 * @param id the primary key of the vr product classification
	 * @return the vr product classification
	 * @throws NoSuchVRProductClassificationException if a vr product classification with the primary key could not be found
	 */
	@Override
	public VRProductClassification findByPrimaryKey(long id)
		throws NoSuchVRProductClassificationException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr product classification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr product classification
	 * @return the vr product classification, or <code>null</code> if a vr product classification with the primary key could not be found
	 */
	@Override
	public VRProductClassification fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
				VRProductClassificationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductClassification vrProductClassification = (VRProductClassification)serializable;

		if (vrProductClassification == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductClassification = (VRProductClassification)session.get(VRProductClassificationImpl.class,
						primaryKey);

				if (vrProductClassification != null) {
					cacheResult(vrProductClassification);
				}
				else {
					entityCache.putResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
						VRProductClassificationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRProductClassificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductClassification;
	}

	/**
	 * Returns the vr product classification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr product classification
	 * @return the vr product classification, or <code>null</code> if a vr product classification with the primary key could not be found
	 */
	@Override
	public VRProductClassification fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductClassification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductClassification> map = new HashMap<Serializable, VRProductClassification>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductClassification vrProductClassification = fetchByPrimaryKey(primaryKey);

			if (vrProductClassification != null) {
				map.put(primaryKey, vrProductClassification);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRProductClassificationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRProductClassification)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTCLASSIFICATION_WHERE_PKS_IN);

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

			for (VRProductClassification vrProductClassification : (List<VRProductClassification>)q.list()) {
				map.put(vrProductClassification.getPrimaryKeyObj(),
					vrProductClassification);

				cacheResult(vrProductClassification);

				uncachedPrimaryKeys.remove(vrProductClassification.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRProductClassificationImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr product classifications.
	 *
	 * @return the vr product classifications
	 */
	@Override
	public List<VRProductClassification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr product classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr product classifications
	 * @param end the upper bound of the range of vr product classifications (not inclusive)
	 * @return the range of vr product classifications
	 */
	@Override
	public List<VRProductClassification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr product classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr product classifications
	 * @param end the upper bound of the range of vr product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr product classifications
	 */
	@Override
	public List<VRProductClassification> findAll(int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr product classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr product classifications
	 * @param end the upper bound of the range of vr product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr product classifications
	 */
	@Override
	public List<VRProductClassification> findAll(int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator,
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

		List<VRProductClassification> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductClassification>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTCLASSIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTCLASSIFICATION;

				if (pagination) {
					sql = sql.concat(VRProductClassificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductClassification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductClassification>)QueryUtil.list(q,
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
	 * Removes all the vr product classifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductClassification vrProductClassification : findAll()) {
			remove(vrProductClassification);
		}
	}

	/**
	 * Returns the number of vr product classifications.
	 *
	 * @return the number of vr product classifications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTCLASSIFICATION);

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
		return VRProductClassificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr product classification persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductClassificationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTCLASSIFICATION = "SELECT vrProductClassification FROM VRProductClassification vrProductClassification";
	private static final String _SQL_SELECT_VRPRODUCTCLASSIFICATION_WHERE_PKS_IN =
		"SELECT vrProductClassification FROM VRProductClassification vrProductClassification WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTCLASSIFICATION_WHERE = "SELECT vrProductClassification FROM VRProductClassification vrProductClassification WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTCLASSIFICATION = "SELECT COUNT(vrProductClassification) FROM VRProductClassification vrProductClassification";
	private static final String _SQL_COUNT_VRPRODUCTCLASSIFICATION_WHERE = "SELECT COUNT(vrProductClassification) FROM VRProductClassification vrProductClassification WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductClassification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductClassification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductClassification exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductClassificationPersistenceImpl.class);
}