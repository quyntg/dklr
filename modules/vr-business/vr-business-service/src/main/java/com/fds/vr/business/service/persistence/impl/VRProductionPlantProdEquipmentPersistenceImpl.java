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

import com.fds.vr.business.exception.NoSuchVRProductionPlantProdEquipmentException;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentImpl;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentModelImpl;
import com.fds.vr.business.service.persistence.VRProductionPlantProdEquipmentPersistence;

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
 * The persistence implementation for the vr production plant prod equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantProdEquipmentPersistence
 * @see com.fds.vr.business.service.persistence.VRProductionPlantProdEquipmentUtil
 * @generated
 */
@ProviderType
public class VRProductionPlantProdEquipmentPersistenceImpl
	extends BasePersistenceImpl<VRProductionPlantProdEquipment>
	implements VRProductionPlantProdEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductionPlantProdEquipmentUtil} to access the vr production plant prod equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductionPlantProdEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PPC = new FinderPath(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPPC",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC = new FinderPath(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPPC",
			new String[] { String.class.getName() },
			VRProductionPlantProdEquipmentModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRProductionPlantProdEquipmentModelImpl.SEQUENCENO_COLUMN_BITMASK |
			VRProductionPlantProdEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PPC = new FinderPath(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPPC", new String[] { String.class.getName() });

	/**
	 * Returns all the vr production plant prod equipments where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr production plant prod equipments
	 */
	@Override
	public List<VRProductionPlantProdEquipment> findByPPC(
		String productionPlantCode) {
		return findByPPC(productionPlantCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant prod equipments where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant prod equipments
	 * @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	 * @return the range of matching vr production plant prod equipments
	 */
	@Override
	public List<VRProductionPlantProdEquipment> findByPPC(
		String productionPlantCode, int start, int end) {
		return findByPPC(productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant prod equipments where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant prod equipments
	 * @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plant prod equipments
	 */
	@Override
	public List<VRProductionPlantProdEquipment> findByPPC(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator) {
		return findByPPC(productionPlantCode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr production plant prod equipments where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant prod equipments
	 * @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plant prod equipments
	 */
	@Override
	public List<VRProductionPlantProdEquipment> findByPPC(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator,
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

		List<VRProductionPlantProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlantProdEquipment vrProductionPlantProdEquipment : list) {
					if (!Objects.equals(productionPlantCode,
								vrProductionPlantProdEquipment.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANTPRODEQUIPMENT_WHERE);

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
				query.append(VRProductionPlantProdEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRProductionPlantProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantProdEquipment>)QueryUtil.list(q,
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
	 * Returns the first vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant prod equipment
	 * @throws NoSuchVRProductionPlantProdEquipmentException if a matching vr production plant prod equipment could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment findByPPC_First(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRProductionPlantProdEquipmentException {
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment = fetchByPPC_First(productionPlantCode,
				orderByComparator);

		if (vrProductionPlantProdEquipment != null) {
			return vrProductionPlantProdEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant prod equipment, or <code>null</code> if a matching vr production plant prod equipment could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment fetchByPPC_First(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator) {
		List<VRProductionPlantProdEquipment> list = findByPPC(productionPlantCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant prod equipment
	 * @throws NoSuchVRProductionPlantProdEquipmentException if a matching vr production plant prod equipment could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment findByPPC_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRProductionPlantProdEquipmentException {
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment = fetchByPPC_Last(productionPlantCode,
				orderByComparator);

		if (vrProductionPlantProdEquipment != null) {
			return vrProductionPlantProdEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant prod equipment, or <code>null</code> if a matching vr production plant prod equipment could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment fetchByPPC_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator) {
		int count = countByPPC(productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlantProdEquipment> list = findByPPC(productionPlantCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plant prod equipments before and after the current vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vr production plant prod equipment
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant prod equipment
	 * @throws NoSuchVRProductionPlantProdEquipmentException if a vr production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment[] findByPPC_PrevAndNext(long id,
		String productionPlantCode,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRProductionPlantProdEquipmentException {
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlantProdEquipment[] array = new VRProductionPlantProdEquipmentImpl[3];

			array[0] = getByPPC_PrevAndNext(session,
					vrProductionPlantProdEquipment, productionPlantCode,
					orderByComparator, true);

			array[1] = vrProductionPlantProdEquipment;

			array[2] = getByPPC_PrevAndNext(session,
					vrProductionPlantProdEquipment, productionPlantCode,
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

	protected VRProductionPlantProdEquipment getByPPC_PrevAndNext(
		Session session,
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment,
		String productionPlantCode,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTPRODEQUIPMENT_WHERE);

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
			query.append(VRProductionPlantProdEquipmentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlantProdEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlantProdEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plant prod equipments where productionPlantCode = &#63; from the database.
	 *
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByPPC(String productionPlantCode) {
		for (VRProductionPlantProdEquipment vrProductionPlantProdEquipment : findByPPC(
				productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlantProdEquipment);
		}
	}

	/**
	 * Returns the number of vr production plant prod equipments where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr production plant prod equipments
	 */
	@Override
	public int countByPPC(String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PPC;

		Object[] finderArgs = new Object[] { productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANTPRODEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_1 = "vrProductionPlantProdEquipment.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_2 = "vrProductionPlantProdEquipment.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_3 = "(vrProductionPlantProdEquipment.productionPlantCode IS NULL OR vrProductionPlantProdEquipment.productionPlantCode = '')";

	public VRProductionPlantProdEquipmentPersistenceImpl() {
		setModelClass(VRProductionPlantProdEquipment.class);
	}

	/**
	 * Caches the vr production plant prod equipment in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantProdEquipment the vr production plant prod equipment
	 */
	@Override
	public void cacheResult(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		entityCache.putResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentImpl.class,
			vrProductionPlantProdEquipment.getPrimaryKey(),
			vrProductionPlantProdEquipment);

		vrProductionPlantProdEquipment.resetOriginalValues();
	}

	/**
	 * Caches the vr production plant prod equipments in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantProdEquipments the vr production plant prod equipments
	 */
	@Override
	public void cacheResult(
		List<VRProductionPlantProdEquipment> vrProductionPlantProdEquipments) {
		for (VRProductionPlantProdEquipment vrProductionPlantProdEquipment : vrProductionPlantProdEquipments) {
			if (entityCache.getResult(
						VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantProdEquipmentImpl.class,
						vrProductionPlantProdEquipment.getPrimaryKey()) == null) {
				cacheResult(vrProductionPlantProdEquipment);
			}
			else {
				vrProductionPlantProdEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr production plant prod equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductionPlantProdEquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr production plant prod equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		entityCache.removeResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentImpl.class,
			vrProductionPlantProdEquipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRProductionPlantProdEquipment> vrProductionPlantProdEquipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductionPlantProdEquipment vrProductionPlantProdEquipment : vrProductionPlantProdEquipments) {
			entityCache.removeResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantProdEquipmentImpl.class,
				vrProductionPlantProdEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr production plant prod equipment with the primary key. Does not add the vr production plant prod equipment to the database.
	 *
	 * @param id the primary key for the new vr production plant prod equipment
	 * @return the new vr production plant prod equipment
	 */
	@Override
	public VRProductionPlantProdEquipment create(long id) {
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment = new VRProductionPlantProdEquipmentImpl();

		vrProductionPlantProdEquipment.setNew(true);
		vrProductionPlantProdEquipment.setPrimaryKey(id);

		return vrProductionPlantProdEquipment;
	}

	/**
	 * Removes the vr production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr production plant prod equipment
	 * @return the vr production plant prod equipment that was removed
	 * @throws NoSuchVRProductionPlantProdEquipmentException if a vr production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment remove(long id)
		throws NoSuchVRProductionPlantProdEquipmentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr production plant prod equipment
	 * @return the vr production plant prod equipment that was removed
	 * @throws NoSuchVRProductionPlantProdEquipmentException if a vr production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment remove(Serializable primaryKey)
		throws NoSuchVRProductionPlantProdEquipmentException {
		Session session = null;

		try {
			session = openSession();

			VRProductionPlantProdEquipment vrProductionPlantProdEquipment = (VRProductionPlantProdEquipment)session.get(VRProductionPlantProdEquipmentImpl.class,
					primaryKey);

			if (vrProductionPlantProdEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductionPlantProdEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductionPlantProdEquipment);
		}
		catch (NoSuchVRProductionPlantProdEquipmentException nsee) {
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
	protected VRProductionPlantProdEquipment removeImpl(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		vrProductionPlantProdEquipment = toUnwrappedModel(vrProductionPlantProdEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductionPlantProdEquipment)) {
				vrProductionPlantProdEquipment = (VRProductionPlantProdEquipment)session.get(VRProductionPlantProdEquipmentImpl.class,
						vrProductionPlantProdEquipment.getPrimaryKeyObj());
			}

			if (vrProductionPlantProdEquipment != null) {
				session.delete(vrProductionPlantProdEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductionPlantProdEquipment != null) {
			clearCache(vrProductionPlantProdEquipment);
		}

		return vrProductionPlantProdEquipment;
	}

	@Override
	public VRProductionPlantProdEquipment updateImpl(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		vrProductionPlantProdEquipment = toUnwrappedModel(vrProductionPlantProdEquipment);

		boolean isNew = vrProductionPlantProdEquipment.isNew();

		VRProductionPlantProdEquipmentModelImpl vrProductionPlantProdEquipmentModelImpl =
			(VRProductionPlantProdEquipmentModelImpl)vrProductionPlantProdEquipment;

		Session session = null;

		try {
			session = openSession();

			if (vrProductionPlantProdEquipment.isNew()) {
				session.save(vrProductionPlantProdEquipment);

				vrProductionPlantProdEquipment.setNew(false);
			}
			else {
				vrProductionPlantProdEquipment = (VRProductionPlantProdEquipment)session.merge(vrProductionPlantProdEquipment);
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
				!VRProductionPlantProdEquipmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductionPlantProdEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantProdEquipmentModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PPC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC,
					args);

				args = new Object[] {
						vrProductionPlantProdEquipmentModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PPC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC,
					args);
			}
		}

		entityCache.putResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantProdEquipmentImpl.class,
			vrProductionPlantProdEquipment.getPrimaryKey(),
			vrProductionPlantProdEquipment, false);

		vrProductionPlantProdEquipment.resetOriginalValues();

		return vrProductionPlantProdEquipment;
	}

	protected VRProductionPlantProdEquipment toUnwrappedModel(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		if (vrProductionPlantProdEquipment instanceof VRProductionPlantProdEquipmentImpl) {
			return vrProductionPlantProdEquipment;
		}

		VRProductionPlantProdEquipmentImpl vrProductionPlantProdEquipmentImpl = new VRProductionPlantProdEquipmentImpl();

		vrProductionPlantProdEquipmentImpl.setNew(vrProductionPlantProdEquipment.isNew());
		vrProductionPlantProdEquipmentImpl.setPrimaryKey(vrProductionPlantProdEquipment.getPrimaryKey());

		vrProductionPlantProdEquipmentImpl.setId(vrProductionPlantProdEquipment.getId());
		vrProductionPlantProdEquipmentImpl.setMtCore(vrProductionPlantProdEquipment.getMtCore());
		vrProductionPlantProdEquipmentImpl.setSequenceNo(vrProductionPlantProdEquipment.getSequenceNo());
		vrProductionPlantProdEquipmentImpl.setEquipmentCode(vrProductionPlantProdEquipment.getEquipmentCode());
		vrProductionPlantProdEquipmentImpl.setEquipmentName(vrProductionPlantProdEquipment.getEquipmentName());
		vrProductionPlantProdEquipmentImpl.setEquipmentType(vrProductionPlantProdEquipment.getEquipmentType());
		vrProductionPlantProdEquipmentImpl.setTrademark(vrProductionPlantProdEquipment.getTrademark());
		vrProductionPlantProdEquipmentImpl.setTrademarkName(vrProductionPlantProdEquipment.getTrademarkName());
		vrProductionPlantProdEquipmentImpl.setCommercialName(vrProductionPlantProdEquipment.getCommercialName());
		vrProductionPlantProdEquipmentImpl.setModelCode(vrProductionPlantProdEquipment.getModelCode());
		vrProductionPlantProdEquipmentImpl.setProductionCountryCode(vrProductionPlantProdEquipment.getProductionCountryCode());
		vrProductionPlantProdEquipmentImpl.setEquipmentStatus(vrProductionPlantProdEquipment.getEquipmentStatus());
		vrProductionPlantProdEquipmentImpl.setNotes(vrProductionPlantProdEquipment.getNotes());
		vrProductionPlantProdEquipmentImpl.setModifyDate(vrProductionPlantProdEquipment.getModifyDate());
		vrProductionPlantProdEquipmentImpl.setSyncDate(vrProductionPlantProdEquipment.getSyncDate());
		vrProductionPlantProdEquipmentImpl.setProductionPlantCode(vrProductionPlantProdEquipment.getProductionPlantCode());
		vrProductionPlantProdEquipmentImpl.setProductionPlantId(vrProductionPlantProdEquipment.getProductionPlantId());
		vrProductionPlantProdEquipmentImpl.setQuantity(vrProductionPlantProdEquipment.getQuantity());

		return vrProductionPlantProdEquipmentImpl;
	}

	/**
	 * Returns the vr production plant prod equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant prod equipment
	 * @return the vr production plant prod equipment
	 * @throws NoSuchVRProductionPlantProdEquipmentException if a vr production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchVRProductionPlantProdEquipmentException {
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment = fetchByPrimaryKey(primaryKey);

		if (vrProductionPlantProdEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductionPlantProdEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductionPlantProdEquipment;
	}

	/**
	 * Returns the vr production plant prod equipment with the primary key or throws a {@link NoSuchVRProductionPlantProdEquipmentException} if it could not be found.
	 *
	 * @param id the primary key of the vr production plant prod equipment
	 * @return the vr production plant prod equipment
	 * @throws NoSuchVRProductionPlantProdEquipmentException if a vr production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantProdEquipmentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr production plant prod equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant prod equipment
	 * @return the vr production plant prod equipment, or <code>null</code> if a vr production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantProdEquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductionPlantProdEquipment vrProductionPlantProdEquipment = (VRProductionPlantProdEquipment)serializable;

		if (vrProductionPlantProdEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductionPlantProdEquipment = (VRProductionPlantProdEquipment)session.get(VRProductionPlantProdEquipmentImpl.class,
						primaryKey);

				if (vrProductionPlantProdEquipment != null) {
					cacheResult(vrProductionPlantProdEquipment);
				}
				else {
					entityCache.putResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantProdEquipmentImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantProdEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductionPlantProdEquipment;
	}

	/**
	 * Returns the vr production plant prod equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr production plant prod equipment
	 * @return the vr production plant prod equipment, or <code>null</code> if a vr production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantProdEquipment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductionPlantProdEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductionPlantProdEquipment> map = new HashMap<Serializable, VRProductionPlantProdEquipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductionPlantProdEquipment vrProductionPlantProdEquipment = fetchByPrimaryKey(primaryKey);

			if (vrProductionPlantProdEquipment != null) {
				map.put(primaryKey, vrProductionPlantProdEquipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantProdEquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(VRProductionPlantProdEquipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTPRODEQUIPMENT_WHERE_PKS_IN);

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

			for (VRProductionPlantProdEquipment vrProductionPlantProdEquipment : (List<VRProductionPlantProdEquipment>)q.list()) {
				map.put(vrProductionPlantProdEquipment.getPrimaryKeyObj(),
					vrProductionPlantProdEquipment);

				cacheResult(vrProductionPlantProdEquipment);

				uncachedPrimaryKeys.remove(vrProductionPlantProdEquipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantProdEquipmentImpl.class, primaryKey,
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
	 * Returns all the vr production plant prod equipments.
	 *
	 * @return the vr production plant prod equipments
	 */
	@Override
	public List<VRProductionPlantProdEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant prod equipments
	 * @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	 * @return the range of vr production plant prod equipments
	 */
	@Override
	public List<VRProductionPlantProdEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant prod equipments
	 * @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr production plant prod equipments
	 */
	@Override
	public List<VRProductionPlantProdEquipment> findAll(int start, int end,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant prod equipments
	 * @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr production plant prod equipments
	 */
	@Override
	public List<VRProductionPlantProdEquipment> findAll(int start, int end,
		OrderByComparator<VRProductionPlantProdEquipment> orderByComparator,
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

		List<VRProductionPlantProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTIONPLANTPRODEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTIONPLANTPRODEQUIPMENT;

				if (pagination) {
					sql = sql.concat(VRProductionPlantProdEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductionPlantProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantProdEquipment>)QueryUtil.list(q,
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
	 * Removes all the vr production plant prod equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductionPlantProdEquipment vrProductionPlantProdEquipment : findAll()) {
			remove(vrProductionPlantProdEquipment);
		}
	}

	/**
	 * Returns the number of vr production plant prod equipments.
	 *
	 * @return the number of vr production plant prod equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTIONPLANTPRODEQUIPMENT);

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
		return VRProductionPlantProdEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr production plant prod equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductionPlantProdEquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTPRODEQUIPMENT = "SELECT vrProductionPlantProdEquipment FROM VRProductionPlantProdEquipment vrProductionPlantProdEquipment";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTPRODEQUIPMENT_WHERE_PKS_IN =
		"SELECT vrProductionPlantProdEquipment FROM VRProductionPlantProdEquipment vrProductionPlantProdEquipment WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTPRODEQUIPMENT_WHERE =
		"SELECT vrProductionPlantProdEquipment FROM VRProductionPlantProdEquipment vrProductionPlantProdEquipment WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTPRODEQUIPMENT = "SELECT COUNT(vrProductionPlantProdEquipment) FROM VRProductionPlantProdEquipment vrProductionPlantProdEquipment";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTPRODEQUIPMENT_WHERE = "SELECT COUNT(vrProductionPlantProdEquipment) FROM VRProductionPlantProdEquipment vrProductionPlantProdEquipment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductionPlantProdEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductionPlantProdEquipment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductionPlantProdEquipment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductionPlantProdEquipmentPersistenceImpl.class);
}