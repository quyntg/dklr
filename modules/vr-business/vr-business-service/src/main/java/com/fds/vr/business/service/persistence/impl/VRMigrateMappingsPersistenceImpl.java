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

import com.fds.vr.business.exception.NoSuchVRMigrateMappingsException;
import com.fds.vr.business.model.VRMigrateMappings;
import com.fds.vr.business.model.impl.VRMigrateMappingsImpl;
import com.fds.vr.business.model.impl.VRMigrateMappingsModelImpl;
import com.fds.vr.business.service.persistence.VRMigrateMappingsPersistence;

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
 * The persistence implementation for the vr migrate mappings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRMigrateMappingsPersistence
 * @see com.fds.vr.business.service.persistence.VRMigrateMappingsUtil
 * @generated
 */
@ProviderType
public class VRMigrateMappingsPersistenceImpl extends BasePersistenceImpl<VRMigrateMappings>
	implements VRMigrateMappingsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRMigrateMappingsUtil} to access the vr migrate mappings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRMigrateMappingsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateMappingsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateMappingsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MIID_DATAGRID_SEQ =
		new FinderPath(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateMappingsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMiId_DataGRId_Seq",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MIID_DATAGRID_SEQ =
		new FinderPath(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateMappingsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByMiId_DataGRId_Seq",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			VRMigrateMappingsModelImpl.TASKMIGRATIONID_COLUMN_BITMASK |
			VRMigrateMappingsModelImpl.DATAGROUPID_COLUMN_BITMASK |
			VRMigrateMappingsModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MIID_DATAGRID_SEQ = new FinderPath(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMiId_DataGRId_Seq",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @return the matching vr migrate mappingses
	 */
	@Override
	public List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo) {
		return findByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
			sequenceNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @param start the lower bound of the range of vr migrate mappingses
	 * @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	 * @return the range of matching vr migrate mappingses
	 */
	@Override
	public List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start, int end) {
		return findByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
			sequenceNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @param start the lower bound of the range of vr migrate mappingses
	 * @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr migrate mappingses
	 */
	@Override
	public List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start,
		int end, OrderByComparator<VRMigrateMappings> orderByComparator) {
		return findByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
			sequenceNo, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @param start the lower bound of the range of vr migrate mappingses
	 * @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr migrate mappingses
	 */
	@Override
	public List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start,
		int end, OrderByComparator<VRMigrateMappings> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MIID_DATAGRID_SEQ;
			finderArgs = new Object[] { taskMigrationID, dataGroupId, sequenceNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MIID_DATAGRID_SEQ;
			finderArgs = new Object[] {
					taskMigrationID, dataGroupId, sequenceNo,
					
					start, end, orderByComparator
				};
		}

		List<VRMigrateMappings> list = null;

		if (retrieveFromCache) {
			list = (List<VRMigrateMappings>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRMigrateMappings vrMigrateMappings : list) {
					if ((taskMigrationID != vrMigrateMappings.getTaskMigrationID()) ||
							(dataGroupId != vrMigrateMappings.getDataGroupId()) ||
							(sequenceNo != vrMigrateMappings.getSequenceNo())) {
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

			query.append(_SQL_SELECT_VRMIGRATEMAPPINGS_WHERE);

			query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_TASKMIGRATIONID_2);

			query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_SEQUENCENO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRMigrateMappingsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taskMigrationID);

				qPos.add(dataGroupId);

				qPos.add(sequenceNo);

				if (!pagination) {
					list = (List<VRMigrateMappings>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRMigrateMappings>)QueryUtil.list(q,
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
	 * Returns the first vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr migrate mappings
	 * @throws NoSuchVRMigrateMappingsException if a matching vr migrate mappings could not be found
	 */
	@Override
	public VRMigrateMappings findByMiId_DataGRId_Seq_First(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator)
		throws NoSuchVRMigrateMappingsException {
		VRMigrateMappings vrMigrateMappings = fetchByMiId_DataGRId_Seq_First(taskMigrationID,
				dataGroupId, sequenceNo, orderByComparator);

		if (vrMigrateMappings != null) {
			return vrMigrateMappings;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taskMigrationID=");
		msg.append(taskMigrationID);

		msg.append(", dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", sequenceNo=");
		msg.append(sequenceNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRMigrateMappingsException(msg.toString());
	}

	/**
	 * Returns the first vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr migrate mappings, or <code>null</code> if a matching vr migrate mappings could not be found
	 */
	@Override
	public VRMigrateMappings fetchByMiId_DataGRId_Seq_First(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator) {
		List<VRMigrateMappings> list = findByMiId_DataGRId_Seq(taskMigrationID,
				dataGroupId, sequenceNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr migrate mappings
	 * @throws NoSuchVRMigrateMappingsException if a matching vr migrate mappings could not be found
	 */
	@Override
	public VRMigrateMappings findByMiId_DataGRId_Seq_Last(int taskMigrationID,
		int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator)
		throws NoSuchVRMigrateMappingsException {
		VRMigrateMappings vrMigrateMappings = fetchByMiId_DataGRId_Seq_Last(taskMigrationID,
				dataGroupId, sequenceNo, orderByComparator);

		if (vrMigrateMappings != null) {
			return vrMigrateMappings;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taskMigrationID=");
		msg.append(taskMigrationID);

		msg.append(", dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", sequenceNo=");
		msg.append(sequenceNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRMigrateMappingsException(msg.toString());
	}

	/**
	 * Returns the last vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr migrate mappings, or <code>null</code> if a matching vr migrate mappings could not be found
	 */
	@Override
	public VRMigrateMappings fetchByMiId_DataGRId_Seq_Last(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator) {
		int count = countByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
				sequenceNo);

		if (count == 0) {
			return null;
		}

		List<VRMigrateMappings> list = findByMiId_DataGRId_Seq(taskMigrationID,
				dataGroupId, sequenceNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr migrate mappingses before and after the current vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * @param id the primary key of the current vr migrate mappings
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr migrate mappings
	 * @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	 */
	@Override
	public VRMigrateMappings[] findByMiId_DataGRId_Seq_PrevAndNext(long id,
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator)
		throws NoSuchVRMigrateMappingsException {
		VRMigrateMappings vrMigrateMappings = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRMigrateMappings[] array = new VRMigrateMappingsImpl[3];

			array[0] = getByMiId_DataGRId_Seq_PrevAndNext(session,
					vrMigrateMappings, taskMigrationID, dataGroupId,
					sequenceNo, orderByComparator, true);

			array[1] = vrMigrateMappings;

			array[2] = getByMiId_DataGRId_Seq_PrevAndNext(session,
					vrMigrateMappings, taskMigrationID, dataGroupId,
					sequenceNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRMigrateMappings getByMiId_DataGRId_Seq_PrevAndNext(
		Session session, VRMigrateMappings vrMigrateMappings,
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRMIGRATEMAPPINGS_WHERE);

		query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_TASKMIGRATIONID_2);

		query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_DATAGROUPID_2);

		query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_SEQUENCENO_2);

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
			query.append(VRMigrateMappingsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(taskMigrationID);

		qPos.add(dataGroupId);

		qPos.add(sequenceNo);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrMigrateMappings);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRMigrateMappings> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63; from the database.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 */
	@Override
	public void removeByMiId_DataGRId_Seq(int taskMigrationID, int dataGroupId,
		int sequenceNo) {
		for (VRMigrateMappings vrMigrateMappings : findByMiId_DataGRId_Seq(
				taskMigrationID, dataGroupId, sequenceNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrMigrateMappings);
		}
	}

	/**
	 * Returns the number of vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param dataGroupId the data group ID
	 * @param sequenceNo the sequence no
	 * @return the number of matching vr migrate mappingses
	 */
	@Override
	public int countByMiId_DataGRId_Seq(int taskMigrationID, int dataGroupId,
		int sequenceNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MIID_DATAGRID_SEQ;

		Object[] finderArgs = new Object[] {
				taskMigrationID, dataGroupId, sequenceNo
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRMIGRATEMAPPINGS_WHERE);

			query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_TASKMIGRATIONID_2);

			query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_MIID_DATAGRID_SEQ_SEQUENCENO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taskMigrationID);

				qPos.add(dataGroupId);

				qPos.add(sequenceNo);

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

	private static final String _FINDER_COLUMN_MIID_DATAGRID_SEQ_TASKMIGRATIONID_2 =
		"vrMigrateMappings.taskMigrationID = ? AND ";
	private static final String _FINDER_COLUMN_MIID_DATAGRID_SEQ_DATAGROUPID_2 = "vrMigrateMappings.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_MIID_DATAGRID_SEQ_SEQUENCENO_2 = "vrMigrateMappings.sequenceNo = ?";

	public VRMigrateMappingsPersistenceImpl() {
		setModelClass(VRMigrateMappings.class);
	}

	/**
	 * Caches the vr migrate mappings in the entity cache if it is enabled.
	 *
	 * @param vrMigrateMappings the vr migrate mappings
	 */
	@Override
	public void cacheResult(VRMigrateMappings vrMigrateMappings) {
		entityCache.putResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsImpl.class, vrMigrateMappings.getPrimaryKey(),
			vrMigrateMappings);

		vrMigrateMappings.resetOriginalValues();
	}

	/**
	 * Caches the vr migrate mappingses in the entity cache if it is enabled.
	 *
	 * @param vrMigrateMappingses the vr migrate mappingses
	 */
	@Override
	public void cacheResult(List<VRMigrateMappings> vrMigrateMappingses) {
		for (VRMigrateMappings vrMigrateMappings : vrMigrateMappingses) {
			if (entityCache.getResult(
						VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
						VRMigrateMappingsImpl.class,
						vrMigrateMappings.getPrimaryKey()) == null) {
				cacheResult(vrMigrateMappings);
			}
			else {
				vrMigrateMappings.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr migrate mappingses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRMigrateMappingsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr migrate mappings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRMigrateMappings vrMigrateMappings) {
		entityCache.removeResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsImpl.class, vrMigrateMappings.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRMigrateMappings> vrMigrateMappingses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRMigrateMappings vrMigrateMappings : vrMigrateMappingses) {
			entityCache.removeResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
				VRMigrateMappingsImpl.class, vrMigrateMappings.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr migrate mappings with the primary key. Does not add the vr migrate mappings to the database.
	 *
	 * @param id the primary key for the new vr migrate mappings
	 * @return the new vr migrate mappings
	 */
	@Override
	public VRMigrateMappings create(long id) {
		VRMigrateMappings vrMigrateMappings = new VRMigrateMappingsImpl();

		vrMigrateMappings.setNew(true);
		vrMigrateMappings.setPrimaryKey(id);

		return vrMigrateMappings;
	}

	/**
	 * Removes the vr migrate mappings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr migrate mappings
	 * @return the vr migrate mappings that was removed
	 * @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	 */
	@Override
	public VRMigrateMappings remove(long id)
		throws NoSuchVRMigrateMappingsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr migrate mappings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr migrate mappings
	 * @return the vr migrate mappings that was removed
	 * @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	 */
	@Override
	public VRMigrateMappings remove(Serializable primaryKey)
		throws NoSuchVRMigrateMappingsException {
		Session session = null;

		try {
			session = openSession();

			VRMigrateMappings vrMigrateMappings = (VRMigrateMappings)session.get(VRMigrateMappingsImpl.class,
					primaryKey);

			if (vrMigrateMappings == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRMigrateMappingsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrMigrateMappings);
		}
		catch (NoSuchVRMigrateMappingsException nsee) {
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
	protected VRMigrateMappings removeImpl(VRMigrateMappings vrMigrateMappings) {
		vrMigrateMappings = toUnwrappedModel(vrMigrateMappings);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrMigrateMappings)) {
				vrMigrateMappings = (VRMigrateMappings)session.get(VRMigrateMappingsImpl.class,
						vrMigrateMappings.getPrimaryKeyObj());
			}

			if (vrMigrateMappings != null) {
				session.delete(vrMigrateMappings);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrMigrateMappings != null) {
			clearCache(vrMigrateMappings);
		}

		return vrMigrateMappings;
	}

	@Override
	public VRMigrateMappings updateImpl(VRMigrateMappings vrMigrateMappings) {
		vrMigrateMappings = toUnwrappedModel(vrMigrateMappings);

		boolean isNew = vrMigrateMappings.isNew();

		VRMigrateMappingsModelImpl vrMigrateMappingsModelImpl = (VRMigrateMappingsModelImpl)vrMigrateMappings;

		Session session = null;

		try {
			session = openSession();

			if (vrMigrateMappings.isNew()) {
				session.save(vrMigrateMappings);

				vrMigrateMappings.setNew(false);
			}
			else {
				vrMigrateMappings = (VRMigrateMappings)session.merge(vrMigrateMappings);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRMigrateMappingsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrMigrateMappingsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MIID_DATAGRID_SEQ.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrMigrateMappingsModelImpl.getOriginalTaskMigrationID(),
						vrMigrateMappingsModelImpl.getOriginalDataGroupId(),
						vrMigrateMappingsModelImpl.getOriginalSequenceNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MIID_DATAGRID_SEQ,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MIID_DATAGRID_SEQ,
					args);

				args = new Object[] {
						vrMigrateMappingsModelImpl.getTaskMigrationID(),
						vrMigrateMappingsModelImpl.getDataGroupId(),
						vrMigrateMappingsModelImpl.getSequenceNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MIID_DATAGRID_SEQ,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MIID_DATAGRID_SEQ,
					args);
			}
		}

		entityCache.putResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateMappingsImpl.class, vrMigrateMappings.getPrimaryKey(),
			vrMigrateMappings, false);

		vrMigrateMappings.resetOriginalValues();

		return vrMigrateMappings;
	}

	protected VRMigrateMappings toUnwrappedModel(
		VRMigrateMappings vrMigrateMappings) {
		if (vrMigrateMappings instanceof VRMigrateMappingsImpl) {
			return vrMigrateMappings;
		}

		VRMigrateMappingsImpl vrMigrateMappingsImpl = new VRMigrateMappingsImpl();

		vrMigrateMappingsImpl.setNew(vrMigrateMappings.isNew());
		vrMigrateMappingsImpl.setPrimaryKey(vrMigrateMappings.getPrimaryKey());

		vrMigrateMappingsImpl.setId(vrMigrateMappings.getId());
		vrMigrateMappingsImpl.setDataGroupId(vrMigrateMappings.getDataGroupId());
		vrMigrateMappingsImpl.setSequenceNo(vrMigrateMappings.getSequenceNo());
		vrMigrateMappingsImpl.setMigrateTableName(vrMigrateMappings.getMigrateTableName());
		vrMigrateMappingsImpl.setDataItemID(vrMigrateMappings.getDataItemID());
		vrMigrateMappingsImpl.setItemCode(vrMigrateMappings.getItemCode());
		vrMigrateMappingsImpl.setItemName(vrMigrateMappings.getItemName());
		vrMigrateMappingsImpl.setItemShortName(vrMigrateMappings.getItemShortName());
		vrMigrateMappingsImpl.setItemDescription(vrMigrateMappings.getItemDescription());
		vrMigrateMappingsImpl.setCode_0(vrMigrateMappings.getCode_0());
		vrMigrateMappingsImpl.setCode_1(vrMigrateMappings.getCode_1());
		vrMigrateMappingsImpl.setCode_2(vrMigrateMappings.getCode_2());
		vrMigrateMappingsImpl.setCode_3(vrMigrateMappings.getCode_3());
		vrMigrateMappingsImpl.setLevel(vrMigrateMappings.getLevel());
		vrMigrateMappingsImpl.setSeqNo(vrMigrateMappings.getSeqNo());
		vrMigrateMappingsImpl.setMarkedAsRestore(vrMigrateMappings.getMarkedAsRestore());
		vrMigrateMappingsImpl.setMarkedAsDelete(vrMigrateMappings.getMarkedAsDelete());
		vrMigrateMappingsImpl.setAlterCollectionCode(vrMigrateMappings.getAlterCollectionCode());
		vrMigrateMappingsImpl.setAlterItemCode(vrMigrateMappings.getAlterItemCode());
		vrMigrateMappingsImpl.setAlterItemName(vrMigrateMappings.getAlterItemName());
		vrMigrateMappingsImpl.setAlterGroupCode(vrMigrateMappings.getAlterGroupCode());
		vrMigrateMappingsImpl.setAlterLevel(vrMigrateMappings.getAlterLevel());
		vrMigrateMappingsImpl.setTaskMigrationID(vrMigrateMappings.getTaskMigrationID());

		return vrMigrateMappingsImpl;
	}

	/**
	 * Returns the vr migrate mappings with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr migrate mappings
	 * @return the vr migrate mappings
	 * @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	 */
	@Override
	public VRMigrateMappings findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRMigrateMappingsException {
		VRMigrateMappings vrMigrateMappings = fetchByPrimaryKey(primaryKey);

		if (vrMigrateMappings == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRMigrateMappingsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrMigrateMappings;
	}

	/**
	 * Returns the vr migrate mappings with the primary key or throws a {@link NoSuchVRMigrateMappingsException} if it could not be found.
	 *
	 * @param id the primary key of the vr migrate mappings
	 * @return the vr migrate mappings
	 * @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	 */
	@Override
	public VRMigrateMappings findByPrimaryKey(long id)
		throws NoSuchVRMigrateMappingsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr migrate mappings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr migrate mappings
	 * @return the vr migrate mappings, or <code>null</code> if a vr migrate mappings with the primary key could not be found
	 */
	@Override
	public VRMigrateMappings fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
				VRMigrateMappingsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRMigrateMappings vrMigrateMappings = (VRMigrateMappings)serializable;

		if (vrMigrateMappings == null) {
			Session session = null;

			try {
				session = openSession();

				vrMigrateMappings = (VRMigrateMappings)session.get(VRMigrateMappingsImpl.class,
						primaryKey);

				if (vrMigrateMappings != null) {
					cacheResult(vrMigrateMappings);
				}
				else {
					entityCache.putResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
						VRMigrateMappingsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateMappingsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrMigrateMappings;
	}

	/**
	 * Returns the vr migrate mappings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr migrate mappings
	 * @return the vr migrate mappings, or <code>null</code> if a vr migrate mappings with the primary key could not be found
	 */
	@Override
	public VRMigrateMappings fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRMigrateMappings> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRMigrateMappings> map = new HashMap<Serializable, VRMigrateMappings>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRMigrateMappings vrMigrateMappings = fetchByPrimaryKey(primaryKey);

			if (vrMigrateMappings != null) {
				map.put(primaryKey, vrMigrateMappings);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateMappingsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRMigrateMappings)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRMIGRATEMAPPINGS_WHERE_PKS_IN);

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

			for (VRMigrateMappings vrMigrateMappings : (List<VRMigrateMappings>)q.list()) {
				map.put(vrMigrateMappings.getPrimaryKeyObj(), vrMigrateMappings);

				cacheResult(vrMigrateMappings);

				uncachedPrimaryKeys.remove(vrMigrateMappings.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRMigrateMappingsModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateMappingsImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr migrate mappingses.
	 *
	 * @return the vr migrate mappingses
	 */
	@Override
	public List<VRMigrateMappings> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr migrate mappingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate mappingses
	 * @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	 * @return the range of vr migrate mappingses
	 */
	@Override
	public List<VRMigrateMappings> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr migrate mappingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate mappingses
	 * @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr migrate mappingses
	 */
	@Override
	public List<VRMigrateMappings> findAll(int start, int end,
		OrderByComparator<VRMigrateMappings> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr migrate mappingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate mappingses
	 * @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr migrate mappingses
	 */
	@Override
	public List<VRMigrateMappings> findAll(int start, int end,
		OrderByComparator<VRMigrateMappings> orderByComparator,
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

		List<VRMigrateMappings> list = null;

		if (retrieveFromCache) {
			list = (List<VRMigrateMappings>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRMIGRATEMAPPINGS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRMIGRATEMAPPINGS;

				if (pagination) {
					sql = sql.concat(VRMigrateMappingsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRMigrateMappings>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRMigrateMappings>)QueryUtil.list(q,
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
	 * Removes all the vr migrate mappingses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRMigrateMappings vrMigrateMappings : findAll()) {
			remove(vrMigrateMappings);
		}
	}

	/**
	 * Returns the number of vr migrate mappingses.
	 *
	 * @return the number of vr migrate mappingses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRMIGRATEMAPPINGS);

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
		return VRMigrateMappingsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr migrate mappings persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRMigrateMappingsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRMIGRATEMAPPINGS = "SELECT vrMigrateMappings FROM VRMigrateMappings vrMigrateMappings";
	private static final String _SQL_SELECT_VRMIGRATEMAPPINGS_WHERE_PKS_IN = "SELECT vrMigrateMappings FROM VRMigrateMappings vrMigrateMappings WHERE id IN (";
	private static final String _SQL_SELECT_VRMIGRATEMAPPINGS_WHERE = "SELECT vrMigrateMappings FROM VRMigrateMappings vrMigrateMappings WHERE ";
	private static final String _SQL_COUNT_VRMIGRATEMAPPINGS = "SELECT COUNT(vrMigrateMappings) FROM VRMigrateMappings vrMigrateMappings";
	private static final String _SQL_COUNT_VRMIGRATEMAPPINGS_WHERE = "SELECT COUNT(vrMigrateMappings) FROM VRMigrateMappings vrMigrateMappings WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrMigrateMappings.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRMigrateMappings exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRMigrateMappings exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRMigrateMappingsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dataGroupId"
			});
}