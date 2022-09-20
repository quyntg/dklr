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

import com.fds.vr.business.exception.NoSuchVRTrackchangesException;
import com.fds.vr.business.model.VRTrackchanges;
import com.fds.vr.business.model.impl.VRTrackchangesImpl;
import com.fds.vr.business.model.impl.VRTrackchangesModelImpl;
import com.fds.vr.business.service.persistence.VRTrackchangesPersistence;

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
 * The persistence implementation for the vr trackchanges service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTrackchangesPersistence
 * @see com.fds.vr.business.service.persistence.VRTrackchangesUtil
 * @generated
 */
@ProviderType
public class VRTrackchangesPersistenceImpl extends BasePersistenceImpl<VRTrackchanges>
	implements VRTrackchangesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTrackchangesUtil} to access the vr trackchanges persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTrackchangesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED,
			VRTrackchangesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED,
			VRTrackchangesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_F_APPLICANTCODE = new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED,
			VRTrackchangesImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_ApplicantCode", new String[] { String.class.getName() },
			VRTrackchangesModelImpl.APPLICANTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_APPLICANTCODE = new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_ApplicantCode", new String[] { String.class.getName() });

	/**
	 * Returns the vr trackchanges where applicantCode = &#63; or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	 *
	 * @param applicantCode the applicant code
	 * @return the matching vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges findByF_ApplicantCode(String applicantCode)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = fetchByF_ApplicantCode(applicantCode);

		if (vrTrackchanges == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("applicantCode=");
			msg.append(applicantCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRTrackchangesException(msg.toString());
		}

		return vrTrackchanges;
	}

	/**
	 * Returns the vr trackchanges where applicantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicantCode the applicant code
	 * @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_ApplicantCode(String applicantCode) {
		return fetchByF_ApplicantCode(applicantCode, true);
	}

	/**
	 * Returns the vr trackchanges where applicantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicantCode the applicant code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_ApplicantCode(String applicantCode,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { applicantCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_APPLICANTCODE,
					finderArgs, this);
		}

		if (result instanceof VRTrackchanges) {
			VRTrackchanges vrTrackchanges = (VRTrackchanges)result;

			if (!Objects.equals(applicantCode, vrTrackchanges.getApplicantCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRTRACKCHANGES_WHERE);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantCode) {
					qPos.add(applicantCode);
				}

				List<VRTrackchanges> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_APPLICANTCODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRTrackchangesPersistenceImpl.fetchByF_ApplicantCode(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRTrackchanges vrTrackchanges = list.get(0);

					result = vrTrackchanges;

					cacheResult(vrTrackchanges);

					if ((vrTrackchanges.getApplicantCode() == null) ||
							!vrTrackchanges.getApplicantCode()
											   .equals(applicantCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_APPLICANTCODE,
							finderArgs, vrTrackchanges);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_APPLICANTCODE,
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
			return (VRTrackchanges)result;
		}
	}

	/**
	 * Removes the vr trackchanges where applicantCode = &#63; from the database.
	 *
	 * @param applicantCode the applicant code
	 * @return the vr trackchanges that was removed
	 */
	@Override
	public VRTrackchanges removeByF_ApplicantCode(String applicantCode)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = findByF_ApplicantCode(applicantCode);

		return remove(vrTrackchanges);
	}

	/**
	 * Returns the number of vr trackchangeses where applicantCode = &#63;.
	 *
	 * @param applicantCode the applicant code
	 * @return the number of matching vr trackchangeses
	 */
	@Override
	public int countByF_ApplicantCode(String applicantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_APPLICANTCODE;

		Object[] finderArgs = new Object[] { applicantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTRACKCHANGES_WHERE);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_1 = "vrTrackchanges.applicantCode IS NULL";
	private static final String _FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_2 = "vrTrackchanges.applicantCode = ?";
	private static final String _FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_3 = "(vrTrackchanges.applicantCode IS NULL OR vrTrackchanges.applicantCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE = new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED,
			VRTrackchangesImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_ProductionPlantCode",
			new String[] { String.class.getName() },
			VRTrackchangesModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE = new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_ProductionPlantCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr trackchanges where productionPlantCode = &#63; or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges findByF_ProductionPlantCode(
		String productionPlantCode) throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = fetchByF_ProductionPlantCode(productionPlantCode);

		if (vrTrackchanges == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("productionPlantCode=");
			msg.append(productionPlantCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRTrackchangesException(msg.toString());
		}

		return vrTrackchanges;
	}

	/**
	 * Returns the vr trackchanges where productionPlantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_ProductionPlantCode(
		String productionPlantCode) {
		return fetchByF_ProductionPlantCode(productionPlantCode, true);
	}

	/**
	 * Returns the vr trackchanges where productionPlantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param productionPlantCode the production plant code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_ProductionPlantCode(
		String productionPlantCode, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { productionPlantCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
					finderArgs, this);
		}

		if (result instanceof VRTrackchanges) {
			VRTrackchanges vrTrackchanges = (VRTrackchanges)result;

			if (!Objects.equals(productionPlantCode,
						vrTrackchanges.getProductionPlantCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRTRACKCHANGES_WHERE);

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

				List<VRTrackchanges> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRTrackchangesPersistenceImpl.fetchByF_ProductionPlantCode(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRTrackchanges vrTrackchanges = list.get(0);

					result = vrTrackchanges;

					cacheResult(vrTrackchanges);

					if ((vrTrackchanges.getProductionPlantCode() == null) ||
							!vrTrackchanges.getProductionPlantCode()
											   .equals(productionPlantCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
							finderArgs, vrTrackchanges);
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
			return (VRTrackchanges)result;
		}
	}

	/**
	 * Removes the vr trackchanges where productionPlantCode = &#63; from the database.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the vr trackchanges that was removed
	 */
	@Override
	public VRTrackchanges removeByF_ProductionPlantCode(
		String productionPlantCode) throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = findByF_ProductionPlantCode(productionPlantCode);

		return remove(vrTrackchanges);
	}

	/**
	 * Returns the number of vr trackchangeses where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr trackchangeses
	 */
	@Override
	public int countByF_ProductionPlantCode(String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE;

		Object[] finderArgs = new Object[] { productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTRACKCHANGES_WHERE);

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
		"vrTrackchanges.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2 =
		"vrTrackchanges.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3 =
		"(vrTrackchanges.productionPlantCode IS NULL OR vrTrackchanges.productionPlantCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE =
		new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED,
			VRTrackchangesImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_DossierId_ContentFileTemplate",
			new String[] { Long.class.getName(), String.class.getName() },
			VRTrackchangesModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTrackchangesModelImpl.CONTENTFILETEMPLATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DOSSIERID_CONTENTFILETEMPLATE =
		new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_DossierId_ContentFileTemplate",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vr trackchanges where dossierId = &#63; and contentFileTemplate = &#63; or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param contentFileTemplate the content file template
	 * @return the matching vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges findByF_DossierId_ContentFileTemplate(
		long dossierId, String contentFileTemplate)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = fetchByF_DossierId_ContentFileTemplate(dossierId,
				contentFileTemplate);

		if (vrTrackchanges == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", contentFileTemplate=");
			msg.append(contentFileTemplate);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRTrackchangesException(msg.toString());
		}

		return vrTrackchanges;
	}

	/**
	 * Returns the vr trackchanges where dossierId = &#63; and contentFileTemplate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param contentFileTemplate the content file template
	 * @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_DossierId_ContentFileTemplate(
		long dossierId, String contentFileTemplate) {
		return fetchByF_DossierId_ContentFileTemplate(dossierId,
			contentFileTemplate, true);
	}

	/**
	 * Returns the vr trackchanges where dossierId = &#63; and contentFileTemplate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param contentFileTemplate the content file template
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_DossierId_ContentFileTemplate(
		long dossierId, String contentFileTemplate, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierId, contentFileTemplate };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
					finderArgs, this);
		}

		if (result instanceof VRTrackchanges) {
			VRTrackchanges vrTrackchanges = (VRTrackchanges)result;

			if ((dossierId != vrTrackchanges.getDossierId()) ||
					!Objects.equals(contentFileTemplate,
						vrTrackchanges.getContentFileTemplate())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRTRACKCHANGES_WHERE);

			query.append(_FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_DOSSIERID_2);

			boolean bindContentFileTemplate = false;

			if (contentFileTemplate == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1);
			}
			else if (contentFileTemplate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3);
			}
			else {
				bindContentFileTemplate = true;

				query.append(_FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindContentFileTemplate) {
					qPos.add(contentFileTemplate);
				}

				List<VRTrackchanges> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRTrackchangesPersistenceImpl.fetchByF_DossierId_ContentFileTemplate(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRTrackchanges vrTrackchanges = list.get(0);

					result = vrTrackchanges;

					cacheResult(vrTrackchanges);

					if ((vrTrackchanges.getDossierId() != dossierId) ||
							(vrTrackchanges.getContentFileTemplate() == null) ||
							!vrTrackchanges.getContentFileTemplate()
											   .equals(contentFileTemplate)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
							finderArgs, vrTrackchanges);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
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
			return (VRTrackchanges)result;
		}
	}

	/**
	 * Removes the vr trackchanges where dossierId = &#63; and contentFileTemplate = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param contentFileTemplate the content file template
	 * @return the vr trackchanges that was removed
	 */
	@Override
	public VRTrackchanges removeByF_DossierId_ContentFileTemplate(
		long dossierId, String contentFileTemplate)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = findByF_DossierId_ContentFileTemplate(dossierId,
				contentFileTemplate);

		return remove(vrTrackchanges);
	}

	/**
	 * Returns the number of vr trackchangeses where dossierId = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param contentFileTemplate the content file template
	 * @return the number of matching vr trackchangeses
	 */
	@Override
	public int countByF_DossierId_ContentFileTemplate(long dossierId,
		String contentFileTemplate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DOSSIERID_CONTENTFILETEMPLATE;

		Object[] finderArgs = new Object[] { dossierId, contentFileTemplate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTRACKCHANGES_WHERE);

			query.append(_FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_DOSSIERID_2);

			boolean bindContentFileTemplate = false;

			if (contentFileTemplate == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1);
			}
			else if (contentFileTemplate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3);
			}
			else {
				bindContentFileTemplate = true;

				query.append(_FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindContentFileTemplate) {
					qPos.add(contentFileTemplate);
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

	private static final String _FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_DOSSIERID_2 =
		"vrTrackchanges.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1 =
		"vrTrackchanges.contentFileTemplate IS NULL";
	private static final String _FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2 =
		"vrTrackchanges.contentFileTemplate = ?";
	private static final String _FINDER_COLUMN_F_DOSSIERID_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3 =
		"(vrTrackchanges.contentFileTemplate IS NULL OR vrTrackchanges.contentFileTemplate = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE =
		new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED,
			VRTrackchangesImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_dossierIdCTN_ContentFileTemplate",
			new String[] { String.class.getName(), String.class.getName() },
			VRTrackchangesModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTrackchangesModelImpl.CONTENTFILETEMPLATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE =
		new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_dossierIdCTN_ContentFileTemplate",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the vr trackchanges where dossierIdCTN = &#63; and contentFileTemplate = &#63; or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @return the matching vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges findByF_dossierIdCTN_ContentFileTemplate(
		String dossierIdCTN, String contentFileTemplate)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = fetchByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN,
				contentFileTemplate);

		if (vrTrackchanges == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierIdCTN=");
			msg.append(dossierIdCTN);

			msg.append(", contentFileTemplate=");
			msg.append(contentFileTemplate);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRTrackchangesException(msg.toString());
		}

		return vrTrackchanges;
	}

	/**
	 * Returns the vr trackchanges where dossierIdCTN = &#63; and contentFileTemplate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_dossierIdCTN_ContentFileTemplate(
		String dossierIdCTN, String contentFileTemplate) {
		return fetchByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN,
			contentFileTemplate, true);
	}

	/**
	 * Returns the vr trackchanges where dossierIdCTN = &#63; and contentFileTemplate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_dossierIdCTN_ContentFileTemplate(
		String dossierIdCTN, String contentFileTemplate,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierIdCTN, contentFileTemplate };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
					finderArgs, this);
		}

		if (result instanceof VRTrackchanges) {
			VRTrackchanges vrTrackchanges = (VRTrackchanges)result;

			if (!Objects.equals(dossierIdCTN, vrTrackchanges.getDossierIdCTN()) ||
					!Objects.equals(contentFileTemplate,
						vrTrackchanges.getContentFileTemplate())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRTRACKCHANGES_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_2);
			}

			boolean bindContentFileTemplate = false;

			if (contentFileTemplate == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1);
			}
			else if (contentFileTemplate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3);
			}
			else {
				bindContentFileTemplate = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
				}

				if (bindContentFileTemplate) {
					qPos.add(contentFileTemplate);
				}

				List<VRTrackchanges> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRTrackchangesPersistenceImpl.fetchByF_dossierIdCTN_ContentFileTemplate(String, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRTrackchanges vrTrackchanges = list.get(0);

					result = vrTrackchanges;

					cacheResult(vrTrackchanges);

					if ((vrTrackchanges.getDossierIdCTN() == null) ||
							!vrTrackchanges.getDossierIdCTN()
											   .equals(dossierIdCTN) ||
							(vrTrackchanges.getContentFileTemplate() == null) ||
							!vrTrackchanges.getContentFileTemplate()
											   .equals(contentFileTemplate)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
							finderArgs, vrTrackchanges);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
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
			return (VRTrackchanges)result;
		}
	}

	/**
	 * Removes the vr trackchanges where dossierIdCTN = &#63; and contentFileTemplate = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @return the vr trackchanges that was removed
	 */
	@Override
	public VRTrackchanges removeByF_dossierIdCTN_ContentFileTemplate(
		String dossierIdCTN, String contentFileTemplate)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = findByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN,
				contentFileTemplate);

		return remove(vrTrackchanges);
	}

	/**
	 * Returns the number of vr trackchangeses where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @return the number of matching vr trackchangeses
	 */
	@Override
	public int countByF_dossierIdCTN_ContentFileTemplate(String dossierIdCTN,
		String contentFileTemplate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE;

		Object[] finderArgs = new Object[] { dossierIdCTN, contentFileTemplate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTRACKCHANGES_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_2);
			}

			boolean bindContentFileTemplate = false;

			if (contentFileTemplate == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1);
			}
			else if (contentFileTemplate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3);
			}
			else {
				bindContentFileTemplate = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
				}

				if (bindContentFileTemplate) {
					qPos.add(contentFileTemplate);
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

	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_1 =
		"vrTrackchanges.dossierIdCTN IS NULL AND ";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_2 =
		"vrTrackchanges.dossierIdCTN = ? AND ";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_3 =
		"(vrTrackchanges.dossierIdCTN IS NULL OR vrTrackchanges.dossierIdCTN = '') AND ";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1 =
		"vrTrackchanges.contentFileTemplate IS NULL";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2 =
		"vrTrackchanges.contentFileTemplate = ?";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3 =
		"(vrTrackchanges.contentFileTemplate IS NULL OR vrTrackchanges.contentFileTemplate = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_CONTENTTYPE =
		new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED,
			VRTrackchangesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_ContentType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE =
		new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED,
			VRTrackchangesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_ContentType",
			new String[] { String.class.getName() },
			VRTrackchangesModelImpl.CONTENTTYPE_COLUMN_BITMASK |
			VRTrackchangesModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_CONTENTTYPE = new FinderPath(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_ContentType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr trackchangeses where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @return the matching vr trackchangeses
	 */
	@Override
	public List<VRTrackchanges> findByF_ContentType(String contentType) {
		return findByF_ContentType(contentType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr trackchangeses where contentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contentType the content type
	 * @param start the lower bound of the range of vr trackchangeses
	 * @param end the upper bound of the range of vr trackchangeses (not inclusive)
	 * @return the range of matching vr trackchangeses
	 */
	@Override
	public List<VRTrackchanges> findByF_ContentType(String contentType,
		int start, int end) {
		return findByF_ContentType(contentType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr trackchangeses where contentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contentType the content type
	 * @param start the lower bound of the range of vr trackchangeses
	 * @param end the upper bound of the range of vr trackchangeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr trackchangeses
	 */
	@Override
	public List<VRTrackchanges> findByF_ContentType(String contentType,
		int start, int end, OrderByComparator<VRTrackchanges> orderByComparator) {
		return findByF_ContentType(contentType, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr trackchangeses where contentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contentType the content type
	 * @param start the lower bound of the range of vr trackchangeses
	 * @param end the upper bound of the range of vr trackchangeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr trackchangeses
	 */
	@Override
	public List<VRTrackchanges> findByF_ContentType(String contentType,
		int start, int end,
		OrderByComparator<VRTrackchanges> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE;
			finderArgs = new Object[] { contentType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_CONTENTTYPE;
			finderArgs = new Object[] { contentType, start, end, orderByComparator };
		}

		List<VRTrackchanges> list = null;

		if (retrieveFromCache) {
			list = (List<VRTrackchanges>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTrackchanges vrTrackchanges : list) {
					if (!Objects.equals(contentType,
								vrTrackchanges.getContentType())) {
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

			query.append(_SQL_SELECT_VRTRACKCHANGES_WHERE);

			boolean bindContentType = false;

			if (contentType == null) {
				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_1);
			}
			else if (contentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_3);
			}
			else {
				bindContentType = true;

				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTrackchangesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContentType) {
					qPos.add(contentType);
				}

				if (!pagination) {
					list = (List<VRTrackchanges>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTrackchanges>)QueryUtil.list(q,
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
	 * Returns the first vr trackchanges in the ordered set where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges findByF_ContentType_First(String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = fetchByF_ContentType_First(contentType,
				orderByComparator);

		if (vrTrackchanges != null) {
			return vrTrackchanges;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contentType=");
		msg.append(contentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTrackchangesException(msg.toString());
	}

	/**
	 * Returns the first vr trackchanges in the ordered set where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_ContentType_First(String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator) {
		List<VRTrackchanges> list = findByF_ContentType(contentType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr trackchanges in the ordered set where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges findByF_ContentType_Last(String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = fetchByF_ContentType_Last(contentType,
				orderByComparator);

		if (vrTrackchanges != null) {
			return vrTrackchanges;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contentType=");
		msg.append(contentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTrackchangesException(msg.toString());
	}

	/**
	 * Returns the last vr trackchanges in the ordered set where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	 */
	@Override
	public VRTrackchanges fetchByF_ContentType_Last(String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator) {
		int count = countByF_ContentType(contentType);

		if (count == 0) {
			return null;
		}

		List<VRTrackchanges> list = findByF_ContentType(contentType, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr trackchangeses before and after the current vr trackchanges in the ordered set where contentType = &#63;.
	 *
	 * @param id the primary key of the current vr trackchanges
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a vr trackchanges with the primary key could not be found
	 */
	@Override
	public VRTrackchanges[] findByF_ContentType_PrevAndNext(long id,
		String contentType, OrderByComparator<VRTrackchanges> orderByComparator)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTrackchanges[] array = new VRTrackchangesImpl[3];

			array[0] = getByF_ContentType_PrevAndNext(session, vrTrackchanges,
					contentType, orderByComparator, true);

			array[1] = vrTrackchanges;

			array[2] = getByF_ContentType_PrevAndNext(session, vrTrackchanges,
					contentType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTrackchanges getByF_ContentType_PrevAndNext(Session session,
		VRTrackchanges vrTrackchanges, String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRTRACKCHANGES_WHERE);

		boolean bindContentType = false;

		if (contentType == null) {
			query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_1);
		}
		else if (contentType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_3);
		}
		else {
			bindContentType = true;

			query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_2);
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
			query.append(VRTrackchangesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindContentType) {
			qPos.add(contentType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTrackchanges);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTrackchanges> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr trackchangeses where contentType = &#63; from the database.
	 *
	 * @param contentType the content type
	 */
	@Override
	public void removeByF_ContentType(String contentType) {
		for (VRTrackchanges vrTrackchanges : findByF_ContentType(contentType,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTrackchanges);
		}
	}

	/**
	 * Returns the number of vr trackchangeses where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @return the number of matching vr trackchangeses
	 */
	@Override
	public int countByF_ContentType(String contentType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_CONTENTTYPE;

		Object[] finderArgs = new Object[] { contentType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTRACKCHANGES_WHERE);

			boolean bindContentType = false;

			if (contentType == null) {
				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_1);
			}
			else if (contentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_3);
			}
			else {
				bindContentType = true;

				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContentType) {
					qPos.add(contentType);
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

	private static final String _FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_1 = "vrTrackchanges.contentType IS NULL";
	private static final String _FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_2 = "vrTrackchanges.contentType = ?";
	private static final String _FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_3 = "(vrTrackchanges.contentType IS NULL OR vrTrackchanges.contentType = '')";

	public VRTrackchangesPersistenceImpl() {
		setModelClass(VRTrackchanges.class);
	}

	/**
	 * Caches the vr trackchanges in the entity cache if it is enabled.
	 *
	 * @param vrTrackchanges the vr trackchanges
	 */
	@Override
	public void cacheResult(VRTrackchanges vrTrackchanges) {
		entityCache.putResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesImpl.class, vrTrackchanges.getPrimaryKey(),
			vrTrackchanges);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_APPLICANTCODE,
			new Object[] { vrTrackchanges.getApplicantCode() }, vrTrackchanges);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
			new Object[] { vrTrackchanges.getProductionPlantCode() },
			vrTrackchanges);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
			new Object[] {
				vrTrackchanges.getDossierId(),
				vrTrackchanges.getContentFileTemplate()
			}, vrTrackchanges);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
			new Object[] {
				vrTrackchanges.getDossierIdCTN(),
				vrTrackchanges.getContentFileTemplate()
			}, vrTrackchanges);

		vrTrackchanges.resetOriginalValues();
	}

	/**
	 * Caches the vr trackchangeses in the entity cache if it is enabled.
	 *
	 * @param vrTrackchangeses the vr trackchangeses
	 */
	@Override
	public void cacheResult(List<VRTrackchanges> vrTrackchangeses) {
		for (VRTrackchanges vrTrackchanges : vrTrackchangeses) {
			if (entityCache.getResult(
						VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
						VRTrackchangesImpl.class, vrTrackchanges.getPrimaryKey()) == null) {
				cacheResult(vrTrackchanges);
			}
			else {
				vrTrackchanges.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr trackchangeses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTrackchangesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr trackchanges.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTrackchanges vrTrackchanges) {
		entityCache.removeResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesImpl.class, vrTrackchanges.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRTrackchangesModelImpl)vrTrackchanges, true);
	}

	@Override
	public void clearCache(List<VRTrackchanges> vrTrackchangeses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTrackchanges vrTrackchanges : vrTrackchangeses) {
			entityCache.removeResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
				VRTrackchangesImpl.class, vrTrackchanges.getPrimaryKey());

			clearUniqueFindersCache((VRTrackchangesModelImpl)vrTrackchanges,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRTrackchangesModelImpl vrTrackchangesModelImpl) {
		Object[] args = new Object[] { vrTrackchangesModelImpl.getApplicantCode() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_APPLICANTCODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_APPLICANTCODE, args,
			vrTrackchangesModelImpl, false);

		args = new Object[] { vrTrackchangesModelImpl.getProductionPlantCode() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE, args,
			vrTrackchangesModelImpl, false);

		args = new Object[] {
				vrTrackchangesModelImpl.getDossierId(),
				vrTrackchangesModelImpl.getContentFileTemplate()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
			args, vrTrackchangesModelImpl, false);

		args = new Object[] {
				vrTrackchangesModelImpl.getDossierIdCTN(),
				vrTrackchangesModelImpl.getContentFileTemplate()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
			args, vrTrackchangesModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRTrackchangesModelImpl vrTrackchangesModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrTrackchangesModelImpl.getApplicantCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APPLICANTCODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_APPLICANTCODE, args);
		}

		if ((vrTrackchangesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_APPLICANTCODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrTrackchangesModelImpl.getOriginalApplicantCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APPLICANTCODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_APPLICANTCODE, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrTrackchangesModelImpl.getProductionPlantCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
				args);
		}

		if ((vrTrackchangesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrTrackchangesModelImpl.getOriginalProductionPlantCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_PRODUCTIONPLANTCODE,
				args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrTrackchangesModelImpl.getDossierId(),
					vrTrackchangesModelImpl.getContentFileTemplate()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
				args);
		}

		if ((vrTrackchangesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrTrackchangesModelImpl.getOriginalDossierId(),
					vrTrackchangesModelImpl.getOriginalContentFileTemplate()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERID_CONTENTFILETEMPLATE,
				args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrTrackchangesModelImpl.getDossierIdCTN(),
					vrTrackchangesModelImpl.getContentFileTemplate()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
				args);
		}

		if ((vrTrackchangesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrTrackchangesModelImpl.getOriginalDossierIdCTN(),
					vrTrackchangesModelImpl.getOriginalContentFileTemplate()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
				args);
		}
	}

	/**
	 * Creates a new vr trackchanges with the primary key. Does not add the vr trackchanges to the database.
	 *
	 * @param id the primary key for the new vr trackchanges
	 * @return the new vr trackchanges
	 */
	@Override
	public VRTrackchanges create(long id) {
		VRTrackchanges vrTrackchanges = new VRTrackchangesImpl();

		vrTrackchanges.setNew(true);
		vrTrackchanges.setPrimaryKey(id);

		return vrTrackchanges;
	}

	/**
	 * Removes the vr trackchanges with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr trackchanges
	 * @return the vr trackchanges that was removed
	 * @throws NoSuchVRTrackchangesException if a vr trackchanges with the primary key could not be found
	 */
	@Override
	public VRTrackchanges remove(long id) throws NoSuchVRTrackchangesException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr trackchanges with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr trackchanges
	 * @return the vr trackchanges that was removed
	 * @throws NoSuchVRTrackchangesException if a vr trackchanges with the primary key could not be found
	 */
	@Override
	public VRTrackchanges remove(Serializable primaryKey)
		throws NoSuchVRTrackchangesException {
		Session session = null;

		try {
			session = openSession();

			VRTrackchanges vrTrackchanges = (VRTrackchanges)session.get(VRTrackchangesImpl.class,
					primaryKey);

			if (vrTrackchanges == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTrackchangesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTrackchanges);
		}
		catch (NoSuchVRTrackchangesException nsee) {
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
	protected VRTrackchanges removeImpl(VRTrackchanges vrTrackchanges) {
		vrTrackchanges = toUnwrappedModel(vrTrackchanges);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTrackchanges)) {
				vrTrackchanges = (VRTrackchanges)session.get(VRTrackchangesImpl.class,
						vrTrackchanges.getPrimaryKeyObj());
			}

			if (vrTrackchanges != null) {
				session.delete(vrTrackchanges);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTrackchanges != null) {
			clearCache(vrTrackchanges);
		}

		return vrTrackchanges;
	}

	@Override
	public VRTrackchanges updateImpl(VRTrackchanges vrTrackchanges) {
		vrTrackchanges = toUnwrappedModel(vrTrackchanges);

		boolean isNew = vrTrackchanges.isNew();

		VRTrackchangesModelImpl vrTrackchangesModelImpl = (VRTrackchangesModelImpl)vrTrackchanges;

		Session session = null;

		try {
			session = openSession();

			if (vrTrackchanges.isNew()) {
				session.save(vrTrackchanges);

				vrTrackchanges.setNew(false);
			}
			else {
				vrTrackchanges = (VRTrackchanges)session.merge(vrTrackchanges);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTrackchangesModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTrackchangesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTrackchangesModelImpl.getOriginalContentType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_CONTENTTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE,
					args);

				args = new Object[] { vrTrackchangesModelImpl.getContentType() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_CONTENTTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE,
					args);
			}
		}

		entityCache.putResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
			VRTrackchangesImpl.class, vrTrackchanges.getPrimaryKey(),
			vrTrackchanges, false);

		clearUniqueFindersCache(vrTrackchangesModelImpl, false);
		cacheUniqueFindersCache(vrTrackchangesModelImpl);

		vrTrackchanges.resetOriginalValues();

		return vrTrackchanges;
	}

	protected VRTrackchanges toUnwrappedModel(VRTrackchanges vrTrackchanges) {
		if (vrTrackchanges instanceof VRTrackchangesImpl) {
			return vrTrackchanges;
		}

		VRTrackchangesImpl vrTrackchangesImpl = new VRTrackchangesImpl();

		vrTrackchangesImpl.setNew(vrTrackchanges.isNew());
		vrTrackchangesImpl.setPrimaryKey(vrTrackchanges.getPrimaryKey());

		vrTrackchangesImpl.setId(vrTrackchanges.getId());
		vrTrackchangesImpl.setApplicantCode(vrTrackchanges.getApplicantCode());
		vrTrackchangesImpl.setProductionPlantCode(vrTrackchanges.getProductionPlantCode());
		vrTrackchangesImpl.setContentType(vrTrackchanges.getContentType());
		vrTrackchangesImpl.setContentFileTemplate(vrTrackchanges.getContentFileTemplate());
		vrTrackchangesImpl.setPreviousContentFileEntryId(vrTrackchanges.getPreviousContentFileEntryId());
		vrTrackchangesImpl.setCurrentContentFileEntryId(vrTrackchanges.getCurrentContentFileEntryId());
		vrTrackchangesImpl.setNextContentFileEntryId(vrTrackchanges.getNextContentFileEntryId());
		vrTrackchangesImpl.setDossierId(vrTrackchanges.getDossierId());
		vrTrackchangesImpl.setDossierIdCTN(vrTrackchanges.getDossierIdCTN());
		vrTrackchangesImpl.setDossierNo(vrTrackchanges.getDossierNo());
		vrTrackchangesImpl.setModifyUserId(vrTrackchanges.getModifyUserId());
		vrTrackchangesImpl.setCreatedDate(vrTrackchanges.getCreatedDate());
		vrTrackchangesImpl.setModifyDate(vrTrackchanges.getModifyDate());
		vrTrackchangesImpl.setSyncDate(vrTrackchanges.getSyncDate());

		return vrTrackchangesImpl;
	}

	/**
	 * Returns the vr trackchanges with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr trackchanges
	 * @return the vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a vr trackchanges with the primary key could not be found
	 */
	@Override
	public VRTrackchanges findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTrackchangesException {
		VRTrackchanges vrTrackchanges = fetchByPrimaryKey(primaryKey);

		if (vrTrackchanges == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTrackchangesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTrackchanges;
	}

	/**
	 * Returns the vr trackchanges with the primary key or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	 *
	 * @param id the primary key of the vr trackchanges
	 * @return the vr trackchanges
	 * @throws NoSuchVRTrackchangesException if a vr trackchanges with the primary key could not be found
	 */
	@Override
	public VRTrackchanges findByPrimaryKey(long id)
		throws NoSuchVRTrackchangesException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr trackchanges with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr trackchanges
	 * @return the vr trackchanges, or <code>null</code> if a vr trackchanges with the primary key could not be found
	 */
	@Override
	public VRTrackchanges fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
				VRTrackchangesImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTrackchanges vrTrackchanges = (VRTrackchanges)serializable;

		if (vrTrackchanges == null) {
			Session session = null;

			try {
				session = openSession();

				vrTrackchanges = (VRTrackchanges)session.get(VRTrackchangesImpl.class,
						primaryKey);

				if (vrTrackchanges != null) {
					cacheResult(vrTrackchanges);
				}
				else {
					entityCache.putResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
						VRTrackchangesImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
					VRTrackchangesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTrackchanges;
	}

	/**
	 * Returns the vr trackchanges with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr trackchanges
	 * @return the vr trackchanges, or <code>null</code> if a vr trackchanges with the primary key could not be found
	 */
	@Override
	public VRTrackchanges fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTrackchanges> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTrackchanges> map = new HashMap<Serializable, VRTrackchanges>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTrackchanges vrTrackchanges = fetchByPrimaryKey(primaryKey);

			if (vrTrackchanges != null) {
				map.put(primaryKey, vrTrackchanges);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
					VRTrackchangesImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTrackchanges)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTRACKCHANGES_WHERE_PKS_IN);

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

			for (VRTrackchanges vrTrackchanges : (List<VRTrackchanges>)q.list()) {
				map.put(vrTrackchanges.getPrimaryKeyObj(), vrTrackchanges);

				cacheResult(vrTrackchanges);

				uncachedPrimaryKeys.remove(vrTrackchanges.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTrackchangesModelImpl.ENTITY_CACHE_ENABLED,
					VRTrackchangesImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr trackchangeses.
	 *
	 * @return the vr trackchangeses
	 */
	@Override
	public List<VRTrackchanges> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr trackchangeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr trackchangeses
	 * @param end the upper bound of the range of vr trackchangeses (not inclusive)
	 * @return the range of vr trackchangeses
	 */
	@Override
	public List<VRTrackchanges> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr trackchangeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr trackchangeses
	 * @param end the upper bound of the range of vr trackchangeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr trackchangeses
	 */
	@Override
	public List<VRTrackchanges> findAll(int start, int end,
		OrderByComparator<VRTrackchanges> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr trackchangeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr trackchangeses
	 * @param end the upper bound of the range of vr trackchangeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr trackchangeses
	 */
	@Override
	public List<VRTrackchanges> findAll(int start, int end,
		OrderByComparator<VRTrackchanges> orderByComparator,
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

		List<VRTrackchanges> list = null;

		if (retrieveFromCache) {
			list = (List<VRTrackchanges>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTRACKCHANGES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTRACKCHANGES;

				if (pagination) {
					sql = sql.concat(VRTrackchangesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTrackchanges>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTrackchanges>)QueryUtil.list(q,
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
	 * Removes all the vr trackchangeses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTrackchanges vrTrackchanges : findAll()) {
			remove(vrTrackchanges);
		}
	}

	/**
	 * Returns the number of vr trackchangeses.
	 *
	 * @return the number of vr trackchangeses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTRACKCHANGES);

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
		return VRTrackchangesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr trackchanges persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTrackchangesImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTRACKCHANGES = "SELECT vrTrackchanges FROM VRTrackchanges vrTrackchanges";
	private static final String _SQL_SELECT_VRTRACKCHANGES_WHERE_PKS_IN = "SELECT vrTrackchanges FROM VRTrackchanges vrTrackchanges WHERE id IN (";
	private static final String _SQL_SELECT_VRTRACKCHANGES_WHERE = "SELECT vrTrackchanges FROM VRTrackchanges vrTrackchanges WHERE ";
	private static final String _SQL_COUNT_VRTRACKCHANGES = "SELECT COUNT(vrTrackchanges) FROM VRTrackchanges vrTrackchanges";
	private static final String _SQL_COUNT_VRTRACKCHANGES_WHERE = "SELECT COUNT(vrTrackchanges) FROM VRTrackchanges vrTrackchanges WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTrackchanges.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTrackchanges exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTrackchanges exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTrackchangesPersistenceImpl.class);
}