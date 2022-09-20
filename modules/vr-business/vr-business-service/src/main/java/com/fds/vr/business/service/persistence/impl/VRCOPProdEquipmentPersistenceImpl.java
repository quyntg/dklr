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

import com.fds.vr.business.exception.NoSuchVRCOPProdEquipmentException;
import com.fds.vr.business.model.VRCOPProdEquipment;
import com.fds.vr.business.model.impl.VRCOPProdEquipmentImpl;
import com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl;
import com.fds.vr.business.service.persistence.VRCOPProdEquipmentPersistence;

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
 * The persistence implementation for the vrcop prod equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPProdEquipmentPersistence
 * @see com.fds.vr.business.service.persistence.VRCOPProdEquipmentUtil
 * @generated
 */
@ProviderType
public class VRCOPProdEquipmentPersistenceImpl extends BasePersistenceImpl<VRCOPProdEquipment>
	implements VRCOPProdEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPProdEquipmentUtil} to access the vrcop prod equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPProdEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPProdEquipmentModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProdEquipmentModelImpl.COPREPORTREPOSITORYID_COLUMN_BITMASK |
			VRCOPProdEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID = new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @return the range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID, int start, int end) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		List<VRCOPProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProdEquipment vrcopProdEquipment : list) {
					if ((mtCore != vrcopProdEquipment.getMtCore()) ||
							(copReportRepositoryID != vrcopProdEquipment.getCopReportRepositoryID())) {
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

			query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment findBycopReportRepositoryID_First(long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchBycopReportRepositoryID_First(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopProdEquipment != null) {
			return vrcopProdEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchBycopReportRepositoryID_First(long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		List<VRCOPProdEquipment> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment findBycopReportRepositoryID_Last(long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchBycopReportRepositoryID_Last(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopProdEquipment != null) {
			return vrcopProdEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchBycopReportRepositoryID_Last(long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		int count = countBycopReportRepositoryID(mtCore, copReportRepositoryID);

		if (count == 0) {
			return null;
		}

		List<VRCOPProdEquipment> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop prod equipments before and after the current vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param id the primary key of the current vrcop prod equipment
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProdEquipment[] array = new VRCOPProdEquipmentImpl[3];

			array[0] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopProdEquipment, mtCore, copReportRepositoryID,
					orderByComparator, true);

			array[1] = vrcopProdEquipment;

			array[2] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopProdEquipment, mtCore, copReportRepositoryID,
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

	protected VRCOPProdEquipment getBycopReportRepositoryID_PrevAndNext(
		Session session, VRCOPProdEquipment vrcopProdEquipment, long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE);

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
			query.append(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(copReportRepositoryID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProdEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProdEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 */
	@Override
	public void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		for (VRCOPProdEquipment vrcopProdEquipment : findBycopReportRepositoryID(
				mtCore, copReportRepositoryID, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrcopProdEquipment);
		}
	}

	/**
	 * Returns the number of vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the number of matching vrcop prod equipments
	 */
	@Override
	public int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID;

		Object[] finderArgs = new Object[] { mtCore, copReportRepositoryID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2 = "vrcopProdEquipment.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2 =
		"vrcopProdEquipment.copReportRepositoryID = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopReportNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCOPProdEquipmentModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProdEquipmentModelImpl.COPREPORTNO_COLUMN_BITMASK |
			VRCOPProdEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTNO = new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopReportNo(long mtCore,
		String copReportNo) {
		return findBycopReportNo(mtCore, copReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @return the range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end) {
		return findBycopReportNo(mtCore, copReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		return findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		List<VRCOPProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProdEquipment vrcopProdEquipment : list) {
					if ((mtCore != vrcopProdEquipment.getMtCore()) ||
							!Objects.equals(copReportNo,
								vrcopProdEquipment.getCopReportNo())) {
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

			query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE);

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
				query.append(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment findBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchBycopReportNo_First(mtCore,
				copReportNo, orderByComparator);

		if (vrcopProdEquipment != null) {
			return vrcopProdEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		List<VRCOPProdEquipment> list = findBycopReportNo(mtCore, copReportNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment findBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchBycopReportNo_Last(mtCore,
				copReportNo, orderByComparator);

		if (vrcopProdEquipment != null) {
			return vrcopProdEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		int count = countBycopReportNo(mtCore, copReportNo);

		if (count == 0) {
			return null;
		}

		List<VRCOPProdEquipment> list = findBycopReportNo(mtCore, copReportNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop prod equipments before and after the current vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param id the primary key of the current vrcop prod equipment
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment[] findBycopReportNo_PrevAndNext(long id,
		long mtCore, String copReportNo,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProdEquipment[] array = new VRCOPProdEquipmentImpl[3];

			array[0] = getBycopReportNo_PrevAndNext(session,
					vrcopProdEquipment, mtCore, copReportNo, orderByComparator,
					true);

			array[1] = vrcopProdEquipment;

			array[2] = getBycopReportNo_PrevAndNext(session,
					vrcopProdEquipment, mtCore, copReportNo, orderByComparator,
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

	protected VRCOPProdEquipment getBycopReportNo_PrevAndNext(Session session,
		VRCOPProdEquipment vrcopProdEquipment, long mtCore, String copReportNo,
		OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE);

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
			query.append(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProdEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProdEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 */
	@Override
	public void removeBycopReportNo(long mtCore, String copReportNo) {
		for (VRCOPProdEquipment vrcopProdEquipment : findBycopReportNo(mtCore,
				copReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProdEquipment);
		}
	}

	/**
	 * Returns the number of vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the number of matching vrcop prod equipments
	 */
	@Override
	public int countBycopReportNo(long mtCore, String copReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTNO;

		Object[] finderArgs = new Object[] { mtCore, copReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTNO_MTCORE_2 = "vrcopProdEquipment.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1 = "vrcopProdEquipment.copReportNo IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2 = "vrcopProdEquipment.copReportNo = ?";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3 = "(vrcopProdEquipment.copReportNo IS NULL OR vrcopProdEquipment.copReportNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPDOSSIERID =
		new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID =
		new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopDossierId",
			new String[] { Long.class.getName() },
			VRCOPProdEquipmentModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPProdEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPDOSSIERID = new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycopDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vrcop prod equipments where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopDossierId(long dossierId) {
		return findBycopDossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop prod equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @return the range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopDossierId(long dossierId,
		int start, int end) {
		return findBycopDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopDossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		return findBycopDossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findBycopDossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		List<VRCOPProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProdEquipment vrcopProdEquipment : list) {
					if ((dossierId != vrcopProdEquipment.getDossierId())) {
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

			query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop prod equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment findBycopDossierId_First(long dossierId,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchBycopDossierId_First(dossierId,
				orderByComparator);

		if (vrcopProdEquipment != null) {
			return vrcopProdEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop prod equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchBycopDossierId_First(long dossierId,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		List<VRCOPProdEquipment> list = findBycopDossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop prod equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment findBycopDossierId_Last(long dossierId,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchBycopDossierId_Last(dossierId,
				orderByComparator);

		if (vrcopProdEquipment != null) {
			return vrcopProdEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop prod equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchBycopDossierId_Last(long dossierId,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		int count = countBycopDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRCOPProdEquipment> list = findBycopDossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop prod equipments before and after the current vrcop prod equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vrcop prod equipment
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment[] findBycopDossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProdEquipment[] array = new VRCOPProdEquipmentImpl[3];

			array[0] = getBycopDossierId_PrevAndNext(session,
					vrcopProdEquipment, dossierId, orderByComparator, true);

			array[1] = vrcopProdEquipment;

			array[2] = getBycopDossierId_PrevAndNext(session,
					vrcopProdEquipment, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCOPProdEquipment getBycopDossierId_PrevAndNext(
		Session session, VRCOPProdEquipment vrcopProdEquipment, long dossierId,
		OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE);

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
			query.append(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProdEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProdEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop prod equipments where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBycopDossierId(long dossierId) {
		for (VRCOPProdEquipment vrcopProdEquipment : findBycopDossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProdEquipment);
		}
	}

	/**
	 * Returns the number of vrcop prod equipments where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vrcop prod equipments
	 */
	@Override
	public int countBycopDossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPDOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCOPPRODEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2 = "vrcopProdEquipment.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId_MtCore",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPProdEquipmentModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPProdEquipmentModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProdEquipmentModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE = new FinderPath(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findByDossierId_MtCore(long dossierId,
		long mtCore) {
		return findByDossierId_MtCore(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @return the range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findByDossierId_MtCore(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId_MtCore(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findByDossierId_MtCore(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		return findByDossierId_MtCore(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findByDossierId_MtCore(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		List<VRCOPProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProdEquipment vrcopProdEquipment : list) {
					if ((dossierId != vrcopProdEquipment.getDossierId()) ||
							(mtCore != vrcopProdEquipment.getMtCore())) {
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

			query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment findByDossierId_MtCore_First(long dossierId,
		long mtCore, OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchByDossierId_MtCore_First(dossierId,
				mtCore, orderByComparator);

		if (vrcopProdEquipment != null) {
			return vrcopProdEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchByDossierId_MtCore_First(long dossierId,
		long mtCore, OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		List<VRCOPProdEquipment> list = findByDossierId_MtCore(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment findByDossierId_MtCore_Last(long dossierId,
		long mtCore, OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchByDossierId_MtCore_Last(dossierId,
				mtCore, orderByComparator);

		if (vrcopProdEquipment != null) {
			return vrcopProdEquipment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchByDossierId_MtCore_Last(long dossierId,
		long mtCore, OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		int count = countByDossierId_MtCore(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRCOPProdEquipment> list = findByDossierId_MtCore(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop prod equipments before and after the current vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vrcop prod equipment
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment[] findByDossierId_MtCore_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProdEquipment[] array = new VRCOPProdEquipmentImpl[3];

			array[0] = getByDossierId_MtCore_PrevAndNext(session,
					vrcopProdEquipment, dossierId, mtCore, orderByComparator,
					true);

			array[1] = vrcopProdEquipment;

			array[2] = getByDossierId_MtCore_PrevAndNext(session,
					vrcopProdEquipment, dossierId, mtCore, orderByComparator,
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

	protected VRCOPProdEquipment getByDossierId_MtCore_PrevAndNext(
		Session session, VRCOPProdEquipment vrcopProdEquipment, long dossierId,
		long mtCore, OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE);

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
			query.append(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProdEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProdEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId_MtCore(long dossierId, long mtCore) {
		for (VRCOPProdEquipment vrcopProdEquipment : findByDossierId_MtCore(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProdEquipment);
		}
	}

	/**
	 * Returns the number of vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vrcop prod equipments
	 */
	@Override
	public int countByDossierId_MtCore(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2 = "vrcopProdEquipment.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2 = "vrcopProdEquipment.mtCore = ?";

	public VRCOPProdEquipmentPersistenceImpl() {
		setModelClass(VRCOPProdEquipment.class);
	}

	/**
	 * Caches the vrcop prod equipment in the entity cache if it is enabled.
	 *
	 * @param vrcopProdEquipment the vrcop prod equipment
	 */
	@Override
	public void cacheResult(VRCOPProdEquipment vrcopProdEquipment) {
		entityCache.putResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class, vrcopProdEquipment.getPrimaryKey(),
			vrcopProdEquipment);

		vrcopProdEquipment.resetOriginalValues();
	}

	/**
	 * Caches the vrcop prod equipments in the entity cache if it is enabled.
	 *
	 * @param vrcopProdEquipments the vrcop prod equipments
	 */
	@Override
	public void cacheResult(List<VRCOPProdEquipment> vrcopProdEquipments) {
		for (VRCOPProdEquipment vrcopProdEquipment : vrcopProdEquipments) {
			if (entityCache.getResult(
						VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProdEquipmentImpl.class,
						vrcopProdEquipment.getPrimaryKey()) == null) {
				cacheResult(vrcopProdEquipment);
			}
			else {
				vrcopProdEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop prod equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPProdEquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop prod equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCOPProdEquipment vrcopProdEquipment) {
		entityCache.removeResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class, vrcopProdEquipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRCOPProdEquipment> vrcopProdEquipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPProdEquipment vrcopProdEquipment : vrcopProdEquipments) {
			entityCache.removeResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProdEquipmentImpl.class, vrcopProdEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcop prod equipment with the primary key. Does not add the vrcop prod equipment to the database.
	 *
	 * @param id the primary key for the new vrcop prod equipment
	 * @return the new vrcop prod equipment
	 */
	@Override
	public VRCOPProdEquipment create(long id) {
		VRCOPProdEquipment vrcopProdEquipment = new VRCOPProdEquipmentImpl();

		vrcopProdEquipment.setNew(true);
		vrcopProdEquipment.setPrimaryKey(id);

		return vrcopProdEquipment;
	}

	/**
	 * Removes the vrcop prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop prod equipment
	 * @return the vrcop prod equipment that was removed
	 * @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment remove(long id)
		throws NoSuchVRCOPProdEquipmentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop prod equipment
	 * @return the vrcop prod equipment that was removed
	 * @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment remove(Serializable primaryKey)
		throws NoSuchVRCOPProdEquipmentException {
		Session session = null;

		try {
			session = openSession();

			VRCOPProdEquipment vrcopProdEquipment = (VRCOPProdEquipment)session.get(VRCOPProdEquipmentImpl.class,
					primaryKey);

			if (vrcopProdEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPProdEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopProdEquipment);
		}
		catch (NoSuchVRCOPProdEquipmentException nsee) {
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
	protected VRCOPProdEquipment removeImpl(
		VRCOPProdEquipment vrcopProdEquipment) {
		vrcopProdEquipment = toUnwrappedModel(vrcopProdEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopProdEquipment)) {
				vrcopProdEquipment = (VRCOPProdEquipment)session.get(VRCOPProdEquipmentImpl.class,
						vrcopProdEquipment.getPrimaryKeyObj());
			}

			if (vrcopProdEquipment != null) {
				session.delete(vrcopProdEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopProdEquipment != null) {
			clearCache(vrcopProdEquipment);
		}

		return vrcopProdEquipment;
	}

	@Override
	public VRCOPProdEquipment updateImpl(VRCOPProdEquipment vrcopProdEquipment) {
		vrcopProdEquipment = toUnwrappedModel(vrcopProdEquipment);

		boolean isNew = vrcopProdEquipment.isNew();

		VRCOPProdEquipmentModelImpl vrcopProdEquipmentModelImpl = (VRCOPProdEquipmentModelImpl)vrcopProdEquipment;

		Session session = null;

		try {
			session = openSession();

			if (vrcopProdEquipment.isNew()) {
				session.save(vrcopProdEquipment);

				vrcopProdEquipment.setNew(false);
			}
			else {
				vrcopProdEquipment = (VRCOPProdEquipment)session.merge(vrcopProdEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRCOPProdEquipmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopProdEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProdEquipmentModelImpl.getOriginalMtCore(),
						vrcopProdEquipmentModelImpl.getOriginalCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);

				args = new Object[] {
						vrcopProdEquipmentModelImpl.getMtCore(),
						vrcopProdEquipmentModelImpl.getCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);
			}

			if ((vrcopProdEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProdEquipmentModelImpl.getOriginalMtCore(),
						vrcopProdEquipmentModelImpl.getOriginalCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);

				args = new Object[] {
						vrcopProdEquipmentModelImpl.getMtCore(),
						vrcopProdEquipmentModelImpl.getCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);
			}

			if ((vrcopProdEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProdEquipmentModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPDOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID,
					args);

				args = new Object[] { vrcopProdEquipmentModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPDOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID,
					args);
			}

			if ((vrcopProdEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProdEquipmentModelImpl.getOriginalDossierId(),
						vrcopProdEquipmentModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);

				args = new Object[] {
						vrcopProdEquipmentModelImpl.getDossierId(),
						vrcopProdEquipmentModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);
			}
		}

		entityCache.putResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProdEquipmentImpl.class, vrcopProdEquipment.getPrimaryKey(),
			vrcopProdEquipment, false);

		vrcopProdEquipment.resetOriginalValues();

		return vrcopProdEquipment;
	}

	protected VRCOPProdEquipment toUnwrappedModel(
		VRCOPProdEquipment vrcopProdEquipment) {
		if (vrcopProdEquipment instanceof VRCOPProdEquipmentImpl) {
			return vrcopProdEquipment;
		}

		VRCOPProdEquipmentImpl vrcopProdEquipmentImpl = new VRCOPProdEquipmentImpl();

		vrcopProdEquipmentImpl.setNew(vrcopProdEquipment.isNew());
		vrcopProdEquipmentImpl.setPrimaryKey(vrcopProdEquipment.getPrimaryKey());

		vrcopProdEquipmentImpl.setId(vrcopProdEquipment.getId());
		vrcopProdEquipmentImpl.setMtCore(vrcopProdEquipment.getMtCore());
		vrcopProdEquipmentImpl.setCopReportRepositoryID(vrcopProdEquipment.getCopReportRepositoryID());
		vrcopProdEquipmentImpl.setCopReportNo(vrcopProdEquipment.getCopReportNo());
		vrcopProdEquipmentImpl.setSequenceNo(vrcopProdEquipment.getSequenceNo());
		vrcopProdEquipmentImpl.setEquipmentCode(vrcopProdEquipment.getEquipmentCode());
		vrcopProdEquipmentImpl.setEquipmentName(vrcopProdEquipment.getEquipmentName());
		vrcopProdEquipmentImpl.setEquipmentType(vrcopProdEquipment.getEquipmentType());
		vrcopProdEquipmentImpl.setTrademark(vrcopProdEquipment.getTrademark());
		vrcopProdEquipmentImpl.setTrademarkName(vrcopProdEquipment.getTrademarkName());
		vrcopProdEquipmentImpl.setCommercialName(vrcopProdEquipment.getCommercialName());
		vrcopProdEquipmentImpl.setModelCode(vrcopProdEquipment.getModelCode());
		vrcopProdEquipmentImpl.setDesignSymbolNo(vrcopProdEquipment.getDesignSymbolNo());
		vrcopProdEquipmentImpl.setProductionCountryCode(vrcopProdEquipment.getProductionCountryCode());
		vrcopProdEquipmentImpl.setEquipmentStatus(vrcopProdEquipment.getEquipmentStatus());
		vrcopProdEquipmentImpl.setNotes(vrcopProdEquipment.getNotes());
		vrcopProdEquipmentImpl.setModifyDate(vrcopProdEquipment.getModifyDate());
		vrcopProdEquipmentImpl.setSyncDate(vrcopProdEquipment.getSyncDate());
		vrcopProdEquipmentImpl.setQuantity(vrcopProdEquipment.getQuantity());
		vrcopProdEquipmentImpl.setDossierId(vrcopProdEquipment.getDossierId());
		vrcopProdEquipmentImpl.setDossierIdCTN(vrcopProdEquipment.getDossierIdCTN());
		vrcopProdEquipmentImpl.setDossierNo(vrcopProdEquipment.getDossierNo());

		return vrcopProdEquipmentImpl;
	}

	/**
	 * Returns the vrcop prod equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop prod equipment
	 * @return the vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCOPProdEquipmentException {
		VRCOPProdEquipment vrcopProdEquipment = fetchByPrimaryKey(primaryKey);

		if (vrcopProdEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPProdEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopProdEquipment;
	}

	/**
	 * Returns the vrcop prod equipment with the primary key or throws a {@link NoSuchVRCOPProdEquipmentException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop prod equipment
	 * @return the vrcop prod equipment
	 * @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment findByPrimaryKey(long id)
		throws NoSuchVRCOPProdEquipmentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop prod equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop prod equipment
	 * @return the vrcop prod equipment, or <code>null</code> if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProdEquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPProdEquipment vrcopProdEquipment = (VRCOPProdEquipment)serializable;

		if (vrcopProdEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopProdEquipment = (VRCOPProdEquipment)session.get(VRCOPProdEquipmentImpl.class,
						primaryKey);

				if (vrcopProdEquipment != null) {
					cacheResult(vrcopProdEquipment);
				}
				else {
					entityCache.putResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProdEquipmentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProdEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopProdEquipment;
	}

	/**
	 * Returns the vrcop prod equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop prod equipment
	 * @return the vrcop prod equipment, or <code>null</code> if a vrcop prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProdEquipment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPProdEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPProdEquipment> map = new HashMap<Serializable, VRCOPProdEquipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPProdEquipment vrcopProdEquipment = fetchByPrimaryKey(primaryKey);

			if (vrcopProdEquipment != null) {
				map.put(primaryKey, vrcopProdEquipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProdEquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCOPProdEquipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE_PKS_IN);

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

			for (VRCOPProdEquipment vrcopProdEquipment : (List<VRCOPProdEquipment>)q.list()) {
				map.put(vrcopProdEquipment.getPrimaryKeyObj(),
					vrcopProdEquipment);

				cacheResult(vrcopProdEquipment);

				uncachedPrimaryKeys.remove(vrcopProdEquipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProdEquipmentImpl.class, primaryKey, nullModel);
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
	 * Returns all the vrcop prod equipments.
	 *
	 * @return the vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @return the range of vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findAll(int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop prod equipments
	 * @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop prod equipments
	 */
	@Override
	public List<VRCOPProdEquipment> findAll(int start, int end,
		OrderByComparator<VRCOPProdEquipment> orderByComparator,
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

		List<VRCOPProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPPRODEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPPRODEQUIPMENT;

				if (pagination) {
					sql = sql.concat(VRCOPProdEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProdEquipment>)QueryUtil.list(q,
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
	 * Removes all the vrcop prod equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPProdEquipment vrcopProdEquipment : findAll()) {
			remove(vrcopProdEquipment);
		}
	}

	/**
	 * Returns the number of vrcop prod equipments.
	 *
	 * @return the number of vrcop prod equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPPRODEQUIPMENT);

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
		return VRCOPProdEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop prod equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPProdEquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPPRODEQUIPMENT = "SELECT vrcopProdEquipment FROM VRCOPProdEquipment vrcopProdEquipment";
	private static final String _SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE_PKS_IN = "SELECT vrcopProdEquipment FROM VRCOPProdEquipment vrcopProdEquipment WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPPRODEQUIPMENT_WHERE = "SELECT vrcopProdEquipment FROM VRCOPProdEquipment vrcopProdEquipment WHERE ";
	private static final String _SQL_COUNT_VRCOPPRODEQUIPMENT = "SELECT COUNT(vrcopProdEquipment) FROM VRCOPProdEquipment vrcopProdEquipment";
	private static final String _SQL_COUNT_VRCOPPRODEQUIPMENT_WHERE = "SELECT COUNT(vrcopProdEquipment) FROM VRCOPProdEquipment vrcopProdEquipment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopProdEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPProdEquipment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPProdEquipment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPProdEquipmentPersistenceImpl.class);
}