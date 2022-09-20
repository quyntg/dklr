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

import com.fds.vr.business.exception.NoSuchVRProductionPlantEmployeeException;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEmployeeModelImpl;
import com.fds.vr.business.service.persistence.VRProductionPlantEmployeePersistence;

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
 * The persistence implementation for the vr production plant employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEmployeePersistence
 * @see com.fds.vr.business.service.persistence.VRProductionPlantEmployeeUtil
 * @generated
 */
@ProviderType
public class VRProductionPlantEmployeePersistenceImpl
	extends BasePersistenceImpl<VRProductionPlantEmployee>
	implements VRProductionPlantEmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductionPlantEmployeeUtil} to access the vr production plant employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductionPlantEmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PPC = new FinderPath(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPPC",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC = new FinderPath(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPPC",
			new String[] { String.class.getName() },
			VRProductionPlantEmployeeModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRProductionPlantEmployeeModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PPC = new FinderPath(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPPC", new String[] { String.class.getName() });

	/**
	 * Returns all the vr production plant employees where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr production plant employees
	 */
	@Override
	public List<VRProductionPlantEmployee> findByPPC(String productionPlantCode) {
		return findByPPC(productionPlantCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant employees where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant employees
	 * @param end the upper bound of the range of vr production plant employees (not inclusive)
	 * @return the range of matching vr production plant employees
	 */
	@Override
	public List<VRProductionPlantEmployee> findByPPC(
		String productionPlantCode, int start, int end) {
		return findByPPC(productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant employees where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant employees
	 * @param end the upper bound of the range of vr production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plant employees
	 */
	@Override
	public List<VRProductionPlantEmployee> findByPPC(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator) {
		return findByPPC(productionPlantCode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr production plant employees where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plant employees
	 * @param end the upper bound of the range of vr production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plant employees
	 */
	@Override
	public List<VRProductionPlantEmployee> findByPPC(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator,
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

		List<VRProductionPlantEmployee> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantEmployee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlantEmployee vrProductionPlantEmployee : list) {
					if (!Objects.equals(productionPlantCode,
								vrProductionPlantEmployee.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANTEMPLOYEE_WHERE);

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
				query.append(VRProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRProductionPlantEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantEmployee>)QueryUtil.list(q,
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
	 * Returns the first vr production plant employee in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant employee
	 * @throws NoSuchVRProductionPlantEmployeeException if a matching vr production plant employee could not be found
	 */
	@Override
	public VRProductionPlantEmployee findByPPC_First(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator)
		throws NoSuchVRProductionPlantEmployeeException {
		VRProductionPlantEmployee vrProductionPlantEmployee = fetchByPPC_First(productionPlantCode,
				orderByComparator);

		if (vrProductionPlantEmployee != null) {
			return vrProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the first vr production plant employee in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant employee, or <code>null</code> if a matching vr production plant employee could not be found
	 */
	@Override
	public VRProductionPlantEmployee fetchByPPC_First(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator) {
		List<VRProductionPlantEmployee> list = findByPPC(productionPlantCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant employee in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant employee
	 * @throws NoSuchVRProductionPlantEmployeeException if a matching vr production plant employee could not be found
	 */
	@Override
	public VRProductionPlantEmployee findByPPC_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator)
		throws NoSuchVRProductionPlantEmployeeException {
		VRProductionPlantEmployee vrProductionPlantEmployee = fetchByPPC_Last(productionPlantCode,
				orderByComparator);

		if (vrProductionPlantEmployee != null) {
			return vrProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the last vr production plant employee in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant employee, or <code>null</code> if a matching vr production plant employee could not be found
	 */
	@Override
	public VRProductionPlantEmployee fetchByPPC_Last(
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator) {
		int count = countByPPC(productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlantEmployee> list = findByPPC(productionPlantCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plant employees before and after the current vr production plant employee in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vr production plant employee
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant employee
	 * @throws NoSuchVRProductionPlantEmployeeException if a vr production plant employee with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEmployee[] findByPPC_PrevAndNext(long id,
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator)
		throws NoSuchVRProductionPlantEmployeeException {
		VRProductionPlantEmployee vrProductionPlantEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlantEmployee[] array = new VRProductionPlantEmployeeImpl[3];

			array[0] = getByPPC_PrevAndNext(session, vrProductionPlantEmployee,
					productionPlantCode, orderByComparator, true);

			array[1] = vrProductionPlantEmployee;

			array[2] = getByPPC_PrevAndNext(session, vrProductionPlantEmployee,
					productionPlantCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRProductionPlantEmployee getByPPC_PrevAndNext(Session session,
		VRProductionPlantEmployee vrProductionPlantEmployee,
		String productionPlantCode,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator,
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

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTEMPLOYEE_WHERE);

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
			query.append(VRProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlantEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlantEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plant employees where productionPlantCode = &#63; from the database.
	 *
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByPPC(String productionPlantCode) {
		for (VRProductionPlantEmployee vrProductionPlantEmployee : findByPPC(
				productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlantEmployee);
		}
	}

	/**
	 * Returns the number of vr production plant employees where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr production plant employees
	 */
	@Override
	public int countByPPC(String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PPC;

		Object[] finderArgs = new Object[] { productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANTEMPLOYEE_WHERE);

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

	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_1 = "vrProductionPlantEmployee.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_2 = "vrProductionPlantEmployee.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_PPC_PRODUCTIONPLANTCODE_3 = "(vrProductionPlantEmployee.productionPlantCode IS NULL OR vrProductionPlantEmployee.productionPlantCode = '')";

	public VRProductionPlantEmployeePersistenceImpl() {
		setModelClass(VRProductionPlantEmployee.class);
	}

	/**
	 * Caches the vr production plant employee in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantEmployee the vr production plant employee
	 */
	@Override
	public void cacheResult(VRProductionPlantEmployee vrProductionPlantEmployee) {
		entityCache.putResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeImpl.class,
			vrProductionPlantEmployee.getPrimaryKey(), vrProductionPlantEmployee);

		vrProductionPlantEmployee.resetOriginalValues();
	}

	/**
	 * Caches the vr production plant employees in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantEmployees the vr production plant employees
	 */
	@Override
	public void cacheResult(
		List<VRProductionPlantEmployee> vrProductionPlantEmployees) {
		for (VRProductionPlantEmployee vrProductionPlantEmployee : vrProductionPlantEmployees) {
			if (entityCache.getResult(
						VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantEmployeeImpl.class,
						vrProductionPlantEmployee.getPrimaryKey()) == null) {
				cacheResult(vrProductionPlantEmployee);
			}
			else {
				vrProductionPlantEmployee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr production plant employees.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductionPlantEmployeeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr production plant employee.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRProductionPlantEmployee vrProductionPlantEmployee) {
		entityCache.removeResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeImpl.class,
			vrProductionPlantEmployee.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRProductionPlantEmployee> vrProductionPlantEmployees) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductionPlantEmployee vrProductionPlantEmployee : vrProductionPlantEmployees) {
			entityCache.removeResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantEmployeeImpl.class,
				vrProductionPlantEmployee.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr production plant employee with the primary key. Does not add the vr production plant employee to the database.
	 *
	 * @param id the primary key for the new vr production plant employee
	 * @return the new vr production plant employee
	 */
	@Override
	public VRProductionPlantEmployee create(long id) {
		VRProductionPlantEmployee vrProductionPlantEmployee = new VRProductionPlantEmployeeImpl();

		vrProductionPlantEmployee.setNew(true);
		vrProductionPlantEmployee.setPrimaryKey(id);

		return vrProductionPlantEmployee;
	}

	/**
	 * Removes the vr production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr production plant employee
	 * @return the vr production plant employee that was removed
	 * @throws NoSuchVRProductionPlantEmployeeException if a vr production plant employee with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEmployee remove(long id)
		throws NoSuchVRProductionPlantEmployeeException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr production plant employee
	 * @return the vr production plant employee that was removed
	 * @throws NoSuchVRProductionPlantEmployeeException if a vr production plant employee with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEmployee remove(Serializable primaryKey)
		throws NoSuchVRProductionPlantEmployeeException {
		Session session = null;

		try {
			session = openSession();

			VRProductionPlantEmployee vrProductionPlantEmployee = (VRProductionPlantEmployee)session.get(VRProductionPlantEmployeeImpl.class,
					primaryKey);

			if (vrProductionPlantEmployee == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductionPlantEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductionPlantEmployee);
		}
		catch (NoSuchVRProductionPlantEmployeeException nsee) {
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
	protected VRProductionPlantEmployee removeImpl(
		VRProductionPlantEmployee vrProductionPlantEmployee) {
		vrProductionPlantEmployee = toUnwrappedModel(vrProductionPlantEmployee);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductionPlantEmployee)) {
				vrProductionPlantEmployee = (VRProductionPlantEmployee)session.get(VRProductionPlantEmployeeImpl.class,
						vrProductionPlantEmployee.getPrimaryKeyObj());
			}

			if (vrProductionPlantEmployee != null) {
				session.delete(vrProductionPlantEmployee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductionPlantEmployee != null) {
			clearCache(vrProductionPlantEmployee);
		}

		return vrProductionPlantEmployee;
	}

	@Override
	public VRProductionPlantEmployee updateImpl(
		VRProductionPlantEmployee vrProductionPlantEmployee) {
		vrProductionPlantEmployee = toUnwrappedModel(vrProductionPlantEmployee);

		boolean isNew = vrProductionPlantEmployee.isNew();

		VRProductionPlantEmployeeModelImpl vrProductionPlantEmployeeModelImpl = (VRProductionPlantEmployeeModelImpl)vrProductionPlantEmployee;

		Session session = null;

		try {
			session = openSession();

			if (vrProductionPlantEmployee.isNew()) {
				session.save(vrProductionPlantEmployee);

				vrProductionPlantEmployee.setNew(false);
			}
			else {
				vrProductionPlantEmployee = (VRProductionPlantEmployee)session.merge(vrProductionPlantEmployee);
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
				!VRProductionPlantEmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductionPlantEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantEmployeeModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PPC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC,
					args);

				args = new Object[] {
						vrProductionPlantEmployeeModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PPC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PPC,
					args);
			}
		}

		entityCache.putResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEmployeeImpl.class,
			vrProductionPlantEmployee.getPrimaryKey(),
			vrProductionPlantEmployee, false);

		vrProductionPlantEmployee.resetOriginalValues();

		return vrProductionPlantEmployee;
	}

	protected VRProductionPlantEmployee toUnwrappedModel(
		VRProductionPlantEmployee vrProductionPlantEmployee) {
		if (vrProductionPlantEmployee instanceof VRProductionPlantEmployeeImpl) {
			return vrProductionPlantEmployee;
		}

		VRProductionPlantEmployeeImpl vrProductionPlantEmployeeImpl = new VRProductionPlantEmployeeImpl();

		vrProductionPlantEmployeeImpl.setNew(vrProductionPlantEmployee.isNew());
		vrProductionPlantEmployeeImpl.setPrimaryKey(vrProductionPlantEmployee.getPrimaryKey());

		vrProductionPlantEmployeeImpl.setId(vrProductionPlantEmployee.getId());
		vrProductionPlantEmployeeImpl.setMtCore(vrProductionPlantEmployee.getMtCore());
		vrProductionPlantEmployeeImpl.setSequenceNo(vrProductionPlantEmployee.getSequenceNo());
		vrProductionPlantEmployeeImpl.setEmployeeName(vrProductionPlantEmployee.getEmployeeName());
		vrProductionPlantEmployeeImpl.setEmployeeCertificateNo(vrProductionPlantEmployee.getEmployeeCertificateNo());
		vrProductionPlantEmployeeImpl.setTrainningAt(vrProductionPlantEmployee.getTrainningAt());
		vrProductionPlantEmployeeImpl.setWorkingPosition(vrProductionPlantEmployee.getWorkingPosition());
		vrProductionPlantEmployeeImpl.setModifyDate(vrProductionPlantEmployee.getModifyDate());
		vrProductionPlantEmployeeImpl.setSyncDate(vrProductionPlantEmployee.getSyncDate());
		vrProductionPlantEmployeeImpl.setProductionPlantCode(vrProductionPlantEmployee.getProductionPlantCode());
		vrProductionPlantEmployeeImpl.setProductionPlantId(vrProductionPlantEmployee.getProductionPlantId());

		return vrProductionPlantEmployeeImpl;
	}

	/**
	 * Returns the vr production plant employee with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant employee
	 * @return the vr production plant employee
	 * @throws NoSuchVRProductionPlantEmployeeException if a vr production plant employee with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEmployee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRProductionPlantEmployeeException {
		VRProductionPlantEmployee vrProductionPlantEmployee = fetchByPrimaryKey(primaryKey);

		if (vrProductionPlantEmployee == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductionPlantEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductionPlantEmployee;
	}

	/**
	 * Returns the vr production plant employee with the primary key or throws a {@link NoSuchVRProductionPlantEmployeeException} if it could not be found.
	 *
	 * @param id the primary key of the vr production plant employee
	 * @return the vr production plant employee
	 * @throws NoSuchVRProductionPlantEmployeeException if a vr production plant employee with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEmployee findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantEmployeeException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr production plant employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant employee
	 * @return the vr production plant employee, or <code>null</code> if a vr production plant employee with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEmployee fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantEmployeeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductionPlantEmployee vrProductionPlantEmployee = (VRProductionPlantEmployee)serializable;

		if (vrProductionPlantEmployee == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductionPlantEmployee = (VRProductionPlantEmployee)session.get(VRProductionPlantEmployeeImpl.class,
						primaryKey);

				if (vrProductionPlantEmployee != null) {
					cacheResult(vrProductionPlantEmployee);
				}
				else {
					entityCache.putResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantEmployeeImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEmployeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductionPlantEmployee;
	}

	/**
	 * Returns the vr production plant employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr production plant employee
	 * @return the vr production plant employee, or <code>null</code> if a vr production plant employee with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEmployee fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductionPlantEmployee> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductionPlantEmployee> map = new HashMap<Serializable, VRProductionPlantEmployee>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductionPlantEmployee vrProductionPlantEmployee = fetchByPrimaryKey(primaryKey);

			if (vrProductionPlantEmployee != null) {
				map.put(primaryKey, vrProductionPlantEmployee);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEmployeeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRProductionPlantEmployee)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTEMPLOYEE_WHERE_PKS_IN);

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

			for (VRProductionPlantEmployee vrProductionPlantEmployee : (List<VRProductionPlantEmployee>)q.list()) {
				map.put(vrProductionPlantEmployee.getPrimaryKeyObj(),
					vrProductionPlantEmployee);

				cacheResult(vrProductionPlantEmployee);

				uncachedPrimaryKeys.remove(vrProductionPlantEmployee.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEmployeeImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr production plant employees.
	 *
	 * @return the vr production plant employees
	 */
	@Override
	public List<VRProductionPlantEmployee> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant employees
	 * @param end the upper bound of the range of vr production plant employees (not inclusive)
	 * @return the range of vr production plant employees
	 */
	@Override
	public List<VRProductionPlantEmployee> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant employees
	 * @param end the upper bound of the range of vr production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr production plant employees
	 */
	@Override
	public List<VRProductionPlantEmployee> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant employees
	 * @param end the upper bound of the range of vr production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr production plant employees
	 */
	@Override
	public List<VRProductionPlantEmployee> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEmployee> orderByComparator,
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

		List<VRProductionPlantEmployee> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantEmployee>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTIONPLANTEMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTIONPLANTEMPLOYEE;

				if (pagination) {
					sql = sql.concat(VRProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductionPlantEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantEmployee>)QueryUtil.list(q,
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
	 * Removes all the vr production plant employees from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductionPlantEmployee vrProductionPlantEmployee : findAll()) {
			remove(vrProductionPlantEmployee);
		}
	}

	/**
	 * Returns the number of vr production plant employees.
	 *
	 * @return the number of vr production plant employees
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTIONPLANTEMPLOYEE);

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
		return VRProductionPlantEmployeeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr production plant employee persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductionPlantEmployeeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEMPLOYEE = "SELECT vrProductionPlantEmployee FROM VRProductionPlantEmployee vrProductionPlantEmployee";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEMPLOYEE_WHERE_PKS_IN =
		"SELECT vrProductionPlantEmployee FROM VRProductionPlantEmployee vrProductionPlantEmployee WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEMPLOYEE_WHERE = "SELECT vrProductionPlantEmployee FROM VRProductionPlantEmployee vrProductionPlantEmployee WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTEMPLOYEE = "SELECT COUNT(vrProductionPlantEmployee) FROM VRProductionPlantEmployee vrProductionPlantEmployee";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTEMPLOYEE_WHERE = "SELECT COUNT(vrProductionPlantEmployee) FROM VRProductionPlantEmployee vrProductionPlantEmployee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductionPlantEmployee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductionPlantEmployee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductionPlantEmployee exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductionPlantEmployeePersistenceImpl.class);
}