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

import com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException;
import com.fds.vr.business.model.VRInputStampbookDetails;
import com.fds.vr.business.model.impl.VRInputStampbookDetailsImpl;
import com.fds.vr.business.model.impl.VRInputStampbookDetailsModelImpl;
import com.fds.vr.business.service.persistence.VRInputStampbookDetailsPersistence;

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
 * The persistence implementation for the vr input stampbook details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInputStampbookDetailsPersistence
 * @see com.fds.vr.business.service.persistence.VRInputStampbookDetailsUtil
 * @generated
 */
@ProviderType
public class VRInputStampbookDetailsPersistenceImpl extends BasePersistenceImpl<VRInputStampbookDetails>
	implements VRInputStampbookDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRInputStampbookDetailsUtil} to access the vr input stampbook details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRInputStampbookDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBystampSerialNo_purchaserId",
			new String[] { Long.class.getName(), String.class.getName() },
			VRInputStampbookDetailsModelImpl.PURCHASERID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.STAMPSERIALNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STAMPSERIALNO_PURCHASERID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBystampSerialNo_purchaserId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	 *
	 * @param purchaserId the purchaser ID
	 * @param stampSerialNo the stamp serial no
	 * @return the matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBystampSerialNo_purchaserId(
		long purchaserId, String stampSerialNo)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBystampSerialNo_purchaserId(purchaserId,
				stampSerialNo);

		if (vrInputStampbookDetails == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("purchaserId=");
			msg.append(purchaserId);

			msg.append(", stampSerialNo=");
			msg.append(stampSerialNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRInputStampbookDetailsException(msg.toString());
		}

		return vrInputStampbookDetails;
	}

	/**
	 * Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param purchaserId the purchaser ID
	 * @param stampSerialNo the stamp serial no
	 * @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBystampSerialNo_purchaserId(
		long purchaserId, String stampSerialNo) {
		return fetchBystampSerialNo_purchaserId(purchaserId, stampSerialNo, true);
	}

	/**
	 * Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param purchaserId the purchaser ID
	 * @param stampSerialNo the stamp serial no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBystampSerialNo_purchaserId(
		long purchaserId, String stampSerialNo, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { purchaserId, stampSerialNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID,
					finderArgs, this);
		}

		if (result instanceof VRInputStampbookDetails) {
			VRInputStampbookDetails vrInputStampbookDetails = (VRInputStampbookDetails)result;

			if ((purchaserId != vrInputStampbookDetails.getPurchaserId()) ||
					!Objects.equals(stampSerialNo,
						vrInputStampbookDetails.getStampSerialNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_PURCHASERID_2);

			boolean bindStampSerialNo = false;

			if (stampSerialNo == null) {
				query.append(_FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_1);
			}
			else if (stampSerialNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_3);
			}
			else {
				bindStampSerialNo = true;

				query.append(_FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(purchaserId);

				if (bindStampSerialNo) {
					qPos.add(stampSerialNo);
				}

				List<VRInputStampbookDetails> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRInputStampbookDetailsPersistenceImpl.fetchBystampSerialNo_purchaserId(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRInputStampbookDetails vrInputStampbookDetails = list.get(0);

					result = vrInputStampbookDetails;

					cacheResult(vrInputStampbookDetails);

					if ((vrInputStampbookDetails.getPurchaserId() != purchaserId) ||
							(vrInputStampbookDetails.getStampSerialNo() == null) ||
							!vrInputStampbookDetails.getStampSerialNo()
														.equals(stampSerialNo)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID,
							finderArgs, vrInputStampbookDetails);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID,
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
			return (VRInputStampbookDetails)result;
		}
	}

	/**
	 * Removes the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; from the database.
	 *
	 * @param purchaserId the purchaser ID
	 * @param stampSerialNo the stamp serial no
	 * @return the vr input stampbook details that was removed
	 */
	@Override
	public VRInputStampbookDetails removeBystampSerialNo_purchaserId(
		long purchaserId, String stampSerialNo)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findBystampSerialNo_purchaserId(purchaserId,
				stampSerialNo);

		return remove(vrInputStampbookDetails);
	}

	/**
	 * Returns the number of vr input stampbook detailses where purchaserId = &#63; and stampSerialNo = &#63;.
	 *
	 * @param purchaserId the purchaser ID
	 * @param stampSerialNo the stamp serial no
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countBystampSerialNo_purchaserId(long purchaserId,
		String stampSerialNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STAMPSERIALNO_PURCHASERID;

		Object[] finderArgs = new Object[] { purchaserId, stampSerialNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_PURCHASERID_2);

			boolean bindStampSerialNo = false;

			if (stampSerialNo == null) {
				query.append(_FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_1);
			}
			else if (stampSerialNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_3);
			}
			else {
				bindStampSerialNo = true;

				query.append(_FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(purchaserId);

				if (bindStampSerialNo) {
					qPos.add(stampSerialNo);
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

	private static final String _FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_PURCHASERID_2 =
		"vrInputStampbookDetails.purchaserId = ? AND ";
	private static final String _FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_1 =
		"vrInputStampbookDetails.stampSerialNo IS NULL";
	private static final String _FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_2 =
		"vrInputStampbookDetails.stampSerialNo = ?";
	private static final String _FINDER_COLUMN_STAMPSERIALNO_PURCHASERID_STAMPSERIALNO_3 =
		"(vrInputStampbookDetails.stampSerialNo IS NULL OR vrInputStampbookDetails.stampSerialNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInputSheetId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputStampbookDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETID = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @return the matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByInputSheetId(long mtCore,
		long inputSheetId) {
		return findByInputSheetId(mtCore, inputSheetId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @return the range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end) {
		return findByInputSheetId(mtCore, inputSheetId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID;
			finderArgs = new Object[] { mtCore, inputSheetId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETID;
			finderArgs = new Object[] {
					mtCore, inputSheetId,
					
					start, end, orderByComparator
				};
		}

		List<VRInputStampbookDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbookDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbookDetails vrInputStampbookDetails : list) {
					if ((mtCore != vrInputStampbookDetails.getMtCore()) ||
							(inputSheetId != vrInputStampbookDetails.getInputSheetId())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				if (!pagination) {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchByInputSheetId_First(mtCore,
				inputSheetId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		List<VRInputStampbookDetails> list = findByInputSheetId(mtCore,
				inputSheetId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchByInputSheetId_Last(mtCore,
				inputSheetId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		int count = countByInputSheetId(mtCore, inputSheetId);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbookDetails> list = findByInputSheetId(mtCore,
				inputSheetId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook details
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbookDetails[] array = new VRInputStampbookDetailsImpl[3];

			array[0] = getByInputSheetId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, inputSheetId,
					orderByComparator, true);

			array[1] = vrInputStampbookDetails;

			array[2] = getByInputSheetId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, inputSheetId,
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

	protected VRInputStampbookDetails getByInputSheetId_PrevAndNext(
		Session session, VRInputStampbookDetails vrInputStampbookDetails,
		long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

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
			query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbookDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbookDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 */
	@Override
	public void removeByInputSheetId(long mtCore, long inputSheetId) {
		for (VRInputStampbookDetails vrInputStampbookDetails : findByInputSheetId(
				mtCore, inputSheetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbookDetails);
		}
	}

	/**
	 * Returns the number of vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countByInputSheetId(long mtCore, long inputSheetId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETID;

		Object[] finderArgs = new Object[] { mtCore, inputSheetId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

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

	private static final String _FINDER_COLUMN_INPUTSHEETID_MTCORE_2 = "vrInputStampbookDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2 = "vrInputStampbookDetails.inputSheetId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRInputStampbookDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.BOOKID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @return the matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @return the range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID;
			finderArgs = new Object[] { mtCore, inputSheetId, bookId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID;
			finderArgs = new Object[] {
					mtCore, inputSheetId, bookId,
					
					start, end, orderByComparator
				};
		}

		List<VRInputStampbookDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbookDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbookDetails vrInputStampbookDetails : list) {
					if ((mtCore != vrInputStampbookDetails.getMtCore()) ||
							(inputSheetId != vrInputStampbookDetails.getInputSheetId()) ||
							(bookId != vrInputStampbookDetails.getBookId())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

				if (!pagination) {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchByInputSheetIdAndBookId_First(mtCore,
				inputSheetId, bookId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		List<VRInputStampbookDetails> list = findByInputSheetIdAndBookId(mtCore,
				inputSheetId, bookId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchByInputSheetIdAndBookId_Last(mtCore,
				inputSheetId, bookId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		int count = countByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbookDetails> list = findByInputSheetIdAndBookId(mtCore,
				inputSheetId, bookId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook details
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbookDetails[] array = new VRInputStampbookDetailsImpl[3];

			array[0] = getByInputSheetIdAndBookId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, inputSheetId, bookId,
					orderByComparator, true);

			array[1] = vrInputStampbookDetails;

			array[2] = getByInputSheetIdAndBookId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, inputSheetId, bookId,
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

	protected VRInputStampbookDetails getByInputSheetIdAndBookId_PrevAndNext(
		Session session, VRInputStampbookDetails vrInputStampbookDetails,
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

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
			query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		qPos.add(bookId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbookDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbookDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 */
	@Override
	public void removeByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId) {
		for (VRInputStampbookDetails vrInputStampbookDetails : findByInputSheetIdAndBookId(
				mtCore, inputSheetId, bookId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbookDetails);
		}
	}

	/**
	 * Returns the number of vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID;

		Object[] finderArgs = new Object[] { mtCore, inputSheetId, bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

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

	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2 = "vrInputStampbookDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2 =
		"vrInputStampbookDetails.inputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2 = "vrInputStampbookDetails.bookId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycorporationId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycorporationId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputStampbookDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycorporationId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @return the matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycorporationId(long mtCore,
		long corporationId) {
		return findBycorporationId(mtCore, corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @return the range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycorporationId(long mtCore,
		long corporationId, int start, int end) {
		return findBycorporationId(mtCore, corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycorporationId(long mtCore,
		long corporationId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return findBycorporationId(mtCore, corporationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycorporationId(long mtCore,
		long corporationId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] { mtCore, corporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] {
					mtCore, corporationId,
					
					start, end, orderByComparator
				};
		}

		List<VRInputStampbookDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbookDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbookDetails vrInputStampbookDetails : list) {
					if ((mtCore != vrInputStampbookDetails.getMtCore()) ||
							(corporationId != vrInputStampbookDetails.getCorporationId())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(corporationId);

				if (!pagination) {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBycorporationId_First(long mtCore,
		long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBycorporationId_First(mtCore,
				corporationId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBycorporationId_First(long mtCore,
		long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		List<VRInputStampbookDetails> list = findBycorporationId(mtCore,
				corporationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBycorporationId_Last(long mtCore,
		long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBycorporationId_Last(mtCore,
				corporationId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBycorporationId_Last(long mtCore,
		long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		int count = countBycorporationId(mtCore, corporationId);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbookDetails> list = findBycorporationId(mtCore,
				corporationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook details
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails[] findBycorporationId_PrevAndNext(long id,
		long mtCore, long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbookDetails[] array = new VRInputStampbookDetailsImpl[3];

			array[0] = getBycorporationId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, corporationId,
					orderByComparator, true);

			array[1] = vrInputStampbookDetails;

			array[2] = getBycorporationId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, corporationId,
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

	protected VRInputStampbookDetails getBycorporationId_PrevAndNext(
		Session session, VRInputStampbookDetails vrInputStampbookDetails,
		long mtCore, long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

		query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

		query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);

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
			query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(corporationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbookDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbookDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 */
	@Override
	public void removeBycorporationId(long mtCore, long corporationId) {
		for (VRInputStampbookDetails vrInputStampbookDetails : findBycorporationId(
				mtCore, corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrInputStampbookDetails);
		}
	}

	/**
	 * Returns the number of vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countBycorporationId(long mtCore, long corporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { mtCore, corporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(corporationId);

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

	private static final String _FINDER_COLUMN_CORPORATIONID_MTCORE_2 = "vrInputStampbookDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "vrInputStampbookDetails.corporationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputStampbookDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBydossierId(long mtCore,
		long dossierId) {
		return findBydossierId(mtCore, dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @return the range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBydossierId(long mtCore,
		long dossierId, int start, int end) {
		return findBydossierId(mtCore, dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		List<VRInputStampbookDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbookDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbookDetails vrInputStampbookDetails : list) {
					if ((mtCore != vrInputStampbookDetails.getMtCore()) ||
							(dossierId != vrInputStampbookDetails.getDossierId())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBydossierId_First(long mtCore,
		long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBydossierId_First(mtCore,
				dossierId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBydossierId_First(long mtCore,
		long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		List<VRInputStampbookDetails> list = findBydossierId(mtCore, dossierId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBydossierId_Last(long mtCore,
		long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBydossierId_Last(mtCore,
				dossierId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBydossierId_Last(long mtCore,
		long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		int count = countBydossierId(mtCore, dossierId);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbookDetails> list = findBydossierId(mtCore, dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook details
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails[] findBydossierId_PrevAndNext(long id,
		long mtCore, long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbookDetails[] array = new VRInputStampbookDetailsImpl[3];

			array[0] = getBydossierId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, dossierId,
					orderByComparator, true);

			array[1] = vrInputStampbookDetails;

			array[2] = getBydossierId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, dossierId,
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

	protected VRInputStampbookDetails getBydossierId_PrevAndNext(
		Session session, VRInputStampbookDetails vrInputStampbookDetails,
		long mtCore, long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

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
			query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbookDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbookDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBydossierId(long mtCore, long dossierId) {
		for (VRInputStampbookDetails vrInputStampbookDetails : findBydossierId(
				mtCore, dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbookDetails);
		}
	}

	/**
	 * Returns the number of vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countBydossierId(long mtCore, long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { mtCore, dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrInputStampbookDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrInputStampbookDetails.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycertificateId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputStampbookDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.CERTIFICATEID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATEID = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycertificateId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @return the matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycertificateId(long mtCore,
		long certificateId) {
		return findBycertificateId(mtCore, certificateId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @return the range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end) {
		return findBycertificateId(mtCore, certificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		List<VRInputStampbookDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbookDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbookDetails vrInputStampbookDetails : list) {
					if ((mtCore != vrInputStampbookDetails.getMtCore()) ||
							(certificateId != vrInputStampbookDetails.getCertificateId())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBycertificateId_First(mtCore,
				certificateId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		List<VRInputStampbookDetails> list = findBycertificateId(mtCore,
				certificateId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBycertificateId_Last(mtCore,
				certificateId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		int count = countBycertificateId(mtCore, certificateId);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbookDetails> list = findBycertificateId(mtCore,
				certificateId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook details
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbookDetails[] array = new VRInputStampbookDetailsImpl[3];

			array[0] = getBycertificateId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, certificateId,
					orderByComparator, true);

			array[1] = vrInputStampbookDetails;

			array[2] = getBycertificateId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, certificateId,
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

	protected VRInputStampbookDetails getBycertificateId_PrevAndNext(
		Session session, VRInputStampbookDetails vrInputStampbookDetails,
		long mtCore, long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

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
			query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(certificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbookDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbookDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 */
	@Override
	public void removeBycertificateId(long mtCore, long certificateId) {
		for (VRInputStampbookDetails vrInputStampbookDetails : findBycertificateId(
				mtCore, certificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrInputStampbookDetails);
		}
	}

	/**
	 * Returns the number of vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countBycertificateId(long mtCore, long certificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATEID;

		Object[] finderArgs = new Object[] { mtCore, certificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_CERTIFICATEID_MTCORE_2 = "vrInputStampbookDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2 = "vrInputStampbookDetails.certificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATENUMBER =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycertificateNumber",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycertificateNumber",
			new String[] { Long.class.getName(), String.class.getName() },
			VRInputStampbookDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.CERTIFICATENUMBER_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATENUMBER = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycertificateNumber",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @return the matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycertificateNumber(long mtCore,
		String certificateNumber) {
		return findBycertificateNumber(mtCore, certificateNumber,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @return the range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end) {
		return findBycertificateNumber(mtCore, certificateNumber, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return findBycertificateNumber(mtCore, certificateNumber, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER;
			finderArgs = new Object[] { mtCore, certificateNumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATENUMBER;
			finderArgs = new Object[] {
					mtCore, certificateNumber,
					
					start, end, orderByComparator
				};
		}

		List<VRInputStampbookDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbookDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbookDetails vrInputStampbookDetails : list) {
					if ((mtCore != vrInputStampbookDetails.getMtCore()) ||
							!Objects.equals(certificateNumber,
								vrInputStampbookDetails.getCertificateNumber())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2);

			boolean bindCertificateNumber = false;

			if (certificateNumber == null) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1);
			}
			else if (certificateNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3);
			}
			else {
				bindCertificateNumber = true;

				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCertificateNumber) {
					qPos.add(certificateNumber);
				}

				if (!pagination) {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBycertificateNumber_First(long mtCore,
		String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBycertificateNumber_First(mtCore,
				certificateNumber, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateNumber=");
		msg.append(certificateNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBycertificateNumber_First(long mtCore,
		String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		List<VRInputStampbookDetails> list = findBycertificateNumber(mtCore,
				certificateNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findBycertificateNumber_Last(long mtCore,
		String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchBycertificateNumber_Last(mtCore,
				certificateNumber, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateNumber=");
		msg.append(certificateNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchBycertificateNumber_Last(long mtCore,
		String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		int count = countBycertificateNumber(mtCore, certificateNumber);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbookDetails> list = findBycertificateNumber(mtCore,
				certificateNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook details
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails[] findBycertificateNumber_PrevAndNext(
		long id, long mtCore, String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbookDetails[] array = new VRInputStampbookDetailsImpl[3];

			array[0] = getBycertificateNumber_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, certificateNumber,
					orderByComparator, true);

			array[1] = vrInputStampbookDetails;

			array[2] = getBycertificateNumber_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, certificateNumber,
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

	protected VRInputStampbookDetails getBycertificateNumber_PrevAndNext(
		Session session, VRInputStampbookDetails vrInputStampbookDetails,
		long mtCore, String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

		query.append(_FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2);

		boolean bindCertificateNumber = false;

		if (certificateNumber == null) {
			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1);
		}
		else if (certificateNumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3);
		}
		else {
			bindCertificateNumber = true;

			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2);
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
			query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindCertificateNumber) {
			qPos.add(certificateNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbookDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbookDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 */
	@Override
	public void removeBycertificateNumber(long mtCore, String certificateNumber) {
		for (VRInputStampbookDetails vrInputStampbookDetails : findBycertificateNumber(
				mtCore, certificateNumber, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrInputStampbookDetails);
		}
	}

	/**
	 * Returns the number of vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countBycertificateNumber(long mtCore, String certificateNumber) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATENUMBER;

		Object[] finderArgs = new Object[] { mtCore, certificateNumber };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2);

			boolean bindCertificateNumber = false;

			if (certificateNumber == null) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1);
			}
			else if (certificateNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3);
			}
			else {
				bindCertificateNumber = true;

				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCertificateNumber) {
					qPos.add(certificateNumber);
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

	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2 = "vrInputStampbookDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1 =
		"vrInputStampbookDetails.certificateNumber IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2 =
		"vrInputStampbookDetails.certificateNumber = ?";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3 =
		"(vrInputStampbookDetails.certificateNumber IS NULL OR vrInputStampbookDetails.certificateNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLERECORDID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByvehicleRecordId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLERECORDID =
		new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByvehicleRecordId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputStampbookDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.VEHICLERECORDID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLERECORDID = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleRecordId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByvehicleRecordId(long mtCore,
		long vehicleRecordId) {
		return findByvehicleRecordId(mtCore, vehicleRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @return the range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByvehicleRecordId(long mtCore,
		long vehicleRecordId, int start, int end) {
		return findByvehicleRecordId(mtCore, vehicleRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByvehicleRecordId(long mtCore,
		long vehicleRecordId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return findByvehicleRecordId(mtCore, vehicleRecordId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findByvehicleRecordId(long mtCore,
		long vehicleRecordId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLERECORDID;
			finderArgs = new Object[] { mtCore, vehicleRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLERECORDID;
			finderArgs = new Object[] {
					mtCore, vehicleRecordId,
					
					start, end, orderByComparator
				};
		}

		List<VRInputStampbookDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbookDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputStampbookDetails vrInputStampbookDetails : list) {
					if ((mtCore != vrInputStampbookDetails.getMtCore()) ||
							(vehicleRecordId != vrInputStampbookDetails.getVehicleRecordId())) {
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

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_MTCORE_2);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(vehicleRecordId);

				if (!pagination) {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
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
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findByvehicleRecordId_First(long mtCore,
		long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchByvehicleRecordId_First(mtCore,
				vehicleRecordId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", vehicleRecordId=");
		msg.append(vehicleRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByvehicleRecordId_First(long mtCore,
		long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		List<VRInputStampbookDetails> list = findByvehicleRecordId(mtCore,
				vehicleRecordId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findByvehicleRecordId_Last(long mtCore,
		long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchByvehicleRecordId_Last(mtCore,
				vehicleRecordId, orderByComparator);

		if (vrInputStampbookDetails != null) {
			return vrInputStampbookDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", vehicleRecordId=");
		msg.append(vehicleRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputStampbookDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByvehicleRecordId_Last(long mtCore,
		long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		int count = countByvehicleRecordId(mtCore, vehicleRecordId);

		if (count == 0) {
			return null;
		}

		List<VRInputStampbookDetails> list = findByvehicleRecordId(mtCore,
				vehicleRecordId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * @param id the primary key of the current vr input stampbook details
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails[] findByvehicleRecordId_PrevAndNext(
		long id, long mtCore, long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputStampbookDetails[] array = new VRInputStampbookDetailsImpl[3];

			array[0] = getByvehicleRecordId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, vehicleRecordId,
					orderByComparator, true);

			array[1] = vrInputStampbookDetails;

			array[2] = getByvehicleRecordId_PrevAndNext(session,
					vrInputStampbookDetails, mtCore, vehicleRecordId,
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

	protected VRInputStampbookDetails getByvehicleRecordId_PrevAndNext(
		Session session, VRInputStampbookDetails vrInputStampbookDetails,
		long mtCore, long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

		query.append(_FINDER_COLUMN_VEHICLERECORDID_MTCORE_2);

		query.append(_FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2);

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
			query.append(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(vehicleRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputStampbookDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputStampbookDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 */
	@Override
	public void removeByvehicleRecordId(long mtCore, long vehicleRecordId) {
		for (VRInputStampbookDetails vrInputStampbookDetails : findByvehicleRecordId(
				mtCore, vehicleRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrInputStampbookDetails);
		}
	}

	/**
	 * Returns the number of vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param vehicleRecordId the vehicle record ID
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countByvehicleRecordId(long mtCore, long vehicleRecordId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLERECORDID;

		Object[] finderArgs = new Object[] { mtCore, vehicleRecordId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_MTCORE_2);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(vehicleRecordId);

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

	private static final String _FINDER_COLUMN_VEHICLERECORDID_MTCORE_2 = "vrInputStampbookDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2 =
		"vrInputStampbookDetails.vehicleRecordId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByBookIdAndSequenceNo",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputStampbookDetailsModelImpl.BOOKID_COLUMN_BITMASK |
			VRInputStampbookDetailsModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKIDANDSEQUENCENO = new FinderPath(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBookIdAndSequenceNo",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	 *
	 * @param bookId the book ID
	 * @param sequenceNo the sequence no
	 * @return the matching vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails findByBookIdAndSequenceNo(long bookId,
		long sequenceNo) throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchByBookIdAndSequenceNo(bookId,
				sequenceNo);

		if (vrInputStampbookDetails == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("bookId=");
			msg.append(bookId);

			msg.append(", sequenceNo=");
			msg.append(sequenceNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRInputStampbookDetailsException(msg.toString());
		}

		return vrInputStampbookDetails;
	}

	/**
	 * Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param bookId the book ID
	 * @param sequenceNo the sequence no
	 * @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByBookIdAndSequenceNo(long bookId,
		long sequenceNo) {
		return fetchByBookIdAndSequenceNo(bookId, sequenceNo, true);
	}

	/**
	 * Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param bookId the book ID
	 * @param sequenceNo the sequence no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByBookIdAndSequenceNo(long bookId,
		long sequenceNo, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { bookId, sequenceNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO,
					finderArgs, this);
		}

		if (result instanceof VRInputStampbookDetails) {
			VRInputStampbookDetails vrInputStampbookDetails = (VRInputStampbookDetails)result;

			if ((bookId != vrInputStampbookDetails.getBookId()) ||
					(sequenceNo != vrInputStampbookDetails.getSequenceNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_BOOKIDANDSEQUENCENO_BOOKID_2);

			query.append(_FINDER_COLUMN_BOOKIDANDSEQUENCENO_SEQUENCENO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookId);

				qPos.add(sequenceNo);

				List<VRInputStampbookDetails> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRInputStampbookDetailsPersistenceImpl.fetchByBookIdAndSequenceNo(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRInputStampbookDetails vrInputStampbookDetails = list.get(0);

					result = vrInputStampbookDetails;

					cacheResult(vrInputStampbookDetails);

					if ((vrInputStampbookDetails.getBookId() != bookId) ||
							(vrInputStampbookDetails.getSequenceNo() != sequenceNo)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO,
							finderArgs, vrInputStampbookDetails);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO,
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
			return (VRInputStampbookDetails)result;
		}
	}

	/**
	 * Removes the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; from the database.
	 *
	 * @param bookId the book ID
	 * @param sequenceNo the sequence no
	 * @return the vr input stampbook details that was removed
	 */
	@Override
	public VRInputStampbookDetails removeByBookIdAndSequenceNo(long bookId,
		long sequenceNo) throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = findByBookIdAndSequenceNo(bookId,
				sequenceNo);

		return remove(vrInputStampbookDetails);
	}

	/**
	 * Returns the number of vr input stampbook detailses where bookId = &#63; and sequenceNo = &#63;.
	 *
	 * @param bookId the book ID
	 * @param sequenceNo the sequence no
	 * @return the number of matching vr input stampbook detailses
	 */
	@Override
	public int countByBookIdAndSequenceNo(long bookId, long sequenceNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKIDANDSEQUENCENO;

		Object[] finderArgs = new Object[] { bookId, sequenceNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_BOOKIDANDSEQUENCENO_BOOKID_2);

			query.append(_FINDER_COLUMN_BOOKIDANDSEQUENCENO_SEQUENCENO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookId);

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

	private static final String _FINDER_COLUMN_BOOKIDANDSEQUENCENO_BOOKID_2 = "vrInputStampbookDetails.bookId = ? AND ";
	private static final String _FINDER_COLUMN_BOOKIDANDSEQUENCENO_SEQUENCENO_2 = "vrInputStampbookDetails.sequenceNo = ?";

	public VRInputStampbookDetailsPersistenceImpl() {
		setModelClass(VRInputStampbookDetails.class);
	}

	/**
	 * Caches the vr input stampbook details in the entity cache if it is enabled.
	 *
	 * @param vrInputStampbookDetails the vr input stampbook details
	 */
	@Override
	public void cacheResult(VRInputStampbookDetails vrInputStampbookDetails) {
		entityCache.putResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			vrInputStampbookDetails.getPrimaryKey(), vrInputStampbookDetails);

		finderCache.putResult(FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID,
			new Object[] {
				vrInputStampbookDetails.getPurchaserId(),
				vrInputStampbookDetails.getStampSerialNo()
			}, vrInputStampbookDetails);

		finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO,
			new Object[] {
				vrInputStampbookDetails.getBookId(),
				vrInputStampbookDetails.getSequenceNo()
			}, vrInputStampbookDetails);

		vrInputStampbookDetails.resetOriginalValues();
	}

	/**
	 * Caches the vr input stampbook detailses in the entity cache if it is enabled.
	 *
	 * @param vrInputStampbookDetailses the vr input stampbook detailses
	 */
	@Override
	public void cacheResult(
		List<VRInputStampbookDetails> vrInputStampbookDetailses) {
		for (VRInputStampbookDetails vrInputStampbookDetails : vrInputStampbookDetailses) {
			if (entityCache.getResult(
						VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
						VRInputStampbookDetailsImpl.class,
						vrInputStampbookDetails.getPrimaryKey()) == null) {
				cacheResult(vrInputStampbookDetails);
			}
			else {
				vrInputStampbookDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr input stampbook detailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRInputStampbookDetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr input stampbook details.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRInputStampbookDetails vrInputStampbookDetails) {
		entityCache.removeResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			vrInputStampbookDetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRInputStampbookDetailsModelImpl)vrInputStampbookDetails,
			true);
	}

	@Override
	public void clearCache(
		List<VRInputStampbookDetails> vrInputStampbookDetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRInputStampbookDetails vrInputStampbookDetails : vrInputStampbookDetailses) {
			entityCache.removeResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
				VRInputStampbookDetailsImpl.class,
				vrInputStampbookDetails.getPrimaryKey());

			clearUniqueFindersCache((VRInputStampbookDetailsModelImpl)vrInputStampbookDetails,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRInputStampbookDetailsModelImpl vrInputStampbookDetailsModelImpl) {
		Object[] args = new Object[] {
				vrInputStampbookDetailsModelImpl.getPurchaserId(),
				vrInputStampbookDetailsModelImpl.getStampSerialNo()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_STAMPSERIALNO_PURCHASERID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID,
			args, vrInputStampbookDetailsModelImpl, false);

		args = new Object[] {
				vrInputStampbookDetailsModelImpl.getBookId(),
				vrInputStampbookDetailsModelImpl.getSequenceNo()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_BOOKIDANDSEQUENCENO, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO, args,
			vrInputStampbookDetailsModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRInputStampbookDetailsModelImpl vrInputStampbookDetailsModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrInputStampbookDetailsModelImpl.getPurchaserId(),
					vrInputStampbookDetailsModelImpl.getStampSerialNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STAMPSERIALNO_PURCHASERID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID,
				args);
		}

		if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrInputStampbookDetailsModelImpl.getOriginalPurchaserId(),
					vrInputStampbookDetailsModelImpl.getOriginalStampSerialNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STAMPSERIALNO_PURCHASERID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_STAMPSERIALNO_PURCHASERID,
				args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrInputStampbookDetailsModelImpl.getBookId(),
					vrInputStampbookDetailsModelImpl.getSequenceNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKIDANDSEQUENCENO,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO,
				args);
		}

		if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrInputStampbookDetailsModelImpl.getOriginalBookId(),
					vrInputStampbookDetailsModelImpl.getOriginalSequenceNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKIDANDSEQUENCENO,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_BOOKIDANDSEQUENCENO,
				args);
		}
	}

	/**
	 * Creates a new vr input stampbook details with the primary key. Does not add the vr input stampbook details to the database.
	 *
	 * @param id the primary key for the new vr input stampbook details
	 * @return the new vr input stampbook details
	 */
	@Override
	public VRInputStampbookDetails create(long id) {
		VRInputStampbookDetails vrInputStampbookDetails = new VRInputStampbookDetailsImpl();

		vrInputStampbookDetails.setNew(true);
		vrInputStampbookDetails.setPrimaryKey(id);

		return vrInputStampbookDetails;
	}

	/**
	 * Removes the vr input stampbook details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr input stampbook details
	 * @return the vr input stampbook details that was removed
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails remove(long id)
		throws NoSuchVRInputStampbookDetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr input stampbook details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr input stampbook details
	 * @return the vr input stampbook details that was removed
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails remove(Serializable primaryKey)
		throws NoSuchVRInputStampbookDetailsException {
		Session session = null;

		try {
			session = openSession();

			VRInputStampbookDetails vrInputStampbookDetails = (VRInputStampbookDetails)session.get(VRInputStampbookDetailsImpl.class,
					primaryKey);

			if (vrInputStampbookDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRInputStampbookDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrInputStampbookDetails);
		}
		catch (NoSuchVRInputStampbookDetailsException nsee) {
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
	protected VRInputStampbookDetails removeImpl(
		VRInputStampbookDetails vrInputStampbookDetails) {
		vrInputStampbookDetails = toUnwrappedModel(vrInputStampbookDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrInputStampbookDetails)) {
				vrInputStampbookDetails = (VRInputStampbookDetails)session.get(VRInputStampbookDetailsImpl.class,
						vrInputStampbookDetails.getPrimaryKeyObj());
			}

			if (vrInputStampbookDetails != null) {
				session.delete(vrInputStampbookDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrInputStampbookDetails != null) {
			clearCache(vrInputStampbookDetails);
		}

		return vrInputStampbookDetails;
	}

	@Override
	public VRInputStampbookDetails updateImpl(
		VRInputStampbookDetails vrInputStampbookDetails) {
		vrInputStampbookDetails = toUnwrappedModel(vrInputStampbookDetails);

		boolean isNew = vrInputStampbookDetails.isNew();

		VRInputStampbookDetailsModelImpl vrInputStampbookDetailsModelImpl = (VRInputStampbookDetailsModelImpl)vrInputStampbookDetails;

		Session session = null;

		try {
			session = openSession();

			if (vrInputStampbookDetails.isNew()) {
				session.save(vrInputStampbookDetails);

				vrInputStampbookDetails.setNew(false);
			}
			else {
				vrInputStampbookDetails = (VRInputStampbookDetails)session.merge(vrInputStampbookDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRInputStampbookDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookDetailsModelImpl.getOriginalMtCore(),
						vrInputStampbookDetailsModelImpl.getOriginalInputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID,
					args);

				args = new Object[] {
						vrInputStampbookDetailsModelImpl.getMtCore(),
						vrInputStampbookDetailsModelImpl.getInputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID,
					args);
			}

			if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookDetailsModelImpl.getOriginalMtCore(),
						vrInputStampbookDetailsModelImpl.getOriginalInputSheetId(),
						vrInputStampbookDetailsModelImpl.getOriginalBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID,
					args);

				args = new Object[] {
						vrInputStampbookDetailsModelImpl.getMtCore(),
						vrInputStampbookDetailsModelImpl.getInputSheetId(),
						vrInputStampbookDetailsModelImpl.getBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID,
					args);
			}

			if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookDetailsModelImpl.getOriginalMtCore(),
						vrInputStampbookDetailsModelImpl.getOriginalCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] {
						vrInputStampbookDetailsModelImpl.getMtCore(),
						vrInputStampbookDetailsModelImpl.getCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookDetailsModelImpl.getOriginalMtCore(),
						vrInputStampbookDetailsModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrInputStampbookDetailsModelImpl.getMtCore(),
						vrInputStampbookDetailsModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookDetailsModelImpl.getOriginalMtCore(),
						vrInputStampbookDetailsModelImpl.getOriginalCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);

				args = new Object[] {
						vrInputStampbookDetailsModelImpl.getMtCore(),
						vrInputStampbookDetailsModelImpl.getCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);
			}

			if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookDetailsModelImpl.getOriginalMtCore(),
						vrInputStampbookDetailsModelImpl.getOriginalCertificateNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER,
					args);

				args = new Object[] {
						vrInputStampbookDetailsModelImpl.getMtCore(),
						vrInputStampbookDetailsModelImpl.getCertificateNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER,
					args);
			}

			if ((vrInputStampbookDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputStampbookDetailsModelImpl.getOriginalMtCore(),
						vrInputStampbookDetailsModelImpl.getOriginalVehicleRecordId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLERECORDID,
					args);

				args = new Object[] {
						vrInputStampbookDetailsModelImpl.getMtCore(),
						vrInputStampbookDetailsModelImpl.getVehicleRecordId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLERECORDID,
					args);
			}
		}

		entityCache.putResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VRInputStampbookDetailsImpl.class,
			vrInputStampbookDetails.getPrimaryKey(), vrInputStampbookDetails,
			false);

		clearUniqueFindersCache(vrInputStampbookDetailsModelImpl, false);
		cacheUniqueFindersCache(vrInputStampbookDetailsModelImpl);

		vrInputStampbookDetails.resetOriginalValues();

		return vrInputStampbookDetails;
	}

	protected VRInputStampbookDetails toUnwrappedModel(
		VRInputStampbookDetails vrInputStampbookDetails) {
		if (vrInputStampbookDetails instanceof VRInputStampbookDetailsImpl) {
			return vrInputStampbookDetails;
		}

		VRInputStampbookDetailsImpl vrInputStampbookDetailsImpl = new VRInputStampbookDetailsImpl();

		vrInputStampbookDetailsImpl.setNew(vrInputStampbookDetails.isNew());
		vrInputStampbookDetailsImpl.setPrimaryKey(vrInputStampbookDetails.getPrimaryKey());

		vrInputStampbookDetailsImpl.setId(vrInputStampbookDetails.getId());
		vrInputStampbookDetailsImpl.setMtCore(vrInputStampbookDetails.getMtCore());
		vrInputStampbookDetailsImpl.setStampSerialNo(vrInputStampbookDetails.getStampSerialNo());
		vrInputStampbookDetailsImpl.setSequenceNo(vrInputStampbookDetails.getSequenceNo());
		vrInputStampbookDetailsImpl.setDossierId(vrInputStampbookDetails.getDossierId());
		vrInputStampbookDetailsImpl.setCertificateId(vrInputStampbookDetails.getCertificateId());
		vrInputStampbookDetailsImpl.setCertificateNumber(vrInputStampbookDetails.getCertificateNumber());
		vrInputStampbookDetailsImpl.setCertificateDate(vrInputStampbookDetails.getCertificateDate());
		vrInputStampbookDetailsImpl.setVehicleRecordId(vrInputStampbookDetails.getVehicleRecordId());
		vrInputStampbookDetailsImpl.setFrameNo(vrInputStampbookDetails.getFrameNo());
		vrInputStampbookDetailsImpl.setBoxNo(vrInputStampbookDetails.getBoxNo());
		vrInputStampbookDetailsImpl.setVinNo(vrInputStampbookDetails.getVinNo());
		vrInputStampbookDetailsImpl.setEngineNo(vrInputStampbookDetails.getEngineNo());
		vrInputStampbookDetailsImpl.setQrCode(vrInputStampbookDetails.getQrCode());
		vrInputStampbookDetailsImpl.setCopies(vrInputStampbookDetails.getCopies());
		vrInputStampbookDetailsImpl.setMarkupFulfill(vrInputStampbookDetails.getMarkupFulfill());
		vrInputStampbookDetailsImpl.setReplacedSerialNo(vrInputStampbookDetails.getReplacedSerialNo());
		vrInputStampbookDetailsImpl.setRemark(vrInputStampbookDetails.getRemark());
		vrInputStampbookDetailsImpl.setInputSheetId(vrInputStampbookDetails.getInputSheetId());
		vrInputStampbookDetailsImpl.setBookId(vrInputStampbookDetails.getBookId());
		vrInputStampbookDetailsImpl.setPurchaserId(vrInputStampbookDetails.getPurchaserId());
		vrInputStampbookDetailsImpl.setCorporationId(vrInputStampbookDetails.getCorporationId());
		vrInputStampbookDetailsImpl.setIssuingStatus(vrInputStampbookDetails.getIssuingStatus());
		vrInputStampbookDetailsImpl.setClearingStatus(vrInputStampbookDetails.getClearingStatus());
		vrInputStampbookDetailsImpl.setStampStatus(vrInputStampbookDetails.getStampStatus());
		vrInputStampbookDetailsImpl.setIssuingDate(vrInputStampbookDetails.getIssuingDate());
		vrInputStampbookDetailsImpl.setPrintingDate(vrInputStampbookDetails.getPrintingDate());
		vrInputStampbookDetailsImpl.setNoticeofLostDate(vrInputStampbookDetails.getNoticeofLostDate());
		vrInputStampbookDetailsImpl.setNoticeofCancelDate(vrInputStampbookDetails.getNoticeofCancelDate());
		vrInputStampbookDetailsImpl.setNoticeofReturnDate(vrInputStampbookDetails.getNoticeofReturnDate());
		vrInputStampbookDetailsImpl.setClearingDate(vrInputStampbookDetails.getClearingDate());
		vrInputStampbookDetailsImpl.setClearingAdvancePaymentID(vrInputStampbookDetails.getClearingAdvancePaymentID());
		vrInputStampbookDetailsImpl.setModifyDate(vrInputStampbookDetails.getModifyDate());
		vrInputStampbookDetailsImpl.setSyncDate(vrInputStampbookDetails.getSyncDate());

		return vrInputStampbookDetailsImpl;
	}

	/**
	 * Returns the vr input stampbook details with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr input stampbook details
	 * @return the vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRInputStampbookDetailsException {
		VRInputStampbookDetails vrInputStampbookDetails = fetchByPrimaryKey(primaryKey);

		if (vrInputStampbookDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRInputStampbookDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrInputStampbookDetails;
	}

	/**
	 * Returns the vr input stampbook details with the primary key or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the vr input stampbook details
	 * @return the vr input stampbook details
	 * @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails findByPrimaryKey(long id)
		throws NoSuchVRInputStampbookDetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr input stampbook details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr input stampbook details
	 * @return the vr input stampbook details, or <code>null</code> if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
				VRInputStampbookDetailsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRInputStampbookDetails vrInputStampbookDetails = (VRInputStampbookDetails)serializable;

		if (vrInputStampbookDetails == null) {
			Session session = null;

			try {
				session = openSession();

				vrInputStampbookDetails = (VRInputStampbookDetails)session.get(VRInputStampbookDetailsImpl.class,
						primaryKey);

				if (vrInputStampbookDetails != null) {
					cacheResult(vrInputStampbookDetails);
				}
				else {
					entityCache.putResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
						VRInputStampbookDetailsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
					VRInputStampbookDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrInputStampbookDetails;
	}

	/**
	 * Returns the vr input stampbook details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr input stampbook details
	 * @return the vr input stampbook details, or <code>null</code> if a vr input stampbook details with the primary key could not be found
	 */
	@Override
	public VRInputStampbookDetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRInputStampbookDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRInputStampbookDetails> map = new HashMap<Serializable, VRInputStampbookDetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRInputStampbookDetails vrInputStampbookDetails = fetchByPrimaryKey(primaryKey);

			if (vrInputStampbookDetails != null) {
				map.put(primaryKey, vrInputStampbookDetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
					VRInputStampbookDetailsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRInputStampbookDetails)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE_PKS_IN);

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

			for (VRInputStampbookDetails vrInputStampbookDetails : (List<VRInputStampbookDetails>)q.list()) {
				map.put(vrInputStampbookDetails.getPrimaryKeyObj(),
					vrInputStampbookDetails);

				cacheResult(vrInputStampbookDetails);

				uncachedPrimaryKeys.remove(vrInputStampbookDetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRInputStampbookDetailsModelImpl.ENTITY_CACHE_ENABLED,
					VRInputStampbookDetailsImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr input stampbook detailses.
	 *
	 * @return the vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input stampbook detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @return the range of vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findAll(int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input stampbook detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input stampbook detailses
	 * @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr input stampbook detailses
	 */
	@Override
	public List<VRInputStampbookDetails> findAll(int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
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

		List<VRInputStampbookDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputStampbookDetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRINPUTSTAMPBOOKDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRINPUTSTAMPBOOKDETAILS;

				if (pagination) {
					sql = sql.concat(VRInputStampbookDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputStampbookDetails>)QueryUtil.list(q,
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
	 * Removes all the vr input stampbook detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRInputStampbookDetails vrInputStampbookDetails : findAll()) {
			remove(vrInputStampbookDetails);
		}
	}

	/**
	 * Returns the number of vr input stampbook detailses.
	 *
	 * @return the number of vr input stampbook detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRINPUTSTAMPBOOKDETAILS);

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
		return VRInputStampbookDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr input stampbook details persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRInputStampbookDetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRINPUTSTAMPBOOKDETAILS = "SELECT vrInputStampbookDetails FROM VRInputStampbookDetails vrInputStampbookDetails";
	private static final String _SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE_PKS_IN =
		"SELECT vrInputStampbookDetails FROM VRInputStampbookDetails vrInputStampbookDetails WHERE id IN (";
	private static final String _SQL_SELECT_VRINPUTSTAMPBOOKDETAILS_WHERE = "SELECT vrInputStampbookDetails FROM VRInputStampbookDetails vrInputStampbookDetails WHERE ";
	private static final String _SQL_COUNT_VRINPUTSTAMPBOOKDETAILS = "SELECT COUNT(vrInputStampbookDetails) FROM VRInputStampbookDetails vrInputStampbookDetails";
	private static final String _SQL_COUNT_VRINPUTSTAMPBOOKDETAILS_WHERE = "SELECT COUNT(vrInputStampbookDetails) FROM VRInputStampbookDetails vrInputStampbookDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrInputStampbookDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRInputStampbookDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRInputStampbookDetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRInputStampbookDetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"boxNo"
			});
}