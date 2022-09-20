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

import com.fds.vr.business.exception.NoSuchVRCorporationInspectorException;
import com.fds.vr.business.model.VRCorporationInspector;
import com.fds.vr.business.model.impl.VRCorporationInspectorImpl;
import com.fds.vr.business.model.impl.VRCorporationInspectorModelImpl;
import com.fds.vr.business.service.persistence.VRCorporationInspectorPersistence;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
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
 * The persistence implementation for the vr corporation inspector service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCorporationInspectorPersistence
 * @see com.fds.vr.business.service.persistence.VRCorporationInspectorUtil
 * @generated
 */
@ProviderType
public class VRCorporationInspectorPersistenceImpl extends BasePersistenceImpl<VRCorporationInspector>
	implements VRCorporationInspectorPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCorporationInspectorUtil} to access the vr corporation inspector persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCorporationInspectorImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTORID = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectorId", new String[] { Long.class.getName() },
			VRCorporationInspectorModelImpl.INSPECTORID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORID = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the vr corporation inspector where inspectorid = &#63; or throws a {@link NoSuchVRCorporationInspectorException} if it could not be found.
	 *
	 * @param inspectorid the inspectorid
	 * @return the matching vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector findByInspectorId(long inspectorid)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = fetchByInspectorId(inspectorid);

		if (vrCorporationInspector == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectorid=");
			msg.append(inspectorid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRCorporationInspectorException(msg.toString());
		}

		return vrCorporationInspector;
	}

	/**
	 * Returns the vr corporation inspector where inspectorid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectorid the inspectorid
	 * @return the matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector fetchByInspectorId(long inspectorid) {
		return fetchByInspectorId(inspectorid, true);
	}

	/**
	 * Returns the vr corporation inspector where inspectorid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectorid the inspectorid
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector fetchByInspectorId(long inspectorid,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { inspectorid };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_INSPECTORID,
					finderArgs, this);
		}

		if (result instanceof VRCorporationInspector) {
			VRCorporationInspector vrCorporationInspector = (VRCorporationInspector)result;

			if ((inspectorid != vrCorporationInspector.getInspectorid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorid);

				List<VRCorporationInspector> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_INSPECTORID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRCorporationInspectorPersistenceImpl.fetchByInspectorId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRCorporationInspector vrCorporationInspector = list.get(0);

					result = vrCorporationInspector;

					cacheResult(vrCorporationInspector);

					if ((vrCorporationInspector.getInspectorid() != inspectorid)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_INSPECTORID,
							finderArgs, vrCorporationInspector);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_INSPECTORID,
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
			return (VRCorporationInspector)result;
		}
	}

	/**
	 * Removes the vr corporation inspector where inspectorid = &#63; from the database.
	 *
	 * @param inspectorid the inspectorid
	 * @return the vr corporation inspector that was removed
	 */
	@Override
	public VRCorporationInspector removeByInspectorId(long inspectorid)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = findByInspectorId(inspectorid);

		return remove(vrCorporationInspector);
	}

	/**
	 * Returns the number of vr corporation inspectors where inspectorid = &#63;.
	 *
	 * @param inspectorid the inspectorid
	 * @return the number of matching vr corporation inspectors
	 */
	@Override
	public int countByInspectorId(long inspectorid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORID;

		Object[] finderArgs = new Object[] { inspectorid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONINSPECTOR_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorid);

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

	private static final String _FINDER_COLUMN_INSPECTORID_INSPECTORID_2 = "vrCorporationInspector.inspectorid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEAMID = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTeamId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEAMID =
		new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTeamId",
			new String[] { Long.class.getName() },
			VRCorporationInspectorModelImpl.TEAMID_COLUMN_BITMASK |
			VRCorporationInspectorModelImpl.INSPECTORNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEAMID = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTeamId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr corporation inspectors where teamId = &#63;.
	 *
	 * @param teamId the team ID
	 * @return the matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByTeamId(long teamId) {
		return findByTeamId(teamId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation inspectors where teamId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param teamId the team ID
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @return the range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByTeamId(long teamId, int start,
		int end) {
		return findByTeamId(teamId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation inspectors where teamId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param teamId the team ID
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByTeamId(long teamId, int start,
		int end, OrderByComparator<VRCorporationInspector> orderByComparator) {
		return findByTeamId(teamId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation inspectors where teamId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param teamId the team ID
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByTeamId(long teamId, int start,
		int end, OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEAMID;
			finderArgs = new Object[] { teamId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEAMID;
			finderArgs = new Object[] { teamId, start, end, orderByComparator };
		}

		List<VRCorporationInspector> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationInspector>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationInspector vrCorporationInspector : list) {
					if ((teamId != vrCorporationInspector.getTeamId())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE);

			query.append(_FINDER_COLUMN_TEAMID_TEAMID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationInspectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(teamId);

				if (!pagination) {
					list = (List<VRCorporationInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationInspector>)QueryUtil.list(q,
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
	 * Returns the first vr corporation inspector in the ordered set where teamId = &#63;.
	 *
	 * @param teamId the team ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector findByTeamId_First(long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = fetchByTeamId_First(teamId,
				orderByComparator);

		if (vrCorporationInspector != null) {
			return vrCorporationInspector;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("teamId=");
		msg.append(teamId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationInspectorException(msg.toString());
	}

	/**
	 * Returns the first vr corporation inspector in the ordered set where teamId = &#63;.
	 *
	 * @param teamId the team ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector fetchByTeamId_First(long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		List<VRCorporationInspector> list = findByTeamId(teamId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation inspector in the ordered set where teamId = &#63;.
	 *
	 * @param teamId the team ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector findByTeamId_Last(long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = fetchByTeamId_Last(teamId,
				orderByComparator);

		if (vrCorporationInspector != null) {
			return vrCorporationInspector;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("teamId=");
		msg.append(teamId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationInspectorException(msg.toString());
	}

	/**
	 * Returns the last vr corporation inspector in the ordered set where teamId = &#63;.
	 *
	 * @param teamId the team ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector fetchByTeamId_Last(long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		int count = countByTeamId(teamId);

		if (count == 0) {
			return null;
		}

		List<VRCorporationInspector> list = findByTeamId(teamId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where teamId = &#63;.
	 *
	 * @param id the primary key of the current vr corporation inspector
	 * @param teamId the team ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector[] findByTeamId_PrevAndNext(long id,
		long teamId, OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationInspector[] array = new VRCorporationInspectorImpl[3];

			array[0] = getByTeamId_PrevAndNext(session, vrCorporationInspector,
					teamId, orderByComparator, true);

			array[1] = vrCorporationInspector;

			array[2] = getByTeamId_PrevAndNext(session, vrCorporationInspector,
					teamId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCorporationInspector getByTeamId_PrevAndNext(Session session,
		VRCorporationInspector vrCorporationInspector, long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE);

		query.append(_FINDER_COLUMN_TEAMID_TEAMID_2);

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
			query.append(VRCorporationInspectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(teamId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationInspector);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationInspector> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation inspectors where teamId = &#63; from the database.
	 *
	 * @param teamId the team ID
	 */
	@Override
	public void removeByTeamId(long teamId) {
		for (VRCorporationInspector vrCorporationInspector : findByTeamId(
				teamId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationInspector);
		}
	}

	/**
	 * Returns the number of vr corporation inspectors where teamId = &#63;.
	 *
	 * @param teamId the team ID
	 * @return the number of matching vr corporation inspectors
	 */
	@Override
	public int countByTeamId(long teamId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEAMID;

		Object[] finderArgs = new Object[] { teamId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONINSPECTOR_WHERE);

			query.append(_FINDER_COLUMN_TEAMID_TEAMID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(teamId);

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

	private static final String _FINDER_COLUMN_TEAMID_TEAMID_2 = "vrCorporationInspector.teamId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCorporationId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCorporationId",
			new String[] { String.class.getName() },
			VRCorporationInspectorModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRCorporationInspectorModelImpl.INSPECTORNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCorporationId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr corporation inspectors where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByCorporationId(
		String corporationId) {
		return findByCorporationId(corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation inspectors where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @return the range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByCorporationId(
		String corporationId, int start, int end) {
		return findByCorporationId(corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation inspectors where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByCorporationId(
		String corporationId, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return findByCorporationId(corporationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation inspectors where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByCorporationId(
		String corporationId, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] { corporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] {
					corporationId,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationInspector> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationInspector>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationInspector vrCorporationInspector : list) {
					if (!Objects.equals(corporationId,
								vrCorporationInspector.getCorporationId())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationInspectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				if (!pagination) {
					list = (List<VRCorporationInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationInspector>)QueryUtil.list(q,
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
	 * Returns the first vr corporation inspector in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector findByCorporationId_First(
		String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = fetchByCorporationId_First(corporationId,
				orderByComparator);

		if (vrCorporationInspector != null) {
			return vrCorporationInspector;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationInspectorException(msg.toString());
	}

	/**
	 * Returns the first vr corporation inspector in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector fetchByCorporationId_First(
		String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		List<VRCorporationInspector> list = findByCorporationId(corporationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation inspector in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector findByCorporationId_Last(
		String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = fetchByCorporationId_Last(corporationId,
				orderByComparator);

		if (vrCorporationInspector != null) {
			return vrCorporationInspector;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationInspectorException(msg.toString());
	}

	/**
	 * Returns the last vr corporation inspector in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector fetchByCorporationId_Last(
		String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		int count = countByCorporationId(corporationId);

		if (count == 0) {
			return null;
		}

		List<VRCorporationInspector> list = findByCorporationId(corporationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where corporationId = &#63;.
	 *
	 * @param id the primary key of the current vr corporation inspector
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector[] findByCorporationId_PrevAndNext(long id,
		String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationInspector[] array = new VRCorporationInspectorImpl[3];

			array[0] = getByCorporationId_PrevAndNext(session,
					vrCorporationInspector, corporationId, orderByComparator,
					true);

			array[1] = vrCorporationInspector;

			array[2] = getByCorporationId_PrevAndNext(session,
					vrCorporationInspector, corporationId, orderByComparator,
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

	protected VRCorporationInspector getByCorporationId_PrevAndNext(
		Session session, VRCorporationInspector vrCorporationInspector,
		String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE);

		boolean bindCorporationId = false;

		if (corporationId == null) {
			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
		}
		else if (corporationId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
		}
		else {
			bindCorporationId = true;

			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
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
			query.append(VRCorporationInspectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationId) {
			qPos.add(corporationId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationInspector);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationInspector> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation inspectors where corporationId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 */
	@Override
	public void removeByCorporationId(String corporationId) {
		for (VRCorporationInspector vrCorporationInspector : findByCorporationId(
				corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationInspector);
		}
	}

	/**
	 * Returns the number of vr corporation inspectors where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the number of matching vr corporation inspectors
	 */
	@Override
	public int countByCorporationId(String corporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONINSPECTOR_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
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

	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "vrCorporationInspector.corporationId IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "vrCorporationInspector.corporationId = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(vrCorporationInspector.corporationId IS NULL OR vrCorporationInspector.corporationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCODE =
		new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectorcode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE =
		new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInspectorcode",
			new String[] { String.class.getName() },
			VRCorporationInspectorModelImpl.CONTACTCODE_COLUMN_BITMASK |
			VRCorporationInspectorModelImpl.INSPECTORNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORCODE = new FinderPath(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorcode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr corporation inspectors where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @return the matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByInspectorcode(String contactcode) {
		return findByInspectorcode(contactcode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation inspectors where contactcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contactcode the contactcode
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @return the range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByInspectorcode(
		String contactcode, int start, int end) {
		return findByInspectorcode(contactcode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation inspectors where contactcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contactcode the contactcode
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByInspectorcode(
		String contactcode, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return findByInspectorcode(contactcode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr corporation inspectors where contactcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contactcode the contactcode
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findByInspectorcode(
		String contactcode, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE;
			finderArgs = new Object[] { contactcode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCODE;
			finderArgs = new Object[] { contactcode, start, end, orderByComparator };
		}

		List<VRCorporationInspector> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationInspector>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationInspector vrCorporationInspector : list) {
					if (!Objects.equals(contactcode,
								vrCorporationInspector.getContactcode())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE);

			boolean bindContactcode = false;

			if (contactcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_1);
			}
			else if (contactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_3);
			}
			else {
				bindContactcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationInspectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContactcode) {
					qPos.add(contactcode);
				}

				if (!pagination) {
					list = (List<VRCorporationInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationInspector>)QueryUtil.list(q,
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
	 * Returns the first vr corporation inspector in the ordered set where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector findByInspectorcode_First(
		String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = fetchByInspectorcode_First(contactcode,
				orderByComparator);

		if (vrCorporationInspector != null) {
			return vrCorporationInspector;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contactcode=");
		msg.append(contactcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationInspectorException(msg.toString());
	}

	/**
	 * Returns the first vr corporation inspector in the ordered set where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector fetchByInspectorcode_First(
		String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		List<VRCorporationInspector> list = findByInspectorcode(contactcode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation inspector in the ordered set where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector findByInspectorcode_Last(String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = fetchByInspectorcode_Last(contactcode,
				orderByComparator);

		if (vrCorporationInspector != null) {
			return vrCorporationInspector;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contactcode=");
		msg.append(contactcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationInspectorException(msg.toString());
	}

	/**
	 * Returns the last vr corporation inspector in the ordered set where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	 */
	@Override
	public VRCorporationInspector fetchByInspectorcode_Last(
		String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		int count = countByInspectorcode(contactcode);

		if (count == 0) {
			return null;
		}

		List<VRCorporationInspector> list = findByInspectorcode(contactcode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where contactcode = &#63;.
	 *
	 * @param id the primary key of the current vr corporation inspector
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector[] findByInspectorcode_PrevAndNext(long id,
		String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationInspector[] array = new VRCorporationInspectorImpl[3];

			array[0] = getByInspectorcode_PrevAndNext(session,
					vrCorporationInspector, contactcode, orderByComparator, true);

			array[1] = vrCorporationInspector;

			array[2] = getByInspectorcode_PrevAndNext(session,
					vrCorporationInspector, contactcode, orderByComparator,
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

	protected VRCorporationInspector getByInspectorcode_PrevAndNext(
		Session session, VRCorporationInspector vrCorporationInspector,
		String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator,
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

		query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE);

		boolean bindContactcode = false;

		if (contactcode == null) {
			query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_1);
		}
		else if (contactcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_3);
		}
		else {
			bindContactcode = true;

			query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_2);
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
			query.append(VRCorporationInspectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindContactcode) {
			qPos.add(contactcode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationInspector);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationInspector> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation inspectors where contactcode = &#63; from the database.
	 *
	 * @param contactcode the contactcode
	 */
	@Override
	public void removeByInspectorcode(String contactcode) {
		for (VRCorporationInspector vrCorporationInspector : findByInspectorcode(
				contactcode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationInspector);
		}
	}

	/**
	 * Returns the number of vr corporation inspectors where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @return the number of matching vr corporation inspectors
	 */
	@Override
	public int countByInspectorcode(String contactcode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORCODE;

		Object[] finderArgs = new Object[] { contactcode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONINSPECTOR_WHERE);

			boolean bindContactcode = false;

			if (contactcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_1);
			}
			else if (contactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_3);
			}
			else {
				bindContactcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContactcode) {
					qPos.add(contactcode);
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

	private static final String _FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_1 = "vrCorporationInspector.contactcode IS NULL";
	private static final String _FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_2 = "vrCorporationInspector.contactcode = ?";
	private static final String _FINDER_COLUMN_INSPECTORCODE_CONTACTCODE_3 = "(vrCorporationInspector.contactcode IS NULL OR vrCorporationInspector.contactcode = '')";

	public VRCorporationInspectorPersistenceImpl() {
		setModelClass(VRCorporationInspector.class);
	}

	/**
	 * Caches the vr corporation inspector in the entity cache if it is enabled.
	 *
	 * @param vrCorporationInspector the vr corporation inspector
	 */
	@Override
	public void cacheResult(VRCorporationInspector vrCorporationInspector) {
		entityCache.putResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			vrCorporationInspector.getPrimaryKey(), vrCorporationInspector);

		finderCache.putResult(FINDER_PATH_FETCH_BY_INSPECTORID,
			new Object[] { vrCorporationInspector.getInspectorid() },
			vrCorporationInspector);

		vrCorporationInspector.resetOriginalValues();
	}

	/**
	 * Caches the vr corporation inspectors in the entity cache if it is enabled.
	 *
	 * @param vrCorporationInspectors the vr corporation inspectors
	 */
	@Override
	public void cacheResult(
		List<VRCorporationInspector> vrCorporationInspectors) {
		for (VRCorporationInspector vrCorporationInspector : vrCorporationInspectors) {
			if (entityCache.getResult(
						VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
						VRCorporationInspectorImpl.class,
						vrCorporationInspector.getPrimaryKey()) == null) {
				cacheResult(vrCorporationInspector);
			}
			else {
				vrCorporationInspector.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr corporation inspectors.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCorporationInspectorImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr corporation inspector.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCorporationInspector vrCorporationInspector) {
		entityCache.removeResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			vrCorporationInspector.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRCorporationInspectorModelImpl)vrCorporationInspector,
			true);
	}

	@Override
	public void clearCache(List<VRCorporationInspector> vrCorporationInspectors) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCorporationInspector vrCorporationInspector : vrCorporationInspectors) {
			entityCache.removeResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
				VRCorporationInspectorImpl.class,
				vrCorporationInspector.getPrimaryKey());

			clearUniqueFindersCache((VRCorporationInspectorModelImpl)vrCorporationInspector,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRCorporationInspectorModelImpl vrCorporationInspectorModelImpl) {
		Object[] args = new Object[] {
				vrCorporationInspectorModelImpl.getInspectorid()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_INSPECTORID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_INSPECTORID, args,
			vrCorporationInspectorModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRCorporationInspectorModelImpl vrCorporationInspectorModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrCorporationInspectorModelImpl.getInspectorid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_INSPECTORID, args);
		}

		if ((vrCorporationInspectorModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTORID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrCorporationInspectorModelImpl.getOriginalInspectorid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_INSPECTORID, args);
		}
	}

	/**
	 * Creates a new vr corporation inspector with the primary key. Does not add the vr corporation inspector to the database.
	 *
	 * @param id the primary key for the new vr corporation inspector
	 * @return the new vr corporation inspector
	 */
	@Override
	public VRCorporationInspector create(long id) {
		VRCorporationInspector vrCorporationInspector = new VRCorporationInspectorImpl();

		vrCorporationInspector.setNew(true);
		vrCorporationInspector.setPrimaryKey(id);

		return vrCorporationInspector;
	}

	/**
	 * Removes the vr corporation inspector with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr corporation inspector
	 * @return the vr corporation inspector that was removed
	 * @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector remove(long id)
		throws NoSuchVRCorporationInspectorException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr corporation inspector with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr corporation inspector
	 * @return the vr corporation inspector that was removed
	 * @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector remove(Serializable primaryKey)
		throws NoSuchVRCorporationInspectorException {
		Session session = null;

		try {
			session = openSession();

			VRCorporationInspector vrCorporationInspector = (VRCorporationInspector)session.get(VRCorporationInspectorImpl.class,
					primaryKey);

			if (vrCorporationInspector == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCorporationInspectorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrCorporationInspector);
		}
		catch (NoSuchVRCorporationInspectorException nsee) {
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
	protected VRCorporationInspector removeImpl(
		VRCorporationInspector vrCorporationInspector) {
		vrCorporationInspector = toUnwrappedModel(vrCorporationInspector);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrCorporationInspector)) {
				vrCorporationInspector = (VRCorporationInspector)session.get(VRCorporationInspectorImpl.class,
						vrCorporationInspector.getPrimaryKeyObj());
			}

			if (vrCorporationInspector != null) {
				session.delete(vrCorporationInspector);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrCorporationInspector != null) {
			clearCache(vrCorporationInspector);
		}

		return vrCorporationInspector;
	}

	@Override
	public VRCorporationInspector updateImpl(
		VRCorporationInspector vrCorporationInspector) {
		vrCorporationInspector = toUnwrappedModel(vrCorporationInspector);

		boolean isNew = vrCorporationInspector.isNew();

		VRCorporationInspectorModelImpl vrCorporationInspectorModelImpl = (VRCorporationInspectorModelImpl)vrCorporationInspector;

		Session session = null;

		try {
			session = openSession();

			if (vrCorporationInspector.isNew()) {
				session.save(vrCorporationInspector);

				vrCorporationInspector.setNew(false);
			}
			else {
				vrCorporationInspector = (VRCorporationInspector)session.merge(vrCorporationInspector);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRCorporationInspectorModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrCorporationInspectorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEAMID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationInspectorModelImpl.getOriginalTeamId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TEAMID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEAMID,
					args);

				args = new Object[] { vrCorporationInspectorModelImpl.getTeamId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TEAMID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEAMID,
					args);
			}

			if ((vrCorporationInspectorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationInspectorModelImpl.getOriginalCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] {
						vrCorporationInspectorModelImpl.getCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((vrCorporationInspectorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationInspectorModelImpl.getOriginalContactcode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE,
					args);

				args = new Object[] {
						vrCorporationInspectorModelImpl.getContactcode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE,
					args);
			}
		}

		entityCache.putResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationInspectorImpl.class,
			vrCorporationInspector.getPrimaryKey(), vrCorporationInspector,
			false);

		clearUniqueFindersCache(vrCorporationInspectorModelImpl, false);
		cacheUniqueFindersCache(vrCorporationInspectorModelImpl);

		vrCorporationInspector.resetOriginalValues();

		return vrCorporationInspector;
	}

	protected VRCorporationInspector toUnwrappedModel(
		VRCorporationInspector vrCorporationInspector) {
		if (vrCorporationInspector instanceof VRCorporationInspectorImpl) {
			return vrCorporationInspector;
		}

		VRCorporationInspectorImpl vrCorporationInspectorImpl = new VRCorporationInspectorImpl();

		vrCorporationInspectorImpl.setNew(vrCorporationInspector.isNew());
		vrCorporationInspectorImpl.setPrimaryKey(vrCorporationInspector.getPrimaryKey());

		vrCorporationInspectorImpl.setId(vrCorporationInspector.getId());
		vrCorporationInspectorImpl.setMtCore(vrCorporationInspector.getMtCore());
		vrCorporationInspectorImpl.setCorporationId(vrCorporationInspector.getCorporationId());
		vrCorporationInspectorImpl.setInspectorid(vrCorporationInspector.getInspectorid());
		vrCorporationInspectorImpl.setInspectorName(vrCorporationInspector.getInspectorName());
		vrCorporationInspectorImpl.setInspectorPhone(vrCorporationInspector.getInspectorPhone());
		vrCorporationInspectorImpl.setInspectorEmail(vrCorporationInspector.getInspectorEmail());
		vrCorporationInspectorImpl.setContactcode(vrCorporationInspector.getContactcode());
		vrCorporationInspectorImpl.setRegularTthc(vrCorporationInspector.getRegularTthc());
		vrCorporationInspectorImpl.setSearchVehicle(vrCorporationInspector.getSearchVehicle());
		vrCorporationInspectorImpl.setTeamId(vrCorporationInspector.getTeamId());
		vrCorporationInspectorImpl.setMarkupTeamLeader(vrCorporationInspector.getMarkupTeamLeader());
		vrCorporationInspectorImpl.setMarkUpBoss(vrCorporationInspector.getMarkUpBoss());
		vrCorporationInspectorImpl.setExecutedictionary(vrCorporationInspector.getExecutedictionary());
		vrCorporationInspectorImpl.setPlace(vrCorporationInspector.getPlace());
		vrCorporationInspectorImpl.setTitle(vrCorporationInspector.getTitle());
		vrCorporationInspectorImpl.setFilechukyId(vrCorporationInspector.getFilechukyId());

		return vrCorporationInspectorImpl;
	}

	/**
	 * Returns the vr corporation inspector with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr corporation inspector
	 * @return the vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCorporationInspectorException {
		VRCorporationInspector vrCorporationInspector = fetchByPrimaryKey(primaryKey);

		if (vrCorporationInspector == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCorporationInspectorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrCorporationInspector;
	}

	/**
	 * Returns the vr corporation inspector with the primary key or throws a {@link NoSuchVRCorporationInspectorException} if it could not be found.
	 *
	 * @param id the primary key of the vr corporation inspector
	 * @return the vr corporation inspector
	 * @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector findByPrimaryKey(long id)
		throws NoSuchVRCorporationInspectorException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr corporation inspector with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr corporation inspector
	 * @return the vr corporation inspector, or <code>null</code> if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
				VRCorporationInspectorImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCorporationInspector vrCorporationInspector = (VRCorporationInspector)serializable;

		if (vrCorporationInspector == null) {
			Session session = null;

			try {
				session = openSession();

				vrCorporationInspector = (VRCorporationInspector)session.get(VRCorporationInspectorImpl.class,
						primaryKey);

				if (vrCorporationInspector != null) {
					cacheResult(vrCorporationInspector);
				}
				else {
					entityCache.putResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
						VRCorporationInspectorImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationInspectorImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrCorporationInspector;
	}

	/**
	 * Returns the vr corporation inspector with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr corporation inspector
	 * @return the vr corporation inspector, or <code>null</code> if a vr corporation inspector with the primary key could not be found
	 */
	@Override
	public VRCorporationInspector fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCorporationInspector> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCorporationInspector> map = new HashMap<Serializable, VRCorporationInspector>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCorporationInspector vrCorporationInspector = fetchByPrimaryKey(primaryKey);

			if (vrCorporationInspector != null) {
				map.put(primaryKey, vrCorporationInspector);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationInspectorImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCorporationInspector)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE_PKS_IN);

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

			for (VRCorporationInspector vrCorporationInspector : (List<VRCorporationInspector>)q.list()) {
				map.put(vrCorporationInspector.getPrimaryKeyObj(),
					vrCorporationInspector);

				cacheResult(vrCorporationInspector);

				uncachedPrimaryKeys.remove(vrCorporationInspector.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCorporationInspectorModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationInspectorImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr corporation inspectors.
	 *
	 * @return the vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation inspectors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @return the range of vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation inspectors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findAll(int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation inspectors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation inspectors
	 * @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr corporation inspectors
	 */
	@Override
	public List<VRCorporationInspector> findAll(int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator,
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

		List<VRCorporationInspector> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationInspector>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCORPORATIONINSPECTOR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCORPORATIONINSPECTOR;

				if (pagination) {
					sql = sql.concat(VRCorporationInspectorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCorporationInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationInspector>)QueryUtil.list(q,
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
	 * Removes all the vr corporation inspectors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCorporationInspector vrCorporationInspector : findAll()) {
			remove(vrCorporationInspector);
		}
	}

	/**
	 * Returns the number of vr corporation inspectors.
	 *
	 * @return the number of vr corporation inspectors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCORPORATIONINSPECTOR);

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
		return VRCorporationInspectorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr corporation inspector persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCorporationInspectorImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCORPORATIONINSPECTOR = "SELECT vrCorporationInspector FROM VRCorporationInspector vrCorporationInspector";
	private static final String _SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE_PKS_IN = "SELECT vrCorporationInspector FROM VRCorporationInspector vrCorporationInspector WHERE id IN (";
	private static final String _SQL_SELECT_VRCORPORATIONINSPECTOR_WHERE = "SELECT vrCorporationInspector FROM VRCorporationInspector vrCorporationInspector WHERE ";
	private static final String _SQL_COUNT_VRCORPORATIONINSPECTOR = "SELECT COUNT(vrCorporationInspector) FROM VRCorporationInspector vrCorporationInspector";
	private static final String _SQL_COUNT_VRCORPORATIONINSPECTOR_WHERE = "SELECT COUNT(vrCorporationInspector) FROM VRCorporationInspector vrCorporationInspector WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrCorporationInspector.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCorporationInspector exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCorporationInspector exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCorporationInspectorPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"corporationId", "inspectorName", "inspectorPhone",
				"inspectorEmail", "regularTthc", "searchVehicle", "teamId",
				"markupTeamLeader", "markUpBoss", "filechukyId"
			});
}