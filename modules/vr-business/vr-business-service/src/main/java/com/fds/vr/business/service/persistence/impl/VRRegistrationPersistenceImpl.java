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

import com.fds.vr.business.exception.NoSuchVRRegistrationException;
import com.fds.vr.business.model.VRRegistration;
import com.fds.vr.business.model.impl.VRRegistrationImpl;
import com.fds.vr.business.model.impl.VRRegistrationModelImpl;
import com.fds.vr.business.service.persistence.VRRegistrationPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

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
 * The persistence implementation for the vr registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRRegistrationPersistence
 * @see com.fds.vr.business.service.persistence.VRRegistrationUtil
 * @generated
 */
@ProviderType
public class VRRegistrationPersistenceImpl extends BasePersistenceImpl<VRRegistration>
	implements VRRegistrationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRRegistrationUtil} to access the vr registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRRegistrationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			VRRegistrationModelImpl.UUID_COLUMN_BITMASK |
			VRRegistrationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr registrations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByUuid(String uuid, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr registrations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByUuid(String uuid, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRegistration vrRegistration : list) {
					if (!Objects.equals(uuid, vrRegistration.getUuid())) {
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

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Returns the first vr registration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByUuid_First(String uuid,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByUuid_First(uuid,
				orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the first vr registration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByUuid_First(String uuid,
		OrderByComparator<VRRegistration> orderByComparator) {
		List<VRRegistration> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr registration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByUuid_Last(String uuid,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByUuid_Last(uuid, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the last vr registration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByUuid_Last(String uuid,
		OrderByComparator<VRRegistration> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<VRRegistration> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr registrations before and after the current vr registration in the ordered set where uuid = &#63;.
	 *
	 * @param registrationId the primary key of the current vr registration
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration[] findByUuid_PrevAndNext(long registrationId,
		String uuid, OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByPrimaryKey(registrationId);

		Session session = null;

		try {
			session = openSession();

			VRRegistration[] array = new VRRegistrationImpl[3];

			array[0] = getByUuid_PrevAndNext(session, vrRegistration, uuid,
					orderByComparator, true);

			array[1] = vrRegistration;

			array[2] = getByUuid_PrevAndNext(session, vrRegistration, uuid,
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

	protected VRRegistration getByUuid_PrevAndNext(Session session,
		VRRegistration vrRegistration, String uuid,
		OrderByComparator<VRRegistration> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr registrations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (VRRegistration vrRegistration : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "vrRegistration.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "vrRegistration.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(vrRegistration.uuid IS NULL OR vrRegistration.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			VRRegistrationModelImpl.UUID_COLUMN_BITMASK |
			VRRegistrationModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the vr registration where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByUUID_G(String uuid, long groupId)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByUUID_G(uuid, groupId);

		if (vrRegistration == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRRegistrationException(msg.toString());
		}

		return vrRegistration;
	}

	/**
	 * Returns the vr registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the vr registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof VRRegistration) {
			VRRegistration vrRegistration = (VRRegistration)result;

			if (!Objects.equals(uuid, vrRegistration.getUuid()) ||
					(groupId != vrRegistration.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<VRRegistration> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					VRRegistration vrRegistration = list.get(0);

					result = vrRegistration;

					cacheResult(vrRegistration);

					if ((vrRegistration.getUuid() == null) ||
							!vrRegistration.getUuid().equals(uuid) ||
							(vrRegistration.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, vrRegistration);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (VRRegistration)result;
		}
	}

	/**
	 * Removes the vr registration where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the vr registration that was removed
	 */
	@Override
	public VRRegistration removeByUUID_G(String uuid, long groupId)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByUUID_G(uuid, groupId);

		return remove(vrRegistration);
	}

	/**
	 * Returns the number of vr registrations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "vrRegistration.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "vrRegistration.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(vrRegistration.uuid IS NULL OR vrRegistration.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "vrRegistration.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			VRRegistrationModelImpl.UUID_COLUMN_BITMASK |
			VRRegistrationModelImpl.COMPANYID_COLUMN_BITMASK |
			VRRegistrationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<VRRegistration> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRegistration vrRegistration : list) {
					if (!Objects.equals(uuid, vrRegistration.getUuid()) ||
							(companyId != vrRegistration.getCompanyId())) {
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

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Returns the first vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the first vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<VRRegistration> orderByComparator) {
		List<VRRegistration> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the last vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<VRRegistration> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<VRRegistration> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr registrations before and after the current vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param registrationId the primary key of the current vr registration
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration[] findByUuid_C_PrevAndNext(long registrationId,
		String uuid, long companyId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByPrimaryKey(registrationId);

		Session session = null;

		try {
			session = openSession();

			VRRegistration[] array = new VRRegistrationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, vrRegistration, uuid,
					companyId, orderByComparator, true);

			array[1] = vrRegistration;

			array[2] = getByUuid_C_PrevAndNext(session, vrRegistration, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRRegistration getByUuid_C_PrevAndNext(Session session,
		VRRegistration vrRegistration, String uuid, long companyId,
		OrderByComparator<VRRegistration> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr registrations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (VRRegistration vrRegistration : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "vrRegistration.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "vrRegistration.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(vrRegistration.uuid IS NULL OR vrRegistration.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "vrRegistration.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_SUBMITTING =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_submitting",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_SUBMITTING =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_submitting",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			VRRegistrationModelImpl.GROUPID_COLUMN_BITMASK |
			VRRegistrationModelImpl.SUBMITTING_COLUMN_BITMASK |
			VRRegistrationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_SUBMITTING = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_submitting",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the vr registrations where groupId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @return the matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting) {
		return findByF_submitting(groupId, submitting, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations where groupId = &#63; and submitting = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end) {
		return findByF_submitting(groupId, submitting, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and submitting = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return findByF_submitting(groupId, submitting, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and submitting = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_SUBMITTING;
			finderArgs = new Object[] { groupId, submitting };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_SUBMITTING;
			finderArgs = new Object[] {
					groupId, submitting,
					
					start, end, orderByComparator
				};
		}

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRegistration vrRegistration : list) {
					if ((groupId != vrRegistration.getGroupId()) ||
							(submitting != vrRegistration.getSubmitting())) {
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

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_F_SUBMITTING_GROUPID_2);

			query.append(_FINDER_COLUMN_F_SUBMITTING_SUBMITTING_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(submitting);

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Returns the first vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByF_submitting_First(long groupId,
		boolean submitting, OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByF_submitting_First(groupId,
				submitting, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", submitting=");
		msg.append(submitting);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the first vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByF_submitting_First(long groupId,
		boolean submitting, OrderByComparator<VRRegistration> orderByComparator) {
		List<VRRegistration> list = findByF_submitting(groupId, submitting, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByF_submitting_Last(long groupId,
		boolean submitting, OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByF_submitting_Last(groupId,
				submitting, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", submitting=");
		msg.append(submitting);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByF_submitting_Last(long groupId,
		boolean submitting, OrderByComparator<VRRegistration> orderByComparator) {
		int count = countByF_submitting(groupId, submitting);

		if (count == 0) {
			return null;
		}

		List<VRRegistration> list = findByF_submitting(groupId, submitting,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	 *
	 * @param registrationId the primary key of the current vr registration
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration[] findByF_submitting_PrevAndNext(
		long registrationId, long groupId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByPrimaryKey(registrationId);

		Session session = null;

		try {
			session = openSession();

			VRRegistration[] array = new VRRegistrationImpl[3];

			array[0] = getByF_submitting_PrevAndNext(session, vrRegistration,
					groupId, submitting, orderByComparator, true);

			array[1] = vrRegistration;

			array[2] = getByF_submitting_PrevAndNext(session, vrRegistration,
					groupId, submitting, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRRegistration getByF_submitting_PrevAndNext(Session session,
		VRRegistration vrRegistration, long groupId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

		query.append(_FINDER_COLUMN_F_SUBMITTING_GROUPID_2);

		query.append(_FINDER_COLUMN_F_SUBMITTING_SUBMITTING_2);

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
			query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(submitting);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr registrations where groupId = &#63; and submitting = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 */
	@Override
	public void removeByF_submitting(long groupId, boolean submitting) {
		for (VRRegistration vrRegistration : findByF_submitting(groupId,
				submitting, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations where groupId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param submitting the submitting
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByF_submitting(long groupId, boolean submitting) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_SUBMITTING;

		Object[] finderArgs = new Object[] { groupId, submitting };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_F_SUBMITTING_GROUPID_2);

			query.append(_FINDER_COLUMN_F_SUBMITTING_SUBMITTING_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(submitting);

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

	private static final String _FINDER_COLUMN_F_SUBMITTING_GROUPID_2 = "vrRegistration.groupId = ? AND ";
	private static final String _FINDER_COLUMN_F_SUBMITTING_SUBMITTING_2 = "vrRegistration.submitting = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GID_UID = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGID_UID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GID_UID =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGID_UID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRRegistrationModelImpl.GROUPID_COLUMN_BITMASK |
			VRRegistrationModelImpl.USERID_COLUMN_BITMASK |
			VRRegistrationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GID_UID = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGID_UID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr registrations where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByGID_UID(long groupId, long userId) {
		return findByGID_UID(groupId, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByGID_UID(long groupId, long userId,
		int start, int end) {
		return findByGID_UID(groupId, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByGID_UID(long groupId, long userId,
		int start, int end, OrderByComparator<VRRegistration> orderByComparator) {
		return findByGID_UID(groupId, userId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByGID_UID(long groupId, long userId,
		int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GID_UID;
			finderArgs = new Object[] { groupId, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GID_UID;
			finderArgs = new Object[] {
					groupId, userId,
					
					start, end, orderByComparator
				};
		}

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRegistration vrRegistration : list) {
					if ((groupId != vrRegistration.getGroupId()) ||
							(userId != vrRegistration.getUserId())) {
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

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_GID_UID_GROUPID_2);

			query.append(_FINDER_COLUMN_GID_UID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByGID_UID_First(long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByGID_UID_First(groupId, userId,
				orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByGID_UID_First(long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator) {
		List<VRRegistration> list = findByGID_UID(groupId, userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByGID_UID_Last(long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByGID_UID_Last(groupId, userId,
				orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByGID_UID_Last(long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator) {
		int count = countByGID_UID(groupId, userId);

		if (count == 0) {
			return null;
		}

		List<VRRegistration> list = findByGID_UID(groupId, userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param registrationId the primary key of the current vr registration
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration[] findByGID_UID_PrevAndNext(long registrationId,
		long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByPrimaryKey(registrationId);

		Session session = null;

		try {
			session = openSession();

			VRRegistration[] array = new VRRegistrationImpl[3];

			array[0] = getByGID_UID_PrevAndNext(session, vrRegistration,
					groupId, userId, orderByComparator, true);

			array[1] = vrRegistration;

			array[2] = getByGID_UID_PrevAndNext(session, vrRegistration,
					groupId, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRRegistration getByGID_UID_PrevAndNext(Session session,
		VRRegistration vrRegistration, long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

		query.append(_FINDER_COLUMN_GID_UID_GROUPID_2);

		query.append(_FINDER_COLUMN_GID_UID_USERID_2);

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
			query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr registrations where groupId = &#63; and userId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 */
	@Override
	public void removeByGID_UID(long groupId, long userId) {
		for (VRRegistration vrRegistration : findByGID_UID(groupId, userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByGID_UID(long groupId, long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GID_UID;

		Object[] finderArgs = new Object[] { groupId, userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_GID_UID_GROUPID_2);

			query.append(_FINDER_COLUMN_GID_UID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_GID_UID_GROUPID_2 = "vrRegistration.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GID_UID_USERID_2 = "vrRegistration.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_REGID = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByG_REGID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRRegistrationModelImpl.GROUPID_COLUMN_BITMASK |
			VRRegistrationModelImpl.REGISTRATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_REGID = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_REGID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the vr registration where groupId = &#63; and registrationId = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param registrationId the registration ID
	 * @return the matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByG_REGID(long groupId, long registrationId)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByG_REGID(groupId, registrationId);

		if (vrRegistration == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", registrationId=");
			msg.append(registrationId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRRegistrationException(msg.toString());
		}

		return vrRegistration;
	}

	/**
	 * Returns the vr registration where groupId = &#63; and registrationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param registrationId the registration ID
	 * @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByG_REGID(long groupId, long registrationId) {
		return fetchByG_REGID(groupId, registrationId, true);
	}

	/**
	 * Returns the vr registration where groupId = &#63; and registrationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param registrationId the registration ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByG_REGID(long groupId, long registrationId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, registrationId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_REGID,
					finderArgs, this);
		}

		if (result instanceof VRRegistration) {
			VRRegistration vrRegistration = (VRRegistration)result;

			if ((groupId != vrRegistration.getGroupId()) ||
					(registrationId != vrRegistration.getRegistrationId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_G_REGID_GROUPID_2);

			query.append(_FINDER_COLUMN_G_REGID_REGISTRATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(registrationId);

				List<VRRegistration> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_REGID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRRegistrationPersistenceImpl.fetchByG_REGID(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRRegistration vrRegistration = list.get(0);

					result = vrRegistration;

					cacheResult(vrRegistration);

					if ((vrRegistration.getGroupId() != groupId) ||
							(vrRegistration.getRegistrationId() != registrationId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_REGID,
							finderArgs, vrRegistration);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_REGID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (VRRegistration)result;
		}
	}

	/**
	 * Removes the vr registration where groupId = &#63; and registrationId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param registrationId the registration ID
	 * @return the vr registration that was removed
	 */
	@Override
	public VRRegistration removeByG_REGID(long groupId, long registrationId)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByG_REGID(groupId, registrationId);

		return remove(vrRegistration);
	}

	/**
	 * Returns the number of vr registrations where groupId = &#63; and registrationId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param registrationId the registration ID
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByG_REGID(long groupId, long registrationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_REGID;

		Object[] finderArgs = new Object[] { groupId, registrationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_G_REGID_GROUPID_2);

			query.append(_FINDER_COLUMN_G_REGID_REGISTRATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(registrationId);

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

	private static final String _FINDER_COLUMN_G_REGID_GROUPID_2 = "vrRegistration.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_REGID_REGISTRATIONID_2 = "vrRegistration.registrationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_USERID_SUBMITTING =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_USERID_SUBMITTING",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID_SUBMITTING =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_USERID_SUBMITTING",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			VRRegistrationModelImpl.GROUPID_COLUMN_BITMASK |
			VRRegistrationModelImpl.USERID_COLUMN_BITMASK |
			VRRegistrationModelImpl.SUBMITTING_COLUMN_BITMASK |
			VRRegistrationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_USERID_SUBMITTING = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_USERID_SUBMITTING",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @return the matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByF_USERID_SUBMITTING(long groupId,
		long userId, boolean submitting) {
		return findByF_USERID_SUBMITTING(groupId, userId, submitting,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByF_USERID_SUBMITTING(long groupId,
		long userId, boolean submitting, int start, int end) {
		return findByF_USERID_SUBMITTING(groupId, userId, submitting, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByF_USERID_SUBMITTING(long groupId,
		long userId, boolean submitting, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return findByF_USERID_SUBMITTING(groupId, userId, submitting, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByF_USERID_SUBMITTING(long groupId,
		long userId, boolean submitting, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID_SUBMITTING;
			finderArgs = new Object[] { groupId, userId, submitting };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_USERID_SUBMITTING;
			finderArgs = new Object[] {
					groupId, userId, submitting,
					
					start, end, orderByComparator
				};
		}

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRegistration vrRegistration : list) {
					if ((groupId != vrRegistration.getGroupId()) ||
							(userId != vrRegistration.getUserId()) ||
							(submitting != vrRegistration.getSubmitting())) {
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

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_GROUPID_2);

			query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_USERID_2);

			query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_SUBMITTING_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				qPos.add(submitting);

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByF_USERID_SUBMITTING_First(long groupId,
		long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByF_USERID_SUBMITTING_First(groupId,
				userId, submitting, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", submitting=");
		msg.append(submitting);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByF_USERID_SUBMITTING_First(long groupId,
		long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator) {
		List<VRRegistration> list = findByF_USERID_SUBMITTING(groupId, userId,
				submitting, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByF_USERID_SUBMITTING_Last(long groupId,
		long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByF_USERID_SUBMITTING_Last(groupId,
				userId, submitting, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", submitting=");
		msg.append(submitting);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByF_USERID_SUBMITTING_Last(long groupId,
		long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator) {
		int count = countByF_USERID_SUBMITTING(groupId, userId, submitting);

		if (count == 0) {
			return null;
		}

		List<VRRegistration> list = findByF_USERID_SUBMITTING(groupId, userId,
				submitting, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * @param registrationId the primary key of the current vr registration
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration[] findByF_USERID_SUBMITTING_PrevAndNext(
		long registrationId, long groupId, long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByPrimaryKey(registrationId);

		Session session = null;

		try {
			session = openSession();

			VRRegistration[] array = new VRRegistrationImpl[3];

			array[0] = getByF_USERID_SUBMITTING_PrevAndNext(session,
					vrRegistration, groupId, userId, submitting,
					orderByComparator, true);

			array[1] = vrRegistration;

			array[2] = getByF_USERID_SUBMITTING_PrevAndNext(session,
					vrRegistration, groupId, userId, submitting,
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

	protected VRRegistration getByF_USERID_SUBMITTING_PrevAndNext(
		Session session, VRRegistration vrRegistration, long groupId,
		long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

		query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_GROUPID_2);

		query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_USERID_2);

		query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_SUBMITTING_2);

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
			query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(userId);

		qPos.add(submitting);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 */
	@Override
	public void removeByF_USERID_SUBMITTING(long groupId, long userId,
		boolean submitting) {
		for (VRRegistration vrRegistration : findByF_USERID_SUBMITTING(
				groupId, userId, submitting, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param submitting the submitting
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByF_USERID_SUBMITTING(long groupId, long userId,
		boolean submitting) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_USERID_SUBMITTING;

		Object[] finderArgs = new Object[] { groupId, userId, submitting };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_GROUPID_2);

			query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_USERID_2);

			query.append(_FINDER_COLUMN_F_USERID_SUBMITTING_SUBMITTING_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				qPos.add(submitting);

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

	private static final String _FINDER_COLUMN_F_USERID_SUBMITTING_GROUPID_2 = "vrRegistration.groupId = ? AND ";
	private static final String _FINDER_COLUMN_F_USERID_SUBMITTING_USERID_2 = "vrRegistration.userId = ? AND ";
	private static final String _FINDER_COLUMN_F_USERID_SUBMITTING_SUBMITTING_2 = "vrRegistration.submitting = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_APPNO_GOVCODE =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_APPNO_GOVCODE",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_APPNO_GOVCODE =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_APPNO_GOVCODE",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			VRRegistrationModelImpl.GROUPID_COLUMN_BITMASK |
			VRRegistrationModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRRegistrationModelImpl.GOVAGENCYCODE_COLUMN_BITMASK |
			VRRegistrationModelImpl.REGISTRATIONSTATE_COLUMN_BITMASK |
			VRRegistrationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_APPNO_GOVCODE = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByG_APPNO_GOVCODE",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @return the matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		String applicantIdNo, String govAgencyCode, int registrationState) {
		return findByG_APPNO_GOVCODE(groupId, applicantIdNo, govAgencyCode,
			registrationState, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		String applicantIdNo, String govAgencyCode, int registrationState,
		int start, int end) {
		return findByG_APPNO_GOVCODE(groupId, applicantIdNo, govAgencyCode,
			registrationState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		String applicantIdNo, String govAgencyCode, int registrationState,
		int start, int end, OrderByComparator<VRRegistration> orderByComparator) {
		return findByG_APPNO_GOVCODE(groupId, applicantIdNo, govAgencyCode,
			registrationState, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		String applicantIdNo, String govAgencyCode, int registrationState,
		int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_APPNO_GOVCODE;
			finderArgs = new Object[] {
					groupId, applicantIdNo, govAgencyCode, registrationState
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_APPNO_GOVCODE;
			finderArgs = new Object[] {
					groupId, applicantIdNo, govAgencyCode, registrationState,
					
					start, end, orderByComparator
				};
		}

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRegistration vrRegistration : list) {
					if ((groupId != vrRegistration.getGroupId()) ||
							!Objects.equals(applicantIdNo,
								vrRegistration.getApplicantIdNo()) ||
							!Objects.equals(govAgencyCode,
								vrRegistration.getGovAgencyCode()) ||
							(registrationState != vrRegistration.getRegistrationState())) {
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

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GROUPID_2);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_2);
			}

			boolean bindGovAgencyCode = false;

			if (govAgencyCode == null) {
				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_1);
			}
			else if (govAgencyCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_3);
			}
			else {
				bindGovAgencyCode = true;

				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_2);
			}

			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_REGISTRATIONSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindGovAgencyCode) {
					qPos.add(govAgencyCode);
				}

				qPos.add(registrationState);

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByG_APPNO_GOVCODE_First(long groupId,
		String applicantIdNo, String govAgencyCode, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByG_APPNO_GOVCODE_First(groupId,
				applicantIdNo, govAgencyCode, registrationState,
				orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", govAgencyCode=");
		msg.append(govAgencyCode);

		msg.append(", registrationState=");
		msg.append(registrationState);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByG_APPNO_GOVCODE_First(long groupId,
		String applicantIdNo, String govAgencyCode, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator) {
		List<VRRegistration> list = findByG_APPNO_GOVCODE(groupId,
				applicantIdNo, govAgencyCode, registrationState, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByG_APPNO_GOVCODE_Last(long groupId,
		String applicantIdNo, String govAgencyCode, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByG_APPNO_GOVCODE_Last(groupId,
				applicantIdNo, govAgencyCode, registrationState,
				orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", govAgencyCode=");
		msg.append(govAgencyCode);

		msg.append(", registrationState=");
		msg.append(registrationState);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByG_APPNO_GOVCODE_Last(long groupId,
		String applicantIdNo, String govAgencyCode, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator) {
		int count = countByG_APPNO_GOVCODE(groupId, applicantIdNo,
				govAgencyCode, registrationState);

		if (count == 0) {
			return null;
		}

		List<VRRegistration> list = findByG_APPNO_GOVCODE(groupId,
				applicantIdNo, govAgencyCode, registrationState, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * @param registrationId the primary key of the current vr registration
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration[] findByG_APPNO_GOVCODE_PrevAndNext(
		long registrationId, long groupId, String applicantIdNo,
		String govAgencyCode, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByPrimaryKey(registrationId);

		Session session = null;

		try {
			session = openSession();

			VRRegistration[] array = new VRRegistrationImpl[3];

			array[0] = getByG_APPNO_GOVCODE_PrevAndNext(session,
					vrRegistration, groupId, applicantIdNo, govAgencyCode,
					registrationState, orderByComparator, true);

			array[1] = vrRegistration;

			array[2] = getByG_APPNO_GOVCODE_PrevAndNext(session,
					vrRegistration, groupId, applicantIdNo, govAgencyCode,
					registrationState, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRRegistration getByG_APPNO_GOVCODE_PrevAndNext(Session session,
		VRRegistration vrRegistration, long groupId, String applicantIdNo,
		String govAgencyCode, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

		query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GROUPID_2);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_2);
		}

		boolean bindGovAgencyCode = false;

		if (govAgencyCode == null) {
			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_1);
		}
		else if (govAgencyCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_3);
		}
		else {
			bindGovAgencyCode = true;

			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_2);
		}

		query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_REGISTRATIONSTATE_2);

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
			query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindGovAgencyCode) {
			qPos.add(govAgencyCode);
		}

		qPos.add(registrationState);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 */
	@Override
	public void removeByG_APPNO_GOVCODE(long groupId, String applicantIdNo,
		String govAgencyCode, int registrationState) {
		for (VRRegistration vrRegistration : findByG_APPNO_GOVCODE(groupId,
				applicantIdNo, govAgencyCode, registrationState,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param govAgencyCode the gov agency code
	 * @param registrationState the registration state
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByG_APPNO_GOVCODE(long groupId, String applicantIdNo,
		String govAgencyCode, int registrationState) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_APPNO_GOVCODE;

		Object[] finderArgs = new Object[] {
				groupId, applicantIdNo, govAgencyCode, registrationState
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GROUPID_2);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_2);
			}

			boolean bindGovAgencyCode = false;

			if (govAgencyCode == null) {
				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_1);
			}
			else if (govAgencyCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_3);
			}
			else {
				bindGovAgencyCode = true;

				query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_2);
			}

			query.append(_FINDER_COLUMN_G_APPNO_GOVCODE_REGISTRATIONSTATE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindGovAgencyCode) {
					qPos.add(govAgencyCode);
				}

				qPos.add(registrationState);

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

	private static final String _FINDER_COLUMN_G_APPNO_GOVCODE_GROUPID_2 = "vrRegistration.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_1 = "vrRegistration.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_2 = "vrRegistration.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_G_APPNO_GOVCODE_APPLICANTIDNO_3 = "(vrRegistration.applicantIdNo IS NULL OR vrRegistration.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_1 = "vrRegistration.govAgencyCode IS NULL AND ";
	private static final String _FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_2 = "vrRegistration.govAgencyCode = ? AND ";
	private static final String _FINDER_COLUMN_G_APPNO_GOVCODE_GOVAGENCYCODE_3 = "(vrRegistration.govAgencyCode IS NULL OR vrRegistration.govAgencyCode = '') AND ";
	private static final String _FINDER_COLUMN_G_APPNO_GOVCODE_REGISTRATIONSTATE_2 =
		"vrRegistration.registrationState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_USER_STATE =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_USER_STATE",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_USER_STATE =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_USER_STATE",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			VRRegistrationModelImpl.GROUPID_COLUMN_BITMASK |
			VRRegistrationModelImpl.USERID_COLUMN_BITMASK |
			VRRegistrationModelImpl.REGISTRATIONSTATE_COLUMN_BITMASK |
			VRRegistrationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_USER_STATE = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_USER_STATE",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @return the matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByG_USER_STATE(long groupId, long userId,
		int registrationState) {
		return findByG_USER_STATE(groupId, userId, registrationState,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByG_USER_STATE(long groupId, long userId,
		int registrationState, int start, int end) {
		return findByG_USER_STATE(groupId, userId, registrationState, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByG_USER_STATE(long groupId, long userId,
		int registrationState, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return findByG_USER_STATE(groupId, userId, registrationState, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByG_USER_STATE(long groupId, long userId,
		int registrationState, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_USER_STATE;
			finderArgs = new Object[] { groupId, userId, registrationState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_USER_STATE;
			finderArgs = new Object[] {
					groupId, userId, registrationState,
					
					start, end, orderByComparator
				};
		}

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRegistration vrRegistration : list) {
					if ((groupId != vrRegistration.getGroupId()) ||
							(userId != vrRegistration.getUserId()) ||
							(registrationState != vrRegistration.getRegistrationState())) {
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

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_G_USER_STATE_GROUPID_2);

			query.append(_FINDER_COLUMN_G_USER_STATE_USERID_2);

			query.append(_FINDER_COLUMN_G_USER_STATE_REGISTRATIONSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				qPos.add(registrationState);

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByG_USER_STATE_First(long groupId, long userId,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByG_USER_STATE_First(groupId,
				userId, registrationState, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", registrationState=");
		msg.append(registrationState);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByG_USER_STATE_First(long groupId, long userId,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator) {
		List<VRRegistration> list = findByG_USER_STATE(groupId, userId,
				registrationState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByG_USER_STATE_Last(long groupId, long userId,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByG_USER_STATE_Last(groupId,
				userId, registrationState, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", registrationState=");
		msg.append(registrationState);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByG_USER_STATE_Last(long groupId, long userId,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator) {
		int count = countByG_USER_STATE(groupId, userId, registrationState);

		if (count == 0) {
			return null;
		}

		List<VRRegistration> list = findByG_USER_STATE(groupId, userId,
				registrationState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * @param registrationId the primary key of the current vr registration
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration[] findByG_USER_STATE_PrevAndNext(
		long registrationId, long groupId, long userId, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByPrimaryKey(registrationId);

		Session session = null;

		try {
			session = openSession();

			VRRegistration[] array = new VRRegistrationImpl[3];

			array[0] = getByG_USER_STATE_PrevAndNext(session, vrRegistration,
					groupId, userId, registrationState, orderByComparator, true);

			array[1] = vrRegistration;

			array[2] = getByG_USER_STATE_PrevAndNext(session, vrRegistration,
					groupId, userId, registrationState, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRRegistration getByG_USER_STATE_PrevAndNext(Session session,
		VRRegistration vrRegistration, long groupId, long userId,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

		query.append(_FINDER_COLUMN_G_USER_STATE_GROUPID_2);

		query.append(_FINDER_COLUMN_G_USER_STATE_USERID_2);

		query.append(_FINDER_COLUMN_G_USER_STATE_REGISTRATIONSTATE_2);

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
			query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(userId);

		qPos.add(registrationState);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 */
	@Override
	public void removeByG_USER_STATE(long groupId, long userId,
		int registrationState) {
		for (VRRegistration vrRegistration : findByG_USER_STATE(groupId,
				userId, registrationState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param registrationState the registration state
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByG_USER_STATE(long groupId, long userId,
		int registrationState) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_USER_STATE;

		Object[] finderArgs = new Object[] { groupId, userId, registrationState };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_G_USER_STATE_GROUPID_2);

			query.append(_FINDER_COLUMN_G_USER_STATE_USERID_2);

			query.append(_FINDER_COLUMN_G_USER_STATE_REGISTRATIONSTATE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				qPos.add(registrationState);

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

	private static final String _FINDER_COLUMN_G_USER_STATE_GROUPID_2 = "vrRegistration.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_USER_STATE_USERID_2 = "vrRegistration.userId = ? AND ";
	private static final String _FINDER_COLUMN_G_USER_STATE_REGISTRATIONSTATE_2 = "vrRegistration.registrationState = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_REG_APPNO = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByREG_APPNO", new String[] { String.class.getName() },
			VRRegistrationModelImpl.APPLICANTIDNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REG_APPNO = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByREG_APPNO",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr registration where applicantIdNo = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @return the matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByREG_APPNO(String applicantIdNo)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByREG_APPNO(applicantIdNo);

		if (vrRegistration == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("applicantIdNo=");
			msg.append(applicantIdNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRRegistrationException(msg.toString());
		}

		return vrRegistration;
	}

	/**
	 * Returns the vr registration where applicantIdNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByREG_APPNO(String applicantIdNo) {
		return fetchByREG_APPNO(applicantIdNo, true);
	}

	/**
	 * Returns the vr registration where applicantIdNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByREG_APPNO(String applicantIdNo,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { applicantIdNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_REG_APPNO,
					finderArgs, this);
		}

		if (result instanceof VRRegistration) {
			VRRegistration vrRegistration = (VRRegistration)result;

			if (!Objects.equals(applicantIdNo, vrRegistration.getApplicantIdNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_2);
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

				List<VRRegistration> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_REG_APPNO,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRRegistrationPersistenceImpl.fetchByREG_APPNO(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRRegistration vrRegistration = list.get(0);

					result = vrRegistration;

					cacheResult(vrRegistration);

					if ((vrRegistration.getApplicantIdNo() == null) ||
							!vrRegistration.getApplicantIdNo()
											   .equals(applicantIdNo)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_REG_APPNO,
							finderArgs, vrRegistration);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_REG_APPNO,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (VRRegistration)result;
		}
	}

	/**
	 * Removes the vr registration where applicantIdNo = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @return the vr registration that was removed
	 */
	@Override
	public VRRegistration removeByREG_APPNO(String applicantIdNo)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByREG_APPNO(applicantIdNo);

		return remove(vrRegistration);
	}

	/**
	 * Returns the number of vr registrations where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByREG_APPNO(String applicantIdNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REG_APPNO;

		Object[] finderArgs = new Object[] { applicantIdNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_2);
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

	private static final String _FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_1 = "vrRegistration.applicantIdNo IS NULL";
	private static final String _FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_2 = "vrRegistration.applicantIdNo = ?";
	private static final String _FINDER_COLUMN_REG_APPNO_APPLICANTIDNO_3 = "(vrRegistration.applicantIdNo IS NULL OR vrRegistration.applicantIdNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REG_APPNO_MARKASDELETED =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByREG_APPNO_markasdeleted",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REG_APPNO_MARKASDELETED =
		new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED,
			VRRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByREG_APPNO_markasdeleted",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			VRRegistrationModelImpl.GROUPID_COLUMN_BITMASK |
			VRRegistrationModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRRegistrationModelImpl.MARKASDELETED_COLUMN_BITMASK |
			VRRegistrationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REG_APPNO_MARKASDELETED = new FinderPath(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByREG_APPNO_markasdeleted",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @return the matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByREG_APPNO_markasdeleted(long groupId,
		String applicantIdNo, int markasdeleted) {
		return findByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByREG_APPNO_markasdeleted(long groupId,
		String applicantIdNo, int markasdeleted, int start, int end) {
		return findByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByREG_APPNO_markasdeleted(long groupId,
		String applicantIdNo, int markasdeleted, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return findByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr registrations
	 */
	@Override
	public List<VRRegistration> findByREG_APPNO_markasdeleted(long groupId,
		String applicantIdNo, int markasdeleted, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REG_APPNO_MARKASDELETED;
			finderArgs = new Object[] { groupId, applicantIdNo, markasdeleted };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REG_APPNO_MARKASDELETED;
			finderArgs = new Object[] {
					groupId, applicantIdNo, markasdeleted,
					
					start, end, orderByComparator
				};
		}

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRegistration vrRegistration : list) {
					if ((groupId != vrRegistration.getGroupId()) ||
							!Objects.equals(applicantIdNo,
								vrRegistration.getApplicantIdNo()) ||
							(markasdeleted != vrRegistration.getMarkasdeleted())) {
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

			query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_GROUPID_2);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_2);
			}

			query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_MARKASDELETED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				qPos.add(markasdeleted);

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByREG_APPNO_markasdeleted_First(long groupId,
		String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByREG_APPNO_markasdeleted_First(groupId,
				applicantIdNo, markasdeleted, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", markasdeleted=");
		msg.append(markasdeleted);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByREG_APPNO_markasdeleted_First(long groupId,
		String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator) {
		List<VRRegistration> list = findByREG_APPNO_markasdeleted(groupId,
				applicantIdNo, markasdeleted, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration
	 * @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration findByREG_APPNO_markasdeleted_Last(long groupId,
		String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByREG_APPNO_markasdeleted_Last(groupId,
				applicantIdNo, markasdeleted, orderByComparator);

		if (vrRegistration != null) {
			return vrRegistration;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", markasdeleted=");
		msg.append(markasdeleted);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRegistrationException(msg.toString());
	}

	/**
	 * Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	 */
	@Override
	public VRRegistration fetchByREG_APPNO_markasdeleted_Last(long groupId,
		String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator) {
		int count = countByREG_APPNO_markasdeleted(groupId, applicantIdNo,
				markasdeleted);

		if (count == 0) {
			return null;
		}

		List<VRRegistration> list = findByREG_APPNO_markasdeleted(groupId,
				applicantIdNo, markasdeleted, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * @param registrationId the primary key of the current vr registration
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration[] findByREG_APPNO_markasdeleted_PrevAndNext(
		long registrationId, long groupId, String applicantIdNo,
		int markasdeleted, OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = findByPrimaryKey(registrationId);

		Session session = null;

		try {
			session = openSession();

			VRRegistration[] array = new VRRegistrationImpl[3];

			array[0] = getByREG_APPNO_markasdeleted_PrevAndNext(session,
					vrRegistration, groupId, applicantIdNo, markasdeleted,
					orderByComparator, true);

			array[1] = vrRegistration;

			array[2] = getByREG_APPNO_markasdeleted_PrevAndNext(session,
					vrRegistration, groupId, applicantIdNo, markasdeleted,
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

	protected VRRegistration getByREG_APPNO_markasdeleted_PrevAndNext(
		Session session, VRRegistration vrRegistration, long groupId,
		String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE);

		query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_GROUPID_2);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_2);
		}

		query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_MARKASDELETED_2);

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
			query.append(VRRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		qPos.add(markasdeleted);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 */
	@Override
	public void removeByREG_APPNO_markasdeleted(long groupId,
		String applicantIdNo, int markasdeleted) {
		for (VRRegistration vrRegistration : findByREG_APPNO_markasdeleted(
				groupId, applicantIdNo, markasdeleted, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	 *
	 * @param groupId the group ID
	 * @param applicantIdNo the applicant ID no
	 * @param markasdeleted the markasdeleted
	 * @return the number of matching vr registrations
	 */
	@Override
	public int countByREG_APPNO_markasdeleted(long groupId,
		String applicantIdNo, int markasdeleted) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REG_APPNO_MARKASDELETED;

		Object[] finderArgs = new Object[] { groupId, applicantIdNo, markasdeleted };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_GROUPID_2);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_2);
			}

			query.append(_FINDER_COLUMN_REG_APPNO_MARKASDELETED_MARKASDELETED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				qPos.add(markasdeleted);

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

	private static final String _FINDER_COLUMN_REG_APPNO_MARKASDELETED_GROUPID_2 =
		"vrRegistration.groupId = ? AND ";
	private static final String _FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_1 =
		"vrRegistration.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_2 =
		"vrRegistration.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_REG_APPNO_MARKASDELETED_APPLICANTIDNO_3 =
		"(vrRegistration.applicantIdNo IS NULL OR vrRegistration.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_REG_APPNO_MARKASDELETED_MARKASDELETED_2 =
		"vrRegistration.markasdeleted = ?";

	public VRRegistrationPersistenceImpl() {
		setModelClass(VRRegistration.class);
	}

	/**
	 * Caches the vr registration in the entity cache if it is enabled.
	 *
	 * @param vrRegistration the vr registration
	 */
	@Override
	public void cacheResult(VRRegistration vrRegistration) {
		entityCache.putResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationImpl.class, vrRegistration.getPrimaryKey(),
			vrRegistration);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { vrRegistration.getUuid(), vrRegistration.getGroupId() },
			vrRegistration);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_REGID,
			new Object[] {
				vrRegistration.getGroupId(), vrRegistration.getRegistrationId()
			}, vrRegistration);

		finderCache.putResult(FINDER_PATH_FETCH_BY_REG_APPNO,
			new Object[] { vrRegistration.getApplicantIdNo() }, vrRegistration);

		vrRegistration.resetOriginalValues();
	}

	/**
	 * Caches the vr registrations in the entity cache if it is enabled.
	 *
	 * @param vrRegistrations the vr registrations
	 */
	@Override
	public void cacheResult(List<VRRegistration> vrRegistrations) {
		for (VRRegistration vrRegistration : vrRegistrations) {
			if (entityCache.getResult(
						VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
						VRRegistrationImpl.class, vrRegistration.getPrimaryKey()) == null) {
				cacheResult(vrRegistration);
			}
			else {
				vrRegistration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr registrations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRRegistrationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr registration.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRRegistration vrRegistration) {
		entityCache.removeResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationImpl.class, vrRegistration.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRRegistrationModelImpl)vrRegistration, true);
	}

	@Override
	public void clearCache(List<VRRegistration> vrRegistrations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRRegistration vrRegistration : vrRegistrations) {
			entityCache.removeResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
				VRRegistrationImpl.class, vrRegistration.getPrimaryKey());

			clearUniqueFindersCache((VRRegistrationModelImpl)vrRegistration,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRRegistrationModelImpl vrRegistrationModelImpl) {
		Object[] args = new Object[] {
				vrRegistrationModelImpl.getUuid(),
				vrRegistrationModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			vrRegistrationModelImpl, false);

		args = new Object[] {
				vrRegistrationModelImpl.getGroupId(),
				vrRegistrationModelImpl.getRegistrationId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_G_REGID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_G_REGID, args,
			vrRegistrationModelImpl, false);

		args = new Object[] { vrRegistrationModelImpl.getApplicantIdNo() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_REG_APPNO, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_REG_APPNO, args,
			vrRegistrationModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRRegistrationModelImpl vrRegistrationModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrRegistrationModelImpl.getUuid(),
					vrRegistrationModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((vrRegistrationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrRegistrationModelImpl.getOriginalUuid(),
					vrRegistrationModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrRegistrationModelImpl.getGroupId(),
					vrRegistrationModelImpl.getRegistrationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_REGID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_REGID, args);
		}

		if ((vrRegistrationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_REGID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrRegistrationModelImpl.getOriginalGroupId(),
					vrRegistrationModelImpl.getOriginalRegistrationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_REGID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_REGID, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrRegistrationModelImpl.getApplicantIdNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REG_APPNO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REG_APPNO, args);
		}

		if ((vrRegistrationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REG_APPNO.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrRegistrationModelImpl.getOriginalApplicantIdNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REG_APPNO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REG_APPNO, args);
		}
	}

	/**
	 * Creates a new vr registration with the primary key. Does not add the vr registration to the database.
	 *
	 * @param registrationId the primary key for the new vr registration
	 * @return the new vr registration
	 */
	@Override
	public VRRegistration create(long registrationId) {
		VRRegistration vrRegistration = new VRRegistrationImpl();

		vrRegistration.setNew(true);
		vrRegistration.setPrimaryKey(registrationId);

		String uuid = PortalUUIDUtil.generate();

		vrRegistration.setUuid(uuid);

		vrRegistration.setCompanyId(companyProvider.getCompanyId());

		return vrRegistration;
	}

	/**
	 * Removes the vr registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrationId the primary key of the vr registration
	 * @return the vr registration that was removed
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration remove(long registrationId)
		throws NoSuchVRRegistrationException {
		return remove((Serializable)registrationId);
	}

	/**
	 * Removes the vr registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr registration
	 * @return the vr registration that was removed
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration remove(Serializable primaryKey)
		throws NoSuchVRRegistrationException {
		Session session = null;

		try {
			session = openSession();

			VRRegistration vrRegistration = (VRRegistration)session.get(VRRegistrationImpl.class,
					primaryKey);

			if (vrRegistration == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrRegistration);
		}
		catch (NoSuchVRRegistrationException nsee) {
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
	protected VRRegistration removeImpl(VRRegistration vrRegistration) {
		vrRegistration = toUnwrappedModel(vrRegistration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrRegistration)) {
				vrRegistration = (VRRegistration)session.get(VRRegistrationImpl.class,
						vrRegistration.getPrimaryKeyObj());
			}

			if (vrRegistration != null) {
				session.delete(vrRegistration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrRegistration != null) {
			clearCache(vrRegistration);
		}

		return vrRegistration;
	}

	@Override
	public VRRegistration updateImpl(VRRegistration vrRegistration) {
		vrRegistration = toUnwrappedModel(vrRegistration);

		boolean isNew = vrRegistration.isNew();

		VRRegistrationModelImpl vrRegistrationModelImpl = (VRRegistrationModelImpl)vrRegistration;

		if (Validator.isNull(vrRegistration.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			vrRegistration.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (vrRegistration.getCreateDate() == null)) {
			if (serviceContext == null) {
				vrRegistration.setCreateDate(now);
			}
			else {
				vrRegistration.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!vrRegistrationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				vrRegistration.setModifiedDate(now);
			}
			else {
				vrRegistration.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (vrRegistration.isNew()) {
				session.save(vrRegistration);

				vrRegistration.setNew(false);
			}
			else {
				vrRegistration = (VRRegistration)session.merge(vrRegistration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRRegistrationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrRegistrationModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { vrRegistrationModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((vrRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrRegistrationModelImpl.getOriginalUuid(),
						vrRegistrationModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						vrRegistrationModelImpl.getUuid(),
						vrRegistrationModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((vrRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_SUBMITTING.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrRegistrationModelImpl.getOriginalGroupId(),
						vrRegistrationModelImpl.getOriginalSubmitting()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_SUBMITTING, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_SUBMITTING,
					args);

				args = new Object[] {
						vrRegistrationModelImpl.getGroupId(),
						vrRegistrationModelImpl.getSubmitting()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_SUBMITTING, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_SUBMITTING,
					args);
			}

			if ((vrRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GID_UID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrRegistrationModelImpl.getOriginalGroupId(),
						vrRegistrationModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GID_UID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GID_UID,
					args);

				args = new Object[] {
						vrRegistrationModelImpl.getGroupId(),
						vrRegistrationModelImpl.getUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GID_UID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GID_UID,
					args);
			}

			if ((vrRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID_SUBMITTING.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrRegistrationModelImpl.getOriginalGroupId(),
						vrRegistrationModelImpl.getOriginalUserId(),
						vrRegistrationModelImpl.getOriginalSubmitting()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_USERID_SUBMITTING,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID_SUBMITTING,
					args);

				args = new Object[] {
						vrRegistrationModelImpl.getGroupId(),
						vrRegistrationModelImpl.getUserId(),
						vrRegistrationModelImpl.getSubmitting()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_USERID_SUBMITTING,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID_SUBMITTING,
					args);
			}

			if ((vrRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_APPNO_GOVCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrRegistrationModelImpl.getOriginalGroupId(),
						vrRegistrationModelImpl.getOriginalApplicantIdNo(),
						vrRegistrationModelImpl.getOriginalGovAgencyCode(),
						vrRegistrationModelImpl.getOriginalRegistrationState()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_APPNO_GOVCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_APPNO_GOVCODE,
					args);

				args = new Object[] {
						vrRegistrationModelImpl.getGroupId(),
						vrRegistrationModelImpl.getApplicantIdNo(),
						vrRegistrationModelImpl.getGovAgencyCode(),
						vrRegistrationModelImpl.getRegistrationState()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_APPNO_GOVCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_APPNO_GOVCODE,
					args);
			}

			if ((vrRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_USER_STATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrRegistrationModelImpl.getOriginalGroupId(),
						vrRegistrationModelImpl.getOriginalUserId(),
						vrRegistrationModelImpl.getOriginalRegistrationState()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_USER_STATE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_USER_STATE,
					args);

				args = new Object[] {
						vrRegistrationModelImpl.getGroupId(),
						vrRegistrationModelImpl.getUserId(),
						vrRegistrationModelImpl.getRegistrationState()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_USER_STATE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_USER_STATE,
					args);
			}

			if ((vrRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REG_APPNO_MARKASDELETED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrRegistrationModelImpl.getOriginalGroupId(),
						vrRegistrationModelImpl.getOriginalApplicantIdNo(),
						vrRegistrationModelImpl.getOriginalMarkasdeleted()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REG_APPNO_MARKASDELETED,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REG_APPNO_MARKASDELETED,
					args);

				args = new Object[] {
						vrRegistrationModelImpl.getGroupId(),
						vrRegistrationModelImpl.getApplicantIdNo(),
						vrRegistrationModelImpl.getMarkasdeleted()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REG_APPNO_MARKASDELETED,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REG_APPNO_MARKASDELETED,
					args);
			}
		}

		entityCache.putResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			VRRegistrationImpl.class, vrRegistration.getPrimaryKey(),
			vrRegistration, false);

		clearUniqueFindersCache(vrRegistrationModelImpl, false);
		cacheUniqueFindersCache(vrRegistrationModelImpl);

		vrRegistration.resetOriginalValues();

		return vrRegistration;
	}

	protected VRRegistration toUnwrappedModel(VRRegistration vrRegistration) {
		if (vrRegistration instanceof VRRegistrationImpl) {
			return vrRegistration;
		}

		VRRegistrationImpl vrRegistrationImpl = new VRRegistrationImpl();

		vrRegistrationImpl.setNew(vrRegistration.isNew());
		vrRegistrationImpl.setPrimaryKey(vrRegistration.getPrimaryKey());

		vrRegistrationImpl.setUuid(vrRegistration.getUuid());
		vrRegistrationImpl.setRegistrationId(vrRegistration.getRegistrationId());
		vrRegistrationImpl.setCompanyId(vrRegistration.getCompanyId());
		vrRegistrationImpl.setGroupId(vrRegistration.getGroupId());
		vrRegistrationImpl.setUserId(vrRegistration.getUserId());
		vrRegistrationImpl.setCreateDate(vrRegistration.getCreateDate());
		vrRegistrationImpl.setModifiedDate(vrRegistration.getModifiedDate());
		vrRegistrationImpl.setApplicantName(vrRegistration.getApplicantName());
		vrRegistrationImpl.setApplicantIdType(vrRegistration.getApplicantIdType());
		vrRegistrationImpl.setApplicantIdNo(vrRegistration.getApplicantIdNo());
		vrRegistrationImpl.setApplicantIdDate(vrRegistration.getApplicantIdDate());
		vrRegistrationImpl.setAddress(vrRegistration.getAddress());
		vrRegistrationImpl.setCityCode(vrRegistration.getCityCode());
		vrRegistrationImpl.setCityName(vrRegistration.getCityName());
		vrRegistrationImpl.setDistrictCode(vrRegistration.getDistrictCode());
		vrRegistrationImpl.setDistrictName(vrRegistration.getDistrictName());
		vrRegistrationImpl.setWardCode(vrRegistration.getWardCode());
		vrRegistrationImpl.setWardName(vrRegistration.getWardName());
		vrRegistrationImpl.setContactName(vrRegistration.getContactName());
		vrRegistrationImpl.setContactTelNo(vrRegistration.getContactTelNo());
		vrRegistrationImpl.setContactEmail(vrRegistration.getContactEmail());
		vrRegistrationImpl.setGovAgencyCode(vrRegistration.getGovAgencyCode());
		vrRegistrationImpl.setGovAgencyName(vrRegistration.getGovAgencyName());
		vrRegistrationImpl.setRegistrationState(vrRegistration.getRegistrationState());
		vrRegistrationImpl.setRegistrationClass(vrRegistration.getRegistrationClass());
		vrRegistrationImpl.setSubmitting(vrRegistration.isSubmitting());
		vrRegistrationImpl.setRepresentativeEnterprise(vrRegistration.getRepresentativeEnterprise());
		vrRegistrationImpl.setRemarks(vrRegistration.getRemarks());
		vrRegistrationImpl.setMarkasdeleted(vrRegistration.getMarkasdeleted());

		return vrRegistrationImpl;
	}

	/**
	 * Returns the vr registration with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr registration
	 * @return the vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRRegistrationException {
		VRRegistration vrRegistration = fetchByPrimaryKey(primaryKey);

		if (vrRegistration == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrRegistration;
	}

	/**
	 * Returns the vr registration with the primary key or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	 *
	 * @param registrationId the primary key of the vr registration
	 * @return the vr registration
	 * @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration findByPrimaryKey(long registrationId)
		throws NoSuchVRRegistrationException {
		return findByPrimaryKey((Serializable)registrationId);
	}

	/**
	 * Returns the vr registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr registration
	 * @return the vr registration, or <code>null</code> if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
				VRRegistrationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRRegistration vrRegistration = (VRRegistration)serializable;

		if (vrRegistration == null) {
			Session session = null;

			try {
				session = openSession();

				vrRegistration = (VRRegistration)session.get(VRRegistrationImpl.class,
						primaryKey);

				if (vrRegistration != null) {
					cacheResult(vrRegistration);
				}
				else {
					entityCache.putResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
						VRRegistrationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
					VRRegistrationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrRegistration;
	}

	/**
	 * Returns the vr registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param registrationId the primary key of the vr registration
	 * @return the vr registration, or <code>null</code> if a vr registration with the primary key could not be found
	 */
	@Override
	public VRRegistration fetchByPrimaryKey(long registrationId) {
		return fetchByPrimaryKey((Serializable)registrationId);
	}

	@Override
	public Map<Serializable, VRRegistration> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRRegistration> map = new HashMap<Serializable, VRRegistration>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRRegistration vrRegistration = fetchByPrimaryKey(primaryKey);

			if (vrRegistration != null) {
				map.put(primaryKey, vrRegistration);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
					VRRegistrationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRRegistration)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRREGISTRATION_WHERE_PKS_IN);

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

			for (VRRegistration vrRegistration : (List<VRRegistration>)q.list()) {
				map.put(vrRegistration.getPrimaryKeyObj(), vrRegistration);

				cacheResult(vrRegistration);

				uncachedPrimaryKeys.remove(vrRegistration.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
					VRRegistrationImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr registrations.
	 *
	 * @return the vr registrations
	 */
	@Override
	public List<VRRegistration> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @return the range of vr registrations
	 */
	@Override
	public List<VRRegistration> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr registrations
	 */
	@Override
	public List<VRRegistration> findAll(int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr registrations
	 * @param end the upper bound of the range of vr registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr registrations
	 */
	@Override
	public List<VRRegistration> findAll(int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
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

		List<VRRegistration> list = null;

		if (retrieveFromCache) {
			list = (List<VRRegistration>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRREGISTRATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRREGISTRATION;

				if (pagination) {
					sql = sql.concat(VRRegistrationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRegistration>)QueryUtil.list(q,
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
	 * Removes all the vr registrations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRRegistration vrRegistration : findAll()) {
			remove(vrRegistration);
		}
	}

	/**
	 * Returns the number of vr registrations.
	 *
	 * @return the number of vr registrations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRREGISTRATION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VRRegistrationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr registration persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRRegistrationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRREGISTRATION = "SELECT vrRegistration FROM VRRegistration vrRegistration";
	private static final String _SQL_SELECT_VRREGISTRATION_WHERE_PKS_IN = "SELECT vrRegistration FROM VRRegistration vrRegistration WHERE registrationId IN (";
	private static final String _SQL_SELECT_VRREGISTRATION_WHERE = "SELECT vrRegistration FROM VRRegistration vrRegistration WHERE ";
	private static final String _SQL_COUNT_VRREGISTRATION = "SELECT COUNT(vrRegistration) FROM VRRegistration vrRegistration";
	private static final String _SQL_COUNT_VRREGISTRATION_WHERE = "SELECT COUNT(vrRegistration) FROM VRRegistration vrRegistration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrRegistration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRRegistration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRRegistration exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRRegistrationPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}