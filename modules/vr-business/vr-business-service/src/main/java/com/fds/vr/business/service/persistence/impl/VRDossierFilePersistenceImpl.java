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

import com.fds.vr.business.exception.NoSuchVRDossierFileException;
import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.model.impl.VRDossierFileImpl;
import com.fds.vr.business.model.impl.VRDossierFileModelImpl;
import com.fds.vr.business.service.persistence.VRDossierFilePersistence;

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
 * The persistence implementation for the vr dossier file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRDossierFilePersistence
 * @see com.fds.vr.business.service.persistence.VRDossierFileUtil
 * @generated
 */
@ProviderType
public class VRDossierFilePersistenceImpl extends BasePersistenceImpl<VRDossierFile>
	implements VRDossierFilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRDossierFileUtil} to access the vr dossier file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRDossierFileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid", new String[] { String.class.getName() },
			VRDossierFileModelImpl.UUID_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr dossier files where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByUuid(String uuid, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByUuid(String uuid, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
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

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if (!Objects.equals(uuid, vrDossierFile.getUuid())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

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
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByUuid_First(String uuid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByUuid_First(uuid, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByUuid_First(String uuid,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByUuid_Last(String uuid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByUuid_Last(uuid, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByUuid_Last(String uuid,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where uuid = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByUuid_PrevAndNext(long dossierFileId,
		String uuid, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByUuid_PrevAndNext(session, vrDossierFile, uuid,
					orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByUuid_PrevAndNext(session, vrDossierFile, uuid,
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

	protected VRDossierFile getByUuid_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, String uuid,
		OrderByComparator<VRDossierFile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (VRDossierFile vrDossierFile : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "vrDossierFile.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "vrDossierFile.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(vrDossierFile.uuid IS NULL OR vrDossierFile.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			VRDossierFileModelImpl.UUID_COLUMN_BITMASK |
			VRDossierFileModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the vr dossier file where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByUUID_G(String uuid, long groupId)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByUUID_G(uuid, groupId);

		if (vrDossierFile == null) {
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

			throw new NoSuchVRDossierFileException(msg.toString());
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the vr dossier file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof VRDossierFile) {
			VRDossierFile vrDossierFile = (VRDossierFile)result;

			if (!Objects.equals(uuid, vrDossierFile.getUuid()) ||
					(groupId != vrDossierFile.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

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

				List<VRDossierFile> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					VRDossierFile vrDossierFile = list.get(0);

					result = vrDossierFile;

					cacheResult(vrDossierFile);

					if ((vrDossierFile.getUuid() == null) ||
							!vrDossierFile.getUuid().equals(uuid) ||
							(vrDossierFile.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, vrDossierFile);
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
			return (VRDossierFile)result;
		}
	}

	/**
	 * Removes the vr dossier file where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the vr dossier file that was removed
	 */
	@Override
	public VRDossierFile removeByUUID_G(String uuid, long groupId)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByUUID_G(uuid, groupId);

		return remove(vrDossierFile);
	}

	/**
	 * Returns the number of vr dossier files where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "vrDossierFile.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "vrDossierFile.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(vrDossierFile.uuid IS NULL OR vrDossierFile.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "vrDossierFile.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			VRDossierFileModelImpl.UUID_COLUMN_BITMASK |
			VRDossierFileModelImpl.COMPANYID_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr dossier files where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<VRDossierFile> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<VRDossierFile> orderByComparator,
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

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if (!Objects.equals(uuid, vrDossierFile.getUuid()) ||
							(companyId != vrDossierFile.getCompanyId())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

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
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByUuid_C_PrevAndNext(long dossierFileId,
		String uuid, long companyId,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, vrDossierFile, uuid,
					companyId, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByUuid_C_PrevAndNext(session, vrDossierFile, uuid,
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

	protected VRDossierFile getByUuid_C_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, String uuid, long companyId,
		OrderByComparator<VRDossierFile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (VRDossierFile vrDossierFile : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "vrDossierFile.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "vrDossierFile.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(vrDossierFile.uuid IS NULL OR vrDossierFile.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "vrDossierFile.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_FTN = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDID_FTN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTN =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDID_FTN",
			new String[] { Long.class.getName(), String.class.getName() },
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.FILETEMPLATENO_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DID_FTN = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDID_FTN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTN(long dossierId,
		String fileTemplateNo) {
		return findByDID_FTN(dossierId, fileTemplateNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTN(long dossierId,
		String fileTemplateNo, int start, int end) {
		return findByDID_FTN(dossierId, fileTemplateNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTN(long dossierId,
		String fileTemplateNo, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findByDID_FTN(dossierId, fileTemplateNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTN(long dossierId,
		String fileTemplateNo, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTN;
			finderArgs = new Object[] { dossierId, fileTemplateNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_FTN;
			finderArgs = new Object[] {
					dossierId, fileTemplateNo,
					
					start, end, orderByComparator
				};
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId()) ||
							!Objects.equals(fileTemplateNo,
								vrDossierFile.getFileTemplateNo())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_FTN_DOSSIERID_2);

			boolean bindFileTemplateNo = false;

			if (fileTemplateNo == null) {
				query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_1);
			}
			else if (fileTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_3);
			}
			else {
				bindFileTemplateNo = true;

				query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindFileTemplateNo) {
					qPos.add(fileTemplateNo);
				}

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_FTN_First(long dossierId,
		String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_FTN_First(dossierId,
				fileTemplateNo, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", fileTemplateNo=");
		msg.append(fileTemplateNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_FTN_First(long dossierId,
		String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByDID_FTN(dossierId, fileTemplateNo, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_FTN_Last(long dossierId,
		String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_FTN_Last(dossierId,
				fileTemplateNo, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", fileTemplateNo=");
		msg.append(fileTemplateNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_FTN_Last(long dossierId,
		String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByDID_FTN(dossierId, fileTemplateNo);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByDID_FTN(dossierId, fileTemplateNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByDID_FTN_PrevAndNext(long dossierFileId,
		long dossierId, String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByDID_FTN_PrevAndNext(session, vrDossierFile,
					dossierId, fileTemplateNo, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByDID_FTN_PrevAndNext(session, vrDossierFile,
					dossierId, fileTemplateNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossierFile getByDID_FTN_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, long dossierId, String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_DID_FTN_DOSSIERID_2);

		boolean bindFileTemplateNo = false;

		if (fileTemplateNo == null) {
			query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_1);
		}
		else if (fileTemplateNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_3);
		}
		else {
			bindFileTemplateNo = true;

			query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_2);
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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindFileTemplateNo) {
			qPos.add(fileTemplateNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 */
	@Override
	public void removeByDID_FTN(long dossierId, String fileTemplateNo) {
		for (VRDossierFile vrDossierFile : findByDID_FTN(dossierId,
				fileTemplateNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDID_FTN(long dossierId, String fileTemplateNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DID_FTN;

		Object[] finderArgs = new Object[] { dossierId, fileTemplateNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_FTN_DOSSIERID_2);

			boolean bindFileTemplateNo = false;

			if (fileTemplateNo == null) {
				query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_1);
			}
			else if (fileTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_3);
			}
			else {
				bindFileTemplateNo = true;

				query.append(_FINDER_COLUMN_DID_FTN_FILETEMPLATENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindFileTemplateNo) {
					qPos.add(fileTemplateNo);
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

	private static final String _FINDER_COLUMN_DID_FTN_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTN_FILETEMPLATENO_1 = "vrDossierFile.fileTemplateNo IS NULL";
	private static final String _FINDER_COLUMN_DID_FTN_FILETEMPLATENO_2 = "vrDossierFile.fileTemplateNo = ?";
	private static final String _FINDER_COLUMN_DID_FTN_FILETEMPLATENO_3 = "(vrDossierFile.fileTemplateNo IS NULL OR vrDossierFile.fileTemplateNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_ = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDID_",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_ = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDID_", new String[] { Long.class.getName() },
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DID_ = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDID_",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr dossier files where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_(long dossierId) {
		return findByDID_(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_(long dossierId, int start, int end) {
		return findByDID_(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_(long dossierId, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findByDID_(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_(long dossierId, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID__DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID__First(long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID__First(dossierId,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID__First(long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByDID_(dossierId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID__Last(long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID__Last(dossierId,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID__Last(long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByDID_(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByDID_(dossierId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByDID__PrevAndNext(long dossierFileId,
		long dossierId, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByDID__PrevAndNext(session, vrDossierFile, dossierId,
					orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByDID__PrevAndNext(session, vrDossierFile, dossierId,
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

	protected VRDossierFile getByDID__PrevAndNext(Session session,
		VRDossierFile vrDossierFile, long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_DID__DOSSIERID_2);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeByDID_(long dossierId) {
		for (VRDossierFile vrDossierFile : findByDID_(dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDID_(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DID_;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID__DOSSIERID_2);

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

	private static final String _FINDER_COLUMN_DID__DOSSIERID_2 = "vrDossierFile.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDossierId",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierId",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.REMOVED_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the vr dossier files where dossierId = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDossierId(long dossierId, boolean removed) {
		return findByDossierId(dossierId, removed, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDossierId(long dossierId, boolean removed,
		int start, int end) {
		return findByDossierId(dossierId, removed, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDossierId(long dossierId, boolean removed,
		int start, int end, OrderByComparator<VRDossierFile> orderByComparator) {
		return findByDossierId(dossierId, removed, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDossierId(long dossierId, boolean removed,
		int start, int end, OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId, removed };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] {
					dossierId, removed,
					
					start, end, orderByComparator
				};
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId()) ||
							(removed != vrDossierFile.getRemoved())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(removed);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDossierId_First(long dossierId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDossierId_First(dossierId,
				removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDossierId_First(long dossierId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByDossierId(dossierId, removed, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDossierId_Last(long dossierId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDossierId_Last(dossierId, removed,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDossierId_Last(long dossierId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByDossierId(dossierId, removed);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByDossierId(dossierId, removed,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByDossierId_PrevAndNext(long dossierFileId,
		long dossierId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByDossierId_PrevAndNext(session, vrDossierFile,
					dossierId, removed, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByDossierId_PrevAndNext(session, vrDossierFile,
					dossierId, removed, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossierFile getByDossierId_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, long dossierId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DOSSIERID_REMOVED_2);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 */
	@Override
	public void removeByDossierId(long dossierId, boolean removed) {
		for (VRDossierFile vrDossierFile : findByDossierId(dossierId, removed,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param removed the removed
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDossierId(long dossierId, boolean removed) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, removed };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_REMOVED_2 = "vrDossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_DPT = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByD_DPT",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DPT = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByD_DPT",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Boolean.class.getName()
			},
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTTYPE_COLUMN_BITMASK |
			VRDossierFileModelImpl.REMOVED_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_DPT = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_DPT",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByD_DPT(long dossierId, int dossierPartType,
		boolean removed) {
		return findByD_DPT(dossierId, dossierPartType, removed,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByD_DPT(long dossierId, int dossierPartType,
		boolean removed, int start, int end) {
		return findByD_DPT(dossierId, dossierPartType, removed, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByD_DPT(long dossierId, int dossierPartType,
		boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findByD_DPT(dossierId, dossierPartType, removed, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByD_DPT(long dossierId, int dossierPartType,
		boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DPT;
			finderArgs = new Object[] { dossierId, dossierPartType, removed };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_DPT;
			finderArgs = new Object[] {
					dossierId, dossierPartType, removed,
					
					start, end, orderByComparator
				};
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId()) ||
							(dossierPartType != vrDossierFile.getDossierPartType()) ||
							(removed != vrDossierFile.getRemoved())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_DPT_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_DPT_DOSSIERPARTTYPE_2);

			query.append(_FINDER_COLUMN_D_DPT_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartType);

				qPos.add(removed);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByD_DPT_First(long dossierId, int dossierPartType,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByD_DPT_First(dossierId,
				dossierPartType, removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", dossierPartType=");
		msg.append(dossierPartType);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByD_DPT_First(long dossierId,
		int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByD_DPT(dossierId, dossierPartType,
				removed, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByD_DPT_Last(long dossierId, int dossierPartType,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByD_DPT_Last(dossierId,
				dossierPartType, removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", dossierPartType=");
		msg.append(dossierPartType);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByD_DPT_Last(long dossierId, int dossierPartType,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByD_DPT(dossierId, dossierPartType, removed);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByD_DPT(dossierId, dossierPartType,
				removed, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByD_DPT_PrevAndNext(long dossierFileId,
		long dossierId, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByD_DPT_PrevAndNext(session, vrDossierFile,
					dossierId, dossierPartType, removed, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByD_DPT_PrevAndNext(session, vrDossierFile,
					dossierId, dossierPartType, removed, orderByComparator,
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

	protected VRDossierFile getByD_DPT_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, long dossierId, int dossierPartType,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator,
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

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_D_DPT_DOSSIERID_2);

		query.append(_FINDER_COLUMN_D_DPT_DOSSIERPARTTYPE_2);

		query.append(_FINDER_COLUMN_D_DPT_REMOVED_2);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(dossierPartType);

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 */
	@Override
	public void removeByD_DPT(long dossierId, int dossierPartType,
		boolean removed) {
		for (VRDossierFile vrDossierFile : findByD_DPT(dossierId,
				dossierPartType, removed, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByD_DPT(long dossierId, int dossierPartType, boolean removed) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_DPT;

		Object[] finderArgs = new Object[] { dossierId, dossierPartType, removed };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_DPT_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_DPT_DOSSIERPARTTYPE_2);

			query.append(_FINDER_COLUMN_D_DPT_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartType);

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_D_DPT_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_DPT_DOSSIERPARTTYPE_2 = "vrDossierFile.dossierPartType = ? AND ";
	private static final String _FINDER_COLUMN_D_DPT_REMOVED_2 = "vrDossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_D_RUID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByD_RUID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRDossierFileModelImpl.REMOVED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_RUID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_RUID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @param removed the removed
	 * @return the matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByD_RUID(long dossierId, String referenceUid,
		boolean removed) throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByD_RUID(dossierId, referenceUid,
				removed);

		if (vrDossierFile == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", referenceUid=");
			msg.append(referenceUid);

			msg.append(", removed=");
			msg.append(removed);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRDossierFileException(msg.toString());
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @param removed the removed
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByD_RUID(long dossierId, String referenceUid,
		boolean removed) {
		return fetchByD_RUID(dossierId, referenceUid, removed, true);
	}

	/**
	 * Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @param removed the removed
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByD_RUID(long dossierId, String referenceUid,
		boolean removed, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierId, referenceUid, removed };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_D_RUID,
					finderArgs, this);
		}

		if (result instanceof VRDossierFile) {
			VRDossierFile vrDossierFile = (VRDossierFile)result;

			if ((dossierId != vrDossierFile.getDossierId()) ||
					!Objects.equals(referenceUid,
						vrDossierFile.getReferenceUid()) ||
					(removed != vrDossierFile.getRemoved())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_RUID_DOSSIERID_2);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_D_RUID_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_RUID_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_D_RUID_REFERENCEUID_2);
			}

			query.append(_FINDER_COLUMN_D_RUID_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
				}

				qPos.add(removed);

				List<VRDossierFile> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_D_RUID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRDossierFilePersistenceImpl.fetchByD_RUID(long, String, boolean, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRDossierFile vrDossierFile = list.get(0);

					result = vrDossierFile;

					cacheResult(vrDossierFile);

					if ((vrDossierFile.getDossierId() != dossierId) ||
							(vrDossierFile.getReferenceUid() == null) ||
							!vrDossierFile.getReferenceUid().equals(referenceUid) ||
							(vrDossierFile.getRemoved() != removed)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_D_RUID,
							finderArgs, vrDossierFile);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_D_RUID, finderArgs);

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
			return (VRDossierFile)result;
		}
	}

	/**
	 * Removes the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @param removed the removed
	 * @return the vr dossier file that was removed
	 */
	@Override
	public VRDossierFile removeByD_RUID(long dossierId, String referenceUid,
		boolean removed) throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByD_RUID(dossierId, referenceUid,
				removed);

		return remove(vrDossierFile);
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and referenceUid = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @param removed the removed
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByD_RUID(long dossierId, String referenceUid,
		boolean removed) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_RUID;

		Object[] finderArgs = new Object[] { dossierId, referenceUid, removed };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_RUID_DOSSIERID_2);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_D_RUID_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_RUID_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_D_RUID_REFERENCEUID_2);
			}

			query.append(_FINDER_COLUMN_D_RUID_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
				}

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_D_RUID_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_RUID_REFERENCEUID_1 = "vrDossierFile.referenceUid IS NULL AND ";
	private static final String _FINDER_COLUMN_D_RUID_REFERENCEUID_2 = "vrDossierFile.referenceUid = ? AND ";
	private static final String _FINDER_COLUMN_D_RUID_REFERENCEUID_3 = "(vrDossierFile.referenceUid IS NULL OR vrDossierFile.referenceUid = '') AND ";
	private static final String _FINDER_COLUMN_D_RUID_REMOVED_2 = "vrDossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DID_REF = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDID_REF",
			new String[] { Long.class.getName(), String.class.getName() },
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.REFERENCEUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DID_REF = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDID_REF",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @return the matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_REF(long dossierId, String referenceUid)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_REF(dossierId, referenceUid);

		if (vrDossierFile == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", referenceUid=");
			msg.append(referenceUid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRDossierFileException(msg.toString());
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_REF(long dossierId, String referenceUid) {
		return fetchByDID_REF(dossierId, referenceUid, true);
	}

	/**
	 * Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_REF(long dossierId, String referenceUid,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierId, referenceUid };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_DID_REF,
					finderArgs, this);
		}

		if (result instanceof VRDossierFile) {
			VRDossierFile vrDossierFile = (VRDossierFile)result;

			if ((dossierId != vrDossierFile.getDossierId()) ||
					!Objects.equals(referenceUid,
						vrDossierFile.getReferenceUid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_REF_DOSSIERID_2);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_DID_REF_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_REF_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_DID_REF_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
				}

				List<VRDossierFile> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_DID_REF,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRDossierFilePersistenceImpl.fetchByDID_REF(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRDossierFile vrDossierFile = list.get(0);

					result = vrDossierFile;

					cacheResult(vrDossierFile);

					if ((vrDossierFile.getDossierId() != dossierId) ||
							(vrDossierFile.getReferenceUid() == null) ||
							!vrDossierFile.getReferenceUid().equals(referenceUid)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_DID_REF,
							finderArgs, vrDossierFile);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_DID_REF,
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
			return (VRDossierFile)result;
		}
	}

	/**
	 * Removes the vr dossier file where dossierId = &#63; and referenceUid = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @return the vr dossier file that was removed
	 */
	@Override
	public VRDossierFile removeByDID_REF(long dossierId, String referenceUid)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByDID_REF(dossierId, referenceUid);

		return remove(vrDossierFile);
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and referenceUid = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param referenceUid the reference uid
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDID_REF(long dossierId, String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DID_REF;

		Object[] finderArgs = new Object[] { dossierId, referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_REF_DOSSIERID_2);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_DID_REF_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_REF_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_DID_REF_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
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

	private static final String _FINDER_COLUMN_DID_REF_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DID_REF_REFERENCEUID_1 = "vrDossierFile.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_DID_REF_REFERENCEUID_2 = "vrDossierFile.referenceUid = ?";
	private static final String _FINDER_COLUMN_DID_REF_REFERENCEUID_3 = "(vrDossierFile.referenceUid IS NULL OR vrDossierFile.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_ISN = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDID_ISN",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_ISN =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDID_ISN",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			},
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.ISNEW_COLUMN_BITMASK |
			VRDossierFileModelImpl.REMOVED_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DID_ISN = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDID_ISN",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_ISN(long dossierId, boolean isNew,
		boolean removed) {
		return findByDID_ISN(dossierId, isNew, removed, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_ISN(long dossierId, boolean isNew,
		boolean removed, int start, int end) {
		return findByDID_ISN(dossierId, isNew, removed, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_ISN(long dossierId, boolean isNew,
		boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findByDID_ISN(dossierId, isNew, removed, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_ISN(long dossierId, boolean isNew,
		boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_ISN;
			finderArgs = new Object[] { dossierId, isNew, removed };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_ISN;
			finderArgs = new Object[] {
					dossierId, isNew, removed,
					
					start, end, orderByComparator
				};
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId()) ||
							(isNew != vrDossierFile.getIsNew()) ||
							(removed != vrDossierFile.getRemoved())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_ISN_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DID_ISN_ISNEW_2);

			query.append(_FINDER_COLUMN_DID_ISN_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(isNew);

				qPos.add(removed);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_ISN_First(long dossierId, boolean isNew,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_ISN_First(dossierId, isNew,
				removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", isNew=");
		msg.append(isNew);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_ISN_First(long dossierId, boolean isNew,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByDID_ISN(dossierId, isNew, removed, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_ISN_Last(long dossierId, boolean isNew,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_ISN_Last(dossierId, isNew,
				removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", isNew=");
		msg.append(isNew);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_ISN_Last(long dossierId, boolean isNew,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByDID_ISN(dossierId, isNew, removed);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByDID_ISN(dossierId, isNew, removed,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByDID_ISN_PrevAndNext(long dossierFileId,
		long dossierId, boolean isNew, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByDID_ISN_PrevAndNext(session, vrDossierFile,
					dossierId, isNew, removed, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByDID_ISN_PrevAndNext(session, vrDossierFile,
					dossierId, isNew, removed, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossierFile getByDID_ISN_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, long dossierId, boolean isNew,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator,
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

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_DID_ISN_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DID_ISN_ISNEW_2);

		query.append(_FINDER_COLUMN_DID_ISN_REMOVED_2);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(isNew);

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 */
	@Override
	public void removeByDID_ISN(long dossierId, boolean isNew, boolean removed) {
		for (VRDossierFile vrDossierFile : findByDID_ISN(dossierId, isNew,
				removed, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param isNew the is new
	 * @param removed the removed
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDID_ISN(long dossierId, boolean isNew, boolean removed) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DID_ISN;

		Object[] finderArgs = new Object[] { dossierId, isNew, removed };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_ISN_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DID_ISN_ISNEW_2);

			query.append(_FINDER_COLUMN_DID_ISN_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(isNew);

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_DID_ISN_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DID_ISN_ISNEW_2 = "vrDossierFile.isNew = ? AND ";
	private static final String _FINDER_COLUMN_DID_ISN_REMOVED_2 = "vrDossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_FTNO = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDID_FTNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDID_FTNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.FILETEMPLATENO_COLUMN_BITMASK |
			VRDossierFileModelImpl.REMOVED_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DID_FTNO = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDID_FTNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO(long dossierId,
		String fileTemplateNo, boolean removed) {
		return findByDID_FTNO(dossierId, fileTemplateNo, removed,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO(long dossierId,
		String fileTemplateNo, boolean removed, int start, int end) {
		return findByDID_FTNO(dossierId, fileTemplateNo, removed, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO(long dossierId,
		String fileTemplateNo, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findByDID_FTNO(dossierId, fileTemplateNo, removed, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO(long dossierId,
		String fileTemplateNo, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO;
			finderArgs = new Object[] { dossierId, fileTemplateNo, removed };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_FTNO;
			finderArgs = new Object[] {
					dossierId, fileTemplateNo, removed,
					
					start, end, orderByComparator
				};
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId()) ||
							!Objects.equals(fileTemplateNo,
								vrDossierFile.getFileTemplateNo()) ||
							(removed != vrDossierFile.getRemoved())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_FTNO_DOSSIERID_2);

			boolean bindFileTemplateNo = false;

			if (fileTemplateNo == null) {
				query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_1);
			}
			else if (fileTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_3);
			}
			else {
				bindFileTemplateNo = true;

				query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_2);
			}

			query.append(_FINDER_COLUMN_DID_FTNO_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindFileTemplateNo) {
					qPos.add(fileTemplateNo);
				}

				qPos.add(removed);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_FTNO_First(long dossierId,
		String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_FTNO_First(dossierId,
				fileTemplateNo, removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", fileTemplateNo=");
		msg.append(fileTemplateNo);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_FTNO_First(long dossierId,
		String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByDID_FTNO(dossierId, fileTemplateNo,
				removed, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_FTNO_Last(long dossierId,
		String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_FTNO_Last(dossierId,
				fileTemplateNo, removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", fileTemplateNo=");
		msg.append(fileTemplateNo);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_FTNO_Last(long dossierId,
		String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByDID_FTNO(dossierId, fileTemplateNo, removed);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByDID_FTNO(dossierId, fileTemplateNo,
				removed, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByDID_FTNO_PrevAndNext(long dossierFileId,
		long dossierId, String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByDID_FTNO_PrevAndNext(session, vrDossierFile,
					dossierId, fileTemplateNo, removed, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByDID_FTNO_PrevAndNext(session, vrDossierFile,
					dossierId, fileTemplateNo, removed, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossierFile getByDID_FTNO_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, long dossierId, String fileTemplateNo,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator,
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

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_DID_FTNO_DOSSIERID_2);

		boolean bindFileTemplateNo = false;

		if (fileTemplateNo == null) {
			query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_1);
		}
		else if (fileTemplateNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_3);
		}
		else {
			bindFileTemplateNo = true;

			query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_2);
		}

		query.append(_FINDER_COLUMN_DID_FTNO_REMOVED_2);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindFileTemplateNo) {
			qPos.add(fileTemplateNo);
		}

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 */
	@Override
	public void removeByDID_FTNO(long dossierId, String fileTemplateNo,
		boolean removed) {
		for (VRDossierFile vrDossierFile : findByDID_FTNO(dossierId,
				fileTemplateNo, removed, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param removed the removed
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDID_FTNO(long dossierId, String fileTemplateNo,
		boolean removed) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DID_FTNO;

		Object[] finderArgs = new Object[] { dossierId, fileTemplateNo, removed };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_FTNO_DOSSIERID_2);

			boolean bindFileTemplateNo = false;

			if (fileTemplateNo == null) {
				query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_1);
			}
			else if (fileTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_3);
			}
			else {
				bindFileTemplateNo = true;

				query.append(_FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_2);
			}

			query.append(_FINDER_COLUMN_DID_FTNO_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindFileTemplateNo) {
					qPos.add(fileTemplateNo);
				}

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_DID_FTNO_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_1 = "vrDossierFile.fileTemplateNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_2 = "vrDossierFile.fileTemplateNo = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_FILETEMPLATENO_3 = "(vrDossierFile.fileTemplateNo IS NULL OR vrDossierFile.fileTemplateNo = '') AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_REMOVED_2 = "vrDossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_DPNO = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDID_DPNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_DPNO =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDID_DPNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK |
			VRDossierFileModelImpl.REMOVED_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DID_DPNO = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDID_DPNO",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_DPNO(long dossierId,
		String dossierPartNo, boolean removed) {
		return findByDID_DPNO(dossierId, dossierPartNo, removed,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_DPNO(long dossierId,
		String dossierPartNo, boolean removed, int start, int end) {
		return findByDID_DPNO(dossierId, dossierPartNo, removed, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_DPNO(long dossierId,
		String dossierPartNo, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findByDID_DPNO(dossierId, dossierPartNo, removed, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_DPNO(long dossierId,
		String dossierPartNo, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_DPNO;
			finderArgs = new Object[] { dossierId, dossierPartNo, removed };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_DPNO;
			finderArgs = new Object[] {
					dossierId, dossierPartNo, removed,
					
					start, end, orderByComparator
				};
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId()) ||
							!Objects.equals(dossierPartNo,
								vrDossierFile.getDossierPartNo()) ||
							(removed != vrDossierFile.getRemoved())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERID_2);

			boolean bindDossierPartNo = false;

			if (dossierPartNo == null) {
				query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_1);
			}
			else if (dossierPartNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_3);
			}
			else {
				bindDossierPartNo = true;

				query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_2);
			}

			query.append(_FINDER_COLUMN_DID_DPNO_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindDossierPartNo) {
					qPos.add(dossierPartNo);
				}

				qPos.add(removed);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_DPNO_First(long dossierId,
		String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_DPNO_First(dossierId,
				dossierPartNo, removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", dossierPartNo=");
		msg.append(dossierPartNo);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_DPNO_First(long dossierId,
		String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByDID_DPNO(dossierId, dossierPartNo,
				removed, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_DPNO_Last(long dossierId,
		String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_DPNO_Last(dossierId,
				dossierPartNo, removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", dossierPartNo=");
		msg.append(dossierPartNo);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_DPNO_Last(long dossierId,
		String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByDID_DPNO(dossierId, dossierPartNo, removed);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByDID_DPNO(dossierId, dossierPartNo,
				removed, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByDID_DPNO_PrevAndNext(long dossierFileId,
		long dossierId, String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByDID_DPNO_PrevAndNext(session, vrDossierFile,
					dossierId, dossierPartNo, removed, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByDID_DPNO_PrevAndNext(session, vrDossierFile,
					dossierId, dossierPartNo, removed, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossierFile getByDID_DPNO_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, long dossierId, String dossierPartNo,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator,
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

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERID_2);

		boolean bindDossierPartNo = false;

		if (dossierPartNo == null) {
			query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_1);
		}
		else if (dossierPartNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_3);
		}
		else {
			bindDossierPartNo = true;

			query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_2);
		}

		query.append(_FINDER_COLUMN_DID_DPNO_REMOVED_2);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindDossierPartNo) {
			qPos.add(dossierPartNo);
		}

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 */
	@Override
	public void removeByDID_DPNO(long dossierId, String dossierPartNo,
		boolean removed) {
		for (VRDossierFile vrDossierFile : findByDID_DPNO(dossierId,
				dossierPartNo, removed, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartNo the dossier part no
	 * @param removed the removed
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDID_DPNO(long dossierId, String dossierPartNo,
		boolean removed) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DID_DPNO;

		Object[] finderArgs = new Object[] { dossierId, dossierPartNo, removed };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERID_2);

			boolean bindDossierPartNo = false;

			if (dossierPartNo == null) {
				query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_1);
			}
			else if (dossierPartNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_3);
			}
			else {
				bindDossierPartNo = true;

				query.append(_FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_2);
			}

			query.append(_FINDER_COLUMN_DID_DPNO_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindDossierPartNo) {
					qPos.add(dossierPartNo);
				}

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_DID_DPNO_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_1 = "vrDossierFile.dossierPartNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_2 = "vrDossierFile.dossierPartNo = ? AND ";
	private static final String _FINDER_COLUMN_DID_DPNO_DOSSIERPARTNO_3 = "(vrDossierFile.dossierPartNo IS NULL OR vrDossierFile.dossierPartNo = '') AND ";
	private static final String _FINDER_COLUMN_DID_DPNO_REMOVED_2 = "vrDossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_FTNO_DPT =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDID_FTNO_DPT",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO_DPT =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDID_FTNO_DPT",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Boolean.class.getName()
			},
			VRDossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRDossierFileModelImpl.FILETEMPLATENO_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTTYPE_COLUMN_BITMASK |
			VRDossierFileModelImpl.REMOVED_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DID_FTNO_DPT = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDID_FTNO_DPT",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		String fileTemplateNo, int dossierPartType, boolean removed) {
		return findByDID_FTNO_DPT(dossierId, fileTemplateNo, dossierPartType,
			removed, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		String fileTemplateNo, int dossierPartType, boolean removed, int start,
		int end) {
		return findByDID_FTNO_DPT(dossierId, fileTemplateNo, dossierPartType,
			removed, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		String fileTemplateNo, int dossierPartType, boolean removed, int start,
		int end, OrderByComparator<VRDossierFile> orderByComparator) {
		return findByDID_FTNO_DPT(dossierId, fileTemplateNo, dossierPartType,
			removed, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		String fileTemplateNo, int dossierPartType, boolean removed, int start,
		int end, OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO_DPT;
			finderArgs = new Object[] {
					dossierId, fileTemplateNo, dossierPartType, removed
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_FTNO_DPT;
			finderArgs = new Object[] {
					dossierId, fileTemplateNo, dossierPartType, removed,
					
					start, end, orderByComparator
				};
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId()) ||
							!Objects.equals(fileTemplateNo,
								vrDossierFile.getFileTemplateNo()) ||
							(dossierPartType != vrDossierFile.getDossierPartType()) ||
							(removed != vrDossierFile.getRemoved())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_DOSSIERID_2);

			boolean bindFileTemplateNo = false;

			if (fileTemplateNo == null) {
				query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_1);
			}
			else if (fileTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_3);
			}
			else {
				bindFileTemplateNo = true;

				query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_2);
			}

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_DOSSIERPARTTYPE_2);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindFileTemplateNo) {
					qPos.add(fileTemplateNo);
				}

				qPos.add(dossierPartType);

				qPos.add(removed);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_FTNO_DPT_First(long dossierId,
		String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_FTNO_DPT_First(dossierId,
				fileTemplateNo, dossierPartType, removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", fileTemplateNo=");
		msg.append(fileTemplateNo);

		msg.append(", dossierPartType=");
		msg.append(dossierPartType);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_FTNO_DPT_First(long dossierId,
		String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByDID_FTNO_DPT(dossierId,
				fileTemplateNo, dossierPartType, removed, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_FTNO_DPT_Last(long dossierId,
		String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_FTNO_DPT_Last(dossierId,
				fileTemplateNo, dossierPartType, removed, orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", fileTemplateNo=");
		msg.append(fileTemplateNo);

		msg.append(", dossierPartType=");
		msg.append(dossierPartType);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_FTNO_DPT_Last(long dossierId,
		String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByDID_FTNO_DPT(dossierId, fileTemplateNo,
				dossierPartType, removed);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByDID_FTNO_DPT(dossierId,
				fileTemplateNo, dossierPartType, removed, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByDID_FTNO_DPT_PrevAndNext(long dossierFileId,
		long dossierId, String fileTemplateNo, int dossierPartType,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByDID_FTNO_DPT_PrevAndNext(session, vrDossierFile,
					dossierId, fileTemplateNo, dossierPartType, removed,
					orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByDID_FTNO_DPT_PrevAndNext(session, vrDossierFile,
					dossierId, fileTemplateNo, dossierPartType, removed,
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

	protected VRDossierFile getByDID_FTNO_DPT_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, long dossierId, String fileTemplateNo,
		int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_DID_FTNO_DPT_DOSSIERID_2);

		boolean bindFileTemplateNo = false;

		if (fileTemplateNo == null) {
			query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_1);
		}
		else if (fileTemplateNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_3);
		}
		else {
			bindFileTemplateNo = true;

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_2);
		}

		query.append(_FINDER_COLUMN_DID_FTNO_DPT_DOSSIERPARTTYPE_2);

		query.append(_FINDER_COLUMN_DID_FTNO_DPT_REMOVED_2);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindFileTemplateNo) {
			qPos.add(fileTemplateNo);
		}

		qPos.add(dossierPartType);

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 */
	@Override
	public void removeByDID_FTNO_DPT(long dossierId, String fileTemplateNo,
		int dossierPartType, boolean removed) {
		for (VRDossierFile vrDossierFile : findByDID_FTNO_DPT(dossierId,
				fileTemplateNo, dossierPartType, removed, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param removed the removed
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDID_FTNO_DPT(long dossierId, String fileTemplateNo,
		int dossierPartType, boolean removed) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DID_FTNO_DPT;

		Object[] finderArgs = new Object[] {
				dossierId, fileTemplateNo, dossierPartType, removed
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_DOSSIERID_2);

			boolean bindFileTemplateNo = false;

			if (fileTemplateNo == null) {
				query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_1);
			}
			else if (fileTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_3);
			}
			else {
				bindFileTemplateNo = true;

				query.append(_FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_2);
			}

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_DOSSIERPARTTYPE_2);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindFileTemplateNo) {
					qPos.add(fileTemplateNo);
				}

				qPos.add(dossierPartType);

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_DID_FTNO_DPT_DOSSIERID_2 = "vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_1 = "vrDossierFile.fileTemplateNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_2 = "vrDossierFile.fileTemplateNo = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_FILETEMPLATENO_3 = "(vrDossierFile.fileTemplateNo IS NULL OR vrDossierFile.fileTemplateNo = '') AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_DOSSIERPARTTYPE_2 = "vrDossierFile.dossierPartType = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_REMOVED_2 = "vrDossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_FTNO_DPT_NOT_NULL_FID =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDID_FTNO_DPT_NOT_NULL_FID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Long.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_DID_FTNO_DPT_NOT_NULL_FID =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByDID_FTNO_DPT_NOT_NULL_FID",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed) {
		return findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed, int start, int end) {
		return findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DID_FTNO_DPT_NOT_NULL_FID;
		finderArgs = new Object[] {
				dossierId, fileTemplateNo, dossierPartType, fileEntryId, removed,
				
				start, end, orderByComparator
			};

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if ((dossierId != vrDossierFile.getDossierId()) ||
							!Objects.equals(fileTemplateNo,
								vrDossierFile.getFileTemplateNo()) ||
							(dossierPartType != vrDossierFile.getDossierPartType()) ||
							(fileEntryId >= vrDossierFile.getFileEntryId()) ||
							(removed != vrDossierFile.getRemoved())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_DOSSIERID_2);

			boolean bindFileTemplateNo = false;

			if (fileTemplateNo == null) {
				query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_1);
			}
			else if (fileTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_3);
			}
			else {
				bindFileTemplateNo = true;

				query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_2);
			}

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_DOSSIERPARTTYPE_2);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILEENTRYID_2);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindFileTemplateNo) {
					qPos.add(fileTemplateNo);
				}

				qPos.add(dossierPartType);

				qPos.add(fileEntryId);

				qPos.add(removed);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_FTNO_DPT_NOT_NULL_FID_First(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_FTNO_DPT_NOT_NULL_FID_First(dossierId,
				fileTemplateNo, dossierPartType, fileEntryId, removed,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", fileTemplateNo=");
		msg.append(fileTemplateNo);

		msg.append(", dossierPartType=");
		msg.append(dossierPartType);

		msg.append(", fileEntryId=");
		msg.append(fileEntryId);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_FTNO_DPT_NOT_NULL_FID_First(
		long dossierId, String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByDID_FTNO_DPT_NOT_NULL_FID(dossierId,
				fileTemplateNo, dossierPartType, fileEntryId, removed, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDID_FTNO_DPT_NOT_NULL_FID_Last(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDID_FTNO_DPT_NOT_NULL_FID_Last(dossierId,
				fileTemplateNo, dossierPartType, fileEntryId, removed,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", fileTemplateNo=");
		msg.append(fileTemplateNo);

		msg.append(", dossierPartType=");
		msg.append(dossierPartType);

		msg.append(", fileEntryId=");
		msg.append(fileEntryId);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDID_FTNO_DPT_NOT_NULL_FID_Last(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
				dossierPartType, fileEntryId, removed);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByDID_FTNO_DPT_NOT_NULL_FID(dossierId,
				fileTemplateNo, dossierPartType, fileEntryId, removed,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByDID_FTNO_DPT_NOT_NULL_FID_PrevAndNext(
		long dossierFileId, long dossierId, String fileTemplateNo,
		int dossierPartType, long fileEntryId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByDID_FTNO_DPT_NOT_NULL_FID_PrevAndNext(session,
					vrDossierFile, dossierId, fileTemplateNo, dossierPartType,
					fileEntryId, removed, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByDID_FTNO_DPT_NOT_NULL_FID_PrevAndNext(session,
					vrDossierFile, dossierId, fileTemplateNo, dossierPartType,
					fileEntryId, removed, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossierFile getByDID_FTNO_DPT_NOT_NULL_FID_PrevAndNext(
		Session session, VRDossierFile vrDossierFile, long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(8 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(7);
		}

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_DOSSIERID_2);

		boolean bindFileTemplateNo = false;

		if (fileTemplateNo == null) {
			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_1);
		}
		else if (fileTemplateNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_3);
		}
		else {
			bindFileTemplateNo = true;

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_2);
		}

		query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_DOSSIERPARTTYPE_2);

		query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILEENTRYID_2);

		query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_REMOVED_2);

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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindFileTemplateNo) {
			qPos.add(fileTemplateNo);
		}

		qPos.add(dossierPartType);

		qPos.add(fileEntryId);

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 */
	@Override
	public void removeByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed) {
		for (VRDossierFile vrDossierFile : findByDID_FTNO_DPT_NOT_NULL_FID(
				dossierId, fileTemplateNo, dossierPartType, fileEntryId,
				removed, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileTemplateNo the file template no
	 * @param dossierPartType the dossier part type
	 * @param fileEntryId the file entry ID
	 * @param removed the removed
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_DID_FTNO_DPT_NOT_NULL_FID;

		Object[] finderArgs = new Object[] {
				dossierId, fileTemplateNo, dossierPartType, fileEntryId, removed
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_DOSSIERID_2);

			boolean bindFileTemplateNo = false;

			if (fileTemplateNo == null) {
				query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_1);
			}
			else if (fileTemplateNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_3);
			}
			else {
				bindFileTemplateNo = true;

				query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_2);
			}

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_DOSSIERPARTTYPE_2);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILEENTRYID_2);

			query.append(_FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindFileTemplateNo) {
					qPos.add(fileTemplateNo);
				}

				qPos.add(dossierPartType);

				qPos.add(fileEntryId);

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_DOSSIERID_2 =
		"vrDossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_1 =
		"vrDossierFile.fileTemplateNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_2 =
		"vrDossierFile.fileTemplateNo = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILETEMPLATENO_3 =
		"(vrDossierFile.fileTemplateNo IS NULL OR vrDossierFile.fileTemplateNo = '') AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_DOSSIERPARTTYPE_2 =
		"vrDossierFile.dossierPartType = ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_FILEENTRYID_2 =
		"vrDossierFile.fileEntryId > ? AND ";
	private static final String _FINDER_COLUMN_DID_FTNO_DPT_NOT_NULL_FID_REMOVED_2 =
		"vrDossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DE_CODE = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDE_CODE", new String[] { String.class.getName() },
			VRDossierFileModelImpl.DELIVERABLECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DE_CODE = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDE_CODE",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr dossier file where deliverableCode = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDE_CODE(String deliverableCode)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDE_CODE(deliverableCode);

		if (vrDossierFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("deliverableCode=");
			msg.append(deliverableCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRDossierFileException(msg.toString());
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file where deliverableCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDE_CODE(String deliverableCode) {
		return fetchByDE_CODE(deliverableCode, true);
	}

	/**
	 * Returns the vr dossier file where deliverableCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param deliverableCode the deliverable code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDE_CODE(String deliverableCode,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { deliverableCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_DE_CODE,
					finderArgs, this);
		}

		if (result instanceof VRDossierFile) {
			VRDossierFile vrDossierFile = (VRDossierFile)result;

			if (!Objects.equals(deliverableCode,
						vrDossierFile.getDeliverableCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			boolean bindDeliverableCode = false;

			if (deliverableCode == null) {
				query.append(_FINDER_COLUMN_DE_CODE_DELIVERABLECODE_1);
			}
			else if (deliverableCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DE_CODE_DELIVERABLECODE_3);
			}
			else {
				bindDeliverableCode = true;

				query.append(_FINDER_COLUMN_DE_CODE_DELIVERABLECODE_2);
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

				List<VRDossierFile> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_DE_CODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRDossierFilePersistenceImpl.fetchByDE_CODE(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRDossierFile vrDossierFile = list.get(0);

					result = vrDossierFile;

					cacheResult(vrDossierFile);

					if ((vrDossierFile.getDeliverableCode() == null) ||
							!vrDossierFile.getDeliverableCode()
											  .equals(deliverableCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_DE_CODE,
							finderArgs, vrDossierFile);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_DE_CODE,
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
			return (VRDossierFile)result;
		}
	}

	/**
	 * Removes the vr dossier file where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the vr dossier file that was removed
	 */
	@Override
	public VRDossierFile removeByDE_CODE(String deliverableCode)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByDE_CODE(deliverableCode);

		return remove(vrDossierFile);
	}

	/**
	 * Returns the number of vr dossier files where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDE_CODE(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DE_CODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			boolean bindDeliverableCode = false;

			if (deliverableCode == null) {
				query.append(_FINDER_COLUMN_DE_CODE_DELIVERABLECODE_1);
			}
			else if (deliverableCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DE_CODE_DELIVERABLECODE_3);
			}
			else {
				bindDeliverableCode = true;

				query.append(_FINDER_COLUMN_DE_CODE_DELIVERABLECODE_2);
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

	private static final String _FINDER_COLUMN_DE_CODE_DELIVERABLECODE_1 = "vrDossierFile.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DE_CODE_DELIVERABLECODE_2 = "vrDossierFile.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DE_CODE_DELIVERABLECODE_3 = "(vrDossierFile.deliverableCode IS NULL OR vrDossierFile.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_GID_REF = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByGID_REF",
			new String[] { Long.class.getName(), String.class.getName() },
			VRDossierFileModelImpl.GROUPID_COLUMN_BITMASK |
			VRDossierFileModelImpl.REFERENCEUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GID_REF = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGID_REF",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @return the matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByGID_REF(long groupId, String referenceUid)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByGID_REF(groupId, referenceUid);

		if (vrDossierFile == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", referenceUid=");
			msg.append(referenceUid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRDossierFileException(msg.toString());
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByGID_REF(long groupId, String referenceUid) {
		return fetchByGID_REF(groupId, referenceUid, true);
	}

	/**
	 * Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByGID_REF(long groupId, String referenceUid,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, referenceUid };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_GID_REF,
					finderArgs, this);
		}

		if (result instanceof VRDossierFile) {
			VRDossierFile vrDossierFile = (VRDossierFile)result;

			if ((groupId != vrDossierFile.getGroupId()) ||
					!Objects.equals(referenceUid,
						vrDossierFile.getReferenceUid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_GID_REF_GROUPID_2);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_GID_REF_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GID_REF_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_GID_REF_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
				}

				List<VRDossierFile> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_GID_REF,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRDossierFilePersistenceImpl.fetchByGID_REF(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRDossierFile vrDossierFile = list.get(0);

					result = vrDossierFile;

					cacheResult(vrDossierFile);

					if ((vrDossierFile.getGroupId() != groupId) ||
							(vrDossierFile.getReferenceUid() == null) ||
							!vrDossierFile.getReferenceUid().equals(referenceUid)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_GID_REF,
							finderArgs, vrDossierFile);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_GID_REF,
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
			return (VRDossierFile)result;
		}
	}

	/**
	 * Removes the vr dossier file where groupId = &#63; and referenceUid = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @return the vr dossier file that was removed
	 */
	@Override
	public VRDossierFile removeByGID_REF(long groupId, String referenceUid)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByGID_REF(groupId, referenceUid);

		return remove(vrDossierFile);
	}

	/**
	 * Returns the number of vr dossier files where groupId = &#63; and referenceUid = &#63;.
	 *
	 * @param groupId the group ID
	 * @param referenceUid the reference uid
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByGID_REF(long groupId, String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GID_REF;

		Object[] finderArgs = new Object[] { groupId, referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_GID_REF_GROUPID_2);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_GID_REF_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GID_REF_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_GID_REF_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
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

	private static final String _FINDER_COLUMN_GID_REF_GROUPID_2 = "vrDossierFile.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GID_REF_REFERENCEUID_1 = "vrDossierFile.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_GID_REF_REFERENCEUID_2 = "vrDossierFile.referenceUid = ?";
	private static final String _FINDER_COLUMN_GID_REF_REFERENCEUID_3 = "(vrDossierFile.referenceUid IS NULL OR vrDossierFile.referenceUid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_FILE_ID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByFILE_ID", new String[] { Long.class.getName() },
			VRDossierFileModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILE_ID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFILE_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns the vr dossier file where fileEntryId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	 *
	 * @param fileEntryId the file entry ID
	 * @return the matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByFILE_ID(long fileEntryId)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByFILE_ID(fileEntryId);

		if (vrDossierFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fileEntryId=");
			msg.append(fileEntryId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRDossierFileException(msg.toString());
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file where fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fileEntryId the file entry ID
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByFILE_ID(long fileEntryId) {
		return fetchByFILE_ID(fileEntryId, true);
	}

	/**
	 * Returns the vr dossier file where fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fileEntryId the file entry ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByFILE_ID(long fileEntryId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { fileEntryId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_FILE_ID,
					finderArgs, this);
		}

		if (result instanceof VRDossierFile) {
			VRDossierFile vrDossierFile = (VRDossierFile)result;

			if ((fileEntryId != vrDossierFile.getFileEntryId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_FILE_ID_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileEntryId);

				List<VRDossierFile> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_FILE_ID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRDossierFilePersistenceImpl.fetchByFILE_ID(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRDossierFile vrDossierFile = list.get(0);

					result = vrDossierFile;

					cacheResult(vrDossierFile);

					if ((vrDossierFile.getFileEntryId() != fileEntryId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_FILE_ID,
							finderArgs, vrDossierFile);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_FILE_ID,
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
			return (VRDossierFile)result;
		}
	}

	/**
	 * Removes the vr dossier file where fileEntryId = &#63; from the database.
	 *
	 * @param fileEntryId the file entry ID
	 * @return the vr dossier file that was removed
	 */
	@Override
	public VRDossierFile removeByFILE_ID(long fileEntryId)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByFILE_ID(fileEntryId);

		return remove(vrDossierFile);
	}

	/**
	 * Returns the number of vr dossier files where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByFILE_ID(long fileEntryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FILE_ID;

		Object[] finderArgs = new Object[] { fileEntryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_FILE_ID_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileEntryId);

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

	private static final String _FINDER_COLUMN_FILE_ID_FILEENTRYID_2 = "vrDossierFile.fileEntryId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REF_UID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByREF_UID",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REF_UID =
		new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByREF_UID", new String[] { String.class.getName() },
			VRDossierFileModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRDossierFileModelImpl.MODIFIEDDATE_COLUMN_BITMASK |
			VRDossierFileModelImpl.DOSSIERPARTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REF_UID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByREF_UID",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr dossier files where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByREF_UID(String referenceUid) {
		return findByREF_UID(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByREF_UID(String referenceUid, int start,
		int end) {
		return findByREF_UID(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByREF_UID(String referenceUid, int start,
		int end, OrderByComparator<VRDossierFile> orderByComparator) {
		return findByREF_UID(referenceUid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr dossier files
	 */
	@Override
	public List<VRDossierFile> findByREF_UID(String referenceUid, int start,
		int end, OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REF_UID;
			finderArgs = new Object[] { referenceUid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REF_UID;
			finderArgs = new Object[] {
					referenceUid,
					
					start, end, orderByComparator
				};
		}

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRDossierFile vrDossierFile : list) {
					if (!Objects.equals(referenceUid,
								vrDossierFile.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
				}

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr dossier file in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByREF_UID_First(String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByREF_UID_First(referenceUid,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the first vr dossier file in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByREF_UID_First(String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator) {
		List<VRDossierFile> list = findByREF_UID(referenceUid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr dossier file in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByREF_UID_Last(String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByREF_UID_Last(referenceUid,
				orderByComparator);

		if (vrDossierFile != null) {
			return vrDossierFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRDossierFileException(msg.toString());
	}

	/**
	 * Returns the last vr dossier file in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByREF_UID_Last(String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator) {
		int count = countByREF_UID(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRDossierFile> list = findByREF_UID(referenceUid, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr dossier files before and after the current vr dossier file in the ordered set where referenceUid = &#63;.
	 *
	 * @param dossierFileId the primary key of the current vr dossier file
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile[] findByREF_UID_PrevAndNext(long dossierFileId,
		String referenceUid, OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			VRDossierFile[] array = new VRDossierFileImpl[3];

			array[0] = getByREF_UID_PrevAndNext(session, vrDossierFile,
					referenceUid, orderByComparator, true);

			array[1] = vrDossierFile;

			array[2] = getByREF_UID_PrevAndNext(session, vrDossierFile,
					referenceUid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRDossierFile getByREF_UID_PrevAndNext(Session session,
		VRDossierFile vrDossierFile, String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

		boolean bindReferenceUid = false;

		if (referenceUid == null) {
			query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_1);
		}
		else if (referenceUid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_3);
		}
		else {
			bindReferenceUid = true;

			query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_2);
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
			query.append(VRDossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindReferenceUid) {
			qPos.add(referenceUid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrDossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRDossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr dossier files where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByREF_UID(String referenceUid) {
		for (VRDossierFile vrDossierFile : findByREF_UID(referenceUid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByREF_UID(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REF_UID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_REF_UID_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
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

	private static final String _FINDER_COLUMN_REF_UID_REFERENCEUID_1 = "vrDossierFile.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REF_UID_REFERENCEUID_2 = "vrDossierFile.referenceUid = ?";
	private static final String _FINDER_COLUMN_REF_UID_REFERENCEUID_3 = "(vrDossierFile.referenceUid IS NULL OR vrDossierFile.referenceUid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOSSIERFILEID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED,
			VRDossierFileImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDossierFileId", new String[] { Long.class.getName() },
			VRDossierFileModelImpl.DOSSIERFILEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERFILEID = new FinderPath(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierFileId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the vr dossier file where dossierFileId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	 *
	 * @param dossierFileId the dossier file ID
	 * @return the matching vr dossier file
	 * @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile findByDossierFileId(long dossierFileId)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByDossierFileId(dossierFileId);

		if (vrDossierFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierFileId=");
			msg.append(dossierFileId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRDossierFileException(msg.toString());
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file where dossierFileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierFileId the dossier file ID
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDossierFileId(long dossierFileId) {
		return fetchByDossierFileId(dossierFileId, true);
	}

	/**
	 * Returns the vr dossier file where dossierFileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierFileId the dossier file ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	 */
	@Override
	public VRDossierFile fetchByDossierFileId(long dossierFileId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierFileId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_DOSSIERFILEID,
					finderArgs, this);
		}

		if (result instanceof VRDossierFile) {
			VRDossierFile vrDossierFile = (VRDossierFile)result;

			if ((dossierFileId != vrDossierFile.getDossierFileId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERFILEID_DOSSIERFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierFileId);

				List<VRDossierFile> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRDossierFilePersistenceImpl.fetchByDossierFileId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRDossierFile vrDossierFile = list.get(0);

					result = vrDossierFile;

					cacheResult(vrDossierFile);

					if ((vrDossierFile.getDossierFileId() != dossierFileId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEID,
							finderArgs, vrDossierFile);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEID,
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
			return (VRDossierFile)result;
		}
	}

	/**
	 * Removes the vr dossier file where dossierFileId = &#63; from the database.
	 *
	 * @param dossierFileId the dossier file ID
	 * @return the vr dossier file that was removed
	 */
	@Override
	public VRDossierFile removeByDossierFileId(long dossierFileId)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = findByDossierFileId(dossierFileId);

		return remove(vrDossierFile);
	}

	/**
	 * Returns the number of vr dossier files where dossierFileId = &#63;.
	 *
	 * @param dossierFileId the dossier file ID
	 * @return the number of matching vr dossier files
	 */
	@Override
	public int countByDossierFileId(long dossierFileId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERFILEID;

		Object[] finderArgs = new Object[] { dossierFileId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRDOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERFILEID_DOSSIERFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierFileId);

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

	private static final String _FINDER_COLUMN_DOSSIERFILEID_DOSSIERFILEID_2 = "vrDossierFile.dossierFileId = ?";

	public VRDossierFilePersistenceImpl() {
		setModelClass(VRDossierFile.class);
	}

	/**
	 * Caches the vr dossier file in the entity cache if it is enabled.
	 *
	 * @param vrDossierFile the vr dossier file
	 */
	@Override
	public void cacheResult(VRDossierFile vrDossierFile) {
		entityCache.putResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileImpl.class, vrDossierFile.getPrimaryKey(),
			vrDossierFile);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { vrDossierFile.getUuid(), vrDossierFile.getGroupId() },
			vrDossierFile);

		finderCache.putResult(FINDER_PATH_FETCH_BY_D_RUID,
			new Object[] {
				vrDossierFile.getDossierId(), vrDossierFile.getReferenceUid(),
				vrDossierFile.getRemoved()
			}, vrDossierFile);

		finderCache.putResult(FINDER_PATH_FETCH_BY_DID_REF,
			new Object[] {
				vrDossierFile.getDossierId(), vrDossierFile.getReferenceUid()
			}, vrDossierFile);

		finderCache.putResult(FINDER_PATH_FETCH_BY_DE_CODE,
			new Object[] { vrDossierFile.getDeliverableCode() }, vrDossierFile);

		finderCache.putResult(FINDER_PATH_FETCH_BY_GID_REF,
			new Object[] {
				vrDossierFile.getGroupId(), vrDossierFile.getReferenceUid()
			}, vrDossierFile);

		finderCache.putResult(FINDER_PATH_FETCH_BY_FILE_ID,
			new Object[] { vrDossierFile.getFileEntryId() }, vrDossierFile);

		finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEID,
			new Object[] { vrDossierFile.getDossierFileId() }, vrDossierFile);

		vrDossierFile.resetOriginalValues();
	}

	/**
	 * Caches the vr dossier files in the entity cache if it is enabled.
	 *
	 * @param vrDossierFiles the vr dossier files
	 */
	@Override
	public void cacheResult(List<VRDossierFile> vrDossierFiles) {
		for (VRDossierFile vrDossierFile : vrDossierFiles) {
			if (entityCache.getResult(
						VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
						VRDossierFileImpl.class, vrDossierFile.getPrimaryKey()) == null) {
				cacheResult(vrDossierFile);
			}
			else {
				vrDossierFile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr dossier files.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRDossierFileImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr dossier file.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRDossierFile vrDossierFile) {
		entityCache.removeResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileImpl.class, vrDossierFile.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRDossierFileModelImpl)vrDossierFile, true);
	}

	@Override
	public void clearCache(List<VRDossierFile> vrDossierFiles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRDossierFile vrDossierFile : vrDossierFiles) {
			entityCache.removeResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
				VRDossierFileImpl.class, vrDossierFile.getPrimaryKey());

			clearUniqueFindersCache((VRDossierFileModelImpl)vrDossierFile, true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRDossierFileModelImpl vrDossierFileModelImpl) {
		Object[] args = new Object[] {
				vrDossierFileModelImpl.getUuid(),
				vrDossierFileModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			vrDossierFileModelImpl, false);

		args = new Object[] {
				vrDossierFileModelImpl.getDossierId(),
				vrDossierFileModelImpl.getReferenceUid(),
				vrDossierFileModelImpl.getRemoved()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_D_RUID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_D_RUID, args,
			vrDossierFileModelImpl, false);

		args = new Object[] {
				vrDossierFileModelImpl.getDossierId(),
				vrDossierFileModelImpl.getReferenceUid()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_DID_REF, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_DID_REF, args,
			vrDossierFileModelImpl, false);

		args = new Object[] { vrDossierFileModelImpl.getDeliverableCode() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_DE_CODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_DE_CODE, args,
			vrDossierFileModelImpl, false);

		args = new Object[] {
				vrDossierFileModelImpl.getGroupId(),
				vrDossierFileModelImpl.getReferenceUid()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_GID_REF, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_GID_REF, args,
			vrDossierFileModelImpl, false);

		args = new Object[] { vrDossierFileModelImpl.getFileEntryId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_FILE_ID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_FILE_ID, args,
			vrDossierFileModelImpl, false);

		args = new Object[] { vrDossierFileModelImpl.getDossierFileId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_DOSSIERFILEID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEID, args,
			vrDossierFileModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRDossierFileModelImpl vrDossierFileModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getUuid(),
					vrDossierFileModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((vrDossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getOriginalUuid(),
					vrDossierFileModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getDossierId(),
					vrDossierFileModelImpl.getReferenceUid(),
					vrDossierFileModelImpl.getRemoved()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_D_RUID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_D_RUID, args);
		}

		if ((vrDossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_D_RUID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getOriginalDossierId(),
					vrDossierFileModelImpl.getOriginalReferenceUid(),
					vrDossierFileModelImpl.getOriginalRemoved()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_D_RUID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_D_RUID, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getDossierId(),
					vrDossierFileModelImpl.getReferenceUid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_REF, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DID_REF, args);
		}

		if ((vrDossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DID_REF.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getOriginalDossierId(),
					vrDossierFileModelImpl.getOriginalReferenceUid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_REF, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DID_REF, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getDeliverableCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DE_CODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DE_CODE, args);
		}

		if ((vrDossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DE_CODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getOriginalDeliverableCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DE_CODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DE_CODE, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getGroupId(),
					vrDossierFileModelImpl.getReferenceUid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GID_REF, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_GID_REF, args);
		}

		if ((vrDossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GID_REF.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getOriginalGroupId(),
					vrDossierFileModelImpl.getOriginalReferenceUid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GID_REF, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_GID_REF, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] { vrDossierFileModelImpl.getFileEntryId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FILE_ID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_FILE_ID, args);
		}

		if ((vrDossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_FILE_ID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getOriginalFileEntryId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FILE_ID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_FILE_ID, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getDossierFileId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERFILEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEID, args);
		}

		if ((vrDossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOSSIERFILEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrDossierFileModelImpl.getOriginalDossierFileId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERFILEID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEID, args);
		}
	}

	/**
	 * Creates a new vr dossier file with the primary key. Does not add the vr dossier file to the database.
	 *
	 * @param dossierFileId the primary key for the new vr dossier file
	 * @return the new vr dossier file
	 */
	@Override
	public VRDossierFile create(long dossierFileId) {
		VRDossierFile vrDossierFile = new VRDossierFileImpl();

		vrDossierFile.setNew(true);
		vrDossierFile.setPrimaryKey(dossierFileId);

		String uuid = PortalUUIDUtil.generate();

		vrDossierFile.setUuid(uuid);

		vrDossierFile.setCompanyId(companyProvider.getCompanyId());

		return vrDossierFile;
	}

	/**
	 * Removes the vr dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierFileId the primary key of the vr dossier file
	 * @return the vr dossier file that was removed
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile remove(long dossierFileId)
		throws NoSuchVRDossierFileException {
		return remove((Serializable)dossierFileId);
	}

	/**
	 * Removes the vr dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr dossier file
	 * @return the vr dossier file that was removed
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile remove(Serializable primaryKey)
		throws NoSuchVRDossierFileException {
		Session session = null;

		try {
			session = openSession();

			VRDossierFile vrDossierFile = (VRDossierFile)session.get(VRDossierFileImpl.class,
					primaryKey);

			if (vrDossierFile == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRDossierFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrDossierFile);
		}
		catch (NoSuchVRDossierFileException nsee) {
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
	protected VRDossierFile removeImpl(VRDossierFile vrDossierFile) {
		vrDossierFile = toUnwrappedModel(vrDossierFile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrDossierFile)) {
				vrDossierFile = (VRDossierFile)session.get(VRDossierFileImpl.class,
						vrDossierFile.getPrimaryKeyObj());
			}

			if (vrDossierFile != null) {
				session.delete(vrDossierFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrDossierFile != null) {
			clearCache(vrDossierFile);
		}

		return vrDossierFile;
	}

	@Override
	public VRDossierFile updateImpl(VRDossierFile vrDossierFile) {
		vrDossierFile = toUnwrappedModel(vrDossierFile);

		boolean isNew = vrDossierFile.isNew();

		VRDossierFileModelImpl vrDossierFileModelImpl = (VRDossierFileModelImpl)vrDossierFile;

		if (Validator.isNull(vrDossierFile.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			vrDossierFile.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (vrDossierFile.getCreateDate() == null)) {
			if (serviceContext == null) {
				vrDossierFile.setCreateDate(now);
			}
			else {
				vrDossierFile.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!vrDossierFileModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				vrDossierFile.setModifiedDate(now);
			}
			else {
				vrDossierFile.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (vrDossierFile.isNew()) {
				session.save(vrDossierFile);

				vrDossierFile.setNew(false);
			}
			else {
				vrDossierFile = (VRDossierFile)session.merge(vrDossierFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRDossierFileModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { vrDossierFileModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalUuid(),
						vrDossierFileModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						vrDossierFileModelImpl.getUuid(),
						vrDossierFileModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalDossierId(),
						vrDossierFileModelImpl.getOriginalFileTemplateNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_FTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTN,
					args);

				args = new Object[] {
						vrDossierFileModelImpl.getDossierId(),
						vrDossierFileModelImpl.getFileTemplateNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_FTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTN,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_,
					args);

				args = new Object[] { vrDossierFileModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalDossierId(),
						vrDossierFileModelImpl.getOriginalRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrDossierFileModelImpl.getDossierId(),
						vrDossierFileModelImpl.getRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DPT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalDossierId(),
						vrDossierFileModelImpl.getOriginalDossierPartType(),
						vrDossierFileModelImpl.getOriginalRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_D_DPT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DPT,
					args);

				args = new Object[] {
						vrDossierFileModelImpl.getDossierId(),
						vrDossierFileModelImpl.getDossierPartType(),
						vrDossierFileModelImpl.getRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_D_DPT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DPT,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_ISN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalDossierId(),
						vrDossierFileModelImpl.getOriginalIsNew(),
						vrDossierFileModelImpl.getOriginalRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_ISN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_ISN,
					args);

				args = new Object[] {
						vrDossierFileModelImpl.getDossierId(),
						vrDossierFileModelImpl.getIsNew(),
						vrDossierFileModelImpl.getRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_ISN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_ISN,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalDossierId(),
						vrDossierFileModelImpl.getOriginalFileTemplateNo(),
						vrDossierFileModelImpl.getOriginalRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_FTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO,
					args);

				args = new Object[] {
						vrDossierFileModelImpl.getDossierId(),
						vrDossierFileModelImpl.getFileTemplateNo(),
						vrDossierFileModelImpl.getRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_FTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_DPNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalDossierId(),
						vrDossierFileModelImpl.getOriginalDossierPartNo(),
						vrDossierFileModelImpl.getOriginalRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_DPNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_DPNO,
					args);

				args = new Object[] {
						vrDossierFileModelImpl.getDossierId(),
						vrDossierFileModelImpl.getDossierPartNo(),
						vrDossierFileModelImpl.getRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_DPNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_DPNO,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO_DPT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalDossierId(),
						vrDossierFileModelImpl.getOriginalFileTemplateNo(),
						vrDossierFileModelImpl.getOriginalDossierPartType(),
						vrDossierFileModelImpl.getOriginalRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_FTNO_DPT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO_DPT,
					args);

				args = new Object[] {
						vrDossierFileModelImpl.getDossierId(),
						vrDossierFileModelImpl.getFileTemplateNo(),
						vrDossierFileModelImpl.getDossierPartType(),
						vrDossierFileModelImpl.getRemoved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DID_FTNO_DPT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DID_FTNO_DPT,
					args);
			}

			if ((vrDossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REF_UID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrDossierFileModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REF_UID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REF_UID,
					args);

				args = new Object[] { vrDossierFileModelImpl.getReferenceUid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REF_UID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REF_UID,
					args);
			}
		}

		entityCache.putResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
			VRDossierFileImpl.class, vrDossierFile.getPrimaryKey(),
			vrDossierFile, false);

		clearUniqueFindersCache(vrDossierFileModelImpl, false);
		cacheUniqueFindersCache(vrDossierFileModelImpl);

		vrDossierFile.resetOriginalValues();

		return vrDossierFile;
	}

	protected VRDossierFile toUnwrappedModel(VRDossierFile vrDossierFile) {
		if (vrDossierFile instanceof VRDossierFileImpl) {
			return vrDossierFile;
		}

		VRDossierFileImpl vrDossierFileImpl = new VRDossierFileImpl();

		vrDossierFileImpl.setNew(vrDossierFile.isNew());
		vrDossierFileImpl.setPrimaryKey(vrDossierFile.getPrimaryKey());

		vrDossierFileImpl.setUuid(vrDossierFile.getUuid());
		vrDossierFileImpl.setDossierFileId(vrDossierFile.getDossierFileId());
		vrDossierFileImpl.setGroupId(vrDossierFile.getGroupId());
		vrDossierFileImpl.setCompanyId(vrDossierFile.getCompanyId());
		vrDossierFileImpl.setUserId(vrDossierFile.getUserId());
		vrDossierFileImpl.setUserName(vrDossierFile.getUserName());
		vrDossierFileImpl.setCreateDate(vrDossierFile.getCreateDate());
		vrDossierFileImpl.setModifiedDate(vrDossierFile.getModifiedDate());
		vrDossierFileImpl.setDossierId(vrDossierFile.getDossierId());
		vrDossierFileImpl.setReferenceUid(vrDossierFile.getReferenceUid());
		vrDossierFileImpl.setDossierTemplateNo(vrDossierFile.getDossierTemplateNo());
		vrDossierFileImpl.setDossierPartNo(vrDossierFile.getDossierPartNo());
		vrDossierFileImpl.setDossierPartType(vrDossierFile.getDossierPartType());
		vrDossierFileImpl.setFileTemplateNo(vrDossierFile.getFileTemplateNo());
		vrDossierFileImpl.setDisplayName(vrDossierFile.getDisplayName());
		vrDossierFileImpl.setFormData(vrDossierFile.getFormData());
		vrDossierFileImpl.setFormDataDossierFile(vrDossierFile.getFormDataDossierFile());
		vrDossierFileImpl.setFileEntryId(vrDossierFile.getFileEntryId());
		vrDossierFileImpl.setOriginal(vrDossierFile.isOriginal());
		vrDossierFileImpl.setEForm(vrDossierFile.isEForm());
		vrDossierFileImpl.setIsNew(vrDossierFile.isIsNew());
		vrDossierFileImpl.setRemoved(vrDossierFile.isRemoved());
		vrDossierFileImpl.setSignCheck(vrDossierFile.getSignCheck());
		vrDossierFileImpl.setSignInfo(vrDossierFile.getSignInfo());
		vrDossierFileImpl.setFormScript(vrDossierFile.getFormScript());
		vrDossierFileImpl.setFormReport(vrDossierFile.getFormReport());
		vrDossierFileImpl.setFormSchema(vrDossierFile.getFormSchema());
		vrDossierFileImpl.setDeliverableCode(vrDossierFile.getDeliverableCode());

		return vrDossierFileImpl;
	}

	/**
	 * Returns the vr dossier file with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr dossier file
	 * @return the vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRDossierFileException {
		VRDossierFile vrDossierFile = fetchByPrimaryKey(primaryKey);

		if (vrDossierFile == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRDossierFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file with the primary key or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	 *
	 * @param dossierFileId the primary key of the vr dossier file
	 * @return the vr dossier file
	 * @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile findByPrimaryKey(long dossierFileId)
		throws NoSuchVRDossierFileException {
		return findByPrimaryKey((Serializable)dossierFileId);
	}

	/**
	 * Returns the vr dossier file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr dossier file
	 * @return the vr dossier file, or <code>null</code> if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
				VRDossierFileImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRDossierFile vrDossierFile = (VRDossierFile)serializable;

		if (vrDossierFile == null) {
			Session session = null;

			try {
				session = openSession();

				vrDossierFile = (VRDossierFile)session.get(VRDossierFileImpl.class,
						primaryKey);

				if (vrDossierFile != null) {
					cacheResult(vrDossierFile);
				}
				else {
					entityCache.putResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
						VRDossierFileImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
					VRDossierFileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrDossierFile;
	}

	/**
	 * Returns the vr dossier file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierFileId the primary key of the vr dossier file
	 * @return the vr dossier file, or <code>null</code> if a vr dossier file with the primary key could not be found
	 */
	@Override
	public VRDossierFile fetchByPrimaryKey(long dossierFileId) {
		return fetchByPrimaryKey((Serializable)dossierFileId);
	}

	@Override
	public Map<Serializable, VRDossierFile> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRDossierFile> map = new HashMap<Serializable, VRDossierFile>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRDossierFile vrDossierFile = fetchByPrimaryKey(primaryKey);

			if (vrDossierFile != null) {
				map.put(primaryKey, vrDossierFile);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
					VRDossierFileImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRDossierFile)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRDOSSIERFILE_WHERE_PKS_IN);

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

			for (VRDossierFile vrDossierFile : (List<VRDossierFile>)q.list()) {
				map.put(vrDossierFile.getPrimaryKeyObj(), vrDossierFile);

				cacheResult(vrDossierFile);

				uncachedPrimaryKeys.remove(vrDossierFile.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRDossierFileModelImpl.ENTITY_CACHE_ENABLED,
					VRDossierFileImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr dossier files.
	 *
	 * @return the vr dossier files
	 */
	@Override
	public List<VRDossierFile> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr dossier files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @return the range of vr dossier files
	 */
	@Override
	public List<VRDossierFile> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr dossier files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr dossier files
	 */
	@Override
	public List<VRDossierFile> findAll(int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr dossier files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr dossier files
	 * @param end the upper bound of the range of vr dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr dossier files
	 */
	@Override
	public List<VRDossierFile> findAll(int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
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

		List<VRDossierFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRDossierFile>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRDOSSIERFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRDOSSIERFILE;

				if (pagination) {
					sql = sql.concat(VRDossierFileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRDossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr dossier files from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRDossierFile vrDossierFile : findAll()) {
			remove(vrDossierFile);
		}
	}

	/**
	 * Returns the number of vr dossier files.
	 *
	 * @return the number of vr dossier files
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRDOSSIERFILE);

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
		return VRDossierFileModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr dossier file persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRDossierFileImpl.class.getName());
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
	private static final String _SQL_SELECT_VRDOSSIERFILE = "SELECT vrDossierFile FROM VRDossierFile vrDossierFile";
	private static final String _SQL_SELECT_VRDOSSIERFILE_WHERE_PKS_IN = "SELECT vrDossierFile FROM VRDossierFile vrDossierFile WHERE dossierFileId IN (";
	private static final String _SQL_SELECT_VRDOSSIERFILE_WHERE = "SELECT vrDossierFile FROM VRDossierFile vrDossierFile WHERE ";
	private static final String _SQL_COUNT_VRDOSSIERFILE = "SELECT COUNT(vrDossierFile) FROM VRDossierFile vrDossierFile";
	private static final String _SQL_COUNT_VRDOSSIERFILE_WHERE = "SELECT COUNT(vrDossierFile) FROM VRDossierFile vrDossierFile WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrDossierFile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRDossierFile exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRDossierFile exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRDossierFilePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}