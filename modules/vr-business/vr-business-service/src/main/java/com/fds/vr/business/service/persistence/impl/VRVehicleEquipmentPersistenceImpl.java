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

import com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException;
import com.fds.vr.business.model.VRVehicleEquipment;
import com.fds.vr.business.model.impl.VRVehicleEquipmentImpl;
import com.fds.vr.business.model.impl.VRVehicleEquipmentModelImpl;
import com.fds.vr.business.service.persistence.VRVehicleEquipmentPersistence;

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
 * The persistence implementation for the vr vehicle equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleEquipmentPersistence
 * @see com.fds.vr.business.service.persistence.VRVehicleEquipmentUtil
 * @generated
 */
@ProviderType
public class VRVehicleEquipmentPersistenceImpl extends BasePersistenceImpl<VRVehicleEquipment>
	implements VRVehicleEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRVehicleEquipmentUtil} to access the vr vehicle equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRVehicleEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_vehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_vehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRVehicleEquipmentModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_vehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @return the range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return findByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_VEHICLETYPECERTIFICATEID;
			finderArgs = new Object[] { vehicleTypeCertificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_VEHICLETYPECERTIFICATEID;
			finderArgs = new Object[] {
					vehicleTypeCertificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleEquipment vrVehicleEquipment : list) {
					if ((vehicleTypeCertificateId != vrVehicleEquipment.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_F_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleEquipmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRVehicleEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleEquipment>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment findByF_vehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = fetchByF_vehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrVehicleEquipment != null) {
			return vrVehicleEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment fetchByF_vehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		List<VRVehicleEquipment> list = findByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment findByF_vehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = fetchByF_vehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrVehicleEquipment != null) {
			return vrVehicleEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment fetchByF_vehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		int count = countByF_vehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleEquipment> list = findByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle equipment
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment[] findByF_vehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleEquipment[] array = new VRVehicleEquipmentImpl[3];

			array[0] = getByF_vehicleTypeCertificateId_PrevAndNext(session,
					vrVehicleEquipment, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrVehicleEquipment;

			array[2] = getByF_vehicleTypeCertificateId_PrevAndNext(session,
					vrVehicleEquipment, vehicleTypeCertificateId,
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

	protected VRVehicleEquipment getByF_vehicleTypeCertificateId_PrevAndNext(
		Session session, VRVehicleEquipment vrVehicleEquipment,
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE);

		query.append(_FINDER_COLUMN_F_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

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
			query.append(VRVehicleEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle equipments where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		for (VRVehicleEquipment vrVehicleEquipment : findByF_vehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrVehicleEquipment);
		}
	}

	/**
	 * Returns the number of vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr vehicle equipments
	 */
	@Override
	public int countByF_vehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLEEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_F_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

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

	private static final String _FINDER_COLUMN_F_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2 =
		"vrVehicleEquipment.vehicleTypeCertificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_CERTIFICATERECORDID =
		new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_certificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CERTIFICATERECORDID =
		new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_certificateRecordId",
			new String[] { Long.class.getName() },
			VRVehicleEquipmentModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_CERTIFICATERECORDID = new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_certificateRecordId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr vehicle equipments where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId) {
		return findByF_certificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle equipments where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @return the range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end) {
		return findByF_certificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle equipments where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return findByF_certificateRecordId(certificateRecordId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle equipments where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CERTIFICATERECORDID;
			finderArgs = new Object[] { certificateRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_CERTIFICATERECORDID;
			finderArgs = new Object[] {
					certificateRecordId,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleEquipment vrVehicleEquipment : list) {
					if ((certificateRecordId != vrVehicleEquipment.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_F_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleEquipmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<VRVehicleEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleEquipment>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment findByF_certificateRecordId_First(
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = fetchByF_certificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (vrVehicleEquipment != null) {
			return vrVehicleEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment fetchByF_certificateRecordId_First(
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		List<VRVehicleEquipment> list = findByF_certificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment findByF_certificateRecordId_Last(
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = fetchByF_certificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (vrVehicleEquipment != null) {
			return vrVehicleEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment fetchByF_certificateRecordId_Last(
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		int count = countByF_certificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleEquipment> list = findByF_certificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle equipment
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment[] findByF_certificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleEquipment[] array = new VRVehicleEquipmentImpl[3];

			array[0] = getByF_certificateRecordId_PrevAndNext(session,
					vrVehicleEquipment, certificateRecordId, orderByComparator,
					true);

			array[1] = vrVehicleEquipment;

			array[2] = getByF_certificateRecordId_PrevAndNext(session,
					vrVehicleEquipment, certificateRecordId, orderByComparator,
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

	protected VRVehicleEquipment getByF_certificateRecordId_PrevAndNext(
		Session session, VRVehicleEquipment vrVehicleEquipment,
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE);

		query.append(_FINDER_COLUMN_F_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

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
			query.append(VRVehicleEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle equipments where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 */
	@Override
	public void removeByF_certificateRecordId(long certificateRecordId) {
		for (VRVehicleEquipment vrVehicleEquipment : findByF_certificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleEquipment);
		}
	}

	/**
	 * Returns the number of vr vehicle equipments where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching vr vehicle equipments
	 */
	@Override
	public int countByF_certificateRecordId(long certificateRecordId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_CERTIFICATERECORDID;

		Object[] finderArgs = new Object[] { certificateRecordId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLEEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_F_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

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

	private static final String _FINDER_COLUMN_F_CERTIFICATERECORDID_CERTIFICATERECORDID_2 =
		"vrVehicleEquipment.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydossierId",
			new String[] { Long.class.getName() },
			VRVehicleEquipmentModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr vehicle equipments where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findBydossierId(long dossierId) {
		return findBydossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr vehicle equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @return the range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findBydossierId(long dossierId, int start,
		int end) {
		return findBydossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findBydossierId(long dossierId, int start,
		int end, OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return findBydossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle equipments where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findBydossierId(long dossierId, int start,
		int end, OrderByComparator<VRVehicleEquipment> orderByComparator,
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

		List<VRVehicleEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleEquipment vrVehicleEquipment : list) {
					if ((dossierId != vrVehicleEquipment.getDossierId())) {
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

			query.append(_SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleEquipmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRVehicleEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleEquipment>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment findBydossierId_First(long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = fetchBydossierId_First(dossierId,
				orderByComparator);

		if (vrVehicleEquipment != null) {
			return vrVehicleEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment fetchBydossierId_First(long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		List<VRVehicleEquipment> list = findBydossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment findBydossierId_Last(long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = fetchBydossierId_Last(dossierId,
				orderByComparator);

		if (vrVehicleEquipment != null) {
			return vrVehicleEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	 */
	@Override
	public VRVehicleEquipment fetchBydossierId_Last(long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		int count = countBydossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleEquipment> list = findBydossierId(dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle equipment
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment[] findBydossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleEquipment[] array = new VRVehicleEquipmentImpl[3];

			array[0] = getBydossierId_PrevAndNext(session, vrVehicleEquipment,
					dossierId, orderByComparator, true);

			array[1] = vrVehicleEquipment;

			array[2] = getBydossierId_PrevAndNext(session, vrVehicleEquipment,
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

	protected VRVehicleEquipment getBydossierId_PrevAndNext(Session session,
		VRVehicleEquipment vrVehicleEquipment, long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE);

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
			query.append(VRVehicleEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle equipments where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBydossierId(long dossierId) {
		for (VRVehicleEquipment vrVehicleEquipment : findBydossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleEquipment);
		}
	}

	/**
	 * Returns the number of vr vehicle equipments where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr vehicle equipments
	 */
	@Override
	public int countBydossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLEEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrVehicleEquipment.dossierId = ?";

	public VRVehicleEquipmentPersistenceImpl() {
		setModelClass(VRVehicleEquipment.class);
	}

	/**
	 * Caches the vr vehicle equipment in the entity cache if it is enabled.
	 *
	 * @param vrVehicleEquipment the vr vehicle equipment
	 */
	@Override
	public void cacheResult(VRVehicleEquipment vrVehicleEquipment) {
		entityCache.putResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class, vrVehicleEquipment.getPrimaryKey(),
			vrVehicleEquipment);

		vrVehicleEquipment.resetOriginalValues();
	}

	/**
	 * Caches the vr vehicle equipments in the entity cache if it is enabled.
	 *
	 * @param vrVehicleEquipments the vr vehicle equipments
	 */
	@Override
	public void cacheResult(List<VRVehicleEquipment> vrVehicleEquipments) {
		for (VRVehicleEquipment vrVehicleEquipment : vrVehicleEquipments) {
			if (entityCache.getResult(
						VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRVehicleEquipmentImpl.class,
						vrVehicleEquipment.getPrimaryKey()) == null) {
				cacheResult(vrVehicleEquipment);
			}
			else {
				vrVehicleEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr vehicle equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRVehicleEquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr vehicle equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRVehicleEquipment vrVehicleEquipment) {
		entityCache.removeResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class, vrVehicleEquipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRVehicleEquipment> vrVehicleEquipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRVehicleEquipment vrVehicleEquipment : vrVehicleEquipments) {
			entityCache.removeResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRVehicleEquipmentImpl.class, vrVehicleEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr vehicle equipment with the primary key. Does not add the vr vehicle equipment to the database.
	 *
	 * @param id the primary key for the new vr vehicle equipment
	 * @return the new vr vehicle equipment
	 */
	@Override
	public VRVehicleEquipment create(long id) {
		VRVehicleEquipment vrVehicleEquipment = new VRVehicleEquipmentImpl();

		vrVehicleEquipment.setNew(true);
		vrVehicleEquipment.setPrimaryKey(id);

		return vrVehicleEquipment;
	}

	/**
	 * Removes the vr vehicle equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr vehicle equipment
	 * @return the vr vehicle equipment that was removed
	 * @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment remove(long id)
		throws NoSuchVRVehicleEquipmentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr vehicle equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr vehicle equipment
	 * @return the vr vehicle equipment that was removed
	 * @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment remove(Serializable primaryKey)
		throws NoSuchVRVehicleEquipmentException {
		Session session = null;

		try {
			session = openSession();

			VRVehicleEquipment vrVehicleEquipment = (VRVehicleEquipment)session.get(VRVehicleEquipmentImpl.class,
					primaryKey);

			if (vrVehicleEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRVehicleEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrVehicleEquipment);
		}
		catch (NoSuchVRVehicleEquipmentException nsee) {
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
	protected VRVehicleEquipment removeImpl(
		VRVehicleEquipment vrVehicleEquipment) {
		vrVehicleEquipment = toUnwrappedModel(vrVehicleEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrVehicleEquipment)) {
				vrVehicleEquipment = (VRVehicleEquipment)session.get(VRVehicleEquipmentImpl.class,
						vrVehicleEquipment.getPrimaryKeyObj());
			}

			if (vrVehicleEquipment != null) {
				session.delete(vrVehicleEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrVehicleEquipment != null) {
			clearCache(vrVehicleEquipment);
		}

		return vrVehicleEquipment;
	}

	@Override
	public VRVehicleEquipment updateImpl(VRVehicleEquipment vrVehicleEquipment) {
		vrVehicleEquipment = toUnwrappedModel(vrVehicleEquipment);

		boolean isNew = vrVehicleEquipment.isNew();

		VRVehicleEquipmentModelImpl vrVehicleEquipmentModelImpl = (VRVehicleEquipmentModelImpl)vrVehicleEquipment;

		Session session = null;

		try {
			session = openSession();

			if (vrVehicleEquipment.isNew()) {
				session.save(vrVehicleEquipment);

				vrVehicleEquipment.setNew(false);
			}
			else {
				vrVehicleEquipment = (VRVehicleEquipment)session.merge(vrVehicleEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRVehicleEquipmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrVehicleEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleEquipmentModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrVehicleEquipmentModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_VEHICLETYPECERTIFICATEID,
					args);
			}

			if ((vrVehicleEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleEquipmentModelImpl.getOriginalCertificateRecordId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_CERTIFICATERECORDID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						vrVehicleEquipmentModelImpl.getCertificateRecordId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_CERTIFICATERECORDID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CERTIFICATERECORDID,
					args);
			}

			if ((vrVehicleEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleEquipmentModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] { vrVehicleEquipmentModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}
		}

		entityCache.putResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleEquipmentImpl.class, vrVehicleEquipment.getPrimaryKey(),
			vrVehicleEquipment, false);

		vrVehicleEquipment.resetOriginalValues();

		return vrVehicleEquipment;
	}

	protected VRVehicleEquipment toUnwrappedModel(
		VRVehicleEquipment vrVehicleEquipment) {
		if (vrVehicleEquipment instanceof VRVehicleEquipmentImpl) {
			return vrVehicleEquipment;
		}

		VRVehicleEquipmentImpl vrVehicleEquipmentImpl = new VRVehicleEquipmentImpl();

		vrVehicleEquipmentImpl.setNew(vrVehicleEquipment.isNew());
		vrVehicleEquipmentImpl.setPrimaryKey(vrVehicleEquipment.getPrimaryKey());

		vrVehicleEquipmentImpl.setId(vrVehicleEquipment.getId());
		vrVehicleEquipmentImpl.setVehicleTypeCertificateId(vrVehicleEquipment.getVehicleTypeCertificateId());
		vrVehicleEquipmentImpl.setCertificateRecordId(vrVehicleEquipment.getCertificateRecordId());
		vrVehicleEquipmentImpl.setDossierId(vrVehicleEquipment.getDossierId());
		vrVehicleEquipmentImpl.setDossierIdCTN(vrVehicleEquipment.getDossierIdCTN());
		vrVehicleEquipmentImpl.setDossierNo(vrVehicleEquipment.getDossierNo());
		vrVehicleEquipmentImpl.setIsMandatory(vrVehicleEquipment.getIsMandatory());
		vrVehicleEquipmentImpl.setSequenceNo(vrVehicleEquipment.getSequenceNo());
		vrVehicleEquipmentImpl.setCertificateRecordNo(vrVehicleEquipment.getCertificateRecordNo());
		vrVehicleEquipmentImpl.setCertificateRecordDate(vrVehicleEquipment.getCertificateRecordDate());
		vrVehicleEquipmentImpl.setCertificateRecordExpireDate(vrVehicleEquipment.getCertificateRecordExpireDate());
		vrVehicleEquipmentImpl.setExpiredStatus(vrVehicleEquipment.getExpiredStatus());
		vrVehicleEquipmentImpl.setVehicleClass(vrVehicleEquipment.getVehicleClass());
		vrVehicleEquipmentImpl.setEquipmentCode(vrVehicleEquipment.getEquipmentCode());
		vrVehicleEquipmentImpl.setEquipmentName(vrVehicleEquipment.getEquipmentName());
		vrVehicleEquipmentImpl.setCertifiedVehicleType(vrVehicleEquipment.getCertifiedVehicleType());
		vrVehicleEquipmentImpl.setCertifiedVehicleTypeDescription(vrVehicleEquipment.getCertifiedVehicleTypeDescription());
		vrVehicleEquipmentImpl.setCertifiedTrademark(vrVehicleEquipment.getCertifiedTrademark());
		vrVehicleEquipmentImpl.setCertifiedTrademarkName(vrVehicleEquipment.getCertifiedTrademarkName());
		vrVehicleEquipmentImpl.setCertifiedCommercialName(vrVehicleEquipment.getCertifiedCommercialName());
		vrVehicleEquipmentImpl.setCertifiedModelCode(vrVehicleEquipment.getCertifiedModelCode());
		vrVehicleEquipmentImpl.setProductionCountry(vrVehicleEquipment.getProductionCountry());
		vrVehicleEquipmentImpl.setOriginalCode(vrVehicleEquipment.getOriginalCode());
		vrVehicleEquipmentImpl.setOriginalName(vrVehicleEquipment.getOriginalName());
		vrVehicleEquipmentImpl.setProductionName(vrVehicleEquipment.getProductionName());
		vrVehicleEquipmentImpl.setProductionAddress(vrVehicleEquipment.getProductionAddress());
		vrVehicleEquipmentImpl.setManufacturerName(vrVehicleEquipment.getManufacturerName());
		vrVehicleEquipmentImpl.setManufacturerAddress(vrVehicleEquipment.getManufacturerAddress());
		vrVehicleEquipmentImpl.setSafetytestReportNo(vrVehicleEquipment.getSafetytestReportNo());
		vrVehicleEquipmentImpl.setSafetytestReportDate(vrVehicleEquipment.getSafetytestReportDate());
		vrVehicleEquipmentImpl.setEmissionTestReportNo(vrVehicleEquipment.getEmissionTestReportNo());
		vrVehicleEquipmentImpl.setEmissionTestReportDate(vrVehicleEquipment.getEmissionTestReportDate());
		vrVehicleEquipmentImpl.setCommonSafetyStandard(vrVehicleEquipment.getCommonSafetyStandard());
		vrVehicleEquipmentImpl.setCommonSafetyDescription(vrVehicleEquipment.getCommonSafetyDescription());
		vrVehicleEquipmentImpl.setEmissionStandard(vrVehicleEquipment.getEmissionStandard());
		vrVehicleEquipmentImpl.setEmissionDescription(vrVehicleEquipment.getEmissionDescription());
		vrVehicleEquipmentImpl.setOthertestReportNo(vrVehicleEquipment.getOthertestReportNo());
		vrVehicleEquipmentImpl.setOthertestReportDate(vrVehicleEquipment.getOthertestReportDate());
		vrVehicleEquipmentImpl.setCopReportNo(vrVehicleEquipment.getCopReportNo());
		vrVehicleEquipmentImpl.setCopReportDate(vrVehicleEquipment.getCopReportDate());
		vrVehicleEquipmentImpl.setCopReportExpireDate(vrVehicleEquipment.getCopReportExpireDate());
		vrVehicleEquipmentImpl.setModifyDate(vrVehicleEquipment.getModifyDate());
		vrVehicleEquipmentImpl.setSyncDate(vrVehicleEquipment.getSyncDate());

		return vrVehicleEquipmentImpl;
	}

	/**
	 * Returns the vr vehicle equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr vehicle equipment
	 * @return the vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRVehicleEquipmentException {
		VRVehicleEquipment vrVehicleEquipment = fetchByPrimaryKey(primaryKey);

		if (vrVehicleEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRVehicleEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrVehicleEquipment;
	}

	/**
	 * Returns the vr vehicle equipment with the primary key or throws a {@link NoSuchVRVehicleEquipmentException} if it could not be found.
	 *
	 * @param id the primary key of the vr vehicle equipment
	 * @return the vr vehicle equipment
	 * @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment findByPrimaryKey(long id)
		throws NoSuchVRVehicleEquipmentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr vehicle equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr vehicle equipment
	 * @return the vr vehicle equipment, or <code>null</code> if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRVehicleEquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRVehicleEquipment vrVehicleEquipment = (VRVehicleEquipment)serializable;

		if (vrVehicleEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				vrVehicleEquipment = (VRVehicleEquipment)session.get(VRVehicleEquipmentImpl.class,
						primaryKey);

				if (vrVehicleEquipment != null) {
					cacheResult(vrVehicleEquipment);
				}
				else {
					entityCache.putResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRVehicleEquipmentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrVehicleEquipment;
	}

	/**
	 * Returns the vr vehicle equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr vehicle equipment
	 * @return the vr vehicle equipment, or <code>null</code> if a vr vehicle equipment with the primary key could not be found
	 */
	@Override
	public VRVehicleEquipment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRVehicleEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRVehicleEquipment> map = new HashMap<Serializable, VRVehicleEquipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRVehicleEquipment vrVehicleEquipment = fetchByPrimaryKey(primaryKey);

			if (vrVehicleEquipment != null) {
				map.put(primaryKey, vrVehicleEquipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleEquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRVehicleEquipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE_PKS_IN);

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

			for (VRVehicleEquipment vrVehicleEquipment : (List<VRVehicleEquipment>)q.list()) {
				map.put(vrVehicleEquipment.getPrimaryKeyObj(),
					vrVehicleEquipment);

				cacheResult(vrVehicleEquipment);

				uncachedPrimaryKeys.remove(vrVehicleEquipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRVehicleEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleEquipmentImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr vehicle equipments.
	 *
	 * @return the vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @return the range of vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findAll(int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle equipments
	 * @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr vehicle equipments
	 */
	@Override
	public List<VRVehicleEquipment> findAll(int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
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

		List<VRVehicleEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRVEHICLEEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRVEHICLEEQUIPMENT;

				if (pagination) {
					sql = sql.concat(VRVehicleEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRVehicleEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleEquipment>)QueryUtil.list(q,
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
	 * Removes all the vr vehicle equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRVehicleEquipment vrVehicleEquipment : findAll()) {
			remove(vrVehicleEquipment);
		}
	}

	/**
	 * Returns the number of vr vehicle equipments.
	 *
	 * @return the number of vr vehicle equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRVEHICLEEQUIPMENT);

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
		return VRVehicleEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr vehicle equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRVehicleEquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRVEHICLEEQUIPMENT = "SELECT vrVehicleEquipment FROM VRVehicleEquipment vrVehicleEquipment";
	private static final String _SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE_PKS_IN = "SELECT vrVehicleEquipment FROM VRVehicleEquipment vrVehicleEquipment WHERE id IN (";
	private static final String _SQL_SELECT_VRVEHICLEEQUIPMENT_WHERE = "SELECT vrVehicleEquipment FROM VRVehicleEquipment vrVehicleEquipment WHERE ";
	private static final String _SQL_COUNT_VRVEHICLEEQUIPMENT = "SELECT COUNT(vrVehicleEquipment) FROM VRVehicleEquipment vrVehicleEquipment";
	private static final String _SQL_COUNT_VRVEHICLEEQUIPMENT_WHERE = "SELECT COUNT(vrVehicleEquipment) FROM VRVehicleEquipment vrVehicleEquipment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrVehicleEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRVehicleEquipment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRVehicleEquipment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRVehicleEquipmentPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dossierId", "dossierNo"
			});
}