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

import com.fds.vr.business.exception.NoSuchVRTemplateNoException;
import com.fds.vr.business.model.VRTemplateNo;
import com.fds.vr.business.model.impl.VRTemplateNoImpl;
import com.fds.vr.business.model.impl.VRTemplateNoModelImpl;
import com.fds.vr.business.service.persistence.VRTemplateNoPersistence;

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
 * The persistence implementation for the vr template no service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTemplateNoPersistence
 * @see com.fds.vr.business.service.persistence.VRTemplateNoUtil
 * @generated
 */
@ProviderType
public class VRTemplateNoPersistenceImpl extends BasePersistenceImpl<VRTemplateNo>
	implements VRTemplateNoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTemplateNoUtil} to access the vr template no persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTemplateNoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoModelImpl.FINDER_CACHE_ENABLED, VRTemplateNoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoModelImpl.FINDER_CACHE_ENABLED, VRTemplateNoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_P_N = new FinderPath(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoModelImpl.FINDER_CACHE_ENABLED, VRTemplateNoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByP_N",
			new String[] { String.class.getName() },
			VRTemplateNoModelImpl.PATTERNNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_N = new FinderPath(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_N",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr template no where patternNo = &#63; or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	 *
	 * @param patternNo the pattern no
	 * @return the matching vr template no
	 * @throws NoSuchVRTemplateNoException if a matching vr template no could not be found
	 */
	@Override
	public VRTemplateNo findByP_N(String patternNo)
		throws NoSuchVRTemplateNoException {
		VRTemplateNo vrTemplateNo = fetchByP_N(patternNo);

		if (vrTemplateNo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("patternNo=");
			msg.append(patternNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRTemplateNoException(msg.toString());
		}

		return vrTemplateNo;
	}

	/**
	 * Returns the vr template no where patternNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param patternNo the pattern no
	 * @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	 */
	@Override
	public VRTemplateNo fetchByP_N(String patternNo) {
		return fetchByP_N(patternNo, true);
	}

	/**
	 * Returns the vr template no where patternNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param patternNo the pattern no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	 */
	@Override
	public VRTemplateNo fetchByP_N(String patternNo, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { patternNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_P_N,
					finderArgs, this);
		}

		if (result instanceof VRTemplateNo) {
			VRTemplateNo vrTemplateNo = (VRTemplateNo)result;

			if (!Objects.equals(patternNo, vrTemplateNo.getPatternNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRTEMPLATENO_WHERE);

			boolean bindPatternNo = false;

			if (patternNo == null) {
				query.append(_FINDER_COLUMN_P_N_PATTERNNO_1);
			}
			else if (patternNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_N_PATTERNNO_3);
			}
			else {
				bindPatternNo = true;

				query.append(_FINDER_COLUMN_P_N_PATTERNNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPatternNo) {
					qPos.add(patternNo);
				}

				List<VRTemplateNo> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_P_N, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRTemplateNoPersistenceImpl.fetchByP_N(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRTemplateNo vrTemplateNo = list.get(0);

					result = vrTemplateNo;

					cacheResult(vrTemplateNo);

					if ((vrTemplateNo.getPatternNo() == null) ||
							!vrTemplateNo.getPatternNo().equals(patternNo)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_P_N,
							finderArgs, vrTemplateNo);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N, finderArgs);

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
			return (VRTemplateNo)result;
		}
	}

	/**
	 * Removes the vr template no where patternNo = &#63; from the database.
	 *
	 * @param patternNo the pattern no
	 * @return the vr template no that was removed
	 */
	@Override
	public VRTemplateNo removeByP_N(String patternNo)
		throws NoSuchVRTemplateNoException {
		VRTemplateNo vrTemplateNo = findByP_N(patternNo);

		return remove(vrTemplateNo);
	}

	/**
	 * Returns the number of vr template nos where patternNo = &#63;.
	 *
	 * @param patternNo the pattern no
	 * @return the number of matching vr template nos
	 */
	@Override
	public int countByP_N(String patternNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_N;

		Object[] finderArgs = new Object[] { patternNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTEMPLATENO_WHERE);

			boolean bindPatternNo = false;

			if (patternNo == null) {
				query.append(_FINDER_COLUMN_P_N_PATTERNNO_1);
			}
			else if (patternNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_N_PATTERNNO_3);
			}
			else {
				bindPatternNo = true;

				query.append(_FINDER_COLUMN_P_N_PATTERNNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPatternNo) {
					qPos.add(patternNo);
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

	private static final String _FINDER_COLUMN_P_N_PATTERNNO_1 = "vrTemplateNo.patternNo IS NULL";
	private static final String _FINDER_COLUMN_P_N_PATTERNNO_2 = "vrTemplateNo.patternNo = ?";
	private static final String _FINDER_COLUMN_P_N_PATTERNNO_3 = "(vrTemplateNo.patternNo IS NULL OR vrTemplateNo.patternNo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_P_N_Y = new FinderPath(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoModelImpl.FINDER_CACHE_ENABLED, VRTemplateNoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByP_N_Y",
			new String[] { String.class.getName(), Integer.class.getName() },
			VRTemplateNoModelImpl.PATTERNNO_COLUMN_BITMASK |
			VRTemplateNoModelImpl.YEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_N_Y = new FinderPath(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_N_Y",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns the vr template no where patternNo = &#63; and year = &#63; or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	 *
	 * @param patternNo the pattern no
	 * @param year the year
	 * @return the matching vr template no
	 * @throws NoSuchVRTemplateNoException if a matching vr template no could not be found
	 */
	@Override
	public VRTemplateNo findByP_N_Y(String patternNo, int year)
		throws NoSuchVRTemplateNoException {
		VRTemplateNo vrTemplateNo = fetchByP_N_Y(patternNo, year);

		if (vrTemplateNo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("patternNo=");
			msg.append(patternNo);

			msg.append(", year=");
			msg.append(year);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRTemplateNoException(msg.toString());
		}

		return vrTemplateNo;
	}

	/**
	 * Returns the vr template no where patternNo = &#63; and year = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param patternNo the pattern no
	 * @param year the year
	 * @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	 */
	@Override
	public VRTemplateNo fetchByP_N_Y(String patternNo, int year) {
		return fetchByP_N_Y(patternNo, year, true);
	}

	/**
	 * Returns the vr template no where patternNo = &#63; and year = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param patternNo the pattern no
	 * @param year the year
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	 */
	@Override
	public VRTemplateNo fetchByP_N_Y(String patternNo, int year,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { patternNo, year };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_P_N_Y,
					finderArgs, this);
		}

		if (result instanceof VRTemplateNo) {
			VRTemplateNo vrTemplateNo = (VRTemplateNo)result;

			if (!Objects.equals(patternNo, vrTemplateNo.getPatternNo()) ||
					(year != vrTemplateNo.getYear())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRTEMPLATENO_WHERE);

			boolean bindPatternNo = false;

			if (patternNo == null) {
				query.append(_FINDER_COLUMN_P_N_Y_PATTERNNO_1);
			}
			else if (patternNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_N_Y_PATTERNNO_3);
			}
			else {
				bindPatternNo = true;

				query.append(_FINDER_COLUMN_P_N_Y_PATTERNNO_2);
			}

			query.append(_FINDER_COLUMN_P_N_Y_YEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPatternNo) {
					qPos.add(patternNo);
				}

				qPos.add(year);

				List<VRTemplateNo> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_Y,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRTemplateNoPersistenceImpl.fetchByP_N_Y(String, int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRTemplateNo vrTemplateNo = list.get(0);

					result = vrTemplateNo;

					cacheResult(vrTemplateNo);

					if ((vrTemplateNo.getPatternNo() == null) ||
							!vrTemplateNo.getPatternNo().equals(patternNo) ||
							(vrTemplateNo.getYear() != year)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_Y,
							finderArgs, vrTemplateNo);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N_Y, finderArgs);

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
			return (VRTemplateNo)result;
		}
	}

	/**
	 * Removes the vr template no where patternNo = &#63; and year = &#63; from the database.
	 *
	 * @param patternNo the pattern no
	 * @param year the year
	 * @return the vr template no that was removed
	 */
	@Override
	public VRTemplateNo removeByP_N_Y(String patternNo, int year)
		throws NoSuchVRTemplateNoException {
		VRTemplateNo vrTemplateNo = findByP_N_Y(patternNo, year);

		return remove(vrTemplateNo);
	}

	/**
	 * Returns the number of vr template nos where patternNo = &#63; and year = &#63;.
	 *
	 * @param patternNo the pattern no
	 * @param year the year
	 * @return the number of matching vr template nos
	 */
	@Override
	public int countByP_N_Y(String patternNo, int year) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_N_Y;

		Object[] finderArgs = new Object[] { patternNo, year };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTEMPLATENO_WHERE);

			boolean bindPatternNo = false;

			if (patternNo == null) {
				query.append(_FINDER_COLUMN_P_N_Y_PATTERNNO_1);
			}
			else if (patternNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_N_Y_PATTERNNO_3);
			}
			else {
				bindPatternNo = true;

				query.append(_FINDER_COLUMN_P_N_Y_PATTERNNO_2);
			}

			query.append(_FINDER_COLUMN_P_N_Y_YEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPatternNo) {
					qPos.add(patternNo);
				}

				qPos.add(year);

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

	private static final String _FINDER_COLUMN_P_N_Y_PATTERNNO_1 = "vrTemplateNo.patternNo IS NULL AND ";
	private static final String _FINDER_COLUMN_P_N_Y_PATTERNNO_2 = "vrTemplateNo.patternNo = ? AND ";
	private static final String _FINDER_COLUMN_P_N_Y_PATTERNNO_3 = "(vrTemplateNo.patternNo IS NULL OR vrTemplateNo.patternNo = '') AND ";
	private static final String _FINDER_COLUMN_P_N_Y_YEAR_2 = "vrTemplateNo.year = ?";

	public VRTemplateNoPersistenceImpl() {
		setModelClass(VRTemplateNo.class);
	}

	/**
	 * Caches the vr template no in the entity cache if it is enabled.
	 *
	 * @param vrTemplateNo the vr template no
	 */
	@Override
	public void cacheResult(VRTemplateNo vrTemplateNo) {
		entityCache.putResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoImpl.class, vrTemplateNo.getPrimaryKey(), vrTemplateNo);

		finderCache.putResult(FINDER_PATH_FETCH_BY_P_N,
			new Object[] { vrTemplateNo.getPatternNo() }, vrTemplateNo);

		finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_Y,
			new Object[] { vrTemplateNo.getPatternNo(), vrTemplateNo.getYear() },
			vrTemplateNo);

		vrTemplateNo.resetOriginalValues();
	}

	/**
	 * Caches the vr template nos in the entity cache if it is enabled.
	 *
	 * @param vrTemplateNos the vr template nos
	 */
	@Override
	public void cacheResult(List<VRTemplateNo> vrTemplateNos) {
		for (VRTemplateNo vrTemplateNo : vrTemplateNos) {
			if (entityCache.getResult(
						VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
						VRTemplateNoImpl.class, vrTemplateNo.getPrimaryKey()) == null) {
				cacheResult(vrTemplateNo);
			}
			else {
				vrTemplateNo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr template nos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTemplateNoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr template no.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTemplateNo vrTemplateNo) {
		entityCache.removeResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoImpl.class, vrTemplateNo.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRTemplateNoModelImpl)vrTemplateNo, true);
	}

	@Override
	public void clearCache(List<VRTemplateNo> vrTemplateNos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTemplateNo vrTemplateNo : vrTemplateNos) {
			entityCache.removeResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
				VRTemplateNoImpl.class, vrTemplateNo.getPrimaryKey());

			clearUniqueFindersCache((VRTemplateNoModelImpl)vrTemplateNo, true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRTemplateNoModelImpl vrTemplateNoModelImpl) {
		Object[] args = new Object[] { vrTemplateNoModelImpl.getPatternNo() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_P_N, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_P_N, args,
			vrTemplateNoModelImpl, false);

		args = new Object[] {
				vrTemplateNoModelImpl.getPatternNo(),
				vrTemplateNoModelImpl.getYear()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_P_N_Y, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_Y, args,
			vrTemplateNoModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRTemplateNoModelImpl vrTemplateNoModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { vrTemplateNoModelImpl.getPatternNo() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_P_N, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N, args);
		}

		if ((vrTemplateNoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_P_N.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrTemplateNoModelImpl.getOriginalPatternNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_P_N, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrTemplateNoModelImpl.getPatternNo(),
					vrTemplateNoModelImpl.getYear()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_P_N_Y, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N_Y, args);
		}

		if ((vrTemplateNoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_P_N_Y.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrTemplateNoModelImpl.getOriginalPatternNo(),
					vrTemplateNoModelImpl.getOriginalYear()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_P_N_Y, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N_Y, args);
		}
	}

	/**
	 * Creates a new vr template no with the primary key. Does not add the vr template no to the database.
	 *
	 * @param id the primary key for the new vr template no
	 * @return the new vr template no
	 */
	@Override
	public VRTemplateNo create(long id) {
		VRTemplateNo vrTemplateNo = new VRTemplateNoImpl();

		vrTemplateNo.setNew(true);
		vrTemplateNo.setPrimaryKey(id);

		return vrTemplateNo;
	}

	/**
	 * Removes the vr template no with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr template no
	 * @return the vr template no that was removed
	 * @throws NoSuchVRTemplateNoException if a vr template no with the primary key could not be found
	 */
	@Override
	public VRTemplateNo remove(long id) throws NoSuchVRTemplateNoException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr template no with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr template no
	 * @return the vr template no that was removed
	 * @throws NoSuchVRTemplateNoException if a vr template no with the primary key could not be found
	 */
	@Override
	public VRTemplateNo remove(Serializable primaryKey)
		throws NoSuchVRTemplateNoException {
		Session session = null;

		try {
			session = openSession();

			VRTemplateNo vrTemplateNo = (VRTemplateNo)session.get(VRTemplateNoImpl.class,
					primaryKey);

			if (vrTemplateNo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTemplateNoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTemplateNo);
		}
		catch (NoSuchVRTemplateNoException nsee) {
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
	protected VRTemplateNo removeImpl(VRTemplateNo vrTemplateNo) {
		vrTemplateNo = toUnwrappedModel(vrTemplateNo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTemplateNo)) {
				vrTemplateNo = (VRTemplateNo)session.get(VRTemplateNoImpl.class,
						vrTemplateNo.getPrimaryKeyObj());
			}

			if (vrTemplateNo != null) {
				session.delete(vrTemplateNo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTemplateNo != null) {
			clearCache(vrTemplateNo);
		}

		return vrTemplateNo;
	}

	@Override
	public VRTemplateNo updateImpl(VRTemplateNo vrTemplateNo) {
		vrTemplateNo = toUnwrappedModel(vrTemplateNo);

		boolean isNew = vrTemplateNo.isNew();

		VRTemplateNoModelImpl vrTemplateNoModelImpl = (VRTemplateNoModelImpl)vrTemplateNo;

		Session session = null;

		try {
			session = openSession();

			if (vrTemplateNo.isNew()) {
				session.save(vrTemplateNo);

				vrTemplateNo.setNew(false);
			}
			else {
				vrTemplateNo = (VRTemplateNo)session.merge(vrTemplateNo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTemplateNoModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
			VRTemplateNoImpl.class, vrTemplateNo.getPrimaryKey(), vrTemplateNo,
			false);

		clearUniqueFindersCache(vrTemplateNoModelImpl, false);
		cacheUniqueFindersCache(vrTemplateNoModelImpl);

		vrTemplateNo.resetOriginalValues();

		return vrTemplateNo;
	}

	protected VRTemplateNo toUnwrappedModel(VRTemplateNo vrTemplateNo) {
		if (vrTemplateNo instanceof VRTemplateNoImpl) {
			return vrTemplateNo;
		}

		VRTemplateNoImpl vrTemplateNoImpl = new VRTemplateNoImpl();

		vrTemplateNoImpl.setNew(vrTemplateNo.isNew());
		vrTemplateNoImpl.setPrimaryKey(vrTemplateNo.getPrimaryKey());

		vrTemplateNoImpl.setId(vrTemplateNo.getId());
		vrTemplateNoImpl.setPatternNo(vrTemplateNo.getPatternNo());
		vrTemplateNoImpl.setYear(vrTemplateNo.getYear());
		vrTemplateNoImpl.setInitNumber(vrTemplateNo.getInitNumber());

		return vrTemplateNoImpl;
	}

	/**
	 * Returns the vr template no with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr template no
	 * @return the vr template no
	 * @throws NoSuchVRTemplateNoException if a vr template no with the primary key could not be found
	 */
	@Override
	public VRTemplateNo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTemplateNoException {
		VRTemplateNo vrTemplateNo = fetchByPrimaryKey(primaryKey);

		if (vrTemplateNo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTemplateNoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTemplateNo;
	}

	/**
	 * Returns the vr template no with the primary key or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	 *
	 * @param id the primary key of the vr template no
	 * @return the vr template no
	 * @throws NoSuchVRTemplateNoException if a vr template no with the primary key could not be found
	 */
	@Override
	public VRTemplateNo findByPrimaryKey(long id)
		throws NoSuchVRTemplateNoException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr template no with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr template no
	 * @return the vr template no, or <code>null</code> if a vr template no with the primary key could not be found
	 */
	@Override
	public VRTemplateNo fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
				VRTemplateNoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTemplateNo vrTemplateNo = (VRTemplateNo)serializable;

		if (vrTemplateNo == null) {
			Session session = null;

			try {
				session = openSession();

				vrTemplateNo = (VRTemplateNo)session.get(VRTemplateNoImpl.class,
						primaryKey);

				if (vrTemplateNo != null) {
					cacheResult(vrTemplateNo);
				}
				else {
					entityCache.putResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
						VRTemplateNoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
					VRTemplateNoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTemplateNo;
	}

	/**
	 * Returns the vr template no with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr template no
	 * @return the vr template no, or <code>null</code> if a vr template no with the primary key could not be found
	 */
	@Override
	public VRTemplateNo fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTemplateNo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTemplateNo> map = new HashMap<Serializable, VRTemplateNo>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTemplateNo vrTemplateNo = fetchByPrimaryKey(primaryKey);

			if (vrTemplateNo != null) {
				map.put(primaryKey, vrTemplateNo);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
					VRTemplateNoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTemplateNo)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTEMPLATENO_WHERE_PKS_IN);

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

			for (VRTemplateNo vrTemplateNo : (List<VRTemplateNo>)q.list()) {
				map.put(vrTemplateNo.getPrimaryKeyObj(), vrTemplateNo);

				cacheResult(vrTemplateNo);

				uncachedPrimaryKeys.remove(vrTemplateNo.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTemplateNoModelImpl.ENTITY_CACHE_ENABLED,
					VRTemplateNoImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr template nos.
	 *
	 * @return the vr template nos
	 */
	@Override
	public List<VRTemplateNo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr template nos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr template nos
	 * @param end the upper bound of the range of vr template nos (not inclusive)
	 * @return the range of vr template nos
	 */
	@Override
	public List<VRTemplateNo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr template nos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr template nos
	 * @param end the upper bound of the range of vr template nos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr template nos
	 */
	@Override
	public List<VRTemplateNo> findAll(int start, int end,
		OrderByComparator<VRTemplateNo> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr template nos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr template nos
	 * @param end the upper bound of the range of vr template nos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr template nos
	 */
	@Override
	public List<VRTemplateNo> findAll(int start, int end,
		OrderByComparator<VRTemplateNo> orderByComparator,
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

		List<VRTemplateNo> list = null;

		if (retrieveFromCache) {
			list = (List<VRTemplateNo>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTEMPLATENO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTEMPLATENO;

				if (pagination) {
					sql = sql.concat(VRTemplateNoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTemplateNo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTemplateNo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr template nos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTemplateNo vrTemplateNo : findAll()) {
			remove(vrTemplateNo);
		}
	}

	/**
	 * Returns the number of vr template nos.
	 *
	 * @return the number of vr template nos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTEMPLATENO);

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
		return VRTemplateNoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr template no persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTemplateNoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTEMPLATENO = "SELECT vrTemplateNo FROM VRTemplateNo vrTemplateNo";
	private static final String _SQL_SELECT_VRTEMPLATENO_WHERE_PKS_IN = "SELECT vrTemplateNo FROM VRTemplateNo vrTemplateNo WHERE id IN (";
	private static final String _SQL_SELECT_VRTEMPLATENO_WHERE = "SELECT vrTemplateNo FROM VRTemplateNo vrTemplateNo WHERE ";
	private static final String _SQL_COUNT_VRTEMPLATENO = "SELECT COUNT(vrTemplateNo) FROM VRTemplateNo vrTemplateNo";
	private static final String _SQL_COUNT_VRTEMPLATENO_WHERE = "SELECT COUNT(vrTemplateNo) FROM VRTemplateNo vrTemplateNo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTemplateNo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTemplateNo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTemplateNo exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTemplateNoPersistenceImpl.class);
}