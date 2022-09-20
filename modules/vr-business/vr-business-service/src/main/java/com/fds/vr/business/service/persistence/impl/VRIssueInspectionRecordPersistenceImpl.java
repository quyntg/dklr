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

import com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException;
import com.fds.vr.business.model.VRIssueInspectionRecord;
import com.fds.vr.business.model.impl.VRIssueInspectionRecordImpl;
import com.fds.vr.business.model.impl.VRIssueInspectionRecordModelImpl;
import com.fds.vr.business.service.persistence.VRIssueInspectionRecordPersistence;

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
 * The persistence implementation for the vr issue inspection record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRIssueInspectionRecordPersistence
 * @see com.fds.vr.business.service.persistence.VRIssueInspectionRecordUtil
 * @generated
 */
@ProviderType
public class VRIssueInspectionRecordPersistenceImpl extends BasePersistenceImpl<VRIssueInspectionRecord>
	implements VRIssueInspectionRecordPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRIssueInspectionRecordUtil} to access the vr issue inspection record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRIssueInspectionRecordImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydossierId",
			new String[] { Long.class.getName() },
			VRIssueInspectionRecordModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRIssueInspectionRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr issue inspection records where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findBydossierId(long dossierId) {
		return findBydossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr issue inspection records where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @return the range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findBydossierId(long dossierId,
		int start, int end) {
		return findBydossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue inspection records where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return findBydossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue inspection records where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
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

		List<VRIssueInspectionRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueInspectionRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueInspectionRecord vrIssueInspectionRecord : list) {
					if ((dossierId != vrIssueInspectionRecord.getDossierId())) {
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

			query.append(_SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueInspectionRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRIssueInspectionRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueInspectionRecord>)QueryUtil.list(q,
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
	 * Returns the first vr issue inspection record in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord findBydossierId_First(long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = fetchBydossierId_First(dossierId,
				orderByComparator);

		if (vrIssueInspectionRecord != null) {
			return vrIssueInspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the first vr issue inspection record in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord fetchBydossierId_First(long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		List<VRIssueInspectionRecord> list = findBydossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue inspection record in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord findBydossierId_Last(long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = fetchBydossierId_Last(dossierId,
				orderByComparator);

		if (vrIssueInspectionRecord != null) {
			return vrIssueInspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the last vr issue inspection record in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord fetchBydossierId_Last(long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		int count = countBydossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRIssueInspectionRecord> list = findBydossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr issue inspection record
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord[] findBydossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueInspectionRecord[] array = new VRIssueInspectionRecordImpl[3];

			array[0] = getBydossierId_PrevAndNext(session,
					vrIssueInspectionRecord, dossierId, orderByComparator, true);

			array[1] = vrIssueInspectionRecord;

			array[2] = getBydossierId_PrevAndNext(session,
					vrIssueInspectionRecord, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssueInspectionRecord getBydossierId_PrevAndNext(
		Session session, VRIssueInspectionRecord vrIssueInspectionRecord,
		long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE);

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
			query.append(VRIssueInspectionRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueInspectionRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueInspectionRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue inspection records where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBydossierId(long dossierId) {
		for (VRIssueInspectionRecord vrIssueInspectionRecord : findBydossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueInspectionRecord);
		}
	}

	/**
	 * Returns the number of vr issue inspection records where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr issue inspection records
	 */
	@Override
	public int countBydossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRISSUEINSPECTIONRECORD_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrIssueInspectionRecord.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEID = new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByissueId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID =
		new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByissueId",
			new String[] { Long.class.getName() },
			VRIssueInspectionRecordModelImpl.ISSUEID_COLUMN_BITMASK |
			VRIssueInspectionRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEID = new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByissueId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr issue inspection records where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @return the matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findByissueId(long issueId) {
		return findByissueId(issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue inspection records where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @return the range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findByissueId(long issueId, int start,
		int end) {
		return findByissueId(issueId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue inspection records where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findByissueId(long issueId, int start,
		int end, OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return findByissueId(issueId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue inspection records where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findByissueId(long issueId, int start,
		int end, OrderByComparator<VRIssueInspectionRecord> orderByComparator,
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

		List<VRIssueInspectionRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueInspectionRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueInspectionRecord vrIssueInspectionRecord : list) {
					if ((issueId != vrIssueInspectionRecord.getIssueId())) {
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

			query.append(_SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_ISSUEID_ISSUEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueInspectionRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueId);

				if (!pagination) {
					list = (List<VRIssueInspectionRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueInspectionRecord>)QueryUtil.list(q,
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
	 * Returns the first vr issue inspection record in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord findByissueId_First(long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = fetchByissueId_First(issueId,
				orderByComparator);

		if (vrIssueInspectionRecord != null) {
			return vrIssueInspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the first vr issue inspection record in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord fetchByissueId_First(long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		List<VRIssueInspectionRecord> list = findByissueId(issueId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue inspection record in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord findByissueId_Last(long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = fetchByissueId_Last(issueId,
				orderByComparator);

		if (vrIssueInspectionRecord != null) {
			return vrIssueInspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the last vr issue inspection record in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord fetchByissueId_Last(long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		int count = countByissueId(issueId);

		if (count == 0) {
			return null;
		}

		List<VRIssueInspectionRecord> list = findByissueId(issueId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where issueId = &#63;.
	 *
	 * @param id the primary key of the current vr issue inspection record
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord[] findByissueId_PrevAndNext(long id,
		long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueInspectionRecord[] array = new VRIssueInspectionRecordImpl[3];

			array[0] = getByissueId_PrevAndNext(session,
					vrIssueInspectionRecord, issueId, orderByComparator, true);

			array[1] = vrIssueInspectionRecord;

			array[2] = getByissueId_PrevAndNext(session,
					vrIssueInspectionRecord, issueId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssueInspectionRecord getByissueId_PrevAndNext(
		Session session, VRIssueInspectionRecord vrIssueInspectionRecord,
		long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE);

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
			query.append(VRIssueInspectionRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(issueId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueInspectionRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueInspectionRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue inspection records where issueId = &#63; from the database.
	 *
	 * @param issueId the issue ID
	 */
	@Override
	public void removeByissueId(long issueId) {
		for (VRIssueInspectionRecord vrIssueInspectionRecord : findByissueId(
				issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueInspectionRecord);
		}
	}

	/**
	 * Returns the number of vr issue inspection records where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @return the number of matching vr issue inspection records
	 */
	@Override
	public int countByissueId(long issueId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUEID;

		Object[] finderArgs = new Object[] { issueId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRISSUEINSPECTIONRECORD_WHERE);

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

	private static final String _FINDER_COLUMN_ISSUEID_ISSUEID_2 = "vrIssueInspectionRecord.issueId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycertificateId",
			new String[] { Long.class.getName() },
			VRIssueInspectionRecordModelImpl.CERTIFICATEID_COLUMN_BITMASK |
			VRIssueInspectionRecordModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATEID = new FinderPath(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr issue inspection records where certificateId = &#63;.
	 *
	 * @param certificateId the certificate ID
	 * @return the matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findBycertificateId(long certificateId) {
		return findBycertificateId(certificateId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue inspection records where certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @return the range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end) {
		return findBycertificateId(certificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue inspection records where certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return findBycertificateId(certificateId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue inspection records where certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] { certificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] {
					certificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssueInspectionRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueInspectionRecord>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueInspectionRecord vrIssueInspectionRecord : list) {
					if ((certificateId != vrIssueInspectionRecord.getCertificateId())) {
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

			query.append(_SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueInspectionRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateId);

				if (!pagination) {
					list = (List<VRIssueInspectionRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueInspectionRecord>)QueryUtil.list(q,
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
	 * Returns the first vr issue inspection record in the ordered set where certificateId = &#63;.
	 *
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord findBycertificateId_First(
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = fetchBycertificateId_First(certificateId,
				orderByComparator);

		if (vrIssueInspectionRecord != null) {
			return vrIssueInspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the first vr issue inspection record in the ordered set where certificateId = &#63;.
	 *
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord fetchBycertificateId_First(
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		List<VRIssueInspectionRecord> list = findBycertificateId(certificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue inspection record in the ordered set where certificateId = &#63;.
	 *
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord findBycertificateId_Last(
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = fetchBycertificateId_Last(certificateId,
				orderByComparator);

		if (vrIssueInspectionRecord != null) {
			return vrIssueInspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the last vr issue inspection record in the ordered set where certificateId = &#63;.
	 *
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	 */
	@Override
	public VRIssueInspectionRecord fetchBycertificateId_Last(
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		int count = countBycertificateId(certificateId);

		if (count == 0) {
			return null;
		}

		List<VRIssueInspectionRecord> list = findBycertificateId(certificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where certificateId = &#63;.
	 *
	 * @param id the primary key of the current vr issue inspection record
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord[] findBycertificateId_PrevAndNext(long id,
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueInspectionRecord[] array = new VRIssueInspectionRecordImpl[3];

			array[0] = getBycertificateId_PrevAndNext(session,
					vrIssueInspectionRecord, certificateId, orderByComparator,
					true);

			array[1] = vrIssueInspectionRecord;

			array[2] = getBycertificateId_PrevAndNext(session,
					vrIssueInspectionRecord, certificateId, orderByComparator,
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

	protected VRIssueInspectionRecord getBycertificateId_PrevAndNext(
		Session session, VRIssueInspectionRecord vrIssueInspectionRecord,
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE);

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
			query.append(VRIssueInspectionRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueInspectionRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueInspectionRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue inspection records where certificateId = &#63; from the database.
	 *
	 * @param certificateId the certificate ID
	 */
	@Override
	public void removeBycertificateId(long certificateId) {
		for (VRIssueInspectionRecord vrIssueInspectionRecord : findBycertificateId(
				certificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueInspectionRecord);
		}
	}

	/**
	 * Returns the number of vr issue inspection records where certificateId = &#63;.
	 *
	 * @param certificateId the certificate ID
	 * @return the number of matching vr issue inspection records
	 */
	@Override
	public int countBycertificateId(long certificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATEID;

		Object[] finderArgs = new Object[] { certificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRISSUEINSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2 = "vrIssueInspectionRecord.certificateId = ?";

	public VRIssueInspectionRecordPersistenceImpl() {
		setModelClass(VRIssueInspectionRecord.class);
	}

	/**
	 * Caches the vr issue inspection record in the entity cache if it is enabled.
	 *
	 * @param vrIssueInspectionRecord the vr issue inspection record
	 */
	@Override
	public void cacheResult(VRIssueInspectionRecord vrIssueInspectionRecord) {
		entityCache.putResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			vrIssueInspectionRecord.getPrimaryKey(), vrIssueInspectionRecord);

		vrIssueInspectionRecord.resetOriginalValues();
	}

	/**
	 * Caches the vr issue inspection records in the entity cache if it is enabled.
	 *
	 * @param vrIssueInspectionRecords the vr issue inspection records
	 */
	@Override
	public void cacheResult(
		List<VRIssueInspectionRecord> vrIssueInspectionRecords) {
		for (VRIssueInspectionRecord vrIssueInspectionRecord : vrIssueInspectionRecords) {
			if (entityCache.getResult(
						VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
						VRIssueInspectionRecordImpl.class,
						vrIssueInspectionRecord.getPrimaryKey()) == null) {
				cacheResult(vrIssueInspectionRecord);
			}
			else {
				vrIssueInspectionRecord.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr issue inspection records.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRIssueInspectionRecordImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr issue inspection record.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRIssueInspectionRecord vrIssueInspectionRecord) {
		entityCache.removeResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			vrIssueInspectionRecord.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRIssueInspectionRecord> vrIssueInspectionRecords) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRIssueInspectionRecord vrIssueInspectionRecord : vrIssueInspectionRecords) {
			entityCache.removeResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
				VRIssueInspectionRecordImpl.class,
				vrIssueInspectionRecord.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr issue inspection record with the primary key. Does not add the vr issue inspection record to the database.
	 *
	 * @param id the primary key for the new vr issue inspection record
	 * @return the new vr issue inspection record
	 */
	@Override
	public VRIssueInspectionRecord create(long id) {
		VRIssueInspectionRecord vrIssueInspectionRecord = new VRIssueInspectionRecordImpl();

		vrIssueInspectionRecord.setNew(true);
		vrIssueInspectionRecord.setPrimaryKey(id);

		return vrIssueInspectionRecord;
	}

	/**
	 * Removes the vr issue inspection record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr issue inspection record
	 * @return the vr issue inspection record that was removed
	 * @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord remove(long id)
		throws NoSuchVRIssueInspectionRecordException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr issue inspection record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr issue inspection record
	 * @return the vr issue inspection record that was removed
	 * @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord remove(Serializable primaryKey)
		throws NoSuchVRIssueInspectionRecordException {
		Session session = null;

		try {
			session = openSession();

			VRIssueInspectionRecord vrIssueInspectionRecord = (VRIssueInspectionRecord)session.get(VRIssueInspectionRecordImpl.class,
					primaryKey);

			if (vrIssueInspectionRecord == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRIssueInspectionRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrIssueInspectionRecord);
		}
		catch (NoSuchVRIssueInspectionRecordException nsee) {
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
	protected VRIssueInspectionRecord removeImpl(
		VRIssueInspectionRecord vrIssueInspectionRecord) {
		vrIssueInspectionRecord = toUnwrappedModel(vrIssueInspectionRecord);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrIssueInspectionRecord)) {
				vrIssueInspectionRecord = (VRIssueInspectionRecord)session.get(VRIssueInspectionRecordImpl.class,
						vrIssueInspectionRecord.getPrimaryKeyObj());
			}

			if (vrIssueInspectionRecord != null) {
				session.delete(vrIssueInspectionRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrIssueInspectionRecord != null) {
			clearCache(vrIssueInspectionRecord);
		}

		return vrIssueInspectionRecord;
	}

	@Override
	public VRIssueInspectionRecord updateImpl(
		VRIssueInspectionRecord vrIssueInspectionRecord) {
		vrIssueInspectionRecord = toUnwrappedModel(vrIssueInspectionRecord);

		boolean isNew = vrIssueInspectionRecord.isNew();

		VRIssueInspectionRecordModelImpl vrIssueInspectionRecordModelImpl = (VRIssueInspectionRecordModelImpl)vrIssueInspectionRecord;

		Session session = null;

		try {
			session = openSession();

			if (vrIssueInspectionRecord.isNew()) {
				session.save(vrIssueInspectionRecord);

				vrIssueInspectionRecord.setNew(false);
			}
			else {
				vrIssueInspectionRecord = (VRIssueInspectionRecord)session.merge(vrIssueInspectionRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRIssueInspectionRecordModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrIssueInspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueInspectionRecordModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrIssueInspectionRecordModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrIssueInspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueInspectionRecordModelImpl.getOriginalIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID,
					args);

				args = new Object[] {
						vrIssueInspectionRecordModelImpl.getIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID,
					args);
			}

			if ((vrIssueInspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueInspectionRecordModelImpl.getOriginalCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);

				args = new Object[] {
						vrIssueInspectionRecordModelImpl.getCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueInspectionRecordImpl.class,
			vrIssueInspectionRecord.getPrimaryKey(), vrIssueInspectionRecord,
			false);

		vrIssueInspectionRecord.resetOriginalValues();

		return vrIssueInspectionRecord;
	}

	protected VRIssueInspectionRecord toUnwrappedModel(
		VRIssueInspectionRecord vrIssueInspectionRecord) {
		if (vrIssueInspectionRecord instanceof VRIssueInspectionRecordImpl) {
			return vrIssueInspectionRecord;
		}

		VRIssueInspectionRecordImpl vrIssueInspectionRecordImpl = new VRIssueInspectionRecordImpl();

		vrIssueInspectionRecordImpl.setNew(vrIssueInspectionRecord.isNew());
		vrIssueInspectionRecordImpl.setPrimaryKey(vrIssueInspectionRecord.getPrimaryKey());

		vrIssueInspectionRecordImpl.setId(vrIssueInspectionRecord.getId());
		vrIssueInspectionRecordImpl.setMtCore(vrIssueInspectionRecord.getMtCore());
		vrIssueInspectionRecordImpl.setIssueId(vrIssueInspectionRecord.getIssueId());
		vrIssueInspectionRecordImpl.setDossierId(vrIssueInspectionRecord.getDossierId());
		vrIssueInspectionRecordImpl.setCertificateId(vrIssueInspectionRecord.getCertificateId());
		vrIssueInspectionRecordImpl.setTotalQuantity(vrIssueInspectionRecord.getTotalQuantity());
		vrIssueInspectionRecordImpl.setPostReview(vrIssueInspectionRecord.getPostReview());
		vrIssueInspectionRecordImpl.setPostReviewRecordNo(vrIssueInspectionRecord.getPostReviewRecordNo());
		vrIssueInspectionRecordImpl.setPostReviewRecordDate(vrIssueInspectionRecord.getPostReviewRecordDate());
		vrIssueInspectionRecordImpl.setCorporationId(vrIssueInspectionRecord.getCorporationId());
		vrIssueInspectionRecordImpl.setInspectorCode(vrIssueInspectionRecord.getInspectorCode());
		vrIssueInspectionRecordImpl.setInspectorName(vrIssueInspectionRecord.getInspectorName());
		vrIssueInspectionRecordImpl.setLeaderName(vrIssueInspectionRecord.getLeaderName());
		vrIssueInspectionRecordImpl.setIssueCorporationId(vrIssueInspectionRecord.getIssueCorporationId());
		vrIssueInspectionRecordImpl.setVerifyCorporationId(vrIssueInspectionRecord.getVerifyCorporationId());
		vrIssueInspectionRecordImpl.setInspectorId(vrIssueInspectionRecord.getInspectorId());
		vrIssueInspectionRecordImpl.setIssueInspectorId(vrIssueInspectionRecord.getIssueInspectorId());
		vrIssueInspectionRecordImpl.setVerifyInspectorId(vrIssueInspectionRecord.getVerifyInspectorId());
		vrIssueInspectionRecordImpl.setDigitalIssueStatus(vrIssueInspectionRecord.getDigitalIssueStatus());
		vrIssueInspectionRecordImpl.setValidRemarks(vrIssueInspectionRecord.getValidRemarks());
		vrIssueInspectionRecordImpl.setValidInspectionNote(vrIssueInspectionRecord.getValidInspectionNote());
		vrIssueInspectionRecordImpl.setDocumentFileEntryid(vrIssueInspectionRecord.getDocumentFileEntryid());
		vrIssueInspectionRecordImpl.setModifyDate(vrIssueInspectionRecord.getModifyDate());
		vrIssueInspectionRecordImpl.setSyncDate(vrIssueInspectionRecord.getSyncDate());

		return vrIssueInspectionRecordImpl;
	}

	/**
	 * Returns the vr issue inspection record with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr issue inspection record
	 * @return the vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRIssueInspectionRecordException {
		VRIssueInspectionRecord vrIssueInspectionRecord = fetchByPrimaryKey(primaryKey);

		if (vrIssueInspectionRecord == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRIssueInspectionRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrIssueInspectionRecord;
	}

	/**
	 * Returns the vr issue inspection record with the primary key or throws a {@link NoSuchVRIssueInspectionRecordException} if it could not be found.
	 *
	 * @param id the primary key of the vr issue inspection record
	 * @return the vr issue inspection record
	 * @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord findByPrimaryKey(long id)
		throws NoSuchVRIssueInspectionRecordException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr issue inspection record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr issue inspection record
	 * @return the vr issue inspection record, or <code>null</code> if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
				VRIssueInspectionRecordImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRIssueInspectionRecord vrIssueInspectionRecord = (VRIssueInspectionRecord)serializable;

		if (vrIssueInspectionRecord == null) {
			Session session = null;

			try {
				session = openSession();

				vrIssueInspectionRecord = (VRIssueInspectionRecord)session.get(VRIssueInspectionRecordImpl.class,
						primaryKey);

				if (vrIssueInspectionRecord != null) {
					cacheResult(vrIssueInspectionRecord);
				}
				else {
					entityCache.putResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
						VRIssueInspectionRecordImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueInspectionRecordImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrIssueInspectionRecord;
	}

	/**
	 * Returns the vr issue inspection record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr issue inspection record
	 * @return the vr issue inspection record, or <code>null</code> if a vr issue inspection record with the primary key could not be found
	 */
	@Override
	public VRIssueInspectionRecord fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRIssueInspectionRecord> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRIssueInspectionRecord> map = new HashMap<Serializable, VRIssueInspectionRecord>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRIssueInspectionRecord vrIssueInspectionRecord = fetchByPrimaryKey(primaryKey);

			if (vrIssueInspectionRecord != null) {
				map.put(primaryKey, vrIssueInspectionRecord);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueInspectionRecordImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRIssueInspectionRecord)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE_PKS_IN);

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

			for (VRIssueInspectionRecord vrIssueInspectionRecord : (List<VRIssueInspectionRecord>)q.list()) {
				map.put(vrIssueInspectionRecord.getPrimaryKeyObj(),
					vrIssueInspectionRecord);

				cacheResult(vrIssueInspectionRecord);

				uncachedPrimaryKeys.remove(vrIssueInspectionRecord.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRIssueInspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueInspectionRecordImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr issue inspection records.
	 *
	 * @return the vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue inspection records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @return the range of vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue inspection records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findAll(int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue inspection records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue inspection records
	 * @param end the upper bound of the range of vr issue inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr issue inspection records
	 */
	@Override
	public List<VRIssueInspectionRecord> findAll(int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
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

		List<VRIssueInspectionRecord> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueInspectionRecord>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRISSUEINSPECTIONRECORD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRISSUEINSPECTIONRECORD;

				if (pagination) {
					sql = sql.concat(VRIssueInspectionRecordModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRIssueInspectionRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueInspectionRecord>)QueryUtil.list(q,
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
	 * Removes all the vr issue inspection records from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRIssueInspectionRecord vrIssueInspectionRecord : findAll()) {
			remove(vrIssueInspectionRecord);
		}
	}

	/**
	 * Returns the number of vr issue inspection records.
	 *
	 * @return the number of vr issue inspection records
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRISSUEINSPECTIONRECORD);

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
		return VRIssueInspectionRecordModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr issue inspection record persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRIssueInspectionRecordImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRISSUEINSPECTIONRECORD = "SELECT vrIssueInspectionRecord FROM VRIssueInspectionRecord vrIssueInspectionRecord";
	private static final String _SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE_PKS_IN =
		"SELECT vrIssueInspectionRecord FROM VRIssueInspectionRecord vrIssueInspectionRecord WHERE id IN (";
	private static final String _SQL_SELECT_VRISSUEINSPECTIONRECORD_WHERE = "SELECT vrIssueInspectionRecord FROM VRIssueInspectionRecord vrIssueInspectionRecord WHERE ";
	private static final String _SQL_COUNT_VRISSUEINSPECTIONRECORD = "SELECT COUNT(vrIssueInspectionRecord) FROM VRIssueInspectionRecord vrIssueInspectionRecord";
	private static final String _SQL_COUNT_VRISSUEINSPECTIONRECORD_WHERE = "SELECT COUNT(vrIssueInspectionRecord) FROM VRIssueInspectionRecord vrIssueInspectionRecord WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrIssueInspectionRecord.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRIssueInspectionRecord exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRIssueInspectionRecord exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRIssueInspectionRecordPersistenceImpl.class);
}