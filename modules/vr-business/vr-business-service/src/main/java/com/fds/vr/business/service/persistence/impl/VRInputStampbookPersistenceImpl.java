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

import com.fds.vr.business.exception.NoSuchVRInputStampbookException;
import com.fds.vr.business.model.VRInputStampbook;
import com.fds.vr.business.model.impl.VRInputStampbookImpl;
import com.fds.vr.business.model.impl.VRInputStampbookModelImpl;
import com.fds.vr.business.service.persistence.VRInputStampbookPersistence;

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
 * The persistence implementation for the vr input stampbook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInputStampbookPersistence
 * @see com.fds.vr.business.service.persistence.VRInputStampbookUtil
 * @generated
 */
@ProviderType
public class VRInputStampbookPersistenceImpl extends BasePersistenceImpl<VRInputStampbook>
	implements VRInputStampbookPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRInputStampbookUtil} to access the vr input stampbook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRInputStampbookImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECLASS_STAMPTYPE_SUM3 =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleClass_stampType_sum3",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_VEHICLECLASS_STAMPTYPE_SUM3 =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByvehicleClass_stampType_sum3",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @return the matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		String vehicleClass, String stampType, long sum3) {
		return findByvehicleClass_stampType_sum3(vehicleClass, stampType, sum3,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @return the range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		String vehicleClass, String stampType, long sum3, int start, int end) {
		return findByvehicleClass_stampType_sum3(vehicleClass, stampType, sum3,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		String vehicleClass, String stampType, long sum3, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return findByvehicleClass_stampType_sum3(vehicleClass, stampType, sum3,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		String vehicleClass, String stampType, long sum3, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECLASS_STAMPTYPE_SUM3;
		finderArgs = new Object[] {
				vehicleClass, stampType, sum3,
				
				start, end, orderByComparator
			};

		List<VRInputStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbook vrInputStampbook : list) {
					if (!Objects.equals(vehicleClass,
								vrInputStampbook.getVehicleClass()) ||
							!Objects.equals(stampType,
								vrInputStampbook.getStampType()) ||
							(sum3 >= vrInputStampbook.getSum3())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_2);
			}

			boolean bindStampType = false;

			if (stampType == null) {
				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_1);
			}
			else if (stampType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_3);
			}
			else {
				bindStampType = true;

				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_2);
			}

			query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_SUM3_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindStampType) {
					qPos.add(stampType);
				}

				qPos.add(sum3);

				if (!pagination) {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findByvehicleClass_stampType_sum3_First(
		String vehicleClass, String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByvehicleClass_stampType_sum3_First(vehicleClass,
				stampType, sum3, orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", stampType=");
		msg.append(stampType);

		msg.append(", sum3=");
		msg.append(sum3);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchByvehicleClass_stampType_sum3_First(
		String vehicleClass, String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		List<VRInputStampbook> list = findByvehicleClass_stampType_sum3(vehicleClass,
				stampType, sum3, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findByvehicleClass_stampType_sum3_Last(
		String vehicleClass, String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByvehicleClass_stampType_sum3_Last(vehicleClass,
				stampType, sum3, orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", stampType=");
		msg.append(stampType);

		msg.append(", sum3=");
		msg.append(sum3);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchByvehicleClass_stampType_sum3_Last(
		String vehicleClass, String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		int count = countByvehicleClass_stampType_sum3(vehicleClass, stampType,
				sum3);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbook> list = findByvehicleClass_stampType_sum3(vehicleClass,
				stampType, sum3, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook[] findByvehicleClass_stampType_sum3_PrevAndNext(
		long id, String vehicleClass, String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbook[] array = new VRInputStampbookImpl[3];

			array[0] = getByvehicleClass_stampType_sum3_PrevAndNext(session,
					vrInputStampbook, vehicleClass, stampType, sum3,
					orderByComparator, true);

			array[1] = vrInputStampbook;

			array[2] = getByvehicleClass_stampType_sum3_PrevAndNext(session,
					vrInputStampbook, vehicleClass, stampType, sum3,
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

	protected VRInputStampbook getByvehicleClass_stampType_sum3_PrevAndNext(
		Session session, VRInputStampbook vrInputStampbook,
		String vehicleClass, String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_2);
		}

		boolean bindStampType = false;

		if (stampType == null) {
			query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_1);
		}
		else if (stampType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_3);
		}
		else {
			bindStampType = true;

			query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_2);
		}

		query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_SUM3_2);

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
			query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindStampType) {
			qPos.add(stampType);
		}

		qPos.add(sum3);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 */
	@Override
	public void removeByvehicleClass_stampType_sum3(String vehicleClass,
		String stampType, long sum3) {
		for (VRInputStampbook vrInputStampbook : findByvehicleClass_stampType_sum3(
				vehicleClass, stampType, sum3, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbook);
		}
	}

	/**
	 * Returns the number of vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param stampType the stamp type
	 * @param sum3 the sum3
	 * @return the number of matching vr input stampbooks
	 */
	@Override
	public int countByvehicleClass_stampType_sum3(String vehicleClass,
		String stampType, long sum3) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_VEHICLECLASS_STAMPTYPE_SUM3;

		Object[] finderArgs = new Object[] { vehicleClass, stampType, sum3 };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOK_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_2);
			}

			boolean bindStampType = false;

			if (stampType == null) {
				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_1);
			}
			else if (stampType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_3);
			}
			else {
				bindStampType = true;

				query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_2);
			}

			query.append(_FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_SUM3_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindStampType) {
					qPos.add(stampType);
				}

				qPos.add(sum3);

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

	private static final String _FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_1 =
		"vrInputStampbook.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_2 =
		"vrInputStampbook.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_VEHICLECLASS_3 =
		"(vrInputStampbook.vehicleClass IS NULL OR vrInputStampbook.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_1 =
		"vrInputStampbook.stampType IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_2 =
		"vrInputStampbook.stampType = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_STAMPTYPE_3 =
		"(vrInputStampbook.stampType IS NULL OR vrInputStampbook.stampType = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASS_STAMPTYPE_SUM3_SUM3_2 =
		"vrInputStampbook.sum3 > ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETID =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInputSheetId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VRInputStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETID = new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @return the matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId) {
		return findByInputSheetId(mtCore, inputSheetId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @return the range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end) {
		return findByInputSheetId(mtCore, inputSheetId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID;
			finderArgs = new Object[] { mtCore, inputSheetId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETID;
			finderArgs = new Object[] {
					mtCore, inputSheetId,
					
					start, end, orderByComparator
				};
		}

		List<VRInputStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbook vrInputStampbook : list) {
					if ((mtCore != vrInputStampbook.getMtCore()) ||
							(inputSheetId != vrInputStampbook.getInputSheetId())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				if (!pagination) {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findByInputSheetId_First(long mtCore,
		long inputSheetId, OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByInputSheetId_First(mtCore,
				inputSheetId, orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchByInputSheetId_First(long mtCore,
		long inputSheetId, OrderByComparator<VRInputStampbook> orderByComparator) {
		List<VRInputStampbook> list = findByInputSheetId(mtCore, inputSheetId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findByInputSheetId_Last(long mtCore,
		long inputSheetId, OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByInputSheetId_Last(mtCore,
				inputSheetId, orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchByInputSheetId_Last(long mtCore,
		long inputSheetId, OrderByComparator<VRInputStampbook> orderByComparator) {
		int count = countByInputSheetId(mtCore, inputSheetId);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbook> list = findByInputSheetId(mtCore, inputSheetId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbook[] array = new VRInputStampbookImpl[3];

			array[0] = getByInputSheetId_PrevAndNext(session, vrInputStampbook,
					mtCore, inputSheetId, orderByComparator, true);

			array[1] = vrInputStampbook;

			array[2] = getByInputSheetId_PrevAndNext(session, vrInputStampbook,
					mtCore, inputSheetId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInputStampbook getByInputSheetId_PrevAndNext(Session session,
		VRInputStampbook vrInputStampbook, long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbook> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

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
			query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 */
	@Override
	public void removeByInputSheetId(long mtCore, long inputSheetId) {
		for (VRInputStampbook vrInputStampbook : findByInputSheetId(mtCore,
				inputSheetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbook);
		}
	}

	/**
	 * Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @return the number of matching vr input stampbooks
	 */
	@Override
	public int countByInputSheetId(long mtCore, long inputSheetId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETID;

		Object[] finderArgs = new Object[] { mtCore, inputSheetId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

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

	private static final String _FINDER_COLUMN_INPUTSHEETID_MTCORE_2 = "vrInputStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2 = "vrInputStampbook.inputSheetId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRInputStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VRInputStampbookModelImpl.BOOKID_COLUMN_BITMASK |
			VRInputStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID = new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @return the matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @return the range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID;
			finderArgs = new Object[] { mtCore, inputSheetId, bookId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID;
			finderArgs = new Object[] {
					mtCore, inputSheetId, bookId,
					
					start, end, orderByComparator
				};
		}

		List<VRInputStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbook vrInputStampbook : list) {
					if ((mtCore != vrInputStampbook.getMtCore()) ||
							(inputSheetId != vrInputStampbook.getInputSheetId()) ||
							(bookId != vrInputStampbook.getBookId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

				if (!pagination) {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByInputSheetIdAndBookId_First(mtCore,
				inputSheetId, bookId, orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		List<VRInputStampbook> list = findByInputSheetIdAndBookId(mtCore,
				inputSheetId, bookId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByInputSheetIdAndBookId_Last(mtCore,
				inputSheetId, bookId, orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		int count = countByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbook> list = findByInputSheetIdAndBookId(mtCore,
				inputSheetId, bookId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook[] findByInputSheetIdAndBookId_PrevAndNext(long id,
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbook[] array = new VRInputStampbookImpl[3];

			array[0] = getByInputSheetIdAndBookId_PrevAndNext(session,
					vrInputStampbook, mtCore, inputSheetId, bookId,
					orderByComparator, true);

			array[1] = vrInputStampbook;

			array[2] = getByInputSheetIdAndBookId_PrevAndNext(session,
					vrInputStampbook, mtCore, inputSheetId, bookId,
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

	protected VRInputStampbook getByInputSheetIdAndBookId_PrevAndNext(
		Session session, VRInputStampbook vrInputStampbook, long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

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
			query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		qPos.add(bookId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 */
	@Override
	public void removeByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId) {
		for (VRInputStampbook vrInputStampbook : findByInputSheetIdAndBookId(
				mtCore, inputSheetId, bookId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbook);
		}
	}

	/**
	 * Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @return the number of matching vr input stampbooks
	 */
	@Override
	public int countByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID;

		Object[] finderArgs = new Object[] { mtCore, inputSheetId, bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

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

	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2 = "vrInputStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2 =
		"vrInputStampbook.inputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2 = "vrInputStampbook.bookId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRInputStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VRInputStampbookModelImpl.BOOKID_COLUMN_BITMASK |
			VRInputStampbookModelImpl.STAMPTYPE_COLUMN_BITMASK |
			VRInputStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @return the range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE;
			finderArgs = new Object[] { mtCore, inputSheetId, bookId, stampType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE;
			finderArgs = new Object[] {
					mtCore, inputSheetId, bookId, stampType,
					
					start, end, orderByComparator
				};
		}

		List<VRInputStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbook vrInputStampbook : list) {
					if ((mtCore != vrInputStampbook.getMtCore()) ||
							(inputSheetId != vrInputStampbook.getInputSheetId()) ||
							(bookId != vrInputStampbook.getBookId()) ||
							!Objects.equals(stampType,
								vrInputStampbook.getStampType())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

			boolean bindStampType = false;

			if (stampType == null) {
				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
			}
			else if (stampType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
			}
			else {
				bindStampType = true;

				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

				if (bindStampType) {
					qPos.add(stampType);
				}

				if (!pagination) {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByInputSheetIdAndBookIdAndStampType_First(mtCore,
				inputSheetId, bookId, stampType, orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(", stampType=");
		msg.append(stampType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		List<VRInputStampbook> list = findByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByInputSheetIdAndBookIdAndStampType_Last(mtCore,
				inputSheetId, bookId, stampType, orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(", stampType=");
		msg.append(stampType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		int count = countByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbook> list = findByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbook[] array = new VRInputStampbookImpl[3];

			array[0] = getByInputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrInputStampbook, mtCore, inputSheetId, bookId, stampType,
					orderByComparator, true);

			array[1] = vrInputStampbook;

			array[2] = getByInputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrInputStampbook, mtCore, inputSheetId, bookId, stampType,
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

	protected VRInputStampbook getByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		Session session, VRInputStampbook vrInputStampbook, long mtCore,
		long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

		boolean bindStampType = false;

		if (stampType == null) {
			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
		}
		else if (stampType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
		}
		else {
			bindStampType = true;

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
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
			query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		qPos.add(bookId);

		if (bindStampType) {
			qPos.add(stampType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 */
	@Override
	public void removeByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, String stampType) {
		for (VRInputStampbook vrInputStampbook : findByInputSheetIdAndBookIdAndStampType(
				mtCore, inputSheetId, bookId, stampType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbook);
		}
	}

	/**
	 * Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the number of matching vr input stampbooks
	 */
	@Override
	public int countByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, String stampType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE;

		Object[] finderArgs = new Object[] {
				mtCore, inputSheetId, bookId, stampType
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

			boolean bindStampType = false;

			if (stampType == null) {
				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
			}
			else if (stampType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
			}
			else {
				bindStampType = true;

				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

				if (bindStampType) {
					qPos.add(stampType);
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

	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2 =
		"vrInputStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2 =
		"vrInputStampbook.inputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2 =
		"vrInputStampbook.bookId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1 =
		"vrInputStampbook.stampType IS NULL";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2 =
		"vrInputStampbook.stampType = ?";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3 =
		"(vrInputStampbook.stampType IS NULL OR vrInputStampbook.stampType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUM3GREATERTHAN =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySum3GreaterThan",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_SUM3GREATERTHAN =
		new FinderPath(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countBySum3GreaterThan",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr input stampbooks where sum3 &gt; &#63;.
	 *
	 * @param sum3 the sum3
	 * @return the matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findBySum3GreaterThan(long sum3) {
		return findBySum3GreaterThan(sum3, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbooks where sum3 &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sum3 the sum3
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @return the range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findBySum3GreaterThan(long sum3, int start,
		int end) {
		return findBySum3GreaterThan(sum3, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where sum3 &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sum3 the sum3
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findBySum3GreaterThan(long sum3, int start,
		int end, OrderByComparator<VRInputStampbook> orderByComparator) {
		return findBySum3GreaterThan(sum3, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks where sum3 &gt; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sum3 the sum3
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findBySum3GreaterThan(long sum3, int start,
		int end, OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUM3GREATERTHAN;
		finderArgs = new Object[] { sum3, start, end, orderByComparator };

		List<VRInputStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbook vrInputStampbook : list) {
					if ((sum3 >= vrInputStampbook.getSum3())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_SUM3GREATERTHAN_SUM3_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(sum3);

				if (!pagination) {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook in the ordered set where sum3 &gt; &#63;.
	 *
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findBySum3GreaterThan_First(long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchBySum3GreaterThan_First(sum3,
				orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("sum3=");
		msg.append(sum3);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook in the ordered set where sum3 &gt; &#63;.
	 *
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchBySum3GreaterThan_First(long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		List<VRInputStampbook> list = findBySum3GreaterThan(sum3, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where sum3 &gt; &#63;.
	 *
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook findBySum3GreaterThan_Last(long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchBySum3GreaterThan_Last(sum3,
				orderByComparator);

		if (vrInputStampbook != null) {
			return vrInputStampbook;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("sum3=");
		msg.append(sum3);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook in the ordered set where sum3 &gt; &#63;.
	 *
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	 */
	@Override
	public VRInputStampbook fetchBySum3GreaterThan_Last(long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		int count = countBySum3GreaterThan(sum3);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbook> list = findBySum3GreaterThan(sum3, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where sum3 &gt; &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook
	 * @param sum3 the sum3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook[] findBySum3GreaterThan_PrevAndNext(long id,
		long sum3, OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbook[] array = new VRInputStampbookImpl[3];

			array[0] = getBySum3GreaterThan_PrevAndNext(session,
					vrInputStampbook, sum3, orderByComparator, true);

			array[1] = vrInputStampbook;

			array[2] = getBySum3GreaterThan_PrevAndNext(session,
					vrInputStampbook, sum3, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInputStampbook getBySum3GreaterThan_PrevAndNext(
		Session session, VRInputStampbook vrInputStampbook, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_SUM3GREATERTHAN_SUM3_2);

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
			query.append(VRInputStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(sum3);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbooks where sum3 &gt; &#63; from the database.
	 *
	 * @param sum3 the sum3
	 */
	@Override
	public void removeBySum3GreaterThan(long sum3) {
		for (VRInputStampbook vrInputStampbook : findBySum3GreaterThan(sum3,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbook);
		}
	}

	/**
	 * Returns the number of vr input stampbooks where sum3 &gt; &#63;.
	 *
	 * @param sum3 the sum3
	 * @return the number of matching vr input stampbooks
	 */
	@Override
	public int countBySum3GreaterThan(long sum3) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_SUM3GREATERTHAN;

		Object[] finderArgs = new Object[] { sum3 };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_SUM3GREATERTHAN_SUM3_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(sum3);

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

	private static final String _FINDER_COLUMN_SUM3GREATERTHAN_SUM3_2 = "vrInputStampbook.sum3 > ?";

	public VRInputStampbookPersistenceImpl() {
		setModelClass(VRInputStampbook.class);
	}

	/**
	 * Caches the vr input stampbook in the entity cache if it is enabled.
	 *
	 * @param vrInputStampbook the vr input stampbook
	 */
	@Override
	public void cacheResult(VRInputStampbook vrInputStampbook) {
		entityCache.putResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookImpl.class, vrInputStampbook.getPrimaryKey(),
			vrInputStampbook);

		vrInputStampbook.resetOriginalValues();
	}

	/**
	 * Caches the vr input stampbooks in the entity cache if it is enabled.
	 *
	 * @param vrInputStampbooks the vr input stampbooks
	 */
	@Override
	public void cacheResult(List<VRInputStampbook> vrInputStampbooks) {
		for (VRInputStampbook vrInputStampbook : vrInputStampbooks) {
			if (entityCache.getResult(
						VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
						VRInputStampbookImpl.class,
						vrInputStampbook.getPrimaryKey()) == null) {
				cacheResult(vrInputStampbook);
			}
			else {
				vrInputStampbook.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr input stampbooks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRInputStampbookImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr input stampbook.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRInputStampbook vrInputStampbook) {
		entityCache.removeResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookImpl.class, vrInputStampbook.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRInputStampbook> vrInputStampbooks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRInputStampbook vrInputStampbook : vrInputStampbooks) {
			entityCache.removeResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
				VRInputStampbookImpl.class, vrInputStampbook.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr input stampbook with the primary key. Does not add the vr input stampbook to the database.
	 *
	 * @param id the primary key for the new vr input stampbook
	 * @return the new vr input stampbook
	 */
	@Override
	public VRInputStampbook create(long id) {
		VRInputStampbook vrInputStampbook = new VRInputStampbookImpl();

		vrInputStampbook.setNew(true);
		vrInputStampbook.setPrimaryKey(id);

		return vrInputStampbook;
	}

	/**
	 * Removes the vr input stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr input stampbook
	 * @return the vr input stampbook that was removed
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook remove(long id)
		throws NoSuchVRInputStampbookException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr input stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr input stampbook
	 * @return the vr input stampbook that was removed
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook remove(Serializable primaryKey)
		throws NoSuchVRInputStampbookException {
		Session session = null;

		try {
			session = openSession();

			VRInputStampbook vrInputStampbook = (VRInputStampbook)session.get(VRInputStampbookImpl.class,
					primaryKey);

			if (vrInputStampbook == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRInputStampbookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrInputStampbook);
		}
		catch (NoSuchVRInputStampbookException nsee) {
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
	protected VRInputStampbook removeImpl(VRInputStampbook vrInputStampbook) {
		vrInputStampbook = toUnwrappedModel(vrInputStampbook);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrInputStampbook)) {
				vrInputStampbook = (VRInputStampbook)session.get(VRInputStampbookImpl.class,
						vrInputStampbook.getPrimaryKeyObj());
			}

			if (vrInputStampbook != null) {
				session.delete(vrInputStampbook);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrInputStampbook != null) {
			clearCache(vrInputStampbook);
		}

		return vrInputStampbook;
	}

	@Override
	public VRInputStampbook updateImpl(VRInputStampbook vrInputStampbook) {
		vrInputStampbook = toUnwrappedModel(vrInputStampbook);

		boolean isNew = vrInputStampbook.isNew();

		VRInputStampbookModelImpl vrInputStampbookModelImpl = (VRInputStampbookModelImpl)vrInputStampbook;

		Session session = null;

		try {
			session = openSession();

			if (vrInputStampbook.isNew()) {
				session.save(vrInputStampbook);

				vrInputStampbook.setNew(false);
			}
			else {
				vrInputStampbook = (VRInputStampbook)session.merge(vrInputStampbook);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRInputStampbookModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrInputStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookModelImpl.getOriginalMtCore(),
						vrInputStampbookModelImpl.getOriginalInputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID,
					args);

				args = new Object[] {
						vrInputStampbookModelImpl.getMtCore(),
						vrInputStampbookModelImpl.getInputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID,
					args);
			}

			if ((vrInputStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookModelImpl.getOriginalMtCore(),
						vrInputStampbookModelImpl.getOriginalInputSheetId(),
						vrInputStampbookModelImpl.getOriginalBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID,
					args);

				args = new Object[] {
						vrInputStampbookModelImpl.getMtCore(),
						vrInputStampbookModelImpl.getInputSheetId(),
						vrInputStampbookModelImpl.getBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID,
					args);
			}

			if ((vrInputStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookModelImpl.getOriginalMtCore(),
						vrInputStampbookModelImpl.getOriginalInputSheetId(),
						vrInputStampbookModelImpl.getOriginalBookId(),
						vrInputStampbookModelImpl.getOriginalStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);

				args = new Object[] {
						vrInputStampbookModelImpl.getMtCore(),
						vrInputStampbookModelImpl.getInputSheetId(),
						vrInputStampbookModelImpl.getBookId(),
						vrInputStampbookModelImpl.getStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
			}
		}

		entityCache.putResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookImpl.class, vrInputStampbook.getPrimaryKey(),
			vrInputStampbook, false);

		vrInputStampbook.resetOriginalValues();

		return vrInputStampbook;
	}

	protected VRInputStampbook toUnwrappedModel(
		VRInputStampbook vrInputStampbook) {
		if (vrInputStampbook instanceof VRInputStampbookImpl) {
			return vrInputStampbook;
		}

		VRInputStampbookImpl vrInputStampbookImpl = new VRInputStampbookImpl();

		vrInputStampbookImpl.setNew(vrInputStampbook.isNew());
		vrInputStampbookImpl.setPrimaryKey(vrInputStampbook.getPrimaryKey());

		vrInputStampbookImpl.setId(vrInputStampbook.getId());
		vrInputStampbookImpl.setMtCore(vrInputStampbook.getMtCore());
		vrInputStampbookImpl.setInputSheetId(vrInputStampbook.getInputSheetId());
		vrInputStampbookImpl.setBookId(vrInputStampbook.getBookId());
		vrInputStampbookImpl.setVehicleClass(vrInputStampbook.getVehicleClass());
		vrInputStampbookImpl.setStampType(vrInputStampbook.getStampType());
		vrInputStampbookImpl.setStampShortNo(vrInputStampbook.getStampShortNo());
		vrInputStampbookImpl.setSerialStartNo(vrInputStampbook.getSerialStartNo());
		vrInputStampbookImpl.setSerialEndNo(vrInputStampbook.getSerialEndNo());
		vrInputStampbookImpl.setSubTotalInDocument(vrInputStampbook.getSubTotalInDocument());
		vrInputStampbookImpl.setSubTotalQuantities(vrInputStampbook.getSubTotalQuantities());
		vrInputStampbookImpl.setUnits(vrInputStampbook.getUnits());
		vrInputStampbookImpl.setUnitPrice(vrInputStampbook.getUnitPrice());
		vrInputStampbookImpl.setTotalAmount(vrInputStampbook.getTotalAmount());
		vrInputStampbookImpl.setTotalInUse(vrInputStampbook.getTotalInUse());
		vrInputStampbookImpl.setTotalNotUsed(vrInputStampbook.getTotalNotUsed());
		vrInputStampbookImpl.setSum1(vrInputStampbook.getSum1());
		vrInputStampbookImpl.setSum2(vrInputStampbook.getSum2());
		vrInputStampbookImpl.setSum3(vrInputStampbook.getSum3());
		vrInputStampbookImpl.setRemark(vrInputStampbook.getRemark());
		vrInputStampbookImpl.setModifyDate(vrInputStampbook.getModifyDate());
		vrInputStampbookImpl.setSyncDate(vrInputStampbook.getSyncDate());

		return vrInputStampbookImpl;
	}

	/**
	 * Returns the vr input stampbook with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr input stampbook
	 * @return the vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRInputStampbookException {
		VRInputStampbook vrInputStampbook = fetchByPrimaryKey(primaryKey);

		if (vrInputStampbook == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRInputStampbookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrInputStampbook;
	}

	/**
	 * Returns the vr input stampbook with the primary key or throws a {@link NoSuchVRInputStampbookException} if it could not be found.
	 *
	 * @param id the primary key of the vr input stampbook
	 * @return the vr input stampbook
	 * @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook findByPrimaryKey(long id)
		throws NoSuchVRInputStampbookException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr input stampbook with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr input stampbook
	 * @return the vr input stampbook, or <code>null</code> if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
				VRInputStampbookImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRInputStampbook vrInputStampbook = (VRInputStampbook)serializable;

		if (vrInputStampbook == null) {
			Session session = null;

			try {
				session = openSession();

				vrInputStampbook = (VRInputStampbook)session.get(VRInputStampbookImpl.class,
						primaryKey);

				if (vrInputStampbook != null) {
					cacheResult(vrInputStampbook);
				}
				else {
					entityCache.putResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
						VRInputStampbookImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
					VRInputStampbookImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrInputStampbook;
	}

	/**
	 * Returns the vr input stampbook with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr input stampbook
	 * @return the vr input stampbook, or <code>null</code> if a vr input stampbook with the primary key could not be found
	 */
	@Override
	public VRInputStampbook fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRInputStampbook> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRInputStampbook> map = new HashMap<Serializable, VRInputStampbook>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRInputStampbook vrInputStampbook = fetchByPrimaryKey(primaryKey);

			if (vrInputStampbook != null) {
				map.put(primaryKey, vrInputStampbook);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
					VRInputStampbookImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRInputStampbook)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOK_WHERE_PKS_IN);

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

			for (VRInputStampbook vrInputStampbook : (List<VRInputStampbook>)q.list()) {
				map.put(vrInputStampbook.getPrimaryKeyObj(), vrInputStampbook);

				cacheResult(vrInputStampbook);

				uncachedPrimaryKeys.remove(vrInputStampbook.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRInputStampbookModelImpl.ENTITY_CACHE_ENABLED,
					VRInputStampbookImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr input stampbooks.
	 *
	 * @return the vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @return the range of vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findAll(int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input stampbooks
	 * @param end the upper bound of the range of vr input stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr input stampbooks
	 */
	@Override
	public List<VRInputStampbook> findAll(int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
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

		List<VRInputStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRINPUTSTAMPBOOK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRINPUTSTAMPBOOK;

				if (pagination) {
					sql = sql.concat(VRInputStampbookModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbook>)QueryUtil.list(q,
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
	 * Removes all the vr input stampbooks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRInputStampbook vrInputStampbook : findAll()) {
			remove(vrInputStampbook);
		}
	}

	/**
	 * Returns the number of vr input stampbooks.
	 *
	 * @return the number of vr input stampbooks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRINPUTSTAMPBOOK);

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
		return VRInputStampbookModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr input stampbook persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRInputStampbookImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRINPUTSTAMPBOOK = "SELECT vrInputStampbook FROM VRInputStampbook vrInputStampbook";
	private static final String _SQL_SELECT_VRINPUTSTAMPBOOK_WHERE_PKS_IN = "SELECT vrInputStampbook FROM VRInputStampbook vrInputStampbook WHERE id IN (";
	private static final String _SQL_SELECT_VRINPUTSTAMPBOOK_WHERE = "SELECT vrInputStampbook FROM VRInputStampbook vrInputStampbook WHERE ";
	private static final String _SQL_COUNT_VRINPUTSTAMPBOOK = "SELECT COUNT(vrInputStampbook) FROM VRInputStampbook vrInputStampbook";
	private static final String _SQL_COUNT_VRINPUTSTAMPBOOK_WHERE = "SELECT COUNT(vrInputStampbook) FROM VRInputStampbook vrInputStampbook WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrInputStampbook.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRInputStampbook exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRInputStampbook exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRInputStampbookPersistenceImpl.class);
}