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

import com.fds.vr.business.exception.NoSuchVRProductionPlantSupplierException;
import com.fds.vr.business.model.VRProductionPlantSupplier;
import com.fds.vr.business.model.impl.VRProductionPlantSupplierImpl;
import com.fds.vr.business.model.impl.VRProductionPlantSupplierModelImpl;
import com.fds.vr.business.service.persistence.VRProductionPlantSupplierPersistence;

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
 * The persistence implementation for the vr production plant supplier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantSupplierPersistence
 * @see com.fds.vr.business.service.persistence.VRProductionPlantSupplierUtil
 * @generated
 */
@ProviderType
public class VRProductionPlantSupplierPersistenceImpl
	extends BasePersistenceImpl<VRProductionPlantSupplier>
	implements VRProductionPlantSupplierPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductionPlantSupplierUtil} to access the vr production plant supplier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductionPlantSupplierImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONCODE =
		new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycorporationCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE =
		new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycorporationCode",
			new String[] { String.class.getName() },
			VRProductionPlantSupplierModelImpl.CORPORATIONCODE_COLUMN_BITMASK |
			VRProductionPlantSupplierModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONCODE = new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycorporationCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr production plant suppliers where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @return the matching vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findBycorporationCode(
		String corporationCode) {
		return findBycorporationCode(corporationCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant suppliers where corporationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @return the range of matching vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findBycorporationCode(
		String corporationCode, int start, int end) {
		return findBycorporationCode(corporationCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant suppliers where corporationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findBycorporationCode(
		String corporationCode, int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		return findBycorporationCode(corporationCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant suppliers where corporationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findBycorporationCode(
		String corporationCode, int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE;
			finderArgs = new Object[] { corporationCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONCODE;
			finderArgs = new Object[] {
					corporationCode,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlantSupplier> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantSupplier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlantSupplier vrProductionPlantSupplier : list) {
					if (!Objects.equals(corporationCode,
								vrProductionPlantSupplier.getCorporationCode())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER_WHERE);

			boolean bindCorporationCode = false;

			if (corporationCode == null) {
				query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_1);
			}
			else if (corporationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_3);
			}
			else {
				bindCorporationCode = true;

				query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantSupplierModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationCode) {
					qPos.add(corporationCode);
				}

				if (!pagination) {
					list = (List<VRProductionPlantSupplier>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantSupplier>)QueryUtil.list(q,
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
	 * Returns the first vr production plant supplier in the ordered set where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant supplier
	 * @throws NoSuchVRProductionPlantSupplierException if a matching vr production plant supplier could not be found
	 */
	@Override
	public VRProductionPlantSupplier findBycorporationCode_First(
		String corporationCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException {
		VRProductionPlantSupplier vrProductionPlantSupplier = fetchBycorporationCode_First(corporationCode,
				orderByComparator);

		if (vrProductionPlantSupplier != null) {
			return vrProductionPlantSupplier;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationCode=");
		msg.append(corporationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantSupplierException(msg.toString());
	}

	/**
	 * Returns the first vr production plant supplier in the ordered set where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant supplier, or <code>null</code> if a matching vr production plant supplier could not be found
	 */
	@Override
	public VRProductionPlantSupplier fetchBycorporationCode_First(
		String corporationCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		List<VRProductionPlantSupplier> list = findBycorporationCode(corporationCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant supplier in the ordered set where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant supplier
	 * @throws NoSuchVRProductionPlantSupplierException if a matching vr production plant supplier could not be found
	 */
	@Override
	public VRProductionPlantSupplier findBycorporationCode_Last(
		String corporationCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException {
		VRProductionPlantSupplier vrProductionPlantSupplier = fetchBycorporationCode_Last(corporationCode,
				orderByComparator);

		if (vrProductionPlantSupplier != null) {
			return vrProductionPlantSupplier;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationCode=");
		msg.append(corporationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantSupplierException(msg.toString());
	}

	/**
	 * Returns the last vr production plant supplier in the ordered set where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant supplier, or <code>null</code> if a matching vr production plant supplier could not be found
	 */
	@Override
	public VRProductionPlantSupplier fetchBycorporationCode_Last(
		String corporationCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		int count = countBycorporationCode(corporationCode);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlantSupplier> list = findBycorporationCode(corporationCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plant suppliers before and after the current vr production plant supplier in the ordered set where corporationCode = &#63;.
	 *
	 * @param id the primary key of the current vr production plant supplier
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant supplier
	 * @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	 */
	@Override
	public VRProductionPlantSupplier[] findBycorporationCode_PrevAndNext(
		long id, String corporationCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException {
		VRProductionPlantSupplier vrProductionPlantSupplier = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlantSupplier[] array = new VRProductionPlantSupplierImpl[3];

			array[0] = getBycorporationCode_PrevAndNext(session,
					vrProductionPlantSupplier, corporationCode,
					orderByComparator, true);

			array[1] = vrProductionPlantSupplier;

			array[2] = getBycorporationCode_PrevAndNext(session,
					vrProductionPlantSupplier, corporationCode,
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

	protected VRProductionPlantSupplier getBycorporationCode_PrevAndNext(
		Session session, VRProductionPlantSupplier vrProductionPlantSupplier,
		String corporationCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator,
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

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER_WHERE);

		boolean bindCorporationCode = false;

		if (corporationCode == null) {
			query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_1);
		}
		else if (corporationCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_3);
		}
		else {
			bindCorporationCode = true;

			query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_2);
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
			query.append(VRProductionPlantSupplierModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationCode) {
			qPos.add(corporationCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlantSupplier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlantSupplier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plant suppliers where corporationCode = &#63; from the database.
	 *
	 * @param corporationCode the corporation code
	 */
	@Override
	public void removeBycorporationCode(String corporationCode) {
		for (VRProductionPlantSupplier vrProductionPlantSupplier : findBycorporationCode(
				corporationCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlantSupplier);
		}
	}

	/**
	 * Returns the number of vr production plant suppliers where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @return the number of matching vr production plant suppliers
	 */
	@Override
	public int countBycorporationCode(String corporationCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONCODE;

		Object[] finderArgs = new Object[] { corporationCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANTSUPPLIER_WHERE);

			boolean bindCorporationCode = false;

			if (corporationCode == null) {
				query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_1);
			}
			else if (corporationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_3);
			}
			else {
				bindCorporationCode = true;

				query.append(_FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationCode) {
					qPos.add(corporationCode);
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

	private static final String _FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_1 =
		"vrProductionPlantSupplier.corporationCode IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_2 =
		"vrProductionPlantSupplier.corporationCode = ?";
	private static final String _FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_3 =
		"(vrProductionPlantSupplier.corporationCode IS NULL OR vrProductionPlantSupplier.corporationCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE =
		new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE =
		new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantCode",
			new String[] { String.class.getName() },
			VRProductionPlantSupplierModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRProductionPlantSupplierModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE = new FinderPath(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr production plant suppliers where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findByproductionPlantCode(
		String productionPlantCode) {
		return findByproductionPlantCode(productionPlantCode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant suppliers where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @return the range of matching vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findByproductionPlantCode(
		String productionPlantCode, int start, int end) {
		return findByproductionPlantCode(productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant suppliers where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findByproductionPlantCode(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		return findByproductionPlantCode(productionPlantCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant suppliers where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findByproductionPlantCode(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] { productionPlantCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					productionPlantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlantSupplier> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantSupplier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlantSupplier vrProductionPlantSupplier : list) {
					if (!Objects.equals(productionPlantCode,
								vrProductionPlantSupplier.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER_WHERE);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantSupplierModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRProductionPlantSupplier>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantSupplier>)QueryUtil.list(q,
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
	 * Returns the first vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant supplier
	 * @throws NoSuchVRProductionPlantSupplierException if a matching vr production plant supplier could not be found
	 */
	@Override
	public VRProductionPlantSupplier findByproductionPlantCode_First(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException {
		VRProductionPlantSupplier vrProductionPlantSupplier = fetchByproductionPlantCode_First(productionPlantCode,
				orderByComparator);

		if (vrProductionPlantSupplier != null) {
			return vrProductionPlantSupplier;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantSupplierException(msg.toString());
	}

	/**
	 * Returns the first vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant supplier, or <code>null</code> if a matching vr production plant supplier could not be found
	 */
	@Override
	public VRProductionPlantSupplier fetchByproductionPlantCode_First(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		List<VRProductionPlantSupplier> list = findByproductionPlantCode(productionPlantCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant supplier
	 * @throws NoSuchVRProductionPlantSupplierException if a matching vr production plant supplier could not be found
	 */
	@Override
	public VRProductionPlantSupplier findByproductionPlantCode_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException {
		VRProductionPlantSupplier vrProductionPlantSupplier = fetchByproductionPlantCode_Last(productionPlantCode,
				orderByComparator);

		if (vrProductionPlantSupplier != null) {
			return vrProductionPlantSupplier;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantSupplierException(msg.toString());
	}

	/**
	 * Returns the last vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant supplier, or <code>null</code> if a matching vr production plant supplier could not be found
	 */
	@Override
	public VRProductionPlantSupplier fetchByproductionPlantCode_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		int count = countByproductionPlantCode(productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlantSupplier> list = findByproductionPlantCode(productionPlantCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plant suppliers before and after the current vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vr production plant supplier
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant supplier
	 * @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	 */
	@Override
	public VRProductionPlantSupplier[] findByproductionPlantCode_PrevAndNext(
		long id, String productionPlantCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException {
		VRProductionPlantSupplier vrProductionPlantSupplier = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlantSupplier[] array = new VRProductionPlantSupplierImpl[3];

			array[0] = getByproductionPlantCode_PrevAndNext(session,
					vrProductionPlantSupplier, productionPlantCode,
					orderByComparator, true);

			array[1] = vrProductionPlantSupplier;

			array[2] = getByproductionPlantCode_PrevAndNext(session,
					vrProductionPlantSupplier, productionPlantCode,
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

	protected VRProductionPlantSupplier getByproductionPlantCode_PrevAndNext(
		Session session, VRProductionPlantSupplier vrProductionPlantSupplier,
		String productionPlantCode,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator,
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

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER_WHERE);

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
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
			query.append(VRProductionPlantSupplierModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlantSupplier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlantSupplier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plant suppliers where productionPlantCode = &#63; from the database.
	 *
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByproductionPlantCode(String productionPlantCode) {
		for (VRProductionPlantSupplier vrProductionPlantSupplier : findByproductionPlantCode(
				productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlantSupplier);
		}
	}

	/**
	 * Returns the number of vr production plant suppliers where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr production plant suppliers
	 */
	@Override
	public int countByproductionPlantCode(String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE;

		Object[] finderArgs = new Object[] { productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANTSUPPLIER_WHERE);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1 =
		"vrProductionPlantSupplier.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2 =
		"vrProductionPlantSupplier.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3 =
		"(vrProductionPlantSupplier.productionPlantCode IS NULL OR vrProductionPlantSupplier.productionPlantCode = '')";

	public VRProductionPlantSupplierPersistenceImpl() {
		setModelClass(VRProductionPlantSupplier.class);
	}

	/**
	 * Caches the vr production plant supplier in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantSupplier the vr production plant supplier
	 */
	@Override
	public void cacheResult(VRProductionPlantSupplier vrProductionPlantSupplier) {
		entityCache.putResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			vrProductionPlantSupplier.getPrimaryKey(), vrProductionPlantSupplier);

		vrProductionPlantSupplier.resetOriginalValues();
	}

	/**
	 * Caches the vr production plant suppliers in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantSuppliers the vr production plant suppliers
	 */
	@Override
	public void cacheResult(
		List<VRProductionPlantSupplier> vrProductionPlantSuppliers) {
		for (VRProductionPlantSupplier vrProductionPlantSupplier : vrProductionPlantSuppliers) {
			if (entityCache.getResult(
						VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantSupplierImpl.class,
						vrProductionPlantSupplier.getPrimaryKey()) == null) {
				cacheResult(vrProductionPlantSupplier);
			}
			else {
				vrProductionPlantSupplier.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr production plant suppliers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductionPlantSupplierImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr production plant supplier.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRProductionPlantSupplier vrProductionPlantSupplier) {
		entityCache.removeResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			vrProductionPlantSupplier.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRProductionPlantSupplier> vrProductionPlantSuppliers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductionPlantSupplier vrProductionPlantSupplier : vrProductionPlantSuppliers) {
			entityCache.removeResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantSupplierImpl.class,
				vrProductionPlantSupplier.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr production plant supplier with the primary key. Does not add the vr production plant supplier to the database.
	 *
	 * @param id the primary key for the new vr production plant supplier
	 * @return the new vr production plant supplier
	 */
	@Override
	public VRProductionPlantSupplier create(long id) {
		VRProductionPlantSupplier vrProductionPlantSupplier = new VRProductionPlantSupplierImpl();

		vrProductionPlantSupplier.setNew(true);
		vrProductionPlantSupplier.setPrimaryKey(id);

		return vrProductionPlantSupplier;
	}

	/**
	 * Removes the vr production plant supplier with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr production plant supplier
	 * @return the vr production plant supplier that was removed
	 * @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	 */
	@Override
	public VRProductionPlantSupplier remove(long id)
		throws NoSuchVRProductionPlantSupplierException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr production plant supplier with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr production plant supplier
	 * @return the vr production plant supplier that was removed
	 * @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	 */
	@Override
	public VRProductionPlantSupplier remove(Serializable primaryKey)
		throws NoSuchVRProductionPlantSupplierException {
		Session session = null;

		try {
			session = openSession();

			VRProductionPlantSupplier vrProductionPlantSupplier = (VRProductionPlantSupplier)session.get(VRProductionPlantSupplierImpl.class,
					primaryKey);

			if (vrProductionPlantSupplier == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductionPlantSupplierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductionPlantSupplier);
		}
		catch (NoSuchVRProductionPlantSupplierException nsee) {
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
	protected VRProductionPlantSupplier removeImpl(
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		vrProductionPlantSupplier = toUnwrappedModel(vrProductionPlantSupplier);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductionPlantSupplier)) {
				vrProductionPlantSupplier = (VRProductionPlantSupplier)session.get(VRProductionPlantSupplierImpl.class,
						vrProductionPlantSupplier.getPrimaryKeyObj());
			}

			if (vrProductionPlantSupplier != null) {
				session.delete(vrProductionPlantSupplier);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductionPlantSupplier != null) {
			clearCache(vrProductionPlantSupplier);
		}

		return vrProductionPlantSupplier;
	}

	@Override
	public VRProductionPlantSupplier updateImpl(
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		vrProductionPlantSupplier = toUnwrappedModel(vrProductionPlantSupplier);

		boolean isNew = vrProductionPlantSupplier.isNew();

		VRProductionPlantSupplierModelImpl vrProductionPlantSupplierModelImpl = (VRProductionPlantSupplierModelImpl)vrProductionPlantSupplier;

		Session session = null;

		try {
			session = openSession();

			if (vrProductionPlantSupplier.isNew()) {
				session.save(vrProductionPlantSupplier);

				vrProductionPlantSupplier.setNew(false);
			}
			else {
				vrProductionPlantSupplier = (VRProductionPlantSupplier)session.merge(vrProductionPlantSupplier);
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
				!VRProductionPlantSupplierModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductionPlantSupplierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantSupplierModelImpl.getOriginalCorporationCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE,
					args);

				args = new Object[] {
						vrProductionPlantSupplierModelImpl.getCorporationCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE,
					args);
			}

			if ((vrProductionPlantSupplierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantSupplierModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE,
					args);

				args = new Object[] {
						vrProductionPlantSupplierModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE,
					args);
			}
		}

		entityCache.putResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantSupplierImpl.class,
			vrProductionPlantSupplier.getPrimaryKey(),
			vrProductionPlantSupplier, false);

		vrProductionPlantSupplier.resetOriginalValues();

		return vrProductionPlantSupplier;
	}

	protected VRProductionPlantSupplier toUnwrappedModel(
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		if (vrProductionPlantSupplier instanceof VRProductionPlantSupplierImpl) {
			return vrProductionPlantSupplier;
		}

		VRProductionPlantSupplierImpl vrProductionPlantSupplierImpl = new VRProductionPlantSupplierImpl();

		vrProductionPlantSupplierImpl.setNew(vrProductionPlantSupplier.isNew());
		vrProductionPlantSupplierImpl.setPrimaryKey(vrProductionPlantSupplier.getPrimaryKey());

		vrProductionPlantSupplierImpl.setId(vrProductionPlantSupplier.getId());
		vrProductionPlantSupplierImpl.setMtCore(vrProductionPlantSupplier.getMtCore());
		vrProductionPlantSupplierImpl.setCorporationCode(vrProductionPlantSupplier.getCorporationCode());
		vrProductionPlantSupplierImpl.setCorporationName(vrProductionPlantSupplier.getCorporationName());
		vrProductionPlantSupplierImpl.setCorporationAddress(vrProductionPlantSupplier.getCorporationAddress());
		vrProductionPlantSupplierImpl.setProductionPlantCode(vrProductionPlantSupplier.getProductionPlantCode());
		vrProductionPlantSupplierImpl.setModifyDate(vrProductionPlantSupplier.getModifyDate());
		vrProductionPlantSupplierImpl.setSyncDate(vrProductionPlantSupplier.getSyncDate());
		vrProductionPlantSupplierImpl.setProductionPlantId(vrProductionPlantSupplier.getProductionPlantId());
		vrProductionPlantSupplierImpl.setApplicantProfileId(vrProductionPlantSupplier.getApplicantProfileId());
		vrProductionPlantSupplierImpl.setApplicantCode(vrProductionPlantSupplier.getApplicantCode());
		vrProductionPlantSupplierImpl.setSupplierId(vrProductionPlantSupplier.getSupplierId());
		vrProductionPlantSupplierImpl.setSupplierName(vrProductionPlantSupplier.getSupplierName());
		vrProductionPlantSupplierImpl.setSupplierAddress(vrProductionPlantSupplier.getSupplierAddress());

		return vrProductionPlantSupplierImpl;
	}

	/**
	 * Returns the vr production plant supplier with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant supplier
	 * @return the vr production plant supplier
	 * @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	 */
	@Override
	public VRProductionPlantSupplier findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRProductionPlantSupplierException {
		VRProductionPlantSupplier vrProductionPlantSupplier = fetchByPrimaryKey(primaryKey);

		if (vrProductionPlantSupplier == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductionPlantSupplierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductionPlantSupplier;
	}

	/**
	 * Returns the vr production plant supplier with the primary key or throws a {@link NoSuchVRProductionPlantSupplierException} if it could not be found.
	 *
	 * @param id the primary key of the vr production plant supplier
	 * @return the vr production plant supplier
	 * @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	 */
	@Override
	public VRProductionPlantSupplier findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantSupplierException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr production plant supplier with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant supplier
	 * @return the vr production plant supplier, or <code>null</code> if a vr production plant supplier with the primary key could not be found
	 */
	@Override
	public VRProductionPlantSupplier fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantSupplierImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductionPlantSupplier vrProductionPlantSupplier = (VRProductionPlantSupplier)serializable;

		if (vrProductionPlantSupplier == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductionPlantSupplier = (VRProductionPlantSupplier)session.get(VRProductionPlantSupplierImpl.class,
						primaryKey);

				if (vrProductionPlantSupplier != null) {
					cacheResult(vrProductionPlantSupplier);
				}
				else {
					entityCache.putResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantSupplierImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantSupplierImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductionPlantSupplier;
	}

	/**
	 * Returns the vr production plant supplier with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr production plant supplier
	 * @return the vr production plant supplier, or <code>null</code> if a vr production plant supplier with the primary key could not be found
	 */
	@Override
	public VRProductionPlantSupplier fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductionPlantSupplier> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductionPlantSupplier> map = new HashMap<Serializable, VRProductionPlantSupplier>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductionPlantSupplier vrProductionPlantSupplier = fetchByPrimaryKey(primaryKey);

			if (vrProductionPlantSupplier != null) {
				map.put(primaryKey, vrProductionPlantSupplier);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantSupplierImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRProductionPlantSupplier)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER_WHERE_PKS_IN);

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

			for (VRProductionPlantSupplier vrProductionPlantSupplier : (List<VRProductionPlantSupplier>)q.list()) {
				map.put(vrProductionPlantSupplier.getPrimaryKeyObj(),
					vrProductionPlantSupplier);

				cacheResult(vrProductionPlantSupplier);

				uncachedPrimaryKeys.remove(vrProductionPlantSupplier.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductionPlantSupplierModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantSupplierImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr production plant suppliers.
	 *
	 * @return the vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant suppliers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @return the range of vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant suppliers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findAll(int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant suppliers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant suppliers
	 * @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr production plant suppliers
	 */
	@Override
	public List<VRProductionPlantSupplier> findAll(int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator,
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

		List<VRProductionPlantSupplier> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantSupplier>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER;

				if (pagination) {
					sql = sql.concat(VRProductionPlantSupplierModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductionPlantSupplier>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantSupplier>)QueryUtil.list(q,
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
	 * Removes all the vr production plant suppliers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductionPlantSupplier vrProductionPlantSupplier : findAll()) {
			remove(vrProductionPlantSupplier);
		}
	}

	/**
	 * Returns the number of vr production plant suppliers.
	 *
	 * @return the number of vr production plant suppliers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTIONPLANTSUPPLIER);

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
		return VRProductionPlantSupplierModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr production plant supplier persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductionPlantSupplierImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER = "SELECT vrProductionPlantSupplier FROM VRProductionPlantSupplier vrProductionPlantSupplier";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER_WHERE_PKS_IN =
		"SELECT vrProductionPlantSupplier FROM VRProductionPlantSupplier vrProductionPlantSupplier WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTSUPPLIER_WHERE = "SELECT vrProductionPlantSupplier FROM VRProductionPlantSupplier vrProductionPlantSupplier WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTSUPPLIER = "SELECT COUNT(vrProductionPlantSupplier) FROM VRProductionPlantSupplier vrProductionPlantSupplier";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTSUPPLIER_WHERE = "SELECT COUNT(vrProductionPlantSupplier) FROM VRProductionPlantSupplier vrProductionPlantSupplier WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductionPlantSupplier.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductionPlantSupplier exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductionPlantSupplier exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductionPlantSupplierPersistenceImpl.class);
}