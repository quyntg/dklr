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

import com.fds.vr.business.exception.NoSuchVRExpireCertificateException;
import com.fds.vr.business.model.VRExpireCertificate;
import com.fds.vr.business.model.impl.VRExpireCertificateImpl;
import com.fds.vr.business.model.impl.VRExpireCertificateModelImpl;
import com.fds.vr.business.service.persistence.VRExpireCertificatePersistence;

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
 * The persistence implementation for the vr expire certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRExpireCertificatePersistence
 * @see com.fds.vr.business.service.persistence.VRExpireCertificateUtil
 * @generated
 */
@ProviderType
public class VRExpireCertificatePersistenceImpl extends BasePersistenceImpl<VRExpireCertificate>
	implements VRExpireCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRExpireCertificateUtil} to access the vr expire certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRExpireCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRExpireCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRExpireCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRExpireCertificateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_vehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRExpireCertificateModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_vehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr expire certificate
	 * @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId)
		throws NoSuchVRExpireCertificateException {
		VRExpireCertificate vrExpireCertificate = fetchByF_vehicleTypeCertificateId(vehicleTypeCertificateId);

		if (vrExpireCertificate == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("vehicleTypeCertificateId=");
			msg.append(vehicleTypeCertificateId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRExpireCertificateException(msg.toString());
		}

		return vrExpireCertificate;
	}

	/**
	 * Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate fetchByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return fetchByF_vehicleTypeCertificateId(vehicleTypeCertificateId, true);
	}

	/**
	 * Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate fetchByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID,
					finderArgs, this);
		}

		if (result instanceof VRExpireCertificate) {
			VRExpireCertificate vrExpireCertificate = (VRExpireCertificate)result;

			if ((vehicleTypeCertificateId != vrExpireCertificate.getVehicleTypeCertificateId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VREXPIRECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_F_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				List<VRExpireCertificate> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRExpireCertificatePersistenceImpl.fetchByF_vehicleTypeCertificateId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRExpireCertificate vrExpireCertificate = list.get(0);

					result = vrExpireCertificate;

					cacheResult(vrExpireCertificate);

					if ((vrExpireCertificate.getVehicleTypeCertificateId() != vehicleTypeCertificateId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID,
							finderArgs, vrExpireCertificate);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID,
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
			return (VRExpireCertificate)result;
		}
	}

	/**
	 * Removes the vr expire certificate where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the vr expire certificate that was removed
	 */
	@Override
	public VRExpireCertificate removeByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId)
		throws NoSuchVRExpireCertificateException {
		VRExpireCertificate vrExpireCertificate = findByF_vehicleTypeCertificateId(vehicleTypeCertificateId);

		return remove(vrExpireCertificate);
	}

	/**
	 * Returns the number of vr expire certificates where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr expire certificates
	 */
	@Override
	public int countByF_vehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VREXPIRECERTIFICATE_WHERE);

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
		"vrExpireCertificate.vehicleTypeCertificateId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOSSIERID = new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRExpireCertificateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBydossierId", new String[] { Long.class.getName() },
			VRExpireCertificateModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the vr expire certificate where dossierId = &#63; or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr expire certificate
	 * @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate findBydossierId(long dossierId)
		throws NoSuchVRExpireCertificateException {
		VRExpireCertificate vrExpireCertificate = fetchBydossierId(dossierId);

		if (vrExpireCertificate == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRExpireCertificateException(msg.toString());
		}

		return vrExpireCertificate;
	}

	/**
	 * Returns the vr expire certificate where dossierId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate fetchBydossierId(long dossierId) {
		return fetchBydossierId(dossierId, true);
	}

	/**
	 * Returns the vr expire certificate where dossierId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate fetchBydossierId(long dossierId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_DOSSIERID,
					finderArgs, this);
		}

		if (result instanceof VRExpireCertificate) {
			VRExpireCertificate vrExpireCertificate = (VRExpireCertificate)result;

			if ((dossierId != vrExpireCertificate.getDossierId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VREXPIRECERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				List<VRExpireCertificate> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRExpireCertificatePersistenceImpl.fetchBydossierId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRExpireCertificate vrExpireCertificate = list.get(0);

					result = vrExpireCertificate;

					cacheResult(vrExpireCertificate);

					if ((vrExpireCertificate.getDossierId() != dossierId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERID,
							finderArgs, vrExpireCertificate);
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
			return (VRExpireCertificate)result;
		}
	}

	/**
	 * Removes the vr expire certificate where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @return the vr expire certificate that was removed
	 */
	@Override
	public VRExpireCertificate removeBydossierId(long dossierId)
		throws NoSuchVRExpireCertificateException {
		VRExpireCertificate vrExpireCertificate = findBydossierId(dossierId);

		return remove(vrExpireCertificate);
	}

	/**
	 * Returns the number of vr expire certificates where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr expire certificates
	 */
	@Override
	public int countBydossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VREXPIRECERTIFICATE_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrExpireCertificate.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOSSIERSTATUS =
		new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRExpireCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_dossierStatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERSTATUS =
		new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED,
			VRExpireCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_dossierStatus",
			new String[] { String.class.getName() },
			VRExpireCertificateModelImpl.DOSSIERSTATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DOSSIERSTATUS = new FinderPath(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_dossierStatus", new String[] { String.class.getName() });

	/**
	 * Returns all the vr expire certificates where dossierStatus = &#63;.
	 *
	 * @param dossierStatus the dossier status
	 * @return the matching vr expire certificates
	 */
	@Override
	public List<VRExpireCertificate> findByF_dossierStatus(String dossierStatus) {
		return findByF_dossierStatus(dossierStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr expire certificates where dossierStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierStatus the dossier status
	 * @param start the lower bound of the range of vr expire certificates
	 * @param end the upper bound of the range of vr expire certificates (not inclusive)
	 * @return the range of matching vr expire certificates
	 */
	@Override
	public List<VRExpireCertificate> findByF_dossierStatus(
		String dossierStatus, int start, int end) {
		return findByF_dossierStatus(dossierStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr expire certificates where dossierStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierStatus the dossier status
	 * @param start the lower bound of the range of vr expire certificates
	 * @param end the upper bound of the range of vr expire certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr expire certificates
	 */
	@Override
	public List<VRExpireCertificate> findByF_dossierStatus(
		String dossierStatus, int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		return findByF_dossierStatus(dossierStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr expire certificates where dossierStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierStatus the dossier status
	 * @param start the lower bound of the range of vr expire certificates
	 * @param end the upper bound of the range of vr expire certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr expire certificates
	 */
	@Override
	public List<VRExpireCertificate> findByF_dossierStatus(
		String dossierStatus, int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERSTATUS;
			finderArgs = new Object[] { dossierStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOSSIERSTATUS;
			finderArgs = new Object[] {
					dossierStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRExpireCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRExpireCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRExpireCertificate vrExpireCertificate : list) {
					if (!Objects.equals(dossierStatus,
								vrExpireCertificate.getDossierStatus())) {
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

			query.append(_SQL_SELECT_VREXPIRECERTIFICATE_WHERE);

			boolean bindDossierStatus = false;

			if (dossierStatus == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_1);
			}
			else if (dossierStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_3);
			}
			else {
				bindDossierStatus = true;

				query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRExpireCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierStatus) {
					qPos.add(dossierStatus);
				}

				if (!pagination) {
					list = (List<VRExpireCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRExpireCertificate>)QueryUtil.list(q,
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
	 * Returns the first vr expire certificate in the ordered set where dossierStatus = &#63;.
	 *
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr expire certificate
	 * @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate findByF_dossierStatus_First(
		String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator)
		throws NoSuchVRExpireCertificateException {
		VRExpireCertificate vrExpireCertificate = fetchByF_dossierStatus_First(dossierStatus,
				orderByComparator);

		if (vrExpireCertificate != null) {
			return vrExpireCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierStatus=");
		msg.append(dossierStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRExpireCertificateException(msg.toString());
	}

	/**
	 * Returns the first vr expire certificate in the ordered set where dossierStatus = &#63;.
	 *
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate fetchByF_dossierStatus_First(
		String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		List<VRExpireCertificate> list = findByF_dossierStatus(dossierStatus,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr expire certificate in the ordered set where dossierStatus = &#63;.
	 *
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr expire certificate
	 * @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate findByF_dossierStatus_Last(
		String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator)
		throws NoSuchVRExpireCertificateException {
		VRExpireCertificate vrExpireCertificate = fetchByF_dossierStatus_Last(dossierStatus,
				orderByComparator);

		if (vrExpireCertificate != null) {
			return vrExpireCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierStatus=");
		msg.append(dossierStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRExpireCertificateException(msg.toString());
	}

	/**
	 * Returns the last vr expire certificate in the ordered set where dossierStatus = &#63;.
	 *
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	 */
	@Override
	public VRExpireCertificate fetchByF_dossierStatus_Last(
		String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		int count = countByF_dossierStatus(dossierStatus);

		if (count == 0) {
			return null;
		}

		List<VRExpireCertificate> list = findByF_dossierStatus(dossierStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr expire certificates before and after the current vr expire certificate in the ordered set where dossierStatus = &#63;.
	 *
	 * @param id the primary key of the current vr expire certificate
	 * @param dossierStatus the dossier status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr expire certificate
	 * @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	 */
	@Override
	public VRExpireCertificate[] findByF_dossierStatus_PrevAndNext(long id,
		String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator)
		throws NoSuchVRExpireCertificateException {
		VRExpireCertificate vrExpireCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRExpireCertificate[] array = new VRExpireCertificateImpl[3];

			array[0] = getByF_dossierStatus_PrevAndNext(session,
					vrExpireCertificate, dossierStatus, orderByComparator, true);

			array[1] = vrExpireCertificate;

			array[2] = getByF_dossierStatus_PrevAndNext(session,
					vrExpireCertificate, dossierStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRExpireCertificate getByF_dossierStatus_PrevAndNext(
		Session session, VRExpireCertificate vrExpireCertificate,
		String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator,
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

		query.append(_SQL_SELECT_VREXPIRECERTIFICATE_WHERE);

		boolean bindDossierStatus = false;

		if (dossierStatus == null) {
			query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_1);
		}
		else if (dossierStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_3);
		}
		else {
			bindDossierStatus = true;

			query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_2);
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
			query.append(VRExpireCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierStatus) {
			qPos.add(dossierStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrExpireCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRExpireCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr expire certificates where dossierStatus = &#63; from the database.
	 *
	 * @param dossierStatus the dossier status
	 */
	@Override
	public void removeByF_dossierStatus(String dossierStatus) {
		for (VRExpireCertificate vrExpireCertificate : findByF_dossierStatus(
				dossierStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrExpireCertificate);
		}
	}

	/**
	 * Returns the number of vr expire certificates where dossierStatus = &#63;.
	 *
	 * @param dossierStatus the dossier status
	 * @return the number of matching vr expire certificates
	 */
	@Override
	public int countByF_dossierStatus(String dossierStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DOSSIERSTATUS;

		Object[] finderArgs = new Object[] { dossierStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VREXPIRECERTIFICATE_WHERE);

			boolean bindDossierStatus = false;

			if (dossierStatus == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_1);
			}
			else if (dossierStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_3);
			}
			else {
				bindDossierStatus = true;

				query.append(_FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierStatus) {
					qPos.add(dossierStatus);
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

	private static final String _FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_1 = "vrExpireCertificate.dossierStatus IS NULL";
	private static final String _FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_2 = "vrExpireCertificate.dossierStatus = ?";
	private static final String _FINDER_COLUMN_F_DOSSIERSTATUS_DOSSIERSTATUS_3 = "(vrExpireCertificate.dossierStatus IS NULL OR vrExpireCertificate.dossierStatus = '')";

	public VRExpireCertificatePersistenceImpl() {
		setModelClass(VRExpireCertificate.class);
	}

	/**
	 * Caches the vr expire certificate in the entity cache if it is enabled.
	 *
	 * @param vrExpireCertificate the vr expire certificate
	 */
	@Override
	public void cacheResult(VRExpireCertificate vrExpireCertificate) {
		entityCache.putResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateImpl.class, vrExpireCertificate.getPrimaryKey(),
			vrExpireCertificate);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID,
			new Object[] { vrExpireCertificate.getVehicleTypeCertificateId() },
			vrExpireCertificate);

		finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERID,
			new Object[] { vrExpireCertificate.getDossierId() },
			vrExpireCertificate);

		vrExpireCertificate.resetOriginalValues();
	}

	/**
	 * Caches the vr expire certificates in the entity cache if it is enabled.
	 *
	 * @param vrExpireCertificates the vr expire certificates
	 */
	@Override
	public void cacheResult(List<VRExpireCertificate> vrExpireCertificates) {
		for (VRExpireCertificate vrExpireCertificate : vrExpireCertificates) {
			if (entityCache.getResult(
						VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
						VRExpireCertificateImpl.class,
						vrExpireCertificate.getPrimaryKey()) == null) {
				cacheResult(vrExpireCertificate);
			}
			else {
				vrExpireCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr expire certificates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRExpireCertificateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr expire certificate.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRExpireCertificate vrExpireCertificate) {
		entityCache.removeResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateImpl.class, vrExpireCertificate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRExpireCertificateModelImpl)vrExpireCertificate,
			true);
	}

	@Override
	public void clearCache(List<VRExpireCertificate> vrExpireCertificates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRExpireCertificate vrExpireCertificate : vrExpireCertificates) {
			entityCache.removeResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
				VRExpireCertificateImpl.class,
				vrExpireCertificate.getPrimaryKey());

			clearUniqueFindersCache((VRExpireCertificateModelImpl)vrExpireCertificate,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRExpireCertificateModelImpl vrExpireCertificateModelImpl) {
		Object[] args = new Object[] {
				vrExpireCertificateModelImpl.getVehicleTypeCertificateId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID,
			args, vrExpireCertificateModelImpl, false);

		args = new Object[] { vrExpireCertificateModelImpl.getDossierId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_DOSSIERID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_DOSSIERID, args,
			vrExpireCertificateModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRExpireCertificateModelImpl vrExpireCertificateModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrExpireCertificateModelImpl.getVehicleTypeCertificateId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID,
				args);
		}

		if ((vrExpireCertificateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrExpireCertificateModelImpl.getOriginalVehicleTypeCertificateId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_VEHICLETYPECERTIFICATEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_VEHICLETYPECERTIFICATEID,
				args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrExpireCertificateModelImpl.getDossierId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSSIERID, args);
		}

		if ((vrExpireCertificateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOSSIERID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrExpireCertificateModelImpl.getOriginalDossierId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSSIERID, args);
		}
	}

	/**
	 * Creates a new vr expire certificate with the primary key. Does not add the vr expire certificate to the database.
	 *
	 * @param id the primary key for the new vr expire certificate
	 * @return the new vr expire certificate
	 */
	@Override
	public VRExpireCertificate create(long id) {
		VRExpireCertificate vrExpireCertificate = new VRExpireCertificateImpl();

		vrExpireCertificate.setNew(true);
		vrExpireCertificate.setPrimaryKey(id);

		return vrExpireCertificate;
	}

	/**
	 * Removes the vr expire certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr expire certificate
	 * @return the vr expire certificate that was removed
	 * @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	 */
	@Override
	public VRExpireCertificate remove(long id)
		throws NoSuchVRExpireCertificateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr expire certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr expire certificate
	 * @return the vr expire certificate that was removed
	 * @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	 */
	@Override
	public VRExpireCertificate remove(Serializable primaryKey)
		throws NoSuchVRExpireCertificateException {
		Session session = null;

		try {
			session = openSession();

			VRExpireCertificate vrExpireCertificate = (VRExpireCertificate)session.get(VRExpireCertificateImpl.class,
					primaryKey);

			if (vrExpireCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRExpireCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrExpireCertificate);
		}
		catch (NoSuchVRExpireCertificateException nsee) {
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
	protected VRExpireCertificate removeImpl(
		VRExpireCertificate vrExpireCertificate) {
		vrExpireCertificate = toUnwrappedModel(vrExpireCertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrExpireCertificate)) {
				vrExpireCertificate = (VRExpireCertificate)session.get(VRExpireCertificateImpl.class,
						vrExpireCertificate.getPrimaryKeyObj());
			}

			if (vrExpireCertificate != null) {
				session.delete(vrExpireCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrExpireCertificate != null) {
			clearCache(vrExpireCertificate);
		}

		return vrExpireCertificate;
	}

	@Override
	public VRExpireCertificate updateImpl(
		VRExpireCertificate vrExpireCertificate) {
		vrExpireCertificate = toUnwrappedModel(vrExpireCertificate);

		boolean isNew = vrExpireCertificate.isNew();

		VRExpireCertificateModelImpl vrExpireCertificateModelImpl = (VRExpireCertificateModelImpl)vrExpireCertificate;

		Session session = null;

		try {
			session = openSession();

			if (vrExpireCertificate.isNew()) {
				session.save(vrExpireCertificate);

				vrExpireCertificate.setNew(false);
			}
			else {
				vrExpireCertificate = (VRExpireCertificate)session.merge(vrExpireCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRExpireCertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrExpireCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrExpireCertificateModelImpl.getOriginalDossierStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERSTATUS,
					args);

				args = new Object[] {
						vrExpireCertificateModelImpl.getDossierStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERSTATUS,
					args);
			}
		}

		entityCache.putResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VRExpireCertificateImpl.class, vrExpireCertificate.getPrimaryKey(),
			vrExpireCertificate, false);

		clearUniqueFindersCache(vrExpireCertificateModelImpl, false);
		cacheUniqueFindersCache(vrExpireCertificateModelImpl);

		vrExpireCertificate.resetOriginalValues();

		return vrExpireCertificate;
	}

	protected VRExpireCertificate toUnwrappedModel(
		VRExpireCertificate vrExpireCertificate) {
		if (vrExpireCertificate instanceof VRExpireCertificateImpl) {
			return vrExpireCertificate;
		}

		VRExpireCertificateImpl vrExpireCertificateImpl = new VRExpireCertificateImpl();

		vrExpireCertificateImpl.setNew(vrExpireCertificate.isNew());
		vrExpireCertificateImpl.setPrimaryKey(vrExpireCertificate.getPrimaryKey());

		vrExpireCertificateImpl.setId(vrExpireCertificate.getId());
		vrExpireCertificateImpl.setMtCore(vrExpireCertificate.getMtCore());
		vrExpireCertificateImpl.setConvertAssembleId(vrExpireCertificate.getConvertAssembleId());
		vrExpireCertificateImpl.setValidDossierId(vrExpireCertificate.getValidDossierId());
		vrExpireCertificateImpl.setValidDossierIdCTN(vrExpireCertificate.getValidDossierIdCTN());
		vrExpireCertificateImpl.setValidDossierNo(vrExpireCertificate.getValidDossierNo());
		vrExpireCertificateImpl.setVehicleTypeCertificateId(vrExpireCertificate.getVehicleTypeCertificateId());
		vrExpireCertificateImpl.setDossierId(vrExpireCertificate.getDossierId());
		vrExpireCertificateImpl.setDossierIdCTN(vrExpireCertificate.getDossierIdCTN());
		vrExpireCertificateImpl.setDossierNo(vrExpireCertificate.getDossierNo());
		vrExpireCertificateImpl.setDossierStatus(vrExpireCertificate.getDossierStatus());
		vrExpireCertificateImpl.setPreviousExpireDate(vrExpireCertificate.getPreviousExpireDate());
		vrExpireCertificateImpl.setCertificateRecordNo(vrExpireCertificate.getCertificateRecordNo());
		vrExpireCertificateImpl.setCertificateRecordDate(vrExpireCertificate.getCertificateRecordDate());
		vrExpireCertificateImpl.setCertificateRecordExpireDate(vrExpireCertificate.getCertificateRecordExpireDate());
		vrExpireCertificateImpl.setExpiredStatus(vrExpireCertificate.getExpiredStatus());
		vrExpireCertificateImpl.setVehicleClass(vrExpireCertificate.getVehicleClass());
		vrExpireCertificateImpl.setCertifiedVehicleType(vrExpireCertificate.getCertifiedVehicleType());
		vrExpireCertificateImpl.setCertifiedVehicleTypeDescription(vrExpireCertificate.getCertifiedVehicleTypeDescription());
		vrExpireCertificateImpl.setCertifiedTrademark(vrExpireCertificate.getCertifiedTrademark());
		vrExpireCertificateImpl.setCertifiedTrademarkName(vrExpireCertificate.getCertifiedTrademarkName());
		vrExpireCertificateImpl.setCertifiedCommercialName(vrExpireCertificate.getCertifiedCommercialName());
		vrExpireCertificateImpl.setCertifiedModelCode(vrExpireCertificate.getCertifiedModelCode());
		vrExpireCertificateImpl.setProductionCountry(vrExpireCertificate.getProductionCountry());
		vrExpireCertificateImpl.setSafetytestReportNo(vrExpireCertificate.getSafetytestReportNo());
		vrExpireCertificateImpl.setSafetytestReportDate(vrExpireCertificate.getSafetytestReportDate());
		vrExpireCertificateImpl.setEmissionTestReportNo(vrExpireCertificate.getEmissionTestReportNo());
		vrExpireCertificateImpl.setEmissionTestReportDate(vrExpireCertificate.getEmissionTestReportDate());
		vrExpireCertificateImpl.setCommonSafetyStandard(vrExpireCertificate.getCommonSafetyStandard());
		vrExpireCertificateImpl.setCommonSafetyDescription(vrExpireCertificate.getCommonSafetyDescription());
		vrExpireCertificateImpl.setEmissionStandard(vrExpireCertificate.getEmissionStandard());
		vrExpireCertificateImpl.setEmissionDescription(vrExpireCertificate.getEmissionDescription());
		vrExpireCertificateImpl.setOthertestReportNo(vrExpireCertificate.getOthertestReportNo());
		vrExpireCertificateImpl.setOthertestReportDate(vrExpireCertificate.getOthertestReportDate());
		vrExpireCertificateImpl.setCopReportNo(vrExpireCertificate.getCopReportNo());
		vrExpireCertificateImpl.setCopReportDate(vrExpireCertificate.getCopReportDate());
		vrExpireCertificateImpl.setCopReportExpireDate(vrExpireCertificate.getCopReportExpireDate());
		vrExpireCertificateImpl.setValidRequestNo(vrExpireCertificate.getValidRequestNo());
		vrExpireCertificateImpl.setValidRequestDate(vrExpireCertificate.getValidRequestDate());
		vrExpireCertificateImpl.setValidInspectionRecordNo(vrExpireCertificate.getValidInspectionRecordNo());
		vrExpireCertificateImpl.setValidInspectionRecordDate(vrExpireCertificate.getValidInspectionRecordDate());
		vrExpireCertificateImpl.setValidCorporationId(vrExpireCertificate.getValidCorporationId());
		vrExpireCertificateImpl.setValidInspectorId(vrExpireCertificate.getValidInspectorId());
		vrExpireCertificateImpl.setValidInspectorName(vrExpireCertificate.getValidInspectorName());
		vrExpireCertificateImpl.setValidRemarks(vrExpireCertificate.getValidRemarks());
		vrExpireCertificateImpl.setValidInspectionNote(vrExpireCertificate.getValidInspectionNote());
		vrExpireCertificateImpl.setDeliverableFileEntryId(vrExpireCertificate.getDeliverableFileEntryId());
		vrExpireCertificateImpl.setDocumentFileEntryId(vrExpireCertificate.getDocumentFileEntryId());
		vrExpireCertificateImpl.setModifyDate(vrExpireCertificate.getModifyDate());
		vrExpireCertificateImpl.setSyncDate(vrExpireCertificate.getSyncDate());

		return vrExpireCertificateImpl;
	}

	/**
	 * Returns the vr expire certificate with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr expire certificate
	 * @return the vr expire certificate
	 * @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	 */
	@Override
	public VRExpireCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRExpireCertificateException {
		VRExpireCertificate vrExpireCertificate = fetchByPrimaryKey(primaryKey);

		if (vrExpireCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRExpireCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrExpireCertificate;
	}

	/**
	 * Returns the vr expire certificate with the primary key or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the vr expire certificate
	 * @return the vr expire certificate
	 * @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	 */
	@Override
	public VRExpireCertificate findByPrimaryKey(long id)
		throws NoSuchVRExpireCertificateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr expire certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr expire certificate
	 * @return the vr expire certificate, or <code>null</code> if a vr expire certificate with the primary key could not be found
	 */
	@Override
	public VRExpireCertificate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
				VRExpireCertificateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRExpireCertificate vrExpireCertificate = (VRExpireCertificate)serializable;

		if (vrExpireCertificate == null) {
			Session session = null;

			try {
				session = openSession();

				vrExpireCertificate = (VRExpireCertificate)session.get(VRExpireCertificateImpl.class,
						primaryKey);

				if (vrExpireCertificate != null) {
					cacheResult(vrExpireCertificate);
				}
				else {
					entityCache.putResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
						VRExpireCertificateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRExpireCertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrExpireCertificate;
	}

	/**
	 * Returns the vr expire certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr expire certificate
	 * @return the vr expire certificate, or <code>null</code> if a vr expire certificate with the primary key could not be found
	 */
	@Override
	public VRExpireCertificate fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRExpireCertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRExpireCertificate> map = new HashMap<Serializable, VRExpireCertificate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRExpireCertificate vrExpireCertificate = fetchByPrimaryKey(primaryKey);

			if (vrExpireCertificate != null) {
				map.put(primaryKey, vrExpireCertificate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRExpireCertificateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRExpireCertificate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VREXPIRECERTIFICATE_WHERE_PKS_IN);

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

			for (VRExpireCertificate vrExpireCertificate : (List<VRExpireCertificate>)q.list()) {
				map.put(vrExpireCertificate.getPrimaryKeyObj(),
					vrExpireCertificate);

				cacheResult(vrExpireCertificate);

				uncachedPrimaryKeys.remove(vrExpireCertificate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRExpireCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VRExpireCertificateImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr expire certificates.
	 *
	 * @return the vr expire certificates
	 */
	@Override
	public List<VRExpireCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr expire certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr expire certificates
	 * @param end the upper bound of the range of vr expire certificates (not inclusive)
	 * @return the range of vr expire certificates
	 */
	@Override
	public List<VRExpireCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr expire certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr expire certificates
	 * @param end the upper bound of the range of vr expire certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr expire certificates
	 */
	@Override
	public List<VRExpireCertificate> findAll(int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr expire certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr expire certificates
	 * @param end the upper bound of the range of vr expire certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr expire certificates
	 */
	@Override
	public List<VRExpireCertificate> findAll(int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator,
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

		List<VRExpireCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<VRExpireCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VREXPIRECERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VREXPIRECERTIFICATE;

				if (pagination) {
					sql = sql.concat(VRExpireCertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRExpireCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRExpireCertificate>)QueryUtil.list(q,
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
	 * Removes all the vr expire certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRExpireCertificate vrExpireCertificate : findAll()) {
			remove(vrExpireCertificate);
		}
	}

	/**
	 * Returns the number of vr expire certificates.
	 *
	 * @return the number of vr expire certificates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VREXPIRECERTIFICATE);

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
		return VRExpireCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr expire certificate persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRExpireCertificateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VREXPIRECERTIFICATE = "SELECT vrExpireCertificate FROM VRExpireCertificate vrExpireCertificate";
	private static final String _SQL_SELECT_VREXPIRECERTIFICATE_WHERE_PKS_IN = "SELECT vrExpireCertificate FROM VRExpireCertificate vrExpireCertificate WHERE id IN (";
	private static final String _SQL_SELECT_VREXPIRECERTIFICATE_WHERE = "SELECT vrExpireCertificate FROM VRExpireCertificate vrExpireCertificate WHERE ";
	private static final String _SQL_COUNT_VREXPIRECERTIFICATE = "SELECT COUNT(vrExpireCertificate) FROM VRExpireCertificate vrExpireCertificate";
	private static final String _SQL_COUNT_VREXPIRECERTIFICATE_WHERE = "SELECT COUNT(vrExpireCertificate) FROM VRExpireCertificate vrExpireCertificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrExpireCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRExpireCertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRExpireCertificate exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRExpireCertificatePersistenceImpl.class);
}