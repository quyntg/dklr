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

import com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException;
import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.model.impl.VRVehicleSpecificationImpl;
import com.fds.vr.business.model.impl.VRVehicleSpecificationModelImpl;
import com.fds.vr.business.service.persistence.VRVehicleSpecificationPersistence;

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
 * The persistence implementation for the vr vehicle specification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleSpecificationPersistence
 * @see com.fds.vr.business.service.persistence.VRVehicleSpecificationUtil
 * @generated
 */
@ProviderType
public class VRVehicleSpecificationPersistenceImpl extends BasePersistenceImpl<VRVehicleSpecification>
	implements VRVehicleSpecificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRVehicleSpecificationUtil} to access the vr vehicle specification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRVehicleSpecificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_SC_VCID = new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBySC_VCID",
			new String[] { Long.class.getName(), String.class.getName() },
			VRVehicleSpecificationModelImpl.VEHICLECERTIFICATEID_COLUMN_BITMASK |
			VRVehicleSpecificationModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SC_VCID = new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySC_VCID",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or throws a {@link NoSuchVRVehicleSpecificationException} if it could not be found.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param specificationCode the specification code
	 * @return the matching vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification findBySC_VCID(long vehicleCertificateId,
		String specificationCode) throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = fetchBySC_VCID(vehicleCertificateId,
				specificationCode);

		if (vrVehicleSpecification == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("vehicleCertificateId=");
			msg.append(vehicleCertificateId);

			msg.append(", specificationCode=");
			msg.append(specificationCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRVehicleSpecificationException(msg.toString());
		}

		return vrVehicleSpecification;
	}

	/**
	 * Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param specificationCode the specification code
	 * @return the matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification fetchBySC_VCID(long vehicleCertificateId,
		String specificationCode) {
		return fetchBySC_VCID(vehicleCertificateId, specificationCode, true);
	}

	/**
	 * Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param specificationCode the specification code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification fetchBySC_VCID(long vehicleCertificateId,
		String specificationCode, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] {
				vehicleCertificateId, specificationCode
			};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_SC_VCID,
					finderArgs, this);
		}

		if (result instanceof VRVehicleSpecification) {
			VRVehicleSpecification vrVehicleSpecification = (VRVehicleSpecification)result;

			if ((vehicleCertificateId != vrVehicleSpecification.getVehicleCertificateId()) ||
					!Objects.equals(specificationCode,
						vrVehicleSpecification.getSpecificationCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRVEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_SC_VCID_VEHICLECERTIFICATEID_2);

			boolean bindSpecificationCode = false;

			if (specificationCode == null) {
				query.append(_FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_1);
			}
			else if (specificationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationCode = true;

				query.append(_FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleCertificateId);

				if (bindSpecificationCode) {
					qPos.add(specificationCode);
				}

				List<VRVehicleSpecification> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_SC_VCID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRVehicleSpecificationPersistenceImpl.fetchBySC_VCID(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRVehicleSpecification vrVehicleSpecification = list.get(0);

					result = vrVehicleSpecification;

					cacheResult(vrVehicleSpecification);

					if ((vrVehicleSpecification.getVehicleCertificateId() != vehicleCertificateId) ||
							(vrVehicleSpecification.getSpecificationCode() == null) ||
							!vrVehicleSpecification.getSpecificationCode()
													   .equals(specificationCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_SC_VCID,
							finderArgs, vrVehicleSpecification);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_SC_VCID,
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
			return (VRVehicleSpecification)result;
		}
	}

	/**
	 * Removes the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; from the database.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param specificationCode the specification code
	 * @return the vr vehicle specification that was removed
	 */
	@Override
	public VRVehicleSpecification removeBySC_VCID(long vehicleCertificateId,
		String specificationCode) throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = findBySC_VCID(vehicleCertificateId,
				specificationCode);

		return remove(vrVehicleSpecification);
	}

	/**
	 * Returns the number of vr vehicle specifications where vehicleCertificateId = &#63; and specificationCode = &#63;.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param specificationCode the specification code
	 * @return the number of matching vr vehicle specifications
	 */
	@Override
	public int countBySC_VCID(long vehicleCertificateId,
		String specificationCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SC_VCID;

		Object[] finderArgs = new Object[] {
				vehicleCertificateId, specificationCode
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRVEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_SC_VCID_VEHICLECERTIFICATEID_2);

			boolean bindSpecificationCode = false;

			if (specificationCode == null) {
				query.append(_FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_1);
			}
			else if (specificationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationCode = true;

				query.append(_FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleCertificateId);

				if (bindSpecificationCode) {
					qPos.add(specificationCode);
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

	private static final String _FINDER_COLUMN_SC_VCID_VEHICLECERTIFICATEID_2 = "vrVehicleSpecification.vehicleCertificateId = ? AND ";
	private static final String _FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_1 = "vrVehicleSpecification.specificationCode IS NULL";
	private static final String _FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_2 = "vrVehicleSpecification.specificationCode = ?";
	private static final String _FINDER_COLUMN_SC_VCID_SPECIFICATIONCODE_3 = "(vrVehicleSpecification.specificationCode IS NULL OR vrVehicleSpecification.specificationCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECERTIFICATEID =
		new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVehicleCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATEID =
		new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByVehicleCertificateId",
			new String[] { Long.class.getName() },
			VRVehicleSpecificationModelImpl.VEHICLECERTIFICATEID_COLUMN_BITMASK |
			VRVehicleSpecificationModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLECERTIFICATEID = new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleCertificateId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr vehicle specifications where vehicleCertificateId = &#63;.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @return the matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId) {
		return findByVehicleCertificateId(vehicleCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle specifications where vehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @return the range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return findByVehicleCertificateId(vehicleCertificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle specifications where vehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return findByVehicleCertificateId(vehicleCertificateId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle specifications where vehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATEID;
			finderArgs = new Object[] { vehicleCertificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECERTIFICATEID;
			finderArgs = new Object[] {
					vehicleCertificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRVehicleSpecification> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleSpecification>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleSpecification vrVehicleSpecification : list) {
					if ((vehicleCertificateId != vrVehicleSpecification.getVehicleCertificateId())) {
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

			query.append(_SQL_SELECT_VRVEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_VEHICLECERTIFICATEID_VEHICLECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleCertificateId);

				if (!pagination) {
					list = (List<VRVehicleSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleSpecification>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification findByVehicleCertificateId_First(
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = fetchByVehicleCertificateId_First(vehicleCertificateId,
				orderByComparator);

		if (vrVehicleSpecification != null) {
			return vrVehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleCertificateId=");
		msg.append(vehicleCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification fetchByVehicleCertificateId_First(
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		List<VRVehicleSpecification> list = findByVehicleCertificateId(vehicleCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification findByVehicleCertificateId_Last(
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = fetchByVehicleCertificateId_Last(vehicleCertificateId,
				orderByComparator);

		if (vrVehicleSpecification != null) {
			return vrVehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleCertificateId=");
		msg.append(vehicleCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification fetchByVehicleCertificateId_Last(
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		int count = countByVehicleCertificateId(vehicleCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleSpecification> list = findByVehicleCertificateId(vehicleCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle specification
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification[] findByVehicleCertificateId_PrevAndNext(
		long id, long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleSpecification[] array = new VRVehicleSpecificationImpl[3];

			array[0] = getByVehicleCertificateId_PrevAndNext(session,
					vrVehicleSpecification, vehicleCertificateId,
					orderByComparator, true);

			array[1] = vrVehicleSpecification;

			array[2] = getByVehicleCertificateId_PrevAndNext(session,
					vrVehicleSpecification, vehicleCertificateId,
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

	protected VRVehicleSpecification getByVehicleCertificateId_PrevAndNext(
		Session session, VRVehicleSpecification vrVehicleSpecification,
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLESPECIFICATION_WHERE);

		query.append(_FINDER_COLUMN_VEHICLECERTIFICATEID_VEHICLECERTIFICATEID_2);

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
			query.append(VRVehicleSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle specifications where vehicleCertificateId = &#63; from the database.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 */
	@Override
	public void removeByVehicleCertificateId(long vehicleCertificateId) {
		for (VRVehicleSpecification vrVehicleSpecification : findByVehicleCertificateId(
				vehicleCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleSpecification);
		}
	}

	/**
	 * Returns the number of vr vehicle specifications where vehicleCertificateId = &#63;.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID
	 * @return the number of matching vr vehicle specifications
	 */
	@Override
	public int countByVehicleCertificateId(long vehicleCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_VEHICLECERTIFICATEID_VEHICLECERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleCertificateId);

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

	private static final String _FINDER_COLUMN_VEHICLECERTIFICATEID_VEHICLECERTIFICATEID_2 =
		"vrVehicleSpecification.vehicleCertificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRVehicleSpecificationModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRVehicleSpecificationModelImpl.VEHICLECERTIFICATEID_COLUMN_BITMASK |
			VRVehicleSpecificationModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr vehicle specifications where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle specifications where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @return the range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle specifications where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle specifications where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
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

		List<VRVehicleSpecification> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleSpecification>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleSpecification vrVehicleSpecification : list) {
					if (!Objects.equals(deliverableCode,
								vrVehicleSpecification.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRVEHICLESPECIFICATION_WHERE);

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
				query.append(VRVehicleSpecificationModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRVehicleSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleSpecification>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle specification in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrVehicleSpecification != null) {
			return vrVehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle specification in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		List<VRVehicleSpecification> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle specification in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrVehicleSpecification != null) {
			return vrVehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle specification in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRVehicleSpecification> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle specification
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification[] findByDeliverableCode_PrevAndNext(long id,
		String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleSpecification[] array = new VRVehicleSpecificationImpl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrVehicleSpecification, deliverableCode, orderByComparator,
					true);

			array[1] = vrVehicleSpecification;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrVehicleSpecification, deliverableCode, orderByComparator,
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

	protected VRVehicleSpecification getByDeliverableCode_PrevAndNext(
		Session session, VRVehicleSpecification vrVehicleSpecification,
		String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLESPECIFICATION_WHERE);

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
			query.append(VRVehicleSpecificationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle specifications where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRVehicleSpecification vrVehicleSpecification : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleSpecification);
		}
	}

	/**
	 * Returns the number of vr vehicle specifications where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr vehicle specifications
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLESPECIFICATION_WHERE);

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
		"vrVehicleSpecification.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrVehicleSpecification.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrVehicleSpecification.deliverableCode IS NULL OR vrVehicleSpecification.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydossierId",
			new String[] { Long.class.getName() },
			VRVehicleSpecificationModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRVehicleSpecificationModelImpl.VEHICLECERTIFICATEID_COLUMN_BITMASK |
			VRVehicleSpecificationModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr vehicle specifications where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findBydossierId(long dossierId) {
		return findBydossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr vehicle specifications where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @return the range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findBydossierId(long dossierId,
		int start, int end) {
		return findBydossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle specifications where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return findBydossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle specifications where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
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

		List<VRVehicleSpecification> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleSpecification>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRVehicleSpecification vrVehicleSpecification : list) {
					if ((dossierId != vrVehicleSpecification.getDossierId())) {
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

			query.append(_SQL_SELECT_VRVEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRVehicleSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRVehicleSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleSpecification>)QueryUtil.list(q,
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
	 * Returns the first vr vehicle specification in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification findBydossierId_First(long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = fetchBydossierId_First(dossierId,
				orderByComparator);

		if (vrVehicleSpecification != null) {
			return vrVehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the first vr vehicle specification in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification fetchBydossierId_First(long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		List<VRVehicleSpecification> list = findBydossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr vehicle specification in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification findBydossierId_Last(long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = fetchBydossierId_Last(dossierId,
				orderByComparator);

		if (vrVehicleSpecification != null) {
			return vrVehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the last vr vehicle specification in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	 */
	@Override
	public VRVehicleSpecification fetchBydossierId_Last(long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		int count = countBydossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRVehicleSpecification> list = findBydossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr vehicle specification
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification[] findBydossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRVehicleSpecification[] array = new VRVehicleSpecificationImpl[3];

			array[0] = getBydossierId_PrevAndNext(session,
					vrVehicleSpecification, dossierId, orderByComparator, true);

			array[1] = vrVehicleSpecification;

			array[2] = getBydossierId_PrevAndNext(session,
					vrVehicleSpecification, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRVehicleSpecification getBydossierId_PrevAndNext(
		Session session, VRVehicleSpecification vrVehicleSpecification,
		long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
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

		query.append(_SQL_SELECT_VRVEHICLESPECIFICATION_WHERE);

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
			query.append(VRVehicleSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrVehicleSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRVehicleSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr vehicle specifications where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBydossierId(long dossierId) {
		for (VRVehicleSpecification vrVehicleSpecification : findBydossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrVehicleSpecification);
		}
	}

	/**
	 * Returns the number of vr vehicle specifications where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr vehicle specifications
	 */
	@Override
	public int countBydossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRVEHICLESPECIFICATION_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrVehicleSpecification.dossierId = ?";

	public VRVehicleSpecificationPersistenceImpl() {
		setModelClass(VRVehicleSpecification.class);
	}

	/**
	 * Caches the vr vehicle specification in the entity cache if it is enabled.
	 *
	 * @param vrVehicleSpecification the vr vehicle specification
	 */
	@Override
	public void cacheResult(VRVehicleSpecification vrVehicleSpecification) {
		entityCache.putResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			vrVehicleSpecification.getPrimaryKey(), vrVehicleSpecification);

		finderCache.putResult(FINDER_PATH_FETCH_BY_SC_VCID,
			new Object[] {
				vrVehicleSpecification.getVehicleCertificateId(),
				vrVehicleSpecification.getSpecificationCode()
			}, vrVehicleSpecification);

		vrVehicleSpecification.resetOriginalValues();
	}

	/**
	 * Caches the vr vehicle specifications in the entity cache if it is enabled.
	 *
	 * @param vrVehicleSpecifications the vr vehicle specifications
	 */
	@Override
	public void cacheResult(
		List<VRVehicleSpecification> vrVehicleSpecifications) {
		for (VRVehicleSpecification vrVehicleSpecification : vrVehicleSpecifications) {
			if (entityCache.getResult(
						VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
						VRVehicleSpecificationImpl.class,
						vrVehicleSpecification.getPrimaryKey()) == null) {
				cacheResult(vrVehicleSpecification);
			}
			else {
				vrVehicleSpecification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr vehicle specifications.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRVehicleSpecificationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr vehicle specification.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRVehicleSpecification vrVehicleSpecification) {
		entityCache.removeResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			vrVehicleSpecification.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRVehicleSpecificationModelImpl)vrVehicleSpecification,
			true);
	}

	@Override
	public void clearCache(List<VRVehicleSpecification> vrVehicleSpecifications) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRVehicleSpecification vrVehicleSpecification : vrVehicleSpecifications) {
			entityCache.removeResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
				VRVehicleSpecificationImpl.class,
				vrVehicleSpecification.getPrimaryKey());

			clearUniqueFindersCache((VRVehicleSpecificationModelImpl)vrVehicleSpecification,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRVehicleSpecificationModelImpl vrVehicleSpecificationModelImpl) {
		Object[] args = new Object[] {
				vrVehicleSpecificationModelImpl.getVehicleCertificateId(),
				vrVehicleSpecificationModelImpl.getSpecificationCode()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_SC_VCID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_SC_VCID, args,
			vrVehicleSpecificationModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRVehicleSpecificationModelImpl vrVehicleSpecificationModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrVehicleSpecificationModelImpl.getVehicleCertificateId(),
					vrVehicleSpecificationModelImpl.getSpecificationCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SC_VCID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_SC_VCID, args);
		}

		if ((vrVehicleSpecificationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SC_VCID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrVehicleSpecificationModelImpl.getOriginalVehicleCertificateId(),
					vrVehicleSpecificationModelImpl.getOriginalSpecificationCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SC_VCID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_SC_VCID, args);
		}
	}

	/**
	 * Creates a new vr vehicle specification with the primary key. Does not add the vr vehicle specification to the database.
	 *
	 * @param id the primary key for the new vr vehicle specification
	 * @return the new vr vehicle specification
	 */
	@Override
	public VRVehicleSpecification create(long id) {
		VRVehicleSpecification vrVehicleSpecification = new VRVehicleSpecificationImpl();

		vrVehicleSpecification.setNew(true);
		vrVehicleSpecification.setPrimaryKey(id);

		return vrVehicleSpecification;
	}

	/**
	 * Removes the vr vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr vehicle specification
	 * @return the vr vehicle specification that was removed
	 * @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification remove(long id)
		throws NoSuchVRVehicleSpecificationException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr vehicle specification
	 * @return the vr vehicle specification that was removed
	 * @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification remove(Serializable primaryKey)
		throws NoSuchVRVehicleSpecificationException {
		Session session = null;

		try {
			session = openSession();

			VRVehicleSpecification vrVehicleSpecification = (VRVehicleSpecification)session.get(VRVehicleSpecificationImpl.class,
					primaryKey);

			if (vrVehicleSpecification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRVehicleSpecificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrVehicleSpecification);
		}
		catch (NoSuchVRVehicleSpecificationException nsee) {
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
	protected VRVehicleSpecification removeImpl(
		VRVehicleSpecification vrVehicleSpecification) {
		vrVehicleSpecification = toUnwrappedModel(vrVehicleSpecification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrVehicleSpecification)) {
				vrVehicleSpecification = (VRVehicleSpecification)session.get(VRVehicleSpecificationImpl.class,
						vrVehicleSpecification.getPrimaryKeyObj());
			}

			if (vrVehicleSpecification != null) {
				session.delete(vrVehicleSpecification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrVehicleSpecification != null) {
			clearCache(vrVehicleSpecification);
		}

		return vrVehicleSpecification;
	}

	@Override
	public VRVehicleSpecification updateImpl(
		VRVehicleSpecification vrVehicleSpecification) {
		vrVehicleSpecification = toUnwrappedModel(vrVehicleSpecification);

		boolean isNew = vrVehicleSpecification.isNew();

		VRVehicleSpecificationModelImpl vrVehicleSpecificationModelImpl = (VRVehicleSpecificationModelImpl)vrVehicleSpecification;

		Session session = null;

		try {
			session = openSession();

			if (vrVehicleSpecification.isNew()) {
				session.save(vrVehicleSpecification);

				vrVehicleSpecification.setNew(false);
			}
			else {
				vrVehicleSpecification = (VRVehicleSpecification)session.merge(vrVehicleSpecification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRVehicleSpecificationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrVehicleSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleSpecificationModelImpl.getOriginalVehicleCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATEID,
					args);

				args = new Object[] {
						vrVehicleSpecificationModelImpl.getVehicleCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATEID,
					args);
			}

			if ((vrVehicleSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleSpecificationModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrVehicleSpecificationModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrVehicleSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrVehicleSpecificationModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrVehicleSpecificationModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}
		}

		entityCache.putResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VRVehicleSpecificationImpl.class,
			vrVehicleSpecification.getPrimaryKey(), vrVehicleSpecification,
			false);

		clearUniqueFindersCache(vrVehicleSpecificationModelImpl, false);
		cacheUniqueFindersCache(vrVehicleSpecificationModelImpl);

		vrVehicleSpecification.resetOriginalValues();

		return vrVehicleSpecification;
	}

	protected VRVehicleSpecification toUnwrappedModel(
		VRVehicleSpecification vrVehicleSpecification) {
		if (vrVehicleSpecification instanceof VRVehicleSpecificationImpl) {
			return vrVehicleSpecification;
		}

		VRVehicleSpecificationImpl vrVehicleSpecificationImpl = new VRVehicleSpecificationImpl();

		vrVehicleSpecificationImpl.setNew(vrVehicleSpecification.isNew());
		vrVehicleSpecificationImpl.setPrimaryKey(vrVehicleSpecification.getPrimaryKey());

		vrVehicleSpecificationImpl.setId(vrVehicleSpecification.getId());
		vrVehicleSpecificationImpl.setVehicleCertificateId(vrVehicleSpecification.getVehicleCertificateId());
		vrVehicleSpecificationImpl.setSpecificationCode(vrVehicleSpecification.getSpecificationCode());
		vrVehicleSpecificationImpl.setSpecificationName(vrVehicleSpecification.getSpecificationName());
		vrVehicleSpecificationImpl.setSpecificationValue(vrVehicleSpecification.getSpecificationValue());
		vrVehicleSpecificationImpl.setSpecificationValueDescription(vrVehicleSpecification.getSpecificationValueDescription());
		vrVehicleSpecificationImpl.setSequenceNo(vrVehicleSpecification.getSequenceNo());
		vrVehicleSpecificationImpl.setSpecificationBasicUnit(vrVehicleSpecification.getSpecificationBasicUnit());
		vrVehicleSpecificationImpl.setSpecificationStandard(vrVehicleSpecification.getSpecificationStandard());
		vrVehicleSpecificationImpl.setSpecificationGroup(vrVehicleSpecification.getSpecificationGroup());
		vrVehicleSpecificationImpl.setSpecificationDataCollectionID(vrVehicleSpecification.getSpecificationDataCollectionID());
		vrVehicleSpecificationImpl.setSpecificationResult(vrVehicleSpecification.getSpecificationResult());
		vrVehicleSpecificationImpl.setDeliverableCode(vrVehicleSpecification.getDeliverableCode());
		vrVehicleSpecificationImpl.setDossierId(vrVehicleSpecification.getDossierId());
		vrVehicleSpecificationImpl.setDossierIdCTN(vrVehicleSpecification.getDossierIdCTN());
		vrVehicleSpecificationImpl.setDossierNo(vrVehicleSpecification.getDossierNo());
		vrVehicleSpecificationImpl.setModifyDate(vrVehicleSpecification.getModifyDate());
		vrVehicleSpecificationImpl.setSyncDate(vrVehicleSpecification.getSyncDate());

		return vrVehicleSpecificationImpl;
	}

	/**
	 * Returns the vr vehicle specification with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr vehicle specification
	 * @return the vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRVehicleSpecificationException {
		VRVehicleSpecification vrVehicleSpecification = fetchByPrimaryKey(primaryKey);

		if (vrVehicleSpecification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRVehicleSpecificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrVehicleSpecification;
	}

	/**
	 * Returns the vr vehicle specification with the primary key or throws a {@link NoSuchVRVehicleSpecificationException} if it could not be found.
	 *
	 * @param id the primary key of the vr vehicle specification
	 * @return the vr vehicle specification
	 * @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification findByPrimaryKey(long id)
		throws NoSuchVRVehicleSpecificationException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr vehicle specification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr vehicle specification
	 * @return the vr vehicle specification, or <code>null</code> if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
				VRVehicleSpecificationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRVehicleSpecification vrVehicleSpecification = (VRVehicleSpecification)serializable;

		if (vrVehicleSpecification == null) {
			Session session = null;

			try {
				session = openSession();

				vrVehicleSpecification = (VRVehicleSpecification)session.get(VRVehicleSpecificationImpl.class,
						primaryKey);

				if (vrVehicleSpecification != null) {
					cacheResult(vrVehicleSpecification);
				}
				else {
					entityCache.putResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
						VRVehicleSpecificationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleSpecificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrVehicleSpecification;
	}

	/**
	 * Returns the vr vehicle specification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr vehicle specification
	 * @return the vr vehicle specification, or <code>null</code> if a vr vehicle specification with the primary key could not be found
	 */
	@Override
	public VRVehicleSpecification fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRVehicleSpecification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRVehicleSpecification> map = new HashMap<Serializable, VRVehicleSpecification>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRVehicleSpecification vrVehicleSpecification = fetchByPrimaryKey(primaryKey);

			if (vrVehicleSpecification != null) {
				map.put(primaryKey, vrVehicleSpecification);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleSpecificationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRVehicleSpecification)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRVEHICLESPECIFICATION_WHERE_PKS_IN);

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

			for (VRVehicleSpecification vrVehicleSpecification : (List<VRVehicleSpecification>)q.list()) {
				map.put(vrVehicleSpecification.getPrimaryKeyObj(),
					vrVehicleSpecification);

				cacheResult(vrVehicleSpecification);

				uncachedPrimaryKeys.remove(vrVehicleSpecification.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRVehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
					VRVehicleSpecificationImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr vehicle specifications.
	 *
	 * @return the vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr vehicle specifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @return the range of vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr vehicle specifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findAll(int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr vehicle specifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr vehicle specifications
	 * @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr vehicle specifications
	 */
	@Override
	public List<VRVehicleSpecification> findAll(int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
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

		List<VRVehicleSpecification> list = null;

		if (retrieveFromCache) {
			list = (List<VRVehicleSpecification>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRVEHICLESPECIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRVEHICLESPECIFICATION;

				if (pagination) {
					sql = sql.concat(VRVehicleSpecificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRVehicleSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRVehicleSpecification>)QueryUtil.list(q,
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
	 * Removes all the vr vehicle specifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRVehicleSpecification vrVehicleSpecification : findAll()) {
			remove(vrVehicleSpecification);
		}
	}

	/**
	 * Returns the number of vr vehicle specifications.
	 *
	 * @return the number of vr vehicle specifications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRVEHICLESPECIFICATION);

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
		return VRVehicleSpecificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr vehicle specification persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRVehicleSpecificationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRVEHICLESPECIFICATION = "SELECT vrVehicleSpecification FROM VRVehicleSpecification vrVehicleSpecification";
	private static final String _SQL_SELECT_VRVEHICLESPECIFICATION_WHERE_PKS_IN = "SELECT vrVehicleSpecification FROM VRVehicleSpecification vrVehicleSpecification WHERE id IN (";
	private static final String _SQL_SELECT_VRVEHICLESPECIFICATION_WHERE = "SELECT vrVehicleSpecification FROM VRVehicleSpecification vrVehicleSpecification WHERE ";
	private static final String _SQL_COUNT_VRVEHICLESPECIFICATION = "SELECT COUNT(vrVehicleSpecification) FROM VRVehicleSpecification vrVehicleSpecification";
	private static final String _SQL_COUNT_VRVEHICLESPECIFICATION_WHERE = "SELECT COUNT(vrVehicleSpecification) FROM VRVehicleSpecification vrVehicleSpecification WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrVehicleSpecification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRVehicleSpecification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRVehicleSpecification exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRVehicleSpecificationPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dossierId", "dossierNo"
			});
}