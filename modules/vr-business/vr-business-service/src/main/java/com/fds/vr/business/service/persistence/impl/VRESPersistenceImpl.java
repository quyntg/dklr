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

import com.fds.vr.business.exception.NoSuchVRESException;
import com.fds.vr.business.model.VRES;
import com.fds.vr.business.model.impl.VRESImpl;
import com.fds.vr.business.model.impl.VRESModelImpl;
import com.fds.vr.business.service.persistence.VRESPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the vres service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRESPersistence
 * @see com.fds.vr.business.service.persistence.VRESUtil
 * @generated
 */
@ProviderType
public class VRESPersistenceImpl extends BasePersistenceImpl<VRES>
	implements VRESPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRESUtil} to access the vres persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRESImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRESModelImpl.ENTITY_CACHE_ENABLED,
			VRESModelImpl.FINDER_CACHE_ENABLED, VRESImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRESModelImpl.ENTITY_CACHE_ENABLED,
			VRESModelImpl.FINDER_CACHE_ENABLED, VRESImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRESModelImpl.ENTITY_CACHE_ENABLED,
			VRESModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VRESPersistenceImpl() {
		setModelClass(VRES.class);
	}

	/**
	 * Caches the vres in the entity cache if it is enabled.
	 *
	 * @param vres the vres
	 */
	@Override
	public void cacheResult(VRES vres) {
		entityCache.putResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
			VRESImpl.class, vres.getPrimaryKey(), vres);

		vres.resetOriginalValues();
	}

	/**
	 * Caches the vreses in the entity cache if it is enabled.
	 *
	 * @param vreses the vreses
	 */
	@Override
	public void cacheResult(List<VRES> vreses) {
		for (VRES vres : vreses) {
			if (entityCache.getResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
						VRESImpl.class, vres.getPrimaryKey()) == null) {
				cacheResult(vres);
			}
			else {
				vres.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vreses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRESImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vres.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRES vres) {
		entityCache.removeResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
			VRESImpl.class, vres.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRES> vreses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRES vres : vreses) {
			entityCache.removeResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
				VRESImpl.class, vres.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vres with the primary key. Does not add the vres to the database.
	 *
	 * @param id the primary key for the new vres
	 * @return the new vres
	 */
	@Override
	public VRES create(long id) {
		VRES vres = new VRESImpl();

		vres.setNew(true);
		vres.setPrimaryKey(id);

		vres.setCompanyId(companyProvider.getCompanyId());

		return vres;
	}

	/**
	 * Removes the vres with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vres
	 * @return the vres that was removed
	 * @throws NoSuchVRESException if a vres with the primary key could not be found
	 */
	@Override
	public VRES remove(long id) throws NoSuchVRESException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vres with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vres
	 * @return the vres that was removed
	 * @throws NoSuchVRESException if a vres with the primary key could not be found
	 */
	@Override
	public VRES remove(Serializable primaryKey) throws NoSuchVRESException {
		Session session = null;

		try {
			session = openSession();

			VRES vres = (VRES)session.get(VRESImpl.class, primaryKey);

			if (vres == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRESException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vres);
		}
		catch (NoSuchVRESException nsee) {
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
	protected VRES removeImpl(VRES vres) {
		vres = toUnwrappedModel(vres);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vres)) {
				vres = (VRES)session.get(VRESImpl.class, vres.getPrimaryKeyObj());
			}

			if (vres != null) {
				session.delete(vres);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vres != null) {
			clearCache(vres);
		}

		return vres;
	}

	@Override
	public VRES updateImpl(VRES vres) {
		vres = toUnwrappedModel(vres);

		boolean isNew = vres.isNew();

		VRESModelImpl vresModelImpl = (VRESModelImpl)vres;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (vres.getCreateDate() == null)) {
			if (serviceContext == null) {
				vres.setCreateDate(now);
			}
			else {
				vres.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!vresModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				vres.setModifiedDate(now);
			}
			else {
				vres.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (vres.isNew()) {
				session.save(vres);

				vres.setNew(false);
			}
			else {
				vres = (VRES)session.merge(vres);
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

		entityCache.putResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
			VRESImpl.class, vres.getPrimaryKey(), vres, false);

		vres.resetOriginalValues();

		return vres;
	}

	protected VRES toUnwrappedModel(VRES vres) {
		if (vres instanceof VRESImpl) {
			return vres;
		}

		VRESImpl vresImpl = new VRESImpl();

		vresImpl.setNew(vres.isNew());
		vresImpl.setPrimaryKey(vres.getPrimaryKey());

		vresImpl.setId(vres.getId());
		vresImpl.setCompanyId(vres.getCompanyId());
		vresImpl.setGroupId(vres.getGroupId());
		vresImpl.setUserId(vres.getUserId());
		vresImpl.setUserName(vres.getUserName());
		vresImpl.setCreateDate(vres.getCreateDate());
		vresImpl.setModifiedDate(vres.getModifiedDate());
		vresImpl.setType(vres.getType());
		vresImpl.setData(vres.getData());

		return vresImpl;
	}

	/**
	 * Returns the vres with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vres
	 * @return the vres
	 * @throws NoSuchVRESException if a vres with the primary key could not be found
	 */
	@Override
	public VRES findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRESException {
		VRES vres = fetchByPrimaryKey(primaryKey);

		if (vres == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRESException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vres;
	}

	/**
	 * Returns the vres with the primary key or throws a {@link NoSuchVRESException} if it could not be found.
	 *
	 * @param id the primary key of the vres
	 * @return the vres
	 * @throws NoSuchVRESException if a vres with the primary key could not be found
	 */
	@Override
	public VRES findByPrimaryKey(long id) throws NoSuchVRESException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vres with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vres
	 * @return the vres, or <code>null</code> if a vres with the primary key could not be found
	 */
	@Override
	public VRES fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
				VRESImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRES vres = (VRES)serializable;

		if (vres == null) {
			Session session = null;

			try {
				session = openSession();

				vres = (VRES)session.get(VRESImpl.class, primaryKey);

				if (vres != null) {
					cacheResult(vres);
				}
				else {
					entityCache.putResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
						VRESImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
					VRESImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vres;
	}

	/**
	 * Returns the vres with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vres
	 * @return the vres, or <code>null</code> if a vres with the primary key could not be found
	 */
	@Override
	public VRES fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRES> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRES> map = new HashMap<Serializable, VRES>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRES vres = fetchByPrimaryKey(primaryKey);

			if (vres != null) {
				map.put(primaryKey, vres);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
					VRESImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRES)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRES_WHERE_PKS_IN);

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

			for (VRES vres : (List<VRES>)q.list()) {
				map.put(vres.getPrimaryKeyObj(), vres);

				cacheResult(vres);

				uncachedPrimaryKeys.remove(vres.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRESModelImpl.ENTITY_CACHE_ENABLED,
					VRESImpl.class, primaryKey, nullModel);
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
	 * Returns all the vreses.
	 *
	 * @return the vreses
	 */
	@Override
	public List<VRES> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vreses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vreses
	 * @param end the upper bound of the range of vreses (not inclusive)
	 * @return the range of vreses
	 */
	@Override
	public List<VRES> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vreses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vreses
	 * @param end the upper bound of the range of vreses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vreses
	 */
	@Override
	public List<VRES> findAll(int start, int end,
		OrderByComparator<VRES> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vreses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vreses
	 * @param end the upper bound of the range of vreses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vreses
	 */
	@Override
	public List<VRES> findAll(int start, int end,
		OrderByComparator<VRES> orderByComparator, boolean retrieveFromCache) {
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

		List<VRES> list = null;

		if (retrieveFromCache) {
			list = (List<VRES>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRES;

				if (pagination) {
					sql = sql.concat(VRESModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRES>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRES>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the vreses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRES vres : findAll()) {
			remove(vres);
		}
	}

	/**
	 * Returns the number of vreses.
	 *
	 * @return the number of vreses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRES);

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
		return VRESModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vres persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRESImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRES = "SELECT vres FROM VRES vres";
	private static final String _SQL_SELECT_VRES_WHERE_PKS_IN = "SELECT vres FROM VRES vres WHERE id IN (";
	private static final String _SQL_COUNT_VRES = "SELECT COUNT(vres) FROM VRES vres";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vres.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRES exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VRESPersistenceImpl.class);
}