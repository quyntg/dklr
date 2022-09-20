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

import com.fds.vr.business.exception.NoSuchVRCFGStandardException;
import com.fds.vr.business.model.VRCFGStandard;
import com.fds.vr.business.model.impl.VRCFGStandardImpl;
import com.fds.vr.business.model.impl.VRCFGStandardModelImpl;
import com.fds.vr.business.service.persistence.VRCFGStandardPersistence;

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
 * The persistence implementation for the vrcfg standard service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCFGStandardPersistence
 * @see com.fds.vr.business.service.persistence.VRCFGStandardUtil
 * @generated
 */
@ProviderType
public class VRCFGStandardPersistenceImpl extends BasePersistenceImpl<VRCFGStandard>
	implements VRCFGStandardPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCFGStandardUtil} to access the vrcfg standard persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCFGStandardImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
			VRCFGStandardModelImpl.FINDER_CACHE_ENABLED,
			VRCFGStandardImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
			VRCFGStandardModelImpl.FINDER_CACHE_ENABLED,
			VRCFGStandardImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
			VRCFGStandardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VRCFGStandardPersistenceImpl() {
		setModelClass(VRCFGStandard.class);
	}

	/**
	 * Caches the vrcfg standard in the entity cache if it is enabled.
	 *
	 * @param vrcfgStandard the vrcfg standard
	 */
	@Override
	public void cacheResult(VRCFGStandard vrcfgStandard) {
		entityCache.putResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
			VRCFGStandardImpl.class, vrcfgStandard.getPrimaryKey(),
			vrcfgStandard);

		vrcfgStandard.resetOriginalValues();
	}

	/**
	 * Caches the vrcfg standards in the entity cache if it is enabled.
	 *
	 * @param vrcfgStandards the vrcfg standards
	 */
	@Override
	public void cacheResult(List<VRCFGStandard> vrcfgStandards) {
		for (VRCFGStandard vrcfgStandard : vrcfgStandards) {
			if (entityCache.getResult(
						VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
						VRCFGStandardImpl.class, vrcfgStandard.getPrimaryKey()) == null) {
				cacheResult(vrcfgStandard);
			}
			else {
				vrcfgStandard.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcfg standards.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCFGStandardImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcfg standard.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCFGStandard vrcfgStandard) {
		entityCache.removeResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
			VRCFGStandardImpl.class, vrcfgStandard.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRCFGStandard> vrcfgStandards) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCFGStandard vrcfgStandard : vrcfgStandards) {
			entityCache.removeResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
				VRCFGStandardImpl.class, vrcfgStandard.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcfg standard with the primary key. Does not add the vrcfg standard to the database.
	 *
	 * @param id the primary key for the new vrcfg standard
	 * @return the new vrcfg standard
	 */
	@Override
	public VRCFGStandard create(long id) {
		VRCFGStandard vrcfgStandard = new VRCFGStandardImpl();

		vrcfgStandard.setNew(true);
		vrcfgStandard.setPrimaryKey(id);

		return vrcfgStandard;
	}

	/**
	 * Removes the vrcfg standard with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcfg standard
	 * @return the vrcfg standard that was removed
	 * @throws NoSuchVRCFGStandardException if a vrcfg standard with the primary key could not be found
	 */
	@Override
	public VRCFGStandard remove(long id) throws NoSuchVRCFGStandardException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcfg standard with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcfg standard
	 * @return the vrcfg standard that was removed
	 * @throws NoSuchVRCFGStandardException if a vrcfg standard with the primary key could not be found
	 */
	@Override
	public VRCFGStandard remove(Serializable primaryKey)
		throws NoSuchVRCFGStandardException {
		Session session = null;

		try {
			session = openSession();

			VRCFGStandard vrcfgStandard = (VRCFGStandard)session.get(VRCFGStandardImpl.class,
					primaryKey);

			if (vrcfgStandard == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCFGStandardException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcfgStandard);
		}
		catch (NoSuchVRCFGStandardException nsee) {
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
	protected VRCFGStandard removeImpl(VRCFGStandard vrcfgStandard) {
		vrcfgStandard = toUnwrappedModel(vrcfgStandard);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcfgStandard)) {
				vrcfgStandard = (VRCFGStandard)session.get(VRCFGStandardImpl.class,
						vrcfgStandard.getPrimaryKeyObj());
			}

			if (vrcfgStandard != null) {
				session.delete(vrcfgStandard);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcfgStandard != null) {
			clearCache(vrcfgStandard);
		}

		return vrcfgStandard;
	}

	@Override
	public VRCFGStandard updateImpl(VRCFGStandard vrcfgStandard) {
		vrcfgStandard = toUnwrappedModel(vrcfgStandard);

		boolean isNew = vrcfgStandard.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vrcfgStandard.isNew()) {
				session.save(vrcfgStandard);

				vrcfgStandard.setNew(false);
			}
			else {
				vrcfgStandard = (VRCFGStandard)session.merge(vrcfgStandard);
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

		entityCache.putResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
			VRCFGStandardImpl.class, vrcfgStandard.getPrimaryKey(),
			vrcfgStandard, false);

		vrcfgStandard.resetOriginalValues();

		return vrcfgStandard;
	}

	protected VRCFGStandard toUnwrappedModel(VRCFGStandard vrcfgStandard) {
		if (vrcfgStandard instanceof VRCFGStandardImpl) {
			return vrcfgStandard;
		}

		VRCFGStandardImpl vrcfgStandardImpl = new VRCFGStandardImpl();

		vrcfgStandardImpl.setNew(vrcfgStandard.isNew());
		vrcfgStandardImpl.setPrimaryKey(vrcfgStandard.getPrimaryKey());

		vrcfgStandardImpl.setId(vrcfgStandard.getId());
		vrcfgStandardImpl.setVehicleClass(vrcfgStandard.getVehicleClass());
		vrcfgStandardImpl.setVehicleType(vrcfgStandard.getVehicleType());
		vrcfgStandardImpl.setStandardCode(vrcfgStandard.getStandardCode());
		vrcfgStandardImpl.setStandardName(vrcfgStandard.getStandardName());
		vrcfgStandardImpl.setStandardDescription(vrcfgStandard.getStandardDescription());
		vrcfgStandardImpl.setStandardExpiredDate(vrcfgStandard.getStandardExpiredDate());
		vrcfgStandardImpl.setSequenceNo(vrcfgStandard.getSequenceNo());
		vrcfgStandardImpl.setStandardType(vrcfgStandard.getStandardType());
		vrcfgStandardImpl.setModifyDate(vrcfgStandard.getModifyDate());
		vrcfgStandardImpl.setSyncDate(vrcfgStandard.getSyncDate());

		return vrcfgStandardImpl;
	}

	/**
	 * Returns the vrcfg standard with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcfg standard
	 * @return the vrcfg standard
	 * @throws NoSuchVRCFGStandardException if a vrcfg standard with the primary key could not be found
	 */
	@Override
	public VRCFGStandard findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCFGStandardException {
		VRCFGStandard vrcfgStandard = fetchByPrimaryKey(primaryKey);

		if (vrcfgStandard == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCFGStandardException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcfgStandard;
	}

	/**
	 * Returns the vrcfg standard with the primary key or throws a {@link NoSuchVRCFGStandardException} if it could not be found.
	 *
	 * @param id the primary key of the vrcfg standard
	 * @return the vrcfg standard
	 * @throws NoSuchVRCFGStandardException if a vrcfg standard with the primary key could not be found
	 */
	@Override
	public VRCFGStandard findByPrimaryKey(long id)
		throws NoSuchVRCFGStandardException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcfg standard with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcfg standard
	 * @return the vrcfg standard, or <code>null</code> if a vrcfg standard with the primary key could not be found
	 */
	@Override
	public VRCFGStandard fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
				VRCFGStandardImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCFGStandard vrcfgStandard = (VRCFGStandard)serializable;

		if (vrcfgStandard == null) {
			Session session = null;

			try {
				session = openSession();

				vrcfgStandard = (VRCFGStandard)session.get(VRCFGStandardImpl.class,
						primaryKey);

				if (vrcfgStandard != null) {
					cacheResult(vrcfgStandard);
				}
				else {
					entityCache.putResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
						VRCFGStandardImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
					VRCFGStandardImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcfgStandard;
	}

	/**
	 * Returns the vrcfg standard with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcfg standard
	 * @return the vrcfg standard, or <code>null</code> if a vrcfg standard with the primary key could not be found
	 */
	@Override
	public VRCFGStandard fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCFGStandard> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCFGStandard> map = new HashMap<Serializable, VRCFGStandard>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCFGStandard vrcfgStandard = fetchByPrimaryKey(primaryKey);

			if (vrcfgStandard != null) {
				map.put(primaryKey, vrcfgStandard);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
					VRCFGStandardImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCFGStandard)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCFGSTANDARD_WHERE_PKS_IN);

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

			for (VRCFGStandard vrcfgStandard : (List<VRCFGStandard>)q.list()) {
				map.put(vrcfgStandard.getPrimaryKeyObj(), vrcfgStandard);

				cacheResult(vrcfgStandard);

				uncachedPrimaryKeys.remove(vrcfgStandard.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCFGStandardModelImpl.ENTITY_CACHE_ENABLED,
					VRCFGStandardImpl.class, primaryKey, nullModel);
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
	 * Returns all the vrcfg standards.
	 *
	 * @return the vrcfg standards
	 */
	@Override
	public List<VRCFGStandard> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcfg standards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCFGStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcfg standards
	 * @param end the upper bound of the range of vrcfg standards (not inclusive)
	 * @return the range of vrcfg standards
	 */
	@Override
	public List<VRCFGStandard> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcfg standards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCFGStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcfg standards
	 * @param end the upper bound of the range of vrcfg standards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcfg standards
	 */
	@Override
	public List<VRCFGStandard> findAll(int start, int end,
		OrderByComparator<VRCFGStandard> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcfg standards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCFGStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcfg standards
	 * @param end the upper bound of the range of vrcfg standards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcfg standards
	 */
	@Override
	public List<VRCFGStandard> findAll(int start, int end,
		OrderByComparator<VRCFGStandard> orderByComparator,
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

		List<VRCFGStandard> list = null;

		if (retrieveFromCache) {
			list = (List<VRCFGStandard>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCFGSTANDARD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCFGSTANDARD;

				if (pagination) {
					sql = sql.concat(VRCFGStandardModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCFGStandard>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCFGStandard>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vrcfg standards from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCFGStandard vrcfgStandard : findAll()) {
			remove(vrcfgStandard);
		}
	}

	/**
	 * Returns the number of vrcfg standards.
	 *
	 * @return the number of vrcfg standards
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCFGSTANDARD);

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
		return VRCFGStandardModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcfg standard persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCFGStandardImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCFGSTANDARD = "SELECT vrcfgStandard FROM VRCFGStandard vrcfgStandard";
	private static final String _SQL_SELECT_VRCFGSTANDARD_WHERE_PKS_IN = "SELECT vrcfgStandard FROM VRCFGStandard vrcfgStandard WHERE id IN (";
	private static final String _SQL_COUNT_VRCFGSTANDARD = "SELECT COUNT(vrcfgStandard) FROM VRCFGStandard vrcfgStandard";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcfgStandard.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCFGStandard exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VRCFGStandardPersistenceImpl.class);
}