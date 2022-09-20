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

import com.fds.vr.business.exception.NoSuchVRMethodOfIssueException;
import com.fds.vr.business.model.VRMethodOfIssue;
import com.fds.vr.business.model.impl.VRMethodOfIssueImpl;
import com.fds.vr.business.model.impl.VRMethodOfIssueModelImpl;
import com.fds.vr.business.service.persistence.VRMethodOfIssuePersistence;

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
 * The persistence implementation for the vr method of issue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRMethodOfIssuePersistence
 * @see com.fds.vr.business.service.persistence.VRMethodOfIssueUtil
 * @generated
 */
@ProviderType
public class VRMethodOfIssuePersistenceImpl extends BasePersistenceImpl<VRMethodOfIssue>
	implements VRMethodOfIssuePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRMethodOfIssueUtil} to access the vr method of issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRMethodOfIssueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueModelImpl.FINDER_CACHE_ENABLED,
			VRMethodOfIssueImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueModelImpl.FINDER_CACHE_ENABLED,
			VRMethodOfIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID =
		new FinderPath(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueModelImpl.FINDER_CACHE_ENABLED,
			VRMethodOfIssueImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			},
			VRMethodOfIssueModelImpl.CERTIFIEDASSEMBLYTYPE_COLUMN_BITMASK |
			VRMethodOfIssueModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRMethodOfIssueModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRMethodOfIssueModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID =
		new FinderPath(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or throws a {@link NoSuchVRMethodOfIssueException} if it could not be found.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantCode the production plant code
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @return the matching vr method of issue
	 * @throws NoSuchVRMethodOfIssueException if a matching vr method of issue could not be found
	 */
	@Override
	public VRMethodOfIssue findBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, String productionPlantCode,
		String vehicleClass, long applicantProfileId)
		throws NoSuchVRMethodOfIssueException {
		VRMethodOfIssue vrMethodOfIssue = fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
				productionPlantCode, vehicleClass, applicantProfileId);

		if (vrMethodOfIssue == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certifiedAssemblyType=");
			msg.append(certifiedAssemblyType);

			msg.append(", productionPlantCode=");
			msg.append(productionPlantCode);

			msg.append(", vehicleClass=");
			msg.append(vehicleClass);

			msg.append(", applicantProfileId=");
			msg.append(applicantProfileId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRMethodOfIssueException(msg.toString());
		}

		return vrMethodOfIssue;
	}

	/**
	 * Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantCode the production plant code
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	 */
	@Override
	public VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, String productionPlantCode,
		String vehicleClass, long applicantProfileId) {
		return fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantCode, vehicleClass, applicantProfileId, true);
	}

	/**
	 * Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantCode the production plant code
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	 */
	@Override
	public VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, String productionPlantCode,
		String vehicleClass, long applicantProfileId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] {
				certifiedAssemblyType, productionPlantCode, vehicleClass,
				applicantProfileId
			};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
					finderArgs, this);
		}

		if (result instanceof VRMethodOfIssue) {
			VRMethodOfIssue vrMethodOfIssue = (VRMethodOfIssue)result;

			if (!Objects.equals(certifiedAssemblyType,
						vrMethodOfIssue.getCertifiedAssemblyType()) ||
					!Objects.equals(productionPlantCode,
						vrMethodOfIssue.getProductionPlantCode()) ||
					!Objects.equals(vehicleClass,
						vrMethodOfIssue.getVehicleClass()) ||
					(applicantProfileId != vrMethodOfIssue.getApplicantProfileId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_VRMETHODOFISSUE_WHERE);

			boolean bindCertifiedAssemblyType = false;

			if (certifiedAssemblyType == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_1);
			}
			else if (certifiedAssemblyType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_3);
			}
			else {
				bindCertifiedAssemblyType = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_2);
			}

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_2);
			}

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_2);
			}

			query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertifiedAssemblyType) {
					qPos.add(certifiedAssemblyType);
				}

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				qPos.add(applicantProfileId);

				List<VRMethodOfIssue> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRMethodOfIssuePersistenceImpl.fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(String, String, String, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRMethodOfIssue vrMethodOfIssue = list.get(0);

					result = vrMethodOfIssue;

					cacheResult(vrMethodOfIssue);

					if ((vrMethodOfIssue.getCertifiedAssemblyType() == null) ||
							!vrMethodOfIssue.getCertifiedAssemblyType()
												.equals(certifiedAssemblyType) ||
							(vrMethodOfIssue.getProductionPlantCode() == null) ||
							!vrMethodOfIssue.getProductionPlantCode()
												.equals(productionPlantCode) ||
							(vrMethodOfIssue.getVehicleClass() == null) ||
							!vrMethodOfIssue.getVehicleClass()
												.equals(vehicleClass) ||
							(vrMethodOfIssue.getApplicantProfileId() != applicantProfileId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
							finderArgs, vrMethodOfIssue);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
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
			return (VRMethodOfIssue)result;
		}
	}

	/**
	 * Removes the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; from the database.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantCode the production plant code
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @return the vr method of issue that was removed
	 */
	@Override
	public VRMethodOfIssue removeBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, String productionPlantCode,
		String vehicleClass, long applicantProfileId)
		throws NoSuchVRMethodOfIssueException {
		VRMethodOfIssue vrMethodOfIssue = findBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
				productionPlantCode, vehicleClass, applicantProfileId);

		return remove(vrMethodOfIssue);
	}

	/**
	 * Returns the number of vr method of issues where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63;.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantCode the production plant code
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @return the number of matching vr method of issues
	 */
	@Override
	public int countBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, String productionPlantCode,
		String vehicleClass, long applicantProfileId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID;

		Object[] finderArgs = new Object[] {
				certifiedAssemblyType, productionPlantCode, vehicleClass,
				applicantProfileId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRMETHODOFISSUE_WHERE);

			boolean bindCertifiedAssemblyType = false;

			if (certifiedAssemblyType == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_1);
			}
			else if (certifiedAssemblyType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_3);
			}
			else {
				bindCertifiedAssemblyType = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_2);
			}

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_2);
			}

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_2);
			}

			query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertifiedAssemblyType) {
					qPos.add(certifiedAssemblyType);
				}

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

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

	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_1 =
		"vrMethodOfIssue.certifiedAssemblyType IS NULL AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_2 =
		"vrMethodOfIssue.certifiedAssemblyType = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_3 =
		"(vrMethodOfIssue.certifiedAssemblyType IS NULL OR vrMethodOfIssue.certifiedAssemblyType = '') AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_1 =
		"vrMethodOfIssue.productionPlantCode IS NULL AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_2 =
		"vrMethodOfIssue.productionPlantCode = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_3 =
		"(vrMethodOfIssue.productionPlantCode IS NULL OR vrMethodOfIssue.productionPlantCode = '') AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_1 =
		"vrMethodOfIssue.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_2 =
		"vrMethodOfIssue.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_3 =
		"(vrMethodOfIssue.vehicleClass IS NULL OR vrMethodOfIssue.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID_APPLICANTPROFILEID_2 =
		"vrMethodOfIssue.applicantProfileId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID =
		new FinderPath(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueModelImpl.FINDER_CACHE_ENABLED,
			VRMethodOfIssueImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), Long.class.getName()
			},
			VRMethodOfIssueModelImpl.CERTIFIEDASSEMBLYTYPE_COLUMN_BITMASK |
			VRMethodOfIssueModelImpl.PRODUCTIONPLANTID_COLUMN_BITMASK |
			VRMethodOfIssueModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRMethodOfIssueModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID =
		new FinderPath(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or throws a {@link NoSuchVRMethodOfIssueException} if it could not be found.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantId the production plant ID
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @return the matching vr method of issue
	 * @throws NoSuchVRMethodOfIssueException if a matching vr method of issue could not be found
	 */
	@Override
	public VRMethodOfIssue findBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, long productionPlantId,
		String vehicleClass, long applicantProfileId)
		throws NoSuchVRMethodOfIssueException {
		VRMethodOfIssue vrMethodOfIssue = fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
				productionPlantId, vehicleClass, applicantProfileId);

		if (vrMethodOfIssue == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certifiedAssemblyType=");
			msg.append(certifiedAssemblyType);

			msg.append(", productionPlantId=");
			msg.append(productionPlantId);

			msg.append(", vehicleClass=");
			msg.append(vehicleClass);

			msg.append(", applicantProfileId=");
			msg.append(applicantProfileId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRMethodOfIssueException(msg.toString());
		}

		return vrMethodOfIssue;
	}

	/**
	 * Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantId the production plant ID
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	 */
	@Override
	public VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, long productionPlantId,
		String vehicleClass, long applicantProfileId) {
		return fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantId, vehicleClass, applicantProfileId, true);
	}

	/**
	 * Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantId the production plant ID
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	 */
	@Override
	public VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, long productionPlantId,
		String vehicleClass, long applicantProfileId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] {
				certifiedAssemblyType, productionPlantId, vehicleClass,
				applicantProfileId
			};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
					finderArgs, this);
		}

		if (result instanceof VRMethodOfIssue) {
			VRMethodOfIssue vrMethodOfIssue = (VRMethodOfIssue)result;

			if (!Objects.equals(certifiedAssemblyType,
						vrMethodOfIssue.getCertifiedAssemblyType()) ||
					(productionPlantId != vrMethodOfIssue.getProductionPlantId()) ||
					!Objects.equals(vehicleClass,
						vrMethodOfIssue.getVehicleClass()) ||
					(applicantProfileId != vrMethodOfIssue.getApplicantProfileId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_VRMETHODOFISSUE_WHERE);

			boolean bindCertifiedAssemblyType = false;

			if (certifiedAssemblyType == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_1);
			}
			else if (certifiedAssemblyType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_3);
			}
			else {
				bindCertifiedAssemblyType = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_2);
			}

			query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTID_2);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_2);
			}

			query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertifiedAssemblyType) {
					qPos.add(certifiedAssemblyType);
				}

				qPos.add(productionPlantId);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				qPos.add(applicantProfileId);

				List<VRMethodOfIssue> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRMethodOfIssuePersistenceImpl.fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(String, long, String, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRMethodOfIssue vrMethodOfIssue = list.get(0);

					result = vrMethodOfIssue;

					cacheResult(vrMethodOfIssue);

					if ((vrMethodOfIssue.getCertifiedAssemblyType() == null) ||
							!vrMethodOfIssue.getCertifiedAssemblyType()
												.equals(certifiedAssemblyType) ||
							(vrMethodOfIssue.getProductionPlantId() != productionPlantId) ||
							(vrMethodOfIssue.getVehicleClass() == null) ||
							!vrMethodOfIssue.getVehicleClass()
												.equals(vehicleClass) ||
							(vrMethodOfIssue.getApplicantProfileId() != applicantProfileId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
							finderArgs, vrMethodOfIssue);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
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
			return (VRMethodOfIssue)result;
		}
	}

	/**
	 * Removes the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; from the database.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantId the production plant ID
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @return the vr method of issue that was removed
	 */
	@Override
	public VRMethodOfIssue removeBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, long productionPlantId,
		String vehicleClass, long applicantProfileId)
		throws NoSuchVRMethodOfIssueException {
		VRMethodOfIssue vrMethodOfIssue = findBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
				productionPlantId, vehicleClass, applicantProfileId);

		return remove(vrMethodOfIssue);
	}

	/**
	 * Returns the number of vr method of issues where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63;.
	 *
	 * @param certifiedAssemblyType the certified assembly type
	 * @param productionPlantId the production plant ID
	 * @param vehicleClass the vehicle class
	 * @param applicantProfileId the applicant profile ID
	 * @return the number of matching vr method of issues
	 */
	@Override
	public int countBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		String certifiedAssemblyType, long productionPlantId,
		String vehicleClass, long applicantProfileId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID;

		Object[] finderArgs = new Object[] {
				certifiedAssemblyType, productionPlantId, vehicleClass,
				applicantProfileId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRMETHODOFISSUE_WHERE);

			boolean bindCertifiedAssemblyType = false;

			if (certifiedAssemblyType == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_1);
			}
			else if (certifiedAssemblyType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_3);
			}
			else {
				bindCertifiedAssemblyType = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_2);
			}

			query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTID_2);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_2);
			}

			query.append(_FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertifiedAssemblyType) {
					qPos.add(certifiedAssemblyType);
				}

				qPos.add(productionPlantId);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

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

	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_1 =
		"vrMethodOfIssue.certifiedAssemblyType IS NULL AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_2 =
		"vrMethodOfIssue.certifiedAssemblyType = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_CERTIFIEDASSEMBLYTYPE_3 =
		"(vrMethodOfIssue.certifiedAssemblyType IS NULL OR vrMethodOfIssue.certifiedAssemblyType = '') AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_PRODUCTIONPLANTID_2 =
		"vrMethodOfIssue.productionPlantId = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_1 =
		"vrMethodOfIssue.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_2 =
		"vrMethodOfIssue.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_VEHICLECLASS_3 =
		"(vrMethodOfIssue.vehicleClass IS NULL OR vrMethodOfIssue.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID_APPLICANTPROFILEID_2 =
		"vrMethodOfIssue.applicantProfileId = ?";

	public VRMethodOfIssuePersistenceImpl() {
		setModelClass(VRMethodOfIssue.class);
	}

	/**
	 * Caches the vr method of issue in the entity cache if it is enabled.
	 *
	 * @param vrMethodOfIssue the vr method of issue
	 */
	@Override
	public void cacheResult(VRMethodOfIssue vrMethodOfIssue) {
		entityCache.putResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueImpl.class, vrMethodOfIssue.getPrimaryKey(),
			vrMethodOfIssue);

		finderCache.putResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
			new Object[] {
				vrMethodOfIssue.getCertifiedAssemblyType(),
				vrMethodOfIssue.getProductionPlantCode(),
				vrMethodOfIssue.getVehicleClass(),
				vrMethodOfIssue.getApplicantProfileId()
			}, vrMethodOfIssue);

		finderCache.putResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
			new Object[] {
				vrMethodOfIssue.getCertifiedAssemblyType(),
				vrMethodOfIssue.getProductionPlantId(),
				vrMethodOfIssue.getVehicleClass(),
				vrMethodOfIssue.getApplicantProfileId()
			}, vrMethodOfIssue);

		vrMethodOfIssue.resetOriginalValues();
	}

	/**
	 * Caches the vr method of issues in the entity cache if it is enabled.
	 *
	 * @param vrMethodOfIssues the vr method of issues
	 */
	@Override
	public void cacheResult(List<VRMethodOfIssue> vrMethodOfIssues) {
		for (VRMethodOfIssue vrMethodOfIssue : vrMethodOfIssues) {
			if (entityCache.getResult(
						VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
						VRMethodOfIssueImpl.class,
						vrMethodOfIssue.getPrimaryKey()) == null) {
				cacheResult(vrMethodOfIssue);
			}
			else {
				vrMethodOfIssue.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr method of issues.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRMethodOfIssueImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr method of issue.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRMethodOfIssue vrMethodOfIssue) {
		entityCache.removeResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueImpl.class, vrMethodOfIssue.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRMethodOfIssueModelImpl)vrMethodOfIssue, true);
	}

	@Override
	public void clearCache(List<VRMethodOfIssue> vrMethodOfIssues) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRMethodOfIssue vrMethodOfIssue : vrMethodOfIssues) {
			entityCache.removeResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
				VRMethodOfIssueImpl.class, vrMethodOfIssue.getPrimaryKey());

			clearUniqueFindersCache((VRMethodOfIssueModelImpl)vrMethodOfIssue,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRMethodOfIssueModelImpl vrMethodOfIssueModelImpl) {
		Object[] args = new Object[] {
				vrMethodOfIssueModelImpl.getCertifiedAssemblyType(),
				vrMethodOfIssueModelImpl.getProductionPlantCode(),
				vrMethodOfIssueModelImpl.getVehicleClass(),
				vrMethodOfIssueModelImpl.getApplicantProfileId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
			args, vrMethodOfIssueModelImpl, false);

		args = new Object[] {
				vrMethodOfIssueModelImpl.getCertifiedAssemblyType(),
				vrMethodOfIssueModelImpl.getProductionPlantId(),
				vrMethodOfIssueModelImpl.getVehicleClass(),
				vrMethodOfIssueModelImpl.getApplicantProfileId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
			args, vrMethodOfIssueModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRMethodOfIssueModelImpl vrMethodOfIssueModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrMethodOfIssueModelImpl.getCertifiedAssemblyType(),
					vrMethodOfIssueModelImpl.getProductionPlantCode(),
					vrMethodOfIssueModelImpl.getVehicleClass(),
					vrMethodOfIssueModelImpl.getApplicantProfileId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
				args);
		}

		if ((vrMethodOfIssueModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrMethodOfIssueModelImpl.getOriginalCertifiedAssemblyType(),
					vrMethodOfIssueModelImpl.getOriginalProductionPlantCode(),
					vrMethodOfIssueModelImpl.getOriginalVehicleClass(),
					vrMethodOfIssueModelImpl.getOriginalApplicantProfileId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTCODE_VEHICLECLASS_APPLICANTPROFILEID,
				args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrMethodOfIssueModelImpl.getCertifiedAssemblyType(),
					vrMethodOfIssueModelImpl.getProductionPlantId(),
					vrMethodOfIssueModelImpl.getVehicleClass(),
					vrMethodOfIssueModelImpl.getApplicantProfileId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
				args);
		}

		if ((vrMethodOfIssueModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrMethodOfIssueModelImpl.getOriginalCertifiedAssemblyType(),
					vrMethodOfIssueModelImpl.getOriginalProductionPlantId(),
					vrMethodOfIssueModelImpl.getOriginalVehicleClass(),
					vrMethodOfIssueModelImpl.getOriginalApplicantProfileId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CERTIFIEDASSEMBLYTYPE_PRODUCTIONPLANTID_VEHICLECLASS_APPLICANTPROFILEID,
				args);
		}
	}

	/**
	 * Creates a new vr method of issue with the primary key. Does not add the vr method of issue to the database.
	 *
	 * @param id the primary key for the new vr method of issue
	 * @return the new vr method of issue
	 */
	@Override
	public VRMethodOfIssue create(long id) {
		VRMethodOfIssue vrMethodOfIssue = new VRMethodOfIssueImpl();

		vrMethodOfIssue.setNew(true);
		vrMethodOfIssue.setPrimaryKey(id);

		return vrMethodOfIssue;
	}

	/**
	 * Removes the vr method of issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr method of issue
	 * @return the vr method of issue that was removed
	 * @throws NoSuchVRMethodOfIssueException if a vr method of issue with the primary key could not be found
	 */
	@Override
	public VRMethodOfIssue remove(long id)
		throws NoSuchVRMethodOfIssueException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr method of issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr method of issue
	 * @return the vr method of issue that was removed
	 * @throws NoSuchVRMethodOfIssueException if a vr method of issue with the primary key could not be found
	 */
	@Override
	public VRMethodOfIssue remove(Serializable primaryKey)
		throws NoSuchVRMethodOfIssueException {
		Session session = null;

		try {
			session = openSession();

			VRMethodOfIssue vrMethodOfIssue = (VRMethodOfIssue)session.get(VRMethodOfIssueImpl.class,
					primaryKey);

			if (vrMethodOfIssue == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRMethodOfIssueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrMethodOfIssue);
		}
		catch (NoSuchVRMethodOfIssueException nsee) {
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
	protected VRMethodOfIssue removeImpl(VRMethodOfIssue vrMethodOfIssue) {
		vrMethodOfIssue = toUnwrappedModel(vrMethodOfIssue);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrMethodOfIssue)) {
				vrMethodOfIssue = (VRMethodOfIssue)session.get(VRMethodOfIssueImpl.class,
						vrMethodOfIssue.getPrimaryKeyObj());
			}

			if (vrMethodOfIssue != null) {
				session.delete(vrMethodOfIssue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrMethodOfIssue != null) {
			clearCache(vrMethodOfIssue);
		}

		return vrMethodOfIssue;
	}

	@Override
	public VRMethodOfIssue updateImpl(VRMethodOfIssue vrMethodOfIssue) {
		vrMethodOfIssue = toUnwrappedModel(vrMethodOfIssue);

		boolean isNew = vrMethodOfIssue.isNew();

		VRMethodOfIssueModelImpl vrMethodOfIssueModelImpl = (VRMethodOfIssueModelImpl)vrMethodOfIssue;

		Session session = null;

		try {
			session = openSession();

			if (vrMethodOfIssue.isNew()) {
				session.save(vrMethodOfIssue);

				vrMethodOfIssue.setNew(false);
			}
			else {
				vrMethodOfIssue = (VRMethodOfIssue)session.merge(vrMethodOfIssue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRMethodOfIssueModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRMethodOfIssueImpl.class, vrMethodOfIssue.getPrimaryKey(),
			vrMethodOfIssue, false);

		clearUniqueFindersCache(vrMethodOfIssueModelImpl, false);
		cacheUniqueFindersCache(vrMethodOfIssueModelImpl);

		vrMethodOfIssue.resetOriginalValues();

		return vrMethodOfIssue;
	}

	protected VRMethodOfIssue toUnwrappedModel(VRMethodOfIssue vrMethodOfIssue) {
		if (vrMethodOfIssue instanceof VRMethodOfIssueImpl) {
			return vrMethodOfIssue;
		}

		VRMethodOfIssueImpl vrMethodOfIssueImpl = new VRMethodOfIssueImpl();

		vrMethodOfIssueImpl.setNew(vrMethodOfIssue.isNew());
		vrMethodOfIssueImpl.setPrimaryKey(vrMethodOfIssue.getPrimaryKey());

		vrMethodOfIssueImpl.setId(vrMethodOfIssue.getId());
		vrMethodOfIssueImpl.setMtCore(vrMethodOfIssue.getMtCore());
		vrMethodOfIssueImpl.setVehicleClass(vrMethodOfIssue.getVehicleClass());
		vrMethodOfIssueImpl.setCertifiedAssemblyType(vrMethodOfIssue.getCertifiedAssemblyType());
		vrMethodOfIssueImpl.setCertifiedAssemblyTypeDescription(vrMethodOfIssue.getCertifiedAssemblyTypeDescription());
		vrMethodOfIssueImpl.setApplicantProfileId(vrMethodOfIssue.getApplicantProfileId());
		vrMethodOfIssueImpl.setApplicantName(vrMethodOfIssue.getApplicantName());
		vrMethodOfIssueImpl.setApplicantAddress(vrMethodOfIssue.getApplicantAddress());
		vrMethodOfIssueImpl.setProductionPlantId(vrMethodOfIssue.getProductionPlantId());
		vrMethodOfIssueImpl.setProductionPlantCode(vrMethodOfIssue.getProductionPlantCode());
		vrMethodOfIssueImpl.setProductionPlantName(vrMethodOfIssue.getProductionPlantName());
		vrMethodOfIssueImpl.setProductionPlantAddress(vrMethodOfIssue.getProductionPlantAddress());
		vrMethodOfIssueImpl.setMethodOfIssue(vrMethodOfIssue.getMethodOfIssue());
		vrMethodOfIssueImpl.setMethodApproved(vrMethodOfIssue.getMethodApproved());
		vrMethodOfIssueImpl.setMethodInMonth(vrMethodOfIssue.getMethodInMonth());
		vrMethodOfIssueImpl.setMethodInYear(vrMethodOfIssue.getMethodInYear());
		vrMethodOfIssueImpl.setPeriodDuration(vrMethodOfIssue.getPeriodDuration());
		vrMethodOfIssueImpl.setFrequencyIndex(vrMethodOfIssue.getFrequencyIndex());
		vrMethodOfIssueImpl.setRemarks(vrMethodOfIssue.getRemarks());
		vrMethodOfIssueImpl.setAverageStbQuantityIndex(vrMethodOfIssue.getAverageStbQuantityIndex());
		vrMethodOfIssueImpl.setMaxMonthQuantityIndex(vrMethodOfIssue.getMaxMonthQuantityIndex());
		vrMethodOfIssueImpl.setAverageStmQuantityIndex(vrMethodOfIssue.getAverageStmQuantityIndex());
		vrMethodOfIssueImpl.setAccumulatedMonthQuantityIndex(vrMethodOfIssue.getAccumulatedMonthQuantityIndex());
		vrMethodOfIssueImpl.setLatestOtherIndex1(vrMethodOfIssue.getLatestOtherIndex1());
		vrMethodOfIssueImpl.setLatestOtherIndex2(vrMethodOfIssue.getLatestOtherIndex2());
		vrMethodOfIssueImpl.setLatestOtherIndex3(vrMethodOfIssue.getLatestOtherIndex3());
		vrMethodOfIssueImpl.setLatestCOPReportDate(vrMethodOfIssue.getLatestCOPReportDate());
		vrMethodOfIssueImpl.setLatestInspectionRecordDate(vrMethodOfIssue.getLatestInspectionRecordDate());
		vrMethodOfIssueImpl.setLatestNumberOfInspectionInYear(vrMethodOfIssue.getLatestNumberOfInspectionInYear());
		vrMethodOfIssueImpl.setLatestNumberOfInspectionInMonth(vrMethodOfIssue.getLatestNumberOfInspectionInMonth());
		vrMethodOfIssueImpl.setLatestNumberOfStampInMonth(vrMethodOfIssue.getLatestNumberOfStampInMonth());
		vrMethodOfIssueImpl.setPeriodStartFrom(vrMethodOfIssue.getPeriodStartFrom());
		vrMethodOfIssueImpl.setTotalInspection(vrMethodOfIssue.getTotalInspection());
		vrMethodOfIssueImpl.setFlowIndex(vrMethodOfIssue.getFlowIndex());
		vrMethodOfIssueImpl.setModifyDate(vrMethodOfIssue.getModifyDate());
		vrMethodOfIssueImpl.setSyncDate(vrMethodOfIssue.getSyncDate());

		return vrMethodOfIssueImpl;
	}

	/**
	 * Returns the vr method of issue with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr method of issue
	 * @return the vr method of issue
	 * @throws NoSuchVRMethodOfIssueException if a vr method of issue with the primary key could not be found
	 */
	@Override
	public VRMethodOfIssue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRMethodOfIssueException {
		VRMethodOfIssue vrMethodOfIssue = fetchByPrimaryKey(primaryKey);

		if (vrMethodOfIssue == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRMethodOfIssueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrMethodOfIssue;
	}

	/**
	 * Returns the vr method of issue with the primary key or throws a {@link NoSuchVRMethodOfIssueException} if it could not be found.
	 *
	 * @param id the primary key of the vr method of issue
	 * @return the vr method of issue
	 * @throws NoSuchVRMethodOfIssueException if a vr method of issue with the primary key could not be found
	 */
	@Override
	public VRMethodOfIssue findByPrimaryKey(long id)
		throws NoSuchVRMethodOfIssueException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr method of issue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr method of issue
	 * @return the vr method of issue, or <code>null</code> if a vr method of issue with the primary key could not be found
	 */
	@Override
	public VRMethodOfIssue fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
				VRMethodOfIssueImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRMethodOfIssue vrMethodOfIssue = (VRMethodOfIssue)serializable;

		if (vrMethodOfIssue == null) {
			Session session = null;

			try {
				session = openSession();

				vrMethodOfIssue = (VRMethodOfIssue)session.get(VRMethodOfIssueImpl.class,
						primaryKey);

				if (vrMethodOfIssue != null) {
					cacheResult(vrMethodOfIssue);
				}
				else {
					entityCache.putResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
						VRMethodOfIssueImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
					VRMethodOfIssueImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrMethodOfIssue;
	}

	/**
	 * Returns the vr method of issue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr method of issue
	 * @return the vr method of issue, or <code>null</code> if a vr method of issue with the primary key could not be found
	 */
	@Override
	public VRMethodOfIssue fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRMethodOfIssue> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRMethodOfIssue> map = new HashMap<Serializable, VRMethodOfIssue>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRMethodOfIssue vrMethodOfIssue = fetchByPrimaryKey(primaryKey);

			if (vrMethodOfIssue != null) {
				map.put(primaryKey, vrMethodOfIssue);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
					VRMethodOfIssueImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRMethodOfIssue)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRMETHODOFISSUE_WHERE_PKS_IN);

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

			for (VRMethodOfIssue vrMethodOfIssue : (List<VRMethodOfIssue>)q.list()) {
				map.put(vrMethodOfIssue.getPrimaryKeyObj(), vrMethodOfIssue);

				cacheResult(vrMethodOfIssue);

				uncachedPrimaryKeys.remove(vrMethodOfIssue.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRMethodOfIssueModelImpl.ENTITY_CACHE_ENABLED,
					VRMethodOfIssueImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr method of issues.
	 *
	 * @return the vr method of issues
	 */
	@Override
	public List<VRMethodOfIssue> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr method of issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr method of issues
	 * @param end the upper bound of the range of vr method of issues (not inclusive)
	 * @return the range of vr method of issues
	 */
	@Override
	public List<VRMethodOfIssue> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr method of issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr method of issues
	 * @param end the upper bound of the range of vr method of issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr method of issues
	 */
	@Override
	public List<VRMethodOfIssue> findAll(int start, int end,
		OrderByComparator<VRMethodOfIssue> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr method of issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr method of issues
	 * @param end the upper bound of the range of vr method of issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr method of issues
	 */
	@Override
	public List<VRMethodOfIssue> findAll(int start, int end,
		OrderByComparator<VRMethodOfIssue> orderByComparator,
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

		List<VRMethodOfIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRMethodOfIssue>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRMETHODOFISSUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRMETHODOFISSUE;

				if (pagination) {
					sql = sql.concat(VRMethodOfIssueModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRMethodOfIssue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRMethodOfIssue>)QueryUtil.list(q,
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
	 * Removes all the vr method of issues from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRMethodOfIssue vrMethodOfIssue : findAll()) {
			remove(vrMethodOfIssue);
		}
	}

	/**
	 * Returns the number of vr method of issues.
	 *
	 * @return the number of vr method of issues
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRMETHODOFISSUE);

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
		return VRMethodOfIssueModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr method of issue persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRMethodOfIssueImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRMETHODOFISSUE = "SELECT vrMethodOfIssue FROM VRMethodOfIssue vrMethodOfIssue";
	private static final String _SQL_SELECT_VRMETHODOFISSUE_WHERE_PKS_IN = "SELECT vrMethodOfIssue FROM VRMethodOfIssue vrMethodOfIssue WHERE id IN (";
	private static final String _SQL_SELECT_VRMETHODOFISSUE_WHERE = "SELECT vrMethodOfIssue FROM VRMethodOfIssue vrMethodOfIssue WHERE ";
	private static final String _SQL_COUNT_VRMETHODOFISSUE = "SELECT COUNT(vrMethodOfIssue) FROM VRMethodOfIssue vrMethodOfIssue";
	private static final String _SQL_COUNT_VRMETHODOFISSUE_WHERE = "SELECT COUNT(vrMethodOfIssue) FROM VRMethodOfIssue vrMethodOfIssue WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrMethodOfIssue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRMethodOfIssue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRMethodOfIssue exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRMethodOfIssuePersistenceImpl.class);
}