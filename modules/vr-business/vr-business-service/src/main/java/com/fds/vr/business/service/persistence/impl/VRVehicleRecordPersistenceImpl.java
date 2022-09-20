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

import com.fds.vr.business.exception.NoSuchVRVehicleRecordException;
import com.fds.vr.business.model.VRVehicleRecord;
import com.fds.vr.business.model.impl.VRVehicleRecordImpl;
import com.fds.vr.business.model.impl.VRVehicleRecordModelImpl;
import com.fds.vr.business.service.persistence.VRVehicleRecordPersistence;

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
 * The persistence implementation for the vr vehicle record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleRecordPersistence
 * @see com.fds.vr.business.service.persistence.VRVehicleRecordUtil
 * @generated
 */
@ProviderType
public class VRVehicleRecordPersistenceImpl extends BasePersistenceImpl<VRVehicleRecord>
	implements VRVehicleRecordPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRVehicleRecordUtil} to access the vr vehicle record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRVehicleRecordImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByissueVehicleCertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByissueVehicleCertificateId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRVehicleRecordModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.ISSUEVEHICLECERTIFICATEID_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissueVehicleCertificateId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @return the matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		return findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @return the range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId, int start, int end) {
		return findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID;
			finderArgs = new Object[] { mtCore, issueVehicleCertificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID;
			finderArgs = new Object[] {
					mtCore, issueVehicleCertificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleRecord vrVehicleRecord : list) {
					if ((mtCore != vrVehicleRecord.getMtCore()) ||
							(issueVehicleCertificateId != vrVehicleRecord.getIssueVehicleCertificateId())) {
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

			query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(issueVehicleCertificateId);

				if (!pagination) {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByissueVehicleCertificateId_First(long mtCore,
		long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByissueVehicleCertificateId_First(mtCore,
				issueVehicleCertificateId, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", issueVehicleCertificateId=");
		msg.append(issueVehicleCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByissueVehicleCertificateId_First(long mtCore,
		long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		List<VRVehicleRecord> list = findByissueVehicleCertificateId(mtCore,
				issueVehicleCertificateId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByissueVehicleCertificateId_Last(long mtCore,
		long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByissueVehicleCertificateId_Last(mtCore,
				issueVehicleCertificateId, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", issueVehicleCertificateId=");
		msg.append(issueVehicleCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByissueVehicleCertificateId_Last(long mtCore,
		long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		int count = countByissueVehicleCertificateId(mtCore,
				issueVehicleCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleRecord> list = findByissueVehicleCertificateId(mtCore,
				issueVehicleCertificateId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle record
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord[] findByissueVehicleCertificateId_PrevAndNext(
		long id, long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleRecord[] array = new VRVehicleRecordImpl[3];

			array[0] = getByissueVehicleCertificateId_PrevAndNext(session,
					vrVehicleRecord, mtCore, issueVehicleCertificateId,
					orderByComparator, true);

			array[1] = vrVehicleRecord;

			array[2] = getByissueVehicleCertificateId_PrevAndNext(session,
					vrVehicleRecord, mtCore, issueVehicleCertificateId,
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

	protected VRVehicleRecord getByissueVehicleCertificateId_PrevAndNext(
		Session session, VRVehicleRecord vrVehicleRecord, long mtCore,
		long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_MTCORE_2);

		query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2);

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
			query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(issueVehicleCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 */
	@Override
	public void removeByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		for (VRVehicleRecord vrVehicleRecord : findByissueVehicleCertificateId(
				mtCore, issueVehicleCertificateId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleRecord);
		}
	}

	/**
	 * Returns the number of vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @return the number of matching vr vehicle records
	 */
	@Override
	public int countByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID;

		Object[] finderArgs = new Object[] { mtCore, issueVehicleCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(issueVehicleCertificateId);

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

	private static final String _FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_MTCORE_2 =
		"vrVehicleRecord.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2 =
		"vrVehicleRecord.issueVehicleCertificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRVehicleRecordModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findBydossierId(long mtCore, long dossierId) {
		return findBydossierId(mtCore, dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @return the range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findBydossierId(long mtCore, long dossierId,
		int start, int end) {
		return findBydossierId(mtCore, dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findBydossierId(long mtCore, long dossierId,
		int start, int end, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findBydossierId(long mtCore, long dossierId,
		int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { mtCore, dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] {
					mtCore, dossierId,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleRecord vrVehicleRecord : list) {
					if ((mtCore != vrVehicleRecord.getMtCore()) ||
							(dossierId != vrVehicleRecord.getDossierId())) {
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

			query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findBydossierId_First(long mtCore, long dossierId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchBydossierId_First(mtCore,
				dossierId, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchBydossierId_First(long mtCore, long dossierId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		List<VRVehicleRecord> list = findBydossierId(mtCore, dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findBydossierId_Last(long mtCore, long dossierId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchBydossierId_Last(mtCore,
				dossierId, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchBydossierId_Last(long mtCore, long dossierId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		int count = countBydossierId(mtCore, dossierId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleRecord> list = findBydossierId(mtCore, dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle record
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord[] findBydossierId_PrevAndNext(long id, long mtCore,
		long dossierId, OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleRecord[] array = new VRVehicleRecordImpl[3];

			array[0] = getBydossierId_PrevAndNext(session, vrVehicleRecord,
					mtCore, dossierId, orderByComparator, true);

			array[1] = vrVehicleRecord;

			array[2] = getBydossierId_PrevAndNext(session, vrVehicleRecord,
					mtCore, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleRecord getBydossierId_PrevAndNext(Session session,
		VRVehicleRecord vrVehicleRecord, long mtCore, long dossierId,
		OrderByComparator<VRVehicleRecord> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

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
			query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle records where mtCore = &#63; and dossierId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBydossierId(long mtCore, long dossierId) {
		for (VRVehicleRecord vrVehicleRecord : findBydossierId(mtCore,
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleRecord);
		}
	}

	/**
	 * Returns the number of vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the number of matching vr vehicle records
	 */
	@Override
	public int countBydossierId(long mtCore, long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { mtCore, dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrVehicleRecord.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrVehicleRecord.dossierId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_FRAMENO = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByframeNo", new String[] { String.class.getName() },
			VRVehicleRecordModelImpl.FRAMENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FRAMENO = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByframeNo",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr vehicle record where frameNo = &#63; or throws a {@link NoSuchVRVehicleRecordException} if it could not be found.
	 *
	 * @param frameNo the frame no
	 * @return the matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByframeNo(String frameNo)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByframeNo(frameNo);

		if (vrVehicleRecord == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("frameNo=");
			msg.append(frameNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRVehicleRecordException(msg.toString());
		}

		return vrVehicleRecord;
	}

	/**
	 * Returns the vr vehicle record where frameNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param frameNo the frame no
	 * @return the matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByframeNo(String frameNo) {
		return fetchByframeNo(frameNo, true);
	}

	/**
	 * Returns the vr vehicle record where frameNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param frameNo the frame no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByframeNo(String frameNo,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { frameNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_FRAMENO,
					finderArgs, this);
		}

		if (result instanceof VRVehicleRecord) {
			VRVehicleRecord vrVehicleRecord = (VRVehicleRecord)result;

			if (!Objects.equals(frameNo, vrVehicleRecord.getFrameNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

			boolean bindFrameNo = false;

			if (frameNo == null) {
				query.append(_FINDER_COLUMN_FRAMENO_FRAMENO_1);
			}
			else if (frameNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FRAMENO_FRAMENO_3);
			}
			else {
				bindFrameNo = true;

				query.append(_FINDER_COLUMN_FRAMENO_FRAMENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFrameNo) {
					qPos.add(frameNo);
				}

				List<VRVehicleRecord> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_FRAMENO,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRVehicleRecordPersistenceImpl.fetchByframeNo(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRVehicleRecord vrVehicleRecord = list.get(0);

					result = vrVehicleRecord;

					cacheResult(vrVehicleRecord);

					if ((vrVehicleRecord.getFrameNo() == null) ||
							!vrVehicleRecord.getFrameNo().equals(frameNo)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_FRAMENO,
							finderArgs, vrVehicleRecord);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_FRAMENO,
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
			return (VRVehicleRecord)result;
		}
	}

	/**
	 * Removes the vr vehicle record where frameNo = &#63; from the database.
	 *
	 * @param frameNo the frame no
	 * @return the vr vehicle record that was removed
	 */
	@Override
	public VRVehicleRecord removeByframeNo(String frameNo)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = findByframeNo(frameNo);

		return remove(vrVehicleRecord);
	}

	/**
	 * Returns the number of vr vehicle records where frameNo = &#63;.
	 *
	 * @param frameNo the frame no
	 * @return the number of matching vr vehicle records
	 */
	@Override
	public int countByframeNo(String frameNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FRAMENO;

		Object[] finderArgs = new Object[] { frameNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLERECORD_WHERE);

			boolean bindFrameNo = false;

			if (frameNo == null) {
				query.append(_FINDER_COLUMN_FRAMENO_FRAMENO_1);
			}
			else if (frameNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FRAMENO_FRAMENO_3);
			}
			else {
				bindFrameNo = true;

				query.append(_FINDER_COLUMN_FRAMENO_FRAMENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFrameNo) {
					qPos.add(frameNo);
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

	private static final String _FINDER_COLUMN_FRAMENO_FRAMENO_1 = "vrVehicleRecord.frameNo IS NULL";
	private static final String _FINDER_COLUMN_FRAMENO_FRAMENO_2 = "vrVehicleRecord.frameNo = ?";
	private static final String _FINDER_COLUMN_FRAMENO_FRAMENO_3 = "(vrVehicleRecord.frameNo IS NULL OR vrVehicleRecord.frameNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycertificateId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRVehicleRecordModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.CERTIFICATEID_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATEID = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycertificateId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @return the matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId) {
		return findBycertificateId(mtCore, certificateId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @return the range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end) {
		return findBycertificateId(mtCore, certificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] { mtCore, certificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] {
					mtCore, certificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleRecord vrVehicleRecord : list) {
					if ((mtCore != vrVehicleRecord.getMtCore()) ||
							(certificateId != vrVehicleRecord.getCertificateId())) {
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

			query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(certificateId);

				if (!pagination) {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findBycertificateId_First(long mtCore,
		long certificateId, OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchBycertificateId_First(mtCore,
				certificateId, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchBycertificateId_First(long mtCore,
		long certificateId, OrderByComparator<VRVehicleRecord> orderByComparator) {
		List<VRVehicleRecord> list = findBycertificateId(mtCore, certificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findBycertificateId_Last(long mtCore,
		long certificateId, OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchBycertificateId_Last(mtCore,
				certificateId, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchBycertificateId_Last(long mtCore,
		long certificateId, OrderByComparator<VRVehicleRecord> orderByComparator) {
		int count = countBycertificateId(mtCore, certificateId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleRecord> list = findBycertificateId(mtCore, certificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle record
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleRecord[] array = new VRVehicleRecordImpl[3];

			array[0] = getBycertificateId_PrevAndNext(session, vrVehicleRecord,
					mtCore, certificateId, orderByComparator, true);

			array[1] = vrVehicleRecord;

			array[2] = getBycertificateId_PrevAndNext(session, vrVehicleRecord,
					mtCore, certificateId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleRecord getBycertificateId_PrevAndNext(Session session,
		VRVehicleRecord vrVehicleRecord, long mtCore, long certificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

		query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

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
			query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(certificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle records where mtCore = &#63; and certificateId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 */
	@Override
	public void removeBycertificateId(long mtCore, long certificateId) {
		for (VRVehicleRecord vrVehicleRecord : findBycertificateId(mtCore,
				certificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleRecord);
		}
	}

	/**
	 * Returns the number of vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @return the number of matching vr vehicle records
	 */
	@Override
	public int countBycertificateId(long mtCore, long certificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATEID;

		Object[] finderArgs = new Object[] { mtCore, certificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(certificateId);

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

	private static final String _FINDER_COLUMN_CERTIFICATEID_MTCORE_2 = "vrVehicleRecord.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2 = "vrVehicleRecord.certificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByapplicantProfileId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByapplicantProfileId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRVehicleRecordModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTPROFILEID = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantProfileId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @return the matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileId(long mtCore,
		long applicantProfileId) {
		return findByapplicantProfileId(mtCore, applicantProfileId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @return the range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end) {
		return findByapplicantProfileId(mtCore, applicantProfileId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return findByapplicantProfileId(mtCore, applicantProfileId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID;
			finderArgs = new Object[] { mtCore, applicantProfileId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEID;
			finderArgs = new Object[] {
					mtCore, applicantProfileId,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleRecord vrVehicleRecord : list) {
					if ((mtCore != vrVehicleRecord.getMtCore()) ||
							(applicantProfileId != vrVehicleRecord.getApplicantProfileId())) {
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

			query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (!pagination) {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByapplicantProfileId_First(mtCore,
				applicantProfileId, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		List<VRVehicleRecord> list = findByapplicantProfileId(mtCore,
				applicantProfileId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByapplicantProfileId_Last(mtCore,
				applicantProfileId, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		int count = countByapplicantProfileId(mtCore, applicantProfileId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleRecord> list = findByapplicantProfileId(mtCore,
				applicantProfileId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle record
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord[] findByapplicantProfileId_PrevAndNext(long id,
		long mtCore, long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleRecord[] array = new VRVehicleRecordImpl[3];

			array[0] = getByapplicantProfileId_PrevAndNext(session,
					vrVehicleRecord, mtCore, applicantProfileId,
					orderByComparator, true);

			array[1] = vrVehicleRecord;

			array[2] = getByapplicantProfileId_PrevAndNext(session,
					vrVehicleRecord, mtCore, applicantProfileId,
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

	protected VRVehicleRecord getByapplicantProfileId_PrevAndNext(
		Session session, VRVehicleRecord vrVehicleRecord, long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

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
			query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 */
	@Override
	public void removeByapplicantProfileId(long mtCore, long applicantProfileId) {
		for (VRVehicleRecord vrVehicleRecord : findByapplicantProfileId(
				mtCore, applicantProfileId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleRecord);
		}
	}

	/**
	 * Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @return the number of matching vr vehicle records
	 */
	@Override
	public int countByapplicantProfileId(long mtCore, long applicantProfileId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTPROFILEID;

		Object[] finderArgs = new Object[] { mtCore, applicantProfileId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

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

	private static final String _FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2 = "vrVehicleRecord.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2 =
		"vrVehicleRecord.applicantProfileId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByapplicantProfileIdAndPrintingStatus",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByapplicantProfileIdAndPrintingStatus",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRVehicleRecordModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.PRINTINGSTATUS_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantProfileIdAndPrintingStatus",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @return the matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus) {
		return findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @return the range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end) {
		return findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end, OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS;
			finderArgs = new Object[] { mtCore, applicantProfileId, printingStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, printingStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleRecord vrVehicleRecord : list) {
					if ((mtCore != vrVehicleRecord.getMtCore()) ||
							(applicantProfileId != vrVehicleRecord.getApplicantProfileId()) ||
							(printingStatus != vrVehicleRecord.getPrintingStatus())) {
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

			query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_APPLICANTPROFILEID_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_PRINTINGSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				qPos.add(printingStatus);

				if (!pagination) {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByapplicantProfileIdAndPrintingStatus_First(
		long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByapplicantProfileIdAndPrintingStatus_First(mtCore,
				applicantProfileId, printingStatus, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", printingStatus=");
		msg.append(printingStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByapplicantProfileIdAndPrintingStatus_First(
		long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		List<VRVehicleRecord> list = findByapplicantProfileIdAndPrintingStatus(mtCore,
				applicantProfileId, printingStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByapplicantProfileIdAndPrintingStatus_Last(
		long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByapplicantProfileIdAndPrintingStatus_Last(mtCore,
				applicantProfileId, printingStatus, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", printingStatus=");
		msg.append(printingStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByapplicantProfileIdAndPrintingStatus_Last(
		long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		int count = countByapplicantProfileIdAndPrintingStatus(mtCore,
				applicantProfileId, printingStatus);

		if (count == 0) {
			return null;
		}

		List<VRVehicleRecord> list = findByapplicantProfileIdAndPrintingStatus(mtCore,
				applicantProfileId, printingStatus, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle record
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord[] findByapplicantProfileIdAndPrintingStatus_PrevAndNext(
		long id, long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleRecord[] array = new VRVehicleRecordImpl[3];

			array[0] = getByapplicantProfileIdAndPrintingStatus_PrevAndNext(session,
					vrVehicleRecord, mtCore, applicantProfileId,
					printingStatus, orderByComparator, true);

			array[1] = vrVehicleRecord;

			array[2] = getByapplicantProfileIdAndPrintingStatus_PrevAndNext(session,
					vrVehicleRecord, mtCore, applicantProfileId,
					printingStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleRecord getByapplicantProfileIdAndPrintingStatus_PrevAndNext(
		Session session, VRVehicleRecord vrVehicleRecord, long mtCore,
		long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_MTCORE_2);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_APPLICANTPROFILEID_2);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_PRINTINGSTATUS_2);

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
			query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		qPos.add(printingStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 */
	@Override
	public void removeByapplicantProfileIdAndPrintingStatus(long mtCore,
		long applicantProfileId, long printingStatus) {
		for (VRVehicleRecord vrVehicleRecord : findByapplicantProfileIdAndPrintingStatus(
				mtCore, applicantProfileId, printingStatus, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrVehicleRecord);
		}
	}

	/**
	 * Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param printingStatus the printing status
	 * @return the number of matching vr vehicle records
	 */
	@Override
	public int countByapplicantProfileIdAndPrintingStatus(long mtCore,
		long applicantProfileId, long printingStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, printingStatus
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_APPLICANTPROFILEID_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_PRINTINGSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				qPos.add(printingStatus);

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

	private static final String _FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_MTCORE_2 =
		"vrVehicleRecord.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_APPLICANTPROFILEID_2 =
		"vrVehicleRecord.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTPROFILEIDANDPRINTINGSTATUS_PRINTINGSTATUS_2 =
		"vrVehicleRecord.printingStatus = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByapplicantProfileIdAndVehicleRecordStatus",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByapplicantProfileIdAndVehicleRecordStatus",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRVehicleRecordModelImpl.MTCORE_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.VEHICLERECORDSTATUS_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantProfileIdAndVehicleRecordStatus",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @return the matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus) {
		return findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @return the range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end) {
		return findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, vehicleRecordStatus
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, vehicleRecordStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleRecord vrVehicleRecord : list) {
					if ((mtCore != vrVehicleRecord.getMtCore()) ||
							(applicantProfileId != vrVehicleRecord.getApplicantProfileId()) ||
							(vehicleRecordStatus != vrVehicleRecord.getVehicleRecordStatus())) {
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

			query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_APPLICANTPROFILEID_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_VEHICLERECORDSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				qPos.add(vehicleRecordStatus);

				if (!pagination) {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByapplicantProfileIdAndVehicleRecordStatus_First(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByapplicantProfileIdAndVehicleRecordStatus_First(mtCore,
				applicantProfileId, vehicleRecordStatus, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", vehicleRecordStatus=");
		msg.append(vehicleRecordStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByapplicantProfileIdAndVehicleRecordStatus_First(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		List<VRVehicleRecord> list = findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
				applicantProfileId, vehicleRecordStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByapplicantProfileIdAndVehicleRecordStatus_Last(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByapplicantProfileIdAndVehicleRecordStatus_Last(mtCore,
				applicantProfileId, vehicleRecordStatus, orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", vehicleRecordStatus=");
		msg.append(vehicleRecordStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByapplicantProfileIdAndVehicleRecordStatus_Last(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		int count = countByapplicantProfileIdAndVehicleRecordStatus(mtCore,
				applicantProfileId, vehicleRecordStatus);

		if (count == 0) {
			return null;
		}

		List<VRVehicleRecord> list = findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
				applicantProfileId, vehicleRecordStatus, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle record
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord[] findByapplicantProfileIdAndVehicleRecordStatus_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleRecord[] array = new VRVehicleRecordImpl[3];

			array[0] = getByapplicantProfileIdAndVehicleRecordStatus_PrevAndNext(session,
					vrVehicleRecord, mtCore, applicantProfileId,
					vehicleRecordStatus, orderByComparator, true);

			array[1] = vrVehicleRecord;

			array[2] = getByapplicantProfileIdAndVehicleRecordStatus_PrevAndNext(session,
					vrVehicleRecord, mtCore, applicantProfileId,
					vehicleRecordStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleRecord getByapplicantProfileIdAndVehicleRecordStatus_PrevAndNext(
		Session session, VRVehicleRecord vrVehicleRecord, long mtCore,
		long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_MTCORE_2);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_APPLICANTPROFILEID_2);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_VEHICLERECORDSTATUS_2);

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
			query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		qPos.add(vehicleRecordStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 */
	@Override
	public void removeByapplicantProfileIdAndVehicleRecordStatus(long mtCore,
		long applicantProfileId, long vehicleRecordStatus) {
		for (VRVehicleRecord vrVehicleRecord : findByapplicantProfileIdAndVehicleRecordStatus(
				mtCore, applicantProfileId, vehicleRecordStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleRecord);
		}
	}

	/**
	 * Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param vehicleRecordStatus the vehicle record status
	 * @return the number of matching vr vehicle records
	 */
	@Override
	public int countByapplicantProfileIdAndVehicleRecordStatus(long mtCore,
		long applicantProfileId, long vehicleRecordStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, vehicleRecordStatus
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_APPLICANTPROFILEID_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_VEHICLERECORDSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				qPos.add(vehicleRecordStatus);

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

	private static final String _FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_MTCORE_2 =
		"vrVehicleRecord.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_APPLICANTPROFILEID_2 =
		"vrVehicleRecord.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS_VEHICLERECORDSTATUS_2 =
		"vrVehicleRecord.vehicleRecordStatus = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEID = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByissueId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID =
		new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByissueId",
			new String[] { Long.class.getName() },
			VRVehicleRecordModelImpl.ISSUEID_COLUMN_BITMASK |
			VRVehicleRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEID = new FinderPath(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByissueId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr vehicle records where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @return the matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByissueId(long issueId) {
		return findByissueId(issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle records where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @return the range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByissueId(long issueId, int start, int end) {
		return findByissueId(issueId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByissueId(long issueId, int start,
		int end, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return findByissueId(issueId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findByissueId(long issueId, int start,
		int end, OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID;
			finderArgs = new Object[] { issueId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEID;
			finderArgs = new Object[] { issueId, start, end, orderByComparator };
		}

		List<VRVehicleRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleRecord vrVehicleRecord : list) {
					if ((issueId != vrVehicleRecord.getIssueId())) {
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

			query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_ISSUEID_ISSUEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueId);

				if (!pagination) {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle record in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByissueId_First(long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByissueId_First(issueId,
				orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle record in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByissueId_First(long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		List<VRVehicleRecord> list = findByissueId(issueId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord findByissueId_Last(long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByissueId_Last(issueId,
				orderByComparator);

		if (vrVehicleRecord != null) {
			return vrVehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle record in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	 */
	@Override
	public VRVehicleRecord fetchByissueId_Last(long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		int count = countByissueId(issueId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleRecord> list = findByissueId(issueId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where issueId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle record
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord[] findByissueId_PrevAndNext(long id, long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleRecord[] array = new VRVehicleRecordImpl[3];

			array[0] = getByissueId_PrevAndNext(session, vrVehicleRecord,
					issueId, orderByComparator, true);

			array[1] = vrVehicleRecord;

			array[2] = getByissueId_PrevAndNext(session, vrVehicleRecord,
					issueId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleRecord getByissueId_PrevAndNext(Session session,
		VRVehicleRecord vrVehicleRecord, long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_ISSUEID_ISSUEID_2);

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
			query.append(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(issueId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle records where issueId = &#63; from the database.
	 *
	 * @param issueId the issue ID
	 */
	@Override
	public void removeByissueId(long issueId) {
		for (VRVehicleRecord vrVehicleRecord : findByissueId(issueId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleRecord);
		}
	}

	/**
	 * Returns the number of vr vehicle records where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @return the number of matching vr vehicle records
	 */
	@Override
	public int countByissueId(long issueId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUEID;

		Object[] finderArgs = new Object[] { issueId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_ISSUEID_ISSUEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueId);

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

	private static final String _FINDER_COLUMN_ISSUEID_ISSUEID_2 = "vrVehicleRecord.issueId = ?";

	public VRVehicleRecordPersistenceImpl() {
		setModelClass(VRVehicleRecord.class);
	}

	/**
	 * Caches the vr vehicle record in the entity cache if it is enabled.
	 *
	 * @param vrVehicleRecord the vr vehicle record
	 */
	@Override
	public void cacheResult(VRVehicleRecord vrVehicleRecord) {
		entityCache.putResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordImpl.class, vrVehicleRecord.getPrimaryKey(),
			vrVehicleRecord);

		finderCache.putResult(FINDER_PATH_FETCH_BY_FRAMENO,
			new Object[] { vrVehicleRecord.getFrameNo() }, vrVehicleRecord);

		vrVehicleRecord.resetOriginalValues();
	}

	/**
	 * Caches the vr vehicle records in the entity cache if it is enabled.
	 *
	 * @param vrVehicleRecords the vr vehicle records
	 */
	@Override
	public void cacheResult(List<VRVehicleRecord> vrVehicleRecords) {
		for (VRVehicleRecord vrVehicleRecord : vrVehicleRecords) {
			if (entityCache.getResult(
						VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
						VRVehicleRecordImpl.class,
						vrVehicleRecord.getPrimaryKey()) == null) {
				cacheResult(vrVehicleRecord);
			}
			else {
				vrVehicleRecord.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr vehicle records.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRVehicleRecordImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr vehicle record.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRVehicleRecord vrVehicleRecord) {
		entityCache.removeResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordImpl.class, vrVehicleRecord.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRVehicleRecordModelImpl)vrVehicleRecord, true);
	}

	@Override
	public void clearCache(List<VRVehicleRecord> vrVehicleRecords) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRVehicleRecord vrVehicleRecord : vrVehicleRecords) {
			entityCache.removeResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
				VRVehicleRecordImpl.class, vrVehicleRecord.getPrimaryKey());

			clearUniqueFindersCache((VRVehicleRecordModelImpl)vrVehicleRecord,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRVehicleRecordModelImpl vrVehicleRecordModelImpl) {
		Object[] args = new Object[] { vrVehicleRecordModelImpl.getFrameNo() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_FRAMENO, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_FRAMENO, args,
			vrVehicleRecordModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRVehicleRecordModelImpl vrVehicleRecordModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { vrVehicleRecordModelImpl.getFrameNo() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FRAMENO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_FRAMENO, args);
		}

		if ((vrVehicleRecordModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_FRAMENO.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrVehicleRecordModelImpl.getOriginalFrameNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FRAMENO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_FRAMENO, args);
		}
	}

	/**
	 * Creates a new vr vehicle record with the primary key. Does not add the vr vehicle record to the database.
	 *
	 * @param id the primary key for the new vr vehicle record
	 * @return the new vr vehicle record
	 */
	@Override
	public VRVehicleRecord create(long id) {
		VRVehicleRecord vrVehicleRecord = new VRVehicleRecordImpl();

		vrVehicleRecord.setNew(true);
		vrVehicleRecord.setPrimaryKey(id);

		return vrVehicleRecord;
	}

	/**
	 * Removes the vr vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr vehicle record
	 * @return the vr vehicle record that was removed
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord remove(long id)
		throws NoSuchVRVehicleRecordException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr vehicle record
	 * @return the vr vehicle record that was removed
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord remove(Serializable primaryKey)
		throws NoSuchVRVehicleRecordException {
		Session session = null;

		try {
			session = openSession();

			VRVehicleRecord vrVehicleRecord = (VRVehicleRecord)session.get(VRVehicleRecordImpl.class,
					primaryKey);

			if (vrVehicleRecord == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRVehicleRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrVehicleRecord);
		}
		catch (NoSuchVRVehicleRecordException nsee) {
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
	protected VRVehicleRecord removeImpl(VRVehicleRecord vrVehicleRecord) {
		vrVehicleRecord = toUnwrappedModel(vrVehicleRecord);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrVehicleRecord)) {
				vrVehicleRecord = (VRVehicleRecord)session.get(VRVehicleRecordImpl.class,
						vrVehicleRecord.getPrimaryKeyObj());
			}

			if (vrVehicleRecord != null) {
				session.delete(vrVehicleRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrVehicleRecord != null) {
			clearCache(vrVehicleRecord);
		}

		return vrVehicleRecord;
	}

	@Override
	public VRVehicleRecord updateImpl(VRVehicleRecord vrVehicleRecord) {
		vrVehicleRecord = toUnwrappedModel(vrVehicleRecord);

		boolean isNew = vrVehicleRecord.isNew();

		VRVehicleRecordModelImpl vrVehicleRecordModelImpl = (VRVehicleRecordModelImpl)vrVehicleRecord;

		Session session = null;

		try {
			session = openSession();

			if (vrVehicleRecord.isNew()) {
				session.save(vrVehicleRecord);

				vrVehicleRecord.setNew(false);
			}
			else {
				vrVehicleRecord = (VRVehicleRecord)session.merge(vrVehicleRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRVehicleRecordModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrVehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleRecordModelImpl.getOriginalMtCore(),
						vrVehicleRecordModelImpl.getOriginalIssueVehicleCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID,
					args);

				args = new Object[] {
						vrVehicleRecordModelImpl.getMtCore(),
						vrVehicleRecordModelImpl.getIssueVehicleCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID,
					args);
			}

			if ((vrVehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleRecordModelImpl.getOriginalMtCore(),
						vrVehicleRecordModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrVehicleRecordModelImpl.getMtCore(),
						vrVehicleRecordModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrVehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleRecordModelImpl.getOriginalMtCore(),
						vrVehicleRecordModelImpl.getOriginalCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);

				args = new Object[] {
						vrVehicleRecordModelImpl.getMtCore(),
						vrVehicleRecordModelImpl.getCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);
			}

			if ((vrVehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleRecordModelImpl.getOriginalMtCore(),
						vrVehicleRecordModelImpl.getOriginalApplicantProfileId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID,
					args);

				args = new Object[] {
						vrVehicleRecordModelImpl.getMtCore(),
						vrVehicleRecordModelImpl.getApplicantProfileId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID,
					args);
			}

			if ((vrVehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleRecordModelImpl.getOriginalMtCore(),
						vrVehicleRecordModelImpl.getOriginalApplicantProfileId(),
						vrVehicleRecordModelImpl.getOriginalPrintingStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS,
					args);

				args = new Object[] {
						vrVehicleRecordModelImpl.getMtCore(),
						vrVehicleRecordModelImpl.getApplicantProfileId(),
						vrVehicleRecordModelImpl.getPrintingStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDPRINTINGSTATUS,
					args);
			}

			if ((vrVehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleRecordModelImpl.getOriginalMtCore(),
						vrVehicleRecordModelImpl.getOriginalApplicantProfileId(),
						vrVehicleRecordModelImpl.getOriginalVehicleRecordStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS,
					args);

				args = new Object[] {
						vrVehicleRecordModelImpl.getMtCore(),
						vrVehicleRecordModelImpl.getApplicantProfileId(),
						vrVehicleRecordModelImpl.getVehicleRecordStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEIDANDVEHICLERECORDSTATUS,
					args);
			}

			if ((vrVehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleRecordModelImpl.getOriginalIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID,
					args);

				args = new Object[] { vrVehicleRecordModelImpl.getIssueId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID,
					args);
			}
		}

		entityCache.putResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleRecordImpl.class, vrVehicleRecord.getPrimaryKey(),
			vrVehicleRecord, false);

		clearUniqueFindersCache(vrVehicleRecordModelImpl, false);
		cacheUniqueFindersCache(vrVehicleRecordModelImpl);

		vrVehicleRecord.resetOriginalValues();

		return vrVehicleRecord;
	}

	protected VRVehicleRecord toUnwrappedModel(VRVehicleRecord vrVehicleRecord) {
		if (vrVehicleRecord instanceof VRVehicleRecordImpl) {
			return vrVehicleRecord;
		}

		VRVehicleRecordImpl vrVehicleRecordImpl = new VRVehicleRecordImpl();

		vrVehicleRecordImpl.setNew(vrVehicleRecord.isNew());
		vrVehicleRecordImpl.setPrimaryKey(vrVehicleRecord.getPrimaryKey());

		vrVehicleRecordImpl.setId(vrVehicleRecord.getId());
		vrVehicleRecordImpl.setMtCore(vrVehicleRecord.getMtCore());
		vrVehicleRecordImpl.setIssueId(vrVehicleRecord.getIssueId());
		vrVehicleRecordImpl.setIssueVehicleCertificateId(vrVehicleRecord.getIssueVehicleCertificateId());
		vrVehicleRecordImpl.setDossierId(vrVehicleRecord.getDossierId());
		vrVehicleRecordImpl.setApplicantProfileId(vrVehicleRecord.getApplicantProfileId());
		vrVehicleRecordImpl.setApplicantName(vrVehicleRecord.getApplicantName());
		vrVehicleRecordImpl.setApplicantAddress(vrVehicleRecord.getApplicantAddress());
		vrVehicleRecordImpl.setCertificateId(vrVehicleRecord.getCertificateId());
		vrVehicleRecordImpl.setProductionNumber(vrVehicleRecord.getProductionNumber());
		vrVehicleRecordImpl.setProductionDate(vrVehicleRecord.getProductionDate());
		vrVehicleRecordImpl.setFrameNo(vrVehicleRecord.getFrameNo());
		vrVehicleRecordImpl.setBoxNo(vrVehicleRecord.getBoxNo());
		vrVehicleRecordImpl.setEngineNo(vrVehicleRecord.getEngineNo());
		vrVehicleRecordImpl.setColor(vrVehicleRecord.getColor());
		vrVehicleRecordImpl.setStampShortNo(vrVehicleRecord.getStampShortNo());
		vrVehicleRecordImpl.setSerialNo(vrVehicleRecord.getSerialNo());
		vrVehicleRecordImpl.setVehicleRecordStatus(vrVehicleRecord.getVehicleRecordStatus());
		vrVehicleRecordImpl.setPrintingStatus(vrVehicleRecord.getPrintingStatus());
		vrVehicleRecordImpl.setAttachedFile(vrVehicleRecord.getAttachedFile());
		vrVehicleRecordImpl.setSignName(vrVehicleRecord.getSignName());
		vrVehicleRecordImpl.setSignTitle(vrVehicleRecord.getSignTitle());
		vrVehicleRecordImpl.setSignPlace(vrVehicleRecord.getSignPlace());
		vrVehicleRecordImpl.setSignDate(vrVehicleRecord.getSignDate());
		vrVehicleRecordImpl.setModifyDate(vrVehicleRecord.getModifyDate());
		vrVehicleRecordImpl.setSyncDate(vrVehicleRecord.getSyncDate());
		vrVehicleRecordImpl.setCertificateRecordDate(vrVehicleRecord.getCertificateRecordDate());
		vrVehicleRecordImpl.setIssueInspectionRecordId(vrVehicleRecord.getIssueInspectionRecordId());
		vrVehicleRecordImpl.setCertificaterecordno(vrVehicleRecord.getCertificaterecordno());
		vrVehicleRecordImpl.setPostPrintingStatus(vrVehicleRecord.getPostPrintingStatus());
		vrVehicleRecordImpl.setQrCode(vrVehicleRecord.getQrCode());

		return vrVehicleRecordImpl;
	}

	/**
	 * Returns the vr vehicle record with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr vehicle record
	 * @return the vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRVehicleRecordException {
		VRVehicleRecord vrVehicleRecord = fetchByPrimaryKey(primaryKey);

		if (vrVehicleRecord == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRVehicleRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrVehicleRecord;
	}

	/**
	 * Returns the vr vehicle record with the primary key or throws a {@link NoSuchVRVehicleRecordException} if it could not be found.
	 *
	 * @param id the primary key of the vr vehicle record
	 * @return the vr vehicle record
	 * @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord findByPrimaryKey(long id)
		throws NoSuchVRVehicleRecordException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr vehicle record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr vehicle record
	 * @return the vr vehicle record, or <code>null</code> if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
				VRVehicleRecordImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRVehicleRecord vrVehicleRecord = (VRVehicleRecord)serializable;

		if (vrVehicleRecord == null) {
			Session session = null;

			try {
				session = openSession();

				vrVehicleRecord = (VRVehicleRecord)session.get(VRVehicleRecordImpl.class,
						primaryKey);

				if (vrVehicleRecord != null) {
					cacheResult(vrVehicleRecord);
				}
				else {
					entityCache.putResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
						VRVehicleRecordImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleRecordImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrVehicleRecord;
	}

	/**
	 * Returns the vr vehicle record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr vehicle record
	 * @return the vr vehicle record, or <code>null</code> if a vr vehicle record with the primary key could not be found
	 */
	@Override
	public VRVehicleRecord fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRVehicleRecord> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRVehicleRecord> map = new HashMap<Serializable, VRVehicleRecord>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRVehicleRecord vrVehicleRecord = fetchByPrimaryKey(primaryKey);

			if (vrVehicleRecord != null) {
				map.put(primaryKey, vrVehicleRecord);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleRecordImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRVehicleRecord)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRVEHICLERECORD_WHERE_PKS_IN);

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

			for (VRVehicleRecord vrVehicleRecord : (List<VRVehicleRecord>)q.list()) {
				map.put(vrVehicleRecord.getPrimaryKeyObj(), vrVehicleRecord);

				cacheResult(vrVehicleRecord);

				uncachedPrimaryKeys.remove(vrVehicleRecord.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRVehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleRecordImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr vehicle records.
	 *
	 * @return the vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @return the range of vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findAll(int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle records
	 * @param end the upper bound of the range of vr vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr vehicle records
	 */
	@Override
	public List<VRVehicleRecord> findAll(int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
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

		List<VRVehicleRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleRecord>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRVEHICLERECORD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRVEHICLERECORD;

				if (pagination) {
					sql = sql.concat(VRVehicleRecordModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleRecord>)QueryUtil.list(q,
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
	 * Removes all the vr vehicle records from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRVehicleRecord vrVehicleRecord : findAll()) {
			remove(vrVehicleRecord);
		}
	}

	/**
	 * Returns the number of vr vehicle records.
	 *
	 * @return the number of vr vehicle records
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRVEHICLERECORD);

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
		return VRVehicleRecordModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr vehicle record persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRVehicleRecordImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRVEHICLERECORD = "SELECT vrVehicleRecord FROM VRVehicleRecord vrVehicleRecord";
	private static final String _SQL_SELECT_VRVEHICLERECORD_WHERE_PKS_IN = "SELECT vrVehicleRecord FROM VRVehicleRecord vrVehicleRecord WHERE id IN (";
	private static final String _SQL_SELECT_VRVEHICLERECORD_WHERE = "SELECT vrVehicleRecord FROM VRVehicleRecord vrVehicleRecord WHERE ";
	private static final String _SQL_COUNT_VRVEHICLERECORD = "SELECT COUNT(vrVehicleRecord) FROM VRVehicleRecord vrVehicleRecord";
	private static final String _SQL_COUNT_VRVEHICLERECORD_WHERE = "SELECT COUNT(vrVehicleRecord) FROM VRVehicleRecord vrVehicleRecord WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrVehicleRecord.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRVehicleRecord exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRVehicleRecord exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRVehicleRecordPersistenceImpl.class);
}