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

import com.fds.vr.business.exception.NoSuchVRReportException;
import com.fds.vr.business.model.VRReport;
import com.fds.vr.business.model.impl.VRReportImpl;
import com.fds.vr.business.model.impl.VRReportModelImpl;
import com.fds.vr.business.service.persistence.VRReportPersistence;

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
 * The persistence implementation for the vr report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRReportPersistence
 * @see com.fds.vr.business.service.persistence.VRReportUtil
 * @generated
 */
@ProviderType
public class VRReportPersistenceImpl extends BasePersistenceImpl<VRReport>
	implements VRReportPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRReportUtil} to access the vr report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRReportImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRReportModelImpl.ENTITY_CACHE_ENABLED,
			VRReportModelImpl.FINDER_CACHE_ENABLED, VRReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRReportModelImpl.ENTITY_CACHE_ENABLED,
			VRReportModelImpl.FINDER_CACHE_ENABLED, VRReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRReportModelImpl.ENTITY_CACHE_ENABLED,
			VRReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REPORTCODE = new FinderPath(VRReportModelImpl.ENTITY_CACHE_ENABLED,
			VRReportModelImpl.FINDER_CACHE_ENABLED, VRReportImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByReportCode",
			new String[] { String.class.getName() },
			VRReportModelImpl.REPORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPORTCODE = new FinderPath(VRReportModelImpl.ENTITY_CACHE_ENABLED,
			VRReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReportCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr report where reportCode = &#63; or throws a {@link NoSuchVRReportException} if it could not be found.
	 *
	 * @param reportCode the report code
	 * @return the matching vr report
	 * @throws NoSuchVRReportException if a matching vr report could not be found
	 */
	@Override
	public VRReport findByReportCode(String reportCode)
		throws NoSuchVRReportException {
		VRReport vrReport = fetchByReportCode(reportCode);

		if (vrReport == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("reportCode=");
			msg.append(reportCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRReportException(msg.toString());
		}

		return vrReport;
	}

	/**
	 * Returns the vr report where reportCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param reportCode the report code
	 * @return the matching vr report, or <code>null</code> if a matching vr report could not be found
	 */
	@Override
	public VRReport fetchByReportCode(String reportCode) {
		return fetchByReportCode(reportCode, true);
	}

	/**
	 * Returns the vr report where reportCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param reportCode the report code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr report, or <code>null</code> if a matching vr report could not be found
	 */
	@Override
	public VRReport fetchByReportCode(String reportCode,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { reportCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_REPORTCODE,
					finderArgs, this);
		}

		if (result instanceof VRReport) {
			VRReport vrReport = (VRReport)result;

			if (!Objects.equals(reportCode, vrReport.getReportCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRREPORT_WHERE);

			boolean bindReportCode = false;

			if (reportCode == null) {
				query.append(_FINDER_COLUMN_REPORTCODE_REPORTCODE_1);
			}
			else if (reportCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPORTCODE_REPORTCODE_3);
			}
			else {
				bindReportCode = true;

				query.append(_FINDER_COLUMN_REPORTCODE_REPORTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReportCode) {
					qPos.add(reportCode);
				}

				List<VRReport> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_REPORTCODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRReportPersistenceImpl.fetchByReportCode(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRReport vrReport = list.get(0);

					result = vrReport;

					cacheResult(vrReport);

					if ((vrReport.getReportCode() == null) ||
							!vrReport.getReportCode().equals(reportCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_REPORTCODE,
							finderArgs, vrReport);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_REPORTCODE,
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
			return (VRReport)result;
		}
	}

	/**
	 * Removes the vr report where reportCode = &#63; from the database.
	 *
	 * @param reportCode the report code
	 * @return the vr report that was removed
	 */
	@Override
	public VRReport removeByReportCode(String reportCode)
		throws NoSuchVRReportException {
		VRReport vrReport = findByReportCode(reportCode);

		return remove(vrReport);
	}

	/**
	 * Returns the number of vr reports where reportCode = &#63;.
	 *
	 * @param reportCode the report code
	 * @return the number of matching vr reports
	 */
	@Override
	public int countByReportCode(String reportCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REPORTCODE;

		Object[] finderArgs = new Object[] { reportCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRREPORT_WHERE);

			boolean bindReportCode = false;

			if (reportCode == null) {
				query.append(_FINDER_COLUMN_REPORTCODE_REPORTCODE_1);
			}
			else if (reportCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPORTCODE_REPORTCODE_3);
			}
			else {
				bindReportCode = true;

				query.append(_FINDER_COLUMN_REPORTCODE_REPORTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReportCode) {
					qPos.add(reportCode);
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

	private static final String _FINDER_COLUMN_REPORTCODE_REPORTCODE_1 = "vrReport.reportCode IS NULL";
	private static final String _FINDER_COLUMN_REPORTCODE_REPORTCODE_2 = "vrReport.reportCode = ?";
	private static final String _FINDER_COLUMN_REPORTCODE_REPORTCODE_3 = "(vrReport.reportCode IS NULL OR vrReport.reportCode = '')";

	public VRReportPersistenceImpl() {
		setModelClass(VRReport.class);
	}

	/**
	 * Caches the vr report in the entity cache if it is enabled.
	 *
	 * @param vrReport the vr report
	 */
	@Override
	public void cacheResult(VRReport vrReport) {
		entityCache.putResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
			VRReportImpl.class, vrReport.getPrimaryKey(), vrReport);

		finderCache.putResult(FINDER_PATH_FETCH_BY_REPORTCODE,
			new Object[] { vrReport.getReportCode() }, vrReport);

		vrReport.resetOriginalValues();
	}

	/**
	 * Caches the vr reports in the entity cache if it is enabled.
	 *
	 * @param vrReports the vr reports
	 */
	@Override
	public void cacheResult(List<VRReport> vrReports) {
		for (VRReport vrReport : vrReports) {
			if (entityCache.getResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
						VRReportImpl.class, vrReport.getPrimaryKey()) == null) {
				cacheResult(vrReport);
			}
			else {
				vrReport.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr reports.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRReportImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr report.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRReport vrReport) {
		entityCache.removeResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
			VRReportImpl.class, vrReport.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRReportModelImpl)vrReport, true);
	}

	@Override
	public void clearCache(List<VRReport> vrReports) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRReport vrReport : vrReports) {
			entityCache.removeResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
				VRReportImpl.class, vrReport.getPrimaryKey());

			clearUniqueFindersCache((VRReportModelImpl)vrReport, true);
		}
	}

	protected void cacheUniqueFindersCache(VRReportModelImpl vrReportModelImpl) {
		Object[] args = new Object[] { vrReportModelImpl.getReportCode() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_REPORTCODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_REPORTCODE, args,
			vrReportModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRReportModelImpl vrReportModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { vrReportModelImpl.getReportCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REPORTCODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REPORTCODE, args);
		}

		if ((vrReportModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REPORTCODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrReportModelImpl.getOriginalReportCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REPORTCODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REPORTCODE, args);
		}
	}

	/**
	 * Creates a new vr report with the primary key. Does not add the vr report to the database.
	 *
	 * @param id the primary key for the new vr report
	 * @return the new vr report
	 */
	@Override
	public VRReport create(long id) {
		VRReport vrReport = new VRReportImpl();

		vrReport.setNew(true);
		vrReport.setPrimaryKey(id);

		return vrReport;
	}

	/**
	 * Removes the vr report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr report
	 * @return the vr report that was removed
	 * @throws NoSuchVRReportException if a vr report with the primary key could not be found
	 */
	@Override
	public VRReport remove(long id) throws NoSuchVRReportException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr report
	 * @return the vr report that was removed
	 * @throws NoSuchVRReportException if a vr report with the primary key could not be found
	 */
	@Override
	public VRReport remove(Serializable primaryKey)
		throws NoSuchVRReportException {
		Session session = null;

		try {
			session = openSession();

			VRReport vrReport = (VRReport)session.get(VRReportImpl.class,
					primaryKey);

			if (vrReport == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrReport);
		}
		catch (NoSuchVRReportException nsee) {
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
	protected VRReport removeImpl(VRReport vrReport) {
		vrReport = toUnwrappedModel(vrReport);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrReport)) {
				vrReport = (VRReport)session.get(VRReportImpl.class,
						vrReport.getPrimaryKeyObj());
			}

			if (vrReport != null) {
				session.delete(vrReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrReport != null) {
			clearCache(vrReport);
		}

		return vrReport;
	}

	@Override
	public VRReport updateImpl(VRReport vrReport) {
		vrReport = toUnwrappedModel(vrReport);

		boolean isNew = vrReport.isNew();

		VRReportModelImpl vrReportModelImpl = (VRReportModelImpl)vrReport;

		Session session = null;

		try {
			session = openSession();

			if (vrReport.isNew()) {
				session.save(vrReport);

				vrReport.setNew(false);
			}
			else {
				vrReport = (VRReport)session.merge(vrReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRReportModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
			VRReportImpl.class, vrReport.getPrimaryKey(), vrReport, false);

		clearUniqueFindersCache(vrReportModelImpl, false);
		cacheUniqueFindersCache(vrReportModelImpl);

		vrReport.resetOriginalValues();

		return vrReport;
	}

	protected VRReport toUnwrappedModel(VRReport vrReport) {
		if (vrReport instanceof VRReportImpl) {
			return vrReport;
		}

		VRReportImpl vrReportImpl = new VRReportImpl();

		vrReportImpl.setNew(vrReport.isNew());
		vrReportImpl.setPrimaryKey(vrReport.getPrimaryKey());

		vrReportImpl.setId(vrReport.getId());
		vrReportImpl.setReportCode(vrReport.getReportCode());
		vrReportImpl.setReportName(vrReport.getReportName());
		vrReportImpl.setFormReport(vrReport.getFormReport());

		return vrReportImpl;
	}

	/**
	 * Returns the vr report with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr report
	 * @return the vr report
	 * @throws NoSuchVRReportException if a vr report with the primary key could not be found
	 */
	@Override
	public VRReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRReportException {
		VRReport vrReport = fetchByPrimaryKey(primaryKey);

		if (vrReport == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrReport;
	}

	/**
	 * Returns the vr report with the primary key or throws a {@link NoSuchVRReportException} if it could not be found.
	 *
	 * @param id the primary key of the vr report
	 * @return the vr report
	 * @throws NoSuchVRReportException if a vr report with the primary key could not be found
	 */
	@Override
	public VRReport findByPrimaryKey(long id) throws NoSuchVRReportException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr report
	 * @return the vr report, or <code>null</code> if a vr report with the primary key could not be found
	 */
	@Override
	public VRReport fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
				VRReportImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRReport vrReport = (VRReport)serializable;

		if (vrReport == null) {
			Session session = null;

			try {
				session = openSession();

				vrReport = (VRReport)session.get(VRReportImpl.class, primaryKey);

				if (vrReport != null) {
					cacheResult(vrReport);
				}
				else {
					entityCache.putResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
						VRReportImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
					VRReportImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrReport;
	}

	/**
	 * Returns the vr report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr report
	 * @return the vr report, or <code>null</code> if a vr report with the primary key could not be found
	 */
	@Override
	public VRReport fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRReport> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRReport> map = new HashMap<Serializable, VRReport>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRReport vrReport = fetchByPrimaryKey(primaryKey);

			if (vrReport != null) {
				map.put(primaryKey, vrReport);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
					VRReportImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRReport)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRREPORT_WHERE_PKS_IN);

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

			for (VRReport vrReport : (List<VRReport>)q.list()) {
				map.put(vrReport.getPrimaryKeyObj(), vrReport);

				cacheResult(vrReport);

				uncachedPrimaryKeys.remove(vrReport.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRReportModelImpl.ENTITY_CACHE_ENABLED,
					VRReportImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr reports.
	 *
	 * @return the vr reports
	 */
	@Override
	public List<VRReport> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr reports
	 * @param end the upper bound of the range of vr reports (not inclusive)
	 * @return the range of vr reports
	 */
	@Override
	public List<VRReport> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr reports
	 * @param end the upper bound of the range of vr reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr reports
	 */
	@Override
	public List<VRReport> findAll(int start, int end,
		OrderByComparator<VRReport> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr reports
	 * @param end the upper bound of the range of vr reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr reports
	 */
	@Override
	public List<VRReport> findAll(int start, int end,
		OrderByComparator<VRReport> orderByComparator, boolean retrieveFromCache) {
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

		List<VRReport> list = null;

		if (retrieveFromCache) {
			list = (List<VRReport>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRREPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRREPORT;

				if (pagination) {
					sql = sql.concat(VRReportModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRReport>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRReport>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr reports from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRReport vrReport : findAll()) {
			remove(vrReport);
		}
	}

	/**
	 * Returns the number of vr reports.
	 *
	 * @return the number of vr reports
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRREPORT);

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
		return VRReportModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr report persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRReportImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRREPORT = "SELECT vrReport FROM VRReport vrReport";
	private static final String _SQL_SELECT_VRREPORT_WHERE_PKS_IN = "SELECT vrReport FROM VRReport vrReport WHERE id IN (";
	private static final String _SQL_SELECT_VRREPORT_WHERE = "SELECT vrReport FROM VRReport vrReport WHERE ";
	private static final String _SQL_COUNT_VRREPORT = "SELECT COUNT(vrReport) FROM VRReport vrReport";
	private static final String _SQL_COUNT_VRREPORT_WHERE = "SELECT COUNT(vrReport) FROM VRReport vrReport WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrReport.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRReport exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRReport exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRReportPersistenceImpl.class);
}