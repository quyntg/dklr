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

import com.fds.vr.business.exception.NoSuchVRMigrateTaskException;
import com.fds.vr.business.model.VRMigrateTask;
import com.fds.vr.business.model.impl.VRMigrateTaskImpl;
import com.fds.vr.business.model.impl.VRMigrateTaskModelImpl;
import com.fds.vr.business.service.persistence.VRMigrateTaskPersistence;

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
 * The persistence implementation for the vr migrate task service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRMigrateTaskPersistence
 * @see com.fds.vr.business.service.persistence.VRMigrateTaskUtil
 * @generated
 */
@ProviderType
public class VRMigrateTaskPersistenceImpl extends BasePersistenceImpl<VRMigrateTask>
	implements VRMigrateTaskPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRMigrateTaskUtil} to access the vr migrate task persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRMigrateTaskImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateTaskModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateTaskImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateTaskModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateTaskImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateTaskModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VRMigrateTaskPersistenceImpl() {
		setModelClass(VRMigrateTask.class);
	}

	/**
	 * Caches the vr migrate task in the entity cache if it is enabled.
	 *
	 * @param vrMigrateTask the vr migrate task
	 */
	@Override
	public void cacheResult(VRMigrateTask vrMigrateTask) {
		entityCache.putResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateTaskImpl.class, vrMigrateTask.getPrimaryKey(),
			vrMigrateTask);

		vrMigrateTask.resetOriginalValues();
	}

	/**
	 * Caches the vr migrate tasks in the entity cache if it is enabled.
	 *
	 * @param vrMigrateTasks the vr migrate tasks
	 */
	@Override
	public void cacheResult(List<VRMigrateTask> vrMigrateTasks) {
		for (VRMigrateTask vrMigrateTask : vrMigrateTasks) {
			if (entityCache.getResult(
						VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
						VRMigrateTaskImpl.class, vrMigrateTask.getPrimaryKey()) == null) {
				cacheResult(vrMigrateTask);
			}
			else {
				vrMigrateTask.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr migrate tasks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRMigrateTaskImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr migrate task.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRMigrateTask vrMigrateTask) {
		entityCache.removeResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateTaskImpl.class, vrMigrateTask.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRMigrateTask> vrMigrateTasks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRMigrateTask vrMigrateTask : vrMigrateTasks) {
			entityCache.removeResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
				VRMigrateTaskImpl.class, vrMigrateTask.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr migrate task with the primary key. Does not add the vr migrate task to the database.
	 *
	 * @param task_id the primary key for the new vr migrate task
	 * @return the new vr migrate task
	 */
	@Override
	public VRMigrateTask create(long task_id) {
		VRMigrateTask vrMigrateTask = new VRMigrateTaskImpl();

		vrMigrateTask.setNew(true);
		vrMigrateTask.setPrimaryKey(task_id);

		return vrMigrateTask;
	}

	/**
	 * Removes the vr migrate task with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param task_id the primary key of the vr migrate task
	 * @return the vr migrate task that was removed
	 * @throws NoSuchVRMigrateTaskException if a vr migrate task with the primary key could not be found
	 */
	@Override
	public VRMigrateTask remove(long task_id)
		throws NoSuchVRMigrateTaskException {
		return remove((Serializable)task_id);
	}

	/**
	 * Removes the vr migrate task with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr migrate task
	 * @return the vr migrate task that was removed
	 * @throws NoSuchVRMigrateTaskException if a vr migrate task with the primary key could not be found
	 */
	@Override
	public VRMigrateTask remove(Serializable primaryKey)
		throws NoSuchVRMigrateTaskException {
		Session session = null;

		try {
			session = openSession();

			VRMigrateTask vrMigrateTask = (VRMigrateTask)session.get(VRMigrateTaskImpl.class,
					primaryKey);

			if (vrMigrateTask == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRMigrateTaskException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrMigrateTask);
		}
		catch (NoSuchVRMigrateTaskException nsee) {
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
	protected VRMigrateTask removeImpl(VRMigrateTask vrMigrateTask) {
		vrMigrateTask = toUnwrappedModel(vrMigrateTask);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrMigrateTask)) {
				vrMigrateTask = (VRMigrateTask)session.get(VRMigrateTaskImpl.class,
						vrMigrateTask.getPrimaryKeyObj());
			}

			if (vrMigrateTask != null) {
				session.delete(vrMigrateTask);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrMigrateTask != null) {
			clearCache(vrMigrateTask);
		}

		return vrMigrateTask;
	}

	@Override
	public VRMigrateTask updateImpl(VRMigrateTask vrMigrateTask) {
		vrMigrateTask = toUnwrappedModel(vrMigrateTask);

		boolean isNew = vrMigrateTask.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vrMigrateTask.isNew()) {
				session.save(vrMigrateTask);

				vrMigrateTask.setNew(false);
			}
			else {
				vrMigrateTask = (VRMigrateTask)session.merge(vrMigrateTask);
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

		entityCache.putResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateTaskImpl.class, vrMigrateTask.getPrimaryKey(),
			vrMigrateTask, false);

		vrMigrateTask.resetOriginalValues();

		return vrMigrateTask;
	}

	protected VRMigrateTask toUnwrappedModel(VRMigrateTask vrMigrateTask) {
		if (vrMigrateTask instanceof VRMigrateTaskImpl) {
			return vrMigrateTask;
		}

		VRMigrateTaskImpl vrMigrateTaskImpl = new VRMigrateTaskImpl();

		vrMigrateTaskImpl.setNew(vrMigrateTask.isNew());
		vrMigrateTaskImpl.setPrimaryKey(vrMigrateTask.getPrimaryKey());

		vrMigrateTaskImpl.setTask_id(vrMigrateTask.getTask_id());
		vrMigrateTaskImpl.setTask_name(vrMigrateTask.getTask_name());
		vrMigrateTaskImpl.setTaskMigrationID(vrMigrateTask.getTaskMigrationID());
		vrMigrateTaskImpl.setSource_config(vrMigrateTask.getSource_config());
		vrMigrateTaskImpl.setTarget_config(vrMigrateTask.getTarget_config());
		vrMigrateTaskImpl.setRemarks(vrMigrateTask.getRemarks());
		vrMigrateTaskImpl.setStatus(vrMigrateTask.getStatus());

		return vrMigrateTaskImpl;
	}

	/**
	 * Returns the vr migrate task with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr migrate task
	 * @return the vr migrate task
	 * @throws NoSuchVRMigrateTaskException if a vr migrate task with the primary key could not be found
	 */
	@Override
	public VRMigrateTask findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRMigrateTaskException {
		VRMigrateTask vrMigrateTask = fetchByPrimaryKey(primaryKey);

		if (vrMigrateTask == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRMigrateTaskException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrMigrateTask;
	}

	/**
	 * Returns the vr migrate task with the primary key or throws a {@link NoSuchVRMigrateTaskException} if it could not be found.
	 *
	 * @param task_id the primary key of the vr migrate task
	 * @return the vr migrate task
	 * @throws NoSuchVRMigrateTaskException if a vr migrate task with the primary key could not be found
	 */
	@Override
	public VRMigrateTask findByPrimaryKey(long task_id)
		throws NoSuchVRMigrateTaskException {
		return findByPrimaryKey((Serializable)task_id);
	}

	/**
	 * Returns the vr migrate task with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr migrate task
	 * @return the vr migrate task, or <code>null</code> if a vr migrate task with the primary key could not be found
	 */
	@Override
	public VRMigrateTask fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
				VRMigrateTaskImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRMigrateTask vrMigrateTask = (VRMigrateTask)serializable;

		if (vrMigrateTask == null) {
			Session session = null;

			try {
				session = openSession();

				vrMigrateTask = (VRMigrateTask)session.get(VRMigrateTaskImpl.class,
						primaryKey);

				if (vrMigrateTask != null) {
					cacheResult(vrMigrateTask);
				}
				else {
					entityCache.putResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
						VRMigrateTaskImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateTaskImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrMigrateTask;
	}

	/**
	 * Returns the vr migrate task with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param task_id the primary key of the vr migrate task
	 * @return the vr migrate task, or <code>null</code> if a vr migrate task with the primary key could not be found
	 */
	@Override
	public VRMigrateTask fetchByPrimaryKey(long task_id) {
		return fetchByPrimaryKey((Serializable)task_id);
	}

	@Override
	public Map<Serializable, VRMigrateTask> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRMigrateTask> map = new HashMap<Serializable, VRMigrateTask>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRMigrateTask vrMigrateTask = fetchByPrimaryKey(primaryKey);

			if (vrMigrateTask != null) {
				map.put(primaryKey, vrMigrateTask);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateTaskImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRMigrateTask)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRMIGRATETASK_WHERE_PKS_IN);

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

			for (VRMigrateTask vrMigrateTask : (List<VRMigrateTask>)q.list()) {
				map.put(vrMigrateTask.getPrimaryKeyObj(), vrMigrateTask);

				cacheResult(vrMigrateTask);

				uncachedPrimaryKeys.remove(vrMigrateTask.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRMigrateTaskModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateTaskImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr migrate tasks.
	 *
	 * @return the vr migrate tasks
	 */
	@Override
	public List<VRMigrateTask> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr migrate tasks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate tasks
	 * @param end the upper bound of the range of vr migrate tasks (not inclusive)
	 * @return the range of vr migrate tasks
	 */
	@Override
	public List<VRMigrateTask> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr migrate tasks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate tasks
	 * @param end the upper bound of the range of vr migrate tasks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr migrate tasks
	 */
	@Override
	public List<VRMigrateTask> findAll(int start, int end,
		OrderByComparator<VRMigrateTask> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr migrate tasks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate tasks
	 * @param end the upper bound of the range of vr migrate tasks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr migrate tasks
	 */
	@Override
	public List<VRMigrateTask> findAll(int start, int end,
		OrderByComparator<VRMigrateTask> orderByComparator,
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

		List<VRMigrateTask> list = null;

		if (retrieveFromCache) {
			list = (List<VRMigrateTask>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRMIGRATETASK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRMIGRATETASK;

				if (pagination) {
					sql = sql.concat(VRMigrateTaskModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRMigrateTask>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRMigrateTask>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr migrate tasks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRMigrateTask vrMigrateTask : findAll()) {
			remove(vrMigrateTask);
		}
	}

	/**
	 * Returns the number of vr migrate tasks.
	 *
	 * @return the number of vr migrate tasks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRMIGRATETASK);

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
		return VRMigrateTaskModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr migrate task persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRMigrateTaskImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRMIGRATETASK = "SELECT vrMigrateTask FROM VRMigrateTask vrMigrateTask";
	private static final String _SQL_SELECT_VRMIGRATETASK_WHERE_PKS_IN = "SELECT vrMigrateTask FROM VRMigrateTask vrMigrateTask WHERE task_id IN (";
	private static final String _SQL_COUNT_VRMIGRATETASK = "SELECT COUNT(vrMigrateTask) FROM VRMigrateTask vrMigrateTask";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrMigrateTask.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRMigrateTask exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VRMigrateTaskPersistenceImpl.class);
}