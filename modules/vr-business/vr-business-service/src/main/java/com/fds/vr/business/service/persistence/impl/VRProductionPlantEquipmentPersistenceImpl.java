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

import com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentModelImpl;
import com.fds.vr.business.service.persistence.VRProductionPlantEquipmentPersistence;

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
 * The persistence implementation for the vr production plant equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEquipmentPersistence
 * @see com.fds.vr.business.service.persistence.VRProductionPlantEquipmentUtil
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentPersistenceImpl
	extends BasePersistenceImpl<VRProductionPlantEquipment>
	implements VRProductionPlantEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductionPlantEquipmentUtil} to access the vr production plant equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductionPlantEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PPC = new FinderPath(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPPC",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC = new FinderPath(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPPC",
			new String[] { String.class.getName() },
			VRProductionPlantEquipmentModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRProductionPlantEquipmentModelImpl.SEQUENCENO_COLUMN_BITMASK |
			VRProductionPlantEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PPC = new FinderPath(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPPC", new String[] { String.class.getName() });

	/**
	 * Returns all the vr production plant equipments where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr production plant equipments
	 */
	@Override
	public List<VRProductionPlantEquipment> findByPPC(
		String productionPlantCode) {
		return findByPPC(productionPlantCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant equipments where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant equipments
	 * @param end the upper bound of the range of vr production plant equipments (not inclusive)
	 * @return the range of matching vr production plant equipments
	 */
	@Override
	public List<VRProductionPlantEquipment> findByPPC(
		String productionPlantCode, int start, int end) {
		return findByPPC(productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipments where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant equipments
	 * @param end the upper bound of the range of vr production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plant equipments
	 */
	@Override
	public List<VRProductionPlantEquipment> findByPPC(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		return findByPPC(productionPlantCode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipments where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant equipments
	 * @param end the upper bound of the range of vr production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plant equipments
	 */
	@Override
	public List<VRProductionPlantEquipment> findByPPC(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator,
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

		List<VRProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlantEquipment vrProductionPlantEquipment : list) {
					if (!Objects.equals(productionPlantCode,
								vrProductionPlantEquipment.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENT_WHERE);

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
				query.append(VRProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Returns the first vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant equipment
	 * @throws NoSuchVRProductionPlantEquipmentException if a matching vr production plant equipment could not be found
	 */
	@Override
	public VRProductionPlantEquipment findByPPC_First(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentException {
		VRProductionPlantEquipment vrProductionPlantEquipment = fetchByPPC_First(productionPlantCode,
				orderByComparator);

		if (vrProductionPlantEquipment != null) {
			return vrProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant equipment, or <code>null</code> if a matching vr production plant equipment could not be found
	 */
	@Override
	public VRProductionPlantEquipment fetchByPPC_First(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		List<VRProductionPlantEquipment> list = findByPPC(productionPlantCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant equipment
	 * @throws NoSuchVRProductionPlantEquipmentException if a matching vr production plant equipment could not be found
	 */
	@Override
	public VRProductionPlantEquipment findByPPC_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentException {
		VRProductionPlantEquipment vrProductionPlantEquipment = fetchByPPC_Last(productionPlantCode,
				orderByComparator);

		if (vrProductionPlantEquipment != null) {
			return vrProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant equipment, or <code>null</code> if a matching vr production plant equipment could not be found
	 */
	@Override
	public VRProductionPlantEquipment fetchByPPC_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		int count = countByPPC(productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlantEquipment> list = findByPPC(productionPlantCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plant equipments before and after the current vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vr production plant equipment
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant equipment
	 * @throws NoSuchVRProductionPlantEquipmentException if a vr production plant equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipment[] findByPPC_PrevAndNext(long id,
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentException {
		VRProductionPlantEquipment vrProductionPlantEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlantEquipment[] array = new VRProductionPlantEquipmentImpl[3];

			array[0] = getByPPC_PrevAndNext(session,
					vrProductionPlantEquipment, productionPlantCode,
					orderByComparator, true);

			array[1] = vrProductionPlantEquipment;

			array[2] = getByPPC_PrevAndNext(session,
					vrProductionPlantEquipment, productionPlantCode,
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

	protected VRProductionPlantEquipment getByPPC_PrevAndNext(Session session,
		VRProductionPlantEquipment vrProductionPlantEquipment,
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENT_WHERE);

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
			query.append(VRProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlantEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlantEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plant equipments where productionPlantCode = &#63; from the database.
	 *
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByPPC(String productionPlantCode) {
		for (VRProductionPlantEquipment vrProductionPlantEquipment : findByPPC(
				productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vr production plant equipments where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr production plant equipments
	 */
	@Override
	public int countByPPC(String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PPC;

		Object[] finderArgs = new Object[] { productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_1 = "vrProductionPlantEquipment.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_2 = "vrProductionPlantEquipment.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_3 = "(vrProductionPlantEquipment.productionPlantCode IS NULL OR vrProductionPlantEquipment.productionPlantCode = '')";

	public VRProductionPlantEquipmentPersistenceImpl() {
		setModelClass(VRProductionPlantEquipment.class);
	}

	/**
	 * Caches the vr production plant equipment in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantEquipment the vr production plant equipment
	 */
	@Override
	public void cacheResult(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		entityCache.putResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentImpl.class,
			vrProductionPlantEquipment.getPrimaryKey(),
			vrProductionPlantEquipment);

		vrProductionPlantEquipment.resetOriginalValues();
	}

	/**
	 * Caches the vr production plant equipments in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantEquipments the vr production plant equipments
	 */
	@Override
	public void cacheResult(
		List<VRProductionPlantEquipment> vrProductionPlantEquipments) {
		for (VRProductionPlantEquipment vrProductionPlantEquipment : vrProductionPlantEquipments) {
			if (entityCache.getResult(
						VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantEquipmentImpl.class,
						vrProductionPlantEquipment.getPrimaryKey()) == null) {
				cacheResult(vrProductionPlantEquipment);
			}
			else {
				vrProductionPlantEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr production plant equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductionPlantEquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr production plant equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		entityCache.removeResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentImpl.class,
			vrProductionPlantEquipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRProductionPlantEquipment> vrProductionPlantEquipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductionPlantEquipment vrProductionPlantEquipment : vrProductionPlantEquipments) {
			entityCache.removeResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantEquipmentImpl.class,
				vrProductionPlantEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr production plant equipment with the primary key. Does not add the vr production plant equipment to the database.
	 *
	 * @param id the primary key for the new vr production plant equipment
	 * @return the new vr production plant equipment
	 */
	@Override
	public VRProductionPlantEquipment create(long id) {
		VRProductionPlantEquipment vrProductionPlantEquipment = new VRProductionPlantEquipmentImpl();

		vrProductionPlantEquipment.setNew(true);
		vrProductionPlantEquipment.setPrimaryKey(id);

		return vrProductionPlantEquipment;
	}

	/**
	 * Removes the vr production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr production plant equipment
	 * @return the vr production plant equipment that was removed
	 * @throws NoSuchVRProductionPlantEquipmentException if a vr production plant equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipment remove(long id)
		throws NoSuchVRProductionPlantEquipmentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment
	 * @return the vr production plant equipment that was removed
	 * @throws NoSuchVRProductionPlantEquipmentException if a vr production plant equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipment remove(Serializable primaryKey)
		throws NoSuchVRProductionPlantEquipmentException {
		Session session = null;

		try {
			session = openSession();

			VRProductionPlantEquipment vrProductionPlantEquipment = (VRProductionPlantEquipment)session.get(VRProductionPlantEquipmentImpl.class,
					primaryKey);

			if (vrProductionPlantEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductionPlantEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductionPlantEquipment);
		}
		catch (NoSuchVRProductionPlantEquipmentException nsee) {
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
	protected VRProductionPlantEquipment removeImpl(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		vrProductionPlantEquipment = toUnwrappedModel(vrProductionPlantEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductionPlantEquipment)) {
				vrProductionPlantEquipment = (VRProductionPlantEquipment)session.get(VRProductionPlantEquipmentImpl.class,
						vrProductionPlantEquipment.getPrimaryKeyObj());
			}

			if (vrProductionPlantEquipment != null) {
				session.delete(vrProductionPlantEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductionPlantEquipment != null) {
			clearCache(vrProductionPlantEquipment);
		}

		return vrProductionPlantEquipment;
	}

	@Override
	public VRProductionPlantEquipment updateImpl(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		vrProductionPlantEquipment = toUnwrappedModel(vrProductionPlantEquipment);

		boolean isNew = vrProductionPlantEquipment.isNew();

		VRProductionPlantEquipmentModelImpl vrProductionPlantEquipmentModelImpl = (VRProductionPlantEquipmentModelImpl)vrProductionPlantEquipment;

		Session session = null;

		try {
			session = openSession();

			if (vrProductionPlantEquipment.isNew()) {
				session.save(vrProductionPlantEquipment);

				vrProductionPlantEquipment.setNew(false);
			}
			else {
				vrProductionPlantEquipment = (VRProductionPlantEquipment)session.merge(vrProductionPlantEquipment);
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
				!VRProductionPlantEquipmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductionPlantEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantEquipmentModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PPC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC,
					args);

				args = new Object[] {
						vrProductionPlantEquipmentModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PPC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC,
					args);
			}
		}

		entityCache.putResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentImpl.class,
			vrProductionPlantEquipment.getPrimaryKey(),
			vrProductionPlantEquipment, false);

		vrProductionPlantEquipment.resetOriginalValues();

		return vrProductionPlantEquipment;
	}

	protected VRProductionPlantEquipment toUnwrappedModel(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		if (vrProductionPlantEquipment instanceof VRProductionPlantEquipmentImpl) {
			return vrProductionPlantEquipment;
		}

		VRProductionPlantEquipmentImpl vrProductionPlantEquipmentImpl = new VRProductionPlantEquipmentImpl();

		vrProductionPlantEquipmentImpl.setNew(vrProductionPlantEquipment.isNew());
		vrProductionPlantEquipmentImpl.setPrimaryKey(vrProductionPlantEquipment.getPrimaryKey());

		vrProductionPlantEquipmentImpl.setId(vrProductionPlantEquipment.getId());
		vrProductionPlantEquipmentImpl.setMtCore(vrProductionPlantEquipment.getMtCore());
		vrProductionPlantEquipmentImpl.setSequenceNo(vrProductionPlantEquipment.getSequenceNo());
		vrProductionPlantEquipmentImpl.setEquipmentCode(vrProductionPlantEquipment.getEquipmentCode());
		vrProductionPlantEquipmentImpl.setEquipmentName(vrProductionPlantEquipment.getEquipmentName());
		vrProductionPlantEquipmentImpl.setEquipmentType(vrProductionPlantEquipment.getEquipmentType());
		vrProductionPlantEquipmentImpl.setTrademark(vrProductionPlantEquipment.getTrademark());
		vrProductionPlantEquipmentImpl.setTrademarkName(vrProductionPlantEquipment.getTrademarkName());
		vrProductionPlantEquipmentImpl.setCommercialName(vrProductionPlantEquipment.getCommercialName());
		vrProductionPlantEquipmentImpl.setModelCode(vrProductionPlantEquipment.getModelCode());
		vrProductionPlantEquipmentImpl.setProductionCountryCode(vrProductionPlantEquipment.getProductionCountryCode());
		vrProductionPlantEquipmentImpl.setEquipmentStatus(vrProductionPlantEquipment.getEquipmentStatus());
		vrProductionPlantEquipmentImpl.setExpireDate(vrProductionPlantEquipment.getExpireDate());
		vrProductionPlantEquipmentImpl.setNotes(vrProductionPlantEquipment.getNotes());
		vrProductionPlantEquipmentImpl.setModifyDate(vrProductionPlantEquipment.getModifyDate());
		vrProductionPlantEquipmentImpl.setSyncDate(vrProductionPlantEquipment.getSyncDate());
		vrProductionPlantEquipmentImpl.setEquipmentSerialNo(vrProductionPlantEquipment.getEquipmentSerialNo());
		vrProductionPlantEquipmentImpl.setProductionYear(vrProductionPlantEquipment.getProductionYear());
		vrProductionPlantEquipmentImpl.setRegistrationYear(vrProductionPlantEquipment.getRegistrationYear());
		vrProductionPlantEquipmentImpl.setMarkupXCG(vrProductionPlantEquipment.getMarkupXCG());
		vrProductionPlantEquipmentImpl.setMarkupXCGNK(vrProductionPlantEquipment.getMarkupXCGNK());
		vrProductionPlantEquipmentImpl.setMarkupSMRM(vrProductionPlantEquipment.getMarkupSMRM());
		vrProductionPlantEquipmentImpl.setMarkupXCH(vrProductionPlantEquipment.getMarkupXCH());
		vrProductionPlantEquipmentImpl.setMarkupXCN(vrProductionPlantEquipment.getMarkupXCN());
		vrProductionPlantEquipmentImpl.setMarkupXMY(vrProductionPlantEquipment.getMarkupXMY());
		vrProductionPlantEquipmentImpl.setMarkupXDD(vrProductionPlantEquipment.getMarkupXDD());
		vrProductionPlantEquipmentImpl.setTestingResult(vrProductionPlantEquipment.getTestingResult());
		vrProductionPlantEquipmentImpl.setDescription(vrProductionPlantEquipment.getDescription());
		vrProductionPlantEquipmentImpl.setInspectionRecordNumber(vrProductionPlantEquipment.getInspectionRecordNumber());
		vrProductionPlantEquipmentImpl.setInspectionRecordDate(vrProductionPlantEquipment.getInspectionRecordDate());
		vrProductionPlantEquipmentImpl.setStampTestingNo(vrProductionPlantEquipment.getStampTestingNo());
		vrProductionPlantEquipmentImpl.setProductionPlantId(vrProductionPlantEquipment.getProductionPlantId());
		vrProductionPlantEquipmentImpl.setProductionPlantCode(vrProductionPlantEquipment.getProductionPlantCode());

		return vrProductionPlantEquipmentImpl;
	}

	/**
	 * Returns the vr production plant equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment
	 * @return the vr production plant equipment
	 * @throws NoSuchVRProductionPlantEquipmentException if a vr production plant equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRProductionPlantEquipmentException {
		VRProductionPlantEquipment vrProductionPlantEquipment = fetchByPrimaryKey(primaryKey);

		if (vrProductionPlantEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductionPlantEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductionPlantEquipment;
	}

	/**
	 * Returns the vr production plant equipment with the primary key or throws a {@link NoSuchVRProductionPlantEquipmentException} if it could not be found.
	 *
	 * @param id the primary key of the vr production plant equipment
	 * @return the vr production plant equipment
	 * @throws NoSuchVRProductionPlantEquipmentException if a vr production plant equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipment findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantEquipmentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr production plant equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment
	 * @return the vr production plant equipment, or <code>null</code> if a vr production plant equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantEquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductionPlantEquipment vrProductionPlantEquipment = (VRProductionPlantEquipment)serializable;

		if (vrProductionPlantEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductionPlantEquipment = (VRProductionPlantEquipment)session.get(VRProductionPlantEquipmentImpl.class,
						primaryKey);

				if (vrProductionPlantEquipment != null) {
					cacheResult(vrProductionPlantEquipment);
				}
				else {
					entityCache.putResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantEquipmentImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductionPlantEquipment;
	}

	/**
	 * Returns the vr production plant equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr production plant equipment
	 * @return the vr production plant equipment, or <code>null</code> if a vr production plant equipment with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductionPlantEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductionPlantEquipment> map = new HashMap<Serializable, VRProductionPlantEquipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductionPlantEquipment vrProductionPlantEquipment = fetchByPrimaryKey(primaryKey);

			if (vrProductionPlantEquipment != null) {
				map.put(primaryKey, vrProductionPlantEquipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRProductionPlantEquipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENT_WHERE_PKS_IN);

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

			for (VRProductionPlantEquipment vrProductionPlantEquipment : (List<VRProductionPlantEquipment>)q.list()) {
				map.put(vrProductionPlantEquipment.getPrimaryKeyObj(),
					vrProductionPlantEquipment);

				cacheResult(vrProductionPlantEquipment);

				uncachedPrimaryKeys.remove(vrProductionPlantEquipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr production plant equipments.
	 *
	 * @return the vr production plant equipments
	 */
	@Override
	public List<VRProductionPlantEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipments
	 * @param end the upper bound of the range of vr production plant equipments (not inclusive)
	 * @return the range of vr production plant equipments
	 */
	@Override
	public List<VRProductionPlantEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipments
	 * @param end the upper bound of the range of vr production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr production plant equipments
	 */
	@Override
	public List<VRProductionPlantEquipment> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipments
	 * @param end the upper bound of the range of vr production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr production plant equipments
	 */
	@Override
	public List<VRProductionPlantEquipment> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator,
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

		List<VRProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENT;

				if (pagination) {
					sql = sql.concat(VRProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Removes all the vr production plant equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductionPlantEquipment vrProductionPlantEquipment : findAll()) {
			remove(vrProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vr production plant equipments.
	 *
	 * @return the number of vr production plant equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENT);

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
		return VRProductionPlantEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr production plant equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductionPlantEquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENT = "SELECT vrProductionPlantEquipment FROM VRProductionPlantEquipment vrProductionPlantEquipment";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENT_WHERE_PKS_IN =
		"SELECT vrProductionPlantEquipment FROM VRProductionPlantEquipment vrProductionPlantEquipment WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENT_WHERE = "SELECT vrProductionPlantEquipment FROM VRProductionPlantEquipment vrProductionPlantEquipment WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENT = "SELECT COUNT(vrProductionPlantEquipment) FROM VRProductionPlantEquipment vrProductionPlantEquipment";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENT_WHERE = "SELECT COUNT(vrProductionPlantEquipment) FROM VRProductionPlantEquipment vrProductionPlantEquipment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductionPlantEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductionPlantEquipment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductionPlantEquipment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductionPlantEquipmentPersistenceImpl.class);
}