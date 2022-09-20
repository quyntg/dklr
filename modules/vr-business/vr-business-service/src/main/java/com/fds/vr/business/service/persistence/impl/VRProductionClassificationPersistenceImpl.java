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

import com.fds.vr.business.exception.NoSuchVRProductionClassificationException;
import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.impl.VRProductionClassificationImpl;
import com.fds.vr.business.model.impl.VRProductionClassificationModelImpl;
import com.fds.vr.business.service.persistence.VRProductionClassificationPersistence;

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
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vr production classification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionClassificationPersistence
 * @see com.fds.vr.business.service.persistence.VRProductionClassificationUtil
 * @generated
 */
@ProviderType
public class VRProductionClassificationPersistenceImpl
	extends BasePersistenceImpl<VRProductionClassification>
	implements VRProductionClassificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductionClassificationUtil} to access the vr production classification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductionClassificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRProductionClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRProductionClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PPC = new FinderPath(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRProductionClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPPC",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC = new FinderPath(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRProductionClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPPC",
			new String[] { String.class.getName() },
			VRProductionClassificationModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRProductionClassificationModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PPC = new FinderPath(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPPC", new String[] { String.class.getName() });

	/**
	 * Returns all the vr production classifications where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr production classifications
	 */
	@Override
	public List<VRProductionClassification> findByPPC(
		String productionPlantCode) {
		return findByPPC(productionPlantCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production classifications where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production classifications
	 * @param end the upper bound of the range of vr production classifications (not inclusive)
	 * @return the range of matching vr production classifications
	 */
	@Override
	public List<VRProductionClassification> findByPPC(
		String productionPlantCode, int start, int end) {
		return findByPPC(productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production classifications where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production classifications
	 * @param end the upper bound of the range of vr production classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production classifications
	 */
	@Override
	public List<VRProductionClassification> findByPPC(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionClassification> orderByComparator) {
		return findByPPC(productionPlantCode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr production classifications where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production classifications
	 * @param end the upper bound of the range of vr production classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production classifications
	 */
	@Override
	public List<VRProductionClassification> findByPPC(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionClassification> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC;
			finderArgs = new Object[] { productionPlantCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PPC;
			finderArgs = new Object[] {
					productionPlantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionClassification> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionClassification>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionClassification vrProductionClassification : list) {
					if (!Objects.equals(productionPlantCode,
								vrProductionClassification.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONCLASSIFICATION_WHERE);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionClassificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (!pagination) {
					list = (List<VRProductionClassification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionClassification>)QueryUtil.list(q,
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
	 * Returns the first vr production classification in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production classification
	 * @throws NoSuchVRProductionClassificationException if a matching vr production classification could not be found
	 */
	@Override
	public VRProductionClassification findByPPC_First(
		String productionPlantCode,
		OrderByComparator<VRProductionClassification> orderByComparator)
		throws NoSuchVRProductionClassificationException {
		VRProductionClassification vrProductionClassification = fetchByPPC_First(productionPlantCode,
				orderByComparator);

		if (vrProductionClassification != null) {
			return vrProductionClassification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionClassificationException(msg.toString());
	}

	/**
	 * Returns the first vr production classification in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production classification, or <code>null</code> if a matching vr production classification could not be found
	 */
	@Override
	public VRProductionClassification fetchByPPC_First(
		String productionPlantCode,
		OrderByComparator<VRProductionClassification> orderByComparator) {
		List<VRProductionClassification> list = findByPPC(productionPlantCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production classification in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production classification
	 * @throws NoSuchVRProductionClassificationException if a matching vr production classification could not be found
	 */
	@Override
	public VRProductionClassification findByPPC_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionClassification> orderByComparator)
		throws NoSuchVRProductionClassificationException {
		VRProductionClassification vrProductionClassification = fetchByPPC_Last(productionPlantCode,
				orderByComparator);

		if (vrProductionClassification != null) {
			return vrProductionClassification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionClassificationException(msg.toString());
	}

	/**
	 * Returns the last vr production classification in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production classification, or <code>null</code> if a matching vr production classification could not be found
	 */
	@Override
	public VRProductionClassification fetchByPPC_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionClassification> orderByComparator) {
		int count = countByPPC(productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRProductionClassification> list = findByPPC(productionPlantCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production classifications before and after the current vr production classification in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vr production classification
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production classification
	 * @throws NoSuchVRProductionClassificationException if a vr production classification with the primary key could not be found
	 */
	@Override
	public VRProductionClassification[] findByPPC_PrevAndNext(long id,
		String productionPlantCode,
		OrderByComparator<VRProductionClassification> orderByComparator)
		throws NoSuchVRProductionClassificationException {
		VRProductionClassification vrProductionClassification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionClassification[] array = new VRProductionClassificationImpl[3];

			array[0] = getByPPC_PrevAndNext(session,
					vrProductionClassification, productionPlantCode,
					orderByComparator, true);

			array[1] = vrProductionClassification;

			array[2] = getByPPC_PrevAndNext(session,
					vrProductionClassification, productionPlantCode,
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

	protected VRProductionClassification getByPPC_PrevAndNext(Session session,
		VRProductionClassification vrProductionClassification,
		String productionPlantCode,
		OrderByComparator<VRProductionClassification> orderByComparator,
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

		query.append(_SQL_SELECT_VRPRODUCTIONCLASSIFICATION_WHERE);

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_2);
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
			query.append(VRProductionClassificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionClassification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionClassification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production classifications where productionPlantCode = &#63; from the database.
	 *
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByPPC(String productionPlantCode) {
		for (VRProductionClassification vrProductionClassification : findByPPC(
				productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionClassification);
		}
	}

	/**
	 * Returns the number of vr production classifications where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr production classifications
	 */
	@Override
	public int countByPPC(String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PPC;

		Object[] finderArgs = new Object[] { productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONCLASSIFICATION_WHERE);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
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

	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_1 = "vrProductionClassification.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_2 = "vrProductionClassification.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_3 = "(vrProductionClassification.productionPlantCode IS NULL OR vrProductionClassification.productionPlantCode = '')";

	public VRProductionClassificationPersistenceImpl() {
		setModelClass(VRProductionClassification.class);
	}

	/**
	 * Caches the vr production classification in the entity cache if it is enabled.
	 *
	 * @param vrProductionClassification the vr production classification
	 */
	@Override
	public void cacheResult(
		VRProductionClassification vrProductionClassification) {
		entityCache.putResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationImpl.class,
			vrProductionClassification.getPrimaryKey(),
			vrProductionClassification);

		vrProductionClassification.resetOriginalValues();
	}

	/**
	 * Caches the vr production classifications in the entity cache if it is enabled.
	 *
	 * @param vrProductionClassifications the vr production classifications
	 */
	@Override
	public void cacheResult(
		List<VRProductionClassification> vrProductionClassifications) {
		for (VRProductionClassification vrProductionClassification : vrProductionClassifications) {
			if (entityCache.getResult(
						VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionClassificationImpl.class,
						vrProductionClassification.getPrimaryKey()) == null) {
				cacheResult(vrProductionClassification);
			}
			else {
				vrProductionClassification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr production classifications.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductionClassificationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr production classification.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRProductionClassification vrProductionClassification) {
		entityCache.removeResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationImpl.class,
			vrProductionClassification.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRProductionClassification> vrProductionClassifications) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductionClassification vrProductionClassification : vrProductionClassifications) {
			entityCache.removeResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionClassificationImpl.class,
				vrProductionClassification.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr production classification with the primary key. Does not add the vr production classification to the database.
	 *
	 * @param id the primary key for the new vr production classification
	 * @return the new vr production classification
	 */
	@Override
	public VRProductionClassification create(long id) {
		VRProductionClassification vrProductionClassification = new VRProductionClassificationImpl();

		vrProductionClassification.setNew(true);
		vrProductionClassification.setPrimaryKey(id);

		return vrProductionClassification;
	}

	/**
	 * Removes the vr production classification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr production classification
	 * @return the vr production classification that was removed
	 * @throws NoSuchVRProductionClassificationException if a vr production classification with the primary key could not be found
	 */
	@Override
	public VRProductionClassification remove(long id)
		throws NoSuchVRProductionClassificationException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr production classification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr production classification
	 * @return the vr production classification that was removed
	 * @throws NoSuchVRProductionClassificationException if a vr production classification with the primary key could not be found
	 */
	@Override
	public VRProductionClassification remove(Serializable primaryKey)
		throws NoSuchVRProductionClassificationException {
		Session session = null;

		try {
			session = openSession();

			VRProductionClassification vrProductionClassification = (VRProductionClassification)session.get(VRProductionClassificationImpl.class,
					primaryKey);

			if (vrProductionClassification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductionClassificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductionClassification);
		}
		catch (NoSuchVRProductionClassificationException nsee) {
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
	protected VRProductionClassification removeImpl(
		VRProductionClassification vrProductionClassification) {
		vrProductionClassification = toUnwrappedModel(vrProductionClassification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductionClassification)) {
				vrProductionClassification = (VRProductionClassification)session.get(VRProductionClassificationImpl.class,
						vrProductionClassification.getPrimaryKeyObj());
			}

			if (vrProductionClassification != null) {
				session.delete(vrProductionClassification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductionClassification != null) {
			clearCache(vrProductionClassification);
		}

		return vrProductionClassification;
	}

	@Override
	public VRProductionClassification updateImpl(
		VRProductionClassification vrProductionClassification) {
		vrProductionClassification = toUnwrappedModel(vrProductionClassification);

		boolean isNew = vrProductionClassification.isNew();

		VRProductionClassificationModelImpl vrProductionClassificationModelImpl = (VRProductionClassificationModelImpl)vrProductionClassification;

		Session session = null;

		try {
			session = openSession();

			if (vrProductionClassification.isNew()) {
				session.save(vrProductionClassification);

				vrProductionClassification.setNew(false);
			}
			else {
				vrProductionClassification = (VRProductionClassification)session.merge(vrProductionClassification);
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
				!VRProductionClassificationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductionClassificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionClassificationModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PPC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC,
					args);

				args = new Object[] {
						vrProductionClassificationModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PPC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC,
					args);
			}
		}

		entityCache.putResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionClassificationImpl.class,
			vrProductionClassification.getPrimaryKey(),
			vrProductionClassification, false);

		vrProductionClassification.resetOriginalValues();

		return vrProductionClassification;
	}

	protected VRProductionClassification toUnwrappedModel(
		VRProductionClassification vrProductionClassification) {
		if (vrProductionClassification instanceof VRProductionClassificationImpl) {
			return vrProductionClassification;
		}

		VRProductionClassificationImpl vrProductionClassificationImpl = new VRProductionClassificationImpl();

		vrProductionClassificationImpl.setNew(vrProductionClassification.isNew());
		vrProductionClassificationImpl.setPrimaryKey(vrProductionClassification.getPrimaryKey());

		vrProductionClassificationImpl.setId(vrProductionClassification.getId());
		vrProductionClassificationImpl.setMtCore(vrProductionClassification.getMtCore());
		vrProductionClassificationImpl.setApplicantProfileId(vrProductionClassification.getApplicantProfileId());
		vrProductionClassificationImpl.setApplicantCode(vrProductionClassification.getApplicantCode());
		vrProductionClassificationImpl.setProductionPlantId(vrProductionClassification.getProductionPlantId());
		vrProductionClassificationImpl.setProductionPlantCode(vrProductionClassification.getProductionPlantCode());
		vrProductionClassificationImpl.setSequenceNo(vrProductionClassification.getSequenceNo());
		vrProductionClassificationImpl.setProductClassificationCode(vrProductionClassification.getProductClassificationCode());
		vrProductionClassificationImpl.setProductClassificationDescription(vrProductionClassification.getProductClassificationDescription());
		vrProductionClassificationImpl.setClassificationMode(vrProductionClassification.getClassificationMode());
		vrProductionClassificationImpl.setRemarks(vrProductionClassification.getRemarks());
		vrProductionClassificationImpl.setStatus(vrProductionClassification.getStatus());
		vrProductionClassificationImpl.setModifyDate(vrProductionClassification.getModifyDate());
		vrProductionClassificationImpl.setSyncDate(vrProductionClassification.getSyncDate());

		return vrProductionClassificationImpl;
	}

	/**
	 * Returns the vr production classification with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production classification
	 * @return the vr production classification
	 * @throws NoSuchVRProductionClassificationException if a vr production classification with the primary key could not be found
	 */
	@Override
	public VRProductionClassification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRProductionClassificationException {
		VRProductionClassification vrProductionClassification = fetchByPrimaryKey(primaryKey);

		if (vrProductionClassification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductionClassificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductionClassification;
	}

	/**
	 * Returns the vr production classification with the primary key or throws a {@link NoSuchVRProductionClassificationException} if it could not be found.
	 *
	 * @param id the primary key of the vr production classification
	 * @return the vr production classification
	 * @throws NoSuchVRProductionClassificationException if a vr production classification with the primary key could not be found
	 */
	@Override
	public VRProductionClassification findByPrimaryKey(long id)
		throws NoSuchVRProductionClassificationException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr production classification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production classification
	 * @return the vr production classification, or <code>null</code> if a vr production classification with the primary key could not be found
	 */
	@Override
	public VRProductionClassification fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionClassificationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductionClassification vrProductionClassification = (VRProductionClassification)serializable;

		if (vrProductionClassification == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductionClassification = (VRProductionClassification)session.get(VRProductionClassificationImpl.class,
						primaryKey);

				if (vrProductionClassification != null) {
					cacheResult(vrProductionClassification);
				}
				else {
					entityCache.putResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionClassificationImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionClassificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductionClassification;
	}

	/**
	 * Returns the vr production classification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr production classification
	 * @return the vr production classification, or <code>null</code> if a vr production classification with the primary key could not be found
	 */
	@Override
	public VRProductionClassification fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductionClassification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductionClassification> map = new HashMap<Serializable, VRProductionClassification>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductionClassification vrProductionClassification = fetchByPrimaryKey(primaryKey);

			if (vrProductionClassification != null) {
				map.put(primaryKey, vrProductionClassification);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionClassificationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRProductionClassification)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTIONCLASSIFICATION_WHERE_PKS_IN);

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

			for (VRProductionClassification vrProductionClassification : (List<VRProductionClassification>)q.list()) {
				map.put(vrProductionClassification.getPrimaryKeyObj(),
					vrProductionClassification);

				cacheResult(vrProductionClassification);

				uncachedPrimaryKeys.remove(vrProductionClassification.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductionClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionClassificationImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr production classifications.
	 *
	 * @return the vr production classifications
	 */
	@Override
	public List<VRProductionClassification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production classifications
	 * @param end the upper bound of the range of vr production classifications (not inclusive)
	 * @return the range of vr production classifications
	 */
	@Override
	public List<VRProductionClassification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production classifications
	 * @param end the upper bound of the range of vr production classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr production classifications
	 */
	@Override
	public List<VRProductionClassification> findAll(int start, int end,
		OrderByComparator<VRProductionClassification> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production classifications
	 * @param end the upper bound of the range of vr production classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr production classifications
	 */
	@Override
	public List<VRProductionClassification> findAll(int start, int end,
		OrderByComparator<VRProductionClassification> orderByComparator,
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

		List<VRProductionClassification> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionClassification>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTIONCLASSIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTIONCLASSIFICATION;

				if (pagination) {
					sql = sql.concat(VRProductionClassificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductionClassification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionClassification>)QueryUtil.list(q,
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
	 * Removes all the vr production classifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductionClassification vrProductionClassification : findAll()) {
			remove(vrProductionClassification);
		}
	}

	/**
	 * Returns the number of vr production classifications.
	 *
	 * @return the number of vr production classifications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTIONCLASSIFICATION);

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
		return VRProductionClassificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr production classification persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductionClassificationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTIONCLASSIFICATION = "SELECT vrProductionClassification FROM VRProductionClassification vrProductionClassification";
	private static final String _SQL_SELECT_VRPRODUCTIONCLASSIFICATION_WHERE_PKS_IN =
		"SELECT vrProductionClassification FROM VRProductionClassification vrProductionClassification WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTIONCLASSIFICATION_WHERE = "SELECT vrProductionClassification FROM VRProductionClassification vrProductionClassification WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTIONCLASSIFICATION = "SELECT COUNT(vrProductionClassification) FROM VRProductionClassification vrProductionClassification";
	private static final String _SQL_COUNT_VRPRODUCTIONCLASSIFICATION_WHERE = "SELECT COUNT(vrProductionClassification) FROM VRProductionClassification vrProductionClassification WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductionClassification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductionClassification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductionClassification exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductionClassificationPersistenceImpl.class);
}