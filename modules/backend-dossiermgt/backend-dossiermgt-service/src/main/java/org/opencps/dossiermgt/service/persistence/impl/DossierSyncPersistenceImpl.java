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

package org.opencps.dossiermgt.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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

import org.opencps.dossiermgt.exception.NoSuchDossierSyncException;
import org.opencps.dossiermgt.model.DossierSync;
import org.opencps.dossiermgt.model.impl.DossierSyncImpl;
import org.opencps.dossiermgt.model.impl.DossierSyncModelImpl;
import org.opencps.dossiermgt.service.persistence.DossierSyncPersistence;

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
 * The persistence implementation for the dossier sync service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DossierSyncPersistence
 * @see org.opencps.dossiermgt.service.persistence.DossierSyncUtil
 * @generated
 */
@ProviderType
public class DossierSyncPersistenceImpl extends BasePersistenceImpl<DossierSync>
	implements DossierSyncPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierSyncUtil} to access the dossier sync persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierSyncImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			DossierSyncModelImpl.UUID_COLUMN_BITMASK |
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dossier syncs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier syncs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByUuid(String uuid, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByUuid(String uuid, int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
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

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierSync dossierSync : list) {
					if (!Objects.equals(uuid, dossierSync.getUuid())) {
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

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

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
				query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier sync in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByUuid_First(String uuid,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByUuid_First(uuid, orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the first dossier sync in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByUuid_First(String uuid,
		OrderByComparator<DossierSync> orderByComparator) {
		List<DossierSync> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier sync in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByUuid_Last(String uuid,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByUuid_Last(uuid, orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the last dossier sync in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByUuid_Last(String uuid,
		OrderByComparator<DossierSync> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DossierSync> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier syncs before and after the current dossier sync in the ordered set where uuid = &#63;.
	 *
	 * @param dossierSyncId the primary key of the current dossier sync
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync[] findByUuid_PrevAndNext(long dossierSyncId,
		String uuid, OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByPrimaryKey(dossierSyncId);

		Session session = null;

		try {
			session = openSession();

			DossierSync[] array = new DossierSyncImpl[3];

			array[0] = getByUuid_PrevAndNext(session, dossierSync, uuid,
					orderByComparator, true);

			array[1] = dossierSync;

			array[2] = getByUuid_PrevAndNext(session, dossierSync, uuid,
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

	protected DossierSync getByUuid_PrevAndNext(Session session,
		DossierSync dossierSync, String uuid,
		OrderByComparator<DossierSync> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

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
			query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dossierSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier syncs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DossierSync dossierSync : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "dossierSync.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "dossierSync.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(dossierSync.uuid IS NULL OR dossierSync.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			DossierSyncModelImpl.UUID_COLUMN_BITMASK |
			DossierSyncModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the dossier sync where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDossierSyncException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByUUID_G(String uuid, long groupId)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByUUID_G(uuid, groupId);

		if (dossierSync == null) {
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

			throw new NoSuchDossierSyncException(msg.toString());
		}

		return dossierSync;
	}

	/**
	 * Returns the dossier sync where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the dossier sync where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof DossierSync) {
			DossierSync dossierSync = (DossierSync)result;

			if (!Objects.equals(uuid, dossierSync.getUuid()) ||
					(groupId != dossierSync.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

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

				List<DossierSync> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					DossierSync dossierSync = list.get(0);

					result = dossierSync;

					cacheResult(dossierSync);

					if ((dossierSync.getUuid() == null) ||
							!dossierSync.getUuid().equals(uuid) ||
							(dossierSync.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, dossierSync);
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
			return (DossierSync)result;
		}
	}

	/**
	 * Removes the dossier sync where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dossier sync that was removed
	 */
	@Override
	public DossierSync removeByUUID_G(String uuid, long groupId)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByUUID_G(uuid, groupId);

		return remove(dossierSync);
	}

	/**
	 * Returns the number of dossier syncs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "dossierSync.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "dossierSync.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(dossierSync.uuid IS NULL OR dossierSync.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "dossierSync.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			DossierSyncModelImpl.UUID_COLUMN_BITMASK |
			DossierSyncModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dossier syncs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier syncs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<DossierSync> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<DossierSync> orderByComparator,
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

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierSync dossierSync : list) {
					if (!Objects.equals(uuid, dossierSync.getUuid()) ||
							(companyId != dossierSync.getCompanyId())) {
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

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

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
				query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the first dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<DossierSync> orderByComparator) {
		List<DossierSync> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the last dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<DossierSync> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DossierSync> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier syncs before and after the current dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dossierSyncId the primary key of the current dossier sync
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync[] findByUuid_C_PrevAndNext(long dossierSyncId,
		String uuid, long companyId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByPrimaryKey(dossierSyncId);

		Session session = null;

		try {
			session = openSession();

			DossierSync[] array = new DossierSyncImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, dossierSync, uuid,
					companyId, orderByComparator, true);

			array[1] = dossierSync;

			array[2] = getByUuid_C_PrevAndNext(session, dossierSync, uuid,
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

	protected DossierSync getByUuid_C_PrevAndNext(Session session,
		DossierSync dossierSync, String uuid, long companyId,
		OrderByComparator<DossierSync> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

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
			query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dossierSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier syncs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DossierSync dossierSync : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "dossierSync.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "dossierSync.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(dossierSync.uuid IS NULL OR dossierSync.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "dossierSync.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_D_M_CPK_FR = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByF_D_M_CPK_FR",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName()
			},
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK |
			DossierSyncModelImpl.CLASSPK_COLUMN_BITMASK |
			DossierSyncModelImpl.FILEREFERENCEUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_D_M_CPK_FR = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_D_M_CPK_FR",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName()
			});

	/**
	 * Returns the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; or throws a {@link NoSuchDossierSyncException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param method the method
	 * @param classPK the class pk
	 * @param fileReferenceUid the file reference uid
	 * @return the matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, String fileReferenceUid)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByF_D_M_CPK_FR(dossierId, method,
				classPK, fileReferenceUid);

		if (dossierSync == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", method=");
			msg.append(method);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(", fileReferenceUid=");
			msg.append(fileReferenceUid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchDossierSyncException(msg.toString());
		}

		return dossierSync;
	}

	/**
	 * Returns the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param method the method
	 * @param classPK the class pk
	 * @param fileReferenceUid the file reference uid
	 * @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, String fileReferenceUid) {
		return fetchByF_D_M_CPK_FR(dossierId, method, classPK,
			fileReferenceUid, true);
	}

	/**
	 * Returns the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param method the method
	 * @param classPK the class pk
	 * @param fileReferenceUid the file reference uid
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, String fileReferenceUid, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] {
				dossierId, method, classPK, fileReferenceUid
			};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_D_M_CPK_FR,
					finderArgs, this);
		}

		if (result instanceof DossierSync) {
			DossierSync dossierSync = (DossierSync)result;

			if ((dossierId != dossierSync.getDossierId()) ||
					(method != dossierSync.getMethod()) ||
					(classPK != dossierSync.getClassPK()) ||
					!Objects.equals(fileReferenceUid,
						dossierSync.getFileReferenceUid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_F_D_M_CPK_FR_DOSSIERID_2);

			query.append(_FINDER_COLUMN_F_D_M_CPK_FR_METHOD_2);

			query.append(_FINDER_COLUMN_F_D_M_CPK_FR_CLASSPK_2);

			boolean bindFileReferenceUid = false;

			if (fileReferenceUid == null) {
				query.append(_FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_1);
			}
			else if (fileReferenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_3);
			}
			else {
				bindFileReferenceUid = true;

				query.append(_FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(method);

				qPos.add(classPK);

				if (bindFileReferenceUid) {
					qPos.add(fileReferenceUid);
				}

				List<DossierSync> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_D_M_CPK_FR,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"DossierSyncPersistenceImpl.fetchByF_D_M_CPK_FR(long, int, long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DossierSync dossierSync = list.get(0);

					result = dossierSync;

					cacheResult(dossierSync);

					if ((dossierSync.getDossierId() != dossierId) ||
							(dossierSync.getMethod() != method) ||
							(dossierSync.getClassPK() != classPK) ||
							(dossierSync.getFileReferenceUid() == null) ||
							!dossierSync.getFileReferenceUid()
											.equals(fileReferenceUid)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_D_M_CPK_FR,
							finderArgs, dossierSync);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_D_M_CPK_FR,
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
			return (DossierSync)result;
		}
	}

	/**
	 * Removes the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param method the method
	 * @param classPK the class pk
	 * @param fileReferenceUid the file reference uid
	 * @return the dossier sync that was removed
	 */
	@Override
	public DossierSync removeByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, String fileReferenceUid)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByF_D_M_CPK_FR(dossierId, method,
				classPK, fileReferenceUid);

		return remove(dossierSync);
	}

	/**
	 * Returns the number of dossier syncs where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param method the method
	 * @param classPK the class pk
	 * @param fileReferenceUid the file reference uid
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countByF_D_M_CPK_FR(long dossierId, int method, long classPK,
		String fileReferenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_D_M_CPK_FR;

		Object[] finderArgs = new Object[] {
				dossierId, method, classPK, fileReferenceUid
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_F_D_M_CPK_FR_DOSSIERID_2);

			query.append(_FINDER_COLUMN_F_D_M_CPK_FR_METHOD_2);

			query.append(_FINDER_COLUMN_F_D_M_CPK_FR_CLASSPK_2);

			boolean bindFileReferenceUid = false;

			if (fileReferenceUid == null) {
				query.append(_FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_1);
			}
			else if (fileReferenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_3);
			}
			else {
				bindFileReferenceUid = true;

				query.append(_FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(method);

				qPos.add(classPK);

				if (bindFileReferenceUid) {
					qPos.add(fileReferenceUid);
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

	private static final String _FINDER_COLUMN_F_D_M_CPK_FR_DOSSIERID_2 = "dossierSync.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_F_D_M_CPK_FR_METHOD_2 = "dossierSync.method = ? AND ";
	private static final String _FINDER_COLUMN_F_D_M_CPK_FR_CLASSPK_2 = "dossierSync.classPK = ? AND ";
	private static final String _FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_1 = "dossierSync.fileReferenceUid IS NULL";
	private static final String _FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_2 = "dossierSync.fileReferenceUid = ?";
	private static final String _FINDER_COLUMN_F_D_M_CPK_FR_FILEREFERENCEUID_3 = "(dossierSync.fileReferenceUid IS NULL OR dossierSync.fileReferenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_ID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_ID",
			new String[] { Long.class.getName() },
			DossierSyncModelImpl.GROUPID_COLUMN_BITMASK |
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_ID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dossier syncs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID(long groupId) {
		return findByG_ID(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier syncs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID(long groupId, int start, int end) {
		return findByG_ID(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID(long groupId, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return findByG_ID(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID(long groupId, int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_ID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierSync dossierSync : list) {
					if ((groupId != dossierSync.getGroupId())) {
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

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_G_ID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier sync in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByG_ID_First(long groupId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByG_ID_First(groupId, orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the first dossier sync in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByG_ID_First(long groupId,
		OrderByComparator<DossierSync> orderByComparator) {
		List<DossierSync> list = findByG_ID(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier sync in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByG_ID_Last(long groupId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByG_ID_Last(groupId, orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the last dossier sync in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByG_ID_Last(long groupId,
		OrderByComparator<DossierSync> orderByComparator) {
		int count = countByG_ID(groupId);

		if (count == 0) {
			return null;
		}

		List<DossierSync> list = findByG_ID(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier syncs before and after the current dossier sync in the ordered set where groupId = &#63;.
	 *
	 * @param dossierSyncId the primary key of the current dossier sync
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync[] findByG_ID_PrevAndNext(long dossierSyncId,
		long groupId, OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByPrimaryKey(dossierSyncId);

		Session session = null;

		try {
			session = openSession();

			DossierSync[] array = new DossierSyncImpl[3];

			array[0] = getByG_ID_PrevAndNext(session, dossierSync, groupId,
					orderByComparator, true);

			array[1] = dossierSync;

			array[2] = getByG_ID_PrevAndNext(session, dossierSync, groupId,
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

	protected DossierSync getByG_ID_PrevAndNext(Session session,
		DossierSync dossierSync, long groupId,
		OrderByComparator<DossierSync> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

		query.append(_FINDER_COLUMN_G_ID_GROUPID_2);

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
			query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier syncs where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByG_ID(long groupId) {
		for (DossierSync dossierSync : findByG_ID(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countByG_ID(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_ID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_G_ID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_G_ID_GROUPID_2 = "dossierSync.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_ID_DID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_ID_DID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DID =
		new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_ID_DID",
			new String[] { Long.class.getName(), Long.class.getName() },
			DossierSyncModelImpl.GROUPID_COLUMN_BITMASK |
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_ID_DID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_ID_DID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @return the matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID_DID(long groupId, long dossierId) {
		return findByG_ID_DID(groupId, dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID_DID(long groupId, long dossierId,
		int start, int end) {
		return findByG_ID_DID(groupId, dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID_DID(long groupId, long dossierId,
		int start, int end, OrderByComparator<DossierSync> orderByComparator) {
		return findByG_ID_DID(groupId, dossierId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID_DID(long groupId, long dossierId,
		int start, int end, OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DID;
			finderArgs = new Object[] { groupId, dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_ID_DID;
			finderArgs = new Object[] {
					groupId, dossierId,
					
					start, end, orderByComparator
				};
		}

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierSync dossierSync : list) {
					if ((groupId != dossierSync.getGroupId()) ||
							(dossierId != dossierSync.getDossierId())) {
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

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_G_ID_DID_GROUPID_2);

			query.append(_FINDER_COLUMN_G_ID_DID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByG_ID_DID_First(long groupId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByG_ID_DID_First(groupId, dossierId,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the first dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByG_ID_DID_First(long groupId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator) {
		List<DossierSync> list = findByG_ID_DID(groupId, dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByG_ID_DID_Last(long groupId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByG_ID_DID_Last(groupId, dossierId,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the last dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByG_ID_DID_Last(long groupId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator) {
		int count = countByG_ID_DID(groupId, dossierId);

		if (count == 0) {
			return null;
		}

		List<DossierSync> list = findByG_ID_DID(groupId, dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier syncs before and after the current dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param dossierSyncId the primary key of the current dossier sync
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync[] findByG_ID_DID_PrevAndNext(long dossierSyncId,
		long groupId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByPrimaryKey(dossierSyncId);

		Session session = null;

		try {
			session = openSession();

			DossierSync[] array = new DossierSyncImpl[3];

			array[0] = getByG_ID_DID_PrevAndNext(session, dossierSync, groupId,
					dossierId, orderByComparator, true);

			array[1] = dossierSync;

			array[2] = getByG_ID_DID_PrevAndNext(session, dossierSync, groupId,
					dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierSync getByG_ID_DID_PrevAndNext(Session session,
		DossierSync dossierSync, long groupId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

		query.append(_FINDER_COLUMN_G_ID_DID_GROUPID_2);

		query.append(_FINDER_COLUMN_G_ID_DID_DOSSIERID_2);

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
			query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier syncs where groupId = &#63; and dossierId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeByG_ID_DID(long groupId, long dossierId) {
		for (DossierSync dossierSync : findByG_ID_DID(groupId, dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs where groupId = &#63; and dossierId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierId the dossier ID
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countByG_ID_DID(long groupId, long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_ID_DID;

		Object[] finderArgs = new Object[] { groupId, dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_G_ID_DID_GROUPID_2);

			query.append(_FINDER_COLUMN_G_ID_DID_DOSSIERID_2);

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

	private static final String _FINDER_COLUMN_G_ID_DID_GROUPID_2 = "dossierSync.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_ID_DID_DOSSIERID_2 = "dossierSync.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_ID_DRF = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_ID_DRF",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DRF =
		new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_ID_DRF",
			new String[] { Long.class.getName(), String.class.getName() },
			DossierSyncModelImpl.GROUPID_COLUMN_BITMASK |
			DossierSyncModelImpl.DOSSIERREFERENCEUID_COLUMN_BITMASK |
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_ID_DRF = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_ID_DRF",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @return the matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID_DRF(long groupId,
		String dossierReferenceUid) {
		return findByG_ID_DRF(groupId, dossierReferenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID_DRF(long groupId,
		String dossierReferenceUid, int start, int end) {
		return findByG_ID_DRF(groupId, dossierReferenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID_DRF(long groupId,
		String dossierReferenceUid, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return findByG_ID_DRF(groupId, dossierReferenceUid, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByG_ID_DRF(long groupId,
		String dossierReferenceUid, int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DRF;
			finderArgs = new Object[] { groupId, dossierReferenceUid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_ID_DRF;
			finderArgs = new Object[] {
					groupId, dossierReferenceUid,
					
					start, end, orderByComparator
				};
		}

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierSync dossierSync : list) {
					if ((groupId != dossierSync.getGroupId()) ||
							!Objects.equals(dossierReferenceUid,
								dossierSync.getDossierReferenceUid())) {
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

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_G_ID_DRF_GROUPID_2);

			boolean bindDossierReferenceUid = false;

			if (dossierReferenceUid == null) {
				query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_1);
			}
			else if (dossierReferenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_3);
			}
			else {
				bindDossierReferenceUid = true;

				query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDossierReferenceUid) {
					qPos.add(dossierReferenceUid);
				}

				if (!pagination) {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByG_ID_DRF_First(long groupId,
		String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByG_ID_DRF_First(groupId,
				dossierReferenceUid, orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dossierReferenceUid=");
		msg.append(dossierReferenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the first dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByG_ID_DRF_First(long groupId,
		String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator) {
		List<DossierSync> list = findByG_ID_DRF(groupId, dossierReferenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByG_ID_DRF_Last(long groupId,
		String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByG_ID_DRF_Last(groupId,
				dossierReferenceUid, orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", dossierReferenceUid=");
		msg.append(dossierReferenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the last dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByG_ID_DRF_Last(long groupId,
		String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator) {
		int count = countByG_ID_DRF(groupId, dossierReferenceUid);

		if (count == 0) {
			return null;
		}

		List<DossierSync> list = findByG_ID_DRF(groupId, dossierReferenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier syncs before and after the current dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * @param dossierSyncId the primary key of the current dossier sync
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync[] findByG_ID_DRF_PrevAndNext(long dossierSyncId,
		long groupId, String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByPrimaryKey(dossierSyncId);

		Session session = null;

		try {
			session = openSession();

			DossierSync[] array = new DossierSyncImpl[3];

			array[0] = getByG_ID_DRF_PrevAndNext(session, dossierSync, groupId,
					dossierReferenceUid, orderByComparator, true);

			array[1] = dossierSync;

			array[2] = getByG_ID_DRF_PrevAndNext(session, dossierSync, groupId,
					dossierReferenceUid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierSync getByG_ID_DRF_PrevAndNext(Session session,
		DossierSync dossierSync, long groupId, String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

		query.append(_FINDER_COLUMN_G_ID_DRF_GROUPID_2);

		boolean bindDossierReferenceUid = false;

		if (dossierReferenceUid == null) {
			query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_1);
		}
		else if (dossierReferenceUid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_3);
		}
		else {
			bindDossierReferenceUid = true;

			query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_2);
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
			query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindDossierReferenceUid) {
			qPos.add(dossierReferenceUid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 */
	@Override
	public void removeByG_ID_DRF(long groupId, String dossierReferenceUid) {
		for (DossierSync dossierSync : findByG_ID_DRF(groupId,
				dossierReferenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param dossierReferenceUid the dossier reference uid
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countByG_ID_DRF(long groupId, String dossierReferenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_ID_DRF;

		Object[] finderArgs = new Object[] { groupId, dossierReferenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_G_ID_DRF_GROUPID_2);

			boolean bindDossierReferenceUid = false;

			if (dossierReferenceUid == null) {
				query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_1);
			}
			else if (dossierReferenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_3);
			}
			else {
				bindDossierReferenceUid = true;

				query.append(_FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDossierReferenceUid) {
					qPos.add(dossierReferenceUid);
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

	private static final String _FINDER_COLUMN_G_ID_DRF_GROUPID_2 = "dossierSync.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_1 = "dossierSync.dossierReferenceUid IS NULL";
	private static final String _FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_2 = "dossierSync.dossierReferenceUid = ?";
	private static final String _FINDER_COLUMN_G_ID_DRF_DOSSIERREFERENCEUID_3 = "(dossierSync.dossierReferenceUid IS NULL OR dossierSync.dossierReferenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SRV_NO = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySRV_NO",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO =
		new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySRV_NO",
			new String[] { String.class.getName() },
			DossierSyncModelImpl.SERVERNO_COLUMN_BITMASK |
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SRV_NO = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySRV_NO",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dossier syncs where serverNo = &#63;.
	 *
	 * @param serverNo the server no
	 * @return the matching dossier syncs
	 */
	@Override
	public List<DossierSync> findBySRV_NO(String serverNo) {
		return findBySRV_NO(serverNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier syncs where serverNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serverNo the server no
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findBySRV_NO(String serverNo, int start, int end) {
		return findBySRV_NO(serverNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where serverNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serverNo the server no
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findBySRV_NO(String serverNo, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return findBySRV_NO(serverNo, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where serverNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serverNo the server no
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findBySRV_NO(String serverNo, int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO;
			finderArgs = new Object[] { serverNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SRV_NO;
			finderArgs = new Object[] { serverNo, start, end, orderByComparator };
		}

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierSync dossierSync : list) {
					if (!Objects.equals(serverNo, dossierSync.getServerNo())) {
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

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

			boolean bindServerNo = false;

			if (serverNo == null) {
				query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_1);
			}
			else if (serverNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_3);
			}
			else {
				bindServerNo = true;

				query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServerNo) {
					qPos.add(serverNo);
				}

				if (!pagination) {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier sync in the ordered set where serverNo = &#63;.
	 *
	 * @param serverNo the server no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findBySRV_NO_First(String serverNo,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchBySRV_NO_First(serverNo,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serverNo=");
		msg.append(serverNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the first dossier sync in the ordered set where serverNo = &#63;.
	 *
	 * @param serverNo the server no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchBySRV_NO_First(String serverNo,
		OrderByComparator<DossierSync> orderByComparator) {
		List<DossierSync> list = findBySRV_NO(serverNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier sync in the ordered set where serverNo = &#63;.
	 *
	 * @param serverNo the server no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findBySRV_NO_Last(String serverNo,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchBySRV_NO_Last(serverNo, orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serverNo=");
		msg.append(serverNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the last dossier sync in the ordered set where serverNo = &#63;.
	 *
	 * @param serverNo the server no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchBySRV_NO_Last(String serverNo,
		OrderByComparator<DossierSync> orderByComparator) {
		int count = countBySRV_NO(serverNo);

		if (count == 0) {
			return null;
		}

		List<DossierSync> list = findBySRV_NO(serverNo, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier syncs before and after the current dossier sync in the ordered set where serverNo = &#63;.
	 *
	 * @param dossierSyncId the primary key of the current dossier sync
	 * @param serverNo the server no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync[] findBySRV_NO_PrevAndNext(long dossierSyncId,
		String serverNo, OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByPrimaryKey(dossierSyncId);

		Session session = null;

		try {
			session = openSession();

			DossierSync[] array = new DossierSyncImpl[3];

			array[0] = getBySRV_NO_PrevAndNext(session, dossierSync, serverNo,
					orderByComparator, true);

			array[1] = dossierSync;

			array[2] = getBySRV_NO_PrevAndNext(session, dossierSync, serverNo,
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

	protected DossierSync getBySRV_NO_PrevAndNext(Session session,
		DossierSync dossierSync, String serverNo,
		OrderByComparator<DossierSync> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

		boolean bindServerNo = false;

		if (serverNo == null) {
			query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_1);
		}
		else if (serverNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_3);
		}
		else {
			bindServerNo = true;

			query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_2);
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
			query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindServerNo) {
			qPos.add(serverNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier syncs where serverNo = &#63; from the database.
	 *
	 * @param serverNo the server no
	 */
	@Override
	public void removeBySRV_NO(String serverNo) {
		for (DossierSync dossierSync : findBySRV_NO(serverNo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs where serverNo = &#63;.
	 *
	 * @param serverNo the server no
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countBySRV_NO(String serverNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SRV_NO;

		Object[] finderArgs = new Object[] { serverNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

			boolean bindServerNo = false;

			if (serverNo == null) {
				query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_1);
			}
			else if (serverNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_3);
			}
			else {
				bindServerNo = true;

				query.append(_FINDER_COLUMN_SRV_NO_SERVERNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServerNo) {
					qPos.add(serverNo);
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

	private static final String _FINDER_COLUMN_SRV_NO_SERVERNO_1 = "dossierSync.serverNo IS NULL";
	private static final String _FINDER_COLUMN_SRV_NO_SERVERNO_2 = "dossierSync.serverNo = ?";
	private static final String _FINDER_COLUMN_SRV_NO_SERVERNO_3 = "(dossierSync.serverNo IS NULL OR dossierSync.serverNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SRV_NO_STATE =
		new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySRV_NO_STATE",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO_STATE =
		new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySRV_NO_STATE",
			new String[] { String.class.getName(), Integer.class.getName() },
			DossierSyncModelImpl.SERVERNO_COLUMN_BITMASK |
			DossierSyncModelImpl.STATE_COLUMN_BITMASK |
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SRV_NO_STATE = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySRV_NO_STATE",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dossier syncs where serverNo = &#63; and state = &#63;.
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @return the matching dossier syncs
	 */
	@Override
	public List<DossierSync> findBySRV_NO_STATE(String serverNo, int state) {
		return findBySRV_NO_STATE(serverNo, state, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier syncs where serverNo = &#63; and state = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findBySRV_NO_STATE(String serverNo, int state,
		int start, int end) {
		return findBySRV_NO_STATE(serverNo, state, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where serverNo = &#63; and state = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findBySRV_NO_STATE(String serverNo, int state,
		int start, int end, OrderByComparator<DossierSync> orderByComparator) {
		return findBySRV_NO_STATE(serverNo, state, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where serverNo = &#63; and state = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findBySRV_NO_STATE(String serverNo, int state,
		int start, int end, OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO_STATE;
			finderArgs = new Object[] { serverNo, state };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SRV_NO_STATE;
			finderArgs = new Object[] {
					serverNo, state,
					
					start, end, orderByComparator
				};
		}

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierSync dossierSync : list) {
					if (!Objects.equals(serverNo, dossierSync.getServerNo()) ||
							(state != dossierSync.getState())) {
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

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

			boolean bindServerNo = false;

			if (serverNo == null) {
				query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_1);
			}
			else if (serverNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_3);
			}
			else {
				bindServerNo = true;

				query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_2);
			}

			query.append(_FINDER_COLUMN_SRV_NO_STATE_STATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServerNo) {
					qPos.add(serverNo);
				}

				qPos.add(state);

				if (!pagination) {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findBySRV_NO_STATE_First(String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchBySRV_NO_STATE_First(serverNo, state,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serverNo=");
		msg.append(serverNo);

		msg.append(", state=");
		msg.append(state);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the first dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchBySRV_NO_STATE_First(String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator) {
		List<DossierSync> list = findBySRV_NO_STATE(serverNo, state, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findBySRV_NO_STATE_Last(String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchBySRV_NO_STATE_Last(serverNo, state,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serverNo=");
		msg.append(serverNo);

		msg.append(", state=");
		msg.append(state);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the last dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchBySRV_NO_STATE_Last(String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator) {
		int count = countBySRV_NO_STATE(serverNo, state);

		if (count == 0) {
			return null;
		}

		List<DossierSync> list = findBySRV_NO_STATE(serverNo, state, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier syncs before and after the current dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	 *
	 * @param dossierSyncId the primary key of the current dossier sync
	 * @param serverNo the server no
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync[] findBySRV_NO_STATE_PrevAndNext(long dossierSyncId,
		String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByPrimaryKey(dossierSyncId);

		Session session = null;

		try {
			session = openSession();

			DossierSync[] array = new DossierSyncImpl[3];

			array[0] = getBySRV_NO_STATE_PrevAndNext(session, dossierSync,
					serverNo, state, orderByComparator, true);

			array[1] = dossierSync;

			array[2] = getBySRV_NO_STATE_PrevAndNext(session, dossierSync,
					serverNo, state, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierSync getBySRV_NO_STATE_PrevAndNext(Session session,
		DossierSync dossierSync, String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

		boolean bindServerNo = false;

		if (serverNo == null) {
			query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_1);
		}
		else if (serverNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_3);
		}
		else {
			bindServerNo = true;

			query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_2);
		}

		query.append(_FINDER_COLUMN_SRV_NO_STATE_STATE_2);

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
			query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindServerNo) {
			qPos.add(serverNo);
		}

		qPos.add(state);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier syncs where serverNo = &#63; and state = &#63; from the database.
	 *
	 * @param serverNo the server no
	 * @param state the state
	 */
	@Override
	public void removeBySRV_NO_STATE(String serverNo, int state) {
		for (DossierSync dossierSync : findBySRV_NO_STATE(serverNo, state,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs where serverNo = &#63; and state = &#63;.
	 *
	 * @param serverNo the server no
	 * @param state the state
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countBySRV_NO_STATE(String serverNo, int state) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SRV_NO_STATE;

		Object[] finderArgs = new Object[] { serverNo, state };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

			boolean bindServerNo = false;

			if (serverNo == null) {
				query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_1);
			}
			else if (serverNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_3);
			}
			else {
				bindServerNo = true;

				query.append(_FINDER_COLUMN_SRV_NO_STATE_SERVERNO_2);
			}

			query.append(_FINDER_COLUMN_SRV_NO_STATE_STATE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServerNo) {
					qPos.add(serverNo);
				}

				qPos.add(state);

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

	private static final String _FINDER_COLUMN_SRV_NO_STATE_SERVERNO_1 = "dossierSync.serverNo IS NULL AND ";
	private static final String _FINDER_COLUMN_SRV_NO_STATE_SERVERNO_2 = "dossierSync.serverNo = ? AND ";
	private static final String _FINDER_COLUMN_SRV_NO_STATE_SERVERNO_3 = "(dossierSync.serverNo IS NULL OR dossierSync.serverNo = '') AND ";
	private static final String _FINDER_COLUMN_SRV_NO_STATE_STATE_2 = "dossierSync.state = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, DossierSyncImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName() },
			DossierSyncModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierSyncModelImpl.METHOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dossier syncs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByDossierId(long dossierId) {
		return findByDossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dossier syncs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByDossierId(long dossierId, int start, int end) {
		return findByDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByDossierId(long dossierId, int start,
		int end, OrderByComparator<DossierSync> orderByComparator) {
		return findByDossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier syncs
	 */
	@Override
	public List<DossierSync> findByDossierId(long dossierId, int start,
		int end, OrderByComparator<DossierSync> orderByComparator,
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

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierSync dossierSync : list) {
					if ((dossierId != dossierSync.getDossierId())) {
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

			query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier sync in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByDossierId_First(long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByDossierId_First(dossierId,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the first dossier sync in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByDossierId_First(long dossierId,
		OrderByComparator<DossierSync> orderByComparator) {
		List<DossierSync> list = findByDossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier sync in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync
	 * @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync findByDossierId_Last(long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByDossierId_Last(dossierId,
				orderByComparator);

		if (dossierSync != null) {
			return dossierSync;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierSyncException(msg.toString());
	}

	/**
	 * Returns the last dossier sync in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	 */
	@Override
	public DossierSync fetchByDossierId_Last(long dossierId,
		OrderByComparator<DossierSync> orderByComparator) {
		int count = countByDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<DossierSync> list = findByDossierId(dossierId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier syncs before and after the current dossier sync in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierSyncId the primary key of the current dossier sync
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync[] findByDossierId_PrevAndNext(long dossierSyncId,
		long dossierId, OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = findByPrimaryKey(dossierSyncId);

		Session session = null;

		try {
			session = openSession();

			DossierSync[] array = new DossierSyncImpl[3];

			array[0] = getByDossierId_PrevAndNext(session, dossierSync,
					dossierId, orderByComparator, true);

			array[1] = dossierSync;

			array[2] = getByDossierId_PrevAndNext(session, dossierSync,
					dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierSync getByDossierId_PrevAndNext(Session session,
		DossierSync dossierSync, long dossierId,
		OrderByComparator<DossierSync> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE);

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
			query.append(DossierSyncModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierSync);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierSync> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier syncs where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeByDossierId(long dossierId) {
		for (DossierSync dossierSync : findByDossierId(dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching dossier syncs
	 */
	@Override
	public int countByDossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERSYNC_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "dossierSync.dossierId = ?";

	public DossierSyncPersistenceImpl() {
		setModelClass(DossierSync.class);
	}

	/**
	 * Caches the dossier sync in the entity cache if it is enabled.
	 *
	 * @param dossierSync the dossier sync
	 */
	@Override
	public void cacheResult(DossierSync dossierSync) {
		entityCache.putResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncImpl.class, dossierSync.getPrimaryKey(), dossierSync);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { dossierSync.getUuid(), dossierSync.getGroupId() },
			dossierSync);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_D_M_CPK_FR,
			new Object[] {
				dossierSync.getDossierId(), dossierSync.getMethod(),
				dossierSync.getClassPK(), dossierSync.getFileReferenceUid()
			}, dossierSync);

		dossierSync.resetOriginalValues();
	}

	/**
	 * Caches the dossier syncs in the entity cache if it is enabled.
	 *
	 * @param dossierSyncs the dossier syncs
	 */
	@Override
	public void cacheResult(List<DossierSync> dossierSyncs) {
		for (DossierSync dossierSync : dossierSyncs) {
			if (entityCache.getResult(
						DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
						DossierSyncImpl.class, dossierSync.getPrimaryKey()) == null) {
				cacheResult(dossierSync);
			}
			else {
				dossierSync.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier syncs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DossierSyncImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier sync.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierSync dossierSync) {
		entityCache.removeResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncImpl.class, dossierSync.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((DossierSyncModelImpl)dossierSync, true);
	}

	@Override
	public void clearCache(List<DossierSync> dossierSyncs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierSync dossierSync : dossierSyncs) {
			entityCache.removeResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
				DossierSyncImpl.class, dossierSync.getPrimaryKey());

			clearUniqueFindersCache((DossierSyncModelImpl)dossierSync, true);
		}
	}

	protected void cacheUniqueFindersCache(
		DossierSyncModelImpl dossierSyncModelImpl) {
		Object[] args = new Object[] {
				dossierSyncModelImpl.getUuid(),
				dossierSyncModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			dossierSyncModelImpl, false);

		args = new Object[] {
				dossierSyncModelImpl.getDossierId(),
				dossierSyncModelImpl.getMethod(),
				dossierSyncModelImpl.getClassPK(),
				dossierSyncModelImpl.getFileReferenceUid()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_D_M_CPK_FR, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_D_M_CPK_FR, args,
			dossierSyncModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		DossierSyncModelImpl dossierSyncModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					dossierSyncModelImpl.getUuid(),
					dossierSyncModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((dossierSyncModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					dossierSyncModelImpl.getOriginalUuid(),
					dossierSyncModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					dossierSyncModelImpl.getDossierId(),
					dossierSyncModelImpl.getMethod(),
					dossierSyncModelImpl.getClassPK(),
					dossierSyncModelImpl.getFileReferenceUid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_D_M_CPK_FR, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_D_M_CPK_FR, args);
		}

		if ((dossierSyncModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_D_M_CPK_FR.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					dossierSyncModelImpl.getOriginalDossierId(),
					dossierSyncModelImpl.getOriginalMethod(),
					dossierSyncModelImpl.getOriginalClassPK(),
					dossierSyncModelImpl.getOriginalFileReferenceUid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_D_M_CPK_FR, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_D_M_CPK_FR, args);
		}
	}

	/**
	 * Creates a new dossier sync with the primary key. Does not add the dossier sync to the database.
	 *
	 * @param dossierSyncId the primary key for the new dossier sync
	 * @return the new dossier sync
	 */
	@Override
	public DossierSync create(long dossierSyncId) {
		DossierSync dossierSync = new DossierSyncImpl();

		dossierSync.setNew(true);
		dossierSync.setPrimaryKey(dossierSyncId);

		String uuid = PortalUUIDUtil.generate();

		dossierSync.setUuid(uuid);

		dossierSync.setCompanyId(companyProvider.getCompanyId());

		return dossierSync;
	}

	/**
	 * Removes the dossier sync with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierSyncId the primary key of the dossier sync
	 * @return the dossier sync that was removed
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync remove(long dossierSyncId)
		throws NoSuchDossierSyncException {
		return remove((Serializable)dossierSyncId);
	}

	/**
	 * Removes the dossier sync with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier sync
	 * @return the dossier sync that was removed
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync remove(Serializable primaryKey)
		throws NoSuchDossierSyncException {
		Session session = null;

		try {
			session = openSession();

			DossierSync dossierSync = (DossierSync)session.get(DossierSyncImpl.class,
					primaryKey);

			if (dossierSync == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierSyncException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierSync);
		}
		catch (NoSuchDossierSyncException nsee) {
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
	protected DossierSync removeImpl(DossierSync dossierSync) {
		dossierSync = toUnwrappedModel(dossierSync);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierSync)) {
				dossierSync = (DossierSync)session.get(DossierSyncImpl.class,
						dossierSync.getPrimaryKeyObj());
			}

			if (dossierSync != null) {
				session.delete(dossierSync);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierSync != null) {
			clearCache(dossierSync);
		}

		return dossierSync;
	}

	@Override
	public DossierSync updateImpl(DossierSync dossierSync) {
		dossierSync = toUnwrappedModel(dossierSync);

		boolean isNew = dossierSync.isNew();

		DossierSyncModelImpl dossierSyncModelImpl = (DossierSyncModelImpl)dossierSync;

		if (Validator.isNull(dossierSync.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			dossierSync.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (dossierSync.getCreateDate() == null)) {
			if (serviceContext == null) {
				dossierSync.setCreateDate(now);
			}
			else {
				dossierSync.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!dossierSyncModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				dossierSync.setModifiedDate(now);
			}
			else {
				dossierSync.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (dossierSync.isNew()) {
				session.save(dossierSync);

				dossierSync.setNew(false);
			}
			else {
				dossierSync = (DossierSync)session.merge(dossierSync);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DossierSyncModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dossierSyncModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierSyncModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { dossierSyncModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((dossierSyncModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierSyncModelImpl.getOriginalUuid(),
						dossierSyncModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						dossierSyncModelImpl.getUuid(),
						dossierSyncModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((dossierSyncModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierSyncModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID,
					args);

				args = new Object[] { dossierSyncModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID,
					args);
			}

			if ((dossierSyncModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierSyncModelImpl.getOriginalGroupId(),
						dossierSyncModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_ID_DID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DID,
					args);

				args = new Object[] {
						dossierSyncModelImpl.getGroupId(),
						dossierSyncModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_ID_DID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DID,
					args);
			}

			if ((dossierSyncModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DRF.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierSyncModelImpl.getOriginalGroupId(),
						dossierSyncModelImpl.getOriginalDossierReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_ID_DRF, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DRF,
					args);

				args = new Object[] {
						dossierSyncModelImpl.getGroupId(),
						dossierSyncModelImpl.getDossierReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_ID_DRF, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ID_DRF,
					args);
			}

			if ((dossierSyncModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierSyncModelImpl.getOriginalServerNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SRV_NO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO,
					args);

				args = new Object[] { dossierSyncModelImpl.getServerNo() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SRV_NO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO,
					args);
			}

			if ((dossierSyncModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO_STATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierSyncModelImpl.getOriginalServerNo(),
						dossierSyncModelImpl.getOriginalState()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SRV_NO_STATE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO_STATE,
					args);

				args = new Object[] {
						dossierSyncModelImpl.getServerNo(),
						dossierSyncModelImpl.getState()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SRV_NO_STATE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SRV_NO_STATE,
					args);
			}

			if ((dossierSyncModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierSyncModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] { dossierSyncModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}
		}

		entityCache.putResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
			DossierSyncImpl.class, dossierSync.getPrimaryKey(), dossierSync,
			false);

		clearUniqueFindersCache(dossierSyncModelImpl, false);
		cacheUniqueFindersCache(dossierSyncModelImpl);

		dossierSync.resetOriginalValues();

		return dossierSync;
	}

	protected DossierSync toUnwrappedModel(DossierSync dossierSync) {
		if (dossierSync instanceof DossierSyncImpl) {
			return dossierSync;
		}

		DossierSyncImpl dossierSyncImpl = new DossierSyncImpl();

		dossierSyncImpl.setNew(dossierSync.isNew());
		dossierSyncImpl.setPrimaryKey(dossierSync.getPrimaryKey());

		dossierSyncImpl.setUuid(dossierSync.getUuid());
		dossierSyncImpl.setDossierSyncId(dossierSync.getDossierSyncId());
		dossierSyncImpl.setCompanyId(dossierSync.getCompanyId());
		dossierSyncImpl.setGroupId(dossierSync.getGroupId());
		dossierSyncImpl.setUserId(dossierSync.getUserId());
		dossierSyncImpl.setUserName(dossierSync.getUserName());
		dossierSyncImpl.setCreateDate(dossierSync.getCreateDate());
		dossierSyncImpl.setModifiedDate(dossierSync.getModifiedDate());
		dossierSyncImpl.setDossierId(dossierSync.getDossierId());
		dossierSyncImpl.setDossierReferenceUid(dossierSync.getDossierReferenceUid());
		dossierSyncImpl.setCreateDossier(dossierSync.isCreateDossier());
		dossierSyncImpl.setMethod(dossierSync.getMethod());
		dossierSyncImpl.setClassPK(dossierSync.getClassPK());
		dossierSyncImpl.setFileReferenceUid(dossierSync.getFileReferenceUid());
		dossierSyncImpl.setServerNo(dossierSync.getServerNo());
		dossierSyncImpl.setPayload(dossierSync.getPayload());
		dossierSyncImpl.setRetry(dossierSync.getRetry());
		dossierSyncImpl.setState(dossierSync.getState());

		return dossierSyncImpl;
	}

	/**
	 * Returns the dossier sync with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier sync
	 * @return the dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierSyncException {
		DossierSync dossierSync = fetchByPrimaryKey(primaryKey);

		if (dossierSync == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierSyncException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierSync;
	}

	/**
	 * Returns the dossier sync with the primary key or throws a {@link NoSuchDossierSyncException} if it could not be found.
	 *
	 * @param dossierSyncId the primary key of the dossier sync
	 * @return the dossier sync
	 * @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync findByPrimaryKey(long dossierSyncId)
		throws NoSuchDossierSyncException {
		return findByPrimaryKey((Serializable)dossierSyncId);
	}

	/**
	 * Returns the dossier sync with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier sync
	 * @return the dossier sync, or <code>null</code> if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
				DossierSyncImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DossierSync dossierSync = (DossierSync)serializable;

		if (dossierSync == null) {
			Session session = null;

			try {
				session = openSession();

				dossierSync = (DossierSync)session.get(DossierSyncImpl.class,
						primaryKey);

				if (dossierSync != null) {
					cacheResult(dossierSync);
				}
				else {
					entityCache.putResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
						DossierSyncImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
					DossierSyncImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierSync;
	}

	/**
	 * Returns the dossier sync with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierSyncId the primary key of the dossier sync
	 * @return the dossier sync, or <code>null</code> if a dossier sync with the primary key could not be found
	 */
	@Override
	public DossierSync fetchByPrimaryKey(long dossierSyncId) {
		return fetchByPrimaryKey((Serializable)dossierSyncId);
	}

	@Override
	public Map<Serializable, DossierSync> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DossierSync> map = new HashMap<Serializable, DossierSync>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DossierSync dossierSync = fetchByPrimaryKey(primaryKey);

			if (dossierSync != null) {
				map.put(primaryKey, dossierSync);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
					DossierSyncImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DossierSync)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DOSSIERSYNC_WHERE_PKS_IN);

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

			for (DossierSync dossierSync : (List<DossierSync>)q.list()) {
				map.put(dossierSync.getPrimaryKeyObj(), dossierSync);

				cacheResult(dossierSync);

				uncachedPrimaryKeys.remove(dossierSync.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DossierSyncModelImpl.ENTITY_CACHE_ENABLED,
					DossierSyncImpl.class, primaryKey, nullModel);
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
	 * Returns all the dossier syncs.
	 *
	 * @return the dossier syncs
	 */
	@Override
	public List<DossierSync> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier syncs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @return the range of dossier syncs
	 */
	@Override
	public List<DossierSync> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier syncs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier syncs
	 */
	@Override
	public List<DossierSync> findAll(int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier syncs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier syncs
	 * @param end the upper bound of the range of dossier syncs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of dossier syncs
	 */
	@Override
	public List<DossierSync> findAll(int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
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

		List<DossierSync> list = null;

		if (retrieveFromCache) {
			list = (List<DossierSync>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DOSSIERSYNC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERSYNC;

				if (pagination) {
					sql = sql.concat(DossierSyncModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierSync>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dossier syncs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DossierSync dossierSync : findAll()) {
			remove(dossierSync);
		}
	}

	/**
	 * Returns the number of dossier syncs.
	 *
	 * @return the number of dossier syncs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOSSIERSYNC);

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
		return DossierSyncModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dossier sync persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DossierSyncImpl.class.getName());
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
	private static final String _SQL_SELECT_DOSSIERSYNC = "SELECT dossierSync FROM DossierSync dossierSync";
	private static final String _SQL_SELECT_DOSSIERSYNC_WHERE_PKS_IN = "SELECT dossierSync FROM DossierSync dossierSync WHERE dossierSyncId IN (";
	private static final String _SQL_SELECT_DOSSIERSYNC_WHERE = "SELECT dossierSync FROM DossierSync dossierSync WHERE ";
	private static final String _SQL_COUNT_DOSSIERSYNC = "SELECT COUNT(dossierSync) FROM DossierSync dossierSync";
	private static final String _SQL_COUNT_DOSSIERSYNC_WHERE = "SELECT COUNT(dossierSync) FROM DossierSync dossierSync WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierSync.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierSync exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DossierSync exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DossierSyncPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "state"
			});
}