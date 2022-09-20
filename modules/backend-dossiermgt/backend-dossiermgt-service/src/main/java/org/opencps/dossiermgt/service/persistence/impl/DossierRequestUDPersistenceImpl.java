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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import org.opencps.dossiermgt.exception.NoSuchDossierRequestUDException;
import org.opencps.dossiermgt.model.DossierRequestUD;
import org.opencps.dossiermgt.model.impl.DossierRequestUDImpl;
import org.opencps.dossiermgt.model.impl.DossierRequestUDModelImpl;
import org.opencps.dossiermgt.service.persistence.DossierRequestUDPersistence;

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
 * The persistence implementation for the dossier request ud service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DossierRequestUDPersistence
 * @see org.opencps.dossiermgt.service.persistence.DossierRequestUDUtil
 * @generated
 */
@ProviderType
public class DossierRequestUDPersistenceImpl extends BasePersistenceImpl<DossierRequestUD>
	implements DossierRequestUDPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierRequestUDUtil} to access the dossier request ud persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierRequestUDImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			DossierRequestUDModelImpl.UUID_COLUMN_BITMASK |
			DossierRequestUDModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dossier request uds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier request uds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @return the range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByUuid(String uuid, int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByUuid(String uuid, int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator,
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

		List<DossierRequestUD> list = null;

		if (retrieveFromCache) {
			list = (List<DossierRequestUD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierRequestUD dossierRequestUD : list) {
					if (!Objects.equals(uuid, dossierRequestUD.getUuid())) {
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

			query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

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
				query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierRequestUD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
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
	 * Returns the first dossier request ud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByUuid_First(String uuid,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByUuid_First(uuid,
				orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the first dossier request ud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByUuid_First(String uuid,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		List<DossierRequestUD> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier request ud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByUuid_Last(String uuid,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByUuid_Last(uuid,
				orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the last dossier request ud in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByUuid_Last(String uuid,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DossierRequestUD> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier request uds before and after the current dossier request ud in the ordered set where uuid = &#63;.
	 *
	 * @param dossierRequestId the primary key of the current dossier request ud
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier request ud
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD[] findByUuid_PrevAndNext(long dossierRequestId,
		String uuid, OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = findByPrimaryKey(dossierRequestId);

		Session session = null;

		try {
			session = openSession();

			DossierRequestUD[] array = new DossierRequestUDImpl[3];

			array[0] = getByUuid_PrevAndNext(session, dossierRequestUD, uuid,
					orderByComparator, true);

			array[1] = dossierRequestUD;

			array[2] = getByUuid_PrevAndNext(session, dossierRequestUD, uuid,
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

	protected DossierRequestUD getByUuid_PrevAndNext(Session session,
		DossierRequestUD dossierRequestUD, String uuid,
		OrderByComparator<DossierRequestUD> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

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
			query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dossierRequestUD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierRequestUD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier request uds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DossierRequestUD dossierRequestUD : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierRequestUD);
		}
	}

	/**
	 * Returns the number of dossier request uds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dossier request uds
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERREQUESTUD_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "dossierRequestUD.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "dossierRequestUD.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(dossierRequestUD.uuid IS NULL OR dossierRequestUD.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			DossierRequestUDModelImpl.UUID_COLUMN_BITMASK |
			DossierRequestUDModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the dossier request ud where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDossierRequestUDException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByUUID_G(String uuid, long groupId)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByUUID_G(uuid, groupId);

		if (dossierRequestUD == null) {
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

			throw new NoSuchDossierRequestUDException(msg.toString());
		}

		return dossierRequestUD;
	}

	/**
	 * Returns the dossier request ud where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the dossier request ud where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof DossierRequestUD) {
			DossierRequestUD dossierRequestUD = (DossierRequestUD)result;

			if (!Objects.equals(uuid, dossierRequestUD.getUuid()) ||
					(groupId != dossierRequestUD.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

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

				List<DossierRequestUD> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					DossierRequestUD dossierRequestUD = list.get(0);

					result = dossierRequestUD;

					cacheResult(dossierRequestUD);

					if ((dossierRequestUD.getUuid() == null) ||
							!dossierRequestUD.getUuid().equals(uuid) ||
							(dossierRequestUD.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, dossierRequestUD);
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
			return (DossierRequestUD)result;
		}
	}

	/**
	 * Removes the dossier request ud where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dossier request ud that was removed
	 */
	@Override
	public DossierRequestUD removeByUUID_G(String uuid, long groupId)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = findByUUID_G(uuid, groupId);

		return remove(dossierRequestUD);
	}

	/**
	 * Returns the number of dossier request uds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dossier request uds
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERREQUESTUD_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "dossierRequestUD.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "dossierRequestUD.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(dossierRequestUD.uuid IS NULL OR dossierRequestUD.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "dossierRequestUD.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			DossierRequestUDModelImpl.UUID_COLUMN_BITMASK |
			DossierRequestUDModelImpl.COMPANYID_COLUMN_BITMASK |
			DossierRequestUDModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dossier request uds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier request uds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @return the range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator,
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

		List<DossierRequestUD> list = null;

		if (retrieveFromCache) {
			list = (List<DossierRequestUD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierRequestUD dossierRequestUD : list) {
					if (!Objects.equals(uuid, dossierRequestUD.getUuid()) ||
							(companyId != dossierRequestUD.getCompanyId())) {
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

			query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

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
				query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
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
					list = (List<DossierRequestUD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
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
	 * Returns the first dossier request ud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the first dossier request ud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		List<DossierRequestUD> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier request ud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the last dossier request ud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DossierRequestUD> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier request uds before and after the current dossier request ud in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dossierRequestId the primary key of the current dossier request ud
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier request ud
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD[] findByUuid_C_PrevAndNext(long dossierRequestId,
		String uuid, long companyId,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = findByPrimaryKey(dossierRequestId);

		Session session = null;

		try {
			session = openSession();

			DossierRequestUD[] array = new DossierRequestUDImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, dossierRequestUD, uuid,
					companyId, orderByComparator, true);

			array[1] = dossierRequestUD;

			array[2] = getByUuid_C_PrevAndNext(session, dossierRequestUD, uuid,
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

	protected DossierRequestUD getByUuid_C_PrevAndNext(Session session,
		DossierRequestUD dossierRequestUD, String uuid, long companyId,
		OrderByComparator<DossierRequestUD> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

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
			query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dossierRequestUD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierRequestUD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier request uds where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DossierRequestUD dossierRequestUD : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierRequestUD);
		}
	}

	/**
	 * Returns the number of dossier request uds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dossier request uds
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERREQUESTUD_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "dossierRequestUD.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "dossierRequestUD.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(dossierRequestUD.uuid IS NULL OR dossierRequestUD.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "dossierRequestUD.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_ = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByD_",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_ = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_",
			new String[] { Long.class.getName() },
			DossierRequestUDModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierRequestUDModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_ = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dossier request uds where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByD_(long dossierId) {
		return findByD_(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier request uds where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @return the range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByD_(long dossierId, int start, int end) {
		return findByD_(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByD_(long dossierId, int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		return findByD_(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByD_(long dossierId, int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<DossierRequestUD> list = null;

		if (retrieveFromCache) {
			list = (List<DossierRequestUD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierRequestUD dossierRequestUD : list) {
					if ((dossierId != dossierRequestUD.getDossierId())) {
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

			query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

			query.append(_FINDER_COLUMN_D__DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
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
	 * Returns the first dossier request ud in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByD__First(long dossierId,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByD__First(dossierId,
				orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the first dossier request ud in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByD__First(long dossierId,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		List<DossierRequestUD> list = findByD_(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier request ud in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByD__Last(long dossierId,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByD__Last(dossierId,
				orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the last dossier request ud in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByD__Last(long dossierId,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		int count = countByD_(dossierId);

		if (count == 0) {
			return null;
		}

		List<DossierRequestUD> list = findByD_(dossierId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier request uds before and after the current dossier request ud in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierRequestId the primary key of the current dossier request ud
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier request ud
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD[] findByD__PrevAndNext(long dossierRequestId,
		long dossierId, OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = findByPrimaryKey(dossierRequestId);

		Session session = null;

		try {
			session = openSession();

			DossierRequestUD[] array = new DossierRequestUDImpl[3];

			array[0] = getByD__PrevAndNext(session, dossierRequestUD,
					dossierId, orderByComparator, true);

			array[1] = dossierRequestUD;

			array[2] = getByD__PrevAndNext(session, dossierRequestUD,
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

	protected DossierRequestUD getByD__PrevAndNext(Session session,
		DossierRequestUD dossierRequestUD, long dossierId,
		OrderByComparator<DossierRequestUD> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

		query.append(_FINDER_COLUMN_D__DOSSIERID_2);

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
			query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierRequestUD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierRequestUD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier request uds where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeByD_(long dossierId) {
		for (DossierRequestUD dossierRequestUD : findByD_(dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierRequestUD);
		}
	}

	/**
	 * Returns the number of dossier request uds where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching dossier request uds
	 */
	@Override
	public int countByD_(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERREQUESTUD_WHERE);

			query.append(_FINDER_COLUMN_D__DOSSIERID_2);

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

	private static final String _FINDER_COLUMN_D__DOSSIERID_2 = "dossierRequestUD.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_RT = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByD_RT",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RT = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_RT",
			new String[] { Long.class.getName(), String.class.getName() },
			DossierRequestUDModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierRequestUDModelImpl.REQUESTTYPE_COLUMN_BITMASK |
			DossierRequestUDModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_RT = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_RT",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dossier request uds where dossierId = &#63; and requestType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @return the matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByD_RT(long dossierId, String requestType) {
		return findByD_RT(dossierId, requestType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier request uds where dossierId = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @return the range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByD_RT(long dossierId,
		String requestType, int start, int end) {
		return findByD_RT(dossierId, requestType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where dossierId = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByD_RT(long dossierId,
		String requestType, int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		return findByD_RT(dossierId, requestType, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where dossierId = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByD_RT(long dossierId,
		String requestType, int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RT;
			finderArgs = new Object[] { dossierId, requestType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_RT;
			finderArgs = new Object[] {
					dossierId, requestType,
					
					start, end, orderByComparator
				};
		}

		List<DossierRequestUD> list = null;

		if (retrieveFromCache) {
			list = (List<DossierRequestUD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierRequestUD dossierRequestUD : list) {
					if ((dossierId != dossierRequestUD.getDossierId()) ||
							!Objects.equals(requestType,
								dossierRequestUD.getRequestType())) {
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

			query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

			query.append(_FINDER_COLUMN_D_RT_DOSSIERID_2);

			boolean bindRequestType = false;

			if (requestType == null) {
				query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_1);
			}
			else if (requestType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindRequestType) {
					qPos.add(requestType);
				}

				if (!pagination) {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
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
	 * Returns the first dossier request ud in the ordered set where dossierId = &#63; and requestType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByD_RT_First(long dossierId,
		String requestType,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByD_RT_First(dossierId,
				requestType, orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", requestType=");
		msg.append(requestType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the first dossier request ud in the ordered set where dossierId = &#63; and requestType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByD_RT_First(long dossierId,
		String requestType,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		List<DossierRequestUD> list = findByD_RT(dossierId, requestType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier request ud in the ordered set where dossierId = &#63; and requestType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByD_RT_Last(long dossierId, String requestType,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByD_RT_Last(dossierId,
				requestType, orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", requestType=");
		msg.append(requestType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the last dossier request ud in the ordered set where dossierId = &#63; and requestType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByD_RT_Last(long dossierId,
		String requestType,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		int count = countByD_RT(dossierId, requestType);

		if (count == 0) {
			return null;
		}

		List<DossierRequestUD> list = findByD_RT(dossierId, requestType,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier request uds before and after the current dossier request ud in the ordered set where dossierId = &#63; and requestType = &#63;.
	 *
	 * @param dossierRequestId the primary key of the current dossier request ud
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier request ud
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD[] findByD_RT_PrevAndNext(long dossierRequestId,
		long dossierId, String requestType,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = findByPrimaryKey(dossierRequestId);

		Session session = null;

		try {
			session = openSession();

			DossierRequestUD[] array = new DossierRequestUDImpl[3];

			array[0] = getByD_RT_PrevAndNext(session, dossierRequestUD,
					dossierId, requestType, orderByComparator, true);

			array[1] = dossierRequestUD;

			array[2] = getByD_RT_PrevAndNext(session, dossierRequestUD,
					dossierId, requestType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierRequestUD getByD_RT_PrevAndNext(Session session,
		DossierRequestUD dossierRequestUD, long dossierId, String requestType,
		OrderByComparator<DossierRequestUD> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

		query.append(_FINDER_COLUMN_D_RT_DOSSIERID_2);

		boolean bindRequestType = false;

		if (requestType == null) {
			query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_1);
		}
		else if (requestType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_3);
		}
		else {
			bindRequestType = true;

			query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_2);
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
			query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindRequestType) {
			qPos.add(requestType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierRequestUD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierRequestUD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier request uds where dossierId = &#63; and requestType = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 */
	@Override
	public void removeByD_RT(long dossierId, String requestType) {
		for (DossierRequestUD dossierRequestUD : findByD_RT(dossierId,
				requestType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierRequestUD);
		}
	}

	/**
	 * Returns the number of dossier request uds where dossierId = &#63; and requestType = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestType the request type
	 * @return the number of matching dossier request uds
	 */
	@Override
	public int countByD_RT(long dossierId, String requestType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_RT;

		Object[] finderArgs = new Object[] { dossierId, requestType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERREQUESTUD_WHERE);

			query.append(_FINDER_COLUMN_D_RT_DOSSIERID_2);

			boolean bindRequestType = false;

			if (requestType == null) {
				query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_1);
			}
			else if (requestType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				query.append(_FINDER_COLUMN_D_RT_REQUESTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindRequestType) {
					qPos.add(requestType);
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

	private static final String _FINDER_COLUMN_D_RT_DOSSIERID_2 = "dossierRequestUD.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_RT_REQUESTTYPE_1 = "dossierRequestUD.requestType IS NULL";
	private static final String _FINDER_COLUMN_D_RT_REQUESTTYPE_2 = "dossierRequestUD.requestType = ?";
	private static final String _FINDER_COLUMN_D_RT_REQUESTTYPE_3 = "(dossierRequestUD.requestType IS NULL OR dossierRequestUD.requestType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IS_NEW = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIS_NEW",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IS_NEW =
		new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIS_NEW",
			new String[] { Integer.class.getName() },
			DossierRequestUDModelImpl.ISNEW_COLUMN_BITMASK |
			DossierRequestUDModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IS_NEW = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIS_NEW",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the dossier request uds where isNew = &#63;.
	 *
	 * @param isNew the is new
	 * @return the matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByIS_NEW(int isNew) {
		return findByIS_NEW(isNew, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier request uds where isNew = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isNew the is new
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @return the range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByIS_NEW(int isNew, int start, int end) {
		return findByIS_NEW(isNew, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where isNew = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isNew the is new
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByIS_NEW(int isNew, int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		return findByIS_NEW(isNew, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where isNew = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isNew the is new
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByIS_NEW(int isNew, int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IS_NEW;
			finderArgs = new Object[] { isNew };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IS_NEW;
			finderArgs = new Object[] { isNew, start, end, orderByComparator };
		}

		List<DossierRequestUD> list = null;

		if (retrieveFromCache) {
			list = (List<DossierRequestUD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierRequestUD dossierRequestUD : list) {
					if ((isNew != dossierRequestUD.getIsNew())) {
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

			query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

			query.append(_FINDER_COLUMN_IS_NEW_ISNEW_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isNew);

				if (!pagination) {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
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
	 * Returns the first dossier request ud in the ordered set where isNew = &#63;.
	 *
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByIS_NEW_First(int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByIS_NEW_First(isNew,
				orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isNew=");
		msg.append(isNew);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the first dossier request ud in the ordered set where isNew = &#63;.
	 *
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByIS_NEW_First(int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		List<DossierRequestUD> list = findByIS_NEW(isNew, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier request ud in the ordered set where isNew = &#63;.
	 *
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByIS_NEW_Last(int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByIS_NEW_Last(isNew,
				orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isNew=");
		msg.append(isNew);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the last dossier request ud in the ordered set where isNew = &#63;.
	 *
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByIS_NEW_Last(int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		int count = countByIS_NEW(isNew);

		if (count == 0) {
			return null;
		}

		List<DossierRequestUD> list = findByIS_NEW(isNew, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier request uds before and after the current dossier request ud in the ordered set where isNew = &#63;.
	 *
	 * @param dossierRequestId the primary key of the current dossier request ud
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier request ud
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD[] findByIS_NEW_PrevAndNext(long dossierRequestId,
		int isNew, OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = findByPrimaryKey(dossierRequestId);

		Session session = null;

		try {
			session = openSession();

			DossierRequestUD[] array = new DossierRequestUDImpl[3];

			array[0] = getByIS_NEW_PrevAndNext(session, dossierRequestUD,
					isNew, orderByComparator, true);

			array[1] = dossierRequestUD;

			array[2] = getByIS_NEW_PrevAndNext(session, dossierRequestUD,
					isNew, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierRequestUD getByIS_NEW_PrevAndNext(Session session,
		DossierRequestUD dossierRequestUD, int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

		query.append(_FINDER_COLUMN_IS_NEW_ISNEW_2);

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
			query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isNew);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierRequestUD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierRequestUD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier request uds where isNew = &#63; from the database.
	 *
	 * @param isNew the is new
	 */
	@Override
	public void removeByIS_NEW(int isNew) {
		for (DossierRequestUD dossierRequestUD : findByIS_NEW(isNew,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierRequestUD);
		}
	}

	/**
	 * Returns the number of dossier request uds where isNew = &#63;.
	 *
	 * @param isNew the is new
	 * @return the number of matching dossier request uds
	 */
	@Override
	public int countByIS_NEW(int isNew) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IS_NEW;

		Object[] finderArgs = new Object[] { isNew };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERREQUESTUD_WHERE);

			query.append(_FINDER_COLUMN_IS_NEW_ISNEW_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isNew);

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

	private static final String _FINDER_COLUMN_IS_NEW_ISNEW_2 = "dossierRequestUD.isNew = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_IN = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDID_IN",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_IN =
		new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED,
			DossierRequestUDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDID_IN",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DossierRequestUDModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierRequestUDModelImpl.ISNEW_COLUMN_BITMASK |
			DossierRequestUDModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DID_IN = new FinderPath(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDID_IN",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dossier request uds where dossierId = &#63; and isNew = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @return the matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByDID_IN(long dossierId, int isNew) {
		return findByDID_IN(dossierId, isNew, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier request uds where dossierId = &#63; and isNew = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @return the range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByDID_IN(long dossierId, int isNew,
		int start, int end) {
		return findByDID_IN(dossierId, isNew, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where dossierId = &#63; and isNew = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByDID_IN(long dossierId, int isNew,
		int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		return findByDID_IN(dossierId, isNew, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the dossier request uds where dossierId = &#63; and isNew = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findByDID_IN(long dossierId, int isNew,
		int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_IN;
			finderArgs = new Object[] { dossierId, isNew };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_IN;
			finderArgs = new Object[] {
					dossierId, isNew,
					
					start, end, orderByComparator
				};
		}

		List<DossierRequestUD> list = null;

		if (retrieveFromCache) {
			list = (List<DossierRequestUD>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DossierRequestUD dossierRequestUD : list) {
					if ((dossierId != dossierRequestUD.getDossierId()) ||
							(isNew != dossierRequestUD.getIsNew())) {
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

			query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

			query.append(_FINDER_COLUMN_DID_IN_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DID_IN_ISNEW_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(isNew);

				if (!pagination) {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
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
	 * Returns the first dossier request ud in the ordered set where dossierId = &#63; and isNew = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByDID_IN_First(long dossierId, int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByDID_IN_First(dossierId,
				isNew, orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", isNew=");
		msg.append(isNew);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the first dossier request ud in the ordered set where dossierId = &#63; and isNew = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByDID_IN_First(long dossierId, int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		List<DossierRequestUD> list = findByDID_IN(dossierId, isNew, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier request ud in the ordered set where dossierId = &#63; and isNew = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud
	 * @throws NoSuchDossierRequestUDException if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD findByDID_IN_Last(long dossierId, int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByDID_IN_Last(dossierId,
				isNew, orderByComparator);

		if (dossierRequestUD != null) {
			return dossierRequestUD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", isNew=");
		msg.append(isNew);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierRequestUDException(msg.toString());
	}

	/**
	 * Returns the last dossier request ud in the ordered set where dossierId = &#63; and isNew = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier request ud, or <code>null</code> if a matching dossier request ud could not be found
	 */
	@Override
	public DossierRequestUD fetchByDID_IN_Last(long dossierId, int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		int count = countByDID_IN(dossierId, isNew);

		if (count == 0) {
			return null;
		}

		List<DossierRequestUD> list = findByDID_IN(dossierId, isNew, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier request uds before and after the current dossier request ud in the ordered set where dossierId = &#63; and isNew = &#63;.
	 *
	 * @param dossierRequestId the primary key of the current dossier request ud
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier request ud
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD[] findByDID_IN_PrevAndNext(long dossierRequestId,
		long dossierId, int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = findByPrimaryKey(dossierRequestId);

		Session session = null;

		try {
			session = openSession();

			DossierRequestUD[] array = new DossierRequestUDImpl[3];

			array[0] = getByDID_IN_PrevAndNext(session, dossierRequestUD,
					dossierId, isNew, orderByComparator, true);

			array[1] = dossierRequestUD;

			array[2] = getByDID_IN_PrevAndNext(session, dossierRequestUD,
					dossierId, isNew, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierRequestUD getByDID_IN_PrevAndNext(Session session,
		DossierRequestUD dossierRequestUD, long dossierId, int isNew,
		OrderByComparator<DossierRequestUD> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE);

		query.append(_FINDER_COLUMN_DID_IN_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DID_IN_ISNEW_2);

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
			query.append(DossierRequestUDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(isNew);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierRequestUD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierRequestUD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier request uds where dossierId = &#63; and isNew = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 */
	@Override
	public void removeByDID_IN(long dossierId, int isNew) {
		for (DossierRequestUD dossierRequestUD : findByDID_IN(dossierId, isNew,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierRequestUD);
		}
	}

	/**
	 * Returns the number of dossier request uds where dossierId = &#63; and isNew = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @return the number of matching dossier request uds
	 */
	@Override
	public int countByDID_IN(long dossierId, int isNew) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DID_IN;

		Object[] finderArgs = new Object[] { dossierId, isNew };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERREQUESTUD_WHERE);

			query.append(_FINDER_COLUMN_DID_IN_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DID_IN_ISNEW_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(isNew);

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

	private static final String _FINDER_COLUMN_DID_IN_DOSSIERID_2 = "dossierRequestUD.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DID_IN_ISNEW_2 = "dossierRequestUD.isNew = ?";

	public DossierRequestUDPersistenceImpl() {
		setModelClass(DossierRequestUD.class);
	}

	/**
	 * Caches the dossier request ud in the entity cache if it is enabled.
	 *
	 * @param dossierRequestUD the dossier request ud
	 */
	@Override
	public void cacheResult(DossierRequestUD dossierRequestUD) {
		entityCache.putResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDImpl.class, dossierRequestUD.getPrimaryKey(),
			dossierRequestUD);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				dossierRequestUD.getUuid(), dossierRequestUD.getGroupId()
			}, dossierRequestUD);

		dossierRequestUD.resetOriginalValues();
	}

	/**
	 * Caches the dossier request uds in the entity cache if it is enabled.
	 *
	 * @param dossierRequestUDs the dossier request uds
	 */
	@Override
	public void cacheResult(List<DossierRequestUD> dossierRequestUDs) {
		for (DossierRequestUD dossierRequestUD : dossierRequestUDs) {
			if (entityCache.getResult(
						DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
						DossierRequestUDImpl.class,
						dossierRequestUD.getPrimaryKey()) == null) {
				cacheResult(dossierRequestUD);
			}
			else {
				dossierRequestUD.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier request uds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DossierRequestUDImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier request ud.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierRequestUD dossierRequestUD) {
		entityCache.removeResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDImpl.class, dossierRequestUD.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((DossierRequestUDModelImpl)dossierRequestUD,
			true);
	}

	@Override
	public void clearCache(List<DossierRequestUD> dossierRequestUDs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierRequestUD dossierRequestUD : dossierRequestUDs) {
			entityCache.removeResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
				DossierRequestUDImpl.class, dossierRequestUD.getPrimaryKey());

			clearUniqueFindersCache((DossierRequestUDModelImpl)dossierRequestUD,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		DossierRequestUDModelImpl dossierRequestUDModelImpl) {
		Object[] args = new Object[] {
				dossierRequestUDModelImpl.getUuid(),
				dossierRequestUDModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			dossierRequestUDModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		DossierRequestUDModelImpl dossierRequestUDModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					dossierRequestUDModelImpl.getUuid(),
					dossierRequestUDModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((dossierRequestUDModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					dossierRequestUDModelImpl.getOriginalUuid(),
					dossierRequestUDModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new dossier request ud with the primary key. Does not add the dossier request ud to the database.
	 *
	 * @param dossierRequestId the primary key for the new dossier request ud
	 * @return the new dossier request ud
	 */
	@Override
	public DossierRequestUD create(long dossierRequestId) {
		DossierRequestUD dossierRequestUD = new DossierRequestUDImpl();

		dossierRequestUD.setNew(true);
		dossierRequestUD.setPrimaryKey(dossierRequestId);

		String uuid = PortalUUIDUtil.generate();

		dossierRequestUD.setUuid(uuid);

		dossierRequestUD.setCompanyId(companyProvider.getCompanyId());

		return dossierRequestUD;
	}

	/**
	 * Removes the dossier request ud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierRequestId the primary key of the dossier request ud
	 * @return the dossier request ud that was removed
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD remove(long dossierRequestId)
		throws NoSuchDossierRequestUDException {
		return remove((Serializable)dossierRequestId);
	}

	/**
	 * Removes the dossier request ud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier request ud
	 * @return the dossier request ud that was removed
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD remove(Serializable primaryKey)
		throws NoSuchDossierRequestUDException {
		Session session = null;

		try {
			session = openSession();

			DossierRequestUD dossierRequestUD = (DossierRequestUD)session.get(DossierRequestUDImpl.class,
					primaryKey);

			if (dossierRequestUD == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierRequestUDException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierRequestUD);
		}
		catch (NoSuchDossierRequestUDException nsee) {
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
	protected DossierRequestUD removeImpl(DossierRequestUD dossierRequestUD) {
		dossierRequestUD = toUnwrappedModel(dossierRequestUD);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierRequestUD)) {
				dossierRequestUD = (DossierRequestUD)session.get(DossierRequestUDImpl.class,
						dossierRequestUD.getPrimaryKeyObj());
			}

			if (dossierRequestUD != null) {
				session.delete(dossierRequestUD);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierRequestUD != null) {
			clearCache(dossierRequestUD);
		}

		return dossierRequestUD;
	}

	@Override
	public DossierRequestUD updateImpl(DossierRequestUD dossierRequestUD) {
		dossierRequestUD = toUnwrappedModel(dossierRequestUD);

		boolean isNew = dossierRequestUD.isNew();

		DossierRequestUDModelImpl dossierRequestUDModelImpl = (DossierRequestUDModelImpl)dossierRequestUD;

		if (Validator.isNull(dossierRequestUD.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			dossierRequestUD.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (dossierRequestUD.getCreateDate() == null)) {
			if (serviceContext == null) {
				dossierRequestUD.setCreateDate(now);
			}
			else {
				dossierRequestUD.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!dossierRequestUDModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				dossierRequestUD.setModifiedDate(now);
			}
			else {
				dossierRequestUD.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (dossierRequestUD.isNew()) {
				session.save(dossierRequestUD);

				dossierRequestUD.setNew(false);
			}
			else {
				dossierRequestUD = (DossierRequestUD)session.merge(dossierRequestUD);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DossierRequestUDModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dossierRequestUDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierRequestUDModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { dossierRequestUDModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((dossierRequestUDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierRequestUDModelImpl.getOriginalUuid(),
						dossierRequestUDModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						dossierRequestUDModelImpl.getUuid(),
						dossierRequestUDModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((dossierRequestUDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierRequestUDModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_D_, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_,
					args);

				args = new Object[] { dossierRequestUDModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_D_, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_,
					args);
			}

			if ((dossierRequestUDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierRequestUDModelImpl.getOriginalDossierId(),
						dossierRequestUDModelImpl.getOriginalRequestType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_D_RT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RT,
					args);

				args = new Object[] {
						dossierRequestUDModelImpl.getDossierId(),
						dossierRequestUDModelImpl.getRequestType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_D_RT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RT,
					args);
			}

			if ((dossierRequestUDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IS_NEW.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierRequestUDModelImpl.getOriginalIsNew()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IS_NEW, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IS_NEW,
					args);

				args = new Object[] { dossierRequestUDModelImpl.getIsNew() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IS_NEW, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IS_NEW,
					args);
			}

			if ((dossierRequestUDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_IN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierRequestUDModelImpl.getOriginalDossierId(),
						dossierRequestUDModelImpl.getOriginalIsNew()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_IN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_IN,
					args);

				args = new Object[] {
						dossierRequestUDModelImpl.getDossierId(),
						dossierRequestUDModelImpl.getIsNew()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_IN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_IN,
					args);
			}
		}

		entityCache.putResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
			DossierRequestUDImpl.class, dossierRequestUD.getPrimaryKey(),
			dossierRequestUD, false);

		clearUniqueFindersCache(dossierRequestUDModelImpl, false);
		cacheUniqueFindersCache(dossierRequestUDModelImpl);

		dossierRequestUD.resetOriginalValues();

		return dossierRequestUD;
	}

	protected DossierRequestUD toUnwrappedModel(
		DossierRequestUD dossierRequestUD) {
		if (dossierRequestUD instanceof DossierRequestUDImpl) {
			return dossierRequestUD;
		}

		DossierRequestUDImpl dossierRequestUDImpl = new DossierRequestUDImpl();

		dossierRequestUDImpl.setNew(dossierRequestUD.isNew());
		dossierRequestUDImpl.setPrimaryKey(dossierRequestUD.getPrimaryKey());

		dossierRequestUDImpl.setUuid(dossierRequestUD.getUuid());
		dossierRequestUDImpl.setDossierRequestId(dossierRequestUD.getDossierRequestId());
		dossierRequestUDImpl.setCompanyId(dossierRequestUD.getCompanyId());
		dossierRequestUDImpl.setGroupId(dossierRequestUD.getGroupId());
		dossierRequestUDImpl.setUserId(dossierRequestUD.getUserId());
		dossierRequestUDImpl.setUserName(dossierRequestUD.getUserName());
		dossierRequestUDImpl.setCreateDate(dossierRequestUD.getCreateDate());
		dossierRequestUDImpl.setModifiedDate(dossierRequestUD.getModifiedDate());
		dossierRequestUDImpl.setDossierId(dossierRequestUD.getDossierId());
		dossierRequestUDImpl.setReferenceUid(dossierRequestUD.getReferenceUid());
		dossierRequestUDImpl.setRequestType(dossierRequestUD.getRequestType());
		dossierRequestUDImpl.setComment(dossierRequestUD.getComment());
		dossierRequestUDImpl.setIsNew(dossierRequestUD.getIsNew());
		dossierRequestUDImpl.setStatusReg(dossierRequestUD.getStatusReg());

		return dossierRequestUDImpl;
	}

	/**
	 * Returns the dossier request ud with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier request ud
	 * @return the dossier request ud
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierRequestUDException {
		DossierRequestUD dossierRequestUD = fetchByPrimaryKey(primaryKey);

		if (dossierRequestUD == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierRequestUDException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierRequestUD;
	}

	/**
	 * Returns the dossier request ud with the primary key or throws a {@link NoSuchDossierRequestUDException} if it could not be found.
	 *
	 * @param dossierRequestId the primary key of the dossier request ud
	 * @return the dossier request ud
	 * @throws NoSuchDossierRequestUDException if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD findByPrimaryKey(long dossierRequestId)
		throws NoSuchDossierRequestUDException {
		return findByPrimaryKey((Serializable)dossierRequestId);
	}

	/**
	 * Returns the dossier request ud with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier request ud
	 * @return the dossier request ud, or <code>null</code> if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
				DossierRequestUDImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DossierRequestUD dossierRequestUD = (DossierRequestUD)serializable;

		if (dossierRequestUD == null) {
			Session session = null;

			try {
				session = openSession();

				dossierRequestUD = (DossierRequestUD)session.get(DossierRequestUDImpl.class,
						primaryKey);

				if (dossierRequestUD != null) {
					cacheResult(dossierRequestUD);
				}
				else {
					entityCache.putResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
						DossierRequestUDImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
					DossierRequestUDImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierRequestUD;
	}

	/**
	 * Returns the dossier request ud with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierRequestId the primary key of the dossier request ud
	 * @return the dossier request ud, or <code>null</code> if a dossier request ud with the primary key could not be found
	 */
	@Override
	public DossierRequestUD fetchByPrimaryKey(long dossierRequestId) {
		return fetchByPrimaryKey((Serializable)dossierRequestId);
	}

	@Override
	public Map<Serializable, DossierRequestUD> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DossierRequestUD> map = new HashMap<Serializable, DossierRequestUD>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DossierRequestUD dossierRequestUD = fetchByPrimaryKey(primaryKey);

			if (dossierRequestUD != null) {
				map.put(primaryKey, dossierRequestUD);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
					DossierRequestUDImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DossierRequestUD)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DOSSIERREQUESTUD_WHERE_PKS_IN);

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

			for (DossierRequestUD dossierRequestUD : (List<DossierRequestUD>)q.list()) {
				map.put(dossierRequestUD.getPrimaryKeyObj(), dossierRequestUD);

				cacheResult(dossierRequestUD);

				uncachedPrimaryKeys.remove(dossierRequestUD.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DossierRequestUDModelImpl.ENTITY_CACHE_ENABLED,
					DossierRequestUDImpl.class, primaryKey, nullModel);
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
	 * Returns all the dossier request uds.
	 *
	 * @return the dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier request uds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @return the range of dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier request uds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findAll(int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dossier request uds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierRequestUDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier request uds
	 * @param end the upper bound of the range of dossier request uds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of dossier request uds
	 */
	@Override
	public List<DossierRequestUD> findAll(int start, int end,
		OrderByComparator<DossierRequestUD> orderByComparator,
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

		List<DossierRequestUD> list = null;

		if (retrieveFromCache) {
			list = (List<DossierRequestUD>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DOSSIERREQUESTUD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERREQUESTUD;

				if (pagination) {
					sql = sql.concat(DossierRequestUDModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DossierRequestUD>)QueryUtil.list(q,
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
	 * Removes all the dossier request uds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DossierRequestUD dossierRequestUD : findAll()) {
			remove(dossierRequestUD);
		}
	}

	/**
	 * Returns the number of dossier request uds.
	 *
	 * @return the number of dossier request uds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOSSIERREQUESTUD);

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
		return DossierRequestUDModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dossier request ud persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DossierRequestUDImpl.class.getName());
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
	private static final String _SQL_SELECT_DOSSIERREQUESTUD = "SELECT dossierRequestUD FROM DossierRequestUD dossierRequestUD";
	private static final String _SQL_SELECT_DOSSIERREQUESTUD_WHERE_PKS_IN = "SELECT dossierRequestUD FROM DossierRequestUD dossierRequestUD WHERE dossierRequestId IN (";
	private static final String _SQL_SELECT_DOSSIERREQUESTUD_WHERE = "SELECT dossierRequestUD FROM DossierRequestUD dossierRequestUD WHERE ";
	private static final String _SQL_COUNT_DOSSIERREQUESTUD = "SELECT COUNT(dossierRequestUD) FROM DossierRequestUD dossierRequestUD";
	private static final String _SQL_COUNT_DOSSIERREQUESTUD_WHERE = "SELECT COUNT(dossierRequestUD) FROM DossierRequestUD dossierRequestUD WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierRequestUD.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierRequestUD exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DossierRequestUD exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DossierRequestUDPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "comment"
			});
}