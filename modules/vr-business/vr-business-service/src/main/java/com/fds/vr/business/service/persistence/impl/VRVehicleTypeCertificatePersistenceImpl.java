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

import com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateImpl;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl;
import com.fds.vr.business.service.persistence.VRVehicleTypeCertificatePersistence;

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
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vr vehicle type certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleTypeCertificatePersistence
 * @see com.fds.vr.business.service.persistence.VRVehicleTypeCertificateUtil
 * @generated
 */
@ProviderType
public class VRVehicleTypeCertificatePersistenceImpl extends BasePersistenceImpl<VRVehicleTypeCertificate>
	implements VRVehicleTypeCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRVehicleTypeCertificateUtil} to access the vr vehicle type certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRVehicleTypeCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORID =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectorId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInspectorId",
			new String[] { Long.class.getName() },
			VRVehicleTypeCertificateModelImpl.INSPECTORID_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORID = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectorId(long inspectorId) {
		return findByInspectorId(inspectorId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectorId(long inspectorId,
		int start, int end) {
		return findByInspectorId(inspectorId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectorId(long inspectorId,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByInspectorId(inspectorId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectorId(long inspectorId,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if ((inspectorId != vrVehicleTypeCertificate.getInspectorId())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByInspectorId_First(long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByInspectorId_First(inspectorId,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByInspectorId_First(long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByInspectorId(inspectorId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByInspectorId_Last(long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByInspectorId_Last(inspectorId,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByInspectorId_Last(long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByInspectorId(inspectorId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByInspectorId(inspectorId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByInspectorId_PrevAndNext(long id,
		long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByInspectorId_PrevAndNext(session,
					vrVehicleTypeCertificate, inspectorId, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByInspectorId_PrevAndNext(session,
					vrVehicleTypeCertificate, inspectorId, orderByComparator,
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

	protected VRVehicleTypeCertificate getByInspectorId_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectorId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where inspectorId = &#63; from the database.
	 *
	 * @param inspectorId the inspector ID
	 */
	@Override
	public void removeByInspectorId(long inspectorId) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByInspectorId(
				inspectorId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByInspectorId(long inspectorId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORID;

		Object[] finderArgs = new Object[] { inspectorId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

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

	private static final String _FINDER_COLUMN_INSPECTORID_INSPECTORID_2 = "vrVehicleTypeCertificate.inspectorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCorporationId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCorporationId",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCorporationId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCorporationId(
		String corporationId) {
		return findByCorporationId(corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCorporationId(
		String corporationId, int start, int end) {
		return findByCorporationId(corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCorporationId(
		String corporationId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByCorporationId(corporationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCorporationId(
		String corporationId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(corporationId,
								vrVehicleTypeCertificate.getCorporationId())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByCorporationId_First(
		String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByCorporationId_First(corporationId,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByCorporationId_First(
		String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByCorporationId(corporationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByCorporationId_Last(
		String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByCorporationId_Last(corporationId,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByCorporationId_Last(
		String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByCorporationId(corporationId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByCorporationId(corporationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where corporationId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByCorporationId_PrevAndNext(long id,
		String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByCorporationId_PrevAndNext(session,
					vrVehicleTypeCertificate, corporationId, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByCorporationId_PrevAndNext(session,
					vrVehicleTypeCertificate, corporationId, orderByComparator,
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

	protected VRVehicleTypeCertificate getByCorporationId_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where corporationId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 */
	@Override
	public void removeByCorporationId(String corporationId) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByCorporationId(
				corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByCorporationId(String corporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

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

	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "vrVehicleTypeCertificate.corporationId IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "vrVehicleTypeCertificate.corporationId = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(vrVehicleTypeCertificate.corporationId IS NULL OR vrVehicleTypeCertificate.corporationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectorIdCorporationId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectorIdCorporationId",
			new String[] { String.class.getName(), Long.class.getName() },
			VRVehicleTypeCertificateModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.INSPECTORID_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectorIdCorporationId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		String corporationId, long inspectorId) {
		return findByInspectorIdCorporationId(corporationId, inspectorId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		String corporationId, long inspectorId, int start, int end) {
		return findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		String corporationId, long inspectorId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		String corporationId, long inspectorId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(corporationId,
								vrVehicleTypeCertificate.getCorporationId()) ||
							(inspectorId != vrVehicleTypeCertificate.getInspectorId())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByInspectorIdCorporationId_First(
		String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByInspectorIdCorporationId_First(corporationId,
				inspectorId, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(", inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByInspectorIdCorporationId_First(
		String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByInspectorIdCorporationId(corporationId,
				inspectorId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByInspectorIdCorporationId_Last(
		String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByInspectorIdCorporationId_Last(corporationId,
				inspectorId, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(", inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByInspectorIdCorporationId_Last(
		String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByInspectorIdCorporationId(corporationId, inspectorId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByInspectorIdCorporationId(corporationId,
				inspectorId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByInspectorIdCorporationId_PrevAndNext(
		long id, String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByInspectorIdCorporationId_PrevAndNext(session,
					vrVehicleTypeCertificate, corporationId, inspectorId,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByInspectorIdCorporationId_PrevAndNext(session,
					vrVehicleTypeCertificate, corporationId, inspectorId,
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

	protected VRVehicleTypeCertificate getByInspectorIdCorporationId_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 */
	@Override
	public void removeByInspectorIdCorporationId(String corporationId,
		long inspectorId) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByInspectorIdCorporationId(
				corporationId, inspectorId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByInspectorIdCorporationId(String corporationId,
		long inspectorId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId, inspectorId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

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
		"vrVehicleTypeCertificate.corporationId IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2 =
		"vrVehicleTypeCertificate.corporationId = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3 =
		"(vrVehicleTypeCertificate.corporationId IS NULL OR vrVehicleTypeCertificate.corporationId = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2 =
		"vrVehicleTypeCertificate.inspectorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServiceCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServiceCode",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SERVICECODE = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where serviceCode = &#63;.
	 *
	 * @param serviceCode the service code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCode(String serviceCode) {
		return findByServiceCode(serviceCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCode(
		String serviceCode, int start, int end) {
		return findByServiceCode(serviceCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCode(
		String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByServiceCode(serviceCode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCode(
		String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODE;
			finderArgs = new Object[] { serviceCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICECODE;
			finderArgs = new Object[] { serviceCode, start, end, orderByComparator };
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(serviceCode,
								vrVehicleTypeCertificate.getServiceCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByServiceCode_First(
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByServiceCode_First(serviceCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByServiceCode_First(
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByServiceCode(serviceCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByServiceCode_Last(String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByServiceCode_Last(serviceCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByServiceCode_Last(
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByServiceCode(serviceCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByServiceCode(serviceCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByServiceCode_PrevAndNext(long id,
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByServiceCode_PrevAndNext(session,
					vrVehicleTypeCertificate, serviceCode, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByServiceCode_PrevAndNext(session,
					vrVehicleTypeCertificate, serviceCode, orderByComparator,
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

	protected VRVehicleTypeCertificate getByServiceCode_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where serviceCode = &#63; from the database.
	 *
	 * @param serviceCode the service code
	 */
	@Override
	public void removeByServiceCode(String serviceCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByServiceCode(
				serviceCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where serviceCode = &#63;.
	 *
	 * @param serviceCode the service code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByServiceCode(String serviceCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICECODE;

		Object[] finderArgs = new Object[] { serviceCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_SERVICECODE_SERVICECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_SERVICECODE_SERVICECODE_1 = "vrVehicleTypeCertificate.serviceCode IS NULL";
	private static final String _FINDER_COLUMN_SERVICECODE_SERVICECODE_2 = "vrVehicleTypeCertificate.serviceCode = ?";
	private static final String _FINDER_COLUMN_SERVICECODE_SERVICECODE_3 = "(vrVehicleTypeCertificate.serviceCode IS NULL OR vrVehicleTypeCertificate.serviceCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTIDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApplicantIdNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApplicantIdNo",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTIDNO = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByApplicantIdNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantIdNo(
		String applicantIdNo) {
		return findByApplicantIdNo(applicantIdNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantIdNo(
		String applicantIdNo, int start, int end) {
		return findByApplicantIdNo(applicantIdNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantIdNo(
		String applicantIdNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByApplicantIdNo(applicantIdNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantIdNo(
		String applicantIdNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByApplicantIdNo_First(
		String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByApplicantIdNo_First(applicantIdNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByApplicantIdNo_First(
		String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByApplicantIdNo(applicantIdNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByApplicantIdNo_Last(
		String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByApplicantIdNo_Last(applicantIdNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByApplicantIdNo_Last(
		String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByApplicantIdNo(applicantIdNo);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByApplicantIdNo(applicantIdNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param applicantIdNo the applicant ID no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByApplicantIdNo_PrevAndNext(long id,
		String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByApplicantIdNo_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByApplicantIdNo_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, orderByComparator,
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

	protected VRVehicleTypeCertificate getByApplicantIdNo_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where applicantIdNo = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 */
	@Override
	public void removeByApplicantIdNo(String applicantIdNo) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByApplicantIdNo(
				applicantIdNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where applicantIdNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByApplicantIdNo(String applicantIdNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTIDNO;

		Object[] finderArgs = new Object[] { applicantIdNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

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

	private static final String _FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_1 = "vrVehicleTypeCertificate.applicantIdNo IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_2 = "vrVehicleTypeCertificate.applicantIdNo = ?";
	private static final String _FINDER_COLUMN_APPLICANTIDNO_APPLICANTIDNO_3 = "(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTANDPRODUCTIONPLANT =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByApplicantAndProductionPlant",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDPRODUCTIONPLANT =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByApplicantAndProductionPlant",
			new String[] { String.class.getName(), String.class.getName() },
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTANDPRODUCTIONPLANT =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByApplicantAndProductionPlant",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		String applicantIdNo, String productionPlantCode) {
		return findByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		String applicantIdNo, String productionPlantCode, int start, int end) {
		return findByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		String applicantIdNo, String productionPlantCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		String applicantIdNo, String productionPlantCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDPRODUCTIONPLANT;
			finderArgs = new Object[] { applicantIdNo, productionPlantCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTANDPRODUCTIONPLANT;
			finderArgs = new Object[] {
					applicantIdNo, productionPlantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							!Objects.equals(productionPlantCode,
								vrVehicleTypeCertificate.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_2);
			}

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByApplicantAndProductionPlant_First(
		String applicantIdNo, String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByApplicantAndProductionPlant_First(applicantIdNo,
				productionPlantCode, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByApplicantAndProductionPlant_First(
		String applicantIdNo, String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByApplicantAndProductionPlant(applicantIdNo,
				productionPlantCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByApplicantAndProductionPlant_Last(
		String applicantIdNo, String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByApplicantAndProductionPlant_Last(applicantIdNo,
				productionPlantCode, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByApplicantAndProductionPlant_Last(
		String applicantIdNo, String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByApplicantAndProductionPlant(applicantIdNo,
				productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByApplicantAndProductionPlant(applicantIdNo,
				productionPlantCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByApplicantAndProductionPlant_PrevAndNext(
		long id, String applicantIdNo, String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByApplicantAndProductionPlant_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo,
					productionPlantCode, orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByApplicantAndProductionPlant_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo,
					productionPlantCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleTypeCertificate getByApplicantAndProductionPlant_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String applicantIdNo, String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_2);
		}

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByApplicantAndProductionPlant(String applicantIdNo,
		String productionPlantCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByApplicantAndProductionPlant(
				applicantIdNo, productionPlantCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByApplicantAndProductionPlant(String applicantIdNo,
		String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTANDPRODUCTIONPLANT;

		Object[] finderArgs = new Object[] { applicantIdNo, productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_2);
			}

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_2);
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

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
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

	private static final String _FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_1 =
		"vrVehicleTypeCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_2 =
		"vrVehicleTypeCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_APPLICANTIDNO_3 =
		"(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_1 =
		"vrVehicleTypeCertificate.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_2 =
		"vrVehicleTypeCertificate.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_APPLICANTANDPRODUCTIONPLANT_PRODUCTIONPLANTCODE_3 =
		"(vrVehicleTypeCertificate.productionPlantCode IS NULL OR vrVehicleTypeCertificate.productionPlantCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO_MTCORE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo_MtCore",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO_MTCORE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierNo_MtCore",
			new String[] { String.class.getName(), Long.class.getName() },
			VRVehicleTypeCertificateModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO_MTCORE = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierNo_MtCore",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		String dossierNo, long mtCore) {
		return findByDossierNo_MtCore(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		String dossierNo, long mtCore, int start, int end) {
		return findByDossierNo_MtCore(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		String dossierNo, long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByDossierNo_MtCore(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		String dossierNo, long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO_MTCORE;
			finderArgs = new Object[] { dossierNo, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO_MTCORE;
			finderArgs = new Object[] {
					dossierNo, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(dossierNo,
								vrVehicleTypeCertificate.getDossierNo()) ||
							(mtCore != vrVehicleTypeCertificate.getMtCore())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindDossierNo = false;

			if (dossierNo == null) {
				query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_1);
			}
			else if (dossierNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_3);
			}
			else {
				bindDossierNo = true;

				query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_2);
			}

			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierNo) {
					qPos.add(dossierNo);
				}

				qPos.add(mtCore);

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDossierNo_MtCore_First(
		String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDossierNo_MtCore_First(dossierNo,
				mtCore, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDossierNo_MtCore_First(
		String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByDossierNo_MtCore(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDossierNo_MtCore_Last(
		String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDossierNo_MtCore_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDossierNo_MtCore_Last(
		String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByDossierNo_MtCore(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByDossierNo_MtCore(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByDossierNo_MtCore_PrevAndNext(
		long id, String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByDossierNo_MtCore_PrevAndNext(session,
					vrVehicleTypeCertificate, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByDossierNo_MtCore_PrevAndNext(session,
					vrVehicleTypeCertificate, dossierNo, mtCore,
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

	protected VRVehicleTypeCertificate getByDossierNo_MtCore_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindDossierNo = false;

		if (dossierNo == null) {
			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_1);
		}
		else if (dossierNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_3);
		}
		else {
			bindDossierNo = true;

			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_2);
		}

		query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_MTCORE_2);

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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierNo) {
			qPos.add(dossierNo);
		}

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo_MtCore(String dossierNo, long mtCore) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByDossierNo_MtCore(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByDossierNo_MtCore(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO_MTCORE;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindDossierNo = false;

			if (dossierNo == null) {
				query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_1);
			}
			else if (dossierNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_3);
			}
			else {
				bindDossierNo = true;

				query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_2);
			}

			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierNo) {
					qPos.add(dossierNo);
				}

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

	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_1 = "vrVehicleTypeCertificate.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_2 = "vrVehicleTypeCertificate.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_DOSSIERNO_3 = "(vrVehicleTypeCertificate.dossierNo IS NULL OR vrVehicleTypeCertificate.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_MTCORE_2 = "vrVehicleTypeCertificate.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE;
			finderArgs = new Object[] { deliverableCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE;
			finderArgs = new Object[] {
					deliverableCode,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(deliverableCode,
								vrVehicleTypeCertificate.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindDeliverableCode = false;

			if (deliverableCode == null) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
			}
			else if (deliverableCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
			}
			else {
				bindDeliverableCode = true;

				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeliverableCode) {
					qPos.add(deliverableCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrVehicleTypeCertificate, deliverableCode,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrVehicleTypeCertificate, deliverableCode,
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

	protected VRVehicleTypeCertificate getByDeliverableCode_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindDeliverableCode = false;

		if (deliverableCode == null) {
			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
		}
		else if (deliverableCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
		}
		else {
			bindDeliverableCode = true;

			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDeliverableCode) {
			qPos.add(deliverableCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindDeliverableCode = false;

			if (deliverableCode == null) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
			}
			else if (deliverableCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
			}
			else {
				bindDeliverableCode = true;

				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeliverableCode) {
					qPos.add(deliverableCode);
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

	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1 =
		"vrVehicleTypeCertificate.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrVehicleTypeCertificate.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrVehicleTypeCertificate.deliverableCode IS NULL OR vrVehicleTypeCertificate.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MANUFACTURERFOREIGNCODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByManufacturerForeignCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANUFACTURERFOREIGNCODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByManufacturerForeignCode",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.MANUFACTURERFOREIGNCODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MANUFACTURERFOREIGNCODE = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByManufacturerForeignCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		String manufacturerForeignCode) {
		return findByManufacturerForeignCode(manufacturerForeignCode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		String manufacturerForeignCode, int start, int end) {
		return findByManufacturerForeignCode(manufacturerForeignCode, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		String manufacturerForeignCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByManufacturerForeignCode(manufacturerForeignCode, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		String manufacturerForeignCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANUFACTURERFOREIGNCODE;
			finderArgs = new Object[] { manufacturerForeignCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MANUFACTURERFOREIGNCODE;
			finderArgs = new Object[] {
					manufacturerForeignCode,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(manufacturerForeignCode,
								vrVehicleTypeCertificate.getManufacturerForeignCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindManufacturerForeignCode = false;

			if (manufacturerForeignCode == null) {
				query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_1);
			}
			else if (manufacturerForeignCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_3);
			}
			else {
				bindManufacturerForeignCode = true;

				query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindManufacturerForeignCode) {
					qPos.add(manufacturerForeignCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByManufacturerForeignCode_First(
		String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByManufacturerForeignCode_First(manufacturerForeignCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("manufacturerForeignCode=");
		msg.append(manufacturerForeignCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByManufacturerForeignCode_First(
		String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByManufacturerForeignCode(manufacturerForeignCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByManufacturerForeignCode_Last(
		String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByManufacturerForeignCode_Last(manufacturerForeignCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("manufacturerForeignCode=");
		msg.append(manufacturerForeignCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByManufacturerForeignCode_Last(
		String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByManufacturerForeignCode(manufacturerForeignCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByManufacturerForeignCode(manufacturerForeignCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByManufacturerForeignCode_PrevAndNext(
		long id, String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByManufacturerForeignCode_PrevAndNext(session,
					vrVehicleTypeCertificate, manufacturerForeignCode,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByManufacturerForeignCode_PrevAndNext(session,
					vrVehicleTypeCertificate, manufacturerForeignCode,
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

	protected VRVehicleTypeCertificate getByManufacturerForeignCode_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindManufacturerForeignCode = false;

		if (manufacturerForeignCode == null) {
			query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_1);
		}
		else if (manufacturerForeignCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_3);
		}
		else {
			bindManufacturerForeignCode = true;

			query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindManufacturerForeignCode) {
			qPos.add(manufacturerForeignCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where manufacturerForeignCode = &#63; from the database.
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 */
	@Override
	public void removeByManufacturerForeignCode(String manufacturerForeignCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByManufacturerForeignCode(
				manufacturerForeignCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where manufacturerForeignCode = &#63;.
	 *
	 * @param manufacturerForeignCode the manufacturer foreign code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByManufacturerForeignCode(String manufacturerForeignCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MANUFACTURERFOREIGNCODE;

		Object[] finderArgs = new Object[] { manufacturerForeignCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindManufacturerForeignCode = false;

			if (manufacturerForeignCode == null) {
				query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_1);
			}
			else if (manufacturerForeignCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_3);
			}
			else {
				bindManufacturerForeignCode = true;

				query.append(_FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindManufacturerForeignCode) {
					qPos.add(manufacturerForeignCode);
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

	private static final String _FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_1 =
		"vrVehicleTypeCertificate.manufacturerForeignCode IS NULL";
	private static final String _FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_2 =
		"vrVehicleTypeCertificate.manufacturerForeignCode = ?";
	private static final String _FINDER_COLUMN_MANUFACTURERFOREIGNCODE_MANUFACTURERFOREIGNCODE_3 =
		"(vrVehicleTypeCertificate.manufacturerForeignCode IS NULL OR vrVehicleTypeCertificate.manufacturerForeignCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCopReportNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCopReportNo",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.COPREPORTNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTNO = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCopReportNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where copReportNo = &#63;.
	 *
	 * @param copReportNo the cop report no
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCopReportNo(String copReportNo) {
		return findByCopReportNo(copReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCopReportNo(
		String copReportNo, int start, int end) {
		return findByCopReportNo(copReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCopReportNo(
		String copReportNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByCopReportNo(copReportNo, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCopReportNo(
		String copReportNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO;
			finderArgs = new Object[] { copReportNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO;
			finderArgs = new Object[] { copReportNo, start, end, orderByComparator };
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(copReportNo,
								vrVehicleTypeCertificate.getCopReportNo())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCopReportNo) {
					qPos.add(copReportNo);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	 *
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByCopReportNo_First(
		String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByCopReportNo_First(copReportNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	 *
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByCopReportNo_First(
		String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByCopReportNo(copReportNo, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	 *
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByCopReportNo_Last(String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByCopReportNo_Last(copReportNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	 *
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByCopReportNo_Last(
		String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByCopReportNo(copReportNo);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByCopReportNo(copReportNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByCopReportNo_PrevAndNext(long id,
		String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByCopReportNo_PrevAndNext(session,
					vrVehicleTypeCertificate, copReportNo, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByCopReportNo_PrevAndNext(session,
					vrVehicleTypeCertificate, copReportNo, orderByComparator,
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

	protected VRVehicleTypeCertificate getByCopReportNo_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCopReportNo) {
			qPos.add(copReportNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where copReportNo = &#63; from the database.
	 *
	 * @param copReportNo the cop report no
	 */
	@Override
	public void removeByCopReportNo(String copReportNo) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByCopReportNo(
				copReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where copReportNo = &#63;.
	 *
	 * @param copReportNo the cop report no
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByCopReportNo(String copReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTNO;

		Object[] finderArgs = new Object[] { copReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1 = "vrVehicleTypeCertificate.copReportNo IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2 = "vrVehicleTypeCertificate.copReportNo = ?";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3 = "(vrVehicleTypeCertificate.copReportNo IS NULL OR vrVehicleTypeCertificate.copReportNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DESIGNERCODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDesignerCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNERCODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDesignerCode",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.DESIGNERCODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DESIGNERCODE = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDesignerCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where designerCode = &#63;.
	 *
	 * @param designerCode the designer code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDesignerCode(
		String designerCode) {
		return findByDesignerCode(designerCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where designerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param designerCode the designer code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDesignerCode(
		String designerCode, int start, int end) {
		return findByDesignerCode(designerCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where designerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param designerCode the designer code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDesignerCode(
		String designerCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByDesignerCode(designerCode, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where designerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param designerCode the designer code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDesignerCode(
		String designerCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNERCODE;
			finderArgs = new Object[] { designerCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DESIGNERCODE;
			finderArgs = new Object[] {
					designerCode,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(designerCode,
								vrVehicleTypeCertificate.getDesignerCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindDesignerCode = false;

			if (designerCode == null) {
				query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_1);
			}
			else if (designerCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_3);
			}
			else {
				bindDesignerCode = true;

				query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDesignerCode) {
					qPos.add(designerCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where designerCode = &#63;.
	 *
	 * @param designerCode the designer code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDesignerCode_First(
		String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDesignerCode_First(designerCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("designerCode=");
		msg.append(designerCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where designerCode = &#63;.
	 *
	 * @param designerCode the designer code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDesignerCode_First(
		String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByDesignerCode(designerCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where designerCode = &#63;.
	 *
	 * @param designerCode the designer code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDesignerCode_Last(
		String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDesignerCode_Last(designerCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("designerCode=");
		msg.append(designerCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where designerCode = &#63;.
	 *
	 * @param designerCode the designer code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDesignerCode_Last(
		String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByDesignerCode(designerCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByDesignerCode(designerCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where designerCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param designerCode the designer code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByDesignerCode_PrevAndNext(long id,
		String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByDesignerCode_PrevAndNext(session,
					vrVehicleTypeCertificate, designerCode, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByDesignerCode_PrevAndNext(session,
					vrVehicleTypeCertificate, designerCode, orderByComparator,
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

	protected VRVehicleTypeCertificate getByDesignerCode_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindDesignerCode = false;

		if (designerCode == null) {
			query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_1);
		}
		else if (designerCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_3);
		}
		else {
			bindDesignerCode = true;

			query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDesignerCode) {
			qPos.add(designerCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where designerCode = &#63; from the database.
	 *
	 * @param designerCode the designer code
	 */
	@Override
	public void removeByDesignerCode(String designerCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByDesignerCode(
				designerCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where designerCode = &#63;.
	 *
	 * @param designerCode the designer code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByDesignerCode(String designerCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DESIGNERCODE;

		Object[] finderArgs = new Object[] { designerCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindDesignerCode = false;

			if (designerCode == null) {
				query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_1);
			}
			else if (designerCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_3);
			}
			else {
				bindDesignerCode = true;

				query.append(_FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDesignerCode) {
					qPos.add(designerCode);
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

	private static final String _FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_1 = "vrVehicleTypeCertificate.designerCode IS NULL";
	private static final String _FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_2 = "vrVehicleTypeCertificate.designerCode = ?";
	private static final String _FINDER_COLUMN_DESIGNERCODE_DESIGNERCODE_3 = "(vrVehicleTypeCertificate.designerCode IS NULL OR vrVehicleTypeCertificate.designerCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VERIFICATIONCERTIFICATENO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVerificationCertificateNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFICATIONCERTIFICATENO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByVerificationCertificateNo",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.VERIFICATIONCERTIFICATENO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VERIFICATIONCERTIFICATENO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVerificationCertificateNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		String verificationCertificateNo) {
		return findByVerificationCertificateNo(verificationCertificateNo,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		String verificationCertificateNo, int start, int end) {
		return findByVerificationCertificateNo(verificationCertificateNo,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		String verificationCertificateNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByVerificationCertificateNo(verificationCertificateNo,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		String verificationCertificateNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFICATIONCERTIFICATENO;
			finderArgs = new Object[] { verificationCertificateNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VERIFICATIONCERTIFICATENO;
			finderArgs = new Object[] {
					verificationCertificateNo,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(verificationCertificateNo,
								vrVehicleTypeCertificate.getVerificationCertificateNo())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindVerificationCertificateNo = false;

			if (verificationCertificateNo == null) {
				query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_1);
			}
			else if (verificationCertificateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_3);
			}
			else {
				bindVerificationCertificateNo = true;

				query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVerificationCertificateNo) {
					qPos.add(verificationCertificateNo);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByVerificationCertificateNo_First(
		String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByVerificationCertificateNo_First(verificationCertificateNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("verificationCertificateNo=");
		msg.append(verificationCertificateNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByVerificationCertificateNo_First(
		String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByVerificationCertificateNo(verificationCertificateNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByVerificationCertificateNo_Last(
		String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByVerificationCertificateNo_Last(verificationCertificateNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("verificationCertificateNo=");
		msg.append(verificationCertificateNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByVerificationCertificateNo_Last(
		String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByVerificationCertificateNo(verificationCertificateNo);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByVerificationCertificateNo(verificationCertificateNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param verificationCertificateNo the verification certificate no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByVerificationCertificateNo_PrevAndNext(
		long id, String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByVerificationCertificateNo_PrevAndNext(session,
					vrVehicleTypeCertificate, verificationCertificateNo,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByVerificationCertificateNo_PrevAndNext(session,
					vrVehicleTypeCertificate, verificationCertificateNo,
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

	protected VRVehicleTypeCertificate getByVerificationCertificateNo_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindVerificationCertificateNo = false;

		if (verificationCertificateNo == null) {
			query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_1);
		}
		else if (verificationCertificateNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_3);
		}
		else {
			bindVerificationCertificateNo = true;

			query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVerificationCertificateNo) {
			qPos.add(verificationCertificateNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where verificationCertificateNo = &#63; from the database.
	 *
	 * @param verificationCertificateNo the verification certificate no
	 */
	@Override
	public void removeByVerificationCertificateNo(
		String verificationCertificateNo) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByVerificationCertificateNo(
				verificationCertificateNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where verificationCertificateNo = &#63;.
	 *
	 * @param verificationCertificateNo the verification certificate no
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByVerificationCertificateNo(
		String verificationCertificateNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VERIFICATIONCERTIFICATENO;

		Object[] finderArgs = new Object[] { verificationCertificateNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindVerificationCertificateNo = false;

			if (verificationCertificateNo == null) {
				query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_1);
			}
			else if (verificationCertificateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_3);
			}
			else {
				bindVerificationCertificateNo = true;

				query.append(_FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVerificationCertificateNo) {
					qPos.add(verificationCertificateNo);
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

	private static final String _FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_1 =
		"vrVehicleTypeCertificate.verificationCertificateNo IS NULL";
	private static final String _FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_2 =
		"vrVehicleTypeCertificate.verificationCertificateNo = ?";
	private static final String _FINDER_COLUMN_VERIFICATIONCERTIFICATENO_VERIFICATIONCERTIFICATENO_3 =
		"(vrVehicleTypeCertificate.verificationCertificateNo IS NULL OR vrVehicleTypeCertificate.verificationCertificateNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DESIGNSYMBOL =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDesignsymbol",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNSYMBOL =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDesignsymbol",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.DESIGNSYMBOL_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DESIGNSYMBOL = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDesignsymbol",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where designSymbol = &#63;.
	 *
	 * @param designSymbol the design symbol
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDesignsymbol(
		String designSymbol) {
		return findByDesignsymbol(designSymbol, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where designSymbol = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param designSymbol the design symbol
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDesignsymbol(
		String designSymbol, int start, int end) {
		return findByDesignsymbol(designSymbol, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where designSymbol = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param designSymbol the design symbol
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDesignsymbol(
		String designSymbol, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByDesignsymbol(designSymbol, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where designSymbol = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param designSymbol the design symbol
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByDesignsymbol(
		String designSymbol, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNSYMBOL;
			finderArgs = new Object[] { designSymbol };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DESIGNSYMBOL;
			finderArgs = new Object[] {
					designSymbol,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(designSymbol,
								vrVehicleTypeCertificate.getDesignSymbol())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindDesignSymbol = false;

			if (designSymbol == null) {
				query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_1);
			}
			else if (designSymbol.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_3);
			}
			else {
				bindDesignSymbol = true;

				query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDesignSymbol) {
					qPos.add(designSymbol);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	 *
	 * @param designSymbol the design symbol
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDesignsymbol_First(
		String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDesignsymbol_First(designSymbol,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("designSymbol=");
		msg.append(designSymbol);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	 *
	 * @param designSymbol the design symbol
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDesignsymbol_First(
		String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByDesignsymbol(designSymbol,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	 *
	 * @param designSymbol the design symbol
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDesignsymbol_Last(
		String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDesignsymbol_Last(designSymbol,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("designSymbol=");
		msg.append(designSymbol);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	 *
	 * @param designSymbol the design symbol
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDesignsymbol_Last(
		String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByDesignsymbol(designSymbol);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByDesignsymbol(designSymbol,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param designSymbol the design symbol
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByDesignsymbol_PrevAndNext(long id,
		String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByDesignsymbol_PrevAndNext(session,
					vrVehicleTypeCertificate, designSymbol, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByDesignsymbol_PrevAndNext(session,
					vrVehicleTypeCertificate, designSymbol, orderByComparator,
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

	protected VRVehicleTypeCertificate getByDesignsymbol_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindDesignSymbol = false;

		if (designSymbol == null) {
			query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_1);
		}
		else if (designSymbol.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_3);
		}
		else {
			bindDesignSymbol = true;

			query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDesignSymbol) {
			qPos.add(designSymbol);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where designSymbol = &#63; from the database.
	 *
	 * @param designSymbol the design symbol
	 */
	@Override
	public void removeByDesignsymbol(String designSymbol) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByDesignsymbol(
				designSymbol, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where designSymbol = &#63;.
	 *
	 * @param designSymbol the design symbol
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByDesignsymbol(String designSymbol) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DESIGNSYMBOL;

		Object[] finderArgs = new Object[] { designSymbol };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindDesignSymbol = false;

			if (designSymbol == null) {
				query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_1);
			}
			else if (designSymbol.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_3);
			}
			else {
				bindDesignSymbol = true;

				query.append(_FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDesignSymbol) {
					qPos.add(designSymbol);
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

	private static final String _FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_1 = "vrVehicleTypeCertificate.designSymbol IS NULL";
	private static final String _FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_2 = "vrVehicleTypeCertificate.designSymbol = ?";
	private static final String _FINDER_COLUMN_DESIGNSYMBOL_DESIGNSYMBOL_3 = "(vrVehicleTypeCertificate.designSymbol IS NULL OR vrVehicleTypeCertificate.designSymbol = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificaterecordno",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificaterecordno",
			new String[] { String.class.getName(), String.class.getName() },
			VRVehicleTypeCertificateModelImpl.CERTIFICATERECORDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDNO = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificaterecordno",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCertificaterecordno(
		String certificateRecordNo, String serviceCode) {
		return findByCertificaterecordno(certificateRecordNo, serviceCode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCertificaterecordno(
		String certificateRecordNo, String serviceCode, int start, int end) {
		return findByCertificaterecordno(certificateRecordNo, serviceCode,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCertificaterecordno(
		String certificateRecordNo, String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByCertificaterecordno(certificateRecordNo, serviceCode,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCertificaterecordno(
		String certificateRecordNo, String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDNO;
			finderArgs = new Object[] { certificateRecordNo, serviceCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDNO;
			finderArgs = new Object[] {
					certificateRecordNo, serviceCode,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(certificateRecordNo,
								vrVehicleTypeCertificate.getCertificateRecordNo()) ||
							!Objects.equals(serviceCode,
								vrVehicleTypeCertificate.getServiceCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindCertificateRecordNo = false;

			if (certificateRecordNo == null) {
				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_1);
			}
			else if (certificateRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_3);
			}
			else {
				bindCertificateRecordNo = true;

				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertificateRecordNo) {
					qPos.add(certificateRecordNo);
				}

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByCertificaterecordno_First(
		String certificateRecordNo, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByCertificaterecordno_First(certificateRecordNo,
				serviceCode, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordNo=");
		msg.append(certificateRecordNo);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByCertificaterecordno_First(
		String certificateRecordNo, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByCertificaterecordno(certificateRecordNo,
				serviceCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByCertificaterecordno_Last(
		String certificateRecordNo, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByCertificaterecordno_Last(certificateRecordNo,
				serviceCode, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordNo=");
		msg.append(certificateRecordNo);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByCertificaterecordno_Last(
		String certificateRecordNo, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByCertificaterecordno(certificateRecordNo, serviceCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByCertificaterecordno(certificateRecordNo,
				serviceCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByCertificaterecordno_PrevAndNext(
		long id, String certificateRecordNo, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByCertificaterecordno_PrevAndNext(session,
					vrVehicleTypeCertificate, certificateRecordNo, serviceCode,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByCertificaterecordno_PrevAndNext(session,
					vrVehicleTypeCertificate, certificateRecordNo, serviceCode,
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

	protected VRVehicleTypeCertificate getByCertificaterecordno_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String certificateRecordNo, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindCertificateRecordNo = false;

		if (certificateRecordNo == null) {
			query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_1);
		}
		else if (certificateRecordNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_3);
		}
		else {
			bindCertificateRecordNo = true;

			query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_2);
		}

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCertificateRecordNo) {
			qPos.add(certificateRecordNo);
		}

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63; from the database.
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 */
	@Override
	public void removeByCertificaterecordno(String certificateRecordNo,
		String serviceCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByCertificaterecordno(
				certificateRecordNo, serviceCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	 *
	 * @param certificateRecordNo the certificate record no
	 * @param serviceCode the service code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByCertificaterecordno(String certificateRecordNo,
		String serviceCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATERECORDNO;

		Object[] finderArgs = new Object[] { certificateRecordNo, serviceCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindCertificateRecordNo = false;

			if (certificateRecordNo == null) {
				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_1);
			}
			else if (certificateRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_3);
			}
			else {
				bindCertificateRecordNo = true;

				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertificateRecordNo) {
					qPos.add(certificateRecordNo);
				}

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

	private static final String _FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_1 =
		"vrVehicleTypeCertificate.certificateRecordNo IS NULL AND ";
	private static final String _FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_2 =
		"vrVehicleTypeCertificate.certificateRecordNo = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATERECORDNO_CERTIFICATERECORDNO_3 =
		"(vrVehicleTypeCertificate.certificateRecordNo IS NULL OR vrVehicleTypeCertificate.certificateRecordNo = '') AND ";
	private static final String _FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_1 =
		"vrVehicleTypeCertificate.serviceCode IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_2 =
		"vrVehicleTypeCertificate.serviceCode = ?";
	private static final String _FINDER_COLUMN_CERTIFICATERECORDNO_SERVICECODE_3 =
		"(vrVehicleTypeCertificate.serviceCode IS NULL OR vrVehicleTypeCertificate.serviceCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EXPIREDSTATUS =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByExpiredstatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUS =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByExpiredstatus",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.EXPIREDSTATUS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EXPIREDSTATUS = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByExpiredstatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByExpiredstatus(
		String expiredStatus) {
		return findByExpiredstatus(expiredStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByExpiredstatus(
		String expiredStatus, int start, int end) {
		return findByExpiredstatus(expiredStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByExpiredstatus(
		String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByExpiredstatus(expiredStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByExpiredstatus(
		String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUS;
			finderArgs = new Object[] { expiredStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EXPIREDSTATUS;
			finderArgs = new Object[] {
					expiredStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(expiredStatus,
								vrVehicleTypeCertificate.getExpiredStatus())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByExpiredstatus_First(
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByExpiredstatus_First(expiredStatus,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("expiredStatus=");
		msg.append(expiredStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByExpiredstatus_First(
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByExpiredstatus(expiredStatus,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByExpiredstatus_Last(
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByExpiredstatus_Last(expiredStatus,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("expiredStatus=");
		msg.append(expiredStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByExpiredstatus_Last(
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByExpiredstatus(expiredStatus);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByExpiredstatus(expiredStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByExpiredstatus_PrevAndNext(long id,
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByExpiredstatus_PrevAndNext(session,
					vrVehicleTypeCertificate, expiredStatus, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByExpiredstatus_PrevAndNext(session,
					vrVehicleTypeCertificate, expiredStatus, orderByComparator,
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

	protected VRVehicleTypeCertificate getByExpiredstatus_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindExpiredStatus = false;

		if (expiredStatus == null) {
			query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_1);
		}
		else if (expiredStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_3);
		}
		else {
			bindExpiredStatus = true;

			query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindExpiredStatus) {
			qPos.add(expiredStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where expiredStatus = &#63; from the database.
	 *
	 * @param expiredStatus the expired status
	 */
	@Override
	public void removeByExpiredstatus(String expiredStatus) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByExpiredstatus(
				expiredStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByExpiredstatus(String expiredStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EXPIREDSTATUS;

		Object[] finderArgs = new Object[] { expiredStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
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

	private static final String _FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_1 = "vrVehicleTypeCertificate.expiredStatus IS NULL";
	private static final String _FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_2 = "vrVehicleTypeCertificate.expiredStatus = ?";
	private static final String _FINDER_COLUMN_EXPIREDSTATUS_EXPIREDSTATUS_3 = "(vrVehicleTypeCertificate.expiredStatus IS NULL OR vrVehicleTypeCertificate.expiredStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EXPIREDSTATUSANDSERVICECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByExpiredstatusAndServiceCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUSANDSERVICECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByExpiredstatusAndServiceCode",
			new String[] { String.class.getName(), String.class.getName() },
			VRVehicleTypeCertificateModelImpl.EXPIREDSTATUS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EXPIREDSTATUSANDSERVICECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByExpiredstatusAndServiceCode",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		String expiredStatus, String serviceCode) {
		return findByExpiredstatusAndServiceCode(expiredStatus, serviceCode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		String expiredStatus, String serviceCode, int start, int end) {
		return findByExpiredstatusAndServiceCode(expiredStatus, serviceCode,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		String expiredStatus, String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByExpiredstatusAndServiceCode(expiredStatus, serviceCode,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		String expiredStatus, String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUSANDSERVICECODE;
			finderArgs = new Object[] { expiredStatus, serviceCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EXPIREDSTATUSANDSERVICECODE;
			finderArgs = new Object[] {
					expiredStatus, serviceCode,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(expiredStatus,
								vrVehicleTypeCertificate.getExpiredStatus()) ||
							!Objects.equals(serviceCode,
								vrVehicleTypeCertificate.getServiceCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByExpiredstatusAndServiceCode_First(
		String expiredStatus, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByExpiredstatusAndServiceCode_First(expiredStatus,
				serviceCode, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("expiredStatus=");
		msg.append(expiredStatus);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByExpiredstatusAndServiceCode_First(
		String expiredStatus, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByExpiredstatusAndServiceCode(expiredStatus,
				serviceCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByExpiredstatusAndServiceCode_Last(
		String expiredStatus, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByExpiredstatusAndServiceCode_Last(expiredStatus,
				serviceCode, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("expiredStatus=");
		msg.append(expiredStatus);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByExpiredstatusAndServiceCode_Last(
		String expiredStatus, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByExpiredstatusAndServiceCode(expiredStatus,
				serviceCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByExpiredstatusAndServiceCode(expiredStatus,
				serviceCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByExpiredstatusAndServiceCode_PrevAndNext(
		long id, String expiredStatus, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByExpiredstatusAndServiceCode_PrevAndNext(session,
					vrVehicleTypeCertificate, expiredStatus, serviceCode,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByExpiredstatusAndServiceCode_PrevAndNext(session,
					vrVehicleTypeCertificate, expiredStatus, serviceCode,
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

	protected VRVehicleTypeCertificate getByExpiredstatusAndServiceCode_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String expiredStatus, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindExpiredStatus = false;

		if (expiredStatus == null) {
			query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_1);
		}
		else if (expiredStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_3);
		}
		else {
			bindExpiredStatus = true;

			query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_2);
		}

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindExpiredStatus) {
			qPos.add(expiredStatus);
		}

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63; from the database.
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 */
	@Override
	public void removeByExpiredstatusAndServiceCode(String expiredStatus,
		String serviceCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByExpiredstatusAndServiceCode(
				expiredStatus, serviceCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByExpiredstatusAndServiceCode(String expiredStatus,
		String serviceCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EXPIREDSTATUSANDSERVICECODE;

		Object[] finderArgs = new Object[] { expiredStatus, serviceCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

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

	private static final String _FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_1 =
		"vrVehicleTypeCertificate.expiredStatus IS NULL AND ";
	private static final String _FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_2 =
		"vrVehicleTypeCertificate.expiredStatus = ? AND ";
	private static final String _FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_EXPIREDSTATUS_3 =
		"(vrVehicleTypeCertificate.expiredStatus IS NULL OR vrVehicleTypeCertificate.expiredStatus = '') AND ";
	private static final String _FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_1 =
		"vrVehicleTypeCertificate.serviceCode IS NULL";
	private static final String _FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_2 =
		"vrVehicleTypeCertificate.serviceCode = ?";
	private static final String _FINDER_COLUMN_EXPIREDSTATUSANDSERVICECODE_SERVICECODE_3 =
		"(vrVehicleTypeCertificate.serviceCode IS NULL OR vrVehicleTypeCertificate.serviceCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPEANDSERVICECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVehicletypeAndServiceCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPEANDSERVICECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByVehicletypeAndServiceCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRVehicleTypeCertificateModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.CERTIFIEDVEHICLETYPE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.CERTIFIEDTRADEMARKNAME_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.CERTIFIEDCOMMERCIALNAME_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.CERTIFIEDMODELCODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPEANDSERVICECODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicletypeAndServiceCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode) {
		return findByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode, int start, int end) {
		return findByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPEANDSERVICECODE;
			finderArgs = new Object[] {
					vehicleClass, certifiedVehicleType, certifiedTrademarkName,
					certifiedCommercialName, certifiedModelCode, serviceCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPEANDSERVICECODE;
			finderArgs = new Object[] {
					vehicleClass, certifiedVehicleType, certifiedTrademarkName,
					certifiedCommercialName, certifiedModelCode, serviceCode,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(vehicleClass,
								vrVehicleTypeCertificate.getVehicleClass()) ||
							!Objects.equals(certifiedVehicleType,
								vrVehicleTypeCertificate.getCertifiedVehicleType()) ||
							!Objects.equals(certifiedTrademarkName,
								vrVehicleTypeCertificate.getCertifiedTrademarkName()) ||
							!Objects.equals(certifiedCommercialName,
								vrVehicleTypeCertificate.getCertifiedCommercialName()) ||
							!Objects.equals(certifiedModelCode,
								vrVehicleTypeCertificate.getCertifiedModelCode()) ||
							!Objects.equals(serviceCode,
								vrVehicleTypeCertificate.getServiceCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_2);
			}

			boolean bindCertifiedVehicleType = false;

			if (certifiedVehicleType == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_1);
			}
			else if (certifiedVehicleType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_3);
			}
			else {
				bindCertifiedVehicleType = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_2);
			}

			boolean bindCertifiedTrademarkName = false;

			if (certifiedTrademarkName == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_1);
			}
			else if (certifiedTrademarkName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_3);
			}
			else {
				bindCertifiedTrademarkName = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_2);
			}

			boolean bindCertifiedCommercialName = false;

			if (certifiedCommercialName == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_1);
			}
			else if (certifiedCommercialName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_3);
			}
			else {
				bindCertifiedCommercialName = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_2);
			}

			boolean bindCertifiedModelCode = false;

			if (certifiedModelCode == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_1);
			}
			else if (certifiedModelCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_3);
			}
			else {
				bindCertifiedModelCode = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindCertifiedVehicleType) {
					qPos.add(certifiedVehicleType);
				}

				if (bindCertifiedTrademarkName) {
					qPos.add(certifiedTrademarkName);
				}

				if (bindCertifiedCommercialName) {
					qPos.add(certifiedCommercialName);
				}

				if (bindCertifiedModelCode) {
					qPos.add(certifiedModelCode);
				}

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByVehicletypeAndServiceCode_First(
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByVehicletypeAndServiceCode_First(vehicleClass,
				certifiedVehicleType, certifiedTrademarkName,
				certifiedCommercialName, certifiedModelCode, serviceCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", certifiedVehicleType=");
		msg.append(certifiedVehicleType);

		msg.append(", certifiedTrademarkName=");
		msg.append(certifiedTrademarkName);

		msg.append(", certifiedCommercialName=");
		msg.append(certifiedCommercialName);

		msg.append(", certifiedModelCode=");
		msg.append(certifiedModelCode);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByVehicletypeAndServiceCode_First(
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByVehicletypeAndServiceCode(vehicleClass,
				certifiedVehicleType, certifiedTrademarkName,
				certifiedCommercialName, certifiedModelCode, serviceCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByVehicletypeAndServiceCode_Last(
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByVehicletypeAndServiceCode_Last(vehicleClass,
				certifiedVehicleType, certifiedTrademarkName,
				certifiedCommercialName, certifiedModelCode, serviceCode,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", certifiedVehicleType=");
		msg.append(certifiedVehicleType);

		msg.append(", certifiedTrademarkName=");
		msg.append(certifiedTrademarkName);

		msg.append(", certifiedCommercialName=");
		msg.append(certifiedCommercialName);

		msg.append(", certifiedModelCode=");
		msg.append(certifiedModelCode);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByVehicletypeAndServiceCode_Last(
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByVehicletypeAndServiceCode(vehicleClass,
				certifiedVehicleType, certifiedTrademarkName,
				certifiedCommercialName, certifiedModelCode, serviceCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByVehicletypeAndServiceCode(vehicleClass,
				certifiedVehicleType, certifiedTrademarkName,
				certifiedCommercialName, certifiedModelCode, serviceCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByVehicletypeAndServiceCode_PrevAndNext(
		long id, String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByVehicletypeAndServiceCode_PrevAndNext(session,
					vrVehicleTypeCertificate, vehicleClass,
					certifiedVehicleType, certifiedTrademarkName,
					certifiedCommercialName, certifiedModelCode, serviceCode,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByVehicletypeAndServiceCode_PrevAndNext(session,
					vrVehicleTypeCertificate, vehicleClass,
					certifiedVehicleType, certifiedTrademarkName,
					certifiedCommercialName, certifiedModelCode, serviceCode,
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

	protected VRVehicleTypeCertificate getByVehicletypeAndServiceCode_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String vehicleClass, String certifiedVehicleType,
		String certifiedTrademarkName, String certifiedCommercialName,
		String certifiedModelCode, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_2);
		}

		boolean bindCertifiedVehicleType = false;

		if (certifiedVehicleType == null) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_1);
		}
		else if (certifiedVehicleType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_3);
		}
		else {
			bindCertifiedVehicleType = true;

			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_2);
		}

		boolean bindCertifiedTrademarkName = false;

		if (certifiedTrademarkName == null) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_1);
		}
		else if (certifiedTrademarkName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_3);
		}
		else {
			bindCertifiedTrademarkName = true;

			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_2);
		}

		boolean bindCertifiedCommercialName = false;

		if (certifiedCommercialName == null) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_1);
		}
		else if (certifiedCommercialName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_3);
		}
		else {
			bindCertifiedCommercialName = true;

			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_2);
		}

		boolean bindCertifiedModelCode = false;

		if (certifiedModelCode == null) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_1);
		}
		else if (certifiedModelCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_3);
		}
		else {
			bindCertifiedModelCode = true;

			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_2);
		}

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindCertifiedVehicleType) {
			qPos.add(certifiedVehicleType);
		}

		if (bindCertifiedTrademarkName) {
			qPos.add(certifiedTrademarkName);
		}

		if (bindCertifiedCommercialName) {
			qPos.add(certifiedCommercialName);
		}

		if (bindCertifiedModelCode) {
			qPos.add(certifiedModelCode);
		}

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 */
	@Override
	public void removeByVehicletypeAndServiceCode(String vehicleClass,
		String certifiedVehicleType, String certifiedTrademarkName,
		String certifiedCommercialName, String certifiedModelCode,
		String serviceCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByVehicletypeAndServiceCode(
				vehicleClass, certifiedVehicleType, certifiedTrademarkName,
				certifiedCommercialName, certifiedModelCode, serviceCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param certifiedVehicleType the certified vehicle type
	 * @param certifiedTrademarkName the certified trademark name
	 * @param certifiedCommercialName the certified commercial name
	 * @param certifiedModelCode the certified model code
	 * @param serviceCode the service code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByVehicletypeAndServiceCode(String vehicleClass,
		String certifiedVehicleType, String certifiedTrademarkName,
		String certifiedCommercialName, String certifiedModelCode,
		String serviceCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPEANDSERVICECODE;

		Object[] finderArgs = new Object[] {
				vehicleClass, certifiedVehicleType, certifiedTrademarkName,
				certifiedCommercialName, certifiedModelCode, serviceCode
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_2);
			}

			boolean bindCertifiedVehicleType = false;

			if (certifiedVehicleType == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_1);
			}
			else if (certifiedVehicleType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_3);
			}
			else {
				bindCertifiedVehicleType = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_2);
			}

			boolean bindCertifiedTrademarkName = false;

			if (certifiedTrademarkName == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_1);
			}
			else if (certifiedTrademarkName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_3);
			}
			else {
				bindCertifiedTrademarkName = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_2);
			}

			boolean bindCertifiedCommercialName = false;

			if (certifiedCommercialName == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_1);
			}
			else if (certifiedCommercialName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_3);
			}
			else {
				bindCertifiedCommercialName = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_2);
			}

			boolean bindCertifiedModelCode = false;

			if (certifiedModelCode == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_1);
			}
			else if (certifiedModelCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_3);
			}
			else {
				bindCertifiedModelCode = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindCertifiedVehicleType) {
					qPos.add(certifiedVehicleType);
				}

				if (bindCertifiedTrademarkName) {
					qPos.add(certifiedTrademarkName);
				}

				if (bindCertifiedCommercialName) {
					qPos.add(certifiedCommercialName);
				}

				if (bindCertifiedModelCode) {
					qPos.add(certifiedModelCode);
				}

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

	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_1 =
		"vrVehicleTypeCertificate.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_2 =
		"vrVehicleTypeCertificate.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_VEHICLECLASS_3 =
		"(vrVehicleTypeCertificate.vehicleClass IS NULL OR vrVehicleTypeCertificate.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_1 =
		"vrVehicleTypeCertificate.certifiedVehicleType IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_2 =
		"vrVehicleTypeCertificate.certifiedVehicleType = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDVEHICLETYPE_3 =
		"(vrVehicleTypeCertificate.certifiedVehicleType IS NULL OR vrVehicleTypeCertificate.certifiedVehicleType = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_1 =
		"vrVehicleTypeCertificate.certifiedTrademarkName IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_2 =
		"vrVehicleTypeCertificate.certifiedTrademarkName = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDTRADEMARKNAME_3 =
		"(vrVehicleTypeCertificate.certifiedTrademarkName IS NULL OR vrVehicleTypeCertificate.certifiedTrademarkName = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_1 =
		"vrVehicleTypeCertificate.certifiedCommercialName IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_2 =
		"vrVehicleTypeCertificate.certifiedCommercialName = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDCOMMERCIALNAME_3 =
		"(vrVehicleTypeCertificate.certifiedCommercialName IS NULL OR vrVehicleTypeCertificate.certifiedCommercialName = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_1 =
		"vrVehicleTypeCertificate.certifiedModelCode IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_2 =
		"vrVehicleTypeCertificate.certifiedModelCode = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_CERTIFIEDMODELCODE_3 =
		"(vrVehicleTypeCertificate.certifiedModelCode IS NULL OR vrVehicleTypeCertificate.certifiedModelCode = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_1 =
		"vrVehicleTypeCertificate.serviceCode IS NULL";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_2 =
		"vrVehicleTypeCertificate.serviceCode = ?";
	private static final String _FINDER_COLUMN_VEHICLETYPEANDSERVICECODE_SERVICECODE_3 =
		"(vrVehicleTypeCertificate.serviceCode IS NULL OR vrVehicleTypeCertificate.serviceCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMMONSAFETYSTANDARD =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCommonsafetystandard",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMONSAFETYSTANDARD =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCommonsafetystandard",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.COMMONSAFETYSTANDARD_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMMONSAFETYSTANDARD = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCommonsafetystandard",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		String commonSafetyStandard) {
		return findByCommonsafetystandard(commonSafetyStandard,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		String commonSafetyStandard, int start, int end) {
		return findByCommonsafetystandard(commonSafetyStandard, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		String commonSafetyStandard, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByCommonsafetystandard(commonSafetyStandard, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		String commonSafetyStandard, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMONSAFETYSTANDARD;
			finderArgs = new Object[] { commonSafetyStandard };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMMONSAFETYSTANDARD;
			finderArgs = new Object[] {
					commonSafetyStandard,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(commonSafetyStandard,
								vrVehicleTypeCertificate.getCommonSafetyStandard())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindCommonSafetyStandard = false;

			if (commonSafetyStandard == null) {
				query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_1);
			}
			else if (commonSafetyStandard.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_3);
			}
			else {
				bindCommonSafetyStandard = true;

				query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCommonSafetyStandard) {
					qPos.add(commonSafetyStandard);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByCommonsafetystandard_First(
		String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByCommonsafetystandard_First(commonSafetyStandard,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("commonSafetyStandard=");
		msg.append(commonSafetyStandard);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByCommonsafetystandard_First(
		String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByCommonsafetystandard(commonSafetyStandard,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByCommonsafetystandard_Last(
		String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByCommonsafetystandard_Last(commonSafetyStandard,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("commonSafetyStandard=");
		msg.append(commonSafetyStandard);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByCommonsafetystandard_Last(
		String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByCommonsafetystandard(commonSafetyStandard);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByCommonsafetystandard(commonSafetyStandard,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param commonSafetyStandard the common safety standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByCommonsafetystandard_PrevAndNext(
		long id, String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByCommonsafetystandard_PrevAndNext(session,
					vrVehicleTypeCertificate, commonSafetyStandard,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByCommonsafetystandard_PrevAndNext(session,
					vrVehicleTypeCertificate, commonSafetyStandard,
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

	protected VRVehicleTypeCertificate getByCommonsafetystandard_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindCommonSafetyStandard = false;

		if (commonSafetyStandard == null) {
			query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_1);
		}
		else if (commonSafetyStandard.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_3);
		}
		else {
			bindCommonSafetyStandard = true;

			query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCommonSafetyStandard) {
			qPos.add(commonSafetyStandard);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where commonSafetyStandard = &#63; from the database.
	 *
	 * @param commonSafetyStandard the common safety standard
	 */
	@Override
	public void removeByCommonsafetystandard(String commonSafetyStandard) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByCommonsafetystandard(
				commonSafetyStandard, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where commonSafetyStandard = &#63;.
	 *
	 * @param commonSafetyStandard the common safety standard
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByCommonsafetystandard(String commonSafetyStandard) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMMONSAFETYSTANDARD;

		Object[] finderArgs = new Object[] { commonSafetyStandard };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindCommonSafetyStandard = false;

			if (commonSafetyStandard == null) {
				query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_1);
			}
			else if (commonSafetyStandard.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_3);
			}
			else {
				bindCommonSafetyStandard = true;

				query.append(_FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCommonSafetyStandard) {
					qPos.add(commonSafetyStandard);
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

	private static final String _FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_1 =
		"vrVehicleTypeCertificate.commonSafetyStandard IS NULL";
	private static final String _FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_2 =
		"vrVehicleTypeCertificate.commonSafetyStandard = ?";
	private static final String _FINDER_COLUMN_COMMONSAFETYSTANDARD_COMMONSAFETYSTANDARD_3 =
		"(vrVehicleTypeCertificate.commonSafetyStandard IS NULL OR vrVehicleTypeCertificate.commonSafetyStandard = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMISSIONSTANDARD =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmissionstandard",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONSTANDARD =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEmissionstandard", new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.EMISSIONSTANDARD_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMISSIONSTANDARD = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEmissionstandard", new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where emissionStandard = &#63;.
	 *
	 * @param emissionStandard the emission standard
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByEmissionstandard(
		String emissionStandard) {
		return findByEmissionstandard(emissionStandard, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where emissionStandard = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emissionStandard the emission standard
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByEmissionstandard(
		String emissionStandard, int start, int end) {
		return findByEmissionstandard(emissionStandard, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where emissionStandard = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emissionStandard the emission standard
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByEmissionstandard(
		String emissionStandard, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByEmissionstandard(emissionStandard, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where emissionStandard = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emissionStandard the emission standard
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByEmissionstandard(
		String emissionStandard, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONSTANDARD;
			finderArgs = new Object[] { emissionStandard };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMISSIONSTANDARD;
			finderArgs = new Object[] {
					emissionStandard,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(emissionStandard,
								vrVehicleTypeCertificate.getEmissionStandard())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindEmissionStandard = false;

			if (emissionStandard == null) {
				query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_1);
			}
			else if (emissionStandard.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_3);
			}
			else {
				bindEmissionStandard = true;

				query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmissionStandard) {
					qPos.add(emissionStandard);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	 *
	 * @param emissionStandard the emission standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByEmissionstandard_First(
		String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByEmissionstandard_First(emissionStandard,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emissionStandard=");
		msg.append(emissionStandard);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	 *
	 * @param emissionStandard the emission standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByEmissionstandard_First(
		String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByEmissionstandard(emissionStandard,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	 *
	 * @param emissionStandard the emission standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByEmissionstandard_Last(
		String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByEmissionstandard_Last(emissionStandard,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emissionStandard=");
		msg.append(emissionStandard);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	 *
	 * @param emissionStandard the emission standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByEmissionstandard_Last(
		String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByEmissionstandard(emissionStandard);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByEmissionstandard(emissionStandard,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param emissionStandard the emission standard
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByEmissionstandard_PrevAndNext(
		long id, String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByEmissionstandard_PrevAndNext(session,
					vrVehicleTypeCertificate, emissionStandard,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByEmissionstandard_PrevAndNext(session,
					vrVehicleTypeCertificate, emissionStandard,
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

	protected VRVehicleTypeCertificate getByEmissionstandard_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindEmissionStandard = false;

		if (emissionStandard == null) {
			query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_1);
		}
		else if (emissionStandard.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_3);
		}
		else {
			bindEmissionStandard = true;

			query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmissionStandard) {
			qPos.add(emissionStandard);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where emissionStandard = &#63; from the database.
	 *
	 * @param emissionStandard the emission standard
	 */
	@Override
	public void removeByEmissionstandard(String emissionStandard) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByEmissionstandard(
				emissionStandard, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where emissionStandard = &#63;.
	 *
	 * @param emissionStandard the emission standard
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByEmissionstandard(String emissionStandard) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMISSIONSTANDARD;

		Object[] finderArgs = new Object[] { emissionStandard };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindEmissionStandard = false;

			if (emissionStandard == null) {
				query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_1);
			}
			else if (emissionStandard.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_3);
			}
			else {
				bindEmissionStandard = true;

				query.append(_FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmissionStandard) {
					qPos.add(emissionStandard);
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

	private static final String _FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_1 =
		"vrVehicleTypeCertificate.emissionStandard IS NULL";
	private static final String _FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_2 =
		"vrVehicleTypeCertificate.emissionStandard = ?";
	private static final String _FINDER_COLUMN_EMISSIONSTANDARD_EMISSIONSTANDARD_3 =
		"(vrVehicleTypeCertificate.emissionStandard IS NULL OR vrVehicleTypeCertificate.emissionStandard = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectionRecordNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectionRecordNo",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.INSPECTIONRECORDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordNo", new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		String inspectionRecordNo) {
		return findByInspectionRecordNo(inspectionRecordNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		String inspectionRecordNo, int start, int end) {
		return findByInspectionRecordNo(inspectionRecordNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		String inspectionRecordNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByInspectionRecordNo(inspectionRecordNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		String inspectionRecordNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO;
			finderArgs = new Object[] { inspectionRecordNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDNO;
			finderArgs = new Object[] {
					inspectionRecordNo,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(inspectionRecordNo,
								vrVehicleTypeCertificate.getInspectionRecordNo())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindInspectionRecordNo = false;

			if (inspectionRecordNo == null) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1);
			}
			else if (inspectionRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionRecordNo = true;

				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectionRecordNo) {
					qPos.add(inspectionRecordNo);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByInspectionRecordNo_First(
		String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByInspectionRecordNo_First(inspectionRecordNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordNo=");
		msg.append(inspectionRecordNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByInspectionRecordNo_First(
		String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByInspectionRecordNo(inspectionRecordNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByInspectionRecordNo_Last(
		String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByInspectionRecordNo_Last(inspectionRecordNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordNo=");
		msg.append(inspectionRecordNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByInspectionRecordNo_Last(
		String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByInspectionRecordNo(inspectionRecordNo);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByInspectionRecordNo(inspectionRecordNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param inspectionRecordNo the inspection record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByInspectionRecordNo_PrevAndNext(
		long id, String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByInspectionRecordNo_PrevAndNext(session,
					vrVehicleTypeCertificate, inspectionRecordNo,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByInspectionRecordNo_PrevAndNext(session,
					vrVehicleTypeCertificate, inspectionRecordNo,
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

	protected VRVehicleTypeCertificate getByInspectionRecordNo_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindInspectionRecordNo = false;

		if (inspectionRecordNo == null) {
			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1);
		}
		else if (inspectionRecordNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3);
		}
		else {
			bindInspectionRecordNo = true;

			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInspectionRecordNo) {
			qPos.add(inspectionRecordNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where inspectionRecordNo = &#63; from the database.
	 *
	 * @param inspectionRecordNo the inspection record no
	 */
	@Override
	public void removeByInspectionRecordNo(String inspectionRecordNo) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByInspectionRecordNo(
				inspectionRecordNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where inspectionRecordNo = &#63;.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByInspectionRecordNo(String inspectionRecordNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO;

		Object[] finderArgs = new Object[] { inspectionRecordNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindInspectionRecordNo = false;

			if (inspectionRecordNo == null) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1);
			}
			else if (inspectionRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionRecordNo = true;

				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectionRecordNo) {
					qPos.add(inspectionRecordNo);
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

	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1 =
		"vrVehicleTypeCertificate.inspectionRecordNo IS NULL";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2 =
		"vrVehicleTypeCertificate.inspectionRecordNo = ?";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3 =
		"(vrVehicleTypeCertificate.inspectionRecordNo IS NULL OR vrVehicleTypeCertificate.inspectionRecordNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTANDSERVICE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByApplicantAndService",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDSERVICE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByApplicantAndService",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			VRVehicleTypeCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTANDSERVICE = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByApplicantAndService",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantAndService(
		String serviceCode, String applicantIdNo, long mtCore) {
		return findByApplicantAndService(serviceCode, applicantIdNo, mtCore,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantAndService(
		String serviceCode, String applicantIdNo, long mtCore, int start,
		int end) {
		return findByApplicantAndService(serviceCode, applicantIdNo, mtCore,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantAndService(
		String serviceCode, String applicantIdNo, long mtCore, int start,
		int end, OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByApplicantAndService(serviceCode, applicantIdNo, mtCore,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByApplicantAndService(
		String serviceCode, String applicantIdNo, long mtCore, int start,
		int end, OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDSERVICE;
			finderArgs = new Object[] { serviceCode, applicantIdNo, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTANDSERVICE;
			finderArgs = new Object[] {
					serviceCode, applicantIdNo, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(serviceCode,
								vrVehicleTypeCertificate.getServiceCode()) ||
							!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							(mtCore != vrVehicleTypeCertificate.getMtCore())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_2);
			}

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_2);
			}

			query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				qPos.add(mtCore);

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByApplicantAndService_First(
		String serviceCode, String applicantIdNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByApplicantAndService_First(serviceCode,
				applicantIdNo, mtCore, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByApplicantAndService_First(
		String serviceCode, String applicantIdNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByApplicantAndService(serviceCode,
				applicantIdNo, mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByApplicantAndService_Last(
		String serviceCode, String applicantIdNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByApplicantAndService_Last(serviceCode,
				applicantIdNo, mtCore, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByApplicantAndService_Last(
		String serviceCode, String applicantIdNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByApplicantAndService(serviceCode, applicantIdNo,
				mtCore);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByApplicantAndService(serviceCode,
				applicantIdNo, mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByApplicantAndService_PrevAndNext(
		long id, String serviceCode, String applicantIdNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByApplicantAndService_PrevAndNext(session,
					vrVehicleTypeCertificate, serviceCode, applicantIdNo,
					mtCore, orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByApplicantAndService_PrevAndNext(session,
					vrVehicleTypeCertificate, serviceCode, applicantIdNo,
					mtCore, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleTypeCertificate getByApplicantAndService_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String serviceCode, String applicantIdNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_2);
		}

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_2);
		}

		query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_MTCORE_2);

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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByApplicantAndService(String serviceCode,
		String applicantIdNo, long mtCore) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByApplicantAndService(
				serviceCode, applicantIdNo, mtCore, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param mtCore the mt core
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByApplicantAndService(String serviceCode,
		String applicantIdNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTANDSERVICE;

		Object[] finderArgs = new Object[] { serviceCode, applicantIdNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_2);
			}

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_2);
			}

			query.append(_FINDER_COLUMN_APPLICANTANDSERVICE_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

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

	private static final String _FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_1 =
		"vrVehicleTypeCertificate.serviceCode IS NULL AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_2 =
		"vrVehicleTypeCertificate.serviceCode = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDSERVICE_SERVICECODE_3 =
		"(vrVehicleTypeCertificate.serviceCode IS NULL OR vrVehicleTypeCertificate.serviceCode = '') AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_1 =
		"vrVehicleTypeCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_2 =
		"vrVehicleTypeCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDSERVICE_APPLICANTIDNO_3 =
		"(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_APPLICANTANDSERVICE_MTCORE_2 = "vrVehicleTypeCertificate.mtCore = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOSSIERID = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRVehicleTypeCertificateModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MTCORE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or throws a {@link NoSuchVRVehicleTypeCertificateException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByDossierId(long dossierId, long mtCore)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByDossierId(dossierId,
				mtCore);

		if (vrVehicleTypeCertificate == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", mtCore=");
			msg.append(mtCore);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
		}

		return vrVehicleTypeCertificate;
	}

	/**
	 * Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDossierId(long dossierId, long mtCore) {
		return fetchByDossierId(dossierId, mtCore, true);
	}

	/**
	 * Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByDossierId(long dossierId,
		long mtCore, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_DOSSIERID,
					finderArgs, this);
		}

		if (result instanceof VRVehicleTypeCertificate) {
			VRVehicleTypeCertificate vrVehicleTypeCertificate = (VRVehicleTypeCertificate)result;

			if ((dossierId != vrVehicleTypeCertificate.getDossierId()) ||
					(mtCore != vrVehicleTypeCertificate.getMtCore())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(mtCore);

				List<VRVehicleTypeCertificate> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRVehicleTypeCertificatePersistenceImpl.fetchByDossierId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRVehicleTypeCertificate vrVehicleTypeCertificate = list.get(0);

					result = vrVehicleTypeCertificate;

					cacheResult(vrVehicleTypeCertificate);

					if ((vrVehicleTypeCertificate.getDossierId() != dossierId) ||
							(vrVehicleTypeCertificate.getMtCore() != mtCore)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERID,
							finderArgs, vrVehicleTypeCertificate);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSSIERID,
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
			return (VRVehicleTypeCertificate)result;
		}
	}

	/**
	 * Removes the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the vr vehicle type certificate that was removed
	 */
	@Override
	public VRVehicleTypeCertificate removeByDossierId(long dossierId,
		long mtCore) throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByDossierId(dossierId,
				mtCore);

		return remove(vrVehicleTypeCertificate);
	}

	/**
	 * Returns the number of vr vehicle type certificates where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrVehicleTypeCertificate.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrVehicleTypeCertificate.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANTCODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByServiceCodeAndProductionPlantCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANTCODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByServiceCodeAndProductionPlantCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			},
			VRVehicleTypeCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SERVICECODEANDPRODUCTIONPLANTCODE =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByServiceCodeAndProductionPlantCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore) {
		return findByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore, int start, int end) {
		return findByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					serviceCode, applicantIdNo, productionPlantCode, mtCore
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					serviceCode, applicantIdNo, productionPlantCode, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(serviceCode,
								vrVehicleTypeCertificate.getServiceCode()) ||
							!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							!Objects.equals(productionPlantCode,
								vrVehicleTypeCertificate.getProductionPlantCode()) ||
							(mtCore != vrVehicleTypeCertificate.getMtCore())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_2);
			}

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_2);
			}

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				qPos.add(mtCore);

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByServiceCodeAndProductionPlantCode_First(
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByServiceCodeAndProductionPlantCode_First(serviceCode,
				applicantIdNo, productionPlantCode, mtCore, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlantCode_First(
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByServiceCodeAndProductionPlantCode(serviceCode,
				applicantIdNo, productionPlantCode, mtCore, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByServiceCodeAndProductionPlantCode_Last(
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByServiceCodeAndProductionPlantCode_Last(serviceCode,
				applicantIdNo, productionPlantCode, mtCore, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlantCode_Last(
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByServiceCodeAndProductionPlantCode(serviceCode,
				applicantIdNo, productionPlantCode, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByServiceCodeAndProductionPlantCode(serviceCode,
				applicantIdNo, productionPlantCode, mtCore, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByServiceCodeAndProductionPlantCode_PrevAndNext(
		long id, String serviceCode, String applicantIdNo,
		String productionPlantCode, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByServiceCodeAndProductionPlantCode_PrevAndNext(session,
					vrVehicleTypeCertificate, serviceCode, applicantIdNo,
					productionPlantCode, mtCore, orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByServiceCodeAndProductionPlantCode_PrevAndNext(session,
					vrVehicleTypeCertificate, serviceCode, applicantIdNo,
					productionPlantCode, mtCore, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleTypeCertificate getByServiceCodeAndProductionPlantCode_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String serviceCode, String applicantIdNo, String productionPlantCode,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_2);
		}

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_2);
		}

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
		}

		query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_MTCORE_2);

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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63; from the database.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByServiceCodeAndProductionPlantCode(String serviceCode,
		String applicantIdNo, String productionPlantCode, long mtCore) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByServiceCodeAndProductionPlantCode(
				serviceCode, applicantIdNo, productionPlantCode, mtCore,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantCode the production plant code
	 * @param mtCore the mt core
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByServiceCodeAndProductionPlantCode(String serviceCode,
		String applicantIdNo, String productionPlantCode, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICECODEANDPRODUCTIONPLANTCODE;

		Object[] finderArgs = new Object[] {
				serviceCode, applicantIdNo, productionPlantCode, mtCore
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_2);
			}

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_2);
			}

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

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

	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_1 =
		"vrVehicleTypeCertificate.serviceCode IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_2 =
		"vrVehicleTypeCertificate.serviceCode = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_SERVICECODE_3 =
		"(vrVehicleTypeCertificate.serviceCode IS NULL OR vrVehicleTypeCertificate.serviceCode = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_1 =
		"vrVehicleTypeCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_2 =
		"vrVehicleTypeCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_APPLICANTIDNO_3 =
		"(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1 =
		"vrVehicleTypeCertificate.productionPlantCode IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2 =
		"vrVehicleTypeCertificate.productionPlantCode = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3 =
		"(vrVehicleTypeCertificate.productionPlantCode IS NULL OR vrVehicleTypeCertificate.productionPlantCode = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANTCODE_MTCORE_2 =
		"vrVehicleTypeCertificate.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANT =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByServiceCodeAndProductionPlant",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANT =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByServiceCodeAndProductionPlant",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRVehicleTypeCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.PRODUCTIONPLANTNAME_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.PRODUCTIONPLANTADDRESS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SERVICECODEANDPRODUCTIONPLANT =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByServiceCodeAndProductionPlant",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress) {
		return findByServiceCodeAndProductionPlant(serviceCode, applicantIdNo,
			productionPlantName, productionPlantAddress, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress, int start, int end) {
		return findByServiceCodeAndProductionPlant(serviceCode, applicantIdNo,
			productionPlantName, productionPlantAddress, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByServiceCodeAndProductionPlant(serviceCode, applicantIdNo,
			productionPlantName, productionPlantAddress, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANT;
			finderArgs = new Object[] {
					serviceCode, applicantIdNo, productionPlantName,
					productionPlantAddress
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANT;
			finderArgs = new Object[] {
					serviceCode, applicantIdNo, productionPlantName,
					productionPlantAddress,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(serviceCode,
								vrVehicleTypeCertificate.getServiceCode()) ||
							!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							!Objects.equals(productionPlantName,
								vrVehicleTypeCertificate.getProductionPlantName()) ||
							!Objects.equals(productionPlantAddress,
								vrVehicleTypeCertificate.getProductionPlantAddress())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_2);
			}

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_2);
			}

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_2);
			}

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
				}

				if (bindProductionPlantAddress) {
					qPos.add(productionPlantAddress);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByServiceCodeAndProductionPlant_First(
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByServiceCodeAndProductionPlant_First(serviceCode,
				applicantIdNo, productionPlantName, productionPlantAddress,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlant_First(
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByServiceCodeAndProductionPlant(serviceCode,
				applicantIdNo, productionPlantName, productionPlantAddress, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByServiceCodeAndProductionPlant_Last(
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByServiceCodeAndProductionPlant_Last(serviceCode,
				applicantIdNo, productionPlantName, productionPlantAddress,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlant_Last(
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByServiceCodeAndProductionPlant(serviceCode,
				applicantIdNo, productionPlantName, productionPlantAddress);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByServiceCodeAndProductionPlant(serviceCode,
				applicantIdNo, productionPlantName, productionPlantAddress,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByServiceCodeAndProductionPlant_PrevAndNext(
		long id, String serviceCode, String applicantIdNo,
		String productionPlantName, String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByServiceCodeAndProductionPlant_PrevAndNext(session,
					vrVehicleTypeCertificate, serviceCode, applicantIdNo,
					productionPlantName, productionPlantAddress,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByServiceCodeAndProductionPlant_PrevAndNext(session,
					vrVehicleTypeCertificate, serviceCode, applicantIdNo,
					productionPlantName, productionPlantAddress,
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

	protected VRVehicleTypeCertificate getByServiceCodeAndProductionPlant_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String serviceCode, String applicantIdNo, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_2);
		}

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_2);
		}

		boolean bindProductionPlantName = false;

		if (productionPlantName == null) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_1);
		}
		else if (productionPlantName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_3);
		}
		else {
			bindProductionPlantName = true;

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_2);
		}

		boolean bindProductionPlantAddress = false;

		if (productionPlantAddress == null) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_1);
		}
		else if (productionPlantAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_3);
		}
		else {
			bindProductionPlantAddress = true;

			query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindProductionPlantName) {
			qPos.add(productionPlantName);
		}

		if (bindProductionPlantAddress) {
			qPos.add(productionPlantAddress);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 */
	@Override
	public void removeByServiceCodeAndProductionPlant(String serviceCode,
		String applicantIdNo, String productionPlantName,
		String productionPlantAddress) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByServiceCodeAndProductionPlant(
				serviceCode, applicantIdNo, productionPlantName,
				productionPlantAddress, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByServiceCodeAndProductionPlant(String serviceCode,
		String applicantIdNo, String productionPlantName,
		String productionPlantAddress) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICECODEANDPRODUCTIONPLANT;

		Object[] finderArgs = new Object[] {
				serviceCode, applicantIdNo, productionPlantName,
				productionPlantAddress
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_2);
			}

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_2);
			}

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_2);
			}

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
				}

				if (bindProductionPlantAddress) {
					qPos.add(productionPlantAddress);
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

	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_1 =
		"vrVehicleTypeCertificate.serviceCode IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_2 =
		"vrVehicleTypeCertificate.serviceCode = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_SERVICECODE_3 =
		"(vrVehicleTypeCertificate.serviceCode IS NULL OR vrVehicleTypeCertificate.serviceCode = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_1 =
		"vrVehicleTypeCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_2 =
		"vrVehicleTypeCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_APPLICANTIDNO_3 =
		"(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_1 =
		"vrVehicleTypeCertificate.productionPlantName IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_2 =
		"vrVehicleTypeCertificate.productionPlantName = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTNAME_3 =
		"(vrVehicleTypeCertificate.productionPlantName IS NULL OR vrVehicleTypeCertificate.productionPlantName = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_1 =
		"vrVehicleTypeCertificate.productionPlantAddress IS NULL";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_2 =
		"vrVehicleTypeCertificate.productionPlantAddress = ?";
	private static final String _FINDER_COLUMN_SERVICECODEANDPRODUCTIONPLANT_PRODUCTIONPLANTADDRESS_3 =
		"(vrVehicleTypeCertificate.productionPlantAddress IS NULL OR vrVehicleTypeCertificate.productionPlantAddress = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_EXP_STATUS =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_EXP_STATUS",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_EXP_STATUS =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_EXP_STATUS",
			new String[] { String.class.getName() },
			VRVehicleTypeCertificateModelImpl.EXPIREDSTATUS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_EXP_STATUS = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_EXP_STATUS",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_F_EXP_STATUS =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByF_EXP_STATUS",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		String expiredStatus) {
		return findByF_EXP_STATUS(expiredStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		String expiredStatus, int start, int end) {
		return findByF_EXP_STATUS(expiredStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByF_EXP_STATUS(expiredStatus, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_EXP_STATUS;
			finderArgs = new Object[] { expiredStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_EXP_STATUS;
			finderArgs = new Object[] {
					expiredStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(expiredStatus,
								vrVehicleTypeCertificate.getExpiredStatus())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByF_EXP_STATUS_First(
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByF_EXP_STATUS_First(expiredStatus,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("expiredStatus=");
		msg.append(expiredStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByF_EXP_STATUS_First(
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByF_EXP_STATUS(expiredStatus,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByF_EXP_STATUS_Last(
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByF_EXP_STATUS_Last(expiredStatus,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("expiredStatus=");
		msg.append(expiredStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByF_EXP_STATUS_Last(
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByF_EXP_STATUS(expiredStatus);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByF_EXP_STATUS(expiredStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByF_EXP_STATUS_PrevAndNext(long id,
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByF_EXP_STATUS_PrevAndNext(session,
					vrVehicleTypeCertificate, expiredStatus, orderByComparator,
					true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByF_EXP_STATUS_PrevAndNext(session,
					vrVehicleTypeCertificate, expiredStatus, orderByComparator,
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

	protected VRVehicleTypeCertificate getByF_EXP_STATUS_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindExpiredStatus = false;

		if (expiredStatus == null) {
			query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_1);
		}
		else if (expiredStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_3);
		}
		else {
			bindExpiredStatus = true;

			query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindExpiredStatus) {
			qPos.add(expiredStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the vr vehicle type certificates where expiredStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatuses the expired statuses
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		String[] expiredStatuses) {
		return findByF_EXP_STATUS(expiredStatuses, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where expiredStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatuses the expired statuses
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		String[] expiredStatuses, int start, int end) {
		return findByF_EXP_STATUS(expiredStatuses, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where expiredStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatuses the expired statuses
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		String[] expiredStatuses, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByF_EXP_STATUS(expiredStatuses, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		String[] expiredStatuses, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		if (expiredStatuses == null) {
			expiredStatuses = new String[0];
		}
		else if (expiredStatuses.length > 1) {
			expiredStatuses = ArrayUtil.distinct(expiredStatuses,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(expiredStatuses, NULL_SAFE_STRING_COMPARATOR);
		}

		if (expiredStatuses.length == 1) {
			return findByF_EXP_STATUS(expiredStatuses[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(expiredStatuses) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(expiredStatuses),
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_F_EXP_STATUS,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!ArrayUtil.contains(expiredStatuses,
								vrVehicleTypeCertificate.getExpiredStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			if (expiredStatuses.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < expiredStatuses.length; i++) {
					String expiredStatus = expiredStatuses[i];

					if (expiredStatus == null) {
						query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_1);
					}
					else if (expiredStatus.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_3);
					}
					else {
						query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_2);
					}

					if ((i + 1) < expiredStatuses.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String expiredStatus : expiredStatuses) {
					if ((expiredStatus != null) && !expiredStatus.isEmpty()) {
						qPos.add(expiredStatus);
					}
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_F_EXP_STATUS,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_F_EXP_STATUS,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vr vehicle type certificates where expiredStatus = &#63; from the database.
	 *
	 * @param expiredStatus the expired status
	 */
	@Override
	public void removeByF_EXP_STATUS(String expiredStatus) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByF_EXP_STATUS(
				expiredStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where expiredStatus = &#63;.
	 *
	 * @param expiredStatus the expired status
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByF_EXP_STATUS(String expiredStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_EXP_STATUS;

		Object[] finderArgs = new Object[] { expiredStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
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

	/**
	 * Returns the number of vr vehicle type certificates where expiredStatus = any &#63;.
	 *
	 * @param expiredStatuses the expired statuses
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByF_EXP_STATUS(String[] expiredStatuses) {
		if (expiredStatuses == null) {
			expiredStatuses = new String[0];
		}
		else if (expiredStatuses.length > 1) {
			expiredStatuses = ArrayUtil.distinct(expiredStatuses,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(expiredStatuses, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(expiredStatuses) };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_F_EXP_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			if (expiredStatuses.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < expiredStatuses.length; i++) {
					String expiredStatus = expiredStatuses[i];

					if (expiredStatus == null) {
						query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_1);
					}
					else if (expiredStatus.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_3);
					}
					else {
						query.append(_FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_2);
					}

					if ((i + 1) < expiredStatuses.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String expiredStatus : expiredStatuses) {
					if ((expiredStatus != null) && !expiredStatus.isEmpty()) {
						qPos.add(expiredStatus);
					}
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_F_EXP_STATUS,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_F_EXP_STATUS,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_1 = "vrVehicleTypeCertificate.expiredStatus IS NULL";
	private static final String _FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_2 = "vrVehicleTypeCertificate.expiredStatus = ?";
	private static final String _FINDER_COLUMN_F_EXP_STATUS_EXPIREDSTATUS_3 = "(vrVehicleTypeCertificate.expiredStatus IS NULL OR vrVehicleTypeCertificate.expiredStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_APPNO_EXP_STATUS",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_APPNO_EXP_STATUS",
			new String[] { String.class.getName(), String.class.getName() },
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.EXPIREDSTATUS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_APPNO_EXP_STATUS = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_APPNO_EXP_STATUS",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_F_APPNO_EXP_STATUS =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByF_APPNO_EXP_STATUS",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		String applicantIdNo, String expiredStatus) {
		return findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		String applicantIdNo, String expiredStatus, int start, int end) {
		return findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		String applicantIdNo, String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		String applicantIdNo, String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS;
			finderArgs = new Object[] { applicantIdNo, expiredStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS;
			finderArgs = new Object[] {
					applicantIdNo, expiredStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							!Objects.equals(expiredStatus,
								vrVehicleTypeCertificate.getExpiredStatus())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_2);
			}

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByF_APPNO_EXP_STATUS_First(
		String applicantIdNo, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByF_APPNO_EXP_STATUS_First(applicantIdNo,
				expiredStatus, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", expiredStatus=");
		msg.append(expiredStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByF_APPNO_EXP_STATUS_First(
		String applicantIdNo, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByF_APPNO_EXP_STATUS(applicantIdNo,
				expiredStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByF_APPNO_EXP_STATUS_Last(
		String applicantIdNo, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByF_APPNO_EXP_STATUS_Last(applicantIdNo,
				expiredStatus, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", expiredStatus=");
		msg.append(expiredStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByF_APPNO_EXP_STATUS_Last(
		String applicantIdNo, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByF_APPNO_EXP_STATUS(applicantIdNo,
				expiredStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByF_APPNO_EXP_STATUS_PrevAndNext(
		long id, String applicantIdNo, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByF_APPNO_EXP_STATUS_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, expiredStatus,
					orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByF_APPNO_EXP_STATUS_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, expiredStatus,
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

	protected VRVehicleTypeCertificate getByF_APPNO_EXP_STATUS_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String applicantIdNo, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_2);
		}

		boolean bindExpiredStatus = false;

		if (expiredStatus == null) {
			query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_1);
		}
		else if (expiredStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_3);
		}
		else {
			bindExpiredStatus = true;

			query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindExpiredStatus) {
			qPos.add(expiredStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatuses the expired statuses
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		String applicantIdNo, String[] expiredStatuses) {
		return findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatuses the expired statuses
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		String applicantIdNo, String[] expiredStatuses, int start, int end) {
		return findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatuses the expired statuses
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		String applicantIdNo, String[] expiredStatuses, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		String applicantIdNo, String[] expiredStatuses, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		if (expiredStatuses == null) {
			expiredStatuses = new String[0];
		}
		else if (expiredStatuses.length > 1) {
			expiredStatuses = ArrayUtil.distinct(expiredStatuses,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(expiredStatuses, NULL_SAFE_STRING_COMPARATOR);
		}

		if (expiredStatuses.length == 1) {
			return findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses[0],
				start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] {
					applicantIdNo, StringUtil.merge(expiredStatuses)
				};
		}
		else {
			finderArgs = new Object[] {
					applicantIdNo, StringUtil.merge(expiredStatuses),
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							!ArrayUtil.contains(expiredStatuses,
								vrVehicleTypeCertificate.getExpiredStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_2);
			}

			if (expiredStatuses.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < expiredStatuses.length; i++) {
					String expiredStatus = expiredStatuses[i];

					if (expiredStatus == null) {
						query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_1);
					}
					else if (expiredStatus.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_3);
					}
					else {
						query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_2);
					}

					if ((i + 1) < expiredStatuses.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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

				for (String expiredStatus : expiredStatuses) {
					if ((expiredStatus != null) && !expiredStatus.isEmpty()) {
						qPos.add(expiredStatus);
					}
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 */
	@Override
	public void removeByF_APPNO_EXP_STATUS(String applicantIdNo,
		String expiredStatus) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByF_APPNO_EXP_STATUS(
				applicantIdNo, expiredStatus, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatus the expired status
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByF_APPNO_EXP_STATUS(String applicantIdNo,
		String expiredStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_APPNO_EXP_STATUS;

		Object[] finderArgs = new Object[] { applicantIdNo, expiredStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_2);
			}

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_2);
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

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
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

	/**
	 * Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param expiredStatuses the expired statuses
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByF_APPNO_EXP_STATUS(String applicantIdNo,
		String[] expiredStatuses) {
		if (expiredStatuses == null) {
			expiredStatuses = new String[0];
		}
		else if (expiredStatuses.length > 1) {
			expiredStatuses = ArrayUtil.distinct(expiredStatuses,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(expiredStatuses, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] {
				applicantIdNo, StringUtil.merge(expiredStatuses)
			};

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_F_APPNO_EXP_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_2);
			}

			if (expiredStatuses.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < expiredStatuses.length; i++) {
					String expiredStatus = expiredStatuses[i];

					if (expiredStatus == null) {
						query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_1);
					}
					else if (expiredStatus.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_3);
					}
					else {
						query.append(_FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_2);
					}

					if ((i + 1) < expiredStatuses.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				for (String expiredStatus : expiredStatuses) {
					if ((expiredStatus != null) && !expiredStatus.isEmpty()) {
						qPos.add(expiredStatus);
					}
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_F_APPNO_EXP_STATUS,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_F_APPNO_EXP_STATUS,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_1 =
		"vrVehicleTypeCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_2 =
		"vrVehicleTypeCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_F_APPNO_EXP_STATUS_APPLICANTIDNO_3 =
		"(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_1 =
		"vrVehicleTypeCertificate.expiredStatus IS NULL";
	private static final String _FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_2 =
		"vrVehicleTypeCertificate.expiredStatus = ?";
	private static final String _FINDER_COLUMN_F_APPNO_EXP_STATUS_EXPIREDSTATUS_3 =
		"(vrVehicleTypeCertificate.expiredStatus IS NULL OR vrVehicleTypeCertificate.expiredStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APP_VH_EXP =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_APP_VH_EXP",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_APP_VH_EXP",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.EXPIREDSTATUS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_APP_VH_EXP = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_APP_VH_EXP",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		String applicantIdNo, String vehicleClass, String expiredStatus) {
		return findByF_APP_VH_EXP(applicantIdNo, vehicleClass, expiredStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		int start, int end) {
		return findByF_APP_VH_EXP(applicantIdNo, vehicleClass, expiredStatus,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByF_APP_VH_EXP(applicantIdNo, vehicleClass, expiredStatus,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP;
			finderArgs = new Object[] { applicantIdNo, vehicleClass, expiredStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APP_VH_EXP;
			finderArgs = new Object[] {
					applicantIdNo, vehicleClass, expiredStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							!Objects.equals(vehicleClass,
								vrVehicleTypeCertificate.getVehicleClass()) ||
							!Objects.equals(expiredStatus,
								vrVehicleTypeCertificate.getExpiredStatus())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_2);
			}

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_2);
			}

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByF_APP_VH_EXP_First(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByF_APP_VH_EXP_First(applicantIdNo,
				vehicleClass, expiredStatus, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", expiredStatus=");
		msg.append(expiredStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByF_APP_VH_EXP_First(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByF_APP_VH_EXP(applicantIdNo,
				vehicleClass, expiredStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByF_APP_VH_EXP_Last(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByF_APP_VH_EXP_Last(applicantIdNo,
				vehicleClass, expiredStatus, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", expiredStatus=");
		msg.append(expiredStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByF_APP_VH_EXP_Last(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByF_APP_VH_EXP(applicantIdNo, vehicleClass,
				expiredStatus);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByF_APP_VH_EXP(applicantIdNo,
				vehicleClass, expiredStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByF_APP_VH_EXP_PrevAndNext(long id,
		String applicantIdNo, String vehicleClass, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByF_APP_VH_EXP_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, vehicleClass,
					expiredStatus, orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByF_APP_VH_EXP_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, vehicleClass,
					expiredStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleTypeCertificate getByF_APP_VH_EXP_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String applicantIdNo, String vehicleClass, String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_2);
		}

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_2);
		}

		boolean bindExpiredStatus = false;

		if (expiredStatus == null) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_1);
		}
		else if (expiredStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_3);
		}
		else {
			bindExpiredStatus = true;

			query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindExpiredStatus) {
			qPos.add(expiredStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 */
	@Override
	public void removeByF_APP_VH_EXP(String applicantIdNo, String vehicleClass,
		String expiredStatus) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByF_APP_VH_EXP(
				applicantIdNo, vehicleClass, expiredStatus, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByF_APP_VH_EXP(String applicantIdNo, String vehicleClass,
		String expiredStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_APP_VH_EXP;

		Object[] finderArgs = new Object[] {
				applicantIdNo, vehicleClass, expiredStatus
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_2);
			}

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_2);
			}

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_2);
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

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
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

	private static final String _FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_1 = "vrVehicleTypeCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_2 = "vrVehicleTypeCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_APPLICANTIDNO_3 = "(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_1 = "vrVehicleTypeCertificate.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_2 = "vrVehicleTypeCertificate.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_VEHICLECLASS_3 = "(vrVehicleTypeCertificate.vehicleClass IS NULL OR vrVehicleTypeCertificate.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_1 = "vrVehicleTypeCertificate.expiredStatus IS NULL";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_2 = "vrVehicleTypeCertificate.expiredStatus = ?";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_EXPIREDSTATUS_3 = "(vrVehicleTypeCertificate.expiredStatus IS NULL OR vrVehicleTypeCertificate.expiredStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APP_VH_EXP_CERTNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_APP_VH_EXP_CERTNO",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP_CERTNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_APP_VH_EXP_CERTNO",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.EXPIREDSTATUS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.CERTIFICATERECORDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_APP_VH_EXP_CERTNO = new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_APP_VH_EXP_CERTNO",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo) {
		return findByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo, int start, int end) {
		return findByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP_CERTNO;
			finderArgs = new Object[] {
					applicantIdNo, vehicleClass, expiredStatus,
					certificateRecordNo
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APP_VH_EXP_CERTNO;
			finderArgs = new Object[] {
					applicantIdNo, vehicleClass, expiredStatus,
					certificateRecordNo,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							!Objects.equals(vehicleClass,
								vrVehicleTypeCertificate.getVehicleClass()) ||
							!Objects.equals(expiredStatus,
								vrVehicleTypeCertificate.getExpiredStatus()) ||
							!Objects.equals(certificateRecordNo,
								vrVehicleTypeCertificate.getCertificateRecordNo())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_2);
			}

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_2);
			}

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_2);
			}

			boolean bindCertificateRecordNo = false;

			if (certificateRecordNo == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_1);
			}
			else if (certificateRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_3);
			}
			else {
				bindCertificateRecordNo = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

				if (bindCertificateRecordNo) {
					qPos.add(certificateRecordNo);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByF_APP_VH_EXP_CERTNO_First(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByF_APP_VH_EXP_CERTNO_First(applicantIdNo,
				vehicleClass, expiredStatus, certificateRecordNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", expiredStatus=");
		msg.append(expiredStatus);

		msg.append(", certificateRecordNo=");
		msg.append(certificateRecordNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByF_APP_VH_EXP_CERTNO_First(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByF_APP_VH_EXP_CERTNO(applicantIdNo,
				vehicleClass, expiredStatus, certificateRecordNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByF_APP_VH_EXP_CERTNO_Last(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByF_APP_VH_EXP_CERTNO_Last(applicantIdNo,
				vehicleClass, expiredStatus, certificateRecordNo,
				orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", expiredStatus=");
		msg.append(expiredStatus);

		msg.append(", certificateRecordNo=");
		msg.append(certificateRecordNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByF_APP_VH_EXP_CERTNO_Last(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
				expiredStatus, certificateRecordNo);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByF_APP_VH_EXP_CERTNO(applicantIdNo,
				vehicleClass, expiredStatus, certificateRecordNo, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByF_APP_VH_EXP_CERTNO_PrevAndNext(
		long id, String applicantIdNo, String vehicleClass,
		String expiredStatus, String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByF_APP_VH_EXP_CERTNO_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, vehicleClass,
					expiredStatus, certificateRecordNo, orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByF_APP_VH_EXP_CERTNO_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, vehicleClass,
					expiredStatus, certificateRecordNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleTypeCertificate getByF_APP_VH_EXP_CERTNO_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_2);
		}

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_2);
		}

		boolean bindExpiredStatus = false;

		if (expiredStatus == null) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_1);
		}
		else if (expiredStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_3);
		}
		else {
			bindExpiredStatus = true;

			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_2);
		}

		boolean bindCertificateRecordNo = false;

		if (certificateRecordNo == null) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_1);
		}
		else if (certificateRecordNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_3);
		}
		else {
			bindCertificateRecordNo = true;

			query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindExpiredStatus) {
			qPos.add(expiredStatus);
		}

		if (bindCertificateRecordNo) {
			qPos.add(certificateRecordNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 */
	@Override
	public void removeByF_APP_VH_EXP_CERTNO(String applicantIdNo,
		String vehicleClass, String expiredStatus, String certificateRecordNo) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByF_APP_VH_EXP_CERTNO(
				applicantIdNo, vehicleClass, expiredStatus,
				certificateRecordNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param certificateRecordNo the certificate record no
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByF_APP_VH_EXP_CERTNO(String applicantIdNo,
		String vehicleClass, String expiredStatus, String certificateRecordNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_APP_VH_EXP_CERTNO;

		Object[] finderArgs = new Object[] {
				applicantIdNo, vehicleClass, expiredStatus, certificateRecordNo
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_2);
			}

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_2);
			}

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_2);
			}

			boolean bindCertificateRecordNo = false;

			if (certificateRecordNo == null) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_1);
			}
			else if (certificateRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_3);
			}
			else {
				bindCertificateRecordNo = true;

				query.append(_FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_2);
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

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

				if (bindCertificateRecordNo) {
					qPos.add(certificateRecordNo);
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

	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_1 =
		"vrVehicleTypeCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_2 =
		"vrVehicleTypeCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_APPLICANTIDNO_3 =
		"(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_1 =
		"vrVehicleTypeCertificate.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_2 =
		"vrVehicleTypeCertificate.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_VEHICLECLASS_3 =
		"(vrVehicleTypeCertificate.vehicleClass IS NULL OR vrVehicleTypeCertificate.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_1 =
		"vrVehicleTypeCertificate.expiredStatus IS NULL AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_2 =
		"vrVehicleTypeCertificate.expiredStatus = ? AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_EXPIREDSTATUS_3 =
		"(vrVehicleTypeCertificate.expiredStatus IS NULL OR vrVehicleTypeCertificate.expiredStatus = '') AND ";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_1 =
		"vrVehicleTypeCertificate.certificateRecordNo IS NULL";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_2 =
		"vrVehicleTypeCertificate.certificateRecordNo = ?";
	private static final String _FINDER_COLUMN_F_APP_VH_EXP_CERTNO_CERTIFICATERECORDNO_3 =
		"(vrVehicleTypeCertificate.certificateRecordNo IS NULL OR vrVehicleTypeCertificate.certificateRecordNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByServiceCodeVehicleClassAndApplicantIdNo",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByServiceCodeVehicleClassAndApplicantIdNo",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRVehicleTypeCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.EXPIREDSTATUS_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			VRVehicleTypeCertificateModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO =
		new FinderPath(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByServiceCodeVehicleClassAndApplicantIdNo",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @return the matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode) {
		return findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode, int start, int end) {
		return findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO;
			finderArgs = new Object[] {
					applicantIdNo, vehicleClass, expiredStatus, serviceCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO;
			finderArgs = new Object[] {
					applicantIdNo, vehicleClass, expiredStatus, serviceCode,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleTypeCertificate vrVehicleTypeCertificate : list) {
					if (!Objects.equals(applicantIdNo,
								vrVehicleTypeCertificate.getApplicantIdNo()) ||
							!Objects.equals(vehicleClass,
								vrVehicleTypeCertificate.getVehicleClass()) ||
							!Objects.equals(expiredStatus,
								vrVehicleTypeCertificate.getExpiredStatus()) ||
							!Objects.equals(serviceCode,
								vrVehicleTypeCertificate.getServiceCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_2);
			}

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_2);
			}

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
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

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByServiceCodeVehicleClassAndApplicantIdNo_First(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByServiceCodeVehicleClassAndApplicantIdNo_First(applicantIdNo,
				vehicleClass, expiredStatus, serviceCode, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", expiredStatus=");
		msg.append(expiredStatus);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByServiceCodeVehicleClassAndApplicantIdNo_First(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		List<VRVehicleTypeCertificate> list = findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
				vehicleClass, expiredStatus, serviceCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByServiceCodeVehicleClassAndApplicantIdNo_Last(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByServiceCodeVehicleClassAndApplicantIdNo_Last(applicantIdNo,
				vehicleClass, expiredStatus, serviceCode, orderByComparator);

		if (vrVehicleTypeCertificate != null) {
			return vrVehicleTypeCertificate;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", expiredStatus=");
		msg.append(expiredStatus);

		msg.append(", serviceCode=");
		msg.append(serviceCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleTypeCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByServiceCodeVehicleClassAndApplicantIdNo_Last(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		int count = countByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
				vehicleClass, expiredStatus, serviceCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleTypeCertificate> list = findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
				vehicleClass, expiredStatus, serviceCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle type certificate
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate[] findByServiceCodeVehicleClassAndApplicantIdNo_PrevAndNext(
		long id, String applicantIdNo, String vehicleClass,
		String expiredStatus, String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate[] array = new VRVehicleTypeCertificateImpl[3];

			array[0] = getByServiceCodeVehicleClassAndApplicantIdNo_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, vehicleClass,
					expiredStatus, serviceCode, orderByComparator, true);

			array[1] = vrVehicleTypeCertificate;

			array[2] = getByServiceCodeVehicleClassAndApplicantIdNo_PrevAndNext(session,
					vrVehicleTypeCertificate, applicantIdNo, vehicleClass,
					expiredStatus, serviceCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleTypeCertificate getByServiceCodeVehicleClassAndApplicantIdNo_PrevAndNext(
		Session session, VRVehicleTypeCertificate vrVehicleTypeCertificate,
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE);

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_2);
		}

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_2);
		}

		boolean bindExpiredStatus = false;

		if (expiredStatus == null) {
			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_1);
		}
		else if (expiredStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_3);
		}
		else {
			bindExpiredStatus = true;

			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_2);
		}

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_2);
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
			query.append(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindExpiredStatus) {
			qPos.add(expiredStatus);
		}

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleTypeCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleTypeCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63; from the database.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 */
	@Override
	public void removeByServiceCodeVehicleClassAndApplicantIdNo(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findByServiceCodeVehicleClassAndApplicantIdNo(
				applicantIdNo, vehicleClass, expiredStatus, serviceCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	 *
	 * @param applicantIdNo the applicant ID no
	 * @param vehicleClass the vehicle class
	 * @param expiredStatus the expired status
	 * @param serviceCode the service code
	 * @return the number of matching vr vehicle type certificates
	 */
	@Override
	public int countByServiceCodeVehicleClassAndApplicantIdNo(
		String applicantIdNo, String vehicleClass, String expiredStatus,
		String serviceCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO;

		Object[] finderArgs = new Object[] {
				applicantIdNo, vehicleClass, expiredStatus, serviceCode
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE);

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_2);
			}

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_2);
			}

			boolean bindExpiredStatus = false;

			if (expiredStatus == null) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_1);
			}
			else if (expiredStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_3);
			}
			else {
				bindExpiredStatus = true;

				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_2);
			}

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_2);
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

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindExpiredStatus) {
					qPos.add(expiredStatus);
				}

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

	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_1 =
		"vrVehicleTypeCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_2 =
		"vrVehicleTypeCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_APPLICANTIDNO_3 =
		"(vrVehicleTypeCertificate.applicantIdNo IS NULL OR vrVehicleTypeCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_1 =
		"vrVehicleTypeCertificate.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_2 =
		"vrVehicleTypeCertificate.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_VEHICLECLASS_3 =
		"(vrVehicleTypeCertificate.vehicleClass IS NULL OR vrVehicleTypeCertificate.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_1 =
		"vrVehicleTypeCertificate.expiredStatus IS NULL AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_2 =
		"vrVehicleTypeCertificate.expiredStatus = ? AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_EXPIREDSTATUS_3 =
		"(vrVehicleTypeCertificate.expiredStatus IS NULL OR vrVehicleTypeCertificate.expiredStatus = '') AND ";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_1 =
		"vrVehicleTypeCertificate.serviceCode IS NULL";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_2 =
		"vrVehicleTypeCertificate.serviceCode = ?";
	private static final String _FINDER_COLUMN_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO_SERVICECODE_3 =
		"(vrVehicleTypeCertificate.serviceCode IS NULL OR vrVehicleTypeCertificate.serviceCode = '')";

	public VRVehicleTypeCertificatePersistenceImpl() {
		setModelClass(VRVehicleTypeCertificate.class);
	}

	/**
	 * Caches the vr vehicle type certificate in the entity cache if it is enabled.
	 *
	 * @param vrVehicleTypeCertificate the vr vehicle type certificate
	 */
	@Override
	public void cacheResult(VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		entityCache.putResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			vrVehicleTypeCertificate.getPrimaryKey(), vrVehicleTypeCertificate);

		finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERID,
			new Object[] {
				vrVehicleTypeCertificate.getDossierId(),
				vrVehicleTypeCertificate.getMtCore()
			}, vrVehicleTypeCertificate);

		vrVehicleTypeCertificate.resetOriginalValues();
	}

	/**
	 * Caches the vr vehicle type certificates in the entity cache if it is enabled.
	 *
	 * @param vrVehicleTypeCertificates the vr vehicle type certificates
	 */
	@Override
	public void cacheResult(
		List<VRVehicleTypeCertificate> vrVehicleTypeCertificates) {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : vrVehicleTypeCertificates) {
			if (entityCache.getResult(
						VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
						VRVehicleTypeCertificateImpl.class,
						vrVehicleTypeCertificate.getPrimaryKey()) == null) {
				cacheResult(vrVehicleTypeCertificate);
			}
			else {
				vrVehicleTypeCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr vehicle type certificates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRVehicleTypeCertificateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr vehicle type certificate.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		entityCache.removeResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			vrVehicleTypeCertificate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRVehicleTypeCertificateModelImpl)vrVehicleTypeCertificate,
			true);
	}

	@Override
	public void clearCache(
		List<VRVehicleTypeCertificate> vrVehicleTypeCertificates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : vrVehicleTypeCertificates) {
			entityCache.removeResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
				VRVehicleTypeCertificateImpl.class,
				vrVehicleTypeCertificate.getPrimaryKey());

			clearUniqueFindersCache((VRVehicleTypeCertificateModelImpl)vrVehicleTypeCertificate,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRVehicleTypeCertificateModelImpl vrVehicleTypeCertificateModelImpl) {
		Object[] args = new Object[] {
				vrVehicleTypeCertificateModelImpl.getDossierId(),
				vrVehicleTypeCertificateModelImpl.getMtCore()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_DOSSIERID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERID, args,
			vrVehicleTypeCertificateModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRVehicleTypeCertificateModelImpl vrVehicleTypeCertificateModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrVehicleTypeCertificateModelImpl.getDossierId(),
					vrVehicleTypeCertificateModelImpl.getMtCore()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSSIERID, args);
		}

		if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOSSIERID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrVehicleTypeCertificateModelImpl.getOriginalDossierId(),
					vrVehicleTypeCertificateModelImpl.getOriginalMtCore()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSSIERID, args);
		}
	}

	/**
	 * Creates a new vr vehicle type certificate with the primary key. Does not add the vr vehicle type certificate to the database.
	 *
	 * @param id the primary key for the new vr vehicle type certificate
	 * @return the new vr vehicle type certificate
	 */
	@Override
	public VRVehicleTypeCertificate create(long id) {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = new VRVehicleTypeCertificateImpl();

		vrVehicleTypeCertificate.setNew(true);
		vrVehicleTypeCertificate.setPrimaryKey(id);

		return vrVehicleTypeCertificate;
	}

	/**
	 * Removes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr vehicle type certificate
	 * @return the vr vehicle type certificate that was removed
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate remove(long id)
		throws NoSuchVRVehicleTypeCertificateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr vehicle type certificate
	 * @return the vr vehicle type certificate that was removed
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate remove(Serializable primaryKey)
		throws NoSuchVRVehicleTypeCertificateException {
		Session session = null;

		try {
			session = openSession();

			VRVehicleTypeCertificate vrVehicleTypeCertificate = (VRVehicleTypeCertificate)session.get(VRVehicleTypeCertificateImpl.class,
					primaryKey);

			if (vrVehicleTypeCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRVehicleTypeCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrVehicleTypeCertificate);
		}
		catch (NoSuchVRVehicleTypeCertificateException nsee) {
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
	protected VRVehicleTypeCertificate removeImpl(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		vrVehicleTypeCertificate = toUnwrappedModel(vrVehicleTypeCertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrVehicleTypeCertificate)) {
				vrVehicleTypeCertificate = (VRVehicleTypeCertificate)session.get(VRVehicleTypeCertificateImpl.class,
						vrVehicleTypeCertificate.getPrimaryKeyObj());
			}

			if (vrVehicleTypeCertificate != null) {
				session.delete(vrVehicleTypeCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrVehicleTypeCertificate != null) {
			clearCache(vrVehicleTypeCertificate);
		}

		return vrVehicleTypeCertificate;
	}

	@Override
	public VRVehicleTypeCertificate updateImpl(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		vrVehicleTypeCertificate = toUnwrappedModel(vrVehicleTypeCertificate);

		boolean isNew = vrVehicleTypeCertificate.isNew();

		VRVehicleTypeCertificateModelImpl vrVehicleTypeCertificateModelImpl = (VRVehicleTypeCertificateModelImpl)vrVehicleTypeCertificate;

		Session session = null;

		try {
			session = openSession();

			if (vrVehicleTypeCertificate.isNew()) {
				session.save(vrVehicleTypeCertificate);

				vrVehicleTypeCertificate.setNew(false);
			}
			else {
				vrVehicleTypeCertificate = (VRVehicleTypeCertificate)session.merge(vrVehicleTypeCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRVehicleTypeCertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalInspectorId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getInspectorId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalCorporationId(),
						vrVehicleTypeCertificateModelImpl.getOriginalInspectorId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getCorporationId(),
						vrVehicleTypeCertificateModelImpl.getInspectorId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICECODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICECODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTIDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTIDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTIDNO,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDPRODUCTIONPLANT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTANDPRODUCTIONPLANT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDPRODUCTIONPLANT,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTANDPRODUCTIONPLANT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDPRODUCTIONPLANT,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO_MTCORE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalDossierNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO_MTCORE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getDossierNo(),
						vrVehicleTypeCertificateModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO_MTCORE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANUFACTURERFOREIGNCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalManufacturerForeignCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MANUFACTURERFOREIGNCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANUFACTURERFOREIGNCODE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getManufacturerForeignCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MANUFACTURERFOREIGNCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANUFACTURERFOREIGNCODE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalDesignerCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DESIGNERCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNERCODE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getDesignerCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DESIGNERCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNERCODE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFICATIONCERTIFICATENO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalVerificationCertificateNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VERIFICATIONCERTIFICATENO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFICATIONCERTIFICATENO,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getVerificationCertificateNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VERIFICATIONCERTIFICATENO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFICATIONCERTIFICATENO,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNSYMBOL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalDesignSymbol()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DESIGNSYMBOL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNSYMBOL,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getDesignSymbol()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DESIGNSYMBOL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESIGNSYMBOL,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalCertificateRecordNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDNO,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getCertificateRecordNo(),
						vrVehicleTypeCertificateModelImpl.getServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDNO,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalExpiredStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EXPIREDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUS,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getExpiredStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EXPIREDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUS,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUSANDSERVICECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalExpiredStatus(),
						vrVehicleTypeCertificateModelImpl.getOriginalServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EXPIREDSTATUSANDSERVICECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUSANDSERVICECODE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getExpiredStatus(),
						vrVehicleTypeCertificateModelImpl.getServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EXPIREDSTATUSANDSERVICECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXPIREDSTATUSANDSERVICECODE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPEANDSERVICECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalVehicleClass(),
						vrVehicleTypeCertificateModelImpl.getOriginalCertifiedVehicleType(),
						vrVehicleTypeCertificateModelImpl.getOriginalCertifiedTrademarkName(),
						vrVehicleTypeCertificateModelImpl.getOriginalCertifiedCommercialName(),
						vrVehicleTypeCertificateModelImpl.getOriginalCertifiedModelCode(),
						vrVehicleTypeCertificateModelImpl.getOriginalServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPEANDSERVICECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPEANDSERVICECODE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getVehicleClass(),
						vrVehicleTypeCertificateModelImpl.getCertifiedVehicleType(),
						vrVehicleTypeCertificateModelImpl.getCertifiedTrademarkName(),
						vrVehicleTypeCertificateModelImpl.getCertifiedCommercialName(),
						vrVehicleTypeCertificateModelImpl.getCertifiedModelCode(),
						vrVehicleTypeCertificateModelImpl.getServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPEANDSERVICECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPEANDSERVICECODE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMONSAFETYSTANDARD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalCommonSafetyStandard()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMMONSAFETYSTANDARD,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMONSAFETYSTANDARD,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getCommonSafetyStandard()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMMONSAFETYSTANDARD,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMONSAFETYSTANDARD,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONSTANDARD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalEmissionStandard()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMISSIONSTANDARD,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONSTANDARD,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getEmissionStandard()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMISSIONSTANDARD,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONSTANDARD,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalInspectionRecordNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getInspectionRecordNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDSERVICE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalServiceCode(),
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTANDSERVICE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDSERVICE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getServiceCode(),
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTANDSERVICE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTANDSERVICE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalServiceCode(),
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalProductionPlantCode(),
						vrVehicleTypeCertificateModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICECODEANDPRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANTCODE,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getServiceCode(),
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getProductionPlantCode(),
						vrVehicleTypeCertificateModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICECODEANDPRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANTCODE,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalServiceCode(),
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalProductionPlantName(),
						vrVehicleTypeCertificateModelImpl.getOriginalProductionPlantAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICECODEANDPRODUCTIONPLANT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANT,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getServiceCode(),
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getProductionPlantName(),
						vrVehicleTypeCertificateModelImpl.getProductionPlantAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICECODEANDPRODUCTIONPLANT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEANDPRODUCTIONPLANT,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_EXP_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalExpiredStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_EXP_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_EXP_STATUS,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getExpiredStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_EXP_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_EXP_STATUS,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalExpiredStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APPNO_EXP_STATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getExpiredStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APPNO_EXP_STATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPNO_EXP_STATUS,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalVehicleClass(),
						vrVehicleTypeCertificateModelImpl.getOriginalExpiredStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APP_VH_EXP, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getVehicleClass(),
						vrVehicleTypeCertificateModelImpl.getExpiredStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APP_VH_EXP, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP_CERTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalVehicleClass(),
						vrVehicleTypeCertificateModelImpl.getOriginalExpiredStatus(),
						vrVehicleTypeCertificateModelImpl.getOriginalCertificateRecordNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APP_VH_EXP_CERTNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP_CERTNO,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getVehicleClass(),
						vrVehicleTypeCertificateModelImpl.getExpiredStatus(),
						vrVehicleTypeCertificateModelImpl.getCertificateRecordNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APP_VH_EXP_CERTNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_VH_EXP_CERTNO,
					args);
			}

			if ((vrVehicleTypeCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getOriginalApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getOriginalVehicleClass(),
						vrVehicleTypeCertificateModelImpl.getOriginalExpiredStatus(),
						vrVehicleTypeCertificateModelImpl.getOriginalServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO,
					args);

				args = new Object[] {
						vrVehicleTypeCertificateModelImpl.getApplicantIdNo(),
						vrVehicleTypeCertificateModelImpl.getVehicleClass(),
						vrVehicleTypeCertificateModelImpl.getExpiredStatus(),
						vrVehicleTypeCertificateModelImpl.getServiceCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICECODEVEHICLECLASSANDAPPLICANTIDNO,
					args);
			}
		}

		entityCache.putResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleTypeCertificateImpl.class,
			vrVehicleTypeCertificate.getPrimaryKey(), vrVehicleTypeCertificate,
			false);

		clearUniqueFindersCache(vrVehicleTypeCertificateModelImpl, false);
		cacheUniqueFindersCache(vrVehicleTypeCertificateModelImpl);

		vrVehicleTypeCertificate.resetOriginalValues();

		return vrVehicleTypeCertificate;
	}

	protected VRVehicleTypeCertificate toUnwrappedModel(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		if (vrVehicleTypeCertificate instanceof VRVehicleTypeCertificateImpl) {
			return vrVehicleTypeCertificate;
		}

		VRVehicleTypeCertificateImpl vrVehicleTypeCertificateImpl = new VRVehicleTypeCertificateImpl();

		vrVehicleTypeCertificateImpl.setNew(vrVehicleTypeCertificate.isNew());
		vrVehicleTypeCertificateImpl.setPrimaryKey(vrVehicleTypeCertificate.getPrimaryKey());

		vrVehicleTypeCertificateImpl.setId(vrVehicleTypeCertificate.getId());
		vrVehicleTypeCertificateImpl.setMtCore(vrVehicleTypeCertificate.getMtCore());
		vrVehicleTypeCertificateImpl.setDossierId(vrVehicleTypeCertificate.getDossierId());
		vrVehicleTypeCertificateImpl.setDossierIdCTN(vrVehicleTypeCertificate.getDossierIdCTN());
		vrVehicleTypeCertificateImpl.setDossierType(vrVehicleTypeCertificate.getDossierType());
		vrVehicleTypeCertificateImpl.setDossierNo(vrVehicleTypeCertificate.getDossierNo());
		vrVehicleTypeCertificateImpl.setReferenceUid(vrVehicleTypeCertificate.getReferenceUid());
		vrVehicleTypeCertificateImpl.setServiceCode(vrVehicleTypeCertificate.getServiceCode());
		vrVehicleTypeCertificateImpl.setServiceName(vrVehicleTypeCertificate.getServiceName());
		vrVehicleTypeCertificateImpl.setConvertassembleId(vrVehicleTypeCertificate.getConvertassembleId());
		vrVehicleTypeCertificateImpl.setApplicantIdNo(vrVehicleTypeCertificate.getApplicantIdNo());
		vrVehicleTypeCertificateImpl.setApplicantTelNo(vrVehicleTypeCertificate.getApplicantTelNo());
		vrVehicleTypeCertificateImpl.setApplicantName(vrVehicleTypeCertificate.getApplicantName());
		vrVehicleTypeCertificateImpl.setApplicantIdDate(vrVehicleTypeCertificate.getApplicantIdDate());
		vrVehicleTypeCertificateImpl.setApplicantAddress(vrVehicleTypeCertificate.getApplicantAddress());
		vrVehicleTypeCertificateImpl.setApplicantRepresentative(vrVehicleTypeCertificate.getApplicantRepresentative());
		vrVehicleTypeCertificateImpl.setApplicantRepresentativeTitle(vrVehicleTypeCertificate.getApplicantRepresentativeTitle());
		vrVehicleTypeCertificateImpl.setApplicantEmail(vrVehicleTypeCertificate.getApplicantEmail());
		vrVehicleTypeCertificateImpl.setApplicantPhone(vrVehicleTypeCertificate.getApplicantPhone());
		vrVehicleTypeCertificateImpl.setApplicantFax(vrVehicleTypeCertificate.getApplicantFax());
		vrVehicleTypeCertificateImpl.setApplicantContactName(vrVehicleTypeCertificate.getApplicantContactName());
		vrVehicleTypeCertificateImpl.setApplicantContactEmail(vrVehicleTypeCertificate.getApplicantContactEmail());
		vrVehicleTypeCertificateImpl.setApplicantcontactPhone(vrVehicleTypeCertificate.getApplicantcontactPhone());
		vrVehicleTypeCertificateImpl.setApplicantcontactTelNo(vrVehicleTypeCertificate.getApplicantcontactTelNo());
		vrVehicleTypeCertificateImpl.setCityCode(vrVehicleTypeCertificate.getCityCode());
		vrVehicleTypeCertificateImpl.setCityName(vrVehicleTypeCertificate.getCityName());
		vrVehicleTypeCertificateImpl.setDistrictCode(vrVehicleTypeCertificate.getDistrictCode());
		vrVehicleTypeCertificateImpl.setDistrictName(vrVehicleTypeCertificate.getDistrictName());
		vrVehicleTypeCertificateImpl.setWardCode(vrVehicleTypeCertificate.getWardCode());
		vrVehicleTypeCertificateImpl.setWardName(vrVehicleTypeCertificate.getWardName());
		vrVehicleTypeCertificateImpl.setManufacturerForeignCode(vrVehicleTypeCertificate.getManufacturerForeignCode());
		vrVehicleTypeCertificateImpl.setManufacturerName(vrVehicleTypeCertificate.getManufacturerName());
		vrVehicleTypeCertificateImpl.setManufacturerAddress(vrVehicleTypeCertificate.getManufacturerAddress());
		vrVehicleTypeCertificateImpl.setManufacturerRepresentative(vrVehicleTypeCertificate.getManufacturerRepresentative());
		vrVehicleTypeCertificateImpl.setManufacturerRepresentativeTitle(vrVehicleTypeCertificate.getManufacturerRepresentativeTitle());
		vrVehicleTypeCertificateImpl.setManufacturerEmail(vrVehicleTypeCertificate.getManufacturerEmail());
		vrVehicleTypeCertificateImpl.setManufacturerPhone(vrVehicleTypeCertificate.getManufacturerPhone());
		vrVehicleTypeCertificateImpl.setManufacturerFax(vrVehicleTypeCertificate.getManufacturerFax());
		vrVehicleTypeCertificateImpl.setProductionPlantCode(vrVehicleTypeCertificate.getProductionPlantCode());
		vrVehicleTypeCertificateImpl.setProductionPlantName(vrVehicleTypeCertificate.getProductionPlantName());
		vrVehicleTypeCertificateImpl.setProductionPlantAddress(vrVehicleTypeCertificate.getProductionPlantAddress());
		vrVehicleTypeCertificateImpl.setProductionPlantRepresentative(vrVehicleTypeCertificate.getProductionPlantRepresentative());
		vrVehicleTypeCertificateImpl.setProductionPlantRepresentativeTitle(vrVehicleTypeCertificate.getProductionPlantRepresentativeTitle());
		vrVehicleTypeCertificateImpl.setCopReportNo(vrVehicleTypeCertificate.getCopReportNo());
		vrVehicleTypeCertificateImpl.setCopReportDate(vrVehicleTypeCertificate.getCopReportDate());
		vrVehicleTypeCertificateImpl.setCopReportExpireDate(vrVehicleTypeCertificate.getCopReportExpireDate());
		vrVehicleTypeCertificateImpl.setDesignerCode(vrVehicleTypeCertificate.getDesignerCode());
		vrVehicleTypeCertificateImpl.setDesignerName(vrVehicleTypeCertificate.getDesignerName());
		vrVehicleTypeCertificateImpl.setDesignerAddress(vrVehicleTypeCertificate.getDesignerAddress());
		vrVehicleTypeCertificateImpl.setDesignerRepresentative(vrVehicleTypeCertificate.getDesignerRepresentative());
		vrVehicleTypeCertificateImpl.setDesignerRepresentativeTitle(vrVehicleTypeCertificate.getDesignerRepresentativeTitle());
		vrVehicleTypeCertificateImpl.setDesignerEmail(vrVehicleTypeCertificate.getDesignerEmail());
		vrVehicleTypeCertificateImpl.setDesignerPhone(vrVehicleTypeCertificate.getDesignerPhone());
		vrVehicleTypeCertificateImpl.setDesignerFax(vrVehicleTypeCertificate.getDesignerFax());
		vrVehicleTypeCertificateImpl.setVerificationCertificateNo(vrVehicleTypeCertificate.getVerificationCertificateNo());
		vrVehicleTypeCertificateImpl.setVerificationCertificateDate(vrVehicleTypeCertificate.getVerificationCertificateDate());
		vrVehicleTypeCertificateImpl.setVerificationRefNo(vrVehicleTypeCertificate.getVerificationRefNo());
		vrVehicleTypeCertificateImpl.setVerificationRefDate(vrVehicleTypeCertificate.getVerificationRefDate());
		vrVehicleTypeCertificateImpl.setTypeApprovalCertificateNo(vrVehicleTypeCertificate.getTypeApprovalCertificateNo());
		vrVehicleTypeCertificateImpl.setTypeApprovalCertificateDate(vrVehicleTypeCertificate.getTypeApprovalCertificateDate());
		vrVehicleTypeCertificateImpl.setDesignModelCode(vrVehicleTypeCertificate.getDesignModelCode());
		vrVehicleTypeCertificateImpl.setDesignModelDescription(vrVehicleTypeCertificate.getDesignModelDescription());
		vrVehicleTypeCertificateImpl.setDesignSymbol(vrVehicleTypeCertificate.getDesignSymbol());
		vrVehicleTypeCertificateImpl.setRegisteredNumber(vrVehicleTypeCertificate.getRegisteredNumber());
		vrVehicleTypeCertificateImpl.setInspectorReceiveDate(vrVehicleTypeCertificate.getInspectorReceiveDate());
		vrVehicleTypeCertificateImpl.setInspectorSubmitDate(vrVehicleTypeCertificate.getInspectorSubmitDate());
		vrVehicleTypeCertificateImpl.setInspectorendorSementDate(vrVehicleTypeCertificate.getInspectorendorSementDate());
		vrVehicleTypeCertificateImpl.setInspectorDeadline(vrVehicleTypeCertificate.getInspectorDeadline());
		vrVehicleTypeCertificateImpl.setInspectorFinishDate(vrVehicleTypeCertificate.getInspectorFinishDate());
		vrVehicleTypeCertificateImpl.setInspectorCancelDate(vrVehicleTypeCertificate.getInspectorCancelDate());
		vrVehicleTypeCertificateImpl.setInspectorOrganization(vrVehicleTypeCertificate.getInspectorOrganization());
		vrVehicleTypeCertificateImpl.setInspectorDivision(vrVehicleTypeCertificate.getInspectorDivision());
		vrVehicleTypeCertificateImpl.setInspectorSignName(vrVehicleTypeCertificate.getInspectorSignName());
		vrVehicleTypeCertificateImpl.setInspectorSignTitle(vrVehicleTypeCertificate.getInspectorSignTitle());
		vrVehicleTypeCertificateImpl.setInspectorSignPlace(vrVehicleTypeCertificate.getInspectorSignPlace());
		vrVehicleTypeCertificateImpl.setCertificateType(vrVehicleTypeCertificate.getCertificateType());
		vrVehicleTypeCertificateImpl.setReferenceCertificateNo(vrVehicleTypeCertificate.getReferenceCertificateNo());
		vrVehicleTypeCertificateImpl.setReferenceCertificateDate(vrVehicleTypeCertificate.getReferenceCertificateDate());
		vrVehicleTypeCertificateImpl.setCertificateRecordNo(vrVehicleTypeCertificate.getCertificateRecordNo());
		vrVehicleTypeCertificateImpl.setCertificateSignName(vrVehicleTypeCertificate.getCertificateSignName());
		vrVehicleTypeCertificateImpl.setCertificateSignTitle(vrVehicleTypeCertificate.getCertificateSignTitle());
		vrVehicleTypeCertificateImpl.setCertificateSignPlace(vrVehicleTypeCertificate.getCertificateSignPlace());
		vrVehicleTypeCertificateImpl.setCertificateRecordDate(vrVehicleTypeCertificate.getCertificateRecordDate());
		vrVehicleTypeCertificateImpl.setCertificateRecordExpireDate(vrVehicleTypeCertificate.getCertificateRecordExpireDate());
		vrVehicleTypeCertificateImpl.setExpiredStatus(vrVehicleTypeCertificate.getExpiredStatus());
		vrVehicleTypeCertificateImpl.setCertificateRecordStatus(vrVehicleTypeCertificate.getCertificateRecordStatus());
		vrVehicleTypeCertificateImpl.setDigitalIssueStatus(vrVehicleTypeCertificate.getDigitalIssueStatus());
		vrVehicleTypeCertificateImpl.setVehicleClass(vrVehicleTypeCertificate.getVehicleClass());
		vrVehicleTypeCertificateImpl.setCertifiedVehicleType(vrVehicleTypeCertificate.getCertifiedVehicleType());
		vrVehicleTypeCertificateImpl.setCertifiedVehicleTypeDescription(vrVehicleTypeCertificate.getCertifiedVehicleTypeDescription());
		vrVehicleTypeCertificateImpl.setCertifiedTrademark(vrVehicleTypeCertificate.getCertifiedTrademark());
		vrVehicleTypeCertificateImpl.setCertifiedTrademarkName(vrVehicleTypeCertificate.getCertifiedTrademarkName());
		vrVehicleTypeCertificateImpl.setCertifiedCommercialName(vrVehicleTypeCertificate.getCertifiedCommercialName());
		vrVehicleTypeCertificateImpl.setCertifiedModelCode(vrVehicleTypeCertificate.getCertifiedModelCode());
		vrVehicleTypeCertificateImpl.setCertifiedAssemblyType(vrVehicleTypeCertificate.getCertifiedAssemblyType());
		vrVehicleTypeCertificateImpl.setCertifiedAssemblyTypeDescription(vrVehicleTypeCertificate.getCertifiedAssemblyTypeDescription());
		vrVehicleTypeCertificateImpl.setCertifiedVINNo(vrVehicleTypeCertificate.getCertifiedVINNo());
		vrVehicleTypeCertificateImpl.setCertifiedVINPosition(vrVehicleTypeCertificate.getCertifiedVINPosition());
		vrVehicleTypeCertificateImpl.setCertifiedFrameNo(vrVehicleTypeCertificate.getCertifiedFrameNo());
		vrVehicleTypeCertificateImpl.setCertifiedFrameAttachPlace(vrVehicleTypeCertificate.getCertifiedFrameAttachPlace());
		vrVehicleTypeCertificateImpl.setCertifiedFramePosition(vrVehicleTypeCertificate.getCertifiedFramePosition());
		vrVehicleTypeCertificateImpl.setCertifiedEngineNo(vrVehicleTypeCertificate.getCertifiedEngineNo());
		vrVehicleTypeCertificateImpl.setCertifiedEngineAttachPlace(vrVehicleTypeCertificate.getCertifiedEngineAttachPlace());
		vrVehicleTypeCertificateImpl.setCertifiedEnginePosition(vrVehicleTypeCertificate.getCertifiedEnginePosition());
		vrVehicleTypeCertificateImpl.setSafetyTestReportNo(vrVehicleTypeCertificate.getSafetyTestReportNo());
		vrVehicleTypeCertificateImpl.setSafetyTestReportDate(vrVehicleTypeCertificate.getSafetyTestReportDate());
		vrVehicleTypeCertificateImpl.setEmissionTestReportNo(vrVehicleTypeCertificate.getEmissionTestReportNo());
		vrVehicleTypeCertificateImpl.setEmissionTestReportDate(vrVehicleTypeCertificate.getEmissionTestReportDate());
		vrVehicleTypeCertificateImpl.setCommonSafetyStandard(vrVehicleTypeCertificate.getCommonSafetyStandard());
		vrVehicleTypeCertificateImpl.setCommonSafetyDescription(vrVehicleTypeCertificate.getCommonSafetyDescription());
		vrVehicleTypeCertificateImpl.setEmissionStandard(vrVehicleTypeCertificate.getEmissionStandard());
		vrVehicleTypeCertificateImpl.setEmissionDescription(vrVehicleTypeCertificate.getEmissionDescription());
		vrVehicleTypeCertificateImpl.setOtherTestReportNo(vrVehicleTypeCertificate.getOtherTestReportNo());
		vrVehicleTypeCertificateImpl.setOtherTestReportDate(vrVehicleTypeCertificate.getOtherTestReportDate());
		vrVehicleTypeCertificateImpl.setSampleFrameNo(vrVehicleTypeCertificate.getSampleFrameNo());
		vrVehicleTypeCertificateImpl.setSampleVINNo(vrVehicleTypeCertificate.getSampleVINNo());
		vrVehicleTypeCertificateImpl.setSampleEngineNo(vrVehicleTypeCertificate.getSampleEngineNo());
		vrVehicleTypeCertificateImpl.setSampleVehicleType(vrVehicleTypeCertificate.getSampleVehicleType());
		vrVehicleTypeCertificateImpl.setSampleVehicleTypeDescription(vrVehicleTypeCertificate.getSampleVehicleTypeDescription());
		vrVehicleTypeCertificateImpl.setSampleTrademark(vrVehicleTypeCertificate.getSampleTrademark());
		vrVehicleTypeCertificateImpl.setSampleTrademarkName(vrVehicleTypeCertificate.getSampleTrademarkName());
		vrVehicleTypeCertificateImpl.setSampleCommercialName(vrVehicleTypeCertificate.getSampleCommercialName());
		vrVehicleTypeCertificateImpl.setSampleModelCode(vrVehicleTypeCertificate.getSampleModelCode());
		vrVehicleTypeCertificateImpl.setCustomsDeclarationNo(vrVehicleTypeCertificate.getCustomsDeclarationNo());
		vrVehicleTypeCertificateImpl.setCustomsDeclarationDate(vrVehicleTypeCertificate.getCustomsDeclarationDate());
		vrVehicleTypeCertificateImpl.setProductionCountry(vrVehicleTypeCertificate.getProductionCountry());
		vrVehicleTypeCertificateImpl.setImporterQuantity(vrVehicleTypeCertificate.getImporterQuantity());
		vrVehicleTypeCertificateImpl.setInspectionRecordNo(vrVehicleTypeCertificate.getInspectionRecordNo());
		vrVehicleTypeCertificateImpl.setInspectionDate(vrVehicleTypeCertificate.getInspectionDate());
		vrVehicleTypeCertificateImpl.setInspectionSite(vrVehicleTypeCertificate.getInspectionSite());
		vrVehicleTypeCertificateImpl.setInspectionDistrictCode(vrVehicleTypeCertificate.getInspectionDistrictCode());
		vrVehicleTypeCertificateImpl.setInspectionDistrictName(vrVehicleTypeCertificate.getInspectionDistrictName());
		vrVehicleTypeCertificateImpl.setInspectionProvinceCode(vrVehicleTypeCertificate.getInspectionProvinceCode());
		vrVehicleTypeCertificateImpl.setInspectionProvinceName(vrVehicleTypeCertificate.getInspectionProvinceName());
		vrVehicleTypeCertificateImpl.setCorporationId(vrVehicleTypeCertificate.getCorporationId());
		vrVehicleTypeCertificateImpl.setInspectorId(vrVehicleTypeCertificate.getInspectorId());
		vrVehicleTypeCertificateImpl.setRemarks(vrVehicleTypeCertificate.getRemarks());
		vrVehicleTypeCertificateImpl.setInspectionNote(vrVehicleTypeCertificate.getInspectionNote());
		vrVehicleTypeCertificateImpl.setCertificateNote(vrVehicleTypeCertificate.getCertificateNote());
		vrVehicleTypeCertificateImpl.setDeliverableCode(vrVehicleTypeCertificate.getDeliverableCode());
		vrVehicleTypeCertificateImpl.setDeliverableFileEntryid(vrVehicleTypeCertificate.getDeliverableFileEntryid());
		vrVehicleTypeCertificateImpl.setModule(vrVehicleTypeCertificate.getModule());
		vrVehicleTypeCertificateImpl.setModifyDate(vrVehicleTypeCertificate.getModifyDate());
		vrVehicleTypeCertificateImpl.setSyncDate(vrVehicleTypeCertificate.getSyncDate());

		return vrVehicleTypeCertificateImpl;
	}

	/**
	 * Returns the vr vehicle type certificate with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr vehicle type certificate
	 * @return the vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRVehicleTypeCertificateException {
		VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByPrimaryKey(primaryKey);

		if (vrVehicleTypeCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRVehicleTypeCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrVehicleTypeCertificate;
	}

	/**
	 * Returns the vr vehicle type certificate with the primary key or throws a {@link NoSuchVRVehicleTypeCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the vr vehicle type certificate
	 * @return the vr vehicle type certificate
	 * @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate findByPrimaryKey(long id)
		throws NoSuchVRVehicleTypeCertificateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr vehicle type certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr vehicle type certificate
	 * @return the vr vehicle type certificate, or <code>null</code> if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
				VRVehicleTypeCertificateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRVehicleTypeCertificate vrVehicleTypeCertificate = (VRVehicleTypeCertificate)serializable;

		if (vrVehicleTypeCertificate == null) {
			Session session = null;

			try {
				session = openSession();

				vrVehicleTypeCertificate = (VRVehicleTypeCertificate)session.get(VRVehicleTypeCertificateImpl.class,
						primaryKey);

				if (vrVehicleTypeCertificate != null) {
					cacheResult(vrVehicleTypeCertificate);
				}
				else {
					entityCache.putResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
						VRVehicleTypeCertificateImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleTypeCertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrVehicleTypeCertificate;
	}

	/**
	 * Returns the vr vehicle type certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr vehicle type certificate
	 * @return the vr vehicle type certificate, or <code>null</code> if a vr vehicle type certificate with the primary key could not be found
	 */
	@Override
	public VRVehicleTypeCertificate fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRVehicleTypeCertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRVehicleTypeCertificate> map = new HashMap<Serializable, VRVehicleTypeCertificate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRVehicleTypeCertificate vrVehicleTypeCertificate = fetchByPrimaryKey(primaryKey);

			if (vrVehicleTypeCertificate != null) {
				map.put(primaryKey, vrVehicleTypeCertificate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleTypeCertificateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRVehicleTypeCertificate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE_PKS_IN);

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

			for (VRVehicleTypeCertificate vrVehicleTypeCertificate : (List<VRVehicleTypeCertificate>)q.list()) {
				map.put(vrVehicleTypeCertificate.getPrimaryKeyObj(),
					vrVehicleTypeCertificate);

				cacheResult(vrVehicleTypeCertificate);

				uncachedPrimaryKeys.remove(vrVehicleTypeCertificate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRVehicleTypeCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleTypeCertificateImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr vehicle type certificates.
	 *
	 * @return the vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle type certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @return the range of vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findAll(int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle type certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle type certificates
	 * @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr vehicle type certificates
	 */
	@Override
	public List<VRVehicleTypeCertificate> findAll(int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
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

		List<VRVehicleTypeCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleTypeCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRVEHICLETYPECERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRVEHICLETYPECERTIFICATE;

				if (pagination) {
					sql = sql.concat(VRVehicleTypeCertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleTypeCertificate>)QueryUtil.list(q,
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
	 * Removes all the vr vehicle type certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRVehicleTypeCertificate vrVehicleTypeCertificate : findAll()) {
			remove(vrVehicleTypeCertificate);
		}
	}

	/**
	 * Returns the number of vr vehicle type certificates.
	 *
	 * @return the number of vr vehicle type certificates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRVEHICLETYPECERTIFICATE);

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
		return VRVehicleTypeCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr vehicle type certificate persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRVehicleTypeCertificateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRVEHICLETYPECERTIFICATE = "SELECT vrVehicleTypeCertificate FROM VRVehicleTypeCertificate vrVehicleTypeCertificate";
	private static final String _SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE_PKS_IN =
		"SELECT vrVehicleTypeCertificate FROM VRVehicleTypeCertificate vrVehicleTypeCertificate WHERE id IN (";
	private static final String _SQL_SELECT_VRVEHICLETYPECERTIFICATE_WHERE = "SELECT vrVehicleTypeCertificate FROM VRVehicleTypeCertificate vrVehicleTypeCertificate WHERE ";
	private static final String _SQL_COUNT_VRVEHICLETYPECERTIFICATE = "SELECT COUNT(vrVehicleTypeCertificate) FROM VRVehicleTypeCertificate vrVehicleTypeCertificate";
	private static final String _SQL_COUNT_VRVEHICLETYPECERTIFICATE_WHERE = "SELECT COUNT(vrVehicleTypeCertificate) FROM VRVehicleTypeCertificate vrVehicleTypeCertificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrVehicleTypeCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRVehicleTypeCertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRVehicleTypeCertificate exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRVehicleTypeCertificatePersistenceImpl.class);
}