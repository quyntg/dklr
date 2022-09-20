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

import com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException;
import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.model.impl.VRCorporationAttendeeImpl;
import com.fds.vr.business.model.impl.VRCorporationAttendeeModelImpl;
import com.fds.vr.business.service.persistence.VRCorporationAttendeePersistence;

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

import java.sql.Timestamp;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vr corporation attendee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCorporationAttendeePersistence
 * @see com.fds.vr.business.service.persistence.VRCorporationAttendeeUtil
 * @generated
 */
@ProviderType
public class VRCorporationAttendeePersistenceImpl extends BasePersistenceImpl<VRCorporationAttendee>
	implements VRCorporationAttendeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCorporationAttendeeUtil} to access the vr corporation attendee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCorporationAttendeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONCODE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCorporationCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCorporationCode",
			new String[] { String.class.getName() },
			VRCorporationAttendeeModelImpl.CORPORATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONCODE = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCorporationCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr corporation attendees where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByCorporationCode(
		String corporationCode) {
		return findByCorporationCode(corporationCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where corporationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByCorporationCode(
		String corporationCode, int start, int end) {
		return findByCorporationCode(corporationCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where corporationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByCorporationCode(
		String corporationCode, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByCorporationCode(corporationCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where corporationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByCorporationCode(
		String corporationCode, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if (!Objects.equals(corporationCode,
								vrCorporationAttendee.getCorporationCode())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

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
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByCorporationCode_First(
		String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByCorporationCode_First(corporationCode,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationCode=");
		msg.append(corporationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByCorporationCode_First(
		String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByCorporationCode(corporationCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByCorporationCode_Last(
		String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByCorporationCode_Last(corporationCode,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationCode=");
		msg.append(corporationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByCorporationCode_Last(
		String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByCorporationCode(corporationCode);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByCorporationCode(corporationCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where corporationCode = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param corporationCode the corporation code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByCorporationCode_PrevAndNext(long id,
		String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByCorporationCode_PrevAndNext(session,
					vrCorporationAttendee, corporationCode, orderByComparator,
					true);

			array[1] = vrCorporationAttendee;

			array[2] = getByCorporationCode_PrevAndNext(session,
					vrCorporationAttendee, corporationCode, orderByComparator,
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

	protected VRCorporationAttendee getByCorporationCode_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where corporationCode = &#63; from the database.
	 *
	 * @param corporationCode the corporation code
	 */
	@Override
	public void removeByCorporationCode(String corporationCode) {
		for (VRCorporationAttendee vrCorporationAttendee : findByCorporationCode(
				corporationCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where corporationCode = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByCorporationCode(String corporationCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONCODE;

		Object[] finderArgs = new Object[] { corporationCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

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
		"vrCorporationAttendee.corporationCode IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_2 =
		"vrCorporationAttendee.corporationCode = ?";
	private static final String _FINDER_COLUMN_CORPORATIONCODE_CORPORATIONCODE_3 =
		"(vrCorporationAttendee.corporationCode IS NULL OR vrCorporationAttendee.corporationCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MANAGERID =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByManagerId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByManagerId",
			new String[] { Long.class.getName() },
			VRCorporationAttendeeModelImpl.MANAGERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MANAGERID = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByManagerId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr corporation attendees where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByManagerId(long managerId) {
		return findByManagerId(managerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where managerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByManagerId(long managerId,
		int start, int end) {
		return findByManagerId(managerId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where managerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByManagerId(long managerId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByManagerId(managerId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where managerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByManagerId(long managerId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID;
			finderArgs = new Object[] { managerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MANAGERID;
			finderArgs = new Object[] { managerId, start, end, orderByComparator };
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if ((managerId != vrCorporationAttendee.getManagerId())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_MANAGERID_MANAGERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(managerId);

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByManagerId_First(long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByManagerId_First(managerId,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerId=");
		msg.append(managerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByManagerId_First(long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByManagerId(managerId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByManagerId_Last(long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByManagerId_Last(managerId,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerId=");
		msg.append(managerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByManagerId_Last(long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByManagerId(managerId);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByManagerId(managerId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where managerId = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByManagerId_PrevAndNext(long id,
		long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByManagerId_PrevAndNext(session,
					vrCorporationAttendee, managerId, orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByManagerId_PrevAndNext(session,
					vrCorporationAttendee, managerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCorporationAttendee getByManagerId_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		query.append(_FINDER_COLUMN_MANAGERID_MANAGERID_2);

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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(managerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where managerId = &#63; from the database.
	 *
	 * @param managerId the manager ID
	 */
	@Override
	public void removeByManagerId(long managerId) {
		for (VRCorporationAttendee vrCorporationAttendee : findByManagerId(
				managerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByManagerId(long managerId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MANAGERID;

		Object[] finderArgs = new Object[] { managerId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_MANAGERID_MANAGERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(managerId);

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

	private static final String _FINDER_COLUMN_MANAGERID_MANAGERID_2 = "vrCorporationAttendee.managerId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LEADERID = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLeaderId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERID =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLeaderId",
			new String[] { Long.class.getName() },
			VRCorporationAttendeeModelImpl.LEADERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LEADERID = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLeaderId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr corporation attendees where leaderId = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByLeaderId(long leaderId) {
		return findByLeaderId(leaderId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where leaderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param leaderId the leader ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByLeaderId(long leaderId, int start,
		int end) {
		return findByLeaderId(leaderId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where leaderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param leaderId the leader ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByLeaderId(long leaderId, int start,
		int end, OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByLeaderId(leaderId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where leaderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param leaderId the leader ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByLeaderId(long leaderId, int start,
		int end, OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERID;
			finderArgs = new Object[] { leaderId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LEADERID;
			finderArgs = new Object[] { leaderId, start, end, orderByComparator };
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if ((leaderId != vrCorporationAttendee.getLeaderId())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_LEADERID_LEADERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(leaderId);

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where leaderId = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByLeaderId_First(long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByLeaderId_First(leaderId,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("leaderId=");
		msg.append(leaderId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where leaderId = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByLeaderId_First(long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByLeaderId(leaderId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where leaderId = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByLeaderId_Last(long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByLeaderId_Last(leaderId,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("leaderId=");
		msg.append(leaderId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where leaderId = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByLeaderId_Last(long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByLeaderId(leaderId);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByLeaderId(leaderId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where leaderId = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param leaderId the leader ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByLeaderId_PrevAndNext(long id,
		long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByLeaderId_PrevAndNext(session,
					vrCorporationAttendee, leaderId, orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByLeaderId_PrevAndNext(session,
					vrCorporationAttendee, leaderId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCorporationAttendee getByLeaderId_PrevAndNext(Session session,
		VRCorporationAttendee vrCorporationAttendee, long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		query.append(_FINDER_COLUMN_LEADERID_LEADERID_2);

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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(leaderId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where leaderId = &#63; from the database.
	 *
	 * @param leaderId the leader ID
	 */
	@Override
	public void removeByLeaderId(long leaderId) {
		for (VRCorporationAttendee vrCorporationAttendee : findByLeaderId(
				leaderId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where leaderId = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByLeaderId(long leaderId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LEADERID;

		Object[] finderArgs = new Object[] { leaderId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_LEADERID_LEADERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(leaderId);

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

	private static final String _FINDER_COLUMN_LEADERID_LEADERID_2 = "vrCorporationAttendee.leaderId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTIDNO =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApplicantIdNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApplicantIdNo",
			new String[] { String.class.getName() },
			VRCorporationAttendeeModelImpl.APPLICANTIDNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTIDNO = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByApplicantIdNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr corporation attendees where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByApplicantIdNo(String applicantIdNo) {
		return findByApplicantIdNo(applicantIdNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where applicantIdNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByApplicantIdNo(
		String applicantIdNo, int start, int end) {
		return findByApplicantIdNo(applicantIdNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where applicantIdNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByApplicantIdNo(
		String applicantIdNo, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByApplicantIdNo(applicantIdNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where applicantIdNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByApplicantIdNo(
		String applicantIdNo, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO;
			finderArgs = new Object[] { applicantIdNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTIDNO;
			finderArgs = new Object[] {
					applicantIdNo,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if (!Objects.equals(applicantIdNo,
								vrCorporationAttendee.getApplicantIdNo())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByApplicantIdNo_First(
		String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByApplicantIdNo_First(applicantIdNo,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByApplicantIdNo_First(
		String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByApplicantIdNo(applicantIdNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByApplicantIdNo_Last(
		String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByApplicantIdNo_Last(applicantIdNo,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByApplicantIdNo_Last(
		String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByApplicantIdNo(applicantIdNo);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByApplicantIdNo(applicantIdNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByApplicantIdNo_PrevAndNext(long id,
		String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByApplicantIdNo_PrevAndNext(session,
					vrCorporationAttendee, applicantIdNo, orderByComparator,
					true);

			array[1] = vrCorporationAttendee;

			array[2] = getByApplicantIdNo_PrevAndNext(session,
					vrCorporationAttendee, applicantIdNo, orderByComparator,
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

	protected VRCorporationAttendee getByApplicantIdNo_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_2);
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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where applicantIdNo = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 */
	@Override
	public void removeByApplicantIdNo(String applicantIdNo) {
		for (VRCorporationAttendee vrCorporationAttendee : findByApplicantIdNo(
				applicantIdNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByApplicantIdNo(String applicantIdNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTIDNO;

		Object[] finderArgs = new Object[] { applicantIdNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
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

	private static final String _FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_1 = "vrCorporationAttendee.applicantIdNo IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_2 = "vrCorporationAttendee.applicantIdNo = ?";
	private static final String _FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_3 = "(vrCorporationAttendee.applicantIdNo IS NULL OR vrCorporationAttendee.applicantIdNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTIDNOINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByApplicantIdNoInspectionDate",
			new String[] {
				String.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNOINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByApplicantIdNoInspectionDate",
			new String[] { String.class.getName(), Date.class.getName() },
			VRCorporationAttendeeModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRCorporationAttendeeModelImpl.INSPECTIONDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTIDNOINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByApplicantIdNoInspectionDate",
			new String[] { String.class.getName(), Date.class.getName() });

	/**
	 * Returns all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		String applicantIdNo, Date inspectionDate) {
		return findByApplicantIdNoInspectionDate(applicantIdNo, inspectionDate,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		String applicantIdNo, Date inspectionDate, int start, int end) {
		return findByApplicantIdNoInspectionDate(applicantIdNo, inspectionDate,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		String applicantIdNo, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByApplicantIdNoInspectionDate(applicantIdNo, inspectionDate,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		String applicantIdNo, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNOINSPECTIONDATE;
			finderArgs = new Object[] { applicantIdNo, inspectionDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTIDNOINSPECTIONDATE;
			finderArgs = new Object[] {
					applicantIdNo, inspectionDate,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if (!Objects.equals(applicantIdNo,
								vrCorporationAttendee.getApplicantIdNo()) ||
							!Objects.equals(inspectionDate,
								vrCorporationAttendee.getInspectionDate())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_2);
			}

			boolean bindInspectionDate = false;

			if (inspectionDate == null) {
				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_INSPECTIONDATE_1);
			}
			else {
				bindInspectionDate = true;

				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_INSPECTIONDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindInspectionDate) {
					qPos.add(new Timestamp(inspectionDate.getTime()));
				}

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByApplicantIdNoInspectionDate_First(
		String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByApplicantIdNoInspectionDate_First(applicantIdNo,
				inspectionDate, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", inspectionDate=");
		msg.append(inspectionDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByApplicantIdNoInspectionDate_First(
		String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByApplicantIdNoInspectionDate(applicantIdNo,
				inspectionDate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByApplicantIdNoInspectionDate_Last(
		String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByApplicantIdNoInspectionDate_Last(applicantIdNo,
				inspectionDate, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", inspectionDate=");
		msg.append(inspectionDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByApplicantIdNoInspectionDate_Last(
		String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByApplicantIdNoInspectionDate(applicantIdNo,
				inspectionDate);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByApplicantIdNoInspectionDate(applicantIdNo,
				inspectionDate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByApplicantIdNoInspectionDate_PrevAndNext(
		long id, String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByApplicantIdNoInspectionDate_PrevAndNext(session,
					vrCorporationAttendee, applicantIdNo, inspectionDate,
					orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByApplicantIdNoInspectionDate_PrevAndNext(session,
					vrCorporationAttendee, applicantIdNo, inspectionDate,
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

	protected VRCorporationAttendee getByApplicantIdNoInspectionDate_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_2);
		}

		boolean bindInspectionDate = false;

		if (inspectionDate == null) {
			query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_INSPECTIONDATE_1);
		}
		else {
			bindInspectionDate = true;

			query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_INSPECTIONDATE_2);
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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindInspectionDate) {
			qPos.add(new Timestamp(inspectionDate.getTime()));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 */
	@Override
	public void removeByApplicantIdNoInspectionDate(String applicantIdNo,
		Date inspectionDate) {
		for (VRCorporationAttendee vrCorporationAttendee : findByApplicantIdNoInspectionDate(
				applicantIdNo, inspectionDate, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param inspectionDate the inspection date
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByApplicantIdNoInspectionDate(String applicantIdNo,
		Date inspectionDate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTIDNOINSPECTIONDATE;

		Object[] finderArgs = new Object[] { applicantIdNo, inspectionDate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_2);
			}

			boolean bindInspectionDate = false;

			if (inspectionDate == null) {
				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_INSPECTIONDATE_1);
			}
			else {
				bindInspectionDate = true;

				query.append(_FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_INSPECTIONDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindInspectionDate) {
					qPos.add(new Timestamp(inspectionDate.getTime()));
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

	private static final String _FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_1 =
		"vrCorporationAttendee.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_2 =
		"vrCorporationAttendee.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_APPLICANTIDNO_3 =
		"(vrCorporationAttendee.applicantIdNo IS NULL OR vrCorporationAttendee.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_INSPECTIONDATE_1 =
		"vrCorporationAttendee.inspectionDate IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTIDNOINSPECTIONDATE_INSPECTIONDATE_2 =
		"vrCorporationAttendee.inspectionDate = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONCODEINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCorporationCodeInspectionDate",
			new String[] {
				String.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODEINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCorporationCodeInspectionDate",
			new String[] { String.class.getName(), Date.class.getName() },
			VRCorporationAttendeeModelImpl.CORPORATIONCODE_COLUMN_BITMASK |
			VRCorporationAttendeeModelImpl.INSPECTIONDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONCODEINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCorporationCodeInspectionDate",
			new String[] { String.class.getName(), Date.class.getName() });

	/**
	 * Returns all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		String corporationCode, Date inspectionDate) {
		return findByCorporationCodeInspectionDate(corporationCode,
			inspectionDate, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		String corporationCode, Date inspectionDate, int start, int end) {
		return findByCorporationCodeInspectionDate(corporationCode,
			inspectionDate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		String corporationCode, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByCorporationCodeInspectionDate(corporationCode,
			inspectionDate, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		String corporationCode, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODEINSPECTIONDATE;
			finderArgs = new Object[] { corporationCode, inspectionDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONCODEINSPECTIONDATE;
			finderArgs = new Object[] {
					corporationCode, inspectionDate,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if (!Objects.equals(corporationCode,
								vrCorporationAttendee.getCorporationCode()) ||
							!Objects.equals(inspectionDate,
								vrCorporationAttendee.getInspectionDate())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			boolean bindCorporationCode = false;

			if (corporationCode == null) {
				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_1);
			}
			else if (corporationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_3);
			}
			else {
				bindCorporationCode = true;

				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_2);
			}

			boolean bindInspectionDate = false;

			if (inspectionDate == null) {
				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_INSPECTIONDATE_1);
			}
			else {
				bindInspectionDate = true;

				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_INSPECTIONDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
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

				if (bindInspectionDate) {
					qPos.add(new Timestamp(inspectionDate.getTime()));
				}

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByCorporationCodeInspectionDate_First(
		String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByCorporationCodeInspectionDate_First(corporationCode,
				inspectionDate, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationCode=");
		msg.append(corporationCode);

		msg.append(", inspectionDate=");
		msg.append(inspectionDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByCorporationCodeInspectionDate_First(
		String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByCorporationCodeInspectionDate(corporationCode,
				inspectionDate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByCorporationCodeInspectionDate_Last(
		String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByCorporationCodeInspectionDate_Last(corporationCode,
				inspectionDate, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationCode=");
		msg.append(corporationCode);

		msg.append(", inspectionDate=");
		msg.append(inspectionDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByCorporationCodeInspectionDate_Last(
		String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByCorporationCodeInspectionDate(corporationCode,
				inspectionDate);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByCorporationCodeInspectionDate(corporationCode,
				inspectionDate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByCorporationCodeInspectionDate_PrevAndNext(
		long id, String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByCorporationCodeInspectionDate_PrevAndNext(session,
					vrCorporationAttendee, corporationCode, inspectionDate,
					orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByCorporationCodeInspectionDate_PrevAndNext(session,
					vrCorporationAttendee, corporationCode, inspectionDate,
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

	protected VRCorporationAttendee getByCorporationCodeInspectionDate_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		boolean bindCorporationCode = false;

		if (corporationCode == null) {
			query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_1);
		}
		else if (corporationCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_3);
		}
		else {
			bindCorporationCode = true;

			query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_2);
		}

		boolean bindInspectionDate = false;

		if (inspectionDate == null) {
			query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_INSPECTIONDATE_1);
		}
		else {
			bindInspectionDate = true;

			query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_INSPECTIONDATE_2);
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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationCode) {
			qPos.add(corporationCode);
		}

		if (bindInspectionDate) {
			qPos.add(new Timestamp(inspectionDate.getTime()));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63; from the database.
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 */
	@Override
	public void removeByCorporationCodeInspectionDate(String corporationCode,
		Date inspectionDate) {
		for (VRCorporationAttendee vrCorporationAttendee : findByCorporationCodeInspectionDate(
				corporationCode, inspectionDate, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	 *
	 * @param corporationCode the corporation code
	 * @param inspectionDate the inspection date
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByCorporationCodeInspectionDate(String corporationCode,
		Date inspectionDate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONCODEINSPECTIONDATE;

		Object[] finderArgs = new Object[] { corporationCode, inspectionDate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			boolean bindCorporationCode = false;

			if (corporationCode == null) {
				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_1);
			}
			else if (corporationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_3);
			}
			else {
				bindCorporationCode = true;

				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_2);
			}

			boolean bindInspectionDate = false;

			if (inspectionDate == null) {
				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_INSPECTIONDATE_1);
			}
			else {
				bindInspectionDate = true;

				query.append(_FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_INSPECTIONDATE_2);
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

				if (bindInspectionDate) {
					qPos.add(new Timestamp(inspectionDate.getTime()));
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

	private static final String _FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_1 =
		"vrCorporationAttendee.corporationCode IS NULL AND ";
	private static final String _FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_2 =
		"vrCorporationAttendee.corporationCode = ? AND ";
	private static final String _FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_CORPORATIONCODE_3 =
		"(vrCorporationAttendee.corporationCode IS NULL OR vrCorporationAttendee.corporationCode = '') AND ";
	private static final String _FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_INSPECTIONDATE_1 =
		"vrCorporationAttendee.inspectionDate IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONCODEINSPECTIONDATE_INSPECTIONDATE_2 =
		"vrCorporationAttendee.inspectionDate = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MANAGERIDINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByManagerIdInspectionDate",
			new String[] {
				Long.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERIDINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByManagerIdInspectionDate",
			new String[] { Long.class.getName(), Date.class.getName() },
			VRCorporationAttendeeModelImpl.MANAGERID_COLUMN_BITMASK |
			VRCorporationAttendeeModelImpl.INSPECTIONDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MANAGERIDINSPECTIONDATE = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByManagerIdInspectionDate",
			new String[] { Long.class.getName(), Date.class.getName() });

	/**
	 * Returns all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate) {
		return findByManagerIdInspectionDate(managerId, inspectionDate,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end) {
		return findByManagerIdInspectionDate(managerId, inspectionDate, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByManagerIdInspectionDate(managerId, inspectionDate, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERIDINSPECTIONDATE;
			finderArgs = new Object[] { managerId, inspectionDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MANAGERIDINSPECTIONDATE;
			finderArgs = new Object[] {
					managerId, inspectionDate,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if ((managerId != vrCorporationAttendee.getManagerId()) ||
							!Objects.equals(inspectionDate,
								vrCorporationAttendee.getInspectionDate())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_MANAGERID_2);

			boolean bindInspectionDate = false;

			if (inspectionDate == null) {
				query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_INSPECTIONDATE_1);
			}
			else {
				bindInspectionDate = true;

				query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_INSPECTIONDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(managerId);

				if (bindInspectionDate) {
					qPos.add(new Timestamp(inspectionDate.getTime()));
				}

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByManagerIdInspectionDate_First(
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByManagerIdInspectionDate_First(managerId,
				inspectionDate, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerId=");
		msg.append(managerId);

		msg.append(", inspectionDate=");
		msg.append(inspectionDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByManagerIdInspectionDate_First(
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByManagerIdInspectionDate(managerId,
				inspectionDate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByManagerIdInspectionDate_Last(
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByManagerIdInspectionDate_Last(managerId,
				inspectionDate, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerId=");
		msg.append(managerId);

		msg.append(", inspectionDate=");
		msg.append(inspectionDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByManagerIdInspectionDate_Last(
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByManagerIdInspectionDate(managerId, inspectionDate);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByManagerIdInspectionDate(managerId,
				inspectionDate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByManagerIdInspectionDate_PrevAndNext(
		long id, long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByManagerIdInspectionDate_PrevAndNext(session,
					vrCorporationAttendee, managerId, inspectionDate,
					orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByManagerIdInspectionDate_PrevAndNext(session,
					vrCorporationAttendee, managerId, inspectionDate,
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

	protected VRCorporationAttendee getByManagerIdInspectionDate_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_MANAGERID_2);

		boolean bindInspectionDate = false;

		if (inspectionDate == null) {
			query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_INSPECTIONDATE_1);
		}
		else {
			bindInspectionDate = true;

			query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_INSPECTIONDATE_2);
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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(managerId);

		if (bindInspectionDate) {
			qPos.add(new Timestamp(inspectionDate.getTime()));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63; from the database.
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 */
	@Override
	public void removeByManagerIdInspectionDate(long managerId,
		Date inspectionDate) {
		for (VRCorporationAttendee vrCorporationAttendee : findByManagerIdInspectionDate(
				managerId, inspectionDate, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param inspectionDate the inspection date
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByManagerIdInspectionDate(long managerId,
		Date inspectionDate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MANAGERIDINSPECTIONDATE;

		Object[] finderArgs = new Object[] { managerId, inspectionDate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_MANAGERID_2);

			boolean bindInspectionDate = false;

			if (inspectionDate == null) {
				query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_INSPECTIONDATE_1);
			}
			else {
				bindInspectionDate = true;

				query.append(_FINDER_COLUMN_MANAGERIDINSPECTIONDATE_INSPECTIONDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(managerId);

				if (bindInspectionDate) {
					qPos.add(new Timestamp(inspectionDate.getTime()));
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

	private static final String _FINDER_COLUMN_MANAGERIDINSPECTIONDATE_MANAGERID_2 =
		"vrCorporationAttendee.managerId = ? AND ";
	private static final String _FINDER_COLUMN_MANAGERIDINSPECTIONDATE_INSPECTIONDATE_1 =
		"vrCorporationAttendee.inspectionDate IS NULL";
	private static final String _FINDER_COLUMN_MANAGERIDINSPECTIONDATE_INSPECTIONDATE_2 =
		"vrCorporationAttendee.inspectionDate = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LEADERIDINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLeaderIdInspectionDate",
			new String[] {
				Long.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERIDINSPECTIONDATE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLeaderIdInspectionDate",
			new String[] { Long.class.getName(), Date.class.getName() },
			VRCorporationAttendeeModelImpl.LEADERID_COLUMN_BITMASK |
			VRCorporationAttendeeModelImpl.INSPECTIONDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LEADERIDINSPECTIONDATE = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLeaderIdInspectionDate",
			new String[] { Long.class.getName(), Date.class.getName() });

	/**
	 * Returns all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate) {
		return findByLeaderIdInspectionDate(leaderId, inspectionDate,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end) {
		return findByLeaderIdInspectionDate(leaderId, inspectionDate, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByLeaderIdInspectionDate(leaderId, inspectionDate, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERIDINSPECTIONDATE;
			finderArgs = new Object[] { leaderId, inspectionDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LEADERIDINSPECTIONDATE;
			finderArgs = new Object[] {
					leaderId, inspectionDate,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if ((leaderId != vrCorporationAttendee.getLeaderId()) ||
							!Objects.equals(inspectionDate,
								vrCorporationAttendee.getInspectionDate())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_LEADERID_2);

			boolean bindInspectionDate = false;

			if (inspectionDate == null) {
				query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_INSPECTIONDATE_1);
			}
			else {
				bindInspectionDate = true;

				query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_INSPECTIONDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(leaderId);

				if (bindInspectionDate) {
					qPos.add(new Timestamp(inspectionDate.getTime()));
				}

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByLeaderIdInspectionDate_First(
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByLeaderIdInspectionDate_First(leaderId,
				inspectionDate, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("leaderId=");
		msg.append(leaderId);

		msg.append(", inspectionDate=");
		msg.append(inspectionDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByLeaderIdInspectionDate_First(
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByLeaderIdInspectionDate(leaderId,
				inspectionDate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByLeaderIdInspectionDate_Last(
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByLeaderIdInspectionDate_Last(leaderId,
				inspectionDate, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("leaderId=");
		msg.append(leaderId);

		msg.append(", inspectionDate=");
		msg.append(inspectionDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByLeaderIdInspectionDate_Last(
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByLeaderIdInspectionDate(leaderId, inspectionDate);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByLeaderIdInspectionDate(leaderId,
				inspectionDate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByLeaderIdInspectionDate_PrevAndNext(
		long id, long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByLeaderIdInspectionDate_PrevAndNext(session,
					vrCorporationAttendee, leaderId, inspectionDate,
					orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByLeaderIdInspectionDate_PrevAndNext(session,
					vrCorporationAttendee, leaderId, inspectionDate,
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

	protected VRCorporationAttendee getByLeaderIdInspectionDate_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_LEADERID_2);

		boolean bindInspectionDate = false;

		if (inspectionDate == null) {
			query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_INSPECTIONDATE_1);
		}
		else {
			bindInspectionDate = true;

			query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_INSPECTIONDATE_2);
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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(leaderId);

		if (bindInspectionDate) {
			qPos.add(new Timestamp(inspectionDate.getTime()));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63; from the database.
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 */
	@Override
	public void removeByLeaderIdInspectionDate(long leaderId,
		Date inspectionDate) {
		for (VRCorporationAttendee vrCorporationAttendee : findByLeaderIdInspectionDate(
				leaderId, inspectionDate, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	 *
	 * @param leaderId the leader ID
	 * @param inspectionDate the inspection date
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByLeaderIdInspectionDate(long leaderId, Date inspectionDate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LEADERIDINSPECTIONDATE;

		Object[] finderArgs = new Object[] { leaderId, inspectionDate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_LEADERID_2);

			boolean bindInspectionDate = false;

			if (inspectionDate == null) {
				query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_INSPECTIONDATE_1);
			}
			else {
				bindInspectionDate = true;

				query.append(_FINDER_COLUMN_LEADERIDINSPECTIONDATE_INSPECTIONDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(leaderId);

				if (bindInspectionDate) {
					qPos.add(new Timestamp(inspectionDate.getTime()));
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

	private static final String _FINDER_COLUMN_LEADERIDINSPECTIONDATE_LEADERID_2 =
		"vrCorporationAttendee.leaderId = ? AND ";
	private static final String _FINDER_COLUMN_LEADERIDINSPECTIONDATE_INSPECTIONDATE_1 =
		"vrCorporationAttendee.inspectionDate IS NULL";
	private static final String _FINDER_COLUMN_LEADERIDINSPECTIONDATE_INSPECTIONDATE_2 =
		"vrCorporationAttendee.inspectionDate = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName() },
			VRCorporationAttendeeModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr corporation attendees where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierId(long dossierId) {
		return findByDossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierId(long dossierId,
		int start, int end) {
		return findByDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByDossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if ((dossierId != vrCorporationAttendee.getDossierId())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByDossierId_First(long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByDossierId_First(dossierId,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByDossierId_First(long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByDossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByDossierId_Last(long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByDossierId_Last(dossierId,
				orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByDossierId_Last(long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByDossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByDossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrCorporationAttendee, dossierId, orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByDossierId_PrevAndNext(session,
					vrCorporationAttendee, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCorporationAttendee getByDossierId_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeByDossierId(long dossierId) {
		for (VRCorporationAttendee vrCorporationAttendee : findByDossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByDossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrCorporationAttendee.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDACTIVITYCATEGORY =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDossierIdActivityCategory",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDACTIVITYCATEGORY =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierIdActivityCategory",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCorporationAttendeeModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCorporationAttendeeModelImpl.ACTIVITYCATETORY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDACTIVITYCATEGORY =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierIdActivityCategory",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, String activityCatetory) {
		return findByDossierIdActivityCategory(dossierId, activityCatetory,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, String activityCatetory, int start, int end) {
		return findByDossierIdActivityCategory(dossierId, activityCatetory,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, String activityCatetory, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByDossierIdActivityCategory(dossierId, activityCatetory,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, String activityCatetory, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDACTIVITYCATEGORY;
			finderArgs = new Object[] { dossierId, activityCatetory };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDACTIVITYCATEGORY;
			finderArgs = new Object[] {
					dossierId, activityCatetory,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if ((dossierId != vrCorporationAttendee.getDossierId()) ||
							!Objects.equals(activityCatetory,
								vrCorporationAttendee.getActivityCatetory())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_DOSSIERID_2);

			boolean bindActivityCatetory = false;

			if (activityCatetory == null) {
				query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_1);
			}
			else if (activityCatetory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_3);
			}
			else {
				bindActivityCatetory = true;

				query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindActivityCatetory) {
					qPos.add(activityCatetory);
				}

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByDossierIdActivityCategory_First(
		long dossierId, String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByDossierIdActivityCategory_First(dossierId,
				activityCatetory, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", activityCatetory=");
		msg.append(activityCatetory);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByDossierIdActivityCategory_First(
		long dossierId, String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByDossierIdActivityCategory(dossierId,
				activityCatetory, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByDossierIdActivityCategory_Last(
		long dossierId, String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByDossierIdActivityCategory_Last(dossierId,
				activityCatetory, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", activityCatetory=");
		msg.append(activityCatetory);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByDossierIdActivityCategory_Last(
		long dossierId, String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByDossierIdActivityCategory(dossierId, activityCatetory);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByDossierIdActivityCategory(dossierId,
				activityCatetory, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByDossierIdActivityCategory_PrevAndNext(
		long id, long dossierId, String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByDossierIdActivityCategory_PrevAndNext(session,
					vrCorporationAttendee, dossierId, activityCatetory,
					orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByDossierIdActivityCategory_PrevAndNext(session,
					vrCorporationAttendee, dossierId, activityCatetory,
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

	protected VRCorporationAttendee getByDossierIdActivityCategory_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		long dossierId, String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_DOSSIERID_2);

		boolean bindActivityCatetory = false;

		if (activityCatetory == null) {
			query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_1);
		}
		else if (activityCatetory.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_3);
		}
		else {
			bindActivityCatetory = true;

			query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_2);
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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindActivityCatetory) {
			qPos.add(activityCatetory);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 */
	@Override
	public void removeByDossierIdActivityCategory(long dossierId,
		String activityCatetory) {
		for (VRCorporationAttendee vrCorporationAttendee : findByDossierIdActivityCategory(
				dossierId, activityCatetory, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param activityCatetory the activity catetory
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByDossierIdActivityCategory(long dossierId,
		String activityCatetory) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDACTIVITYCATEGORY;

		Object[] finderArgs = new Object[] { dossierId, activityCatetory };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_DOSSIERID_2);

			boolean bindActivityCatetory = false;

			if (activityCatetory == null) {
				query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_1);
			}
			else if (activityCatetory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_3);
			}
			else {
				bindActivityCatetory = true;

				query.append(_FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindActivityCatetory) {
					qPos.add(activityCatetory);
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

	private static final String _FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_DOSSIERID_2 =
		"vrCorporationAttendee.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_1 =
		"vrCorporationAttendee.activityCatetory IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_2 =
		"vrCorporationAttendee.activityCatetory = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDACTIVITYCATEGORY_ACTIVITYCATETORY_3 =
		"(vrCorporationAttendee.activityCatetory IS NULL OR vrCorporationAttendee.activityCatetory = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDASSIGNTYPE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDossierIdAssignType",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDASSIGNTYPE =
		new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierIdAssignType",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCorporationAttendeeModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCorporationAttendeeModelImpl.ASSIGNTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDASSIGNTYPE = new FinderPath(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierIdAssignType",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @return the matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, String assignType) {
		return findByDossierIdAssignType(dossierId, assignType,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, String assignType, int start, int end) {
		return findByDossierIdAssignType(dossierId, assignType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, String assignType, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findByDossierIdAssignType(dossierId, assignType, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, String assignType, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDASSIGNTYPE;
			finderArgs = new Object[] { dossierId, assignType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDASSIGNTYPE;
			finderArgs = new Object[] {
					dossierId, assignType,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationAttendee vrCorporationAttendee : list) {
					if ((dossierId != vrCorporationAttendee.getDossierId()) ||
							!Objects.equals(assignType,
								vrCorporationAttendee.getAssignType())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_DOSSIERID_2);

			boolean bindAssignType = false;

			if (assignType == null) {
				query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_1);
			}
			else if (assignType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_3);
			}
			else {
				bindAssignType = true;

				query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindAssignType) {
					qPos.add(assignType);
				}

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByDossierIdAssignType_First(
		long dossierId, String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByDossierIdAssignType_First(dossierId,
				assignType, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", assignType=");
		msg.append(assignType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByDossierIdAssignType_First(
		long dossierId, String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		List<VRCorporationAttendee> list = findByDossierIdAssignType(dossierId,
				assignType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee findByDossierIdAssignType_Last(
		long dossierId, String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByDossierIdAssignType_Last(dossierId,
				assignType, orderByComparator);

		if (vrCorporationAttendee != null) {
			return vrCorporationAttendee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", assignType=");
		msg.append(assignType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationAttendeeException(msg.toString());
	}

	/**
	 * Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByDossierIdAssignType_Last(
		long dossierId, String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		int count = countByDossierIdAssignType(dossierId, assignType);

		if (count == 0) {
			return null;
		}

		List<VRCorporationAttendee> list = findByDossierIdAssignType(dossierId,
				assignType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	 *
	 * @param id the primary key of the current vr corporation attendee
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee[] findByDossierIdAssignType_PrevAndNext(
		long id, long dossierId, String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee[] array = new VRCorporationAttendeeImpl[3];

			array[0] = getByDossierIdAssignType_PrevAndNext(session,
					vrCorporationAttendee, dossierId, assignType,
					orderByComparator, true);

			array[1] = vrCorporationAttendee;

			array[2] = getByDossierIdAssignType_PrevAndNext(session,
					vrCorporationAttendee, dossierId, assignType,
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

	protected VRCorporationAttendee getByDossierIdAssignType_PrevAndNext(
		Session session, VRCorporationAttendee vrCorporationAttendee,
		long dossierId, String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_DOSSIERID_2);

		boolean bindAssignType = false;

		if (assignType == null) {
			query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_1);
		}
		else if (assignType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_3);
		}
		else {
			bindAssignType = true;

			query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_2);
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
			query.append(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindAssignType) {
			qPos.add(assignType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationAttendee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationAttendee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation attendees where dossierId = &#63; and assignType = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 */
	@Override
	public void removeByDossierIdAssignType(long dossierId, String assignType) {
		for (VRCorporationAttendee vrCorporationAttendee : findByDossierIdAssignType(
				dossierId, assignType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param assignType the assign type
	 * @return the number of matching vr corporation attendees
	 */
	@Override
	public int countByDossierIdAssignType(long dossierId, String assignType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDASSIGNTYPE;

		Object[] finderArgs = new Object[] { dossierId, assignType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCORPORATIONATTENDEE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_DOSSIERID_2);

			boolean bindAssignType = false;

			if (assignType == null) {
				query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_1);
			}
			else if (assignType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_3);
			}
			else {
				bindAssignType = true;

				query.append(_FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindAssignType) {
					qPos.add(assignType);
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

	private static final String _FINDER_COLUMN_DOSSIERIDASSIGNTYPE_DOSSIERID_2 = "vrCorporationAttendee.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_1 = "vrCorporationAttendee.assignType IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_2 = "vrCorporationAttendee.assignType = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDASSIGNTYPE_ASSIGNTYPE_3 = "(vrCorporationAttendee.assignType IS NULL OR vrCorporationAttendee.assignType = '')";

	public VRCorporationAttendeePersistenceImpl() {
		setModelClass(VRCorporationAttendee.class);
	}

	/**
	 * Caches the vr corporation attendee in the entity cache if it is enabled.
	 *
	 * @param vrCorporationAttendee the vr corporation attendee
	 */
	@Override
	public void cacheResult(VRCorporationAttendee vrCorporationAttendee) {
		entityCache.putResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			vrCorporationAttendee.getPrimaryKey(), vrCorporationAttendee);

		vrCorporationAttendee.resetOriginalValues();
	}

	/**
	 * Caches the vr corporation attendees in the entity cache if it is enabled.
	 *
	 * @param vrCorporationAttendees the vr corporation attendees
	 */
	@Override
	public void cacheResult(List<VRCorporationAttendee> vrCorporationAttendees) {
		for (VRCorporationAttendee vrCorporationAttendee : vrCorporationAttendees) {
			if (entityCache.getResult(
						VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
						VRCorporationAttendeeImpl.class,
						vrCorporationAttendee.getPrimaryKey()) == null) {
				cacheResult(vrCorporationAttendee);
			}
			else {
				vrCorporationAttendee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr corporation attendees.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCorporationAttendeeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr corporation attendee.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCorporationAttendee vrCorporationAttendee) {
		entityCache.removeResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			vrCorporationAttendee.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRCorporationAttendee> vrCorporationAttendees) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCorporationAttendee vrCorporationAttendee : vrCorporationAttendees) {
			entityCache.removeResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
				VRCorporationAttendeeImpl.class,
				vrCorporationAttendee.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr corporation attendee with the primary key. Does not add the vr corporation attendee to the database.
	 *
	 * @param id the primary key for the new vr corporation attendee
	 * @return the new vr corporation attendee
	 */
	@Override
	public VRCorporationAttendee create(long id) {
		VRCorporationAttendee vrCorporationAttendee = new VRCorporationAttendeeImpl();

		vrCorporationAttendee.setNew(true);
		vrCorporationAttendee.setPrimaryKey(id);

		return vrCorporationAttendee;
	}

	/**
	 * Removes the vr corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr corporation attendee
	 * @return the vr corporation attendee that was removed
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee remove(long id)
		throws NoSuchVRCorporationAttendeeException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr corporation attendee
	 * @return the vr corporation attendee that was removed
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee remove(Serializable primaryKey)
		throws NoSuchVRCorporationAttendeeException {
		Session session = null;

		try {
			session = openSession();

			VRCorporationAttendee vrCorporationAttendee = (VRCorporationAttendee)session.get(VRCorporationAttendeeImpl.class,
					primaryKey);

			if (vrCorporationAttendee == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCorporationAttendeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrCorporationAttendee);
		}
		catch (NoSuchVRCorporationAttendeeException nsee) {
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
	protected VRCorporationAttendee removeImpl(
		VRCorporationAttendee vrCorporationAttendee) {
		vrCorporationAttendee = toUnwrappedModel(vrCorporationAttendee);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrCorporationAttendee)) {
				vrCorporationAttendee = (VRCorporationAttendee)session.get(VRCorporationAttendeeImpl.class,
						vrCorporationAttendee.getPrimaryKeyObj());
			}

			if (vrCorporationAttendee != null) {
				session.delete(vrCorporationAttendee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrCorporationAttendee != null) {
			clearCache(vrCorporationAttendee);
		}

		return vrCorporationAttendee;
	}

	@Override
	public VRCorporationAttendee updateImpl(
		VRCorporationAttendee vrCorporationAttendee) {
		vrCorporationAttendee = toUnwrappedModel(vrCorporationAttendee);

		boolean isNew = vrCorporationAttendee.isNew();

		VRCorporationAttendeeModelImpl vrCorporationAttendeeModelImpl = (VRCorporationAttendeeModelImpl)vrCorporationAttendee;

		Session session = null;

		try {
			session = openSession();

			if (vrCorporationAttendee.isNew()) {
				session.save(vrCorporationAttendee);

				vrCorporationAttendee.setNew(false);
			}
			else {
				vrCorporationAttendee = (VRCorporationAttendee)session.merge(vrCorporationAttendee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRCorporationAttendeeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalCorporationCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getCorporationCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODE,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalManagerId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MANAGERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getManagerId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MANAGERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalLeaderId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LEADERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERID,
					args);

				args = new Object[] { vrCorporationAttendeeModelImpl.getLeaderId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LEADERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERID,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalApplicantIdNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTIDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getApplicantIdNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTIDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNOINSPECTIONDATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalApplicantIdNo(),
						vrCorporationAttendeeModelImpl.getOriginalInspectionDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTIDNOINSPECTIONDATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNOINSPECTIONDATE,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getApplicantIdNo(),
						vrCorporationAttendeeModelImpl.getInspectionDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTIDNOINSPECTIONDATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNOINSPECTIONDATE,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODEINSPECTIONDATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalCorporationCode(),
						vrCorporationAttendeeModelImpl.getOriginalInspectionDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONCODEINSPECTIONDATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODEINSPECTIONDATE,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getCorporationCode(),
						vrCorporationAttendeeModelImpl.getInspectionDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONCODEINSPECTIONDATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONCODEINSPECTIONDATE,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERIDINSPECTIONDATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalManagerId(),
						vrCorporationAttendeeModelImpl.getOriginalInspectionDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MANAGERIDINSPECTIONDATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERIDINSPECTIONDATE,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getManagerId(),
						vrCorporationAttendeeModelImpl.getInspectionDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MANAGERIDINSPECTIONDATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERIDINSPECTIONDATE,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERIDINSPECTIONDATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalLeaderId(),
						vrCorporationAttendeeModelImpl.getOriginalInspectionDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LEADERIDINSPECTIONDATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERIDINSPECTIONDATE,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getLeaderId(),
						vrCorporationAttendeeModelImpl.getInspectionDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LEADERIDINSPECTIONDATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEADERIDINSPECTIONDATE,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDACTIVITYCATEGORY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalDossierId(),
						vrCorporationAttendeeModelImpl.getOriginalActivityCatetory()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDACTIVITYCATEGORY,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDACTIVITYCATEGORY,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getDossierId(),
						vrCorporationAttendeeModelImpl.getActivityCatetory()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDACTIVITYCATEGORY,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDACTIVITYCATEGORY,
					args);
			}

			if ((vrCorporationAttendeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDASSIGNTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationAttendeeModelImpl.getOriginalDossierId(),
						vrCorporationAttendeeModelImpl.getOriginalAssignType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDASSIGNTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDASSIGNTYPE,
					args);

				args = new Object[] {
						vrCorporationAttendeeModelImpl.getDossierId(),
						vrCorporationAttendeeModelImpl.getAssignType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDASSIGNTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDASSIGNTYPE,
					args);
			}
		}

		entityCache.putResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationAttendeeImpl.class,
			vrCorporationAttendee.getPrimaryKey(), vrCorporationAttendee, false);

		vrCorporationAttendee.resetOriginalValues();

		return vrCorporationAttendee;
	}

	protected VRCorporationAttendee toUnwrappedModel(
		VRCorporationAttendee vrCorporationAttendee) {
		if (vrCorporationAttendee instanceof VRCorporationAttendeeImpl) {
			return vrCorporationAttendee;
		}

		VRCorporationAttendeeImpl vrCorporationAttendeeImpl = new VRCorporationAttendeeImpl();

		vrCorporationAttendeeImpl.setNew(vrCorporationAttendee.isNew());
		vrCorporationAttendeeImpl.setPrimaryKey(vrCorporationAttendee.getPrimaryKey());

		vrCorporationAttendeeImpl.setId(vrCorporationAttendee.getId());
		vrCorporationAttendeeImpl.setMtCore(vrCorporationAttendee.getMtCore());
		vrCorporationAttendeeImpl.setCreateDate(vrCorporationAttendee.getCreateDate());
		vrCorporationAttendeeImpl.setModifyDate(vrCorporationAttendee.getModifyDate());
		vrCorporationAttendeeImpl.setSyncDate(vrCorporationAttendee.getSyncDate());
		vrCorporationAttendeeImpl.setCorporationCode(vrCorporationAttendee.getCorporationCode());
		vrCorporationAttendeeImpl.setCorporationName(vrCorporationAttendee.getCorporationName());
		vrCorporationAttendeeImpl.setInspectionDate(vrCorporationAttendee.getInspectionDate());
		vrCorporationAttendeeImpl.setRegisterednumber(vrCorporationAttendee.getRegisterednumber());
		vrCorporationAttendeeImpl.setTestingRegisteredPlace(vrCorporationAttendee.getTestingRegisteredPlace());
		vrCorporationAttendeeImpl.setTestingPlaceDistrict(vrCorporationAttendee.getTestingPlaceDistrict());
		vrCorporationAttendeeImpl.setTestingPlaceCity(vrCorporationAttendee.getTestingPlaceCity());
		vrCorporationAttendeeImpl.setTestingPlaceRegion(vrCorporationAttendee.getTestingPlaceRegion());
		vrCorporationAttendeeImpl.setTestingPlaceCountry(vrCorporationAttendee.getTestingPlaceCountry());
		vrCorporationAttendeeImpl.setTestingRemarks(vrCorporationAttendee.getTestingRemarks());
		vrCorporationAttendeeImpl.setActivityId(vrCorporationAttendee.getActivityId());
		vrCorporationAttendeeImpl.setUserId(vrCorporationAttendee.getUserId());
		vrCorporationAttendeeImpl.setUserName(vrCorporationAttendee.getUserName());
		vrCorporationAttendeeImpl.setActivityType(vrCorporationAttendee.getActivityType());
		vrCorporationAttendeeImpl.setActivityCatetory(vrCorporationAttendee.getActivityCatetory());
		vrCorporationAttendeeImpl.setCategoryName(vrCorporationAttendee.getCategoryName());
		vrCorporationAttendeeImpl.setDossierId(vrCorporationAttendee.getDossierId());
		vrCorporationAttendeeImpl.setServiceName(vrCorporationAttendee.getServiceName());
		vrCorporationAttendeeImpl.setSubject(vrCorporationAttendee.getSubject());
		vrCorporationAttendeeImpl.setHostingId(vrCorporationAttendee.getHostingId());
		vrCorporationAttendeeImpl.setHosting(vrCorporationAttendee.getHosting());
		vrCorporationAttendeeImpl.setLocationId(vrCorporationAttendee.getLocationId());
		vrCorporationAttendeeImpl.setLocation(vrCorporationAttendee.getLocation());
		vrCorporationAttendeeImpl.setGeolocation(vrCorporationAttendee.getGeolocation());
		vrCorporationAttendeeImpl.setStartDate(vrCorporationAttendee.getStartDate());
		vrCorporationAttendeeImpl.setEndDate(vrCorporationAttendee.getEndDate());
		vrCorporationAttendeeImpl.setFinishDate(vrCorporationAttendee.getFinishDate());
		vrCorporationAttendeeImpl.setState(vrCorporationAttendee.getState());
		vrCorporationAttendeeImpl.setStateName(vrCorporationAttendee.getStateName());
		vrCorporationAttendeeImpl.setStateColor(vrCorporationAttendee.getStateColor());
		vrCorporationAttendeeImpl.setPriority(vrCorporationAttendee.getPriority());
		vrCorporationAttendeeImpl.setOverdue(vrCorporationAttendee.getOverdue());
		vrCorporationAttendeeImpl.setManagerId(vrCorporationAttendee.getManagerId());
		vrCorporationAttendeeImpl.setManagerName(vrCorporationAttendee.getManagerName());
		vrCorporationAttendeeImpl.setLeaderId(vrCorporationAttendee.getLeaderId());
		vrCorporationAttendeeImpl.setLeaderName(vrCorporationAttendee.getLeaderName());
		vrCorporationAttendeeImpl.setLeaderJobTitle(vrCorporationAttendee.getLeaderJobTitle());
		vrCorporationAttendeeImpl.setDescription(vrCorporationAttendee.getDescription());
		vrCorporationAttendeeImpl.setPermission(vrCorporationAttendee.getPermission());
		vrCorporationAttendeeImpl.setResultNote(vrCorporationAttendee.getResultNote());
		vrCorporationAttendeeImpl.setProgress(vrCorporationAttendee.getProgress());
		vrCorporationAttendeeImpl.setAssignType(vrCorporationAttendee.getAssignType());
		vrCorporationAttendeeImpl.setJobPosId(vrCorporationAttendee.getJobPosId());
		vrCorporationAttendeeImpl.setJobPosTitle(vrCorporationAttendee.getJobPosTitle());
		vrCorporationAttendeeImpl.setInvitation(vrCorporationAttendee.getInvitation());
		vrCorporationAttendeeImpl.setEditable(vrCorporationAttendee.getEditable());
		vrCorporationAttendeeImpl.setVaqcontactname(vrCorporationAttendee.getVaqcontactname());
		vrCorporationAttendeeImpl.setVaqcontactphone(vrCorporationAttendee.getVaqcontactphone());
		vrCorporationAttendeeImpl.setApplicantIdNo(vrCorporationAttendee.getApplicantIdNo());
		vrCorporationAttendeeImpl.setImportercontactname(vrCorporationAttendee.getImportercontactname());
		vrCorporationAttendeeImpl.setImportercontactphone(vrCorporationAttendee.getImportercontactphone());
		vrCorporationAttendeeImpl.setImportercontactemail(vrCorporationAttendee.getImportercontactemail());
		vrCorporationAttendeeImpl.setImporterfax(vrCorporationAttendee.getImporterfax());
		vrCorporationAttendeeImpl.setSoTKHQ(vrCorporationAttendee.getSoTKHQ());
		vrCorporationAttendeeImpl.setNgayTKHQ(vrCorporationAttendee.getNgayTKHQ());
		vrCorporationAttendeeImpl.setMaChiCucHQ(vrCorporationAttendee.getMaChiCucHQ());
		vrCorporationAttendeeImpl.setNhanHieu(vrCorporationAttendee.getNhanHieu());
		vrCorporationAttendeeImpl.setTenThuongMai(vrCorporationAttendee.getTenThuongMai());
		vrCorporationAttendeeImpl.setMaKieuLoai(vrCorporationAttendee.getMaKieuLoai());
		vrCorporationAttendeeImpl.setLoaiPhuongTien(vrCorporationAttendee.getLoaiPhuongTien());
		vrCorporationAttendeeImpl.setSoKhung(vrCorporationAttendee.getSoKhung());
		vrCorporationAttendeeImpl.setSoDongCo(vrCorporationAttendee.getSoDongCo());
		vrCorporationAttendeeImpl.setTinhTrangPhuongTien(vrCorporationAttendee.getTinhTrangPhuongTien());
		vrCorporationAttendeeImpl.setKyHieuThietKe(vrCorporationAttendee.getKyHieuThietKe());
		vrCorporationAttendeeImpl.setSoGCNThamDinhThietKe(vrCorporationAttendee.getSoGCNThamDinhThietKe());
		vrCorporationAttendeeImpl.setSoGCNPheDuyetKieuLoaiNuocNgoai(vrCorporationAttendee.getSoGCNPheDuyetKieuLoaiNuocNgoai());
		vrCorporationAttendeeImpl.setTenCoSoSanXuat(vrCorporationAttendee.getTenCoSoSanXuat());
		vrCorporationAttendeeImpl.setDiaChiCoSoSanXuat(vrCorporationAttendee.getDiaChiCoSoSanXuat());
		vrCorporationAttendeeImpl.setTenXuongSanXuat(vrCorporationAttendee.getTenXuongSanXuat());
		vrCorporationAttendeeImpl.setDiaChiXuongSanXuat(vrCorporationAttendee.getDiaChiXuongSanXuat());

		return vrCorporationAttendeeImpl;
	}

	/**
	 * Returns the vr corporation attendee with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr corporation attendee
	 * @return the vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCorporationAttendeeException {
		VRCorporationAttendee vrCorporationAttendee = fetchByPrimaryKey(primaryKey);

		if (vrCorporationAttendee == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCorporationAttendeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrCorporationAttendee;
	}

	/**
	 * Returns the vr corporation attendee with the primary key or throws a {@link NoSuchVRCorporationAttendeeException} if it could not be found.
	 *
	 * @param id the primary key of the vr corporation attendee
	 * @return the vr corporation attendee
	 * @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee findByPrimaryKey(long id)
		throws NoSuchVRCorporationAttendeeException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr corporation attendee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr corporation attendee
	 * @return the vr corporation attendee, or <code>null</code> if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
				VRCorporationAttendeeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCorporationAttendee vrCorporationAttendee = (VRCorporationAttendee)serializable;

		if (vrCorporationAttendee == null) {
			Session session = null;

			try {
				session = openSession();

				vrCorporationAttendee = (VRCorporationAttendee)session.get(VRCorporationAttendeeImpl.class,
						primaryKey);

				if (vrCorporationAttendee != null) {
					cacheResult(vrCorporationAttendee);
				}
				else {
					entityCache.putResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
						VRCorporationAttendeeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationAttendeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrCorporationAttendee;
	}

	/**
	 * Returns the vr corporation attendee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr corporation attendee
	 * @return the vr corporation attendee, or <code>null</code> if a vr corporation attendee with the primary key could not be found
	 */
	@Override
	public VRCorporationAttendee fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCorporationAttendee> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCorporationAttendee> map = new HashMap<Serializable, VRCorporationAttendee>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCorporationAttendee vrCorporationAttendee = fetchByPrimaryKey(primaryKey);

			if (vrCorporationAttendee != null) {
				map.put(primaryKey, vrCorporationAttendee);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationAttendeeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCorporationAttendee)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCORPORATIONATTENDEE_WHERE_PKS_IN);

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

			for (VRCorporationAttendee vrCorporationAttendee : (List<VRCorporationAttendee>)q.list()) {
				map.put(vrCorporationAttendee.getPrimaryKeyObj(),
					vrCorporationAttendee);

				cacheResult(vrCorporationAttendee);

				uncachedPrimaryKeys.remove(vrCorporationAttendee.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCorporationAttendeeModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationAttendeeImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr corporation attendees.
	 *
	 * @return the vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation attendees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @return the range of vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findAll(int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation attendees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation attendees
	 * @param end the upper bound of the range of vr corporation attendees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr corporation attendees
	 */
	@Override
	public List<VRCorporationAttendee> findAll(int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
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

		List<VRCorporationAttendee> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationAttendee>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCORPORATIONATTENDEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCORPORATIONATTENDEE;

				if (pagination) {
					sql = sql.concat(VRCorporationAttendeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationAttendee>)QueryUtil.list(q,
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
	 * Removes all the vr corporation attendees from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCorporationAttendee vrCorporationAttendee : findAll()) {
			remove(vrCorporationAttendee);
		}
	}

	/**
	 * Returns the number of vr corporation attendees.
	 *
	 * @return the number of vr corporation attendees
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCORPORATIONATTENDEE);

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
		return VRCorporationAttendeeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr corporation attendee persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCorporationAttendeeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCORPORATIONATTENDEE = "SELECT vrCorporationAttendee FROM VRCorporationAttendee vrCorporationAttendee";
	private static final String _SQL_SELECT_VRCORPORATIONATTENDEE_WHERE_PKS_IN = "SELECT vrCorporationAttendee FROM VRCorporationAttendee vrCorporationAttendee WHERE id IN (";
	private static final String _SQL_SELECT_VRCORPORATIONATTENDEE_WHERE = "SELECT vrCorporationAttendee FROM VRCorporationAttendee vrCorporationAttendee WHERE ";
	private static final String _SQL_COUNT_VRCORPORATIONATTENDEE = "SELECT COUNT(vrCorporationAttendee) FROM VRCorporationAttendee vrCorporationAttendee";
	private static final String _SQL_COUNT_VRCORPORATIONATTENDEE_WHERE = "SELECT COUNT(vrCorporationAttendee) FROM VRCorporationAttendee vrCorporationAttendee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrCorporationAttendee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCorporationAttendee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCorporationAttendee exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCorporationAttendeePersistenceImpl.class);
}