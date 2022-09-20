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

import com.fds.vr.business.exception.NoSuchVRCorporationViewException;
import com.fds.vr.business.model.VRCorporationView;
import com.fds.vr.business.model.impl.VRCorporationViewImpl;
import com.fds.vr.business.model.impl.VRCorporationViewModelImpl;
import com.fds.vr.business.service.persistence.VRCorporationViewPersistence;

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
 * The persistence implementation for the vr corporation view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCorporationViewPersistence
 * @see com.fds.vr.business.service.persistence.VRCorporationViewUtil
 * @generated
 */
@ProviderType
public class VRCorporationViewPersistenceImpl extends BasePersistenceImpl<VRCorporationView>
	implements VRCorporationViewPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCorporationViewUtil} to access the vr corporation view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCorporationViewImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORID =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectorId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInspectorId",
			new String[] { Long.class.getName() },
			VRCorporationViewModelImpl.INSPECTORID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORID = new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr corporation views where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @return the matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByInspectorId(long inspectorId) {
		return findByInspectorId(inspectorId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation views where inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @return the range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByInspectorId(long inspectorId,
		int start, int end) {
		return findByInspectorId(inspectorId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation views where inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByInspectorId(long inspectorId,
		int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return findByInspectorId(inspectorId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr corporation views where inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByInspectorId(long inspectorId,
		int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID;
			finderArgs = new Object[] { inspectorId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORID;
			finderArgs = new Object[] { inspectorId, start, end, orderByComparator };
		}

		List<VRCorporationView> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationView>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationView vrCorporationView : list) {
					if ((inspectorId != vrCorporationView.getInspectorId())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationViewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

				if (!pagination) {
					list = (List<VRCorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationView>)QueryUtil.list(q,
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
	 * Returns the first vr corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByInspectorId_First(long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByInspectorId_First(inspectorId,
				orderByComparator);

		if (vrCorporationView != null) {
			return vrCorporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationViewException(msg.toString());
	}

	/**
	 * Returns the first vr corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByInspectorId_First(long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		List<VRCorporationView> list = findByInspectorId(inspectorId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByInspectorId_Last(long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByInspectorId_Last(inspectorId,
				orderByComparator);

		if (vrCorporationView != null) {
			return vrCorporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationViewException(msg.toString());
	}

	/**
	 * Returns the last vr corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByInspectorId_Last(long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		int count = countByInspectorId(inspectorId);

		if (count == 0) {
			return null;
		}

		List<VRCorporationView> list = findByInspectorId(inspectorId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation views before and after the current vr corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param id the primary key of the current vr corporation view
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation view
	 * @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView[] findByInspectorId_PrevAndNext(long id,
		long inspectorId, OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationView[] array = new VRCorporationViewImpl[3];

			array[0] = getByInspectorId_PrevAndNext(session, vrCorporationView,
					inspectorId, orderByComparator, true);

			array[1] = vrCorporationView;

			array[2] = getByInspectorId_PrevAndNext(session, vrCorporationView,
					inspectorId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCorporationView getByInspectorId_PrevAndNext(Session session,
		VRCorporationView vrCorporationView, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

		query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

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
			query.append(VRCorporationViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectorId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationView);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation views where inspectorId = &#63; from the database.
	 *
	 * @param inspectorId the inspector ID
	 */
	@Override
	public void removeByInspectorId(long inspectorId) {
		for (VRCorporationView vrCorporationView : findByInspectorId(
				inspectorId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationView);
		}
	}

	/**
	 * Returns the number of vr corporation views where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @return the number of matching vr corporation views
	 */
	@Override
	public int countByInspectorId(long inspectorId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORID;

		Object[] finderArgs = new Object[] { inspectorId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

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

	private static final String _FINDER_COLUMN_INSPECTORID_INSPECTORID_2 = "vrCorporationView.inspectorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCorporationId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCorporationId",
			new String[] { String.class.getName() },
			VRCorporationViewModelImpl.CORPORATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCorporationId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr corporation views where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByCorporationId(String corporationId) {
		return findByCorporationId(corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation views where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @return the range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByCorporationId(String corporationId,
		int start, int end) {
		return findByCorporationId(corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation views where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByCorporationId(String corporationId,
		int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return findByCorporationId(corporationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation views where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByCorporationId(String corporationId,
		int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
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

		List<VRCorporationView> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationView>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationView vrCorporationView : list) {
					if (!Objects.equals(corporationId,
								vrCorporationView.getCorporationId())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

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
				query.append(VRCorporationViewModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationView>)QueryUtil.list(q,
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
	 * Returns the first vr corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByCorporationId_First(String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByCorporationId_First(corporationId,
				orderByComparator);

		if (vrCorporationView != null) {
			return vrCorporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationViewException(msg.toString());
	}

	/**
	 * Returns the first vr corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByCorporationId_First(String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		List<VRCorporationView> list = findByCorporationId(corporationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByCorporationId_Last(String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByCorporationId_Last(corporationId,
				orderByComparator);

		if (vrCorporationView != null) {
			return vrCorporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationViewException(msg.toString());
	}

	/**
	 * Returns the last vr corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByCorporationId_Last(String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		int count = countByCorporationId(corporationId);

		if (count == 0) {
			return null;
		}

		List<VRCorporationView> list = findByCorporationId(corporationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation views before and after the current vr corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param id the primary key of the current vr corporation view
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation view
	 * @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView[] findByCorporationId_PrevAndNext(long id,
		String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationView[] array = new VRCorporationViewImpl[3];

			array[0] = getByCorporationId_PrevAndNext(session,
					vrCorporationView, corporationId, orderByComparator, true);

			array[1] = vrCorporationView;

			array[2] = getByCorporationId_PrevAndNext(session,
					vrCorporationView, corporationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCorporationView getByCorporationId_PrevAndNext(
		Session session, VRCorporationView vrCorporationView,
		String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

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
			query.append(VRCorporationViewModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationView);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation views where corporationId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 */
	@Override
	public void removeByCorporationId(String corporationId) {
		for (VRCorporationView vrCorporationView : findByCorporationId(
				corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationView);
		}
	}

	/**
	 * Returns the number of vr corporation views where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the number of matching vr corporation views
	 */
	@Override
	public int countByCorporationId(String corporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONVIEW_WHERE);

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

	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "vrCorporationView.corporationId IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "vrCorporationView.corporationId = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(vrCorporationView.corporationId IS NULL OR vrCorporationView.corporationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectorIdCorporationId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectorIdCorporationId",
			new String[] { String.class.getName(), Long.class.getName() },
			VRCorporationViewModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRCorporationViewModelImpl.INSPECTORID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectorIdCorporationId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @return the matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByInspectorIdCorporationId(
		String corporationId, long inspectorId) {
		return findByInspectorIdCorporationId(corporationId, inspectorId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @return the range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByInspectorIdCorporationId(
		String corporationId, long inspectorId, int start, int end) {
		return findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByInspectorIdCorporationId(
		String corporationId, long inspectorId, int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByInspectorIdCorporationId(
		String corporationId, long inspectorId, int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID;
			finderArgs = new Object[] { corporationId, inspectorId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID;
			finderArgs = new Object[] {
					corporationId, inspectorId,
					
					start, end, orderByComparator
				};
		}

		List<VRCorporationView> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationView>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationView vrCorporationView : list) {
					if (!Objects.equals(corporationId,
								vrCorporationView.getCorporationId()) ||
							(inspectorId != vrCorporationView.getInspectorId())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationViewModelImpl.ORDER_BY_JPQL);
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

				qPos.add(inspectorId);

				if (!pagination) {
					list = (List<VRCorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationView>)QueryUtil.list(q,
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
	 * Returns the first vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByInspectorIdCorporationId_First(
		String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByInspectorIdCorporationId_First(corporationId,
				inspectorId, orderByComparator);

		if (vrCorporationView != null) {
			return vrCorporationView;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(", inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationViewException(msg.toString());
	}

	/**
	 * Returns the first vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByInspectorIdCorporationId_First(
		String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		List<VRCorporationView> list = findByInspectorIdCorporationId(corporationId,
				inspectorId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByInspectorIdCorporationId_Last(
		String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByInspectorIdCorporationId_Last(corporationId,
				inspectorId, orderByComparator);

		if (vrCorporationView != null) {
			return vrCorporationView;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(", inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationViewException(msg.toString());
	}

	/**
	 * Returns the last vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByInspectorIdCorporationId_Last(
		String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		int count = countByInspectorIdCorporationId(corporationId, inspectorId);

		if (count == 0) {
			return null;
		}

		List<VRCorporationView> list = findByInspectorIdCorporationId(corporationId,
				inspectorId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation views before and after the current vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param id the primary key of the current vr corporation view
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation view
	 * @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView[] findByInspectorIdCorporationId_PrevAndNext(
		long id, String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationView[] array = new VRCorporationViewImpl[3];

			array[0] = getByInspectorIdCorporationId_PrevAndNext(session,
					vrCorporationView, corporationId, inspectorId,
					orderByComparator, true);

			array[1] = vrCorporationView;

			array[2] = getByInspectorIdCorporationId_PrevAndNext(session,
					vrCorporationView, corporationId, inspectorId,
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

	protected VRCorporationView getByInspectorIdCorporationId_PrevAndNext(
		Session session, VRCorporationView vrCorporationView,
		String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

		boolean bindCorporationId = false;

		if (corporationId == null) {
			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_1);
		}
		else if (corporationId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3);
		}
		else {
			bindCorporationId = true;

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2);
		}

		query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2);

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
			query.append(VRCorporationViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationId) {
			qPos.add(corporationId);
		}

		qPos.add(inspectorId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationView);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation views where corporationId = &#63; and inspectorId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 */
	@Override
	public void removeByInspectorIdCorporationId(String corporationId,
		long inspectorId) {
		for (VRCorporationView vrCorporationView : findByInspectorIdCorporationId(
				corporationId, inspectorId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrCorporationView);
		}
	}

	/**
	 * Returns the number of vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @return the number of matching vr corporation views
	 */
	@Override
	public int countByInspectorIdCorporationId(String corporationId,
		long inspectorId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId, inspectorId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(inspectorId);

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

	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_1 =
		"vrCorporationView.corporationId IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2 =
		"vrCorporationView.corporationId = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3 =
		"(vrCorporationView.corporationId IS NULL OR vrCorporationView.corporationId = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2 =
		"vrCorporationView.inspectorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISLEADER = new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIsLeader",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIsLeader",
			new String[] { Integer.class.getName() },
			VRCorporationViewModelImpl.ISLEADER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISLEADER = new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIsLeader",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the vr corporation views where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @return the matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByIsLeader(int isLeader) {
		return findByIsLeader(isLeader, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr corporation views where isLeader = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isLeader the is leader
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @return the range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByIsLeader(int isLeader, int start,
		int end) {
		return findByIsLeader(isLeader, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation views where isLeader = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isLeader the is leader
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByIsLeader(int isLeader, int start,
		int end, OrderByComparator<VRCorporationView> orderByComparator) {
		return findByIsLeader(isLeader, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation views where isLeader = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isLeader the is leader
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr corporation views
	 */
	@Override
	public List<VRCorporationView> findByIsLeader(int isLeader, int start,
		int end, OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER;
			finderArgs = new Object[] { isLeader };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISLEADER;
			finderArgs = new Object[] { isLeader, start, end, orderByComparator };
		}

		List<VRCorporationView> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationView>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCorporationView vrCorporationView : list) {
					if ((isLeader != vrCorporationView.getIsLeader())) {
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

			query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_ISLEADER_ISLEADER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCorporationViewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isLeader);

				if (!pagination) {
					list = (List<VRCorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationView>)QueryUtil.list(q,
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
	 * Returns the first vr corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByIsLeader_First(int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByIsLeader_First(isLeader,
				orderByComparator);

		if (vrCorporationView != null) {
			return vrCorporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isLeader=");
		msg.append(isLeader);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationViewException(msg.toString());
	}

	/**
	 * Returns the first vr corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByIsLeader_First(int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator) {
		List<VRCorporationView> list = findByIsLeader(isLeader, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByIsLeader_Last(int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByIsLeader_Last(isLeader,
				orderByComparator);

		if (vrCorporationView != null) {
			return vrCorporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isLeader=");
		msg.append(isLeader);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCorporationViewException(msg.toString());
	}

	/**
	 * Returns the last vr corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByIsLeader_Last(int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator) {
		int count = countByIsLeader(isLeader);

		if (count == 0) {
			return null;
		}

		List<VRCorporationView> list = findByIsLeader(isLeader, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr corporation views before and after the current vr corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param id the primary key of the current vr corporation view
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr corporation view
	 * @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView[] findByIsLeader_PrevAndNext(long id,
		int isLeader, OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCorporationView[] array = new VRCorporationViewImpl[3];

			array[0] = getByIsLeader_PrevAndNext(session, vrCorporationView,
					isLeader, orderByComparator, true);

			array[1] = vrCorporationView;

			array[2] = getByIsLeader_PrevAndNext(session, vrCorporationView,
					isLeader, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCorporationView getByIsLeader_PrevAndNext(Session session,
		VRCorporationView vrCorporationView, int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

		query.append(_FINDER_COLUMN_ISLEADER_ISLEADER_2);

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
			query.append(VRCorporationViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isLeader);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCorporationView);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCorporationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr corporation views where isLeader = &#63; from the database.
	 *
	 * @param isLeader the is leader
	 */
	@Override
	public void removeByIsLeader(int isLeader) {
		for (VRCorporationView vrCorporationView : findByIsLeader(isLeader,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCorporationView);
		}
	}

	/**
	 * Returns the number of vr corporation views where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @return the number of matching vr corporation views
	 */
	@Override
	public int countByIsLeader(int isLeader) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISLEADER;

		Object[] finderArgs = new Object[] { isLeader };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_ISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isLeader);

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

	private static final String _FINDER_COLUMN_ISLEADER_ISLEADER_2 = "vrCorporationView.isLeader = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectorIdCorporationIdIsLeader",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			VRCorporationViewModelImpl.INSPECTORID_COLUMN_BITMASK |
			VRCorporationViewModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRCorporationViewModelImpl.ISLEADER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectorIdCorporationIdIsLeader",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByInspectorIdCorporationIdIsLeader(
		long inspectorId, String corporationId, int isLeader)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByInspectorIdCorporationIdIsLeader(inspectorId,
				corporationId, isLeader);

		if (vrCorporationView == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectorId=");
			msg.append(inspectorId);

			msg.append(", corporationId=");
			msg.append(corporationId);

			msg.append(", isLeader=");
			msg.append(isLeader);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRCorporationViewException(msg.toString());
		}

		return vrCorporationView;
	}

	/**
	 * Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, String corporationId, int isLeader) {
		return fetchByInspectorIdCorporationIdIsLeader(inspectorId,
			corporationId, isLeader, true);
	}

	/**
	 * Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, String corporationId, int isLeader,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { inspectorId, corporationId, isLeader };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
					finderArgs, this);
		}

		if (result instanceof VRCorporationView) {
			VRCorporationView vrCorporationView = (VRCorporationView)result;

			if ((inspectorId != vrCorporationView.getInspectorId()) ||
					!Objects.equals(corporationId,
						vrCorporationView.getCorporationId()) ||
					(isLeader != vrCorporationView.getIsLeader())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_INSPECTORID_2);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(isLeader);

				List<VRCorporationView> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRCorporationViewPersistenceImpl.fetchByInspectorIdCorporationIdIsLeader(long, String, int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRCorporationView vrCorporationView = list.get(0);

					result = vrCorporationView;

					cacheResult(vrCorporationView);

					if ((vrCorporationView.getInspectorId() != inspectorId) ||
							(vrCorporationView.getCorporationId() == null) ||
							!vrCorporationView.getCorporationId()
												  .equals(corporationId) ||
							(vrCorporationView.getIsLeader() != isLeader)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
							finderArgs, vrCorporationView);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
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
			return (VRCorporationView)result;
		}
	}

	/**
	 * Removes the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; from the database.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the vr corporation view that was removed
	 */
	@Override
	public VRCorporationView removeByInspectorIdCorporationIdIsLeader(
		long inspectorId, String corporationId, int isLeader)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = findByInspectorIdCorporationIdIsLeader(inspectorId,
				corporationId, isLeader);

		return remove(vrCorporationView);
	}

	/**
	 * Returns the number of vr corporation views where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the number of matching vr corporation views
	 */
	@Override
	public int countByInspectorIdCorporationIdIsLeader(long inspectorId,
		String corporationId, int isLeader) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER;

		Object[] finderArgs = new Object[] { inspectorId, corporationId, isLeader };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_INSPECTORID_2);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(isLeader);

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

	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_INSPECTORID_2 =
		"vrCorporationView.inspectorId = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_1 =
		"vrCorporationView.corporationId IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_2 =
		"vrCorporationView.corporationId = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_3 =
		"(vrCorporationView.corporationId IS NULL OR vrCorporationView.corporationId = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_ISLEADER_2 =
		"vrCorporationView.isLeader = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED,
			VRCorporationViewImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCorporationIdAndIsLeader",
			new String[] { String.class.getName(), Integer.class.getName() },
			VRCorporationViewModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRCorporationViewModelImpl.ISLEADER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER =
		new FinderPath(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCorporationIdAndIsLeader",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the matching vr corporation view
	 * @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView findByCorporationIdAndIsLeader(
		String corporationId, int isLeader)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByCorporationIdAndIsLeader(corporationId,
				isLeader);

		if (vrCorporationView == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("corporationId=");
			msg.append(corporationId);

			msg.append(", isLeader=");
			msg.append(isLeader);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRCorporationViewException(msg.toString());
		}

		return vrCorporationView;
	}

	/**
	 * Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByCorporationIdAndIsLeader(
		String corporationId, int isLeader) {
		return fetchByCorporationIdAndIsLeader(corporationId, isLeader, true);
	}

	/**
	 * Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	 */
	@Override
	public VRCorporationView fetchByCorporationIdAndIsLeader(
		String corporationId, int isLeader, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { corporationId, isLeader };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
					finderArgs, this);
		}

		if (result instanceof VRCorporationView) {
			VRCorporationView vrCorporationView = (VRCorporationView)result;

			if (!Objects.equals(corporationId,
						vrCorporationView.getCorporationId()) ||
					(isLeader != vrCorporationView.getIsLeader())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(isLeader);

				List<VRCorporationView> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRCorporationViewPersistenceImpl.fetchByCorporationIdAndIsLeader(String, int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRCorporationView vrCorporationView = list.get(0);

					result = vrCorporationView;

					cacheResult(vrCorporationView);

					if ((vrCorporationView.getCorporationId() == null) ||
							!vrCorporationView.getCorporationId()
												  .equals(corporationId) ||
							(vrCorporationView.getIsLeader() != isLeader)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
							finderArgs, vrCorporationView);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
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
			return (VRCorporationView)result;
		}
	}

	/**
	 * Removes the vr corporation view where corporationId = &#63; and isLeader = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the vr corporation view that was removed
	 */
	@Override
	public VRCorporationView removeByCorporationIdAndIsLeader(
		String corporationId, int isLeader)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = findByCorporationIdAndIsLeader(corporationId,
				isLeader);

		return remove(vrCorporationView);
	}

	/**
	 * Returns the number of vr corporation views where corporationId = &#63; and isLeader = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the number of matching vr corporation views
	 */
	@Override
	public int countByCorporationIdAndIsLeader(String corporationId,
		int isLeader) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER;

		Object[] finderArgs = new Object[] { corporationId, isLeader };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(isLeader);

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

	private static final String _FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_1 =
		"vrCorporationView.corporationId IS NULL AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_2 =
		"vrCorporationView.corporationId = ? AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_3 =
		"(vrCorporationView.corporationId IS NULL OR vrCorporationView.corporationId = '') AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDISLEADER_ISLEADER_2 =
		"vrCorporationView.isLeader = ?";

	public VRCorporationViewPersistenceImpl() {
		setModelClass(VRCorporationView.class);
	}

	/**
	 * Caches the vr corporation view in the entity cache if it is enabled.
	 *
	 * @param vrCorporationView the vr corporation view
	 */
	@Override
	public void cacheResult(VRCorporationView vrCorporationView) {
		entityCache.putResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewImpl.class, vrCorporationView.getPrimaryKey(),
			vrCorporationView);

		finderCache.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
			new Object[] {
				vrCorporationView.getInspectorId(),
				vrCorporationView.getCorporationId(),
				vrCorporationView.getIsLeader()
			}, vrCorporationView);

		finderCache.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
			new Object[] {
				vrCorporationView.getCorporationId(),
				vrCorporationView.getIsLeader()
			}, vrCorporationView);

		vrCorporationView.resetOriginalValues();
	}

	/**
	 * Caches the vr corporation views in the entity cache if it is enabled.
	 *
	 * @param vrCorporationViews the vr corporation views
	 */
	@Override
	public void cacheResult(List<VRCorporationView> vrCorporationViews) {
		for (VRCorporationView vrCorporationView : vrCorporationViews) {
			if (entityCache.getResult(
						VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
						VRCorporationViewImpl.class,
						vrCorporationView.getPrimaryKey()) == null) {
				cacheResult(vrCorporationView);
			}
			else {
				vrCorporationView.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr corporation views.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCorporationViewImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr corporation view.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCorporationView vrCorporationView) {
		entityCache.removeResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewImpl.class, vrCorporationView.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRCorporationViewModelImpl)vrCorporationView,
			true);
	}

	@Override
	public void clearCache(List<VRCorporationView> vrCorporationViews) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCorporationView vrCorporationView : vrCorporationViews) {
			entityCache.removeResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
				VRCorporationViewImpl.class, vrCorporationView.getPrimaryKey());

			clearUniqueFindersCache((VRCorporationViewModelImpl)vrCorporationView,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRCorporationViewModelImpl vrCorporationViewModelImpl) {
		Object[] args = new Object[] {
				vrCorporationViewModelImpl.getInspectorId(),
				vrCorporationViewModelImpl.getCorporationId(),
				vrCorporationViewModelImpl.getIsLeader()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
			args, vrCorporationViewModelImpl, false);

		args = new Object[] {
				vrCorporationViewModelImpl.getCorporationId(),
				vrCorporationViewModelImpl.getIsLeader()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
			args, vrCorporationViewModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRCorporationViewModelImpl vrCorporationViewModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrCorporationViewModelImpl.getInspectorId(),
					vrCorporationViewModelImpl.getCorporationId(),
					vrCorporationViewModelImpl.getIsLeader()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
				args);
		}

		if ((vrCorporationViewModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrCorporationViewModelImpl.getOriginalInspectorId(),
					vrCorporationViewModelImpl.getOriginalCorporationId(),
					vrCorporationViewModelImpl.getOriginalIsLeader()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
				args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrCorporationViewModelImpl.getCorporationId(),
					vrCorporationViewModelImpl.getIsLeader()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
				args);
		}

		if ((vrCorporationViewModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrCorporationViewModelImpl.getOriginalCorporationId(),
					vrCorporationViewModelImpl.getOriginalIsLeader()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
				args);
		}
	}

	/**
	 * Creates a new vr corporation view with the primary key. Does not add the vr corporation view to the database.
	 *
	 * @param id the primary key for the new vr corporation view
	 * @return the new vr corporation view
	 */
	@Override
	public VRCorporationView create(long id) {
		VRCorporationView vrCorporationView = new VRCorporationViewImpl();

		vrCorporationView.setNew(true);
		vrCorporationView.setPrimaryKey(id);

		return vrCorporationView;
	}

	/**
	 * Removes the vr corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr corporation view
	 * @return the vr corporation view that was removed
	 * @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView remove(long id)
		throws NoSuchVRCorporationViewException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr corporation view
	 * @return the vr corporation view that was removed
	 * @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView remove(Serializable primaryKey)
		throws NoSuchVRCorporationViewException {
		Session session = null;

		try {
			session = openSession();

			VRCorporationView vrCorporationView = (VRCorporationView)session.get(VRCorporationViewImpl.class,
					primaryKey);

			if (vrCorporationView == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCorporationViewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrCorporationView);
		}
		catch (NoSuchVRCorporationViewException nsee) {
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
	protected VRCorporationView removeImpl(VRCorporationView vrCorporationView) {
		vrCorporationView = toUnwrappedModel(vrCorporationView);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrCorporationView)) {
				vrCorporationView = (VRCorporationView)session.get(VRCorporationViewImpl.class,
						vrCorporationView.getPrimaryKeyObj());
			}

			if (vrCorporationView != null) {
				session.delete(vrCorporationView);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrCorporationView != null) {
			clearCache(vrCorporationView);
		}

		return vrCorporationView;
	}

	@Override
	public VRCorporationView updateImpl(VRCorporationView vrCorporationView) {
		vrCorporationView = toUnwrappedModel(vrCorporationView);

		boolean isNew = vrCorporationView.isNew();

		VRCorporationViewModelImpl vrCorporationViewModelImpl = (VRCorporationViewModelImpl)vrCorporationView;

		Session session = null;

		try {
			session = openSession();

			if (vrCorporationView.isNew()) {
				session.save(vrCorporationView);

				vrCorporationView.setNew(false);
			}
			else {
				vrCorporationView = (VRCorporationView)session.merge(vrCorporationView);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRCorporationViewModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrCorporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationViewModelImpl.getOriginalInspectorId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID,
					args);

				args = new Object[] { vrCorporationViewModelImpl.getInspectorId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID,
					args);
			}

			if ((vrCorporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationViewModelImpl.getOriginalCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] {
						vrCorporationViewModelImpl.getCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((vrCorporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationViewModelImpl.getOriginalCorporationId(),
						vrCorporationViewModelImpl.getOriginalInspectorId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID,
					args);

				args = new Object[] {
						vrCorporationViewModelImpl.getCorporationId(),
						vrCorporationViewModelImpl.getInspectorId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID,
					args);
			}

			if ((vrCorporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrCorporationViewModelImpl.getOriginalIsLeader()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISLEADER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER,
					args);

				args = new Object[] { vrCorporationViewModelImpl.getIsLeader() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISLEADER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER,
					args);
			}
		}

		entityCache.putResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			VRCorporationViewImpl.class, vrCorporationView.getPrimaryKey(),
			vrCorporationView, false);

		clearUniqueFindersCache(vrCorporationViewModelImpl, false);
		cacheUniqueFindersCache(vrCorporationViewModelImpl);

		vrCorporationView.resetOriginalValues();

		return vrCorporationView;
	}

	protected VRCorporationView toUnwrappedModel(
		VRCorporationView vrCorporationView) {
		if (vrCorporationView instanceof VRCorporationViewImpl) {
			return vrCorporationView;
		}

		VRCorporationViewImpl vrCorporationViewImpl = new VRCorporationViewImpl();

		vrCorporationViewImpl.setNew(vrCorporationView.isNew());
		vrCorporationViewImpl.setPrimaryKey(vrCorporationView.getPrimaryKey());

		vrCorporationViewImpl.setId(vrCorporationView.getId());
		vrCorporationViewImpl.setMtCore(vrCorporationView.getMtCore());
		vrCorporationViewImpl.setCorporationId(vrCorporationView.getCorporationId());
		vrCorporationViewImpl.setCorporationName(vrCorporationView.getCorporationName());
		vrCorporationViewImpl.setInspectorId(vrCorporationView.getInspectorId());
		vrCorporationViewImpl.setIsLeader(vrCorporationView.getIsLeader());

		return vrCorporationViewImpl;
	}

	/**
	 * Returns the vr corporation view with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr corporation view
	 * @return the vr corporation view
	 * @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCorporationViewException {
		VRCorporationView vrCorporationView = fetchByPrimaryKey(primaryKey);

		if (vrCorporationView == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCorporationViewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrCorporationView;
	}

	/**
	 * Returns the vr corporation view with the primary key or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	 *
	 * @param id the primary key of the vr corporation view
	 * @return the vr corporation view
	 * @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView findByPrimaryKey(long id)
		throws NoSuchVRCorporationViewException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr corporation view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr corporation view
	 * @return the vr corporation view, or <code>null</code> if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
				VRCorporationViewImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCorporationView vrCorporationView = (VRCorporationView)serializable;

		if (vrCorporationView == null) {
			Session session = null;

			try {
				session = openSession();

				vrCorporationView = (VRCorporationView)session.get(VRCorporationViewImpl.class,
						primaryKey);

				if (vrCorporationView != null) {
					cacheResult(vrCorporationView);
				}
				else {
					entityCache.putResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
						VRCorporationViewImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationViewImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrCorporationView;
	}

	/**
	 * Returns the vr corporation view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr corporation view
	 * @return the vr corporation view, or <code>null</code> if a vr corporation view with the primary key could not be found
	 */
	@Override
	public VRCorporationView fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCorporationView> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCorporationView> map = new HashMap<Serializable, VRCorporationView>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCorporationView vrCorporationView = fetchByPrimaryKey(primaryKey);

			if (vrCorporationView != null) {
				map.put(primaryKey, vrCorporationView);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationViewImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCorporationView)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCORPORATIONVIEW_WHERE_PKS_IN);

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

			for (VRCorporationView vrCorporationView : (List<VRCorporationView>)q.list()) {
				map.put(vrCorporationView.getPrimaryKeyObj(), vrCorporationView);

				cacheResult(vrCorporationView);

				uncachedPrimaryKeys.remove(vrCorporationView.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCorporationViewModelImpl.ENTITY_CACHE_ENABLED,
					VRCorporationViewImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr corporation views.
	 *
	 * @return the vr corporation views
	 */
	@Override
	public List<VRCorporationView> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr corporation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @return the range of vr corporation views
	 */
	@Override
	public List<VRCorporationView> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr corporation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr corporation views
	 */
	@Override
	public List<VRCorporationView> findAll(int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr corporation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr corporation views
	 * @param end the upper bound of the range of vr corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr corporation views
	 */
	@Override
	public List<VRCorporationView> findAll(int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
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

		List<VRCorporationView> list = null;

		if (retrieveFromCache) {
			list = (List<VRCorporationView>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCORPORATIONVIEW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCORPORATIONVIEW;

				if (pagination) {
					sql = sql.concat(VRCorporationViewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCorporationView>)QueryUtil.list(q,
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
	 * Removes all the vr corporation views from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCorporationView vrCorporationView : findAll()) {
			remove(vrCorporationView);
		}
	}

	/**
	 * Returns the number of vr corporation views.
	 *
	 * @return the number of vr corporation views
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCORPORATIONVIEW);

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
		return VRCorporationViewModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr corporation view persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCorporationViewImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCORPORATIONVIEW = "SELECT vrCorporationView FROM VRCorporationView vrCorporationView";
	private static final String _SQL_SELECT_VRCORPORATIONVIEW_WHERE_PKS_IN = "SELECT vrCorporationView FROM VRCorporationView vrCorporationView WHERE id IN (";
	private static final String _SQL_SELECT_VRCORPORATIONVIEW_WHERE = "SELECT vrCorporationView FROM VRCorporationView vrCorporationView WHERE ";
	private static final String _SQL_COUNT_VRCORPORATIONVIEW = "SELECT COUNT(vrCorporationView) FROM VRCorporationView vrCorporationView";
	private static final String _SQL_COUNT_VRCORPORATIONVIEW_WHERE = "SELECT COUNT(vrCorporationView) FROM VRCorporationView vrCorporationView WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrCorporationView.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCorporationView exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCorporationView exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCorporationViewPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"corporationId", "corporationName", "inspectorId", "isLeader"
			});
}