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

import com.fds.vr.business.exception.NoSuchVRSyncDateException;
import com.fds.vr.business.model.VRSyncDate;
import com.fds.vr.business.model.impl.VRSyncDateImpl;
import com.fds.vr.business.model.impl.VRSyncDateModelImpl;
import com.fds.vr.business.service.persistence.VRSyncDatePersistence;

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
 * The persistence implementation for the vr sync date service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRSyncDatePersistence
 * @see com.fds.vr.business.service.persistence.VRSyncDateUtil
 * @generated
 */
@ProviderType
public class VRSyncDatePersistenceImpl extends BasePersistenceImpl<VRSyncDate>
	implements VRSyncDatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRSyncDateUtil} to access the vr sync date persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRSyncDateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			VRSyncDateModelImpl.FINDER_CACHE_ENABLED, VRSyncDateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			VRSyncDateModelImpl.FINDER_CACHE_ENABLED, VRSyncDateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			VRSyncDateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VRSyncDatePersistenceImpl() {
		setModelClass(VRSyncDate.class);
	}

	/**
	 * Caches the vr sync date in the entity cache if it is enabled.
	 *
	 * @param vrSyncDate the vr sync date
	 */
	@Override
	public void cacheResult(VRSyncDate vrSyncDate) {
		entityCache.putResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			VRSyncDateImpl.class, vrSyncDate.getPrimaryKey(), vrSyncDate);

		vrSyncDate.resetOriginalValues();
	}

	/**
	 * Caches the vr sync dates in the entity cache if it is enabled.
	 *
	 * @param vrSyncDates the vr sync dates
	 */
	@Override
	public void cacheResult(List<VRSyncDate> vrSyncDates) {
		for (VRSyncDate vrSyncDate : vrSyncDates) {
			if (entityCache.getResult(
						VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
						VRSyncDateImpl.class, vrSyncDate.getPrimaryKey()) == null) {
				cacheResult(vrSyncDate);
			}
			else {
				vrSyncDate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr sync dates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRSyncDateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr sync date.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRSyncDate vrSyncDate) {
		entityCache.removeResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			VRSyncDateImpl.class, vrSyncDate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRSyncDate> vrSyncDates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRSyncDate vrSyncDate : vrSyncDates) {
			entityCache.removeResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
				VRSyncDateImpl.class, vrSyncDate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr sync date with the primary key. Does not add the vr sync date to the database.
	 *
	 * @param id the primary key for the new vr sync date
	 * @return the new vr sync date
	 */
	@Override
	public VRSyncDate create(long id) {
		VRSyncDate vrSyncDate = new VRSyncDateImpl();

		vrSyncDate.setNew(true);
		vrSyncDate.setPrimaryKey(id);

		return vrSyncDate;
	}

	/**
	 * Removes the vr sync date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr sync date
	 * @return the vr sync date that was removed
	 * @throws NoSuchVRSyncDateException if a vr sync date with the primary key could not be found
	 */
	@Override
	public VRSyncDate remove(long id) throws NoSuchVRSyncDateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr sync date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr sync date
	 * @return the vr sync date that was removed
	 * @throws NoSuchVRSyncDateException if a vr sync date with the primary key could not be found
	 */
	@Override
	public VRSyncDate remove(Serializable primaryKey)
		throws NoSuchVRSyncDateException {
		Session session = null;

		try {
			session = openSession();

			VRSyncDate vrSyncDate = (VRSyncDate)session.get(VRSyncDateImpl.class,
					primaryKey);

			if (vrSyncDate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRSyncDateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrSyncDate);
		}
		catch (NoSuchVRSyncDateException nsee) {
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
	protected VRSyncDate removeImpl(VRSyncDate vrSyncDate) {
		vrSyncDate = toUnwrappedModel(vrSyncDate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrSyncDate)) {
				vrSyncDate = (VRSyncDate)session.get(VRSyncDateImpl.class,
						vrSyncDate.getPrimaryKeyObj());
			}

			if (vrSyncDate != null) {
				session.delete(vrSyncDate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrSyncDate != null) {
			clearCache(vrSyncDate);
		}

		return vrSyncDate;
	}

	@Override
	public VRSyncDate updateImpl(VRSyncDate vrSyncDate) {
		vrSyncDate = toUnwrappedModel(vrSyncDate);

		boolean isNew = vrSyncDate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vrSyncDate.isNew()) {
				session.save(vrSyncDate);

				vrSyncDate.setNew(false);
			}
			else {
				vrSyncDate = (VRSyncDate)session.merge(vrSyncDate);
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

		entityCache.putResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			VRSyncDateImpl.class, vrSyncDate.getPrimaryKey(), vrSyncDate, false);

		vrSyncDate.resetOriginalValues();

		return vrSyncDate;
	}

	protected VRSyncDate toUnwrappedModel(VRSyncDate vrSyncDate) {
		if (vrSyncDate instanceof VRSyncDateImpl) {
			return vrSyncDate;
		}

		VRSyncDateImpl vrSyncDateImpl = new VRSyncDateImpl();

		vrSyncDateImpl.setNew(vrSyncDate.isNew());
		vrSyncDateImpl.setPrimaryKey(vrSyncDate.getPrimaryKey());

		vrSyncDateImpl.setId(vrSyncDate.getId());
		vrSyncDateImpl.setTableName(vrSyncDate.getTableName());
		vrSyncDateImpl.setSyncDate(vrSyncDate.getSyncDate());

		return vrSyncDateImpl;
	}

	/**
	 * Returns the vr sync date with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr sync date
	 * @return the vr sync date
	 * @throws NoSuchVRSyncDateException if a vr sync date with the primary key could not be found
	 */
	@Override
	public VRSyncDate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRSyncDateException {
		VRSyncDate vrSyncDate = fetchByPrimaryKey(primaryKey);

		if (vrSyncDate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRSyncDateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrSyncDate;
	}

	/**
	 * Returns the vr sync date with the primary key or throws a {@link NoSuchVRSyncDateException} if it could not be found.
	 *
	 * @param id the primary key of the vr sync date
	 * @return the vr sync date
	 * @throws NoSuchVRSyncDateException if a vr sync date with the primary key could not be found
	 */
	@Override
	public VRSyncDate findByPrimaryKey(long id)
		throws NoSuchVRSyncDateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr sync date with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr sync date
	 * @return the vr sync date, or <code>null</code> if a vr sync date with the primary key could not be found
	 */
	@Override
	public VRSyncDate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
				VRSyncDateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRSyncDate vrSyncDate = (VRSyncDate)serializable;

		if (vrSyncDate == null) {
			Session session = null;

			try {
				session = openSession();

				vrSyncDate = (VRSyncDate)session.get(VRSyncDateImpl.class,
						primaryKey);

				if (vrSyncDate != null) {
					cacheResult(vrSyncDate);
				}
				else {
					entityCache.putResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
						VRSyncDateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
					VRSyncDateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrSyncDate;
	}

	/**
	 * Returns the vr sync date with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr sync date
	 * @return the vr sync date, or <code>null</code> if a vr sync date with the primary key could not be found
	 */
	@Override
	public VRSyncDate fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRSyncDate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRSyncDate> map = new HashMap<Serializable, VRSyncDate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRSyncDate vrSyncDate = fetchByPrimaryKey(primaryKey);

			if (vrSyncDate != null) {
				map.put(primaryKey, vrSyncDate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
					VRSyncDateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRSyncDate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRSYNCDATE_WHERE_PKS_IN);

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

			for (VRSyncDate vrSyncDate : (List<VRSyncDate>)q.list()) {
				map.put(vrSyncDate.getPrimaryKeyObj(), vrSyncDate);

				cacheResult(vrSyncDate);

				uncachedPrimaryKeys.remove(vrSyncDate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRSyncDateModelImpl.ENTITY_CACHE_ENABLED,
					VRSyncDateImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr sync dates.
	 *
	 * @return the vr sync dates
	 */
	@Override
	public List<VRSyncDate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr sync dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr sync dates
	 * @param end the upper bound of the range of vr sync dates (not inclusive)
	 * @return the range of vr sync dates
	 */
	@Override
	public List<VRSyncDate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr sync dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr sync dates
	 * @param end the upper bound of the range of vr sync dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr sync dates
	 */
	@Override
	public List<VRSyncDate> findAll(int start, int end,
		OrderByComparator<VRSyncDate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr sync dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr sync dates
	 * @param end the upper bound of the range of vr sync dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr sync dates
	 */
	@Override
	public List<VRSyncDate> findAll(int start, int end,
		OrderByComparator<VRSyncDate> orderByComparator,
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

		List<VRSyncDate> list = null;

		if (retrieveFromCache) {
			list = (List<VRSyncDate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRSYNCDATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRSYNCDATE;

				if (pagination) {
					sql = sql.concat(VRSyncDateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRSyncDate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRSyncDate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr sync dates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRSyncDate vrSyncDate : findAll()) {
			remove(vrSyncDate);
		}
	}

	/**
	 * Returns the number of vr sync dates.
	 *
	 * @return the number of vr sync dates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRSYNCDATE);

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
		return VRSyncDateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr sync date persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRSyncDateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRSYNCDATE = "SELECT vrSyncDate FROM VRSyncDate vrSyncDate";
	private static final String _SQL_SELECT_VRSYNCDATE_WHERE_PKS_IN = "SELECT vrSyncDate FROM VRSyncDate vrSyncDate WHERE id IN (";
	private static final String _SQL_COUNT_VRSYNCDATE = "SELECT COUNT(vrSyncDate) FROM VRSyncDate vrSyncDate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrSyncDate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRSyncDate exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VRSyncDatePersistenceImpl.class);
}