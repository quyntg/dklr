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

import com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException;
import com.fds.vr.business.model.VRIssueVehiclecertificate;
import com.fds.vr.business.model.impl.VRIssueVehiclecertificateImpl;
import com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl;
import com.fds.vr.business.service.persistence.VRIssueVehiclecertificatePersistence;

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
 * The persistence implementation for the vr issue vehiclecertificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRIssueVehiclecertificatePersistence
 * @see com.fds.vr.business.service.persistence.VRIssueVehiclecertificateUtil
 * @generated
 */
@ProviderType
public class VRIssueVehiclecertificatePersistenceImpl
	extends BasePersistenceImpl<VRIssueVehiclecertificate>
	implements VRIssueVehiclecertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRIssueVehiclecertificateUtil} to access the vr issue vehiclecertificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRIssueVehiclecertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRIssueVehiclecertificateModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueVehiclecertificateModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRIssueVehiclecertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId) {
		return findBydossierId(mtCore, dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @return the range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId, int start, int end) {
		return findBydossierId(mtCore, dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { mtCore, dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] {
					mtCore, dossierId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssueVehiclecertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueVehiclecertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueVehiclecertificate vrIssueVehiclecertificate : list) {
					if ((mtCore != vrIssueVehiclecertificate.getMtCore()) ||
							(dossierId != vrIssueVehiclecertificate.getDossierId())) {
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

			query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findBydossierId_First(long mtCore,
		long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchBydossierId_First(mtCore,
				dossierId, orderByComparator);

		if (vrIssueVehiclecertificate != null) {
			return vrIssueVehiclecertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueVehiclecertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchBydossierId_First(long mtCore,
		long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		List<VRIssueVehiclecertificate> list = findBydossierId(mtCore,
				dossierId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findBydossierId_Last(long mtCore,
		long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchBydossierId_Last(mtCore,
				dossierId, orderByComparator);

		if (vrIssueVehiclecertificate != null) {
			return vrIssueVehiclecertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueVehiclecertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchBydossierId_Last(long mtCore,
		long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		int count = countBydossierId(mtCore, dossierId);

		if (count == 0) {
			return null;
		}

		List<VRIssueVehiclecertificate> list = findBydossierId(mtCore,
				dossierId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr issue vehiclecertificate
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate[] findBydossierId_PrevAndNext(long id,
		long mtCore, long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueVehiclecertificate[] array = new VRIssueVehiclecertificateImpl[3];

			array[0] = getBydossierId_PrevAndNext(session,
					vrIssueVehiclecertificate, mtCore, dossierId,
					orderByComparator, true);

			array[1] = vrIssueVehiclecertificate;

			array[2] = getBydossierId_PrevAndNext(session,
					vrIssueVehiclecertificate, mtCore, dossierId,
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

	protected VRIssueVehiclecertificate getBydossierId_PrevAndNext(
		Session session, VRIssueVehiclecertificate vrIssueVehiclecertificate,
		long mtCore, long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

		query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

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
			query.append(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueVehiclecertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueVehiclecertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBydossierId(long mtCore, long dossierId) {
		for (VRIssueVehiclecertificate vrIssueVehiclecertificate : findBydossierId(
				mtCore, dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueVehiclecertificate);
		}
	}

	/**
	 * Returns the number of vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the number of matching vr issue vehiclecertificates
	 */
	@Override
	public int countBydossierId(long mtCore, long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { mtCore, dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUEVEHICLECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrIssueVehiclecertificate.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrIssueVehiclecertificate.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEID_MTCORE =
		new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByissueId_MtCore",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID_MTCORE =
		new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByissueId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRIssueVehiclecertificateModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueVehiclecertificateModelImpl.ISSUEID_COLUMN_BITMASK |
			VRIssueVehiclecertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEID_MTCORE = new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissueId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @return the matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findByissueId_MtCore(long mtCore,
		long issueId) {
		return findByissueId_MtCore(mtCore, issueId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @return the range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findByissueId_MtCore(long mtCore,
		long issueId, int start, int end) {
		return findByissueId_MtCore(mtCore, issueId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findByissueId_MtCore(long mtCore,
		long issueId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return findByissueId_MtCore(mtCore, issueId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findByissueId_MtCore(long mtCore,
		long issueId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID_MTCORE;
			finderArgs = new Object[] { mtCore, issueId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEID_MTCORE;
			finderArgs = new Object[] {
					mtCore, issueId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssueVehiclecertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueVehiclecertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueVehiclecertificate vrIssueVehiclecertificate : list) {
					if ((mtCore != vrIssueVehiclecertificate.getMtCore()) ||
							(issueId != vrIssueVehiclecertificate.getIssueId())) {
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

			query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_ISSUEID_MTCORE_MTCORE_2);

			query.append(_FINDER_COLUMN_ISSUEID_MTCORE_ISSUEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(issueId);

				if (!pagination) {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findByissueId_MtCore_First(long mtCore,
		long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchByissueId_MtCore_First(mtCore,
				issueId, orderByComparator);

		if (vrIssueVehiclecertificate != null) {
			return vrIssueVehiclecertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueVehiclecertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchByissueId_MtCore_First(long mtCore,
		long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		List<VRIssueVehiclecertificate> list = findByissueId_MtCore(mtCore,
				issueId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findByissueId_MtCore_Last(long mtCore,
		long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchByissueId_MtCore_Last(mtCore,
				issueId, orderByComparator);

		if (vrIssueVehiclecertificate != null) {
			return vrIssueVehiclecertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueVehiclecertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchByissueId_MtCore_Last(long mtCore,
		long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		int count = countByissueId_MtCore(mtCore, issueId);

		if (count == 0) {
			return null;
		}

		List<VRIssueVehiclecertificate> list = findByissueId_MtCore(mtCore,
				issueId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	 *
	 * @param id the primary key of the current vr issue vehiclecertificate
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate[] findByissueId_MtCore_PrevAndNext(
		long id, long mtCore, long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueVehiclecertificate[] array = new VRIssueVehiclecertificateImpl[3];

			array[0] = getByissueId_MtCore_PrevAndNext(session,
					vrIssueVehiclecertificate, mtCore, issueId,
					orderByComparator, true);

			array[1] = vrIssueVehiclecertificate;

			array[2] = getByissueId_MtCore_PrevAndNext(session,
					vrIssueVehiclecertificate, mtCore, issueId,
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

	protected VRIssueVehiclecertificate getByissueId_MtCore_PrevAndNext(
		Session session, VRIssueVehiclecertificate vrIssueVehiclecertificate,
		long mtCore, long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE);

		query.append(_FINDER_COLUMN_ISSUEID_MTCORE_MTCORE_2);

		query.append(_FINDER_COLUMN_ISSUEID_MTCORE_ISSUEID_2);

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
			query.append(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(issueId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueVehiclecertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueVehiclecertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 */
	@Override
	public void removeByissueId_MtCore(long mtCore, long issueId) {
		for (VRIssueVehiclecertificate vrIssueVehiclecertificate : findByissueId_MtCore(
				mtCore, issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueVehiclecertificate);
		}
	}

	/**
	 * Returns the number of vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueId the issue ID
	 * @return the number of matching vr issue vehiclecertificates
	 */
	@Override
	public int countByissueId_MtCore(long mtCore, long issueId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUEID_MTCORE;

		Object[] finderArgs = new Object[] { mtCore, issueId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUEVEHICLECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_ISSUEID_MTCORE_MTCORE_2);

			query.append(_FINDER_COLUMN_ISSUEID_MTCORE_ISSUEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(issueId);

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

	private static final String _FINDER_COLUMN_ISSUEID_MTCORE_MTCORE_2 = "vrIssueVehiclecertificate.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_ISSUEID_MTCORE_ISSUEID_2 = "vrIssueVehiclecertificate.issueId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRIssueVehiclecertificateModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueVehiclecertificateModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRIssueVehiclecertificateModelImpl.CERTIFICATEID_COLUMN_BITMASK |
			VRIssueVehiclecertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATEID = new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @return the matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findBycertificateId(long mtCore,
		long dossierId, long certificateId) {
		return findBycertificateId(mtCore, dossierId, certificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @return the range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findBycertificateId(long mtCore,
		long dossierId, long certificateId, int start, int end) {
		return findBycertificateId(mtCore, dossierId, certificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findBycertificateId(long mtCore,
		long dossierId, long certificateId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return findBycertificateId(mtCore, dossierId, certificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findBycertificateId(long mtCore,
		long dossierId, long certificateId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] { mtCore, dossierId, certificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] {
					mtCore, dossierId, certificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssueVehiclecertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueVehiclecertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueVehiclecertificate vrIssueVehiclecertificate : list) {
					if ((mtCore != vrIssueVehiclecertificate.getMtCore()) ||
							(dossierId != vrIssueVehiclecertificate.getDossierId()) ||
							(certificateId != vrIssueVehiclecertificate.getCertificateId())) {
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

			query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

				qPos.add(certificateId);

				if (!pagination) {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findBycertificateId_First(long mtCore,
		long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchBycertificateId_First(mtCore,
				dossierId, certificateId, orderByComparator);

		if (vrIssueVehiclecertificate != null) {
			return vrIssueVehiclecertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueVehiclecertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchBycertificateId_First(long mtCore,
		long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		List<VRIssueVehiclecertificate> list = findBycertificateId(mtCore,
				dossierId, certificateId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findBycertificateId_Last(long mtCore,
		long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchBycertificateId_Last(mtCore,
				dossierId, certificateId, orderByComparator);

		if (vrIssueVehiclecertificate != null) {
			return vrIssueVehiclecertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueVehiclecertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchBycertificateId_Last(long mtCore,
		long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		int count = countBycertificateId(mtCore, dossierId, certificateId);

		if (count == 0) {
			return null;
		}

		List<VRIssueVehiclecertificate> list = findBycertificateId(mtCore,
				dossierId, certificateId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * @param id the primary key of the current vr issue vehiclecertificate
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate[] findBycertificateId_PrevAndNext(
		long id, long mtCore, long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueVehiclecertificate[] array = new VRIssueVehiclecertificateImpl[3];

			array[0] = getBycertificateId_PrevAndNext(session,
					vrIssueVehiclecertificate, mtCore, dossierId,
					certificateId, orderByComparator, true);

			array[1] = vrIssueVehiclecertificate;

			array[2] = getBycertificateId_PrevAndNext(session,
					vrIssueVehiclecertificate, mtCore, dossierId,
					certificateId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssueVehiclecertificate getBycertificateId_PrevAndNext(
		Session session, VRIssueVehiclecertificate vrIssueVehiclecertificate,
		long mtCore, long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE);

		query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

		query.append(_FINDER_COLUMN_CERTIFICATEID_DOSSIERID_2);

		query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

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
			query.append(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(dossierId);

		qPos.add(certificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueVehiclecertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueVehiclecertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 */
	@Override
	public void removeBycertificateId(long mtCore, long dossierId,
		long certificateId) {
		for (VRIssueVehiclecertificate vrIssueVehiclecertificate : findBycertificateId(
				mtCore, dossierId, certificateId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrIssueVehiclecertificate);
		}
	}

	/**
	 * Returns the number of vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param certificateId the certificate ID
	 * @return the number of matching vr issue vehiclecertificates
	 */
	@Override
	public int countBycertificateId(long mtCore, long dossierId,
		long certificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATEID;

		Object[] finderArgs = new Object[] { mtCore, dossierId, certificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRISSUEVEHICLECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

				qPos.add(certificateId);

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

	private static final String _FINDER_COLUMN_CERTIFICATEID_MTCORE_2 = "vrIssueVehiclecertificate.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATEID_DOSSIERID_2 = "vrIssueVehiclecertificate.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2 = "vrIssueVehiclecertificate.certificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEID = new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByissueId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID =
		new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByissueId",
			new String[] { Long.class.getName() },
			VRIssueVehiclecertificateModelImpl.ISSUEID_COLUMN_BITMASK |
			VRIssueVehiclecertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEID = new FinderPath(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissueId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr issue vehiclecertificates where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @return the matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findByissueId(long issueId) {
		return findByissueId(issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue vehiclecertificates where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @return the range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findByissueId(long issueId,
		int start, int end) {
		return findByissueId(issueId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findByissueId(long issueId,
		int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return findByissueId(issueId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findByissueId(long issueId,
		int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID;
			finderArgs = new Object[] { issueId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEID;
			finderArgs = new Object[] { issueId, start, end, orderByComparator };
		}

		List<VRIssueVehiclecertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueVehiclecertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueVehiclecertificate vrIssueVehiclecertificate : list) {
					if ((issueId != vrIssueVehiclecertificate.getIssueId())) {
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

			query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_ISSUEID_ISSUEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueId);

				if (!pagination) {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findByissueId_First(long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchByissueId_First(issueId,
				orderByComparator);

		if (vrIssueVehiclecertificate != null) {
			return vrIssueVehiclecertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueVehiclecertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchByissueId_First(long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		List<VRIssueVehiclecertificate> list = findByissueId(issueId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findByissueId_Last(long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchByissueId_Last(issueId,
				orderByComparator);

		if (vrIssueVehiclecertificate != null) {
			return vrIssueVehiclecertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueVehiclecertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchByissueId_Last(long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		int count = countByissueId(issueId);

		if (count == 0) {
			return null;
		}

		List<VRIssueVehiclecertificate> list = findByissueId(issueId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	 *
	 * @param id the primary key of the current vr issue vehiclecertificate
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate[] findByissueId_PrevAndNext(long id,
		long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueVehiclecertificate[] array = new VRIssueVehiclecertificateImpl[3];

			array[0] = getByissueId_PrevAndNext(session,
					vrIssueVehiclecertificate, issueId, orderByComparator, true);

			array[1] = vrIssueVehiclecertificate;

			array[2] = getByissueId_PrevAndNext(session,
					vrIssueVehiclecertificate, issueId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssueVehiclecertificate getByissueId_PrevAndNext(
		Session session, VRIssueVehiclecertificate vrIssueVehiclecertificate,
		long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE);

		query.append(_FINDER_COLUMN_ISSUEID_ISSUEID_2);

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
			query.append(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(issueId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueVehiclecertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueVehiclecertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue vehiclecertificates where issueId = &#63; from the database.
	 *
	 * @param issueId the issue ID
	 */
	@Override
	public void removeByissueId(long issueId) {
		for (VRIssueVehiclecertificate vrIssueVehiclecertificate : findByissueId(
				issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueVehiclecertificate);
		}
	}

	/**
	 * Returns the number of vr issue vehiclecertificates where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @return the number of matching vr issue vehiclecertificates
	 */
	@Override
	public int countByissueId(long issueId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUEID;

		Object[] finderArgs = new Object[] { issueId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRISSUEVEHICLECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_ISSUEID_ISSUEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueId);

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

	private static final String _FINDER_COLUMN_ISSUEID_ISSUEID_2 = "vrIssueVehiclecertificate.issueId = ?";

	public VRIssueVehiclecertificatePersistenceImpl() {
		setModelClass(VRIssueVehiclecertificate.class);
	}

	/**
	 * Caches the vr issue vehiclecertificate in the entity cache if it is enabled.
	 *
	 * @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	 */
	@Override
	public void cacheResult(VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		entityCache.putResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			vrIssueVehiclecertificate.getPrimaryKey(), vrIssueVehiclecertificate);

		vrIssueVehiclecertificate.resetOriginalValues();
	}

	/**
	 * Caches the vr issue vehiclecertificates in the entity cache if it is enabled.
	 *
	 * @param vrIssueVehiclecertificates the vr issue vehiclecertificates
	 */
	@Override
	public void cacheResult(
		List<VRIssueVehiclecertificate> vrIssueVehiclecertificates) {
		for (VRIssueVehiclecertificate vrIssueVehiclecertificate : vrIssueVehiclecertificates) {
			if (entityCache.getResult(
						VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
						VRIssueVehiclecertificateImpl.class,
						vrIssueVehiclecertificate.getPrimaryKey()) == null) {
				cacheResult(vrIssueVehiclecertificate);
			}
			else {
				vrIssueVehiclecertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr issue vehiclecertificates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRIssueVehiclecertificateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr issue vehiclecertificate.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		entityCache.removeResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			vrIssueVehiclecertificate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRIssueVehiclecertificate> vrIssueVehiclecertificates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRIssueVehiclecertificate vrIssueVehiclecertificate : vrIssueVehiclecertificates) {
			entityCache.removeResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
				VRIssueVehiclecertificateImpl.class,
				vrIssueVehiclecertificate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr issue vehiclecertificate with the primary key. Does not add the vr issue vehiclecertificate to the database.
	 *
	 * @param id the primary key for the new vr issue vehiclecertificate
	 * @return the new vr issue vehiclecertificate
	 */
	@Override
	public VRIssueVehiclecertificate create(long id) {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = new VRIssueVehiclecertificateImpl();

		vrIssueVehiclecertificate.setNew(true);
		vrIssueVehiclecertificate.setPrimaryKey(id);

		return vrIssueVehiclecertificate;
	}

	/**
	 * Removes the vr issue vehiclecertificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr issue vehiclecertificate
	 * @return the vr issue vehiclecertificate that was removed
	 * @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate remove(long id)
		throws NoSuchVRIssueVehiclecertificateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr issue vehiclecertificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr issue vehiclecertificate
	 * @return the vr issue vehiclecertificate that was removed
	 * @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate remove(Serializable primaryKey)
		throws NoSuchVRIssueVehiclecertificateException {
		Session session = null;

		try {
			session = openSession();

			VRIssueVehiclecertificate vrIssueVehiclecertificate = (VRIssueVehiclecertificate)session.get(VRIssueVehiclecertificateImpl.class,
					primaryKey);

			if (vrIssueVehiclecertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRIssueVehiclecertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrIssueVehiclecertificate);
		}
		catch (NoSuchVRIssueVehiclecertificateException nsee) {
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
	protected VRIssueVehiclecertificate removeImpl(
		VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		vrIssueVehiclecertificate = toUnwrappedModel(vrIssueVehiclecertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrIssueVehiclecertificate)) {
				vrIssueVehiclecertificate = (VRIssueVehiclecertificate)session.get(VRIssueVehiclecertificateImpl.class,
						vrIssueVehiclecertificate.getPrimaryKeyObj());
			}

			if (vrIssueVehiclecertificate != null) {
				session.delete(vrIssueVehiclecertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrIssueVehiclecertificate != null) {
			clearCache(vrIssueVehiclecertificate);
		}

		return vrIssueVehiclecertificate;
	}

	@Override
	public VRIssueVehiclecertificate updateImpl(
		VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		vrIssueVehiclecertificate = toUnwrappedModel(vrIssueVehiclecertificate);

		boolean isNew = vrIssueVehiclecertificate.isNew();

		VRIssueVehiclecertificateModelImpl vrIssueVehiclecertificateModelImpl = (VRIssueVehiclecertificateModelImpl)vrIssueVehiclecertificate;

		Session session = null;

		try {
			session = openSession();

			if (vrIssueVehiclecertificate.isNew()) {
				session.save(vrIssueVehiclecertificate);

				vrIssueVehiclecertificate.setNew(false);
			}
			else {
				vrIssueVehiclecertificate = (VRIssueVehiclecertificate)session.merge(vrIssueVehiclecertificate);
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
				!VRIssueVehiclecertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrIssueVehiclecertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueVehiclecertificateModelImpl.getOriginalMtCore(),
						vrIssueVehiclecertificateModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrIssueVehiclecertificateModelImpl.getMtCore(),
						vrIssueVehiclecertificateModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrIssueVehiclecertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID_MTCORE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueVehiclecertificateModelImpl.getOriginalMtCore(),
						vrIssueVehiclecertificateModelImpl.getOriginalIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID_MTCORE,
					args);

				args = new Object[] {
						vrIssueVehiclecertificateModelImpl.getMtCore(),
						vrIssueVehiclecertificateModelImpl.getIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID_MTCORE,
					args);
			}

			if ((vrIssueVehiclecertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueVehiclecertificateModelImpl.getOriginalMtCore(),
						vrIssueVehiclecertificateModelImpl.getOriginalDossierId(),
						vrIssueVehiclecertificateModelImpl.getOriginalCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);

				args = new Object[] {
						vrIssueVehiclecertificateModelImpl.getMtCore(),
						vrIssueVehiclecertificateModelImpl.getDossierId(),
						vrIssueVehiclecertificateModelImpl.getCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);
			}

			if ((vrIssueVehiclecertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueVehiclecertificateModelImpl.getOriginalIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID,
					args);

				args = new Object[] {
						vrIssueVehiclecertificateModelImpl.getIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID,
					args);
			}
		}

		entityCache.putResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueVehiclecertificateImpl.class,
			vrIssueVehiclecertificate.getPrimaryKey(),
			vrIssueVehiclecertificate, false);

		vrIssueVehiclecertificate.resetOriginalValues();

		return vrIssueVehiclecertificate;
	}

	protected VRIssueVehiclecertificate toUnwrappedModel(
		VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		if (vrIssueVehiclecertificate instanceof VRIssueVehiclecertificateImpl) {
			return vrIssueVehiclecertificate;
		}

		VRIssueVehiclecertificateImpl vrIssueVehiclecertificateImpl = new VRIssueVehiclecertificateImpl();

		vrIssueVehiclecertificateImpl.setNew(vrIssueVehiclecertificate.isNew());
		vrIssueVehiclecertificateImpl.setPrimaryKey(vrIssueVehiclecertificate.getPrimaryKey());

		vrIssueVehiclecertificateImpl.setId(vrIssueVehiclecertificate.getId());
		vrIssueVehiclecertificateImpl.setMtCore(vrIssueVehiclecertificate.getMtCore());
		vrIssueVehiclecertificateImpl.setIssueId(vrIssueVehiclecertificate.getIssueId());
		vrIssueVehiclecertificateImpl.setDossierId(vrIssueVehiclecertificate.getDossierId());
		vrIssueVehiclecertificateImpl.setCertificateId(vrIssueVehiclecertificate.getCertificateId());
		vrIssueVehiclecertificateImpl.setVehiclePrice(vrIssueVehiclecertificate.getVehiclePrice());
		vrIssueVehiclecertificateImpl.setTotalQuantity(vrIssueVehiclecertificate.getTotalQuantity());
		vrIssueVehiclecertificateImpl.setUnitPrice(vrIssueVehiclecertificate.getUnitPrice());
		vrIssueVehiclecertificateImpl.setTotalProduct(vrIssueVehiclecertificate.getTotalProduct());
		vrIssueVehiclecertificateImpl.setCertificateRecordNo(vrIssueVehiclecertificate.getCertificateRecordNo());
		vrIssueVehiclecertificateImpl.setProductionExamReportNo(vrIssueVehiclecertificate.getProductionExamReportNo());
		vrIssueVehiclecertificateImpl.setCertificateRecordDate(vrIssueVehiclecertificate.getCertificateRecordDate());
		vrIssueVehiclecertificateImpl.setModifyDate(vrIssueVehiclecertificate.getModifyDate());
		vrIssueVehiclecertificateImpl.setSyncDate(vrIssueVehiclecertificate.getSyncDate());

		return vrIssueVehiclecertificateImpl;
	}

	/**
	 * Returns the vr issue vehiclecertificate with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr issue vehiclecertificate
	 * @return the vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRIssueVehiclecertificateException {
		VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchByPrimaryKey(primaryKey);

		if (vrIssueVehiclecertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRIssueVehiclecertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrIssueVehiclecertificate;
	}

	/**
	 * Returns the vr issue vehiclecertificate with the primary key or throws a {@link NoSuchVRIssueVehiclecertificateException} if it could not be found.
	 *
	 * @param id the primary key of the vr issue vehiclecertificate
	 * @return the vr issue vehiclecertificate
	 * @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate findByPrimaryKey(long id)
		throws NoSuchVRIssueVehiclecertificateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr issue vehiclecertificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr issue vehiclecertificate
	 * @return the vr issue vehiclecertificate, or <code>null</code> if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
				VRIssueVehiclecertificateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRIssueVehiclecertificate vrIssueVehiclecertificate = (VRIssueVehiclecertificate)serializable;

		if (vrIssueVehiclecertificate == null) {
			Session session = null;

			try {
				session = openSession();

				vrIssueVehiclecertificate = (VRIssueVehiclecertificate)session.get(VRIssueVehiclecertificateImpl.class,
						primaryKey);

				if (vrIssueVehiclecertificate != null) {
					cacheResult(vrIssueVehiclecertificate);
				}
				else {
					entityCache.putResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
						VRIssueVehiclecertificateImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueVehiclecertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrIssueVehiclecertificate;
	}

	/**
	 * Returns the vr issue vehiclecertificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr issue vehiclecertificate
	 * @return the vr issue vehiclecertificate, or <code>null</code> if a vr issue vehiclecertificate with the primary key could not be found
	 */
	@Override
	public VRIssueVehiclecertificate fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRIssueVehiclecertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRIssueVehiclecertificate> map = new HashMap<Serializable, VRIssueVehiclecertificate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRIssueVehiclecertificate vrIssueVehiclecertificate = fetchByPrimaryKey(primaryKey);

			if (vrIssueVehiclecertificate != null) {
				map.put(primaryKey, vrIssueVehiclecertificate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueVehiclecertificateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRIssueVehiclecertificate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE_PKS_IN);

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

			for (VRIssueVehiclecertificate vrIssueVehiclecertificate : (List<VRIssueVehiclecertificate>)q.list()) {
				map.put(vrIssueVehiclecertificate.getPrimaryKeyObj(),
					vrIssueVehiclecertificate);

				cacheResult(vrIssueVehiclecertificate);

				uncachedPrimaryKeys.remove(vrIssueVehiclecertificate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRIssueVehiclecertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueVehiclecertificateImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr issue vehiclecertificates.
	 *
	 * @return the vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue vehiclecertificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @return the range of vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findAll(int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue vehiclecertificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue vehiclecertificates
	 * @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr issue vehiclecertificates
	 */
	@Override
	public List<VRIssueVehiclecertificate> findAll(int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
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

		List<VRIssueVehiclecertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueVehiclecertificate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRISSUEVEHICLECERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRISSUEVEHICLECERTIFICATE;

				if (pagination) {
					sql = sql.concat(VRIssueVehiclecertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueVehiclecertificate>)QueryUtil.list(q,
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
	 * Removes all the vr issue vehiclecertificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRIssueVehiclecertificate vrIssueVehiclecertificate : findAll()) {
			remove(vrIssueVehiclecertificate);
		}
	}

	/**
	 * Returns the number of vr issue vehiclecertificates.
	 *
	 * @return the number of vr issue vehiclecertificates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRISSUEVEHICLECERTIFICATE);

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
		return VRIssueVehiclecertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr issue vehiclecertificate persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRIssueVehiclecertificateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRISSUEVEHICLECERTIFICATE = "SELECT vrIssueVehiclecertificate FROM VRIssueVehiclecertificate vrIssueVehiclecertificate";
	private static final String _SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE_PKS_IN =
		"SELECT vrIssueVehiclecertificate FROM VRIssueVehiclecertificate vrIssueVehiclecertificate WHERE id IN (";
	private static final String _SQL_SELECT_VRISSUEVEHICLECERTIFICATE_WHERE = "SELECT vrIssueVehiclecertificate FROM VRIssueVehiclecertificate vrIssueVehiclecertificate WHERE ";
	private static final String _SQL_COUNT_VRISSUEVEHICLECERTIFICATE = "SELECT COUNT(vrIssueVehiclecertificate) FROM VRIssueVehiclecertificate vrIssueVehiclecertificate";
	private static final String _SQL_COUNT_VRISSUEVEHICLECERTIFICATE_WHERE = "SELECT COUNT(vrIssueVehiclecertificate) FROM VRIssueVehiclecertificate vrIssueVehiclecertificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrIssueVehiclecertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRIssueVehiclecertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRIssueVehiclecertificate exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRIssueVehiclecertificatePersistenceImpl.class);
}