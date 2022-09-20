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

import com.fds.vr.business.exception.NoSuchVRProductionPlantException;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRProductionPlantModelImpl;
import com.fds.vr.business.service.persistence.VRProductionPlantPersistence;

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
 * The persistence implementation for the vr production plant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantPersistence
 * @see com.fds.vr.business.service.persistence.VRProductionPlantUtil
 * @generated
 */
@ProviderType
public class VRProductionPlantPersistenceImpl extends BasePersistenceImpl<VRProductionPlant>
	implements VRProductionPlantPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductionPlantUtil} to access the vr production plant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductionPlantImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONFORMID =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByregistrationFormId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONFORMID =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByregistrationFormId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.REGISTRATIONID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTRATIONFORMID = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByregistrationFormId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByregistrationFormId(long mtCore,
		long applicantProfileId, long registrationId) {
		return findByregistrationFormId(mtCore, applicantProfileId,
			registrationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByregistrationFormId(long mtCore,
		long applicantProfileId, long registrationId, int start, int end) {
		return findByregistrationFormId(mtCore, applicantProfileId,
			registrationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByregistrationFormId(long mtCore,
		long applicantProfileId, long registrationId, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByregistrationFormId(mtCore, applicantProfileId,
			registrationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByregistrationFormId(long mtCore,
		long applicantProfileId, long registrationId, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONFORMID;
			finderArgs = new Object[] { mtCore, applicantProfileId, registrationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONFORMID;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, registrationId,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
							(registrationId != vrProductionPlant.getRegistrationId())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_REGISTRATIONFORMID_MTCORE_2);

			query.append(_FINDER_COLUMN_REGISTRATIONFORMID_APPLICANTPROFILEID_2);

			query.append(_FINDER_COLUMN_REGISTRATIONFORMID_REGISTRATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				qPos.add(registrationId);

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByregistrationFormId_First(long mtCore,
		long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByregistrationFormId_First(mtCore,
				applicantProfileId, registrationId, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", registrationId=");
		msg.append(registrationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByregistrationFormId_First(long mtCore,
		long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByregistrationFormId(mtCore,
				applicantProfileId, registrationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByregistrationFormId_Last(long mtCore,
		long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByregistrationFormId_Last(mtCore,
				applicantProfileId, registrationId, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", registrationId=");
		msg.append(registrationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByregistrationFormId_Last(long mtCore,
		long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByregistrationFormId(mtCore, applicantProfileId,
				registrationId);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByregistrationFormId(mtCore,
				applicantProfileId, registrationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByregistrationFormId_PrevAndNext(long id,
		long mtCore, long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByregistrationFormId_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					registrationId, orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByregistrationFormId_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					registrationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRProductionPlant getByregistrationFormId_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_REGISTRATIONFORMID_MTCORE_2);

		query.append(_FINDER_COLUMN_REGISTRATIONFORMID_APPLICANTPROFILEID_2);

		query.append(_FINDER_COLUMN_REGISTRATIONFORMID_REGISTRATIONID_2);

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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		qPos.add(registrationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 */
	@Override
	public void removeByregistrationFormId(long mtCore,
		long applicantProfileId, long registrationId) {
		for (VRProductionPlant vrProductionPlant : findByregistrationFormId(
				mtCore, applicantProfileId, registrationId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationId the registration ID
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByregistrationFormId(long mtCore, long applicantProfileId,
		long registrationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTRATIONFORMID;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, registrationId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_REGISTRATIONFORMID_MTCORE_2);

			query.append(_FINDER_COLUMN_REGISTRATIONFORMID_APPLICANTPROFILEID_2);

			query.append(_FINDER_COLUMN_REGISTRATIONFORMID_REGISTRATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

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

	private static final String _FINDER_COLUMN_REGISTRATIONFORMID_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_REGISTRATIONFORMID_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_REGISTRATIONFORMID_REGISTRATIONID_2 =
		"vrProductionPlant.registrationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGSTATUS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymappingStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymappingStatus",
			new String[] { Long.class.getName(), String.class.getName() },
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MAPPINGSTATUS_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MAPPINGSTATUS = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBymappingStatus",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findBymappingStatus(long mtCore,
		String mappingStatus) {
		return findBymappingStatus(mtCore, mappingStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findBymappingStatus(long mtCore,
		String mappingStatus, int start, int end) {
		return findBymappingStatus(mtCore, mappingStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findBymappingStatus(long mtCore,
		String mappingStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findBymappingStatus(mtCore, mappingStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findBymappingStatus(long mtCore,
		String mappingStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS;
			finderArgs = new Object[] { mtCore, mappingStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGSTATUS;
			finderArgs = new Object[] {
					mtCore, mappingStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							!Objects.equals(mappingStatus,
								vrProductionPlant.getMappingStatus())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MTCORE_2);

			boolean bindMappingStatus = false;

			if (mappingStatus == null) {
				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_1);
			}
			else if (mappingStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_3);
			}
			else {
				bindMappingStatus = true;

				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingStatus) {
					qPos.add(mappingStatus);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findBymappingStatus_First(long mtCore,
		String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchBymappingStatus_First(mtCore,
				mappingStatus, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingStatus=");
		msg.append(mappingStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchBymappingStatus_First(long mtCore,
		String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findBymappingStatus(mtCore,
				mappingStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findBymappingStatus_Last(long mtCore,
		String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchBymappingStatus_Last(mtCore,
				mappingStatus, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingStatus=");
		msg.append(mappingStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchBymappingStatus_Last(long mtCore,
		String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countBymappingStatus(mtCore, mappingStatus);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findBymappingStatus(mtCore,
				mappingStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findBymappingStatus_PrevAndNext(long id,
		long mtCore, String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getBymappingStatus_PrevAndNext(session,
					vrProductionPlant, mtCore, mappingStatus,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getBymappingStatus_PrevAndNext(session,
					vrProductionPlant, mtCore, mappingStatus,
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

	protected VRProductionPlant getBymappingStatus_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_MAPPINGSTATUS_MTCORE_2);

		boolean bindMappingStatus = false;

		if (mappingStatus == null) {
			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_1);
		}
		else if (mappingStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_3);
		}
		else {
			bindMappingStatus = true;

			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindMappingStatus) {
			qPos.add(mappingStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and mappingStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 */
	@Override
	public void removeBymappingStatus(long mtCore, String mappingStatus) {
		for (VRProductionPlant vrProductionPlant : findBymappingStatus(mtCore,
				mappingStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countBymappingStatus(long mtCore, String mappingStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MAPPINGSTATUS;

		Object[] finderArgs = new Object[] { mtCore, mappingStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MTCORE_2);

			boolean bindMappingStatus = false;

			if (mappingStatus == null) {
				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_1);
			}
			else if (mappingStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_3);
			}
			else {
				bindMappingStatus = true;

				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingStatus) {
					qPos.add(mappingStatus);
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

	private static final String _FINDER_COLUMN_MAPPINGSTATUS_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_1 = "vrProductionPlant.mappingStatus IS NULL";
	private static final String _FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_2 = "vrProductionPlant.mappingStatus = ?";
	private static final String _FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_3 = "(vrProductionPlant.mappingStatus IS NULL OR vrProductionPlant.mappingStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTCODE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapplicantCode",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByapplicantCode",
			new String[] { Long.class.getName(), String.class.getName() },
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTCODE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTCODE = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByapplicantCode",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByapplicantCode(long mtCore,
		String applicantCode) {
		return findByapplicantCode(mtCore, applicantCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByapplicantCode(long mtCore,
		String applicantCode, int start, int end) {
		return findByapplicantCode(mtCore, applicantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByapplicantCode(long mtCore,
		String applicantCode, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByapplicantCode(mtCore, applicantCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByapplicantCode(long mtCore,
		String applicantCode, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE;
			finderArgs = new Object[] { mtCore, applicantCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTCODE;
			finderArgs = new Object[] {
					mtCore, applicantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							!Objects.equals(applicantCode,
								vrProductionPlant.getApplicantCode())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTCODE_MTCORE_2);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantCode) {
					qPos.add(applicantCode);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByapplicantCode_First(long mtCore,
		String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByapplicantCode_First(mtCore,
				applicantCode, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantCode=");
		msg.append(applicantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByapplicantCode_First(long mtCore,
		String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByapplicantCode(mtCore,
				applicantCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByapplicantCode_Last(long mtCore,
		String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByapplicantCode_Last(mtCore,
				applicantCode, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantCode=");
		msg.append(applicantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByapplicantCode_Last(long mtCore,
		String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByapplicantCode(mtCore, applicantCode);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByapplicantCode(mtCore,
				applicantCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByapplicantCode_PrevAndNext(long id,
		long mtCore, String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByapplicantCode_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantCode,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByapplicantCode_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantCode,
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

	protected VRProductionPlant getByapplicantCode_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTCODE_MTCORE_2);

		boolean bindApplicantCode = false;

		if (applicantCode == null) {
			query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1);
		}
		else if (applicantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3);
		}
		else {
			bindApplicantCode = true;

			query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindApplicantCode) {
			qPos.add(applicantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantCode = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 */
	@Override
	public void removeByapplicantCode(long mtCore, String applicantCode) {
		for (VRProductionPlant vrProductionPlant : findByapplicantCode(mtCore,
				applicantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByapplicantCode(long mtCore, String applicantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTCODE;

		Object[] finderArgs = new Object[] { mtCore, applicantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTCODE_MTCORE_2);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantCode) {
					qPos.add(applicantCode);
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

	private static final String _FINDER_COLUMN_APPLICANTCODE_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1 = "vrProductionPlant.applicantCode IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2 = "vrProductionPlant.applicantCode = ?";
	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3 = "(vrProductionPlant.applicantCode IS NULL OR vrProductionPlant.applicantCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_ProductionPlantCode",
			new String[] { String.class.getName() },
			VRProductionPlantModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_ProductionPlantCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr production plant where productionPlantCode = &#63; or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByF_ProductionPlantCode(
		String productionPlantCode) throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByF_ProductionPlantCode(productionPlantCode);

		if (vrProductionPlant == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("productionPlantCode=");
			msg.append(productionPlantCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRProductionPlantException(msg.toString());
		}

		return vrProductionPlant;
	}

	/**
	 * Returns the vr production plant where productionPlantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByF_ProductionPlantCode(
		String productionPlantCode) {
		return fetchByF_ProductionPlantCode(productionPlantCode, true);
	}

	/**
	 * Returns the vr production plant where productionPlantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param productionPlantCode the production plant code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByF_ProductionPlantCode(
		String productionPlantCode, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { productionPlantCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
					finderArgs, this);
		}

		if (result instanceof VRProductionPlant) {
			VRProductionPlant vrProductionPlant = (VRProductionPlant)result;

			if (!Objects.equals(productionPlantCode,
						vrProductionPlant.getProductionPlantCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				List<VRProductionPlant> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRProductionPlantPersistenceImpl.fetchByF_ProductionPlantCode(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRProductionPlant vrProductionPlant = list.get(0);

					result = vrProductionPlant;

					cacheResult(vrProductionPlant);

					if ((vrProductionPlant.getProductionPlantCode() == null) ||
							!vrProductionPlant.getProductionPlantCode()
												  .equals(productionPlantCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
							finderArgs, vrProductionPlant);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
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
			return (VRProductionPlant)result;
		}
	}

	/**
	 * Removes the vr production plant where productionPlantCode = &#63; from the database.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the vr production plant that was removed
	 */
	@Override
	public VRProductionPlant removeByF_ProductionPlantCode(
		String productionPlantCode) throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByF_ProductionPlantCode(productionPlantCode);

		return remove(vrProductionPlant);
	}

	/**
	 * Returns the number of vr production plants where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByF_ProductionPlantCode(String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE;

		Object[] finderArgs = new Object[] { productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1 =
		"vrProductionPlant.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2 =
		"vrProductionPlant.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3 =
		"(vrProductionPlant.productionPlantCode IS NULL OR vrProductionPlant.productionPlantCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode) {
		return findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode, int start, int end) {
		return findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode, int start,
		int end, OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode, int start,
		int end, OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
							!Objects.equals(productionPlantCode,
								vrProductionPlant.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantCode_First(long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantCode_First(mtCore,
				applicantProfileId, productionPlantCode, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantCode_First(long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantCode(mtCore,
				applicantProfileId, productionPlantCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantCode_Last(long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantCode_Last(mtCore,
				applicantProfileId, productionPlantCode, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantCode_Last(long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantCode(mtCore, applicantProfileId,
				productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantCode(mtCore,
				applicantProfileId, productionPlantCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantCode_PrevAndNext(long id,
		long mtCore, long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantCode_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantCode, orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantCode_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
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

	protected VRProductionPlant getByproductionPlantCode_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantCode(
				mtCore, applicantProfileId, productionPlantCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantCode(long mtCore, long applicantProfileId,
		String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantCode
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1 =
		"vrProductionPlant.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2 =
		"vrProductionPlant.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3 =
		"(vrProductionPlant.productionPlantCode IS NULL OR vrProductionPlant.productionPlantCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGMA_XUONG_LR =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymappingMA_XUONG_LR",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_XUONG_LR =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBymappingMA_XUONG_LR",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MAPPINGMA_CTY_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MAPPINGMA_XUONG_LR_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MAPPINGMA_XUONG_LR = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBymappingMA_XUONG_LR",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findBymappingMA_XUONG_LR(long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR) {
		return findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findBymappingMA_XUONG_LR(long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR, int start, int end) {
		return findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findBymappingMA_XUONG_LR(long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findBymappingMA_XUONG_LR(long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_XUONG_LR;
			finderArgs = new Object[] { mtCore, mappingMA_CTY, mappingMA_XUONG_LR };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGMA_XUONG_LR;
			finderArgs = new Object[] {
					mtCore, mappingMA_CTY, mappingMA_XUONG_LR,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							!Objects.equals(mappingMA_CTY,
								vrProductionPlant.getMappingMA_CTY()) ||
							!Objects.equals(mappingMA_XUONG_LR,
								vrProductionPlant.getMappingMA_XUONG_LR())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MTCORE_2);

			boolean bindMappingMA_CTY = false;

			if (mappingMA_CTY == null) {
				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_1);
			}
			else if (mappingMA_CTY.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_3);
			}
			else {
				bindMappingMA_CTY = true;

				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_2);
			}

			boolean bindMappingMA_XUONG_LR = false;

			if (mappingMA_XUONG_LR == null) {
				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_1);
			}
			else if (mappingMA_XUONG_LR.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_3);
			}
			else {
				bindMappingMA_XUONG_LR = true;

				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingMA_CTY) {
					qPos.add(mappingMA_CTY);
				}

				if (bindMappingMA_XUONG_LR) {
					qPos.add(mappingMA_XUONG_LR);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findBymappingMA_XUONG_LR_First(long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchBymappingMA_XUONG_LR_First(mtCore,
				mappingMA_CTY, mappingMA_XUONG_LR, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingMA_CTY=");
		msg.append(mappingMA_CTY);

		msg.append(", mappingMA_XUONG_LR=");
		msg.append(mappingMA_XUONG_LR);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchBymappingMA_XUONG_LR_First(long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findBymappingMA_XUONG_LR(mtCore,
				mappingMA_CTY, mappingMA_XUONG_LR, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findBymappingMA_XUONG_LR_Last(long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchBymappingMA_XUONG_LR_Last(mtCore,
				mappingMA_CTY, mappingMA_XUONG_LR, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingMA_CTY=");
		msg.append(mappingMA_CTY);

		msg.append(", mappingMA_XUONG_LR=");
		msg.append(mappingMA_XUONG_LR);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchBymappingMA_XUONG_LR_Last(long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
				mappingMA_XUONG_LR);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findBymappingMA_XUONG_LR(mtCore,
				mappingMA_CTY, mappingMA_XUONG_LR, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findBymappingMA_XUONG_LR_PrevAndNext(long id,
		long mtCore, String mappingMA_CTY, String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getBymappingMA_XUONG_LR_PrevAndNext(session,
					vrProductionPlant, mtCore, mappingMA_CTY,
					mappingMA_XUONG_LR, orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getBymappingMA_XUONG_LR_PrevAndNext(session,
					vrProductionPlant, mtCore, mappingMA_CTY,
					mappingMA_XUONG_LR, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRProductionPlant getBymappingMA_XUONG_LR_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		String mappingMA_CTY, String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MTCORE_2);

		boolean bindMappingMA_CTY = false;

		if (mappingMA_CTY == null) {
			query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_1);
		}
		else if (mappingMA_CTY.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_3);
		}
		else {
			bindMappingMA_CTY = true;

			query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_2);
		}

		boolean bindMappingMA_XUONG_LR = false;

		if (mappingMA_XUONG_LR == null) {
			query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_1);
		}
		else if (mappingMA_XUONG_LR.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_3);
		}
		else {
			bindMappingMA_XUONG_LR = true;

			query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindMappingMA_CTY) {
			qPos.add(mappingMA_CTY);
		}

		if (bindMappingMA_XUONG_LR) {
			qPos.add(mappingMA_XUONG_LR);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 */
	@Override
	public void removeBymappingMA_XUONG_LR(long mtCore, String mappingMA_CTY,
		String mappingMA_XUONG_LR) {
		for (VRProductionPlant vrProductionPlant : findBymappingMA_XUONG_LR(
				mtCore, mappingMA_CTY, mappingMA_XUONG_LR, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countBymappingMA_XUONG_LR(long mtCore, String mappingMA_CTY,
		String mappingMA_XUONG_LR) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MAPPINGMA_XUONG_LR;

		Object[] finderArgs = new Object[] {
				mtCore, mappingMA_CTY, mappingMA_XUONG_LR
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MTCORE_2);

			boolean bindMappingMA_CTY = false;

			if (mappingMA_CTY == null) {
				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_1);
			}
			else if (mappingMA_CTY.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_3);
			}
			else {
				bindMappingMA_CTY = true;

				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_2);
			}

			boolean bindMappingMA_XUONG_LR = false;

			if (mappingMA_XUONG_LR == null) {
				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_1);
			}
			else if (mappingMA_XUONG_LR.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_3);
			}
			else {
				bindMappingMA_XUONG_LR = true;

				query.append(_FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingMA_CTY) {
					qPos.add(mappingMA_CTY);
				}

				if (bindMappingMA_XUONG_LR) {
					qPos.add(mappingMA_XUONG_LR);
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

	private static final String _FINDER_COLUMN_MAPPINGMA_XUONG_LR_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_1 =
		"vrProductionPlant.mappingMA_CTY IS NULL AND ";
	private static final String _FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_2 =
		"vrProductionPlant.mappingMA_CTY = ? AND ";
	private static final String _FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_CTY_3 =
		"(vrProductionPlant.mappingMA_CTY IS NULL OR vrProductionPlant.mappingMA_CTY = '') AND ";
	private static final String _FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_1 =
		"vrProductionPlant.mappingMA_XUONG_LR IS NULL";
	private static final String _FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_2 =
		"vrProductionPlant.mappingMA_XUONG_LR = ?";
	private static final String _FINDER_COLUMN_MAPPINGMA_XUONG_LR_MAPPINGMA_XUONG_LR_3 =
		"(vrProductionPlant.mappingMA_XUONG_LR IS NULL OR vrProductionPlant.mappingMA_XUONG_LR = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTTYPE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantType",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTTYPE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantType",
			new String[] { Long.class.getName(), String.class.getName() },
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTTYPE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTTYPE = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantType",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantType(long mtCore,
		String productionPlantType) {
		return findByproductionPlantType(mtCore, productionPlantType,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantType(long mtCore,
		String productionPlantType, int start, int end) {
		return findByproductionPlantType(mtCore, productionPlantType, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantType(long mtCore,
		String productionPlantType, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantType(mtCore, productionPlantType, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantType(long mtCore,
		String productionPlantType, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTTYPE;
			finderArgs = new Object[] { mtCore, productionPlantType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTTYPE;
			finderArgs = new Object[] {
					mtCore, productionPlantType,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							!Objects.equals(productionPlantType,
								vrProductionPlant.getProductionPlantType())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_MTCORE_2);

			boolean bindProductionPlantType = false;

			if (productionPlantType == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_1);
			}
			else if (productionPlantType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_3);
			}
			else {
				bindProductionPlantType = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindProductionPlantType) {
					qPos.add(productionPlantType);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantType_First(long mtCore,
		String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantType_First(mtCore,
				productionPlantType, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productionPlantType=");
		msg.append(productionPlantType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantType_First(long mtCore,
		String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantType(mtCore,
				productionPlantType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantType_Last(long mtCore,
		String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantType_Last(mtCore,
				productionPlantType, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productionPlantType=");
		msg.append(productionPlantType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantType_Last(long mtCore,
		String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantType(mtCore, productionPlantType);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantType(mtCore,
				productionPlantType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantType_PrevAndNext(long id,
		long mtCore, String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantType_PrevAndNext(session,
					vrProductionPlant, mtCore, productionPlantType,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantType_PrevAndNext(session,
					vrProductionPlant, mtCore, productionPlantType,
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

	protected VRProductionPlant getByproductionPlantType_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_MTCORE_2);

		boolean bindProductionPlantType = false;

		if (productionPlantType == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_1);
		}
		else if (productionPlantType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_3);
		}
		else {
			bindProductionPlantType = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindProductionPlantType) {
			qPos.add(productionPlantType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and productionPlantType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 */
	@Override
	public void removeByproductionPlantType(long mtCore,
		String productionPlantType) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantType(
				mtCore, productionPlantType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantType the production plant type
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantType(long mtCore,
		String productionPlantType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTTYPE;

		Object[] finderArgs = new Object[] { mtCore, productionPlantType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_MTCORE_2);

			boolean bindProductionPlantType = false;

			if (productionPlantType == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_1);
			}
			else if (productionPlantType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_3);
			}
			else {
				bindProductionPlantType = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindProductionPlantType) {
					qPos.add(productionPlantType);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTTYPE_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_1 =
		"vrProductionPlant.productionPlantType IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_2 =
		"vrProductionPlant.productionPlantType = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTTYPE_PRODUCTIONPLANTTYPE_3 =
		"(vrProductionPlant.productionPlantType IS NULL OR vrProductionPlant.productionPlantType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantStatus",
			new String[] { Long.class.getName(), String.class.getName() },
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTSTATUS_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantStatus",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus(long mtCore,
		String productionPlantStatus) {
		return findByproductionPlantStatus(mtCore, productionPlantStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus(long mtCore,
		String productionPlantStatus, int start, int end) {
		return findByproductionPlantStatus(mtCore, productionPlantStatus,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus(long mtCore,
		String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantStatus(mtCore, productionPlantStatus,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus(long mtCore,
		String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS;
			finderArgs = new Object[] { mtCore, productionPlantStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS;
			finderArgs = new Object[] {
					mtCore, productionPlantStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							!Objects.equals(productionPlantStatus,
								vrProductionPlant.getProductionPlantStatus())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_MTCORE_2);

			boolean bindProductionPlantStatus = false;

			if (productionPlantStatus == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_1);
			}
			else if (productionPlantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_3);
			}
			else {
				bindProductionPlantStatus = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindProductionPlantStatus) {
					qPos.add(productionPlantStatus);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantStatus_First(long mtCore,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantStatus_First(mtCore,
				productionPlantStatus, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productionPlantStatus=");
		msg.append(productionPlantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantStatus_First(long mtCore,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantStatus(mtCore,
				productionPlantStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantStatus_Last(long mtCore,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantStatus_Last(mtCore,
				productionPlantStatus, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productionPlantStatus=");
		msg.append(productionPlantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantStatus_Last(long mtCore,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantStatus(mtCore, productionPlantStatus);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantStatus(mtCore,
				productionPlantStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantStatus_PrevAndNext(
		long id, long mtCore, String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantStatus_PrevAndNext(session,
					vrProductionPlant, mtCore, productionPlantStatus,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantStatus_PrevAndNext(session,
					vrProductionPlant, mtCore, productionPlantStatus,
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

	protected VRProductionPlant getByproductionPlantStatus_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_MTCORE_2);

		boolean bindProductionPlantStatus = false;

		if (productionPlantStatus == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_1);
		}
		else if (productionPlantStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_3);
		}
		else {
			bindProductionPlantStatus = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindProductionPlantStatus) {
			qPos.add(productionPlantStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 */
	@Override
	public void removeByproductionPlantStatus(long mtCore,
		String productionPlantStatus) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantStatus(
				mtCore, productionPlantStatus, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantStatus the production plant status
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantStatus(long mtCore,
		String productionPlantStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS;

		Object[] finderArgs = new Object[] { mtCore, productionPlantStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_MTCORE_2);

			boolean bindProductionPlantStatus = false;

			if (productionPlantStatus == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_1);
			}
			else if (productionPlantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_3);
			}
			else {
				bindProductionPlantStatus = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindProductionPlantStatus) {
					qPos.add(productionPlantStatus);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_1 =
		"vrProductionPlant.productionPlantStatus IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_2 =
		"vrProductionPlant.productionPlantStatus = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PRODUCTIONPLANTSTATUS_3 =
		"(vrProductionPlant.productionPlantStatus IS NULL OR vrProductionPlant.productionPlantStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPCODE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantStatus_PPCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPCODE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantStatus_PPCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTSTATUS_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPCODE =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantStatus_PPCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId, String productionPlantCode,
		String productionPlantStatus) {
		return findByproductionPlantStatus_PPCode(mtCore, applicantProfileId,
			productionPlantCode, productionPlantStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId, String productionPlantCode,
		String productionPlantStatus, int start, int end) {
		return findByproductionPlantStatus_PPCode(mtCore, applicantProfileId,
			productionPlantCode, productionPlantStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId, String productionPlantCode,
		String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantStatus_PPCode(mtCore, applicantProfileId,
			productionPlantCode, productionPlantStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId, String productionPlantCode,
		String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPCODE;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantCode,
					productionPlantStatus
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPCODE;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantCode,
					productionPlantStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
							!Objects.equals(productionPlantCode,
								vrProductionPlant.getProductionPlantCode()) ||
							!Objects.equals(productionPlantStatus,
								vrProductionPlant.getProductionPlantStatus())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_APPLICANTPROFILEID_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_2);
			}

			boolean bindProductionPlantStatus = false;

			if (productionPlantStatus == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_1);
			}
			else if (productionPlantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_3);
			}
			else {
				bindProductionPlantStatus = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (bindProductionPlantStatus) {
					qPos.add(productionPlantStatus);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantStatus_PPCode_First(
		long mtCore, long applicantProfileId, String productionPlantCode,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantStatus_PPCode_First(mtCore,
				applicantProfileId, productionPlantCode, productionPlantStatus,
				orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(", productionPlantStatus=");
		msg.append(productionPlantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantStatus_PPCode_First(
		long mtCore, long applicantProfileId, String productionPlantCode,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantStatus_PPCode(mtCore,
				applicantProfileId, productionPlantCode, productionPlantStatus,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantStatus_PPCode_Last(
		long mtCore, long applicantProfileId, String productionPlantCode,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantStatus_PPCode_Last(mtCore,
				applicantProfileId, productionPlantCode, productionPlantStatus,
				orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(", productionPlantStatus=");
		msg.append(productionPlantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantStatus_PPCode_Last(
		long mtCore, long applicantProfileId, String productionPlantCode,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantStatus_PPCode(mtCore,
				applicantProfileId, productionPlantCode, productionPlantStatus);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantStatus_PPCode(mtCore,
				applicantProfileId, productionPlantCode, productionPlantStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantStatus_PPCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		String productionPlantCode, String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantStatus_PPCode_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantCode, productionPlantStatus,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantStatus_PPCode_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantCode, productionPlantStatus,
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

	protected VRProductionPlant getByproductionPlantStatus_PPCode_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		long applicantProfileId, String productionPlantCode,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_APPLICANTPROFILEID_2);

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_2);
		}

		boolean bindProductionPlantStatus = false;

		if (productionPlantStatus == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_1);
		}
		else if (productionPlantStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_3);
		}
		else {
			bindProductionPlantStatus = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		if (bindProductionPlantStatus) {
			qPos.add(productionPlantStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 */
	@Override
	public void removeByproductionPlantStatus_PPCode(long mtCore,
		long applicantProfileId, String productionPlantCode,
		String productionPlantStatus) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantStatus_PPCode(
				mtCore, applicantProfileId, productionPlantCode,
				productionPlantStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param productionPlantStatus the production plant status
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantStatus_PPCode(long mtCore,
		long applicantProfileId, String productionPlantCode,
		String productionPlantStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPCODE;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantCode,
				productionPlantStatus
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_APPLICANTPROFILEID_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_2);
			}

			boolean bindProductionPlantStatus = false;

			if (productionPlantStatus == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_1);
			}
			else if (productionPlantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_3);
			}
			else {
				bindProductionPlantStatus = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (bindProductionPlantStatus) {
					qPos.add(productionPlantStatus);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_MTCORE_2 =
		"vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_1 =
		"vrProductionPlant.productionPlantCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_2 =
		"vrProductionPlant.productionPlantCode = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTCODE_3 =
		"(vrProductionPlant.productionPlantCode IS NULL OR vrProductionPlant.productionPlantCode = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_1 =
		"vrProductionPlant.productionPlantStatus IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_2 =
		"vrProductionPlant.productionPlantStatus = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPCODE_PRODUCTIONPLANTSTATUS_3 =
		"(vrProductionPlant.productionPlantStatus IS NULL OR vrProductionPlant.productionPlantStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPNAME =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantStatus_PPName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPNAME =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantStatus_PPName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTNAME_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTSTATUS_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPNAME =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantStatus_PPName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantStatus) {
		return findByproductionPlantStatus_PPName(mtCore, applicantProfileId,
			productionPlantName, productionPlantStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantStatus, int start, int end) {
		return findByproductionPlantStatus_PPName(mtCore, applicantProfileId,
			productionPlantName, productionPlantStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantStatus_PPName(mtCore, applicantProfileId,
			productionPlantName, productionPlantStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPNAME;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantName,
					productionPlantStatus
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPNAME;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantName,
					productionPlantStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
							!Objects.equals(productionPlantName,
								vrProductionPlant.getProductionPlantName()) ||
							!Objects.equals(productionPlantStatus,
								vrProductionPlant.getProductionPlantStatus())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_APPLICANTPROFILEID_2);

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_2);
			}

			boolean bindProductionPlantStatus = false;

			if (productionPlantStatus == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_1);
			}
			else if (productionPlantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_3);
			}
			else {
				bindProductionPlantStatus = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
				}

				if (bindProductionPlantStatus) {
					qPos.add(productionPlantStatus);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantStatus_PPName_First(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantStatus_PPName_First(mtCore,
				applicantProfileId, productionPlantName, productionPlantStatus,
				orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(", productionPlantStatus=");
		msg.append(productionPlantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantStatus_PPName_First(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantStatus_PPName(mtCore,
				applicantProfileId, productionPlantName, productionPlantStatus,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantStatus_PPName_Last(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantStatus_PPName_Last(mtCore,
				applicantProfileId, productionPlantName, productionPlantStatus,
				orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(", productionPlantStatus=");
		msg.append(productionPlantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantStatus_PPName_Last(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantStatus_PPName(mtCore,
				applicantProfileId, productionPlantName, productionPlantStatus);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantStatus_PPName(mtCore,
				applicantProfileId, productionPlantName, productionPlantStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantStatus_PPName_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		String productionPlantName, String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantStatus_PPName_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantName, productionPlantStatus,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantStatus_PPName_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantName, productionPlantStatus,
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

	protected VRProductionPlant getByproductionPlantStatus_PPName_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_APPLICANTPROFILEID_2);

		boolean bindProductionPlantName = false;

		if (productionPlantName == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_1);
		}
		else if (productionPlantName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_3);
		}
		else {
			bindProductionPlantName = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_2);
		}

		boolean bindProductionPlantStatus = false;

		if (productionPlantStatus == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_1);
		}
		else if (productionPlantStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_3);
		}
		else {
			bindProductionPlantStatus = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantName) {
			qPos.add(productionPlantName);
		}

		if (bindProductionPlantStatus) {
			qPos.add(productionPlantStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 */
	@Override
	public void removeByproductionPlantStatus_PPName(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantStatus) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantStatus_PPName(
				mtCore, applicantProfileId, productionPlantName,
				productionPlantStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantStatus the production plant status
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantStatus_PPName(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPNAME;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantName,
				productionPlantStatus
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_APPLICANTPROFILEID_2);

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_2);
			}

			boolean bindProductionPlantStatus = false;

			if (productionPlantStatus == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_1);
			}
			else if (productionPlantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_3);
			}
			else {
				bindProductionPlantStatus = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
				}

				if (bindProductionPlantStatus) {
					qPos.add(productionPlantStatus);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_MTCORE_2 =
		"vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_1 =
		"vrProductionPlant.productionPlantName IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_2 =
		"vrProductionPlant.productionPlantName = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTNAME_3 =
		"(vrProductionPlant.productionPlantName IS NULL OR vrProductionPlant.productionPlantName = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_1 =
		"vrProductionPlant.productionPlantStatus IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_2 =
		"vrProductionPlant.productionPlantStatus = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPNAME_PRODUCTIONPLANTSTATUS_3 =
		"(vrProductionPlant.productionPlantStatus IS NULL OR vrProductionPlant.productionPlantStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantStatus_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantStatus_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTADDRESS_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTSTATUS_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantStatus_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus) {
		return findByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus, int start, int end) {
		return findByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPADDRESS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantAddress,
					productionPlantStatus
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPADDRESS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantAddress,
					productionPlantStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
							!Objects.equals(productionPlantAddress,
								vrProductionPlant.getProductionPlantAddress()) ||
							!Objects.equals(productionPlantStatus,
								vrProductionPlant.getProductionPlantStatus())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_APPLICANTPROFILEID_2);

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
			}

			boolean bindProductionPlantStatus = false;

			if (productionPlantStatus == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_1);
			}
			else if (productionPlantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_3);
			}
			else {
				bindProductionPlantStatus = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantAddress) {
					qPos.add(productionPlantAddress);
				}

				if (bindProductionPlantStatus) {
					qPos.add(productionPlantStatus);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantStatus_PPAddress_First(
		long mtCore, long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantStatus_PPAddress_First(mtCore,
				applicantProfileId, productionPlantAddress,
				productionPlantStatus, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(", productionPlantStatus=");
		msg.append(productionPlantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantStatus_PPAddress_First(
		long mtCore, long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantStatus_PPAddress(mtCore,
				applicantProfileId, productionPlantAddress,
				productionPlantStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantStatus_PPAddress_Last(
		long mtCore, long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantStatus_PPAddress_Last(mtCore,
				applicantProfileId, productionPlantAddress,
				productionPlantStatus, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(", productionPlantStatus=");
		msg.append(productionPlantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantStatus_PPAddress_Last(
		long mtCore, long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantStatus_PPAddress(mtCore,
				applicantProfileId, productionPlantAddress,
				productionPlantStatus);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantStatus_PPAddress(mtCore,
				applicantProfileId, productionPlantAddress,
				productionPlantStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantStatus_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		String productionPlantAddress, String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantStatus_PPAddress_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantAddress, productionPlantStatus,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantStatus_PPAddress_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantAddress, productionPlantStatus,
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

	protected VRProductionPlant getByproductionPlantStatus_PPAddress_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_APPLICANTPROFILEID_2);

		boolean bindProductionPlantAddress = false;

		if (productionPlantAddress == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
		}
		else if (productionPlantAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
		}
		else {
			bindProductionPlantAddress = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
		}

		boolean bindProductionPlantStatus = false;

		if (productionPlantStatus == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_1);
		}
		else if (productionPlantStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_3);
		}
		else {
			bindProductionPlantStatus = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantAddress) {
			qPos.add(productionPlantAddress);
		}

		if (bindProductionPlantStatus) {
			qPos.add(productionPlantStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 */
	@Override
	public void removeByproductionPlantStatus_PPAddress(long mtCore,
		long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantStatus_PPAddress(
				mtCore, applicantProfileId, productionPlantAddress,
				productionPlantStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantAddress the production plant address
	 * @param productionPlantStatus the production plant status
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantStatus_PPAddress(long mtCore,
		long applicantProfileId, String productionPlantAddress,
		String productionPlantStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPADDRESS;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantAddress,
				productionPlantStatus
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_APPLICANTPROFILEID_2);

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
			}

			boolean bindProductionPlantStatus = false;

			if (productionPlantStatus == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_1);
			}
			else if (productionPlantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_3);
			}
			else {
				bindProductionPlantStatus = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantAddress) {
					qPos.add(productionPlantAddress);
				}

				if (bindProductionPlantStatus) {
					qPos.add(productionPlantStatus);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_MTCORE_2 =
		"vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_1 =
		"vrProductionPlant.productionPlantAddress IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_2 =
		"vrProductionPlant.productionPlantAddress = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTADDRESS_3 =
		"(vrProductionPlant.productionPlantAddress IS NULL OR vrProductionPlant.productionPlantAddress = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_1 =
		"vrProductionPlant.productionPlantStatus IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_2 =
		"vrProductionPlant.productionPlantStatus = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTSTATUS_PPADDRESS_PRODUCTIONPLANTSTATUS_3 =
		"(vrProductionPlant.productionPlantStatus IS NULL OR vrProductionPlant.productionPlantStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantName_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantName_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTNAME_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTADDRESS_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantName_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress) {
		return findByproductionPlantName_PPAddress(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress, int start, int end) {
		return findByproductionPlantName_PPAddress(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantName_PPAddress(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME_PPADDRESS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantName,
					productionPlantAddress
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME_PPADDRESS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantName,
					productionPlantAddress,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
							!Objects.equals(productionPlantName,
								vrProductionPlant.getProductionPlantName()) ||
							!Objects.equals(productionPlantAddress,
								vrProductionPlant.getProductionPlantAddress())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_APPLICANTPROFILEID_2);

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_2);
			}

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
				}

				if (bindProductionPlantAddress) {
					qPos.add(productionPlantAddress);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantName_PPAddress_First(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantName_PPAddress_First(mtCore,
				applicantProfileId, productionPlantName,
				productionPlantAddress, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantName_PPAddress_First(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantName_PPAddress(mtCore,
				applicantProfileId, productionPlantName,
				productionPlantAddress, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantName_PPAddress_Last(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantName_PPAddress_Last(mtCore,
				applicantProfileId, productionPlantName,
				productionPlantAddress, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantName_PPAddress_Last(
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantName_PPAddress(mtCore,
				applicantProfileId, productionPlantName, productionPlantAddress);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantName_PPAddress(mtCore,
				applicantProfileId, productionPlantName,
				productionPlantAddress, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantName_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		String productionPlantName, String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantName_PPAddress_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantName, productionPlantAddress,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantName_PPAddress_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
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

	protected VRProductionPlant getByproductionPlantName_PPAddress_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_APPLICANTPROFILEID_2);

		boolean bindProductionPlantName = false;

		if (productionPlantName == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_1);
		}
		else if (productionPlantName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_3);
		}
		else {
			bindProductionPlantName = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_2);
		}

		boolean bindProductionPlantAddress = false;

		if (productionPlantAddress == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
		}
		else if (productionPlantAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
		}
		else {
			bindProductionPlantAddress = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantName) {
			qPos.add(productionPlantName);
		}

		if (bindProductionPlantAddress) {
			qPos.add(productionPlantAddress);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 */
	@Override
	public void removeByproductionPlantName_PPAddress(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantName_PPAddress(
				mtCore, applicantProfileId, productionPlantName,
				productionPlantAddress, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantName_PPAddress(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME_PPADDRESS;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantName,
				productionPlantAddress
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_APPLICANTPROFILEID_2);

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_2);
			}

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_MTCORE_2 =
		"vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_1 =
		"vrProductionPlant.productionPlantName IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_2 =
		"vrProductionPlant.productionPlantName = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTNAME_3 =
		"(vrProductionPlant.productionPlantName IS NULL OR vrProductionPlant.productionPlantName = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_1 =
		"vrProductionPlant.productionPlantAddress IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_2 =
		"vrProductionPlant.productionPlantAddress = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PPADDRESS_PRODUCTIONPLANTADDRESS_3 =
		"(vrProductionPlant.productionPlantAddress IS NULL OR vrProductionPlant.productionPlantAddress = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTREP_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantRep_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTREP_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantRep_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTREPRESENTATIVE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTADDRESS_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTREP_PPADDRESS =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantRep_PPAddress",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress) {
		return findByproductionPlantRep_PPAddress(mtCore, applicantProfileId,
			productionPlantRepresentative, productionPlantAddress,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress,
		int start, int end) {
		return findByproductionPlantRep_PPAddress(mtCore, applicantProfileId,
			productionPlantRepresentative, productionPlantAddress, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress,
		int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantRep_PPAddress(mtCore, applicantProfileId,
			productionPlantRepresentative, productionPlantAddress, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress,
		int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTREP_PPADDRESS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantRepresentative,
					productionPlantAddress
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTREP_PPADDRESS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantRepresentative,
					productionPlantAddress,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
							!Objects.equals(productionPlantRepresentative,
								vrProductionPlant.getProductionPlantRepresentative()) ||
							!Objects.equals(productionPlantAddress,
								vrProductionPlant.getProductionPlantAddress())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_APPLICANTPROFILEID_2);

			boolean bindProductionPlantRepresentative = false;

			if (productionPlantRepresentative == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_1);
			}
			else if (productionPlantRepresentative.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_3);
			}
			else {
				bindProductionPlantRepresentative = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_2);
			}

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantRepresentative) {
					qPos.add(productionPlantRepresentative);
				}

				if (bindProductionPlantAddress) {
					qPos.add(productionPlantAddress);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantRep_PPAddress_First(
		long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantRep_PPAddress_First(mtCore,
				applicantProfileId, productionPlantRepresentative,
				productionPlantAddress, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantRepresentative=");
		msg.append(productionPlantRepresentative);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantRep_PPAddress_First(
		long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantRep_PPAddress(mtCore,
				applicantProfileId, productionPlantRepresentative,
				productionPlantAddress, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantRep_PPAddress_Last(
		long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantRep_PPAddress_Last(mtCore,
				applicantProfileId, productionPlantRepresentative,
				productionPlantAddress, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantRepresentative=");
		msg.append(productionPlantRepresentative);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantRep_PPAddress_Last(
		long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantRep_PPAddress(mtCore,
				applicantProfileId, productionPlantRepresentative,
				productionPlantAddress);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantRep_PPAddress(mtCore,
				applicantProfileId, productionPlantRepresentative,
				productionPlantAddress, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantRep_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		String productionPlantRepresentative, String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantRep_PPAddress_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantRepresentative, productionPlantAddress,
					orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantRep_PPAddress_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantRepresentative, productionPlantAddress,
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

	protected VRProductionPlant getByproductionPlantRep_PPAddress_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		long applicantProfileId, String productionPlantRepresentative,
		String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_APPLICANTPROFILEID_2);

		boolean bindProductionPlantRepresentative = false;

		if (productionPlantRepresentative == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_1);
		}
		else if (productionPlantRepresentative.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_3);
		}
		else {
			bindProductionPlantRepresentative = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_2);
		}

		boolean bindProductionPlantAddress = false;

		if (productionPlantAddress == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
		}
		else if (productionPlantAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
		}
		else {
			bindProductionPlantAddress = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantRepresentative) {
			qPos.add(productionPlantRepresentative);
		}

		if (bindProductionPlantAddress) {
			qPos.add(productionPlantAddress);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 */
	@Override
	public void removeByproductionPlantRep_PPAddress(long mtCore,
		long applicantProfileId, String productionPlantRepresentative,
		String productionPlantAddress) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantRep_PPAddress(
				mtCore, applicantProfileId, productionPlantRepresentative,
				productionPlantAddress, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantRepresentative the production plant representative
	 * @param productionPlantAddress the production plant address
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantRep_PPAddress(long mtCore,
		long applicantProfileId, String productionPlantRepresentative,
		String productionPlantAddress) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTREP_PPADDRESS;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantRepresentative,
				productionPlantAddress
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_APPLICANTPROFILEID_2);

			boolean bindProductionPlantRepresentative = false;

			if (productionPlantRepresentative == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_1);
			}
			else if (productionPlantRepresentative.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_3);
			}
			else {
				bindProductionPlantRepresentative = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_2);
			}

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantRepresentative) {
					qPos.add(productionPlantRepresentative);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_MTCORE_2 =
		"vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_1 =
		"vrProductionPlant.productionPlantRepresentative IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_2 =
		"vrProductionPlant.productionPlantRepresentative = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTREPRESENTATIVE_3 =
		"(vrProductionPlant.productionPlantRepresentative IS NULL OR vrProductionPlant.productionPlantRepresentative = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_1 =
		"vrProductionPlant.productionPlantAddress IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_2 =
		"vrProductionPlant.productionPlantAddress = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTREP_PPADDRESS_PRODUCTIONPLANTADDRESS_3 =
		"(vrProductionPlant.productionPlantAddress IS NULL OR vrProductionPlant.productionPlantAddress = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.PRODUCTIONPLANTNAME_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName) {
		return findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName, int start, int end) {
		return findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName, int start,
		int end, OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName, int start,
		int end, OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantName
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantName,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((mtCore != vrProductionPlant.getMtCore()) ||
							(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
							!Objects.equals(productionPlantName,
								vrProductionPlant.getProductionPlantName())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_APPLICANTPROFILEID_2);

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
				}

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantName_First(long mtCore,
		long applicantProfileId, String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantName_First(mtCore,
				applicantProfileId, productionPlantName, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantName_First(long mtCore,
		long applicantProfileId, String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByproductionPlantName(mtCore,
				applicantProfileId, productionPlantName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByproductionPlantName_Last(long mtCore,
		long applicantProfileId, String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByproductionPlantName_Last(mtCore,
				applicantProfileId, productionPlantName, orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByproductionPlantName_Last(long mtCore,
		long applicantProfileId, String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByproductionPlantName(mtCore, applicantProfileId,
				productionPlantName);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByproductionPlantName(mtCore,
				applicantProfileId, productionPlantName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByproductionPlantName_PrevAndNext(long id,
		long mtCore, long applicantProfileId, String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByproductionPlantName_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantName, orderByComparator, true);

			array[1] = vrProductionPlant;

			array[2] = getByproductionPlantName_PrevAndNext(session,
					vrProductionPlant, mtCore, applicantProfileId,
					productionPlantName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRProductionPlant getByproductionPlantName_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant, long mtCore,
		long applicantProfileId, String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_APPLICANTPROFILEID_2);

		boolean bindProductionPlantName = false;

		if (productionPlantName == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_1);
		}
		else if (productionPlantName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_3);
		}
		else {
			bindProductionPlantName = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_2);
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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantName) {
			qPos.add(productionPlantName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 */
	@Override
	public void removeByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName) {
		for (VRProductionPlant vrProductionPlant : findByproductionPlantName(
				mtCore, applicantProfileId, productionPlantName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByproductionPlantName(long mtCore, long applicantProfileId,
		String productionPlantName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantName
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_APPLICANTPROFILEID_2);

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_1 =
		"vrProductionPlant.productionPlantName IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_2 =
		"vrProductionPlant.productionPlantName = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_3 =
		"(vrProductionPlant.productionPlantName IS NULL OR vrProductionPlant.productionPlantName = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_MT_APP_FORM_ID",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRProductionPlantModelImpl.MTCORE_COLUMN_BITMASK |
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.REGISTRATIONFORMID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_MT_APP_FORM_ID = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_MT_APP_FORM_ID",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationFormId the registration form ID
	 * @return the matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByF_MT_APP_FORM_ID(mtCore,
				applicantProfileId, registrationFormId);

		if (vrProductionPlant == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mtCore=");
			msg.append(mtCore);

			msg.append(", applicantProfileId=");
			msg.append(applicantProfileId);

			msg.append(", registrationFormId=");
			msg.append(registrationFormId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRProductionPlantException(msg.toString());
		}

		return vrProductionPlant;
	}

	/**
	 * Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationFormId the registration form ID
	 * @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId) {
		return fetchByF_MT_APP_FORM_ID(mtCore, applicantProfileId,
			registrationFormId, true);
	}

	/**
	 * Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationFormId the registration form ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, registrationFormId
			};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID,
					finderArgs, this);
		}

		if (result instanceof VRProductionPlant) {
			VRProductionPlant vrProductionPlant = (VRProductionPlant)result;

			if ((mtCore != vrProductionPlant.getMtCore()) ||
					(applicantProfileId != vrProductionPlant.getApplicantProfileId()) ||
					(registrationFormId != vrProductionPlant.getRegistrationFormId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_F_MT_APP_FORM_ID_MTCORE_2);

			query.append(_FINDER_COLUMN_F_MT_APP_FORM_ID_APPLICANTPROFILEID_2);

			query.append(_FINDER_COLUMN_F_MT_APP_FORM_ID_REGISTRATIONFORMID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				qPos.add(registrationFormId);

				List<VRProductionPlant> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRProductionPlantPersistenceImpl.fetchByF_MT_APP_FORM_ID(long, long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRProductionPlant vrProductionPlant = list.get(0);

					result = vrProductionPlant;

					cacheResult(vrProductionPlant);

					if ((vrProductionPlant.getMtCore() != mtCore) ||
							(vrProductionPlant.getApplicantProfileId() != applicantProfileId) ||
							(vrProductionPlant.getRegistrationFormId() != registrationFormId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID,
							finderArgs, vrProductionPlant);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID,
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
			return (VRProductionPlant)result;
		}
	}

	/**
	 * Removes the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationFormId the registration form ID
	 * @return the vr production plant that was removed
	 */
	@Override
	public VRProductionPlant removeByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByF_MT_APP_FORM_ID(mtCore,
				applicantProfileId, registrationFormId);

		return remove(vrProductionPlant);
	}

	/**
	 * Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param registrationFormId the registration form ID
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByF_MT_APP_FORM_ID(long mtCore, long applicantProfileId,
		long registrationFormId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_MT_APP_FORM_ID;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, registrationFormId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_F_MT_APP_FORM_ID_MTCORE_2);

			query.append(_FINDER_COLUMN_F_MT_APP_FORM_ID_APPLICANTPROFILEID_2);

			query.append(_FINDER_COLUMN_F_MT_APP_FORM_ID_REGISTRATIONFORMID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				qPos.add(registrationFormId);

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

	private static final String _FINDER_COLUMN_F_MT_APP_FORM_ID_MTCORE_2 = "vrProductionPlant.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_F_MT_APP_FORM_ID_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_F_MT_APP_FORM_ID_REGISTRATIONFORMID_2 =
		"vrProductionPlant.registrationFormId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEID =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapplicantProfileId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID =
		new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByapplicantProfileId", new String[] { Long.class.getName() },
			VRProductionPlantModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRProductionPlantModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTPROFILEID = new FinderPath(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantProfileId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr production plants where applicantProfileId = &#63;.
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @return the matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId) {
		return findByapplicantProfileId(applicantProfileId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants where applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end) {
		return findByapplicantProfileId(applicantProfileId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants where applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findByapplicantProfileId(applicantProfileId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants where applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr production plants
	 */
	@Override
	public List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID;
			finderArgs = new Object[] { applicantProfileId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEID;
			finderArgs = new Object[] {
					applicantProfileId,
					
					start, end, orderByComparator
				};
		}

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRProductionPlant vrProductionPlant : list) {
					if ((applicantProfileId != vrProductionPlant.getApplicantProfileId())) {
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

			query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(applicantProfileId);

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Returns the first vr production plant in the ordered set where applicantProfileId = &#63;.
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByapplicantProfileId_First(
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByapplicantProfileId_First(applicantProfileId,
				orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the first vr production plant in the ordered set where applicantProfileId = &#63;.
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByapplicantProfileId_First(
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		List<VRProductionPlant> list = findByapplicantProfileId(applicantProfileId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr production plant in the ordered set where applicantProfileId = &#63;.
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant
	 * @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant findByapplicantProfileId_Last(
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByapplicantProfileId_Last(applicantProfileId,
				orderByComparator);

		if (vrProductionPlant != null) {
			return vrProductionPlant;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRProductionPlantException(msg.toString());
	}

	/**
	 * Returns the last vr production plant in the ordered set where applicantProfileId = &#63;.
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	 */
	@Override
	public VRProductionPlant fetchByapplicantProfileId_Last(
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		int count = countByapplicantProfileId(applicantProfileId);

		if (count == 0) {
			return null;
		}

		List<VRProductionPlant> list = findByapplicantProfileId(applicantProfileId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr production plants before and after the current vr production plant in the ordered set where applicantProfileId = &#63;.
	 *
	 * @param id the primary key of the current vr production plant
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant[] findByapplicantProfileId_PrevAndNext(long id,
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRProductionPlant[] array = new VRProductionPlantImpl[3];

			array[0] = getByapplicantProfileId_PrevAndNext(session,
					vrProductionPlant, applicantProfileId, orderByComparator,
					true);

			array[1] = vrProductionPlant;

			array[2] = getByapplicantProfileId_PrevAndNext(session,
					vrProductionPlant, applicantProfileId, orderByComparator,
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

	protected VRProductionPlant getByapplicantProfileId_PrevAndNext(
		Session session, VRProductionPlant vrProductionPlant,
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

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
			query.append(VRProductionPlantModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(applicantProfileId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrProductionPlant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRProductionPlant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr production plants where applicantProfileId = &#63; from the database.
	 *
	 * @param applicantProfileId the applicant profile ID
	 */
	@Override
	public void removeByapplicantProfileId(long applicantProfileId) {
		for (VRProductionPlant vrProductionPlant : findByapplicantProfileId(
				applicantProfileId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants where applicantProfileId = &#63;.
	 *
	 * @param applicantProfileId the applicant profile ID
	 * @return the number of matching vr production plants
	 */
	@Override
	public int countByapplicantProfileId(long applicantProfileId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTPROFILEID;

		Object[] finderArgs = new Object[] { applicantProfileId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRPRODUCTIONPLANT_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(applicantProfileId);

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

	private static final String _FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2 =
		"vrProductionPlant.applicantProfileId = ?";

	public VRProductionPlantPersistenceImpl() {
		setModelClass(VRProductionPlant.class);
	}

	/**
	 * Caches the vr production plant in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlant the vr production plant
	 */
	@Override
	public void cacheResult(VRProductionPlant vrProductionPlant) {
		entityCache.putResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantImpl.class, vrProductionPlant.getPrimaryKey(),
			vrProductionPlant);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
			new Object[] { vrProductionPlant.getProductionPlantCode() },
			vrProductionPlant);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID,
			new Object[] {
				vrProductionPlant.getMtCore(),
				vrProductionPlant.getApplicantProfileId(),
				vrProductionPlant.getRegistrationFormId()
			}, vrProductionPlant);

		vrProductionPlant.resetOriginalValues();
	}

	/**
	 * Caches the vr production plants in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlants the vr production plants
	 */
	@Override
	public void cacheResult(List<VRProductionPlant> vrProductionPlants) {
		for (VRProductionPlant vrProductionPlant : vrProductionPlants) {
			if (entityCache.getResult(
						VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantImpl.class,
						vrProductionPlant.getPrimaryKey()) == null) {
				cacheResult(vrProductionPlant);
			}
			else {
				vrProductionPlant.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr production plants.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductionPlantImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr production plant.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRProductionPlant vrProductionPlant) {
		entityCache.removeResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantImpl.class, vrProductionPlant.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRProductionPlantModelImpl)vrProductionPlant,
			true);
	}

	@Override
	public void clearCache(List<VRProductionPlant> vrProductionPlants) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductionPlant vrProductionPlant : vrProductionPlants) {
			entityCache.removeResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantImpl.class, vrProductionPlant.getPrimaryKey());

			clearUniqueFindersCache((VRProductionPlantModelImpl)vrProductionPlant,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRProductionPlantModelImpl vrProductionPlantModelImpl) {
		Object[] args = new Object[] {
				vrProductionPlantModelImpl.getProductionPlantCode()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE, args,
			vrProductionPlantModelImpl, false);

		args = new Object[] {
				vrProductionPlantModelImpl.getMtCore(),
				vrProductionPlantModelImpl.getApplicantProfileId(),
				vrProductionPlantModelImpl.getRegistrationFormId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_MT_APP_FORM_ID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID, args,
			vrProductionPlantModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRProductionPlantModelImpl vrProductionPlantModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrProductionPlantModelImpl.getProductionPlantCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
				args);
		}

		if ((vrProductionPlantModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrProductionPlantModelImpl.getOriginalProductionPlantCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
				args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrProductionPlantModelImpl.getMtCore(),
					vrProductionPlantModelImpl.getApplicantProfileId(),
					vrProductionPlantModelImpl.getRegistrationFormId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_MT_APP_FORM_ID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID, args);
		}

		if ((vrProductionPlantModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrProductionPlantModelImpl.getOriginalMtCore(),
					vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
					vrProductionPlantModelImpl.getOriginalRegistrationFormId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_MT_APP_FORM_ID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_MT_APP_FORM_ID, args);
		}
	}

	/**
	 * Creates a new vr production plant with the primary key. Does not add the vr production plant to the database.
	 *
	 * @param id the primary key for the new vr production plant
	 * @return the new vr production plant
	 */
	@Override
	public VRProductionPlant create(long id) {
		VRProductionPlant vrProductionPlant = new VRProductionPlantImpl();

		vrProductionPlant.setNew(true);
		vrProductionPlant.setPrimaryKey(id);

		return vrProductionPlant;
	}

	/**
	 * Removes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr production plant
	 * @return the vr production plant that was removed
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant remove(long id)
		throws NoSuchVRProductionPlantException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr production plant
	 * @return the vr production plant that was removed
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant remove(Serializable primaryKey)
		throws NoSuchVRProductionPlantException {
		Session session = null;

		try {
			session = openSession();

			VRProductionPlant vrProductionPlant = (VRProductionPlant)session.get(VRProductionPlantImpl.class,
					primaryKey);

			if (vrProductionPlant == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductionPlantException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductionPlant);
		}
		catch (NoSuchVRProductionPlantException nsee) {
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
	protected VRProductionPlant removeImpl(VRProductionPlant vrProductionPlant) {
		vrProductionPlant = toUnwrappedModel(vrProductionPlant);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductionPlant)) {
				vrProductionPlant = (VRProductionPlant)session.get(VRProductionPlantImpl.class,
						vrProductionPlant.getPrimaryKeyObj());
			}

			if (vrProductionPlant != null) {
				session.delete(vrProductionPlant);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductionPlant != null) {
			clearCache(vrProductionPlant);
		}

		return vrProductionPlant;
	}

	@Override
	public VRProductionPlant updateImpl(VRProductionPlant vrProductionPlant) {
		vrProductionPlant = toUnwrappedModel(vrProductionPlant);

		boolean isNew = vrProductionPlant.isNew();

		VRProductionPlantModelImpl vrProductionPlantModelImpl = (VRProductionPlantModelImpl)vrProductionPlant;

		Session session = null;

		try {
			session = openSession();

			if (vrProductionPlant.isNew()) {
				session.save(vrProductionPlant);

				vrProductionPlant.setNew(false);
			}
			else {
				vrProductionPlant = (VRProductionPlant)session.merge(vrProductionPlant);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRProductionPlantModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONFORMID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
						vrProductionPlantModelImpl.getOriginalRegistrationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REGISTRATIONFORMID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONFORMID,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantProfileId(),
						vrProductionPlantModelImpl.getRegistrationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REGISTRATIONFORMID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONFORMID,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalMappingStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getMappingStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
						vrProductionPlantModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantProfileId(),
						vrProductionPlantModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_XUONG_LR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalMappingMA_CTY(),
						vrProductionPlantModelImpl.getOriginalMappingMA_XUONG_LR()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGMA_XUONG_LR,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_XUONG_LR,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getMappingMA_CTY(),
						vrProductionPlantModelImpl.getMappingMA_XUONG_LR()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGMA_XUONG_LR,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_XUONG_LR,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalProductionPlantType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTTYPE,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getProductionPlantType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTTYPE,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalProductionPlantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getProductionPlantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
						vrProductionPlantModelImpl.getOriginalProductionPlantCode(),
						vrProductionPlantModelImpl.getOriginalProductionPlantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPCODE,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantProfileId(),
						vrProductionPlantModelImpl.getProductionPlantCode(),
						vrProductionPlantModelImpl.getProductionPlantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPCODE,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
						vrProductionPlantModelImpl.getOriginalProductionPlantName(),
						vrProductionPlantModelImpl.getOriginalProductionPlantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPNAME,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantProfileId(),
						vrProductionPlantModelImpl.getProductionPlantName(),
						vrProductionPlantModelImpl.getProductionPlantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPNAME,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPADDRESS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
						vrProductionPlantModelImpl.getOriginalProductionPlantAddress(),
						vrProductionPlantModelImpl.getOriginalProductionPlantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPADDRESS,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantProfileId(),
						vrProductionPlantModelImpl.getProductionPlantAddress(),
						vrProductionPlantModelImpl.getProductionPlantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTSTATUS_PPADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTSTATUS_PPADDRESS,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME_PPADDRESS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
						vrProductionPlantModelImpl.getOriginalProductionPlantName(),
						vrProductionPlantModelImpl.getOriginalProductionPlantAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME_PPADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME_PPADDRESS,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantProfileId(),
						vrProductionPlantModelImpl.getProductionPlantName(),
						vrProductionPlantModelImpl.getProductionPlantAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME_PPADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME_PPADDRESS,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTREP_PPADDRESS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
						vrProductionPlantModelImpl.getOriginalProductionPlantRepresentative(),
						vrProductionPlantModelImpl.getOriginalProductionPlantAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTREP_PPADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTREP_PPADDRESS,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantProfileId(),
						vrProductionPlantModelImpl.getProductionPlantRepresentative(),
						vrProductionPlantModelImpl.getProductionPlantAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTREP_PPADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTREP_PPADDRESS,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalMtCore(),
						vrProductionPlantModelImpl.getOriginalApplicantProfileId(),
						vrProductionPlantModelImpl.getOriginalProductionPlantName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getMtCore(),
						vrProductionPlantModelImpl.getApplicantProfileId(),
						vrProductionPlantModelImpl.getProductionPlantName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME,
					args);
			}

			if ((vrProductionPlantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrProductionPlantModelImpl.getOriginalApplicantProfileId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID,
					args);

				args = new Object[] {
						vrProductionPlantModelImpl.getApplicantProfileId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID,
					args);
			}
		}

		entityCache.putResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantImpl.class, vrProductionPlant.getPrimaryKey(),
			vrProductionPlant, false);

		clearUniqueFindersCache(vrProductionPlantModelImpl, false);
		cacheUniqueFindersCache(vrProductionPlantModelImpl);

		vrProductionPlant.resetOriginalValues();

		return vrProductionPlant;
	}

	protected VRProductionPlant toUnwrappedModel(
		VRProductionPlant vrProductionPlant) {
		if (vrProductionPlant instanceof VRProductionPlantImpl) {
			return vrProductionPlant;
		}

		VRProductionPlantImpl vrProductionPlantImpl = new VRProductionPlantImpl();

		vrProductionPlantImpl.setNew(vrProductionPlant.isNew());
		vrProductionPlantImpl.setPrimaryKey(vrProductionPlant.getPrimaryKey());

		vrProductionPlantImpl.setId(vrProductionPlant.getId());
		vrProductionPlantImpl.setMtCore(vrProductionPlant.getMtCore());
		vrProductionPlantImpl.setMappingMA_CTY(vrProductionPlant.getMappingMA_CTY());
		vrProductionPlantImpl.setMappingTEN_CTY(vrProductionPlant.getMappingTEN_CTY());
		vrProductionPlantImpl.setMappingDIA_CHI_CTY(vrProductionPlant.getMappingDIA_CHI_CTY());
		vrProductionPlantImpl.setMappingMA_XUONG_LR(vrProductionPlant.getMappingMA_XUONG_LR());
		vrProductionPlantImpl.setMappingTEN_XUONG_LR(vrProductionPlant.getMappingTEN_XUONG_LR());
		vrProductionPlantImpl.setMappingDIA_CHI_XUONG_LR(vrProductionPlant.getMappingDIA_CHI_XUONG_LR());
		vrProductionPlantImpl.setMappingNote(vrProductionPlant.getMappingNote());
		vrProductionPlantImpl.setMappingStatus(vrProductionPlant.getMappingStatus());
		vrProductionPlantImpl.setProductionPlantCode(vrProductionPlant.getProductionPlantCode());
		vrProductionPlantImpl.setProductionPlantName(vrProductionPlant.getProductionPlantName());
		vrProductionPlantImpl.setProductionPlantAddress(vrProductionPlant.getProductionPlantAddress());
		vrProductionPlantImpl.setProductionPlantRegion(vrProductionPlant.getProductionPlantRegion());
		vrProductionPlantImpl.setProductionPlantRegionCode(vrProductionPlant.getProductionPlantRegionCode());
		vrProductionPlantImpl.setProductionPlantStateCode(vrProductionPlant.getProductionPlantStateCode());
		vrProductionPlantImpl.setProductionPlantStateName(vrProductionPlant.getProductionPlantStateName());
		vrProductionPlantImpl.setProductionPlantProvinceCode(vrProductionPlant.getProductionPlantProvinceCode());
		vrProductionPlantImpl.setProductionPlantProvinceName(vrProductionPlant.getProductionPlantProvinceName());
		vrProductionPlantImpl.setProductionPlantDistrictCode(vrProductionPlant.getProductionPlantDistrictCode());
		vrProductionPlantImpl.setProductionPlantDistrictName(vrProductionPlant.getProductionPlantDistrictName());
		vrProductionPlantImpl.setProductionPlantWardCode(vrProductionPlant.getProductionPlantWardCode());
		vrProductionPlantImpl.setProductionPlantWardName(vrProductionPlant.getProductionPlantWardName());
		vrProductionPlantImpl.setProductionPlantEmail(vrProductionPlant.getProductionPlantEmail());
		vrProductionPlantImpl.setProductionPlantPhone(vrProductionPlant.getProductionPlantPhone());
		vrProductionPlantImpl.setProductionPlantFax(vrProductionPlant.getProductionPlantFax());
		vrProductionPlantImpl.setProductionPlantWebsite(vrProductionPlant.getProductionPlantWebsite());
		vrProductionPlantImpl.setProductionPlantRepresentativePhone(vrProductionPlant.getProductionPlantRepresentativePhone());
		vrProductionPlantImpl.setProductionPlantRepresentative(vrProductionPlant.getProductionPlantRepresentative());
		vrProductionPlantImpl.setProductionPlantRepresentativeTitle(vrProductionPlant.getProductionPlantRepresentativeTitle());
		vrProductionPlantImpl.setProductionPlantContactName(vrProductionPlant.getProductionPlantContactName());
		vrProductionPlantImpl.setProductionPlantContactEmail(vrProductionPlant.getProductionPlantContactEmail());
		vrProductionPlantImpl.setProductionPlantContactPhone(vrProductionPlant.getProductionPlantContactPhone());
		vrProductionPlantImpl.setProductionPlantType(vrProductionPlant.getProductionPlantType());
		vrProductionPlantImpl.setProductionPlantStatus(vrProductionPlant.getProductionPlantStatus());
		vrProductionPlantImpl.setProductionManufacture(vrProductionPlant.getProductionManufacture());
		vrProductionPlantImpl.setProductionMaintainer(vrProductionPlant.getProductionMaintainer());
		vrProductionPlantImpl.setProductionPlantIdentityNo(vrProductionPlant.getProductionPlantIdentityNo());
		vrProductionPlantImpl.setProductionPlantIdentityType(vrProductionPlant.getProductionPlantIdentityType());
		vrProductionPlantImpl.setProductionPlantIdentityDescription(vrProductionPlant.getProductionPlantIdentityDescription());
		vrProductionPlantImpl.setProductionPlantIdentityFileEntryId(vrProductionPlant.getProductionPlantIdentityFileEntryId());
		vrProductionPlantImpl.setProductionPlantEmployeesNote(vrProductionPlant.getProductionPlantEmployeesNote());
		vrProductionPlantImpl.setProductionPlantEquipmentsNote(vrProductionPlant.getProductionPlantEquipmentsNote());
		vrProductionPlantImpl.setProductionPlantProdEquipmentsNote(vrProductionPlant.getProductionPlantProdEquipmentsNote());
		vrProductionPlantImpl.setProductionIdentityFileName(vrProductionPlant.getProductionIdentityFileName());
		vrProductionPlantImpl.setProductionIdentityFileEntryId(vrProductionPlant.getProductionIdentityFileEntryId());
		vrProductionPlantImpl.setApplicantCode(vrProductionPlant.getApplicantCode());
		vrProductionPlantImpl.setSupplierName(vrProductionPlant.getSupplierName());
		vrProductionPlantImpl.setSupplierAddress(vrProductionPlant.getSupplierAddress());
		vrProductionPlantImpl.setCorporationCode(vrProductionPlant.getCorporationCode());
		vrProductionPlantImpl.setCorporationName(vrProductionPlant.getCorporationName());
		vrProductionPlantImpl.setCorporationAddress(vrProductionPlant.getCorporationAddress());
		vrProductionPlantImpl.setProductionPlantMetadata(vrProductionPlant.getProductionPlantMetadata());
		vrProductionPlantImpl.setRegistrationId(vrProductionPlant.getRegistrationId());
		vrProductionPlantImpl.setRegistrationFormId(vrProductionPlant.getRegistrationFormId());
		vrProductionPlantImpl.setApplicantProfileId(vrProductionPlant.getApplicantProfileId());
		vrProductionPlantImpl.setSupplierId(vrProductionPlant.getSupplierId());
		vrProductionPlantImpl.setModifyDate(vrProductionPlant.getModifyDate());
		vrProductionPlantImpl.setSyncDate(vrProductionPlant.getSyncDate());

		return vrProductionPlantImpl;
	}

	/**
	 * Returns the vr production plant with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant
	 * @return the vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRProductionPlantException {
		VRProductionPlant vrProductionPlant = fetchByPrimaryKey(primaryKey);

		if (vrProductionPlant == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductionPlantException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductionPlant;
	}

	/**
	 * Returns the vr production plant with the primary key or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	 *
	 * @param id the primary key of the vr production plant
	 * @return the vr production plant
	 * @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr production plant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant
	 * @return the vr production plant, or <code>null</code> if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductionPlant vrProductionPlant = (VRProductionPlant)serializable;

		if (vrProductionPlant == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductionPlant = (VRProductionPlant)session.get(VRProductionPlantImpl.class,
						primaryKey);

				if (vrProductionPlant != null) {
					cacheResult(vrProductionPlant);
				}
				else {
					entityCache.putResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductionPlant;
	}

	/**
	 * Returns the vr production plant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr production plant
	 * @return the vr production plant, or <code>null</code> if a vr production plant with the primary key could not be found
	 */
	@Override
	public VRProductionPlant fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductionPlant> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductionPlant> map = new HashMap<Serializable, VRProductionPlant>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductionPlant vrProductionPlant = fetchByPrimaryKey(primaryKey);

			if (vrProductionPlant != null) {
				map.put(primaryKey, vrProductionPlant);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRProductionPlant)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTIONPLANT_WHERE_PKS_IN);

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

			for (VRProductionPlant vrProductionPlant : (List<VRProductionPlant>)q.list()) {
				map.put(vrProductionPlant.getPrimaryKeyObj(), vrProductionPlant);

				cacheResult(vrProductionPlant);

				uncachedPrimaryKeys.remove(vrProductionPlant.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductionPlantModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr production plants.
	 *
	 * @return the vr production plants
	 */
	@Override
	public List<VRProductionPlant> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @return the range of vr production plants
	 */
	@Override
	public List<VRProductionPlant> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr production plants
	 */
	@Override
	public List<VRProductionPlant> findAll(int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plants
	 * @param end the upper bound of the range of vr production plants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr production plants
	 */
	@Override
	public List<VRProductionPlant> findAll(int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
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

		List<VRProductionPlant> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlant>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTIONPLANT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTIONPLANT;

				if (pagination) {
					sql = sql.concat(VRProductionPlantModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlant>)QueryUtil.list(q,
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
	 * Removes all the vr production plants from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductionPlant vrProductionPlant : findAll()) {
			remove(vrProductionPlant);
		}
	}

	/**
	 * Returns the number of vr production plants.
	 *
	 * @return the number of vr production plants
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTIONPLANT);

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
		return VRProductionPlantModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr production plant persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductionPlantImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTIONPLANT = "SELECT vrProductionPlant FROM VRProductionPlant vrProductionPlant";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANT_WHERE_PKS_IN = "SELECT vrProductionPlant FROM VRProductionPlant vrProductionPlant WHERE id IN (";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANT_WHERE = "SELECT vrProductionPlant FROM VRProductionPlant vrProductionPlant WHERE ";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANT = "SELECT COUNT(vrProductionPlant) FROM VRProductionPlant vrProductionPlant";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANT_WHERE = "SELECT COUNT(vrProductionPlant) FROM VRProductionPlant vrProductionPlant WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductionPlant.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductionPlant exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRProductionPlant exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRProductionPlantPersistenceImpl.class);
}