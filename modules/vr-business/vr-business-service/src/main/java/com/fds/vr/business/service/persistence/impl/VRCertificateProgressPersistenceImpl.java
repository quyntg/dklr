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

import com.fds.vr.business.exception.NoSuchVRCertificateProgressException;
import com.fds.vr.business.model.VRCertificateProgress;
import com.fds.vr.business.model.impl.VRCertificateProgressImpl;
import com.fds.vr.business.model.impl.VRCertificateProgressModelImpl;
import com.fds.vr.business.service.persistence.VRCertificateProgressPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the vr certificate progress service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCertificateProgressPersistence
 * @see com.fds.vr.business.service.persistence.VRCertificateProgressUtil
 * @generated
 */
@ProviderType
public class VRCertificateProgressPersistenceImpl extends BasePersistenceImpl<VRCertificateProgress>
	implements VRCertificateProgressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCertificateProgressUtil} to access the vr certificate progress persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCertificateProgressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressModelImpl.FINDER_CACHE_ENABLED,
			VRCertificateProgressImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressModelImpl.FINDER_CACHE_ENABLED,
			VRCertificateProgressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VRCertificateProgressPersistenceImpl() {
		setModelClass(VRCertificateProgress.class);
	}

	/**
	 * Caches the vr certificate progress in the entity cache if it is enabled.
	 *
	 * @param vrCertificateProgress the vr certificate progress
	 */
	@Override
	public void cacheResult(VRCertificateProgress vrCertificateProgress) {
		entityCache.putResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressImpl.class,
			vrCertificateProgress.getPrimaryKey(), vrCertificateProgress);

		vrCertificateProgress.resetOriginalValues();
	}

	/**
	 * Caches the vr certificate progresses in the entity cache if it is enabled.
	 *
	 * @param vrCertificateProgresses the vr certificate progresses
	 */
	@Override
	public void cacheResult(List<VRCertificateProgress> vrCertificateProgresses) {
		for (VRCertificateProgress vrCertificateProgress : vrCertificateProgresses) {
			if (entityCache.getResult(
						VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
						VRCertificateProgressImpl.class,
						vrCertificateProgress.getPrimaryKey()) == null) {
				cacheResult(vrCertificateProgress);
			}
			else {
				vrCertificateProgress.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr certificate progresses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCertificateProgressImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr certificate progress.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCertificateProgress vrCertificateProgress) {
		entityCache.removeResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressImpl.class,
			vrCertificateProgress.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRCertificateProgress> vrCertificateProgresses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCertificateProgress vrCertificateProgress : vrCertificateProgresses) {
			entityCache.removeResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
				VRCertificateProgressImpl.class,
				vrCertificateProgress.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr certificate progress with the primary key. Does not add the vr certificate progress to the database.
	 *
	 * @param id the primary key for the new vr certificate progress
	 * @return the new vr certificate progress
	 */
	@Override
	public VRCertificateProgress create(long id) {
		VRCertificateProgress vrCertificateProgress = new VRCertificateProgressImpl();

		vrCertificateProgress.setNew(true);
		vrCertificateProgress.setPrimaryKey(id);

		return vrCertificateProgress;
	}

	/**
	 * Removes the vr certificate progress with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr certificate progress
	 * @return the vr certificate progress that was removed
	 * @throws NoSuchVRCertificateProgressException if a vr certificate progress with the primary key could not be found
	 */
	@Override
	public VRCertificateProgress remove(long id)
		throws NoSuchVRCertificateProgressException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr certificate progress with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr certificate progress
	 * @return the vr certificate progress that was removed
	 * @throws NoSuchVRCertificateProgressException if a vr certificate progress with the primary key could not be found
	 */
	@Override
	public VRCertificateProgress remove(Serializable primaryKey)
		throws NoSuchVRCertificateProgressException {
		Session session = null;

		try {
			session = openSession();

			VRCertificateProgress vrCertificateProgress = (VRCertificateProgress)session.get(VRCertificateProgressImpl.class,
					primaryKey);

			if (vrCertificateProgress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCertificateProgressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrCertificateProgress);
		}
		catch (NoSuchVRCertificateProgressException nsee) {
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
	protected VRCertificateProgress removeImpl(
		VRCertificateProgress vrCertificateProgress) {
		vrCertificateProgress = toUnwrappedModel(vrCertificateProgress);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrCertificateProgress)) {
				vrCertificateProgress = (VRCertificateProgress)session.get(VRCertificateProgressImpl.class,
						vrCertificateProgress.getPrimaryKeyObj());
			}

			if (vrCertificateProgress != null) {
				session.delete(vrCertificateProgress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrCertificateProgress != null) {
			clearCache(vrCertificateProgress);
		}

		return vrCertificateProgress;
	}

	@Override
	public VRCertificateProgress updateImpl(
		VRCertificateProgress vrCertificateProgress) {
		vrCertificateProgress = toUnwrappedModel(vrCertificateProgress);

		boolean isNew = vrCertificateProgress.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vrCertificateProgress.isNew()) {
				session.save(vrCertificateProgress);

				vrCertificateProgress.setNew(false);
			}
			else {
				vrCertificateProgress = (VRCertificateProgress)session.merge(vrCertificateProgress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressImpl.class,
			vrCertificateProgress.getPrimaryKey(), vrCertificateProgress, false);

		vrCertificateProgress.resetOriginalValues();

		return vrCertificateProgress;
	}

	protected VRCertificateProgress toUnwrappedModel(
		VRCertificateProgress vrCertificateProgress) {
		if (vrCertificateProgress instanceof VRCertificateProgressImpl) {
			return vrCertificateProgress;
		}

		VRCertificateProgressImpl vrCertificateProgressImpl = new VRCertificateProgressImpl();

		vrCertificateProgressImpl.setNew(vrCertificateProgress.isNew());
		vrCertificateProgressImpl.setPrimaryKey(vrCertificateProgress.getPrimaryKey());

		vrCertificateProgressImpl.setId(vrCertificateProgress.getId());
		vrCertificateProgressImpl.setVehicleCertificateId(vrCertificateProgress.getVehicleCertificateId());
		vrCertificateProgressImpl.setCorporationId(vrCertificateProgress.getCorporationId());
		vrCertificateProgressImpl.setInspectorId(vrCertificateProgress.getInspectorId());
		vrCertificateProgressImpl.setActionCode(vrCertificateProgress.getActionCode());
		vrCertificateProgressImpl.setProgressTime(vrCertificateProgress.getProgressTime());
		vrCertificateProgressImpl.setRemarks(vrCertificateProgress.getRemarks());

		return vrCertificateProgressImpl;
	}

	/**
	 * Returns the vr certificate progress with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr certificate progress
	 * @return the vr certificate progress
	 * @throws NoSuchVRCertificateProgressException if a vr certificate progress with the primary key could not be found
	 */
	@Override
	public VRCertificateProgress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCertificateProgressException {
		VRCertificateProgress vrCertificateProgress = fetchByPrimaryKey(primaryKey);

		if (vrCertificateProgress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCertificateProgressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrCertificateProgress;
	}

	/**
	 * Returns the vr certificate progress with the primary key or throws a {@link NoSuchVRCertificateProgressException} if it could not be found.
	 *
	 * @param id the primary key of the vr certificate progress
	 * @return the vr certificate progress
	 * @throws NoSuchVRCertificateProgressException if a vr certificate progress with the primary key could not be found
	 */
	@Override
	public VRCertificateProgress findByPrimaryKey(long id)
		throws NoSuchVRCertificateProgressException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr certificate progress with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr certificate progress
	 * @return the vr certificate progress, or <code>null</code> if a vr certificate progress with the primary key could not be found
	 */
	@Override
	public VRCertificateProgress fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
				VRCertificateProgressImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCertificateProgress vrCertificateProgress = (VRCertificateProgress)serializable;

		if (vrCertificateProgress == null) {
			Session session = null;

			try {
				session = openSession();

				vrCertificateProgress = (VRCertificateProgress)session.get(VRCertificateProgressImpl.class,
						primaryKey);

				if (vrCertificateProgress != null) {
					cacheResult(vrCertificateProgress);
				}
				else {
					entityCache.putResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
						VRCertificateProgressImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
					VRCertificateProgressImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrCertificateProgress;
	}

	/**
	 * Returns the vr certificate progress with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr certificate progress
	 * @return the vr certificate progress, or <code>null</code> if a vr certificate progress with the primary key could not be found
	 */
	@Override
	public VRCertificateProgress fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCertificateProgress> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCertificateProgress> map = new HashMap<Serializable, VRCertificateProgress>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCertificateProgress vrCertificateProgress = fetchByPrimaryKey(primaryKey);

			if (vrCertificateProgress != null) {
				map.put(primaryKey, vrCertificateProgress);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
					VRCertificateProgressImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCertificateProgress)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCERTIFICATEPROGRESS_WHERE_PKS_IN);

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

			for (VRCertificateProgress vrCertificateProgress : (List<VRCertificateProgress>)q.list()) {
				map.put(vrCertificateProgress.getPrimaryKeyObj(),
					vrCertificateProgress);

				cacheResult(vrCertificateProgress);

				uncachedPrimaryKeys.remove(vrCertificateProgress.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCertificateProgressModelImpl.ENTITY_CACHE_ENABLED,
					VRCertificateProgressImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr certificate progresses.
	 *
	 * @return the vr certificate progresses
	 */
	@Override
	public List<VRCertificateProgress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr certificate progresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr certificate progresses
	 * @param end the upper bound of the range of vr certificate progresses (not inclusive)
	 * @return the range of vr certificate progresses
	 */
	@Override
	public List<VRCertificateProgress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr certificate progresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr certificate progresses
	 * @param end the upper bound of the range of vr certificate progresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr certificate progresses
	 */
	@Override
	public List<VRCertificateProgress> findAll(int start, int end,
		OrderByComparator<VRCertificateProgress> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr certificate progresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr certificate progresses
	 * @param end the upper bound of the range of vr certificate progresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr certificate progresses
	 */
	@Override
	public List<VRCertificateProgress> findAll(int start, int end,
		OrderByComparator<VRCertificateProgress> orderByComparator,
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

		List<VRCertificateProgress> list = null;

		if (retrieveFromCache) {
			list = (List<VRCertificateProgress>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCERTIFICATEPROGRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCERTIFICATEPROGRESS;

				if (pagination) {
					sql = sql.concat(VRCertificateProgressModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCertificateProgress>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCertificateProgress>)QueryUtil.list(q,
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
	 * Removes all the vr certificate progresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCertificateProgress vrCertificateProgress : findAll()) {
			remove(vrCertificateProgress);
		}
	}

	/**
	 * Returns the number of vr certificate progresses.
	 *
	 * @return the number of vr certificate progresses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCERTIFICATEPROGRESS);

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
		return VRCertificateProgressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr certificate progress persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCertificateProgressImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCERTIFICATEPROGRESS = "SELECT vrCertificateProgress FROM VRCertificateProgress vrCertificateProgress";
	private static final String _SQL_SELECT_VRCERTIFICATEPROGRESS_WHERE_PKS_IN = "SELECT vrCertificateProgress FROM VRCertificateProgress vrCertificateProgress WHERE id IN (";
	private static final String _SQL_COUNT_VRCERTIFICATEPROGRESS = "SELECT COUNT(vrCertificateProgress) FROM VRCertificateProgress vrCertificateProgress";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrCertificateProgress.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCertificateProgress exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VRCertificateProgressPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"remarks"
			});
}