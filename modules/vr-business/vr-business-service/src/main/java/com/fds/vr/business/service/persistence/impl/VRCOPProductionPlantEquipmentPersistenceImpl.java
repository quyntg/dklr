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

import com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEquipmentException;
import com.fds.vr.business.model.VRCOPProductionPlantEquipment;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentImpl;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentModelImpl;
import com.fds.vr.business.service.persistence.VRCOPProductionPlantEquipmentPersistence;

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
 * The persistence implementation for the vrcop production plant equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductionPlantEquipmentPersistence
 * @see com.fds.vr.business.service.persistence.VRCOPProductionPlantEquipmentUtil
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEquipmentPersistenceImpl
	extends BasePersistenceImpl<VRCOPProductionPlantEquipment>
	implements VRCOPProductionPlantEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPProductionPlantEquipmentUtil} to access the vrcop production plant equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPProductionPlantEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPProductionPlantEquipmentModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProductionPlantEquipmentModelImpl.COPREPORTREPOSITORYID_COLUMN_BITMASK |
			VRCOPProductionPlantEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop production plant equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @return the range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		List<VRCOPProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : list) {
					if ((mtCore != vrcopProductionPlantEquipment.getMtCore()) ||
							(copReportRepositoryID != vrcopProductionPlantEquipment.getCopReportRepositoryID())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchBycopReportRepositoryID_First(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		List<VRCOPProductionPlantEquipment> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchBycopReportRepositoryID_Last(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		int count = countBycopReportRepositoryID(mtCore, copReportRepositoryID);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEquipment> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant equipments before and after the current vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant equipment
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEquipment[] array = new VRCOPProductionPlantEquipmentImpl[3];

			array[0] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopProductionPlantEquipment, mtCore,
					copReportRepositoryID, orderByComparator, true);

			array[1] = vrcopProductionPlantEquipment;

			array[2] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopProductionPlantEquipment, mtCore,
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

	protected VRCOPProductionPlantEquipment getBycopReportRepositoryID_PrevAndNext(
		Session session,
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment,
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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
			query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(copReportRepositoryID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant equipments where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 */
	@Override
	public void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : findBycopReportRepositoryID(
				mtCore, copReportRepositoryID, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the number of matching vrcop production plant equipments
	 */
	@Override
	public int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID;

		Object[] finderArgs = new Object[] { mtCore, copReportRepositoryID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2 = "vrcopProductionPlantEquipment.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2 =
		"vrcopProductionPlantEquipment.copReportRepositoryID = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopReportNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCOPProductionPlantEquipmentModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProductionPlantEquipmentModelImpl.COPREPORTNO_COLUMN_BITMASK |
			VRCOPProductionPlantEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTNO = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vrcop production plant equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopReportNo(long mtCore,
		String copReportNo) {
		return findBycopReportNo(mtCore, copReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @return the range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end) {
		return findBycopReportNo(mtCore, copReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		return findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		List<VRCOPProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : list) {
					if ((mtCore != vrcopProductionPlantEquipment.getMtCore()) ||
							!Objects.equals(copReportNo,
								vrcopProductionPlantEquipment.getCopReportNo())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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
				query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchBycopReportNo_First(mtCore,
				copReportNo, orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		List<VRCOPProductionPlantEquipment> list = findBycopReportNo(mtCore,
				copReportNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchBycopReportNo_Last(mtCore,
				copReportNo, orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		int count = countBycopReportNo(mtCore, copReportNo);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEquipment> list = findBycopReportNo(mtCore,
				copReportNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant equipments before and after the current vrcop production plant equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant equipment
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment[] findBycopReportNo_PrevAndNext(
		long id, long mtCore, String copReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEquipment[] array = new VRCOPProductionPlantEquipmentImpl[3];

			array[0] = getBycopReportNo_PrevAndNext(session,
					vrcopProductionPlantEquipment, mtCore, copReportNo,
					orderByComparator, true);

			array[1] = vrcopProductionPlantEquipment;

			array[2] = getBycopReportNo_PrevAndNext(session,
					vrcopProductionPlantEquipment, mtCore, copReportNo,
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

	protected VRCOPProductionPlantEquipment getBycopReportNo_PrevAndNext(
		Session session,
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment,
		long mtCore, String copReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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
			query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant equipments where mtCore = &#63; and copReportNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 */
	@Override
	public void removeBycopReportNo(long mtCore, String copReportNo) {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : findBycopReportNo(
				mtCore, copReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the number of matching vrcop production plant equipments
	 */
	@Override
	public int countBycopReportNo(long mtCore, String copReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTNO;

		Object[] finderArgs = new Object[] { mtCore, copReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTNO_MTCORE_2 = "vrcopProductionPlantEquipment.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1 = "vrcopProductionPlantEquipment.copReportNo IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2 = "vrcopProductionPlantEquipment.copReportNo = ?";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3 = "(vrcopProductionPlantEquipment.copReportNo IS NULL OR vrcopProductionPlantEquipment.copReportNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPDOSSIERID =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopDossierId",
			new String[] { Long.class.getName() },
			VRCOPProductionPlantEquipmentModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPProductionPlantEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPDOSSIERID = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopDossierId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vrcop production plant equipments where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopDossierId(
		long dossierId) {
		return findBycopDossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @return the range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopDossierId(
		long dossierId, int start, int end) {
		return findBycopDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopDossierId(
		long dossierId, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		return findBycopDossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findBycopDossierId(
		long dossierId, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		List<VRCOPProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : list) {
					if ((dossierId != vrcopProductionPlantEquipment.getDossierId())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findBycopDossierId_First(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchBycopDossierId_First(dossierId,
				orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchBycopDossierId_First(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		List<VRCOPProductionPlantEquipment> list = findBycopDossierId(dossierId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findBycopDossierId_Last(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchBycopDossierId_Last(dossierId,
				orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchBycopDossierId_Last(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		int count = countBycopDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEquipment> list = findBycopDossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant equipments before and after the current vrcop production plant equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant equipment
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment[] findBycopDossierId_PrevAndNext(
		long id, long dossierId,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEquipment[] array = new VRCOPProductionPlantEquipmentImpl[3];

			array[0] = getBycopDossierId_PrevAndNext(session,
					vrcopProductionPlantEquipment, dossierId,
					orderByComparator, true);

			array[1] = vrcopProductionPlantEquipment;

			array[2] = getBycopDossierId_PrevAndNext(session,
					vrcopProductionPlantEquipment, dossierId,
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

	protected VRCOPProductionPlantEquipment getBycopDossierId_PrevAndNext(
		Session session,
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment,
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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
			query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant equipments where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBycopDossierId(long dossierId) {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : findBycopDossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant equipments where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vrcop production plant equipments
	 */
	@Override
	public int countBycopDossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPDOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2 = "vrcopProductionPlantEquipment.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId_MtCore",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPProductionPlantEquipmentModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPProductionPlantEquipmentModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProductionPlantEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop production plant equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findByDossierId_MtCore(
		long dossierId, long mtCore) {
		return findByDossierId_MtCore(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @return the range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end) {
		return findByDossierId_MtCore(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		return findByDossierId_MtCore(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		List<VRCOPProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : list) {
					if ((dossierId != vrcopProductionPlantEquipment.getDossierId()) ||
							(mtCore != vrcopProductionPlantEquipment.getMtCore())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findByDossierId_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchByDossierId_MtCore_First(dossierId,
				mtCore, orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchByDossierId_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		List<VRCOPProductionPlantEquipment> list = findByDossierId_MtCore(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findByDossierId_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchByDossierId_MtCore_Last(dossierId,
				mtCore, orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchByDossierId_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		int count = countByDossierId_MtCore(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEquipment> list = findByDossierId_MtCore(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant equipments before and after the current vrcop production plant equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant equipment
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment[] findByDossierId_MtCore_PrevAndNext(
		long id, long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEquipment[] array = new VRCOPProductionPlantEquipmentImpl[3];

			array[0] = getByDossierId_MtCore_PrevAndNext(session,
					vrcopProductionPlantEquipment, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrcopProductionPlantEquipment;

			array[2] = getByDossierId_MtCore_PrevAndNext(session,
					vrcopProductionPlantEquipment, dossierId, mtCore,
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

	protected VRCOPProductionPlantEquipment getByDossierId_MtCore_PrevAndNext(
		Session session,
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment,
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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
			query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant equipments where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId_MtCore(long dossierId, long mtCore) {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : findByDossierId_MtCore(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vrcop production plant equipments
	 */
	@Override
	public int countByDossierId_MtCore(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2 = "vrcopProductionPlantEquipment.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2 = "vrcopProductionPlantEquipment.mtCore = ?";

	public VRCOPProductionPlantEquipmentPersistenceImpl() {
		setModelClass(VRCOPProductionPlantEquipment.class);
	}

	/**
	 * Caches the vrcop production plant equipment in the entity cache if it is enabled.
	 *
	 * @param vrcopProductionPlantEquipment the vrcop production plant equipment
	 */
	@Override
	public void cacheResult(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		entityCache.putResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			vrcopProductionPlantEquipment.getPrimaryKey(),
			vrcopProductionPlantEquipment);

		vrcopProductionPlantEquipment.resetOriginalValues();
	}

	/**
	 * Caches the vrcop production plant equipments in the entity cache if it is enabled.
	 *
	 * @param vrcopProductionPlantEquipments the vrcop production plant equipments
	 */
	@Override
	public void cacheResult(
		List<VRCOPProductionPlantEquipment> vrcopProductionPlantEquipments) {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : vrcopProductionPlantEquipments) {
			if (entityCache.getResult(
						VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductionPlantEquipmentImpl.class,
						vrcopProductionPlantEquipment.getPrimaryKey()) == null) {
				cacheResult(vrcopProductionPlantEquipment);
			}
			else {
				vrcopProductionPlantEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop production plant equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPProductionPlantEquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop production plant equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		entityCache.removeResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			vrcopProductionPlantEquipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRCOPProductionPlantEquipment> vrcopProductionPlantEquipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : vrcopProductionPlantEquipments) {
			entityCache.removeResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductionPlantEquipmentImpl.class,
				vrcopProductionPlantEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcop production plant equipment with the primary key. Does not add the vrcop production plant equipment to the database.
	 *
	 * @param id the primary key for the new vrcop production plant equipment
	 * @return the new vrcop production plant equipment
	 */
	@Override
	public VRCOPProductionPlantEquipment create(long id) {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = new VRCOPProductionPlantEquipmentImpl();

		vrcopProductionPlantEquipment.setNew(true);
		vrcopProductionPlantEquipment.setPrimaryKey(id);

		return vrcopProductionPlantEquipment;
	}

	/**
	 * Removes the vrcop production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment that was removed
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment remove(long id)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment that was removed
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment remove(Serializable primaryKey)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)session.get(VRCOPProductionPlantEquipmentImpl.class,
					primaryKey);

			if (vrcopProductionPlantEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPProductionPlantEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopProductionPlantEquipment);
		}
		catch (NoSuchVRCOPProductionPlantEquipmentException nsee) {
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
	protected VRCOPProductionPlantEquipment removeImpl(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		vrcopProductionPlantEquipment = toUnwrappedModel(vrcopProductionPlantEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopProductionPlantEquipment)) {
				vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)session.get(VRCOPProductionPlantEquipmentImpl.class,
						vrcopProductionPlantEquipment.getPrimaryKeyObj());
			}

			if (vrcopProductionPlantEquipment != null) {
				session.delete(vrcopProductionPlantEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopProductionPlantEquipment != null) {
			clearCache(vrcopProductionPlantEquipment);
		}

		return vrcopProductionPlantEquipment;
	}

	@Override
	public VRCOPProductionPlantEquipment updateImpl(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		vrcopProductionPlantEquipment = toUnwrappedModel(vrcopProductionPlantEquipment);

		boolean isNew = vrcopProductionPlantEquipment.isNew();

		VRCOPProductionPlantEquipmentModelImpl vrcopProductionPlantEquipmentModelImpl =
			(VRCOPProductionPlantEquipmentModelImpl)vrcopProductionPlantEquipment;

		Session session = null;

		try {
			session = openSession();

			if (vrcopProductionPlantEquipment.isNew()) {
				session.save(vrcopProductionPlantEquipment);

				vrcopProductionPlantEquipment.setNew(false);
			}
			else {
				vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)session.merge(vrcopProductionPlantEquipment);
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
				!VRCOPProductionPlantEquipmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopProductionPlantEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getOriginalMtCore(),
						vrcopProductionPlantEquipmentModelImpl.getOriginalCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);

				args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getMtCore(),
						vrcopProductionPlantEquipmentModelImpl.getCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);
			}

			if ((vrcopProductionPlantEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getOriginalMtCore(),
						vrcopProductionPlantEquipmentModelImpl.getOriginalCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);

				args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getMtCore(),
						vrcopProductionPlantEquipmentModelImpl.getCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);
			}

			if ((vrcopProductionPlantEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPDOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID,
					args);

				args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPDOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID,
					args);
			}

			if ((vrcopProductionPlantEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getOriginalDossierId(),
						vrcopProductionPlantEquipmentModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);

				args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getDossierId(),
						vrcopProductionPlantEquipmentModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);
			}
		}

		entityCache.putResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			vrcopProductionPlantEquipment.getPrimaryKey(),
			vrcopProductionPlantEquipment, false);

		vrcopProductionPlantEquipment.resetOriginalValues();

		return vrcopProductionPlantEquipment;
	}

	protected VRCOPProductionPlantEquipment toUnwrappedModel(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		if (vrcopProductionPlantEquipment instanceof VRCOPProductionPlantEquipmentImpl) {
			return vrcopProductionPlantEquipment;
		}

		VRCOPProductionPlantEquipmentImpl vrcopProductionPlantEquipmentImpl = new VRCOPProductionPlantEquipmentImpl();

		vrcopProductionPlantEquipmentImpl.setNew(vrcopProductionPlantEquipment.isNew());
		vrcopProductionPlantEquipmentImpl.setPrimaryKey(vrcopProductionPlantEquipment.getPrimaryKey());

		vrcopProductionPlantEquipmentImpl.setId(vrcopProductionPlantEquipment.getId());
		vrcopProductionPlantEquipmentImpl.setMtCore(vrcopProductionPlantEquipment.getMtCore());
		vrcopProductionPlantEquipmentImpl.setCopReportRepositoryID(vrcopProductionPlantEquipment.getCopReportRepositoryID());
		vrcopProductionPlantEquipmentImpl.setCopReportNo(vrcopProductionPlantEquipment.getCopReportNo());
		vrcopProductionPlantEquipmentImpl.setSequenceNo(vrcopProductionPlantEquipment.getSequenceNo());
		vrcopProductionPlantEquipmentImpl.setEquipmentCode(vrcopProductionPlantEquipment.getEquipmentCode());
		vrcopProductionPlantEquipmentImpl.setEquipmentName(vrcopProductionPlantEquipment.getEquipmentName());
		vrcopProductionPlantEquipmentImpl.setEquipmentType(vrcopProductionPlantEquipment.getEquipmentType());
		vrcopProductionPlantEquipmentImpl.setTrademark(vrcopProductionPlantEquipment.getTrademark());
		vrcopProductionPlantEquipmentImpl.setTrademarkName(vrcopProductionPlantEquipment.getTrademarkName());
		vrcopProductionPlantEquipmentImpl.setCommercialName(vrcopProductionPlantEquipment.getCommercialName());
		vrcopProductionPlantEquipmentImpl.setModelCode(vrcopProductionPlantEquipment.getModelCode());
		vrcopProductionPlantEquipmentImpl.setProductionCountryCode(vrcopProductionPlantEquipment.getProductionCountryCode());
		vrcopProductionPlantEquipmentImpl.setEquipmentStatus(vrcopProductionPlantEquipment.getEquipmentStatus());
		vrcopProductionPlantEquipmentImpl.setExpireDate(vrcopProductionPlantEquipment.getExpireDate());
		vrcopProductionPlantEquipmentImpl.setNotes(vrcopProductionPlantEquipment.getNotes());
		vrcopProductionPlantEquipmentImpl.setModifyDate(vrcopProductionPlantEquipment.getModifyDate());
		vrcopProductionPlantEquipmentImpl.setSyncDate(vrcopProductionPlantEquipment.getSyncDate());
		vrcopProductionPlantEquipmentImpl.setEquipmentSerialNo(vrcopProductionPlantEquipment.getEquipmentSerialNo());
		vrcopProductionPlantEquipmentImpl.setProductionYear(vrcopProductionPlantEquipment.getProductionYear());
		vrcopProductionPlantEquipmentImpl.setRegistrationYear(vrcopProductionPlantEquipment.getRegistrationYear());
		vrcopProductionPlantEquipmentImpl.setMarkupXCG(vrcopProductionPlantEquipment.getMarkupXCG());
		vrcopProductionPlantEquipmentImpl.setMarkupXCGNK(vrcopProductionPlantEquipment.getMarkupXCGNK());
		vrcopProductionPlantEquipmentImpl.setMarkupSMRM(vrcopProductionPlantEquipment.getMarkupSMRM());
		vrcopProductionPlantEquipmentImpl.setMarkupXCH(vrcopProductionPlantEquipment.getMarkupXCH());
		vrcopProductionPlantEquipmentImpl.setMarkupXCN(vrcopProductionPlantEquipment.getMarkupXCN());
		vrcopProductionPlantEquipmentImpl.setMarkupXMY(vrcopProductionPlantEquipment.getMarkupXMY());
		vrcopProductionPlantEquipmentImpl.setMarkupXDD(vrcopProductionPlantEquipment.getMarkupXDD());
		vrcopProductionPlantEquipmentImpl.setTestingResult(vrcopProductionPlantEquipment.getTestingResult());
		vrcopProductionPlantEquipmentImpl.setDescription(vrcopProductionPlantEquipment.getDescription());
		vrcopProductionPlantEquipmentImpl.setInspectionRecordNumber(vrcopProductionPlantEquipment.getInspectionRecordNumber());
		vrcopProductionPlantEquipmentImpl.setInspectionRecordDate(vrcopProductionPlantEquipment.getInspectionRecordDate());
		vrcopProductionPlantEquipmentImpl.setExpiredDate(vrcopProductionPlantEquipment.getExpiredDate());
		vrcopProductionPlantEquipmentImpl.setExpiredStatus(vrcopProductionPlantEquipment.getExpiredStatus());
		vrcopProductionPlantEquipmentImpl.setStampTestingNo(vrcopProductionPlantEquipment.getStampTestingNo());
		vrcopProductionPlantEquipmentImpl.setDossierId(vrcopProductionPlantEquipment.getDossierId());
		vrcopProductionPlantEquipmentImpl.setDossierIdCTN(vrcopProductionPlantEquipment.getDossierIdCTN());
		vrcopProductionPlantEquipmentImpl.setDossierNo(vrcopProductionPlantEquipment.getDossierNo());
		vrcopProductionPlantEquipmentImpl.setProductionPlantId(vrcopProductionPlantEquipment.getProductionPlantId());
		vrcopProductionPlantEquipmentImpl.setProductionPlantCode(vrcopProductionPlantEquipment.getProductionPlantCode());

		return vrcopProductionPlantEquipmentImpl;
	}

	/**
	 * Returns the vrcop production plant equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchByPrimaryKey(primaryKey);

		if (vrcopProductionPlantEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPProductionPlantEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopProductionPlantEquipment;
	}

	/**
	 * Returns the vrcop production plant equipment with the primary key or throws a {@link NoSuchVRCOPProductionPlantEquipmentException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findByPrimaryKey(long id)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop production plant equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment, or <code>null</code> if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductionPlantEquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)serializable;

		if (vrcopProductionPlantEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)session.get(VRCOPProductionPlantEquipmentImpl.class,
						primaryKey);

				if (vrcopProductionPlantEquipment != null) {
					cacheResult(vrcopProductionPlantEquipment);
				}
				else {
					entityCache.putResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductionPlantEquipmentImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopProductionPlantEquipment;
	}

	/**
	 * Returns the vrcop production plant equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment, or <code>null</code> if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPProductionPlantEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPProductionPlantEquipment> map = new HashMap<Serializable, VRCOPProductionPlantEquipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchByPrimaryKey(primaryKey);

			if (vrcopProductionPlantEquipment != null) {
				map.put(primaryKey, vrcopProductionPlantEquipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(VRCOPProductionPlantEquipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE_PKS_IN);

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

			for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : (List<VRCOPProductionPlantEquipment>)q.list()) {
				map.put(vrcopProductionPlantEquipment.getPrimaryKeyObj(),
					vrcopProductionPlantEquipment);

				cacheResult(vrcopProductionPlantEquipment);

				uncachedPrimaryKeys.remove(vrcopProductionPlantEquipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEquipmentImpl.class, primaryKey,
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
	 * Returns all the vrcop production plant equipments.
	 *
	 * @return the vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @return the range of vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findAll(int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findAll(int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		List<VRCOPProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT;

				if (pagination) {
					sql = sql.concat(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Removes all the vrcop production plant equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : findAll()) {
			remove(vrcopProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant equipments.
	 *
	 * @return the number of vrcop production plant equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT);

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
		return VRCOPProductionPlantEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop production plant equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPProductionPlantEquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT = "SELECT vrcopProductionPlantEquipment FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment";
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE_PKS_IN =
		"SELECT vrcopProductionPlantEquipment FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE = "SELECT vrcopProductionPlantEquipment FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment WHERE ";
	private static final String _SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT = "SELECT COUNT(vrcopProductionPlantEquipment) FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment";
	private static final String _SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE = "SELECT COUNT(vrcopProductionPlantEquipment) FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopProductionPlantEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPProductionPlantEquipment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPProductionPlantEquipment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantEquipmentPersistenceImpl.class);
}