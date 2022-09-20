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

import com.fds.vr.business.exception.NoSuchVRActionconfigException;
import com.fds.vr.business.model.VRActionconfig;
import com.fds.vr.business.model.impl.VRActionconfigImpl;
import com.fds.vr.business.model.impl.VRActionconfigModelImpl;
import com.fds.vr.business.service.persistence.VRActionconfigPersistence;

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
 * The persistence implementation for the vr actionconfig service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRActionconfigPersistence
 * @see com.fds.vr.business.service.persistence.VRActionconfigUtil
 * @generated
 */
@ProviderType
public class VRActionconfigPersistenceImpl extends BasePersistenceImpl<VRActionconfig>
	implements VRActionconfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRActionconfigUtil} to access the vr actionconfig persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRActionconfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
			VRActionconfigModelImpl.FINDER_CACHE_ENABLED,
			VRActionconfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
			VRActionconfigModelImpl.FINDER_CACHE_ENABLED,
			VRActionconfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
			VRActionconfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_A_P = new FinderPath(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
			VRActionconfigModelImpl.FINDER_CACHE_ENABLED,
			VRActionconfigImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByA_P",
			new String[] { String.class.getName(), String.class.getName() },
			VRActionconfigModelImpl.ACTIONCODE_COLUMN_BITMASK |
			VRActionconfigModelImpl.PROCESSNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_P = new FinderPath(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
			VRActionconfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_P",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or throws a {@link NoSuchVRActionconfigException} if it could not be found.
	 *
	 * @param actionCode the action code
	 * @param processNo the process no
	 * @return the matching vr actionconfig
	 * @throws NoSuchVRActionconfigException if a matching vr actionconfig could not be found
	 */
	@Override
	public VRActionconfig findByA_P(String actionCode, String processNo)
		throws NoSuchVRActionconfigException {
		VRActionconfig vrActionconfig = fetchByA_P(actionCode, processNo);

		if (vrActionconfig == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("actionCode=");
			msg.append(actionCode);

			msg.append(", processNo=");
			msg.append(processNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRActionconfigException(msg.toString());
		}

		return vrActionconfig;
	}

	/**
	 * Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param actionCode the action code
	 * @param processNo the process no
	 * @return the matching vr actionconfig, or <code>null</code> if a matching vr actionconfig could not be found
	 */
	@Override
	public VRActionconfig fetchByA_P(String actionCode, String processNo) {
		return fetchByA_P(actionCode, processNo, true);
	}

	/**
	 * Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param actionCode the action code
	 * @param processNo the process no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr actionconfig, or <code>null</code> if a matching vr actionconfig could not be found
	 */
	@Override
	public VRActionconfig fetchByA_P(String actionCode, String processNo,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { actionCode, processNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_A_P,
					finderArgs, this);
		}

		if (result instanceof VRActionconfig) {
			VRActionconfig vrActionconfig = (VRActionconfig)result;

			if (!Objects.equals(actionCode, vrActionconfig.getActionCode()) ||
					!Objects.equals(processNo, vrActionconfig.getProcessNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRACTIONCONFIG_WHERE);

			boolean bindActionCode = false;

			if (actionCode == null) {
				query.append(_FINDER_COLUMN_A_P_ACTIONCODE_1);
			}
			else if (actionCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_ACTIONCODE_3);
			}
			else {
				bindActionCode = true;

				query.append(_FINDER_COLUMN_A_P_ACTIONCODE_2);
			}

			boolean bindProcessNo = false;

			if (processNo == null) {
				query.append(_FINDER_COLUMN_A_P_PROCESSNO_1);
			}
			else if (processNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_PROCESSNO_3);
			}
			else {
				bindProcessNo = true;

				query.append(_FINDER_COLUMN_A_P_PROCESSNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindActionCode) {
					qPos.add(actionCode);
				}

				if (bindProcessNo) {
					qPos.add(processNo);
				}

				List<VRActionconfig> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_A_P, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRActionconfigPersistenceImpl.fetchByA_P(String, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRActionconfig vrActionconfig = list.get(0);

					result = vrActionconfig;

					cacheResult(vrActionconfig);

					if ((vrActionconfig.getActionCode() == null) ||
							!vrActionconfig.getActionCode().equals(actionCode) ||
							(vrActionconfig.getProcessNo() == null) ||
							!vrActionconfig.getProcessNo().equals(processNo)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_A_P,
							finderArgs, vrActionconfig);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_A_P, finderArgs);

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
			return (VRActionconfig)result;
		}
	}

	/**
	 * Removes the vr actionconfig where actionCode = &#63; and processNo = &#63; from the database.
	 *
	 * @param actionCode the action code
	 * @param processNo the process no
	 * @return the vr actionconfig that was removed
	 */
	@Override
	public VRActionconfig removeByA_P(String actionCode, String processNo)
		throws NoSuchVRActionconfigException {
		VRActionconfig vrActionconfig = findByA_P(actionCode, processNo);

		return remove(vrActionconfig);
	}

	/**
	 * Returns the number of vr actionconfigs where actionCode = &#63; and processNo = &#63;.
	 *
	 * @param actionCode the action code
	 * @param processNo the process no
	 * @return the number of matching vr actionconfigs
	 */
	@Override
	public int countByA_P(String actionCode, String processNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_P;

		Object[] finderArgs = new Object[] { actionCode, processNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRACTIONCONFIG_WHERE);

			boolean bindActionCode = false;

			if (actionCode == null) {
				query.append(_FINDER_COLUMN_A_P_ACTIONCODE_1);
			}
			else if (actionCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_ACTIONCODE_3);
			}
			else {
				bindActionCode = true;

				query.append(_FINDER_COLUMN_A_P_ACTIONCODE_2);
			}

			boolean bindProcessNo = false;

			if (processNo == null) {
				query.append(_FINDER_COLUMN_A_P_PROCESSNO_1);
			}
			else if (processNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_PROCESSNO_3);
			}
			else {
				bindProcessNo = true;

				query.append(_FINDER_COLUMN_A_P_PROCESSNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindActionCode) {
					qPos.add(actionCode);
				}

				if (bindProcessNo) {
					qPos.add(processNo);
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

	private static final String _FINDER_COLUMN_A_P_ACTIONCODE_1 = "vrActionconfig.actionCode IS NULL AND ";
	private static final String _FINDER_COLUMN_A_P_ACTIONCODE_2 = "vrActionconfig.actionCode = ? AND ";
	private static final String _FINDER_COLUMN_A_P_ACTIONCODE_3 = "(vrActionconfig.actionCode IS NULL OR vrActionconfig.actionCode = '') AND ";
	private static final String _FINDER_COLUMN_A_P_PROCESSNO_1 = "vrActionconfig.processNo IS NULL";
	private static final String _FINDER_COLUMN_A_P_PROCESSNO_2 = "vrActionconfig.processNo = ?";
	private static final String _FINDER_COLUMN_A_P_PROCESSNO_3 = "(vrActionconfig.processNo IS NULL OR vrActionconfig.processNo = '')";

	public VRActionconfigPersistenceImpl() {
		setModelClass(VRActionconfig.class);
	}

	/**
	 * Caches the vr actionconfig in the entity cache if it is enabled.
	 *
	 * @param vrActionconfig the vr actionconfig
	 */
	@Override
	public void cacheResult(VRActionconfig vrActionconfig) {
		entityCache.putResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
			VRActionconfigImpl.class, vrActionconfig.getPrimaryKey(),
			vrActionconfig);

		finderCache.putResult(FINDER_PATH_FETCH_BY_A_P,
			new Object[] {
				vrActionconfig.getActionCode(), vrActionconfig.getProcessNo()
			}, vrActionconfig);

		vrActionconfig.resetOriginalValues();
	}

	/**
	 * Caches the vr actionconfigs in the entity cache if it is enabled.
	 *
	 * @param vrActionconfigs the vr actionconfigs
	 */
	@Override
	public void cacheResult(List<VRActionconfig> vrActionconfigs) {
		for (VRActionconfig vrActionconfig : vrActionconfigs) {
			if (entityCache.getResult(
						VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
						VRActionconfigImpl.class, vrActionconfig.getPrimaryKey()) == null) {
				cacheResult(vrActionconfig);
			}
			else {
				vrActionconfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr actionconfigs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRActionconfigImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr actionconfig.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRActionconfig vrActionconfig) {
		entityCache.removeResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
			VRActionconfigImpl.class, vrActionconfig.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRActionconfigModelImpl)vrActionconfig, true);
	}

	@Override
	public void clearCache(List<VRActionconfig> vrActionconfigs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRActionconfig vrActionconfig : vrActionconfigs) {
			entityCache.removeResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
				VRActionconfigImpl.class, vrActionconfig.getPrimaryKey());

			clearUniqueFindersCache((VRActionconfigModelImpl)vrActionconfig,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRActionconfigModelImpl vrActionconfigModelImpl) {
		Object[] args = new Object[] {
				vrActionconfigModelImpl.getActionCode(),
				vrActionconfigModelImpl.getProcessNo()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_A_P, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_A_P, args,
			vrActionconfigModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRActionconfigModelImpl vrActionconfigModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrActionconfigModelImpl.getActionCode(),
					vrActionconfigModelImpl.getProcessNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_A_P, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_A_P, args);
		}

		if ((vrActionconfigModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_A_P.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrActionconfigModelImpl.getOriginalActionCode(),
					vrActionconfigModelImpl.getOriginalProcessNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_A_P, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_A_P, args);
		}
	}

	/**
	 * Creates a new vr actionconfig with the primary key. Does not add the vr actionconfig to the database.
	 *
	 * @param id the primary key for the new vr actionconfig
	 * @return the new vr actionconfig
	 */
	@Override
	public VRActionconfig create(long id) {
		VRActionconfig vrActionconfig = new VRActionconfigImpl();

		vrActionconfig.setNew(true);
		vrActionconfig.setPrimaryKey(id);

		return vrActionconfig;
	}

	/**
	 * Removes the vr actionconfig with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr actionconfig
	 * @return the vr actionconfig that was removed
	 * @throws NoSuchVRActionconfigException if a vr actionconfig with the primary key could not be found
	 */
	@Override
	public VRActionconfig remove(long id) throws NoSuchVRActionconfigException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr actionconfig with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr actionconfig
	 * @return the vr actionconfig that was removed
	 * @throws NoSuchVRActionconfigException if a vr actionconfig with the primary key could not be found
	 */
	@Override
	public VRActionconfig remove(Serializable primaryKey)
		throws NoSuchVRActionconfigException {
		Session session = null;

		try {
			session = openSession();

			VRActionconfig vrActionconfig = (VRActionconfig)session.get(VRActionconfigImpl.class,
					primaryKey);

			if (vrActionconfig == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRActionconfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrActionconfig);
		}
		catch (NoSuchVRActionconfigException nsee) {
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
	protected VRActionconfig removeImpl(VRActionconfig vrActionconfig) {
		vrActionconfig = toUnwrappedModel(vrActionconfig);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrActionconfig)) {
				vrActionconfig = (VRActionconfig)session.get(VRActionconfigImpl.class,
						vrActionconfig.getPrimaryKeyObj());
			}

			if (vrActionconfig != null) {
				session.delete(vrActionconfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrActionconfig != null) {
			clearCache(vrActionconfig);
		}

		return vrActionconfig;
	}

	@Override
	public VRActionconfig updateImpl(VRActionconfig vrActionconfig) {
		vrActionconfig = toUnwrappedModel(vrActionconfig);

		boolean isNew = vrActionconfig.isNew();

		VRActionconfigModelImpl vrActionconfigModelImpl = (VRActionconfigModelImpl)vrActionconfig;

		Session session = null;

		try {
			session = openSession();

			if (vrActionconfig.isNew()) {
				session.save(vrActionconfig);

				vrActionconfig.setNew(false);
			}
			else {
				vrActionconfig = (VRActionconfig)session.merge(vrActionconfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRActionconfigModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
			VRActionconfigImpl.class, vrActionconfig.getPrimaryKey(),
			vrActionconfig, false);

		clearUniqueFindersCache(vrActionconfigModelImpl, false);
		cacheUniqueFindersCache(vrActionconfigModelImpl);

		vrActionconfig.resetOriginalValues();

		return vrActionconfig;
	}

	protected VRActionconfig toUnwrappedModel(VRActionconfig vrActionconfig) {
		if (vrActionconfig instanceof VRActionconfigImpl) {
			return vrActionconfig;
		}

		VRActionconfigImpl vrActionconfigImpl = new VRActionconfigImpl();

		vrActionconfigImpl.setNew(vrActionconfig.isNew());
		vrActionconfigImpl.setPrimaryKey(vrActionconfig.getPrimaryKey());

		vrActionconfigImpl.setId(vrActionconfig.getId());
		vrActionconfigImpl.setActionCode(vrActionconfig.getActionCode());
		vrActionconfigImpl.setProcessNo(vrActionconfig.getProcessNo());
		vrActionconfigImpl.setStatus(vrActionconfig.getStatus());
		vrActionconfigImpl.setVehicleClass(vrActionconfig.getVehicleClass());
		vrActionconfigImpl.setFileTemplateNoBB(vrActionconfig.getFileTemplateNoBB());
		vrActionconfigImpl.setFileTemplateNoCC(vrActionconfig.getFileTemplateNoCC());
		vrActionconfigImpl.setDeliverableCode(vrActionconfig.getDeliverableCode());

		return vrActionconfigImpl;
	}

	/**
	 * Returns the vr actionconfig with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr actionconfig
	 * @return the vr actionconfig
	 * @throws NoSuchVRActionconfigException if a vr actionconfig with the primary key could not be found
	 */
	@Override
	public VRActionconfig findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRActionconfigException {
		VRActionconfig vrActionconfig = fetchByPrimaryKey(primaryKey);

		if (vrActionconfig == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRActionconfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrActionconfig;
	}

	/**
	 * Returns the vr actionconfig with the primary key or throws a {@link NoSuchVRActionconfigException} if it could not be found.
	 *
	 * @param id the primary key of the vr actionconfig
	 * @return the vr actionconfig
	 * @throws NoSuchVRActionconfigException if a vr actionconfig with the primary key could not be found
	 */
	@Override
	public VRActionconfig findByPrimaryKey(long id)
		throws NoSuchVRActionconfigException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr actionconfig with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr actionconfig
	 * @return the vr actionconfig, or <code>null</code> if a vr actionconfig with the primary key could not be found
	 */
	@Override
	public VRActionconfig fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
				VRActionconfigImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRActionconfig vrActionconfig = (VRActionconfig)serializable;

		if (vrActionconfig == null) {
			Session session = null;

			try {
				session = openSession();

				vrActionconfig = (VRActionconfig)session.get(VRActionconfigImpl.class,
						primaryKey);

				if (vrActionconfig != null) {
					cacheResult(vrActionconfig);
				}
				else {
					entityCache.putResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
						VRActionconfigImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
					VRActionconfigImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrActionconfig;
	}

	/**
	 * Returns the vr actionconfig with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr actionconfig
	 * @return the vr actionconfig, or <code>null</code> if a vr actionconfig with the primary key could not be found
	 */
	@Override
	public VRActionconfig fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRActionconfig> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRActionconfig> map = new HashMap<Serializable, VRActionconfig>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRActionconfig vrActionconfig = fetchByPrimaryKey(primaryKey);

			if (vrActionconfig != null) {
				map.put(primaryKey, vrActionconfig);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
					VRActionconfigImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRActionconfig)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRACTIONCONFIG_WHERE_PKS_IN);

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

			for (VRActionconfig vrActionconfig : (List<VRActionconfig>)q.list()) {
				map.put(vrActionconfig.getPrimaryKeyObj(), vrActionconfig);

				cacheResult(vrActionconfig);

				uncachedPrimaryKeys.remove(vrActionconfig.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRActionconfigModelImpl.ENTITY_CACHE_ENABLED,
					VRActionconfigImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr actionconfigs.
	 *
	 * @return the vr actionconfigs
	 */
	@Override
	public List<VRActionconfig> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr actionconfigs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr actionconfigs
	 * @param end the upper bound of the range of vr actionconfigs (not inclusive)
	 * @return the range of vr actionconfigs
	 */
	@Override
	public List<VRActionconfig> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr actionconfigs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr actionconfigs
	 * @param end the upper bound of the range of vr actionconfigs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr actionconfigs
	 */
	@Override
	public List<VRActionconfig> findAll(int start, int end,
		OrderByComparator<VRActionconfig> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr actionconfigs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr actionconfigs
	 * @param end the upper bound of the range of vr actionconfigs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr actionconfigs
	 */
	@Override
	public List<VRActionconfig> findAll(int start, int end,
		OrderByComparator<VRActionconfig> orderByComparator,
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

		List<VRActionconfig> list = null;

		if (retrieveFromCache) {
			list = (List<VRActionconfig>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRACTIONCONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRACTIONCONFIG;

				if (pagination) {
					sql = sql.concat(VRActionconfigModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRActionconfig>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRActionconfig>)QueryUtil.list(q,
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
	 * Removes all the vr actionconfigs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRActionconfig vrActionconfig : findAll()) {
			remove(vrActionconfig);
		}
	}

	/**
	 * Returns the number of vr actionconfigs.
	 *
	 * @return the number of vr actionconfigs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRACTIONCONFIG);

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
		return VRActionconfigModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr actionconfig persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRActionconfigImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRACTIONCONFIG = "SELECT vrActionconfig FROM VRActionconfig vrActionconfig";
	private static final String _SQL_SELECT_VRACTIONCONFIG_WHERE_PKS_IN = "SELECT vrActionconfig FROM VRActionconfig vrActionconfig WHERE id IN (";
	private static final String _SQL_SELECT_VRACTIONCONFIG_WHERE = "SELECT vrActionconfig FROM VRActionconfig vrActionconfig WHERE ";
	private static final String _SQL_COUNT_VRACTIONCONFIG = "SELECT COUNT(vrActionconfig) FROM VRActionconfig vrActionconfig";
	private static final String _SQL_COUNT_VRACTIONCONFIG_WHERE = "SELECT COUNT(vrActionconfig) FROM VRActionconfig vrActionconfig WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrActionconfig.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRActionconfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRActionconfig exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRActionconfigPersistenceImpl.class);
}