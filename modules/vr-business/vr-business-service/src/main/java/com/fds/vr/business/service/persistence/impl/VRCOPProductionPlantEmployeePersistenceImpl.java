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

import com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException;
import com.fds.vr.business.model.VRCOPProductionPlantEmployee;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEmployeeImpl;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEmployeeModelImpl;
import com.fds.vr.business.service.persistence.VRCOPProductionPlantEmployeePersistence;

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
 * The persistence implementation for the vrcop production plant employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductionPlantEmployeePersistence
 * @see com.fds.vr.business.service.persistence.VRCOPProductionPlantEmployeeUtil
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEmployeePersistenceImpl
	extends BasePersistenceImpl<VRCOPProductionPlantEmployee>
	implements VRCOPProductionPlantEmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPProductionPlantEmployeeUtil} to access the vrcop production plant employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPProductionPlantEmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPProductionPlantEmployeeModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProductionPlantEmployeeModelImpl.COPREPORTREPOSITORYID_COLUMN_BITMASK |
			VRCOPProductionPlantEmployeeModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID = new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @return the range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID;
			finderArgs = new Object[] { mtCore, copReportRepositoryID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTREPOSITORYID;
			finderArgs = new Object[] {
					mtCore, copReportRepositoryID,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPProductionPlantEmployee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEmployee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : list) {
					if ((mtCore != vrcopProductionPlantEmployee.getMtCore()) ||
							(copReportRepositoryID != vrcopProductionPlantEmployee.getCopReportRepositoryID())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(copReportRepositoryID);

				if (!pagination) {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchBycopReportRepositoryID_First(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopProductionPlantEmployee != null) {
			return vrcopProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		List<VRCOPProductionPlantEmployee> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchBycopReportRepositoryID_Last(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopProductionPlantEmployee != null) {
			return vrcopProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		int count = countBycopReportRepositoryID(mtCore, copReportRepositoryID);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEmployee> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant employee
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEmployee[] array = new VRCOPProductionPlantEmployeeImpl[3];

			array[0] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopProductionPlantEmployee, mtCore,
					copReportRepositoryID, orderByComparator, true);

			array[1] = vrcopProductionPlantEmployee;

			array[2] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopProductionPlantEmployee, mtCore,
					copReportRepositoryID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCOPProductionPlantEmployee getBycopReportRepositoryID_PrevAndNext(
		Session session,
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee, long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

		query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

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
			query.append(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(copReportRepositoryID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 */
	@Override
	public void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : findBycopReportRepositoryID(
				mtCore, copReportRepositoryID, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEmployee);
		}
	}

	/**
	 * Returns the number of vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the number of matching vrcop production plant employees
	 */
	@Override
	public int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID;

		Object[] finderArgs = new Object[] { mtCore, copReportRepositoryID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(copReportRepositoryID);

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

	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2 = "vrcopProductionPlantEmployee.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2 =
		"vrcopProductionPlantEmployee.copReportRepositoryID = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopReportNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCOPProductionPlantEmployeeModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProductionPlantEmployeeModelImpl.COPREPORTNO_COLUMN_BITMASK |
			VRCOPProductionPlantEmployeeModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTNO = new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopReportNo(long mtCore,
		String copReportNo) {
		return findBycopReportNo(mtCore, copReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @return the range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end) {
		return findBycopReportNo(mtCore, copReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO;
			finderArgs = new Object[] { mtCore, copReportNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO;
			finderArgs = new Object[] {
					mtCore, copReportNo,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPProductionPlantEmployee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEmployee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : list) {
					if ((mtCore != vrcopProductionPlantEmployee.getMtCore()) ||
							!Objects.equals(copReportNo,
								vrcopProductionPlantEmployee.getCopReportNo())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTNO_MTCORE_2);

			boolean bindCopReportNo = false;

			if (copReportNo == null) {
				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1);
			}
			else if (copReportNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3);
			}
			else {
				bindCopReportNo = true;

				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCopReportNo) {
					qPos.add(copReportNo);
				}

				if (!pagination) {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchBycopReportNo_First(mtCore,
				copReportNo, orderByComparator);

		if (vrcopProductionPlantEmployee != null) {
			return vrcopProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		List<VRCOPProductionPlantEmployee> list = findBycopReportNo(mtCore,
				copReportNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchBycopReportNo_Last(mtCore,
				copReportNo, orderByComparator);

		if (vrcopProductionPlantEmployee != null) {
			return vrcopProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		int count = countBycopReportNo(mtCore, copReportNo);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEmployee> list = findBycopReportNo(mtCore,
				copReportNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant employee
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee[] findBycopReportNo_PrevAndNext(
		long id, long mtCore, String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEmployee[] array = new VRCOPProductionPlantEmployeeImpl[3];

			array[0] = getBycopReportNo_PrevAndNext(session,
					vrcopProductionPlantEmployee, mtCore, copReportNo,
					orderByComparator, true);

			array[1] = vrcopProductionPlantEmployee;

			array[2] = getBycopReportNo_PrevAndNext(session,
					vrcopProductionPlantEmployee, mtCore, copReportNo,
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

	protected VRCOPProductionPlantEmployee getBycopReportNo_PrevAndNext(
		Session session,
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee, long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_COPREPORTNO_MTCORE_2);

		boolean bindCopReportNo = false;

		if (copReportNo == null) {
			query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1);
		}
		else if (copReportNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3);
		}
		else {
			bindCopReportNo = true;

			query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2);
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
			query.append(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindCopReportNo) {
			qPos.add(copReportNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 */
	@Override
	public void removeBycopReportNo(long mtCore, String copReportNo) {
		for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : findBycopReportNo(
				mtCore, copReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEmployee);
		}
	}

	/**
	 * Returns the number of vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the number of matching vrcop production plant employees
	 */
	@Override
	public int countBycopReportNo(long mtCore, String copReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTNO;

		Object[] finderArgs = new Object[] { mtCore, copReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTNO_MTCORE_2);

			boolean bindCopReportNo = false;

			if (copReportNo == null) {
				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1);
			}
			else if (copReportNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3);
			}
			else {
				bindCopReportNo = true;

				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCopReportNo) {
					qPos.add(copReportNo);
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

	private static final String _FINDER_COLUMN_COPREPORTNO_MTCORE_2 = "vrcopProductionPlantEmployee.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1 = "vrcopProductionPlantEmployee.copReportNo IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2 = "vrcopProductionPlantEmployee.copReportNo = ?";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3 = "(vrcopProductionPlantEmployee.copReportNo IS NULL OR vrcopProductionPlantEmployee.copReportNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPDOSSIERID =
		new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID =
		new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopDossierId",
			new String[] { Long.class.getName() },
			VRCOPProductionPlantEmployeeModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPProductionPlantEmployeeModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPDOSSIERID = new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopDossierId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vrcop production plant employees where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopDossierId(long dossierId) {
		return findBycopDossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant employees where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @return the range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopDossierId(
		long dossierId, int start, int end) {
		return findBycopDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopDossierId(
		long dossierId, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return findBycopDossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findBycopDossierId(
		long dossierId, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPDOSSIERID;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<VRCOPProductionPlantEmployee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEmployee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : list) {
					if ((dossierId != vrcopProductionPlantEmployee.getDossierId())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant employee in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findBycopDossierId_First(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchBycopDossierId_First(dossierId,
				orderByComparator);

		if (vrcopProductionPlantEmployee != null) {
			return vrcopProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant employee in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchBycopDossierId_First(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		List<VRCOPProductionPlantEmployee> list = findBycopDossierId(dossierId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant employee in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findBycopDossierId_Last(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchBycopDossierId_Last(dossierId,
				orderByComparator);

		if (vrcopProductionPlantEmployee != null) {
			return vrcopProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant employee in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchBycopDossierId_Last(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		int count = countBycopDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEmployee> list = findBycopDossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant employee
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee[] findBycopDossierId_PrevAndNext(
		long id, long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEmployee[] array = new VRCOPProductionPlantEmployeeImpl[3];

			array[0] = getBycopDossierId_PrevAndNext(session,
					vrcopProductionPlantEmployee, dossierId, orderByComparator,
					true);

			array[1] = vrcopProductionPlantEmployee;

			array[2] = getBycopDossierId_PrevAndNext(session,
					vrcopProductionPlantEmployee, dossierId, orderByComparator,
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

	protected VRCOPProductionPlantEmployee getBycopDossierId_PrevAndNext(
		Session session,
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee,
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2);

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
			query.append(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant employees where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBycopDossierId(long dossierId) {
		for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : findBycopDossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEmployee);
		}
	}

	/**
	 * Returns the number of vrcop production plant employees where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vrcop production plant employees
	 */
	@Override
	public int countBycopDossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPDOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2);

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

	private static final String _FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2 = "vrcopProductionPlantEmployee.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId_MtCore",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPProductionPlantEmployeeModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPProductionPlantEmployeeModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProductionPlantEmployeeModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE = new FinderPath(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findByDossierId_MtCore(
		long dossierId, long mtCore) {
		return findByDossierId_MtCore(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @return the range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end) {
		return findByDossierId_MtCore(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return findByDossierId_MtCore(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE;
			finderArgs = new Object[] { dossierId, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID_MTCORE;
			finderArgs = new Object[] {
					dossierId, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPProductionPlantEmployee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEmployee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : list) {
					if ((dossierId != vrcopProductionPlantEmployee.getDossierId()) ||
							(mtCore != vrcopProductionPlantEmployee.getMtCore())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findByDossierId_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchByDossierId_MtCore_First(dossierId,
				mtCore, orderByComparator);

		if (vrcopProductionPlantEmployee != null) {
			return vrcopProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchByDossierId_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		List<VRCOPProductionPlantEmployee> list = findByDossierId_MtCore(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findByDossierId_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchByDossierId_MtCore_Last(dossierId,
				mtCore, orderByComparator);

		if (vrcopProductionPlantEmployee != null) {
			return vrcopProductionPlantEmployee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEmployeeException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchByDossierId_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		int count = countByDossierId_MtCore(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEmployee> list = findByDossierId_MtCore(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant employee
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee[] findByDossierId_MtCore_PrevAndNext(
		long id, long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEmployee[] array = new VRCOPProductionPlantEmployeeImpl[3];

			array[0] = getByDossierId_MtCore_PrevAndNext(session,
					vrcopProductionPlantEmployee, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrcopProductionPlantEmployee;

			array[2] = getByDossierId_MtCore_PrevAndNext(session,
					vrcopProductionPlantEmployee, dossierId, mtCore,
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

	protected VRCOPProductionPlantEmployee getByDossierId_MtCore_PrevAndNext(
		Session session,
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee,
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

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
			query.append(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId_MtCore(long dossierId, long mtCore) {
		for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : findByDossierId_MtCore(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEmployee);
		}
	}

	/**
	 * Returns the number of vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vrcop production plant employees
	 */
	@Override
	public int countByDossierId_MtCore(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2 = "vrcopProductionPlantEmployee.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2 = "vrcopProductionPlantEmployee.mtCore = ?";

	public VRCOPProductionPlantEmployeePersistenceImpl() {
		setModelClass(VRCOPProductionPlantEmployee.class);
	}

	/**
	 * Caches the vrcop production plant employee in the entity cache if it is enabled.
	 *
	 * @param vrcopProductionPlantEmployee the vrcop production plant employee
	 */
	@Override
	public void cacheResult(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		entityCache.putResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			vrcopProductionPlantEmployee.getPrimaryKey(),
			vrcopProductionPlantEmployee);

		vrcopProductionPlantEmployee.resetOriginalValues();
	}

	/**
	 * Caches the vrcop production plant employees in the entity cache if it is enabled.
	 *
	 * @param vrcopProductionPlantEmployees the vrcop production plant employees
	 */
	@Override
	public void cacheResult(
		List<VRCOPProductionPlantEmployee> vrcopProductionPlantEmployees) {
		for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : vrcopProductionPlantEmployees) {
			if (entityCache.getResult(
						VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductionPlantEmployeeImpl.class,
						vrcopProductionPlantEmployee.getPrimaryKey()) == null) {
				cacheResult(vrcopProductionPlantEmployee);
			}
			else {
				vrcopProductionPlantEmployee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop production plant employees.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPProductionPlantEmployeeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop production plant employee.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		entityCache.removeResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			vrcopProductionPlantEmployee.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRCOPProductionPlantEmployee> vrcopProductionPlantEmployees) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : vrcopProductionPlantEmployees) {
			entityCache.removeResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductionPlantEmployeeImpl.class,
				vrcopProductionPlantEmployee.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcop production plant employee with the primary key. Does not add the vrcop production plant employee to the database.
	 *
	 * @param id the primary key for the new vrcop production plant employee
	 * @return the new vrcop production plant employee
	 */
	@Override
	public VRCOPProductionPlantEmployee create(long id) {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = new VRCOPProductionPlantEmployeeImpl();

		vrcopProductionPlantEmployee.setNew(true);
		vrcopProductionPlantEmployee.setPrimaryKey(id);

		return vrcopProductionPlantEmployee;
	}

	/**
	 * Removes the vrcop production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop production plant employee
	 * @return the vrcop production plant employee that was removed
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee remove(long id)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop production plant employee
	 * @return the vrcop production plant employee that was removed
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee remove(Serializable primaryKey)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = (VRCOPProductionPlantEmployee)session.get(VRCOPProductionPlantEmployeeImpl.class,
					primaryKey);

			if (vrcopProductionPlantEmployee == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPProductionPlantEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopProductionPlantEmployee);
		}
		catch (NoSuchVRCOPProductionPlantEmployeeException nsee) {
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
	protected VRCOPProductionPlantEmployee removeImpl(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		vrcopProductionPlantEmployee = toUnwrappedModel(vrcopProductionPlantEmployee);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopProductionPlantEmployee)) {
				vrcopProductionPlantEmployee = (VRCOPProductionPlantEmployee)session.get(VRCOPProductionPlantEmployeeImpl.class,
						vrcopProductionPlantEmployee.getPrimaryKeyObj());
			}

			if (vrcopProductionPlantEmployee != null) {
				session.delete(vrcopProductionPlantEmployee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopProductionPlantEmployee != null) {
			clearCache(vrcopProductionPlantEmployee);
		}

		return vrcopProductionPlantEmployee;
	}

	@Override
	public VRCOPProductionPlantEmployee updateImpl(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		vrcopProductionPlantEmployee = toUnwrappedModel(vrcopProductionPlantEmployee);

		boolean isNew = vrcopProductionPlantEmployee.isNew();

		VRCOPProductionPlantEmployeeModelImpl vrcopProductionPlantEmployeeModelImpl =
			(VRCOPProductionPlantEmployeeModelImpl)vrcopProductionPlantEmployee;

		Session session = null;

		try {
			session = openSession();

			if (vrcopProductionPlantEmployee.isNew()) {
				session.save(vrcopProductionPlantEmployee);

				vrcopProductionPlantEmployee.setNew(false);
			}
			else {
				vrcopProductionPlantEmployee = (VRCOPProductionPlantEmployee)session.merge(vrcopProductionPlantEmployee);
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
				!VRCOPProductionPlantEmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopProductionPlantEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEmployeeModelImpl.getOriginalMtCore(),
						vrcopProductionPlantEmployeeModelImpl.getOriginalCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);

				args = new Object[] {
						vrcopProductionPlantEmployeeModelImpl.getMtCore(),
						vrcopProductionPlantEmployeeModelImpl.getCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);
			}

			if ((vrcopProductionPlantEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEmployeeModelImpl.getOriginalMtCore(),
						vrcopProductionPlantEmployeeModelImpl.getOriginalCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);

				args = new Object[] {
						vrcopProductionPlantEmployeeModelImpl.getMtCore(),
						vrcopProductionPlantEmployeeModelImpl.getCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);
			}

			if ((vrcopProductionPlantEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEmployeeModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPDOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID,
					args);

				args = new Object[] {
						vrcopProductionPlantEmployeeModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPDOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID,
					args);
			}

			if ((vrcopProductionPlantEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEmployeeModelImpl.getOriginalDossierId(),
						vrcopProductionPlantEmployeeModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);

				args = new Object[] {
						vrcopProductionPlantEmployeeModelImpl.getDossierId(),
						vrcopProductionPlantEmployeeModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);
			}
		}

		entityCache.putResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEmployeeImpl.class,
			vrcopProductionPlantEmployee.getPrimaryKey(),
			vrcopProductionPlantEmployee, false);

		vrcopProductionPlantEmployee.resetOriginalValues();

		return vrcopProductionPlantEmployee;
	}

	protected VRCOPProductionPlantEmployee toUnwrappedModel(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		if (vrcopProductionPlantEmployee instanceof VRCOPProductionPlantEmployeeImpl) {
			return vrcopProductionPlantEmployee;
		}

		VRCOPProductionPlantEmployeeImpl vrcopProductionPlantEmployeeImpl = new VRCOPProductionPlantEmployeeImpl();

		vrcopProductionPlantEmployeeImpl.setNew(vrcopProductionPlantEmployee.isNew());
		vrcopProductionPlantEmployeeImpl.setPrimaryKey(vrcopProductionPlantEmployee.getPrimaryKey());

		vrcopProductionPlantEmployeeImpl.setId(vrcopProductionPlantEmployee.getId());
		vrcopProductionPlantEmployeeImpl.setMtCore(vrcopProductionPlantEmployee.getMtCore());
		vrcopProductionPlantEmployeeImpl.setCopReportRepositoryID(vrcopProductionPlantEmployee.getCopReportRepositoryID());
		vrcopProductionPlantEmployeeImpl.setCopReportNo(vrcopProductionPlantEmployee.getCopReportNo());
		vrcopProductionPlantEmployeeImpl.setSequenceNo(vrcopProductionPlantEmployee.getSequenceNo());
		vrcopProductionPlantEmployeeImpl.setEmployeeName(vrcopProductionPlantEmployee.getEmployeeName());
		vrcopProductionPlantEmployeeImpl.setEmployeeCertificateNo(vrcopProductionPlantEmployee.getEmployeeCertificateNo());
		vrcopProductionPlantEmployeeImpl.setTrainningAt(vrcopProductionPlantEmployee.getTrainningAt());
		vrcopProductionPlantEmployeeImpl.setModifyDate(vrcopProductionPlantEmployee.getModifyDate());
		vrcopProductionPlantEmployeeImpl.setSyncDate(vrcopProductionPlantEmployee.getSyncDate());
		vrcopProductionPlantEmployeeImpl.setWorkingPosition(vrcopProductionPlantEmployee.getWorkingPosition());
		vrcopProductionPlantEmployeeImpl.setDossierId(vrcopProductionPlantEmployee.getDossierId());
		vrcopProductionPlantEmployeeImpl.setDossierIdCTN(vrcopProductionPlantEmployee.getDossierIdCTN());
		vrcopProductionPlantEmployeeImpl.setDossierNo(vrcopProductionPlantEmployee.getDossierNo());

		return vrcopProductionPlantEmployeeImpl;
	}

	/**
	 * Returns the vrcop production plant employee with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop production plant employee
	 * @return the vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchByPrimaryKey(primaryKey);

		if (vrcopProductionPlantEmployee == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPProductionPlantEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopProductionPlantEmployee;
	}

	/**
	 * Returns the vrcop production plant employee with the primary key or throws a {@link NoSuchVRCOPProductionPlantEmployeeException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop production plant employee
	 * @return the vrcop production plant employee
	 * @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee findByPrimaryKey(long id)
		throws NoSuchVRCOPProductionPlantEmployeeException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop production plant employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop production plant employee
	 * @return the vrcop production plant employee, or <code>null</code> if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductionPlantEmployeeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = (VRCOPProductionPlantEmployee)serializable;

		if (vrcopProductionPlantEmployee == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopProductionPlantEmployee = (VRCOPProductionPlantEmployee)session.get(VRCOPProductionPlantEmployeeImpl.class,
						primaryKey);

				if (vrcopProductionPlantEmployee != null) {
					cacheResult(vrcopProductionPlantEmployee);
				}
				else {
					entityCache.putResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductionPlantEmployeeImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEmployeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopProductionPlantEmployee;
	}

	/**
	 * Returns the vrcop production plant employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop production plant employee
	 * @return the vrcop production plant employee, or <code>null</code> if a vrcop production plant employee with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEmployee fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPProductionPlantEmployee> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPProductionPlantEmployee> map = new HashMap<Serializable, VRCOPProductionPlantEmployee>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPProductionPlantEmployee vrcopProductionPlantEmployee = fetchByPrimaryKey(primaryKey);

			if (vrcopProductionPlantEmployee != null) {
				map.put(primaryKey, vrcopProductionPlantEmployee);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEmployeeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(VRCOPProductionPlantEmployee)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE_PKS_IN);

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

			for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : (List<VRCOPProductionPlantEmployee>)q.list()) {
				map.put(vrcopProductionPlantEmployee.getPrimaryKeyObj(),
					vrcopProductionPlantEmployee);

				cacheResult(vrcopProductionPlantEmployee);

				uncachedPrimaryKeys.remove(vrcopProductionPlantEmployee.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPProductionPlantEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEmployeeImpl.class, primaryKey,
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
	 * Returns all the vrcop production plant employees.
	 *
	 * @return the vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @return the range of vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findAll(int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant employees
	 * @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop production plant employees
	 */
	@Override
	public List<VRCOPProductionPlantEmployee> findAll(int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
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

		List<VRCOPProductionPlantEmployee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEmployee>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE;

				if (pagination) {
					sql = sql.concat(VRCOPProductionPlantEmployeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEmployee>)QueryUtil.list(q,
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
	 * Removes all the vrcop production plant employees from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPProductionPlantEmployee vrcopProductionPlantEmployee : findAll()) {
			remove(vrcopProductionPlantEmployee);
		}
	}

	/**
	 * Returns the number of vrcop production plant employees.
	 *
	 * @return the number of vrcop production plant employees
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPPRODUCTIONPLANTEMPLOYEE);

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
		return VRCOPProductionPlantEmployeeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop production plant employee persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPProductionPlantEmployeeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE = "SELECT vrcopProductionPlantEmployee FROM VRCOPProductionPlantEmployee vrcopProductionPlantEmployee";
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE_PKS_IN =
		"SELECT vrcopProductionPlantEmployee FROM VRCOPProductionPlantEmployee vrcopProductionPlantEmployee WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE = "SELECT vrcopProductionPlantEmployee FROM VRCOPProductionPlantEmployee vrcopProductionPlantEmployee WHERE ";
	private static final String _SQL_COUNT_VRCOPPRODUCTIONPLANTEMPLOYEE = "SELECT COUNT(vrcopProductionPlantEmployee) FROM VRCOPProductionPlantEmployee vrcopProductionPlantEmployee";
	private static final String _SQL_COUNT_VRCOPPRODUCTIONPLANTEMPLOYEE_WHERE = "SELECT COUNT(vrcopProductionPlantEmployee) FROM VRCOPProductionPlantEmployee vrcopProductionPlantEmployee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopProductionPlantEmployee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPProductionPlantEmployee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPProductionPlantEmployee exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantEmployeePersistenceImpl.class);
}