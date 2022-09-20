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

import com.fds.vr.business.exception.NoSuchVRDossierException;
import com.fds.vr.business.model.VRDossier;
import com.fds.vr.business.model.impl.VRDossierImpl;
import com.fds.vr.business.model.impl.VRDossierModelImpl;
import com.fds.vr.business.service.persistence.VRDossierPersistence;

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
 * The persistence implementation for the vr dossier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRDossierPersistence
 * @see com.fds.vr.business.service.persistence.VRDossierUtil
 * @generated
 */
@ProviderType
public class VRDossierPersistenceImpl extends BasePersistenceImpl<VRDossier>
	implements VRDossierPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRDossierUtil} to access the vr dossier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRDossierImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			VRDossierModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr dossiers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByUuid(String uuid, int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByUuid(String uuid, int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
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

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossier vrDossier : list) {
					if (!Objects.equals(uuid, vrDossier.getUuid())) {
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

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

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
				query.append(VRDossierModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr dossier in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByUuid_First(String uuid,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByUuid_First(uuid, orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the first vr dossier in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByUuid_First(String uuid,
		OrderByComparator<VRDossier> orderByComparator) {
		List<VRDossier> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByUuid_Last(String uuid,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByUuid_Last(uuid, orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the last vr dossier in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByUuid_Last(String uuid,
		OrderByComparator<VRDossier> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<VRDossier> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossiers before and after the current vr dossier in the ordered set where uuid = &#63;.
	 *
	 * @param dossierId the primary key of the current vr dossier
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier[] findByUuid_PrevAndNext(long dossierId, String uuid,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByPrimaryKey(dossierId);

		Session session = null;

		try {
			session = openSession();

			VRDossier[] array = new VRDossierImpl[3];

			array[0] = getByUuid_PrevAndNext(session, vrDossier, uuid,
					orderByComparator, true);

			array[1] = vrDossier;

			array[2] = getByUuid_PrevAndNext(session, vrDossier, uuid,
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

	protected VRDossier getByUuid_PrevAndNext(Session session,
		VRDossier vrDossier, String uuid,
		OrderByComparator<VRDossier> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRDOSSIER_WHERE);

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
			query.append(VRDossierModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossiers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (VRDossier vrDossier : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "vrDossier.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "vrDossier.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(vrDossier.uuid IS NULL OR vrDossier.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			VRDossierModelImpl.UUID_COLUMN_BITMASK |
			VRDossierModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the vr dossier where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRDossierException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByUUID_G(String uuid, long groupId)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByUUID_G(uuid, groupId);

		if (vrDossier == null) {
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

			throw new NoSuchVRDossierException(msg.toString());
		}

		return vrDossier;
	}

	/**
	 * Returns the vr dossier where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the vr dossier where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof VRDossier) {
			VRDossier vrDossier = (VRDossier)result;

			if (!Objects.equals(uuid, vrDossier.getUuid()) ||
					(groupId != vrDossier.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

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

				List<VRDossier> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					VRDossier vrDossier = list.get(0);

					result = vrDossier;

					cacheResult(vrDossier);

					if ((vrDossier.getUuid() == null) ||
							!vrDossier.getUuid().equals(uuid) ||
							(vrDossier.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, vrDossier);
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
			return (VRDossier)result;
		}
	}

	/**
	 * Removes the vr dossier where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the vr dossier that was removed
	 */
	@Override
	public VRDossier removeByUUID_G(String uuid, long groupId)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByUUID_G(uuid, groupId);

		return remove(vrDossier);
	}

	/**
	 * Returns the number of vr dossiers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "vrDossier.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "vrDossier.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(vrDossier.uuid IS NULL OR vrDossier.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "vrDossier.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			VRDossierModelImpl.UUID_COLUMN_BITMASK |
			VRDossierModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr dossiers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<VRDossier> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<VRDossier> orderByComparator,
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

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossier vrDossier : list) {
					if (!Objects.equals(uuid, vrDossier.getUuid()) ||
							(companyId != vrDossier.getCompanyId())) {
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

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

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
				query.append(VRDossierModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the first vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<VRDossier> orderByComparator) {
		List<VRDossier> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the last vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<VRDossier> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<VRDossier> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossiers before and after the current vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dossierId the primary key of the current vr dossier
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier[] findByUuid_C_PrevAndNext(long dossierId, String uuid,
		long companyId, OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByPrimaryKey(dossierId);

		Session session = null;

		try {
			session = openSession();

			VRDossier[] array = new VRDossierImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, vrDossier, uuid,
					companyId, orderByComparator, true);

			array[1] = vrDossier;

			array[2] = getByUuid_C_PrevAndNext(session, vrDossier, uuid,
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

	protected VRDossier getByUuid_C_PrevAndNext(Session session,
		VRDossier vrDossier, String uuid, long companyId,
		OrderByComparator<VRDossier> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRDOSSIER_WHERE);

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
			query.append(VRDossierModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossiers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (VRDossier vrDossier : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "vrDossier.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "vrDossier.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(vrDossier.uuid IS NULL OR vrDossier.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "vrDossier.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_UID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_UID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_UID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_UID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRDossierModelImpl.GROUPID_COLUMN_BITMASK |
			VRDossierModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_UID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_UID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr dossiers where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_UID(long groupId, long userId) {
		return findByG_UID(groupId, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_UID(long groupId, long userId, int start,
		int end) {
		return findByG_UID(groupId, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_UID(long groupId, long userId, int start,
		int end, OrderByComparator<VRDossier> orderByComparator) {
		return findByG_UID(groupId, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_UID(long groupId, long userId, int start,
		int end, OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_UID;
			finderArgs = new Object[] { groupId, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_UID;
			finderArgs = new Object[] {
					groupId, userId,
					
					start, end, orderByComparator
				};
		}

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossier vrDossier : list) {
					if ((groupId != vrDossier.getGroupId()) ||
							(userId != vrDossier.getUserId())) {
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

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_UID_GROUPID_2);

			query.append(_FINDER_COLUMN_G_UID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_UID_First(long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_UID_First(groupId, userId,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_UID_First(long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator) {
		List<VRDossier> list = findByG_UID(groupId, userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_UID_Last(long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_UID_Last(groupId, userId,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_UID_Last(long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator) {
		int count = countByG_UID(groupId, userId);

		if (count == 0) {
			return null;
		}

		List<VRDossier> list = findByG_UID(groupId, userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param dossierId the primary key of the current vr dossier
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier[] findByG_UID_PrevAndNext(long dossierId, long groupId,
		long userId, OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByPrimaryKey(dossierId);

		Session session = null;

		try {
			session = openSession();

			VRDossier[] array = new VRDossierImpl[3];

			array[0] = getByG_UID_PrevAndNext(session, vrDossier, groupId,
					userId, orderByComparator, true);

			array[1] = vrDossier;

			array[2] = getByG_UID_PrevAndNext(session, vrDossier, groupId,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossier getByG_UID_PrevAndNext(Session session,
		VRDossier vrDossier, long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRDOSSIER_WHERE);

		query.append(_FINDER_COLUMN_G_UID_GROUPID_2);

		query.append(_FINDER_COLUMN_G_UID_USERID_2);

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
			query.append(VRDossierModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossiers where groupId = &#63; and userId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 */
	@Override
	public void removeByG_UID(long groupId, long userId) {
		for (VRDossier vrDossier : findByG_UID(groupId, userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByG_UID(long groupId, long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_UID;

		Object[] finderArgs = new Object[] { groupId, userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_UID_GROUPID_2);

			query.append(_FINDER_COLUMN_G_UID_USERID_2);

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

	private static final String _FINDER_COLUMN_G_UID_GROUPID_2 = "vrDossier.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_UID_USERID_2 = "vrDossier.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_REF = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_REF",
			new String[] { Long.class.getName(), String.class.getName() },
			VRDossierModelImpl.GROUPID_COLUMN_BITMASK |
			VRDossierModelImpl.REFERENCEUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_REF = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_REF",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @return the matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_REF(long groupId, String referenceUid)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_REF(groupId, referenceUid);

		if (vrDossier == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", referenceUid=");
			msg.append(referenceUid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRDossierException(msg.toString());
		}

		return vrDossier;
	}

	/**
	 * Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_REF(long groupId, String referenceUid) {
		return fetchByG_REF(groupId, referenceUid, true);
	}

	/**
	 * Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_REF(long groupId, String referenceUid,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, referenceUid };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_REF,
					finderArgs, this);
		}

		if (result instanceof VRDossier) {
			VRDossier vrDossier = (VRDossier)result;

			if ((groupId != vrDossier.getGroupId()) ||
					!Objects.equals(referenceUid, vrDossier.getReferenceUid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_REF_GROUPID_2);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_G_REF_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_REF_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_G_REF_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
				}

				List<VRDossier> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_REF,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRDossierPersistenceImpl.fetchByG_REF(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRDossier vrDossier = list.get(0);

					result = vrDossier;

					cacheResult(vrDossier);

					if ((vrDossier.getGroupId() != groupId) ||
							(vrDossier.getReferenceUid() == null) ||
							!vrDossier.getReferenceUid().equals(referenceUid)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_REF,
							finderArgs, vrDossier);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_REF, finderArgs);

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
			return (VRDossier)result;
		}
	}

	/**
	 * Removes the vr dossier where groupId = &#63; and referenceUid = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @return the vr dossier that was removed
	 */
	@Override
	public VRDossier removeByG_REF(long groupId, String referenceUid)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByG_REF(groupId, referenceUid);

		return remove(vrDossier);
	}

	/**
	 * Returns the number of vr dossiers where groupId = &#63; and referenceUid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByG_REF(long groupId, String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_REF;

		Object[] finderArgs = new Object[] { groupId, referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_REF_GROUPID_2);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_G_REF_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_REF_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_G_REF_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
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

	private static final String _FINDER_COLUMN_G_REF_GROUPID_2 = "vrDossier.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_REF_REFERENCEUID_1 = "vrDossier.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_G_REF_REFERENCEUID_2 = "vrDossier.referenceUid = ?";
	private static final String _FINDER_COLUMN_G_REF_REFERENCEUID_3 = "(vrDossier.referenceUid IS NULL OR vrDossier.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_SC = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_SC",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_SC = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_SC",
			new String[] { Long.class.getName(), String.class.getName() },
			VRDossierModelImpl.GROUPID_COLUMN_BITMASK |
			VRDossierModelImpl.SERVICECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_SC = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_SC",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @return the matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_SC(long groupId, String serviceCode) {
		return findByG_SC(groupId, serviceCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_SC(long groupId, String serviceCode,
		int start, int end) {
		return findByG_SC(groupId, serviceCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_SC(long groupId, String serviceCode,
		int start, int end, OrderByComparator<VRDossier> orderByComparator) {
		return findByG_SC(groupId, serviceCode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_SC(long groupId, String serviceCode,
		int start, int end, OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_SC;
			finderArgs = new Object[] { groupId, serviceCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_SC;
			finderArgs = new Object[] {
					groupId, serviceCode,
					
					start, end, orderByComparator
				};
		}

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossier vrDossier : list) {
					if ((groupId != vrDossier.getGroupId()) ||
							!Objects.equals(serviceCode,
								vrDossier.getServiceCode())) {
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

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_SC_GROUPID_2);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_G_SC_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_SC_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_G_SC_SERVICECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (!pagination) {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_SC_First(long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_SC_First(groupId, serviceCode,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_SC_First(long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator) {
		List<VRDossier> list = findByG_SC(groupId, serviceCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_SC_Last(long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_SC_Last(groupId, serviceCode,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_SC_Last(long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator) {
		int count = countByG_SC(groupId, serviceCode);

		if (count == 0) {
			return null;
		}

		List<VRDossier> list = findByG_SC(groupId, serviceCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param dossierId the primary key of the current vr dossier
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier[] findByG_SC_PrevAndNext(long dossierId, long groupId,
		String serviceCode, OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByPrimaryKey(dossierId);

		Session session = null;

		try {
			session = openSession();

			VRDossier[] array = new VRDossierImpl[3];

			array[0] = getByG_SC_PrevAndNext(session, vrDossier, groupId,
					serviceCode, orderByComparator, true);

			array[1] = vrDossier;

			array[2] = getByG_SC_PrevAndNext(session, vrDossier, groupId,
					serviceCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossier getByG_SC_PrevAndNext(Session session,
		VRDossier vrDossier, long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRDOSSIER_WHERE);

		query.append(_FINDER_COLUMN_G_SC_GROUPID_2);

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_G_SC_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_SC_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_G_SC_SERVICECODE_2);
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
			query.append(VRDossierModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossiers where groupId = &#63; and serviceCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 */
	@Override
	public void removeByG_SC(long groupId, String serviceCode) {
		for (VRDossier vrDossier : findByG_SC(groupId, serviceCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByG_SC(long groupId, String serviceCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_SC;

		Object[] finderArgs = new Object[] { groupId, serviceCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_SC_GROUPID_2);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_G_SC_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_SC_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_G_SC_SERVICECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindServiceCode) {
					qPos.add(serviceCode);
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

	private static final String _FINDER_COLUMN_G_SC_GROUPID_2 = "vrDossier.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_SC_SERVICECODE_1 = "vrDossier.serviceCode IS NULL";
	private static final String _FINDER_COLUMN_G_SC_SERVICECODE_2 = "vrDossier.serviceCode = ?";
	private static final String _FINDER_COLUMN_G_SC_SERVICECODE_3 = "(vrDossier.serviceCode IS NULL OR vrDossier.serviceCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_GAC = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_GAC",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GAC = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_GAC",
			new String[] { Long.class.getName(), String.class.getName() },
			VRDossierModelImpl.GROUPID_COLUMN_BITMASK |
			VRDossierModelImpl.SERVICECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_GAC = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_GAC",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @return the matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_GAC(long groupId, String serviceCode) {
		return findByG_GAC(groupId, serviceCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_GAC(long groupId, String serviceCode,
		int start, int end) {
		return findByG_GAC(groupId, serviceCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_GAC(long groupId, String serviceCode,
		int start, int end, OrderByComparator<VRDossier> orderByComparator) {
		return findByG_GAC(groupId, serviceCode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_GAC(long groupId, String serviceCode,
		int start, int end, OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GAC;
			finderArgs = new Object[] { groupId, serviceCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_GAC;
			finderArgs = new Object[] {
					groupId, serviceCode,
					
					start, end, orderByComparator
				};
		}

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossier vrDossier : list) {
					if ((groupId != vrDossier.getGroupId()) ||
							!Objects.equals(serviceCode,
								vrDossier.getServiceCode())) {
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

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_GAC_GROUPID_2);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (!pagination) {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_GAC_First(long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_GAC_First(groupId, serviceCode,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_GAC_First(long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator) {
		List<VRDossier> list = findByG_GAC(groupId, serviceCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_GAC_Last(long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_GAC_Last(groupId, serviceCode,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_GAC_Last(long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator) {
		int count = countByG_GAC(groupId, serviceCode);

		if (count == 0) {
			return null;
		}

		List<VRDossier> list = findByG_GAC(groupId, serviceCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param dossierId the primary key of the current vr dossier
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier[] findByG_GAC_PrevAndNext(long dossierId, long groupId,
		String serviceCode, OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByPrimaryKey(dossierId);

		Session session = null;

		try {
			session = openSession();

			VRDossier[] array = new VRDossierImpl[3];

			array[0] = getByG_GAC_PrevAndNext(session, vrDossier, groupId,
					serviceCode, orderByComparator, true);

			array[1] = vrDossier;

			array[2] = getByG_GAC_PrevAndNext(session, vrDossier, groupId,
					serviceCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossier getByG_GAC_PrevAndNext(Session session,
		VRDossier vrDossier, long groupId, String serviceCode,
		OrderByComparator<VRDossier> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRDOSSIER_WHERE);

		query.append(_FINDER_COLUMN_G_GAC_GROUPID_2);

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_2);
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
			query.append(VRDossierModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossiers where groupId = &#63; and serviceCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 */
	@Override
	public void removeByG_GAC(long groupId, String serviceCode) {
		for (VRDossier vrDossier : findByG_GAC(groupId, serviceCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers where groupId = &#63; and serviceCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceCode the service code
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByG_GAC(long groupId, String serviceCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_GAC;

		Object[] finderArgs = new Object[] { groupId, serviceCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_GAC_GROUPID_2);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_G_GAC_SERVICECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindServiceCode) {
					qPos.add(serviceCode);
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

	private static final String _FINDER_COLUMN_G_GAC_GROUPID_2 = "vrDossier.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_GAC_SERVICECODE_1 = "vrDossier.serviceCode IS NULL";
	private static final String _FINDER_COLUMN_G_GAC_SERVICECODE_2 = "vrDossier.serviceCode = ?";
	private static final String _FINDER_COLUMN_G_GAC_SERVICECODE_3 = "(vrDossier.serviceCode IS NULL OR vrDossier.serviceCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DTN = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_DTN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DTN = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_DTN",
			new String[] { Long.class.getName(), String.class.getName() },
			VRDossierModelImpl.GROUPID_COLUMN_BITMASK |
			VRDossierModelImpl.DOSSIERTEMPLATENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_DTN = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_DTN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @return the matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_DTN(long groupId, String dossierTemplateNo) {
		return findByG_DTN(groupId, dossierTemplateNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_DTN(long groupId, String dossierTemplateNo,
		int start, int end) {
		return findByG_DTN(groupId, dossierTemplateNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_DTN(long groupId, String dossierTemplateNo,
		int start, int end, OrderByComparator<VRDossier> orderByComparator) {
		return findByG_DTN(groupId, dossierTemplateNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_DTN(long groupId, String dossierTemplateNo,
		int start, int end, OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DTN;
			finderArgs = new Object[] { groupId, dossierTemplateNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DTN;
			finderArgs = new Object[] {
					groupId, dossierTemplateNo,
					
					start, end, orderByComparator
				};
		}

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossier vrDossier : list) {
					if ((groupId != vrDossier.getGroupId()) ||
							!Objects.equals(dossierTemplateNo,
								vrDossier.getDossierTemplateNo())) {
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

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_DTN_GROUPID_2);

			boolean bindDossierTemplateNo = false;

			if (dossierTemplateNo == null) {
				query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_1);
			}
			else if (dossierTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_3);
			}
			else {
				bindDossierTemplateNo = true;

				query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDossierTemplateNo) {
					qPos.add(dossierTemplateNo);
				}

				if (!pagination) {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_DTN_First(long groupId, String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_DTN_First(groupId, dossierTemplateNo,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dossierTemplateNo=");
		msg.append(dossierTemplateNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_DTN_First(long groupId, String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator) {
		List<VRDossier> list = findByG_DTN(groupId, dossierTemplateNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_DTN_Last(long groupId, String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_DTN_Last(groupId, dossierTemplateNo,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dossierTemplateNo=");
		msg.append(dossierTemplateNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_DTN_Last(long groupId, String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator) {
		int count = countByG_DTN(groupId, dossierTemplateNo);

		if (count == 0) {
			return null;
		}

		List<VRDossier> list = findByG_DTN(groupId, dossierTemplateNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * @param dossierId the primary key of the current vr dossier
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier[] findByG_DTN_PrevAndNext(long dossierId, long groupId,
		String dossierTemplateNo, OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByPrimaryKey(dossierId);

		Session session = null;

		try {
			session = openSession();

			VRDossier[] array = new VRDossierImpl[3];

			array[0] = getByG_DTN_PrevAndNext(session, vrDossier, groupId,
					dossierTemplateNo, orderByComparator, true);

			array[1] = vrDossier;

			array[2] = getByG_DTN_PrevAndNext(session, vrDossier, groupId,
					dossierTemplateNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossier getByG_DTN_PrevAndNext(Session session,
		VRDossier vrDossier, long groupId, String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRDOSSIER_WHERE);

		query.append(_FINDER_COLUMN_G_DTN_GROUPID_2);

		boolean bindDossierTemplateNo = false;

		if (dossierTemplateNo == null) {
			query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_1);
		}
		else if (dossierTemplateNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_3);
		}
		else {
			bindDossierTemplateNo = true;

			query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_2);
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
			query.append(VRDossierModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDossierTemplateNo) {
			qPos.add(dossierTemplateNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 */
	@Override
	public void removeByG_DTN(long groupId, String dossierTemplateNo) {
		for (VRDossier vrDossier : findByG_DTN(groupId, dossierTemplateNo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierTemplateNo the dossier template no
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByG_DTN(long groupId, String dossierTemplateNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_DTN;

		Object[] finderArgs = new Object[] { groupId, dossierTemplateNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_DTN_GROUPID_2);

			boolean bindDossierTemplateNo = false;

			if (dossierTemplateNo == null) {
				query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_1);
			}
			else if (dossierTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_3);
			}
			else {
				bindDossierTemplateNo = true;

				query.append(_FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDossierTemplateNo) {
					qPos.add(dossierTemplateNo);
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

	private static final String _FINDER_COLUMN_G_DTN_GROUPID_2 = "vrDossier.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_1 = "vrDossier.dossierTemplateNo IS NULL";
	private static final String _FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_2 = "vrDossier.dossierTemplateNo = ?";
	private static final String _FINDER_COLUMN_G_DTN_DOSSIERTEMPLATENO_3 = "(vrDossier.dossierTemplateNo IS NULL OR vrDossier.dossierTemplateNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_DID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_DID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRDossierModelImpl.GROUPID_COLUMN_BITMASK |
			VRDossierModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_DID = new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_DID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @return the matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_DID(long groupId, long dossierId) {
		return findByG_DID(groupId, dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_DID(long groupId, long dossierId, int start,
		int end) {
		return findByG_DID(groupId, dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_DID(long groupId, long dossierId, int start,
		int end, OrderByComparator<VRDossier> orderByComparator) {
		return findByG_DID(groupId, dossierId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_DID(long groupId, long dossierId, int start,
		int end, OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DID;
			finderArgs = new Object[] { groupId, dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DID;
			finderArgs = new Object[] {
					groupId, dossierId,
					
					start, end, orderByComparator
				};
		}

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossier vrDossier : list) {
					if ((groupId != vrDossier.getGroupId()) ||
							(dossierId != vrDossier.getDossierId())) {
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

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_DID_GROUPID_2);

			query.append(_FINDER_COLUMN_G_DID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_DID_First(long groupId, long dossierId,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_DID_First(groupId, dossierId,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_DID_First(long groupId, long dossierId,
		OrderByComparator<VRDossier> orderByComparator) {
		List<VRDossier> list = findByG_DID(groupId, dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_DID_Last(long groupId, long dossierId,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_DID_Last(groupId, dossierId,
				orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_DID_Last(long groupId, long dossierId,
		OrderByComparator<VRDossier> orderByComparator) {
		int count = countByG_DID(groupId, dossierId);

		if (count == 0) {
			return null;
		}

		List<VRDossier> list = findByG_DID(groupId, dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the vr dossiers where groupId = &#63; and dossierId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeByG_DID(long groupId, long dossierId) {
		for (VRDossier vrDossier : findByG_DID(groupId, dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByG_DID(long groupId, long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_DID;

		Object[] finderArgs = new Object[] { groupId, dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_DID_GROUPID_2);

			query.append(_FINDER_COLUMN_G_DID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_G_DID_GROUPID_2 = "vrDossier.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_DID_DOSSIERID_2 = "vrDossier.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_C_GAC_SC_DTNO_NOTDS =
		new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, VRDossierImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_C_GAC_SC_DTNO_NOTDS",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_C_GAC_SC_DTNO_NOTDS =
		new FinderPath(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByG_C_GAC_SC_DTNO_NOTDS",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @return the matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus) {
		return findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId, govAgencyCode,
			serviceCode, dossierTemplateNo, dossierStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus, int start, int end) {
		return findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId, govAgencyCode,
			serviceCode, dossierTemplateNo, dossierStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus, int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId, govAgencyCode,
			serviceCode, dossierTemplateNo, dossierStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossiers
	 */
	@Override
	public List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus, int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_C_GAC_SC_DTNO_NOTDS;
		finderArgs = new Object[] {
				groupId, companyId, govAgencyCode, serviceCode,
				dossierTemplateNo, dossierStatus,
				
				start, end, orderByComparator
			};

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossier vrDossier : list) {
					if ((groupId != vrDossier.getGroupId()) ||
							(companyId != vrDossier.getCompanyId()) ||
							!Objects.equals(govAgencyCode,
								vrDossier.getGovAgencyCode()) ||
							!Objects.equals(serviceCode,
								vrDossier.getServiceCode()) ||
							!Objects.equals(dossierTemplateNo,
								vrDossier.getDossierTemplateNo()) ||
							Objects.equals(dossierStatus,
								vrDossier.getDossierStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(8 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(8);
			}

			query.append(_SQL_SELECT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GROUPID_2);

			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_COMPANYID_2);

			boolean bindGovAgencyCode = false;

			if (govAgencyCode == null) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_1);
			}
			else if (govAgencyCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_3);
			}
			else {
				bindGovAgencyCode = true;

				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_2);
			}

			boolean bindDossierTemplateNo = false;

			if (dossierTemplateNo == null) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_1);
			}
			else if (dossierTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_3);
			}
			else {
				bindDossierTemplateNo = true;

				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_2);
			}

			boolean bindDossierStatus = false;

			if (dossierStatus == null) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_1);
			}
			else if (dossierStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_3);
			}
			else {
				bindDossierStatus = true;

				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(companyId);

				if (bindGovAgencyCode) {
					qPos.add(govAgencyCode);
				}

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindDossierTemplateNo) {
					qPos.add(dossierTemplateNo);
				}

				if (bindDossierStatus) {
					qPos.add(dossierStatus);
				}

				if (!pagination) {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_C_GAC_SC_DTNO_NOTDS_First(long groupId,
		long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_C_GAC_SC_DTNO_NOTDS_First(groupId,
				companyId, govAgencyCode, serviceCode, dossierTemplateNo,
				dossierStatus, orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(", govAgencyCode=");
		msg.append(govAgencyCode);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(", dossierTemplateNo=");
		msg.append(dossierTemplateNo);

		msg.append(", dossierStatus=");
		msg.append(dossierStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the first vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_C_GAC_SC_DTNO_NOTDS_First(long groupId,
		long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator) {
		List<VRDossier> list = findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId,
				govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier
	 * @throws NoSuchVRDossierException if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier findByG_C_GAC_SC_DTNO_NOTDS_Last(long groupId,
		long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByG_C_GAC_SC_DTNO_NOTDS_Last(groupId,
				companyId, govAgencyCode, serviceCode, dossierTemplateNo,
				dossierStatus, orderByComparator);

		if (vrDossier != null) {
			return vrDossier;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(", govAgencyCode=");
		msg.append(govAgencyCode);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(", dossierTemplateNo=");
		msg.append(dossierTemplateNo);

		msg.append(", dossierStatus=");
		msg.append(dossierStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierException(msg.toString());
	}

	/**
	 * Returns the last vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	 */
	@Override
	public VRDossier fetchByG_C_GAC_SC_DTNO_NOTDS_Last(long groupId,
		long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator) {
		int count = countByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId,
				govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus);

		if (count == 0) {
			return null;
		}

		List<VRDossier> list = findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId,
				govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * @param dossierId the primary key of the current vr dossier
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier[] findByG_C_GAC_SC_DTNO_NOTDS_PrevAndNext(long dossierId,
		long groupId, long companyId, String govAgencyCode, String serviceCode,
		String dossierTemplateNo, String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = findByPrimaryKey(dossierId);

		Session session = null;

		try {
			session = openSession();

			VRDossier[] array = new VRDossierImpl[3];

			array[0] = getByG_C_GAC_SC_DTNO_NOTDS_PrevAndNext(session,
					vrDossier, groupId, companyId, govAgencyCode, serviceCode,
					dossierTemplateNo, dossierStatus, orderByComparator, true);

			array[1] = vrDossier;

			array[2] = getByG_C_GAC_SC_DTNO_NOTDS_PrevAndNext(session,
					vrDossier, groupId, companyId, govAgencyCode, serviceCode,
					dossierTemplateNo, dossierStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossier getByG_C_GAC_SC_DTNO_NOTDS_PrevAndNext(
		Session session, VRDossier vrDossier, long groupId, long companyId,
		String govAgencyCode, String serviceCode, String dossierTemplateNo,
		String dossierStatus, OrderByComparator<VRDossier> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(9 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(8);
		}

		query.append(_SQL_SELECT_VRDOSSIER_WHERE);

		query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GROUPID_2);

		query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_COMPANYID_2);

		boolean bindGovAgencyCode = false;

		if (govAgencyCode == null) {
			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_1);
		}
		else if (govAgencyCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_3);
		}
		else {
			bindGovAgencyCode = true;

			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_2);
		}

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_2);
		}

		boolean bindDossierTemplateNo = false;

		if (dossierTemplateNo == null) {
			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_1);
		}
		else if (dossierTemplateNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_3);
		}
		else {
			bindDossierTemplateNo = true;

			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_2);
		}

		boolean bindDossierStatus = false;

		if (dossierStatus == null) {
			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_1);
		}
		else if (dossierStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_3);
		}
		else {
			bindDossierStatus = true;

			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_2);
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
			query.append(VRDossierModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(companyId);

		if (bindGovAgencyCode) {
			qPos.add(govAgencyCode);
		}

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (bindDossierTemplateNo) {
			qPos.add(dossierTemplateNo);
		}

		if (bindDossierStatus) {
			qPos.add(dossierStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossier);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossier> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 */
	@Override
	public void removeByG_C_GAC_SC_DTNO_NOTDS(long groupId, long companyId,
		String govAgencyCode, String serviceCode, String dossierTemplateNo,
		String dossierStatus) {
		for (VRDossier vrDossier : findByG_C_GAC_SC_DTNO_NOTDS(groupId,
				companyId, govAgencyCode, serviceCode, dossierTemplateNo,
				dossierStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param govAgencyCode the gov agency code
	 * @param serviceCode the service code
	 * @param dossierTemplateNo the dossier template no
	 * @param dossierStatus the dossier status
	 * @return the number of matching vr dossiers
	 */
	@Override
	public int countByG_C_GAC_SC_DTNO_NOTDS(long groupId, long companyId,
		String govAgencyCode, String serviceCode, String dossierTemplateNo,
		String dossierStatus) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_C_GAC_SC_DTNO_NOTDS;

		Object[] finderArgs = new Object[] {
				groupId, companyId, govAgencyCode, serviceCode,
				dossierTemplateNo, dossierStatus
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_VRDOSSIER_WHERE);

			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GROUPID_2);

			query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_COMPANYID_2);

			boolean bindGovAgencyCode = false;

			if (govAgencyCode == null) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_1);
			}
			else if (govAgencyCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_3);
			}
			else {
				bindGovAgencyCode = true;

				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_2);
			}

			boolean bindDossierTemplateNo = false;

			if (dossierTemplateNo == null) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_1);
			}
			else if (dossierTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_3);
			}
			else {
				bindDossierTemplateNo = true;

				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_2);
			}

			boolean bindDossierStatus = false;

			if (dossierStatus == null) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_1);
			}
			else if (dossierStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_3);
			}
			else {
				bindDossierStatus = true;

				query.append(_FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(companyId);

				if (bindGovAgencyCode) {
					qPos.add(govAgencyCode);
				}

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindDossierTemplateNo) {
					qPos.add(dossierTemplateNo);
				}

				if (bindDossierStatus) {
					qPos.add(dossierStatus);
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

	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GROUPID_2 = "vrDossier.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_COMPANYID_2 =
		"vrDossier.companyId = ? AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_1 =
		"vrDossier.govAgencyCode IS NULL AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_2 =
		"vrDossier.govAgencyCode = ? AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_GOVAGENCYCODE_3 =
		"(vrDossier.govAgencyCode IS NULL OR vrDossier.govAgencyCode = '') AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_1 =
		"vrDossier.serviceCode IS NULL AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_2 =
		"vrDossier.serviceCode = ? AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_SERVICECODE_3 =
		"(vrDossier.serviceCode IS NULL OR vrDossier.serviceCode = '') AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_1 =
		"vrDossier.dossierTemplateNo IS NULL AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_2 =
		"vrDossier.dossierTemplateNo = ? AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERTEMPLATENO_3 =
		"(vrDossier.dossierTemplateNo IS NULL OR vrDossier.dossierTemplateNo = '') AND ";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_1 =
		"vrDossier.dossierStatus IS NOT NULL";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_2 =
		"vrDossier.dossierStatus != ?";
	private static final String _FINDER_COLUMN_G_C_GAC_SC_DTNO_NOTDS_DOSSIERSTATUS_3 =
		"(vrDossier.dossierStatus IS NULL OR vrDossier.dossierStatus != '')";

	public VRDossierPersistenceImpl() {
		setModelClass(VRDossier.class);
	}

	/**
	 * Caches the vr dossier in the entity cache if it is enabled.
	 *
	 * @param vrDossier the vr dossier
	 */
	@Override
	public void cacheResult(VRDossier vrDossier) {
		entityCache.putResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierImpl.class, vrDossier.getPrimaryKey(), vrDossier);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { vrDossier.getUuid(), vrDossier.getGroupId() },
			vrDossier);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_REF,
			new Object[] { vrDossier.getGroupId(), vrDossier.getReferenceUid() },
			vrDossier);

		vrDossier.resetOriginalValues();
	}

	/**
	 * Caches the vr dossiers in the entity cache if it is enabled.
	 *
	 * @param vrDossiers the vr dossiers
	 */
	@Override
	public void cacheResult(List<VRDossier> vrDossiers) {
		for (VRDossier vrDossier : vrDossiers) {
			if (entityCache.getResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
						VRDossierImpl.class, vrDossier.getPrimaryKey()) == null) {
				cacheResult(vrDossier);
			}
			else {
				vrDossier.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr dossiers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRDossierImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr dossier.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRDossier vrDossier) {
		entityCache.removeResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierImpl.class, vrDossier.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRDossierModelImpl)vrDossier, true);
	}

	@Override
	public void clearCache(List<VRDossier> vrDossiers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRDossier vrDossier : vrDossiers) {
			entityCache.removeResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
				VRDossierImpl.class, vrDossier.getPrimaryKey());

			clearUniqueFindersCache((VRDossierModelImpl)vrDossier, true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRDossierModelImpl vrDossierModelImpl) {
		Object[] args = new Object[] {
				vrDossierModelImpl.getUuid(), vrDossierModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			vrDossierModelImpl, false);

		args = new Object[] {
				vrDossierModelImpl.getGroupId(),
				vrDossierModelImpl.getReferenceUid()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_G_REF, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_G_REF, args,
			vrDossierModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRDossierModelImpl vrDossierModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrDossierModelImpl.getUuid(),
					vrDossierModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((vrDossierModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierModelImpl.getOriginalUuid(),
					vrDossierModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrDossierModelImpl.getGroupId(),
					vrDossierModelImpl.getReferenceUid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_REF, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_REF, args);
		}

		if ((vrDossierModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_REF.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierModelImpl.getOriginalGroupId(),
					vrDossierModelImpl.getOriginalReferenceUid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_REF, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_REF, args);
		}
	}

	/**
	 * Creates a new vr dossier with the primary key. Does not add the vr dossier to the database.
	 *
	 * @param dossierId the primary key for the new vr dossier
	 * @return the new vr dossier
	 */
	@Override
	public VRDossier create(long dossierId) {
		VRDossier vrDossier = new VRDossierImpl();

		vrDossier.setNew(true);
		vrDossier.setPrimaryKey(dossierId);

		String uuid = PortalUUIDUtil.generate();

		vrDossier.setUuid(uuid);

		vrDossier.setCompanyId(companyProvider.getCompanyId());

		return vrDossier;
	}

	/**
	 * Removes the vr dossier with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierId the primary key of the vr dossier
	 * @return the vr dossier that was removed
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier remove(long dossierId) throws NoSuchVRDossierException {
		return remove((Serializable)dossierId);
	}

	/**
	 * Removes the vr dossier with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr dossier
	 * @return the vr dossier that was removed
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier remove(Serializable primaryKey)
		throws NoSuchVRDossierException {
		Session session = null;

		try {
			session = openSession();

			VRDossier vrDossier = (VRDossier)session.get(VRDossierImpl.class,
					primaryKey);

			if (vrDossier == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRDossierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrDossier);
		}
		catch (NoSuchVRDossierException nsee) {
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
	protected VRDossier removeImpl(VRDossier vrDossier) {
		vrDossier = toUnwrappedModel(vrDossier);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrDossier)) {
				vrDossier = (VRDossier)session.get(VRDossierImpl.class,
						vrDossier.getPrimaryKeyObj());
			}

			if (vrDossier != null) {
				session.delete(vrDossier);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrDossier != null) {
			clearCache(vrDossier);
		}

		return vrDossier;
	}

	@Override
	public VRDossier updateImpl(VRDossier vrDossier) {
		vrDossier = toUnwrappedModel(vrDossier);

		boolean isNew = vrDossier.isNew();

		VRDossierModelImpl vrDossierModelImpl = (VRDossierModelImpl)vrDossier;

		if (Validator.isNull(vrDossier.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			vrDossier.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (vrDossier.getCreateDate() == null)) {
			if (serviceContext == null) {
				vrDossier.setCreateDate(now);
			}
			else {
				vrDossier.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!vrDossierModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				vrDossier.setModifiedDate(now);
			}
			else {
				vrDossier.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (vrDossier.isNew()) {
				session.save(vrDossier);

				vrDossier.setNew(false);
			}
			else {
				vrDossier = (VRDossier)session.merge(vrDossier);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRDossierModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrDossierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { vrDossierModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((vrDossierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierModelImpl.getOriginalUuid(),
						vrDossierModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						vrDossierModelImpl.getUuid(),
						vrDossierModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((vrDossierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_UID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierModelImpl.getOriginalGroupId(),
						vrDossierModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_UID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_UID,
					args);

				args = new Object[] {
						vrDossierModelImpl.getGroupId(),
						vrDossierModelImpl.getUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_UID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_UID,
					args);
			}

			if ((vrDossierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_SC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierModelImpl.getOriginalGroupId(),
						vrDossierModelImpl.getOriginalServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_SC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_SC,
					args);

				args = new Object[] {
						vrDossierModelImpl.getGroupId(),
						vrDossierModelImpl.getServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_SC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_SC,
					args);
			}

			if ((vrDossierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GAC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierModelImpl.getOriginalGroupId(),
						vrDossierModelImpl.getOriginalServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_GAC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GAC,
					args);

				args = new Object[] {
						vrDossierModelImpl.getGroupId(),
						vrDossierModelImpl.getServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_GAC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GAC,
					args);
			}

			if ((vrDossierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierModelImpl.getOriginalGroupId(),
						vrDossierModelImpl.getOriginalDossierTemplateNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_DTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DTN,
					args);

				args = new Object[] {
						vrDossierModelImpl.getGroupId(),
						vrDossierModelImpl.getDossierTemplateNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_DTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DTN,
					args);
			}

			if ((vrDossierModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierModelImpl.getOriginalGroupId(),
						vrDossierModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_DID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DID,
					args);

				args = new Object[] {
						vrDossierModelImpl.getGroupId(),
						vrDossierModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_DID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DID,
					args);
			}
		}

		entityCache.putResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierImpl.class, vrDossier.getPrimaryKey(), vrDossier, false);

		clearUniqueFindersCache(vrDossierModelImpl, false);
		cacheUniqueFindersCache(vrDossierModelImpl);

		vrDossier.resetOriginalValues();

		return vrDossier;
	}

	protected VRDossier toUnwrappedModel(VRDossier vrDossier) {
		if (vrDossier instanceof VRDossierImpl) {
			return vrDossier;
		}

		VRDossierImpl vrDossierImpl = new VRDossierImpl();

		vrDossierImpl.setNew(vrDossier.isNew());
		vrDossierImpl.setPrimaryKey(vrDossier.getPrimaryKey());

		vrDossierImpl.setUuid(vrDossier.getUuid());
		vrDossierImpl.setDossierId(vrDossier.getDossierId());
		vrDossierImpl.setGroupId(vrDossier.getGroupId());
		vrDossierImpl.setCompanyId(vrDossier.getCompanyId());
		vrDossierImpl.setUserId(vrDossier.getUserId());
		vrDossierImpl.setUserName(vrDossier.getUserName());
		vrDossierImpl.setCreateDate(vrDossier.getCreateDate());
		vrDossierImpl.setModifiedDate(vrDossier.getModifiedDate());
		vrDossierImpl.setReferenceUid(vrDossier.getReferenceUid());
		vrDossierImpl.setCounter(vrDossier.getCounter());
		vrDossierImpl.setServiceCode(vrDossier.getServiceCode());
		vrDossierImpl.setServiceName(vrDossier.getServiceName());
		vrDossierImpl.setGovAgencyCode(vrDossier.getGovAgencyCode());
		vrDossierImpl.setGovAgencyName(vrDossier.getGovAgencyName());
		vrDossierImpl.setApplicantName(vrDossier.getApplicantName());
		vrDossierImpl.setApplicantIdType(vrDossier.getApplicantIdType());
		vrDossierImpl.setApplicantIdNo(vrDossier.getApplicantIdNo());
		vrDossierImpl.setApplicantIdDate(vrDossier.getApplicantIdDate());
		vrDossierImpl.setAddress(vrDossier.getAddress());
		vrDossierImpl.setCityCode(vrDossier.getCityCode());
		vrDossierImpl.setCityName(vrDossier.getCityName());
		vrDossierImpl.setDistrictCode(vrDossier.getDistrictCode());
		vrDossierImpl.setDistrictName(vrDossier.getDistrictName());
		vrDossierImpl.setWardCode(vrDossier.getWardCode());
		vrDossierImpl.setWardName(vrDossier.getWardName());
		vrDossierImpl.setContactName(vrDossier.getContactName());
		vrDossierImpl.setContactTelNo(vrDossier.getContactTelNo());
		vrDossierImpl.setContactEmail(vrDossier.getContactEmail());
		vrDossierImpl.setDossierTemplateNo(vrDossier.getDossierTemplateNo());
		vrDossierImpl.setDossierTemplateName(vrDossier.getDossierTemplateName());
		vrDossierImpl.setDossierNote(vrDossier.getDossierNote());
		vrDossierImpl.setSubmissionNote(vrDossier.getSubmissionNote());
		vrDossierImpl.setApplicantNote(vrDossier.getApplicantNote());
		vrDossierImpl.setBriefNote(vrDossier.getBriefNote());
		vrDossierImpl.setDossierNo(vrDossier.getDossierNo());
		vrDossierImpl.setSubmitting(vrDossier.isSubmitting());
		vrDossierImpl.setSubmitDate(vrDossier.getSubmitDate());
		vrDossierImpl.setReceiveDate(vrDossier.getReceiveDate());
		vrDossierImpl.setDueDate(vrDossier.getDueDate());
		vrDossierImpl.setReleaseDate(vrDossier.getReleaseDate());
		vrDossierImpl.setFinishDate(vrDossier.getFinishDate());
		vrDossierImpl.setCancellingDate(vrDossier.getCancellingDate());
		vrDossierImpl.setCorrecttingDate(vrDossier.getCorrecttingDate());
		vrDossierImpl.setDossierStatus(vrDossier.getDossierStatus());
		vrDossierImpl.setDossierStatusText(vrDossier.getDossierStatusText());
		vrDossierImpl.setDossierSubStatus(vrDossier.getDossierSubStatus());
		vrDossierImpl.setDossierSubStatusText(vrDossier.getDossierSubStatusText());
		vrDossierImpl.setFolderId(vrDossier.getFolderId());
		vrDossierImpl.setDossierActionId(vrDossier.getDossierActionId());
		vrDossierImpl.setViaPostal(vrDossier.getViaPostal());
		vrDossierImpl.setPostalAddress(vrDossier.getPostalAddress());
		vrDossierImpl.setPostalCityCode(vrDossier.getPostalCityCode());
		vrDossierImpl.setPostalCityName(vrDossier.getPostalCityName());
		vrDossierImpl.setPostalTelNo(vrDossier.getPostalTelNo());
		vrDossierImpl.setPassword(vrDossier.getPassword());
		vrDossierImpl.setNotification(vrDossier.isNotification());
		vrDossierImpl.setOnline(vrDossier.isOnline());
		vrDossierImpl.setServerNo(vrDossier.getServerNo());
		vrDossierImpl.setEndorsementDate(vrDossier.getEndorsementDate());
		vrDossierImpl.setLockState(vrDossier.getLockState());

		return vrDossierImpl;
	}

	/**
	 * Returns the vr dossier with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr dossier
	 * @return the vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRDossierException {
		VRDossier vrDossier = fetchByPrimaryKey(primaryKey);

		if (vrDossier == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRDossierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrDossier;
	}

	/**
	 * Returns the vr dossier with the primary key or throws a {@link NoSuchVRDossierException} if it could not be found.
	 *
	 * @param dossierId the primary key of the vr dossier
	 * @return the vr dossier
	 * @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier findByPrimaryKey(long dossierId)
		throws NoSuchVRDossierException {
		return findByPrimaryKey((Serializable)dossierId);
	}

	/**
	 * Returns the vr dossier with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr dossier
	 * @return the vr dossier, or <code>null</code> if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
				VRDossierImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRDossier vrDossier = (VRDossier)serializable;

		if (vrDossier == null) {
			Session session = null;

			try {
				session = openSession();

				vrDossier = (VRDossier)session.get(VRDossierImpl.class,
						primaryKey);

				if (vrDossier != null) {
					cacheResult(vrDossier);
				}
				else {
					entityCache.putResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
						VRDossierImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
					VRDossierImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrDossier;
	}

	/**
	 * Returns the vr dossier with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierId the primary key of the vr dossier
	 * @return the vr dossier, or <code>null</code> if a vr dossier with the primary key could not be found
	 */
	@Override
	public VRDossier fetchByPrimaryKey(long dossierId) {
		return fetchByPrimaryKey((Serializable)dossierId);
	}

	@Override
	public Map<Serializable, VRDossier> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRDossier> map = new HashMap<Serializable, VRDossier>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRDossier vrDossier = fetchByPrimaryKey(primaryKey);

			if (vrDossier != null) {
				map.put(primaryKey, vrDossier);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
					VRDossierImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRDossier)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRDOSSIER_WHERE_PKS_IN);

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

			for (VRDossier vrDossier : (List<VRDossier>)q.list()) {
				map.put(vrDossier.getPrimaryKeyObj(), vrDossier);

				cacheResult(vrDossier);

				uncachedPrimaryKeys.remove(vrDossier.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRDossierModelImpl.ENTITY_CACHE_ENABLED,
					VRDossierImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr dossiers.
	 *
	 * @return the vr dossiers
	 */
	@Override
	public List<VRDossier> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossiers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @return the range of vr dossiers
	 */
	@Override
	public List<VRDossier> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossiers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr dossiers
	 */
	@Override
	public List<VRDossier> findAll(int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossiers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr dossiers
	 * @param end the upper bound of the range of vr dossiers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr dossiers
	 */
	@Override
	public List<VRDossier> findAll(int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
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

		List<VRDossier> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossier>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRDOSSIER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRDOSSIER;

				if (pagination) {
					sql = sql.concat(VRDossierModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossier>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the vr dossiers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRDossier vrDossier : findAll()) {
			remove(vrDossier);
		}
	}

	/**
	 * Returns the number of vr dossiers.
	 *
	 * @return the number of vr dossiers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRDOSSIER);

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
		return VRDossierModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr dossier persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRDossierImpl.class.getName());
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
	private static final String _SQL_SELECT_VRDOSSIER = "SELECT vrDossier FROM VRDossier vrDossier";
	private static final String _SQL_SELECT_VRDOSSIER_WHERE_PKS_IN = "SELECT vrDossier FROM VRDossier vrDossier WHERE dossierId IN (";
	private static final String _SQL_SELECT_VRDOSSIER_WHERE = "SELECT vrDossier FROM VRDossier vrDossier WHERE ";
	private static final String _SQL_COUNT_VRDOSSIER = "SELECT COUNT(vrDossier) FROM VRDossier vrDossier";
	private static final String _SQL_COUNT_VRDOSSIER_WHERE = "SELECT COUNT(vrDossier) FROM VRDossier vrDossier WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrDossier.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRDossier exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRDossier exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRDossierPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "password", "online"
			});
}