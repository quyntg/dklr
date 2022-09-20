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

import com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException;
import com.fds.vr.business.model.VRIssueEquipmentCertificate;
import com.fds.vr.business.model.impl.VRIssueEquipmentCertificateImpl;
import com.fds.vr.business.model.impl.VRIssueEquipmentCertificateModelImpl;
import com.fds.vr.business.service.persistence.VRIssueEquipmentCertificatePersistence;

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
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vr issue equipment certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRIssueEquipmentCertificatePersistence
 * @see com.fds.vr.business.service.persistence.VRIssueEquipmentCertificateUtil
 * @generated
 */
@ProviderType
public class VRIssueEquipmentCertificatePersistenceImpl
	extends BasePersistenceImpl<VRIssueEquipmentCertificate>
	implements VRIssueEquipmentCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRIssueEquipmentCertificateUtil} to access the vr issue equipment certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRIssueEquipmentCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIssueVehicleCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByIssueVehicleCertificateId",
			new String[] { Long.class.getName() },
			VRIssueEquipmentCertificateModelImpl.ISSUEVEHICLECERTIFICATEID_COLUMN_BITMASK |
			VRIssueEquipmentCertificateModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByIssueVehicleCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @return the matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId) {
		return findByIssueVehicleCertificateId(issueVehicleCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @return the range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end) {
		return findByIssueVehicleCertificateId(issueVehicleCertificateId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return findByIssueVehicleCertificateId(issueVehicleCertificateId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID;
			finderArgs = new Object[] { issueVehicleCertificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID;
			finderArgs = new Object[] {
					issueVehicleCertificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssueEquipmentCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueEquipmentCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : list) {
					if ((issueVehicleCertificateId != vrIssueEquipmentCertificate.getIssueVehicleCertificateId())) {
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

			query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueVehicleCertificateId);

				if (!pagination) {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByIssueVehicleCertificateId_First(
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByIssueVehicleCertificateId_First(issueVehicleCertificateId,
				orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueVehicleCertificateId=");
		msg.append(issueVehicleCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByIssueVehicleCertificateId_First(
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		List<VRIssueEquipmentCertificate> list = findByIssueVehicleCertificateId(issueVehicleCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByIssueVehicleCertificateId_Last(
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByIssueVehicleCertificateId_Last(issueVehicleCertificateId,
				orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueVehicleCertificateId=");
		msg.append(issueVehicleCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByIssueVehicleCertificateId_Last(
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		int count = countByIssueVehicleCertificateId(issueVehicleCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRIssueEquipmentCertificate> list = findByIssueVehicleCertificateId(issueVehicleCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr issue equipment certificate
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate[] findByIssueVehicleCertificateId_PrevAndNext(
		long id, long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueEquipmentCertificate[] array = new VRIssueEquipmentCertificateImpl[3];

			array[0] = getByIssueVehicleCertificateId_PrevAndNext(session,
					vrIssueEquipmentCertificate, issueVehicleCertificateId,
					orderByComparator, true);

			array[1] = vrIssueEquipmentCertificate;

			array[2] = getByIssueVehicleCertificateId_PrevAndNext(session,
					vrIssueEquipmentCertificate, issueVehicleCertificateId,
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

	protected VRIssueEquipmentCertificate getByIssueVehicleCertificateId_PrevAndNext(
		Session session,
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate,
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

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
			query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(issueVehicleCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueEquipmentCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueEquipmentCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue equipment certificates where issueVehicleCertificateId = &#63; from the database.
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 */
	@Override
	public void removeByIssueVehicleCertificateId(
		long issueVehicleCertificateId) {
		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : findByIssueVehicleCertificateId(
				issueVehicleCertificateId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrIssueEquipmentCertificate);
		}
	}

	/**
	 * Returns the number of vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @return the number of matching vr issue equipment certificates
	 */
	@Override
	public int countByIssueVehicleCertificateId(long issueVehicleCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID;

		Object[] finderArgs = new Object[] { issueVehicleCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2 =
		"vrIssueEquipmentCertificate.issueVehicleCertificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECERTIFICATERECORDNO =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleCertificateRecordNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATERECORDNO =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleCertificateRecordNo",
			new String[] { String.class.getName() },
			VRIssueEquipmentCertificateModelImpl.VEHICLECERTIFICATERECORDNO_COLUMN_BITMASK |
			VRIssueEquipmentCertificateModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLECERTIFICATERECORDNO =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleCertificateRecordNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @return the matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		String vehicleCertificateRecordNo) {
		return findByvehicleCertificateRecordNo(vehicleCertificateRecordNo,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @return the range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		String vehicleCertificateRecordNo, int start, int end) {
		return findByvehicleCertificateRecordNo(vehicleCertificateRecordNo,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		String vehicleCertificateRecordNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return findByvehicleCertificateRecordNo(vehicleCertificateRecordNo,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		String vehicleCertificateRecordNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATERECORDNO;
			finderArgs = new Object[] { vehicleCertificateRecordNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECERTIFICATERECORDNO;
			finderArgs = new Object[] {
					vehicleCertificateRecordNo,
					
					start, end, orderByComparator
				};
		}

		List<VRIssueEquipmentCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueEquipmentCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : list) {
					if (!Objects.equals(vehicleCertificateRecordNo,
								vrIssueEquipmentCertificate.getVehicleCertificateRecordNo())) {
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

			query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			boolean bindVehicleCertificateRecordNo = false;

			if (vehicleCertificateRecordNo == null) {
				query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_1);
			}
			else if (vehicleCertificateRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_3);
			}
			else {
				bindVehicleCertificateRecordNo = true;

				query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleCertificateRecordNo) {
					qPos.add(vehicleCertificateRecordNo);
				}

				if (!pagination) {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByvehicleCertificateRecordNo_First(
		String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByvehicleCertificateRecordNo_First(vehicleCertificateRecordNo,
				orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleCertificateRecordNo=");
		msg.append(vehicleCertificateRecordNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByvehicleCertificateRecordNo_First(
		String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		List<VRIssueEquipmentCertificate> list = findByvehicleCertificateRecordNo(vehicleCertificateRecordNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByvehicleCertificateRecordNo_Last(
		String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByvehicleCertificateRecordNo_Last(vehicleCertificateRecordNo,
				orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleCertificateRecordNo=");
		msg.append(vehicleCertificateRecordNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByvehicleCertificateRecordNo_Last(
		String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		int count = countByvehicleCertificateRecordNo(vehicleCertificateRecordNo);

		if (count == 0) {
			return null;
		}

		List<VRIssueEquipmentCertificate> list = findByvehicleCertificateRecordNo(vehicleCertificateRecordNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	 *
	 * @param id the primary key of the current vr issue equipment certificate
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate[] findByvehicleCertificateRecordNo_PrevAndNext(
		long id, String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueEquipmentCertificate[] array = new VRIssueEquipmentCertificateImpl[3];

			array[0] = getByvehicleCertificateRecordNo_PrevAndNext(session,
					vrIssueEquipmentCertificate, vehicleCertificateRecordNo,
					orderByComparator, true);

			array[1] = vrIssueEquipmentCertificate;

			array[2] = getByvehicleCertificateRecordNo_PrevAndNext(session,
					vrIssueEquipmentCertificate, vehicleCertificateRecordNo,
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

	protected VRIssueEquipmentCertificate getByvehicleCertificateRecordNo_PrevAndNext(
		Session session,
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate,
		String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

		boolean bindVehicleCertificateRecordNo = false;

		if (vehicleCertificateRecordNo == null) {
			query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_1);
		}
		else if (vehicleCertificateRecordNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_3);
		}
		else {
			bindVehicleCertificateRecordNo = true;

			query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_2);
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
			query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleCertificateRecordNo) {
			qPos.add(vehicleCertificateRecordNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueEquipmentCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueEquipmentCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63; from the database.
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 */
	@Override
	public void removeByvehicleCertificateRecordNo(
		String vehicleCertificateRecordNo) {
		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : findByvehicleCertificateRecordNo(
				vehicleCertificateRecordNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrIssueEquipmentCertificate);
		}
	}

	/**
	 * Returns the number of vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	 *
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @return the number of matching vr issue equipment certificates
	 */
	@Override
	public int countByvehicleCertificateRecordNo(
		String vehicleCertificateRecordNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLECERTIFICATERECORDNO;

		Object[] finderArgs = new Object[] { vehicleCertificateRecordNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			boolean bindVehicleCertificateRecordNo = false;

			if (vehicleCertificateRecordNo == null) {
				query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_1);
			}
			else if (vehicleCertificateRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_3);
			}
			else {
				bindVehicleCertificateRecordNo = true;

				query.append(_FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleCertificateRecordNo) {
					qPos.add(vehicleCertificateRecordNo);
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

	private static final String _FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_1 =
		"vrIssueEquipmentCertificate.vehicleCertificateRecordNo IS NULL";
	private static final String _FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_2 =
		"vrIssueEquipmentCertificate.vehicleCertificateRecordNo = ?";
	private static final String _FINDER_COLUMN_VEHICLECERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_3 =
		"(vrIssueEquipmentCertificate.vehicleCertificateRecordNo IS NULL OR vrIssueEquipmentCertificate.vehicleCertificateRecordNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTNO_CERTIFICATERECORDNO =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByApplicantNo_CertificateRecordNo",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO_CERTIFICATERECORDNO =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByApplicantNo_CertificateRecordNo",
			new String[] { String.class.getName(), String.class.getName() },
			VRIssueEquipmentCertificateModelImpl.APPLICANTNO_COLUMN_BITMASK |
			VRIssueEquipmentCertificateModelImpl.VEHICLECERTIFICATERECORDNO_COLUMN_BITMASK |
			VRIssueEquipmentCertificateModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTNO_CERTIFICATERECORDNO =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByApplicantNo_CertificateRecordNo",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @return the matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		String applicantNo, String vehicleCertificateRecordNo) {
		return findByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @return the range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		String applicantNo, String vehicleCertificateRecordNo, int start,
		int end) {
		return findByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		String applicantNo, String vehicleCertificateRecordNo, int start,
		int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return findByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		String applicantNo, String vehicleCertificateRecordNo, int start,
		int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO_CERTIFICATERECORDNO;
			finderArgs = new Object[] { applicantNo, vehicleCertificateRecordNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTNO_CERTIFICATERECORDNO;
			finderArgs = new Object[] {
					applicantNo, vehicleCertificateRecordNo,
					
					start, end, orderByComparator
				};
		}

		List<VRIssueEquipmentCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueEquipmentCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : list) {
					if (!Objects.equals(applicantNo,
								vrIssueEquipmentCertificate.getApplicantNo()) ||
							!Objects.equals(vehicleCertificateRecordNo,
								vrIssueEquipmentCertificate.getVehicleCertificateRecordNo())) {
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

			query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			boolean bindApplicantNo = false;

			if (applicantNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_1);
			}
			else if (applicantNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_3);
			}
			else {
				bindApplicantNo = true;

				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_2);
			}

			boolean bindVehicleCertificateRecordNo = false;

			if (vehicleCertificateRecordNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_1);
			}
			else if (vehicleCertificateRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_3);
			}
			else {
				bindVehicleCertificateRecordNo = true;

				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantNo) {
					qPos.add(applicantNo);
				}

				if (bindVehicleCertificateRecordNo) {
					qPos.add(vehicleCertificateRecordNo);
				}

				if (!pagination) {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByApplicantNo_CertificateRecordNo_First(
		String applicantNo, String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByApplicantNo_CertificateRecordNo_First(applicantNo,
				vehicleCertificateRecordNo, orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantNo=");
		msg.append(applicantNo);

		msg.append(", vehicleCertificateRecordNo=");
		msg.append(vehicleCertificateRecordNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByApplicantNo_CertificateRecordNo_First(
		String applicantNo, String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		List<VRIssueEquipmentCertificate> list = findByApplicantNo_CertificateRecordNo(applicantNo,
				vehicleCertificateRecordNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByApplicantNo_CertificateRecordNo_Last(
		String applicantNo, String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByApplicantNo_CertificateRecordNo_Last(applicantNo,
				vehicleCertificateRecordNo, orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantNo=");
		msg.append(applicantNo);

		msg.append(", vehicleCertificateRecordNo=");
		msg.append(vehicleCertificateRecordNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByApplicantNo_CertificateRecordNo_Last(
		String applicantNo, String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		int count = countByApplicantNo_CertificateRecordNo(applicantNo,
				vehicleCertificateRecordNo);

		if (count == 0) {
			return null;
		}

		List<VRIssueEquipmentCertificate> list = findByApplicantNo_CertificateRecordNo(applicantNo,
				vehicleCertificateRecordNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * @param id the primary key of the current vr issue equipment certificate
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate[] findByApplicantNo_CertificateRecordNo_PrevAndNext(
		long id, String applicantNo, String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueEquipmentCertificate[] array = new VRIssueEquipmentCertificateImpl[3];

			array[0] = getByApplicantNo_CertificateRecordNo_PrevAndNext(session,
					vrIssueEquipmentCertificate, applicantNo,
					vehicleCertificateRecordNo, orderByComparator, true);

			array[1] = vrIssueEquipmentCertificate;

			array[2] = getByApplicantNo_CertificateRecordNo_PrevAndNext(session,
					vrIssueEquipmentCertificate, applicantNo,
					vehicleCertificateRecordNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssueEquipmentCertificate getByApplicantNo_CertificateRecordNo_PrevAndNext(
		Session session,
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate,
		String applicantNo, String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

		boolean bindApplicantNo = false;

		if (applicantNo == null) {
			query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_1);
		}
		else if (applicantNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_3);
		}
		else {
			bindApplicantNo = true;

			query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_2);
		}

		boolean bindVehicleCertificateRecordNo = false;

		if (vehicleCertificateRecordNo == null) {
			query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_1);
		}
		else if (vehicleCertificateRecordNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_3);
		}
		else {
			bindVehicleCertificateRecordNo = true;

			query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_2);
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
			query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantNo) {
			qPos.add(applicantNo);
		}

		if (bindVehicleCertificateRecordNo) {
			qPos.add(vehicleCertificateRecordNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueEquipmentCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueEquipmentCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63; from the database.
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 */
	@Override
	public void removeByApplicantNo_CertificateRecordNo(String applicantNo,
		String vehicleCertificateRecordNo) {
		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : findByApplicantNo_CertificateRecordNo(
				applicantNo, vehicleCertificateRecordNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrIssueEquipmentCertificate);
		}
	}

	/**
	 * Returns the number of vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param vehicleCertificateRecordNo the vehicle certificate record no
	 * @return the number of matching vr issue equipment certificates
	 */
	@Override
	public int countByApplicantNo_CertificateRecordNo(String applicantNo,
		String vehicleCertificateRecordNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTNO_CERTIFICATERECORDNO;

		Object[] finderArgs = new Object[] {
				applicantNo, vehicleCertificateRecordNo
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			boolean bindApplicantNo = false;

			if (applicantNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_1);
			}
			else if (applicantNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_3);
			}
			else {
				bindApplicantNo = true;

				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_2);
			}

			boolean bindVehicleCertificateRecordNo = false;

			if (vehicleCertificateRecordNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_1);
			}
			else if (vehicleCertificateRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_3);
			}
			else {
				bindVehicleCertificateRecordNo = true;

				query.append(_FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantNo) {
					qPos.add(applicantNo);
				}

				if (bindVehicleCertificateRecordNo) {
					qPos.add(vehicleCertificateRecordNo);
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

	private static final String _FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_1 =
		"vrIssueEquipmentCertificate.applicantNo IS NULL AND ";
	private static final String _FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_2 =
		"vrIssueEquipmentCertificate.applicantNo = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_APPLICANTNO_3 =
		"(vrIssueEquipmentCertificate.applicantNo IS NULL OR vrIssueEquipmentCertificate.applicantNo = '') AND ";
	private static final String _FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_1 =
		"vrIssueEquipmentCertificate.vehicleCertificateRecordNo IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_2 =
		"vrIssueEquipmentCertificate.vehicleCertificateRecordNo = ?";
	private static final String _FINDER_COLUMN_APPLICANTNO_CERTIFICATERECORDNO_VEHICLECERTIFICATERECORDNO_3 =
		"(vrIssueEquipmentCertificate.vehicleCertificateRecordNo IS NULL OR vrIssueEquipmentCertificate.vehicleCertificateRecordNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTNO =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApplicantNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApplicantNo",
			new String[] { String.class.getName() },
			VRIssueEquipmentCertificateModelImpl.APPLICANTNO_COLUMN_BITMASK |
			VRIssueEquipmentCertificateModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTNO = new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByApplicantNo", new String[] { String.class.getName() });

	/**
	 * Returns all the vr issue equipment certificates where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @return the matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByApplicantNo(
		String applicantNo) {
		return findByApplicantNo(applicantNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue equipment certificates where applicantNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @return the range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByApplicantNo(
		String applicantNo, int start, int end) {
		return findByApplicantNo(applicantNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByApplicantNo(
		String applicantNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return findByApplicantNo(applicantNo, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByApplicantNo(
		String applicantNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO;
			finderArgs = new Object[] { applicantNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTNO;
			finderArgs = new Object[] { applicantNo, start, end, orderByComparator };
		}

		List<VRIssueEquipmentCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueEquipmentCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : list) {
					if (!Objects.equals(applicantNo,
								vrIssueEquipmentCertificate.getApplicantNo())) {
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

			query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			boolean bindApplicantNo = false;

			if (applicantNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_1);
			}
			else if (applicantNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_3);
			}
			else {
				bindApplicantNo = true;

				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantNo) {
					qPos.add(applicantNo);
				}

				if (!pagination) {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByApplicantNo_First(
		String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByApplicantNo_First(applicantNo,
				orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantNo=");
		msg.append(applicantNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByApplicantNo_First(
		String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		List<VRIssueEquipmentCertificate> list = findByApplicantNo(applicantNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByApplicantNo_Last(
		String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByApplicantNo_Last(applicantNo,
				orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantNo=");
		msg.append(applicantNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByApplicantNo_Last(
		String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		int count = countByApplicantNo(applicantNo);

		if (count == 0) {
			return null;
		}

		List<VRIssueEquipmentCertificate> list = findByApplicantNo(applicantNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	 *
	 * @param id the primary key of the current vr issue equipment certificate
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate[] findByApplicantNo_PrevAndNext(
		long id, String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueEquipmentCertificate[] array = new VRIssueEquipmentCertificateImpl[3];

			array[0] = getByApplicantNo_PrevAndNext(session,
					vrIssueEquipmentCertificate, applicantNo,
					orderByComparator, true);

			array[1] = vrIssueEquipmentCertificate;

			array[2] = getByApplicantNo_PrevAndNext(session,
					vrIssueEquipmentCertificate, applicantNo,
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

	protected VRIssueEquipmentCertificate getByApplicantNo_PrevAndNext(
		Session session,
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate,
		String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

		boolean bindApplicantNo = false;

		if (applicantNo == null) {
			query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_1);
		}
		else if (applicantNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_3);
		}
		else {
			bindApplicantNo = true;

			query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_2);
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
			query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantNo) {
			qPos.add(applicantNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueEquipmentCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueEquipmentCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue equipment certificates where applicantNo = &#63; from the database.
	 *
	 * @param applicantNo the applicant no
	 */
	@Override
	public void removeByApplicantNo(String applicantNo) {
		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : findByApplicantNo(
				applicantNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueEquipmentCertificate);
		}
	}

	/**
	 * Returns the number of vr issue equipment certificates where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @return the number of matching vr issue equipment certificates
	 */
	@Override
	public int countByApplicantNo(String applicantNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTNO;

		Object[] finderArgs = new Object[] { applicantNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			boolean bindApplicantNo = false;

			if (applicantNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_1);
			}
			else if (applicantNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_3);
			}
			else {
				bindApplicantNo = true;

				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantNo) {
					qPos.add(applicantNo);
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

	private static final String _FINDER_COLUMN_APPLICANTNO_APPLICANTNO_1 = "vrIssueEquipmentCertificate.applicantNo IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTNO_APPLICANTNO_2 = "vrIssueEquipmentCertificate.applicantNo = ?";
	private static final String _FINDER_COLUMN_APPLICANTNO_APPLICANTNO_3 = "(vrIssueEquipmentCertificate.applicantNo IS NULL OR vrIssueEquipmentCertificate.applicantNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydossierID_MtCore",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydossierID_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRIssueEquipmentCertificateModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRIssueEquipmentCertificateModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueEquipmentCertificateModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE = new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydossierID_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore) {
		return findBydossierID_MtCore(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @return the range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end) {
		return findBydossierID_MtCore(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return findBydossierID_MtCore(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE;
			finderArgs = new Object[] { dossierId, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID_MTCORE;
			finderArgs = new Object[] {
					dossierId, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRIssueEquipmentCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueEquipmentCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : list) {
					if ((dossierId != vrIssueEquipmentCertificate.getDossierId()) ||
							(mtCore != vrIssueEquipmentCertificate.getMtCore())) {
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

			query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(mtCore);

				if (!pagination) {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findBydossierID_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchBydossierID_MtCore_First(dossierId,
				mtCore, orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchBydossierID_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		List<VRIssueEquipmentCertificate> list = findBydossierID_MtCore(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findBydossierID_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchBydossierID_MtCore_Last(dossierId,
				mtCore, orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchBydossierID_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		int count = countBydossierID_MtCore(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRIssueEquipmentCertificate> list = findBydossierID_MtCore(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr issue equipment certificate
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate[] findBydossierID_MtCore_PrevAndNext(
		long id, long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueEquipmentCertificate[] array = new VRIssueEquipmentCertificateImpl[3];

			array[0] = getBydossierID_MtCore_PrevAndNext(session,
					vrIssueEquipmentCertificate, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrIssueEquipmentCertificate;

			array[2] = getBydossierID_MtCore_PrevAndNext(session,
					vrIssueEquipmentCertificate, dossierId, mtCore,
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

	protected VRIssueEquipmentCertificate getBydossierID_MtCore_PrevAndNext(
		Session session,
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate,
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

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
			query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueEquipmentCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueEquipmentCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeBydossierID_MtCore(long dossierId, long mtCore) {
		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : findBydossierID_MtCore(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueEquipmentCertificate);
		}
	}

	/**
	 * Returns the number of vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr issue equipment certificates
	 */
	@Override
	public int countBydossierID_MtCore(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2 = "vrIssueEquipmentCertificate.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2 = "vrIssueEquipmentCertificate.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEID = new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByissueId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID =
		new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByissueId",
			new String[] { Long.class.getName() },
			VRIssueEquipmentCertificateModelImpl.ISSUEID_COLUMN_BITMASK |
			VRIssueEquipmentCertificateModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEID = new FinderPath(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissueId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr issue equipment certificates where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @return the matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByissueId(long issueId) {
		return findByissueId(issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue equipment certificates where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @return the range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByissueId(long issueId,
		int start, int end) {
		return findByissueId(issueId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByissueId(long issueId,
		int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return findByissueId(issueId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates where issueId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueId the issue ID
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findByissueId(long issueId,
		int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
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

		List<VRIssueEquipmentCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueEquipmentCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : list) {
					if ((issueId != vrIssueEquipmentCertificate.getIssueId())) {
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

			query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_ISSUEID_ISSUEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueId);

				if (!pagination) {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr issue equipment certificate in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByissueId_First(long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByissueId_First(issueId,
				orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr issue equipment certificate in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByissueId_First(long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		List<VRIssueEquipmentCertificate> list = findByissueId(issueId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByissueId_Last(long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByissueId_Last(issueId,
				orderByComparator);

		if (vrIssueEquipmentCertificate != null) {
			return vrIssueEquipmentCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueId=");
		msg.append(issueId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueEquipmentCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr issue equipment certificate in the ordered set where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByissueId_Last(long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		int count = countByissueId(issueId);

		if (count == 0) {
			return null;
		}

		List<VRIssueEquipmentCertificate> list = findByissueId(issueId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where issueId = &#63;.
	 *
	 * @param id the primary key of the current vr issue equipment certificate
	 * @param issueId the issue ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate[] findByissueId_PrevAndNext(long id,
		long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssueEquipmentCertificate[] array = new VRIssueEquipmentCertificateImpl[3];

			array[0] = getByissueId_PrevAndNext(session,
					vrIssueEquipmentCertificate, issueId, orderByComparator,
					true);

			array[1] = vrIssueEquipmentCertificate;

			array[2] = getByissueId_PrevAndNext(session,
					vrIssueEquipmentCertificate, issueId, orderByComparator,
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

	protected VRIssueEquipmentCertificate getByissueId_PrevAndNext(
		Session session,
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate, long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

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
			query.append(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(issueId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssueEquipmentCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssueEquipmentCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issue equipment certificates where issueId = &#63; from the database.
	 *
	 * @param issueId the issue ID
	 */
	@Override
	public void removeByissueId(long issueId) {
		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : findByissueId(
				issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssueEquipmentCertificate);
		}
	}

	/**
	 * Returns the number of vr issue equipment certificates where issueId = &#63;.
	 *
	 * @param issueId the issue ID
	 * @return the number of matching vr issue equipment certificates
	 */
	@Override
	public int countByissueId(long issueId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUEID;

		Object[] finderArgs = new Object[] { issueId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE_WHERE);

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

	private static final String _FINDER_COLUMN_ISSUEID_ISSUEID_2 = "vrIssueEquipmentCertificate.issueId = ?";

	public VRIssueEquipmentCertificatePersistenceImpl() {
		setModelClass(VRIssueEquipmentCertificate.class);
	}

	/**
	 * Caches the vr issue equipment certificate in the entity cache if it is enabled.
	 *
	 * @param vrIssueEquipmentCertificate the vr issue equipment certificate
	 */
	@Override
	public void cacheResult(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		entityCache.putResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			vrIssueEquipmentCertificate.getPrimaryKey(),
			vrIssueEquipmentCertificate);

		vrIssueEquipmentCertificate.resetOriginalValues();
	}

	/**
	 * Caches the vr issue equipment certificates in the entity cache if it is enabled.
	 *
	 * @param vrIssueEquipmentCertificates the vr issue equipment certificates
	 */
	@Override
	public void cacheResult(
		List<VRIssueEquipmentCertificate> vrIssueEquipmentCertificates) {
		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : vrIssueEquipmentCertificates) {
			if (entityCache.getResult(
						VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
						VRIssueEquipmentCertificateImpl.class,
						vrIssueEquipmentCertificate.getPrimaryKey()) == null) {
				cacheResult(vrIssueEquipmentCertificate);
			}
			else {
				vrIssueEquipmentCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr issue equipment certificates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRIssueEquipmentCertificateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr issue equipment certificate.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		entityCache.removeResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			vrIssueEquipmentCertificate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRIssueEquipmentCertificate> vrIssueEquipmentCertificates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : vrIssueEquipmentCertificates) {
			entityCache.removeResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
				VRIssueEquipmentCertificateImpl.class,
				vrIssueEquipmentCertificate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr issue equipment certificate with the primary key. Does not add the vr issue equipment certificate to the database.
	 *
	 * @param id the primary key for the new vr issue equipment certificate
	 * @return the new vr issue equipment certificate
	 */
	@Override
	public VRIssueEquipmentCertificate create(long id) {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = new VRIssueEquipmentCertificateImpl();

		vrIssueEquipmentCertificate.setNew(true);
		vrIssueEquipmentCertificate.setPrimaryKey(id);

		return vrIssueEquipmentCertificate;
	}

	/**
	 * Removes the vr issue equipment certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr issue equipment certificate
	 * @return the vr issue equipment certificate that was removed
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate remove(long id)
		throws NoSuchVRIssueEquipmentCertificateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr issue equipment certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr issue equipment certificate
	 * @return the vr issue equipment certificate that was removed
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate remove(Serializable primaryKey)
		throws NoSuchVRIssueEquipmentCertificateException {
		Session session = null;

		try {
			session = openSession();

			VRIssueEquipmentCertificate vrIssueEquipmentCertificate = (VRIssueEquipmentCertificate)session.get(VRIssueEquipmentCertificateImpl.class,
					primaryKey);

			if (vrIssueEquipmentCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRIssueEquipmentCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrIssueEquipmentCertificate);
		}
		catch (NoSuchVRIssueEquipmentCertificateException nsee) {
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
	protected VRIssueEquipmentCertificate removeImpl(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		vrIssueEquipmentCertificate = toUnwrappedModel(vrIssueEquipmentCertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrIssueEquipmentCertificate)) {
				vrIssueEquipmentCertificate = (VRIssueEquipmentCertificate)session.get(VRIssueEquipmentCertificateImpl.class,
						vrIssueEquipmentCertificate.getPrimaryKeyObj());
			}

			if (vrIssueEquipmentCertificate != null) {
				session.delete(vrIssueEquipmentCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrIssueEquipmentCertificate != null) {
			clearCache(vrIssueEquipmentCertificate);
		}

		return vrIssueEquipmentCertificate;
	}

	@Override
	public VRIssueEquipmentCertificate updateImpl(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		vrIssueEquipmentCertificate = toUnwrappedModel(vrIssueEquipmentCertificate);

		boolean isNew = vrIssueEquipmentCertificate.isNew();

		VRIssueEquipmentCertificateModelImpl vrIssueEquipmentCertificateModelImpl =
			(VRIssueEquipmentCertificateModelImpl)vrIssueEquipmentCertificate;

		Session session = null;

		try {
			session = openSession();

			if (vrIssueEquipmentCertificate.isNew()) {
				session.save(vrIssueEquipmentCertificate);

				vrIssueEquipmentCertificate.setNew(false);
			}
			else {
				vrIssueEquipmentCertificate = (VRIssueEquipmentCertificate)session.merge(vrIssueEquipmentCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!VRIssueEquipmentCertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrIssueEquipmentCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getOriginalIssueVehicleCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID,
					args);

				args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getIssueVehicleCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID,
					args);
			}

			if ((vrIssueEquipmentCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATERECORDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getOriginalVehicleCertificateRecordNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLECERTIFICATERECORDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATERECORDNO,
					args);

				args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getVehicleCertificateRecordNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLECERTIFICATERECORDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECERTIFICATERECORDNO,
					args);
			}

			if ((vrIssueEquipmentCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO_CERTIFICATERECORDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getOriginalApplicantNo(),
						vrIssueEquipmentCertificateModelImpl.getOriginalVehicleCertificateRecordNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTNO_CERTIFICATERECORDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO_CERTIFICATERECORDNO,
					args);

				args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getApplicantNo(),
						vrIssueEquipmentCertificateModelImpl.getVehicleCertificateRecordNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTNO_CERTIFICATERECORDNO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO_CERTIFICATERECORDNO,
					args);
			}

			if ((vrIssueEquipmentCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getOriginalApplicantNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO,
					args);

				args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getApplicantNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO,
					args);
			}

			if ((vrIssueEquipmentCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getOriginalDossierId(),
						vrIssueEquipmentCertificateModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);

				args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getDossierId(),
						vrIssueEquipmentCertificateModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);
			}

			if ((vrIssueEquipmentCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getOriginalIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID,
					args);

				args = new Object[] {
						vrIssueEquipmentCertificateModelImpl.getIssueId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEID,
					args);
			}
		}

		entityCache.putResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueEquipmentCertificateImpl.class,
			vrIssueEquipmentCertificate.getPrimaryKey(),
			vrIssueEquipmentCertificate, false);

		vrIssueEquipmentCertificate.resetOriginalValues();

		return vrIssueEquipmentCertificate;
	}

	protected VRIssueEquipmentCertificate toUnwrappedModel(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		if (vrIssueEquipmentCertificate instanceof VRIssueEquipmentCertificateImpl) {
			return vrIssueEquipmentCertificate;
		}

		VRIssueEquipmentCertificateImpl vrIssueEquipmentCertificateImpl = new VRIssueEquipmentCertificateImpl();

		vrIssueEquipmentCertificateImpl.setNew(vrIssueEquipmentCertificate.isNew());
		vrIssueEquipmentCertificateImpl.setPrimaryKey(vrIssueEquipmentCertificate.getPrimaryKey());

		vrIssueEquipmentCertificateImpl.setId(vrIssueEquipmentCertificate.getId());
		vrIssueEquipmentCertificateImpl.setMtCore(vrIssueEquipmentCertificate.getMtCore());
		vrIssueEquipmentCertificateImpl.setDossierId(vrIssueEquipmentCertificate.getDossierId());
		vrIssueEquipmentCertificateImpl.setIssueId(vrIssueEquipmentCertificate.getIssueId());
		vrIssueEquipmentCertificateImpl.setIssueVehicleCertificateId(vrIssueEquipmentCertificate.getIssueVehicleCertificateId());
		vrIssueEquipmentCertificateImpl.setVehicleCertificateRecordNo(vrIssueEquipmentCertificate.getVehicleCertificateRecordNo());
		vrIssueEquipmentCertificateImpl.setEquipmentName(vrIssueEquipmentCertificate.getEquipmentName());
		vrIssueEquipmentCertificateImpl.setEquipmentType(vrIssueEquipmentCertificate.getEquipmentType());
		vrIssueEquipmentCertificateImpl.setEquipmentCertificateType(vrIssueEquipmentCertificate.getEquipmentCertificateType());
		vrIssueEquipmentCertificateImpl.setEquipmentDocumentNo(vrIssueEquipmentCertificate.getEquipmentDocumentNo());
		vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordNo(vrIssueEquipmentCertificate.getEquipmentCertificateRecordNo());
		vrIssueEquipmentCertificateImpl.setEquipmentExamRecordNo(vrIssueEquipmentCertificate.getEquipmentExamRecordNo());
		vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordId(vrIssueEquipmentCertificate.getEquipmentCertificateRecordId());
		vrIssueEquipmentCertificateImpl.setTotalQuantity(vrIssueEquipmentCertificate.getTotalQuantity());
		vrIssueEquipmentCertificateImpl.setTotalProductUsed(vrIssueEquipmentCertificate.getTotalProductUsed());
		vrIssueEquipmentCertificateImpl.setTotalInUse(vrIssueEquipmentCertificate.getTotalInUse());
		vrIssueEquipmentCertificateImpl.setTotalNotUsed(vrIssueEquipmentCertificate.getTotalNotUsed());
		vrIssueEquipmentCertificateImpl.setApplicantNo(vrIssueEquipmentCertificate.getApplicantNo());
		vrIssueEquipmentCertificateImpl.setApplicantName(vrIssueEquipmentCertificate.getApplicantName());
		vrIssueEquipmentCertificateImpl.setApplicantAddress(vrIssueEquipmentCertificate.getApplicantAddress());
		vrIssueEquipmentCertificateImpl.setProductionPlantName(vrIssueEquipmentCertificate.getProductionPlantName());
		vrIssueEquipmentCertificateImpl.setProductionPlantAddress(vrIssueEquipmentCertificate.getProductionPlantAddress());
		vrIssueEquipmentCertificateImpl.setVehicleCertificateRecordDate(vrIssueEquipmentCertificate.getVehicleCertificateRecordDate());
		vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordDate(vrIssueEquipmentCertificate.getEquipmentCertificateRecordDate());
		vrIssueEquipmentCertificateImpl.setModifyDate(vrIssueEquipmentCertificate.getModifyDate());
		vrIssueEquipmentCertificateImpl.setSyncDate(vrIssueEquipmentCertificate.getSyncDate());

		return vrIssueEquipmentCertificateImpl;
	}

	/**
	 * Returns the vr issue equipment certificate with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr issue equipment certificate
	 * @return the vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRIssueEquipmentCertificateException {
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByPrimaryKey(primaryKey);

		if (vrIssueEquipmentCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRIssueEquipmentCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrIssueEquipmentCertificate;
	}

	/**
	 * Returns the vr issue equipment certificate with the primary key or throws a {@link NoSuchVRIssueEquipmentCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the vr issue equipment certificate
	 * @return the vr issue equipment certificate
	 * @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate findByPrimaryKey(long id)
		throws NoSuchVRIssueEquipmentCertificateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr issue equipment certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr issue equipment certificate
	 * @return the vr issue equipment certificate, or <code>null</code> if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
				VRIssueEquipmentCertificateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = (VRIssueEquipmentCertificate)serializable;

		if (vrIssueEquipmentCertificate == null) {
			Session session = null;

			try {
				session = openSession();

				vrIssueEquipmentCertificate = (VRIssueEquipmentCertificate)session.get(VRIssueEquipmentCertificateImpl.class,
						primaryKey);

				if (vrIssueEquipmentCertificate != null) {
					cacheResult(vrIssueEquipmentCertificate);
				}
				else {
					entityCache.putResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
						VRIssueEquipmentCertificateImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueEquipmentCertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrIssueEquipmentCertificate;
	}

	/**
	 * Returns the vr issue equipment certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr issue equipment certificate
	 * @return the vr issue equipment certificate, or <code>null</code> if a vr issue equipment certificate with the primary key could not be found
	 */
	@Override
	public VRIssueEquipmentCertificate fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRIssueEquipmentCertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRIssueEquipmentCertificate> map = new HashMap<Serializable, VRIssueEquipmentCertificate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRIssueEquipmentCertificate vrIssueEquipmentCertificate = fetchByPrimaryKey(primaryKey);

			if (vrIssueEquipmentCertificate != null) {
				map.put(primaryKey, vrIssueEquipmentCertificate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueEquipmentCertificateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(VRIssueEquipmentCertificate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE_PKS_IN);

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

			for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : (List<VRIssueEquipmentCertificate>)q.list()) {
				map.put(vrIssueEquipmentCertificate.getPrimaryKeyObj(),
					vrIssueEquipmentCertificate);

				cacheResult(vrIssueEquipmentCertificate);

				uncachedPrimaryKeys.remove(vrIssueEquipmentCertificate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRIssueEquipmentCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueEquipmentCertificateImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr issue equipment certificates.
	 *
	 * @return the vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issue equipment certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @return the range of vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findAll(int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issue equipment certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issue equipment certificates
	 * @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr issue equipment certificates
	 */
	@Override
	public List<VRIssueEquipmentCertificate> findAll(int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
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

		List<VRIssueEquipmentCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssueEquipmentCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE;

				if (pagination) {
					sql = sql.concat(VRIssueEquipmentCertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssueEquipmentCertificate>)QueryUtil.list(q,
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
	 * Removes all the vr issue equipment certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : findAll()) {
			remove(vrIssueEquipmentCertificate);
		}
	}

	/**
	 * Returns the number of vr issue equipment certificates.
	 *
	 * @return the number of vr issue equipment certificates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE);

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
		return VRIssueEquipmentCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr issue equipment certificate persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRIssueEquipmentCertificateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE = "SELECT vrIssueEquipmentCertificate FROM VRIssueEquipmentCertificate vrIssueEquipmentCertificate";
	private static final String _SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE_PKS_IN =
		"SELECT vrIssueEquipmentCertificate FROM VRIssueEquipmentCertificate vrIssueEquipmentCertificate WHERE id IN (";
	private static final String _SQL_SELECT_VRISSUEEQUIPMENTCERTIFICATE_WHERE = "SELECT vrIssueEquipmentCertificate FROM VRIssueEquipmentCertificate vrIssueEquipmentCertificate WHERE ";
	private static final String _SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE = "SELECT COUNT(vrIssueEquipmentCertificate) FROM VRIssueEquipmentCertificate vrIssueEquipmentCertificate";
	private static final String _SQL_COUNT_VRISSUEEQUIPMENTCERTIFICATE_WHERE = "SELECT COUNT(vrIssueEquipmentCertificate) FROM VRIssueEquipmentCertificate vrIssueEquipmentCertificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrIssueEquipmentCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRIssueEquipmentCertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRIssueEquipmentCertificate exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRIssueEquipmentCertificatePersistenceImpl.class);
}