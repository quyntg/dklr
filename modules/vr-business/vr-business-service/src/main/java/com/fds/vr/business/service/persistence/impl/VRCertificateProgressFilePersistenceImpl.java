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

import com.fds.vr.business.exception.NoSuchVRCertificateProgressFileException;
import com.fds.vr.business.model.VRCertificateProgressFile;
import com.fds.vr.business.model.impl.VRCertificateProgressFileImpl;
import com.fds.vr.business.model.impl.VRCertificateProgressFileModelImpl;
import com.fds.vr.business.service.persistence.VRCertificateProgressFilePersistence;

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
 * The persistence implementation for the vr certificate progress file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCertificateProgressFilePersistence
 * @see com.fds.vr.business.service.persistence.VRCertificateProgressFileUtil
 * @generated
 */
@ProviderType
public class VRCertificateProgressFilePersistenceImpl
	extends BasePersistenceImpl<VRCertificateProgressFile>
	implements VRCertificateProgressFilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCertificateProgressFileUtil} to access the vr certificate progress file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCertificateProgressFileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressFileModelImpl.FINDER_CACHE_ENABLED,
			VRCertificateProgressFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressFileModelImpl.FINDER_CACHE_ENABLED,
			VRCertificateProgressFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressFileModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public VRCertificateProgressFilePersistenceImpl() {
		setModelClass(VRCertificateProgressFile.class);
	}

	/**
	 * Caches the vr certificate progress file in the entity cache if it is enabled.
	 *
	 * @param vrCertificateProgressFile the vr certificate progress file
	 */
	@Override
	public void cacheResult(VRCertificateProgressFile vrCertificateProgressFile) {
		entityCache.putResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressFileImpl.class,
			vrCertificateProgressFile.getPrimaryKey(), vrCertificateProgressFile);

		vrCertificateProgressFile.resetOriginalValues();
	}

	/**
	 * Caches the vr certificate progress files in the entity cache if it is enabled.
	 *
	 * @param vrCertificateProgressFiles the vr certificate progress files
	 */
	@Override
	public void cacheResult(
		List<VRCertificateProgressFile> vrCertificateProgressFiles) {
		for (VRCertificateProgressFile vrCertificateProgressFile : vrCertificateProgressFiles) {
			if (entityCache.getResult(
						VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
						VRCertificateProgressFileImpl.class,
						vrCertificateProgressFile.getPrimaryKey()) == null) {
				cacheResult(vrCertificateProgressFile);
			}
			else {
				vrCertificateProgressFile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr certificate progress files.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCertificateProgressFileImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr certificate progress file.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCertificateProgressFile vrCertificateProgressFile) {
		entityCache.removeResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressFileImpl.class,
			vrCertificateProgressFile.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRCertificateProgressFile> vrCertificateProgressFiles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCertificateProgressFile vrCertificateProgressFile : vrCertificateProgressFiles) {
			entityCache.removeResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
				VRCertificateProgressFileImpl.class,
				vrCertificateProgressFile.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr certificate progress file with the primary key. Does not add the vr certificate progress file to the database.
	 *
	 * @param id the primary key for the new vr certificate progress file
	 * @return the new vr certificate progress file
	 */
	@Override
	public VRCertificateProgressFile create(long id) {
		VRCertificateProgressFile vrCertificateProgressFile = new VRCertificateProgressFileImpl();

		vrCertificateProgressFile.setNew(true);
		vrCertificateProgressFile.setPrimaryKey(id);

		return vrCertificateProgressFile;
	}

	/**
	 * Removes the vr certificate progress file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr certificate progress file
	 * @return the vr certificate progress file that was removed
	 * @throws NoSuchVRCertificateProgressFileException if a vr certificate progress file with the primary key could not be found
	 */
	@Override
	public VRCertificateProgressFile remove(long id)
		throws NoSuchVRCertificateProgressFileException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr certificate progress file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr certificate progress file
	 * @return the vr certificate progress file that was removed
	 * @throws NoSuchVRCertificateProgressFileException if a vr certificate progress file with the primary key could not be found
	 */
	@Override
	public VRCertificateProgressFile remove(Serializable primaryKey)
		throws NoSuchVRCertificateProgressFileException {
		Session session = null;

		try {
			session = openSession();

			VRCertificateProgressFile vrCertificateProgressFile = (VRCertificateProgressFile)session.get(VRCertificateProgressFileImpl.class,
					primaryKey);

			if (vrCertificateProgressFile == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCertificateProgressFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrCertificateProgressFile);
		}
		catch (NoSuchVRCertificateProgressFileException nsee) {
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
	protected VRCertificateProgressFile removeImpl(
		VRCertificateProgressFile vrCertificateProgressFile) {
		vrCertificateProgressFile = toUnwrappedModel(vrCertificateProgressFile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrCertificateProgressFile)) {
				vrCertificateProgressFile = (VRCertificateProgressFile)session.get(VRCertificateProgressFileImpl.class,
						vrCertificateProgressFile.getPrimaryKeyObj());
			}

			if (vrCertificateProgressFile != null) {
				session.delete(vrCertificateProgressFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrCertificateProgressFile != null) {
			clearCache(vrCertificateProgressFile);
		}

		return vrCertificateProgressFile;
	}

	@Override
	public VRCertificateProgressFile updateImpl(
		VRCertificateProgressFile vrCertificateProgressFile) {
		vrCertificateProgressFile = toUnwrappedModel(vrCertificateProgressFile);

		boolean isNew = vrCertificateProgressFile.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vrCertificateProgressFile.isNew()) {
				session.save(vrCertificateProgressFile);

				vrCertificateProgressFile.setNew(false);
			}
			else {
				vrCertificateProgressFile = (VRCertificateProgressFile)session.merge(vrCertificateProgressFile);
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

		entityCache.putResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
			VRCertificateProgressFileImpl.class,
			vrCertificateProgressFile.getPrimaryKey(),
			vrCertificateProgressFile, false);

		vrCertificateProgressFile.resetOriginalValues();

		return vrCertificateProgressFile;
	}

	protected VRCertificateProgressFile toUnwrappedModel(
		VRCertificateProgressFile vrCertificateProgressFile) {
		if (vrCertificateProgressFile instanceof VRCertificateProgressFileImpl) {
			return vrCertificateProgressFile;
		}

		VRCertificateProgressFileImpl vrCertificateProgressFileImpl = new VRCertificateProgressFileImpl();

		vrCertificateProgressFileImpl.setNew(vrCertificateProgressFile.isNew());
		vrCertificateProgressFileImpl.setPrimaryKey(vrCertificateProgressFile.getPrimaryKey());

		vrCertificateProgressFileImpl.setId(vrCertificateProgressFile.getId());
		vrCertificateProgressFileImpl.setCertificateProgressID(vrCertificateProgressFile.getCertificateProgressID());
		vrCertificateProgressFileImpl.setAttachedFileID(vrCertificateProgressFile.getAttachedFileID());

		return vrCertificateProgressFileImpl;
	}

	/**
	 * Returns the vr certificate progress file with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr certificate progress file
	 * @return the vr certificate progress file
	 * @throws NoSuchVRCertificateProgressFileException if a vr certificate progress file with the primary key could not be found
	 */
	@Override
	public VRCertificateProgressFile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCertificateProgressFileException {
		VRCertificateProgressFile vrCertificateProgressFile = fetchByPrimaryKey(primaryKey);

		if (vrCertificateProgressFile == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCertificateProgressFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrCertificateProgressFile;
	}

	/**
	 * Returns the vr certificate progress file with the primary key or throws a {@link NoSuchVRCertificateProgressFileException} if it could not be found.
	 *
	 * @param id the primary key of the vr certificate progress file
	 * @return the vr certificate progress file
	 * @throws NoSuchVRCertificateProgressFileException if a vr certificate progress file with the primary key could not be found
	 */
	@Override
	public VRCertificateProgressFile findByPrimaryKey(long id)
		throws NoSuchVRCertificateProgressFileException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr certificate progress file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr certificate progress file
	 * @return the vr certificate progress file, or <code>null</code> if a vr certificate progress file with the primary key could not be found
	 */
	@Override
	public VRCertificateProgressFile fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
				VRCertificateProgressFileImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCertificateProgressFile vrCertificateProgressFile = (VRCertificateProgressFile)serializable;

		if (vrCertificateProgressFile == null) {
			Session session = null;

			try {
				session = openSession();

				vrCertificateProgressFile = (VRCertificateProgressFile)session.get(VRCertificateProgressFileImpl.class,
						primaryKey);

				if (vrCertificateProgressFile != null) {
					cacheResult(vrCertificateProgressFile);
				}
				else {
					entityCache.putResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
						VRCertificateProgressFileImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
					VRCertificateProgressFileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrCertificateProgressFile;
	}

	/**
	 * Returns the vr certificate progress file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr certificate progress file
	 * @return the vr certificate progress file, or <code>null</code> if a vr certificate progress file with the primary key could not be found
	 */
	@Override
	public VRCertificateProgressFile fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCertificateProgressFile> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCertificateProgressFile> map = new HashMap<Serializable, VRCertificateProgressFile>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCertificateProgressFile vrCertificateProgressFile = fetchByPrimaryKey(primaryKey);

			if (vrCertificateProgressFile != null) {
				map.put(primaryKey, vrCertificateProgressFile);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
					VRCertificateProgressFileImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCertificateProgressFile)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCERTIFICATEPROGRESSFILE_WHERE_PKS_IN);

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

			for (VRCertificateProgressFile vrCertificateProgressFile : (List<VRCertificateProgressFile>)q.list()) {
				map.put(vrCertificateProgressFile.getPrimaryKeyObj(),
					vrCertificateProgressFile);

				cacheResult(vrCertificateProgressFile);

				uncachedPrimaryKeys.remove(vrCertificateProgressFile.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCertificateProgressFileModelImpl.ENTITY_CACHE_ENABLED,
					VRCertificateProgressFileImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr certificate progress files.
	 *
	 * @return the vr certificate progress files
	 */
	@Override
	public List<VRCertificateProgressFile> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr certificate progress files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr certificate progress files
	 * @param end the upper bound of the range of vr certificate progress files (not inclusive)
	 * @return the range of vr certificate progress files
	 */
	@Override
	public List<VRCertificateProgressFile> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr certificate progress files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr certificate progress files
	 * @param end the upper bound of the range of vr certificate progress files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr certificate progress files
	 */
	@Override
	public List<VRCertificateProgressFile> findAll(int start, int end,
		OrderByComparator<VRCertificateProgressFile> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr certificate progress files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr certificate progress files
	 * @param end the upper bound of the range of vr certificate progress files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr certificate progress files
	 */
	@Override
	public List<VRCertificateProgressFile> findAll(int start, int end,
		OrderByComparator<VRCertificateProgressFile> orderByComparator,
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

		List<VRCertificateProgressFile> list = null;

		if (retrieveFromCache) {
			list = (List<VRCertificateProgressFile>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCERTIFICATEPROGRESSFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCERTIFICATEPROGRESSFILE;

				if (pagination) {
					sql = sql.concat(VRCertificateProgressFileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCertificateProgressFile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCertificateProgressFile>)QueryUtil.list(q,
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
	 * Removes all the vr certificate progress files from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCertificateProgressFile vrCertificateProgressFile : findAll()) {
			remove(vrCertificateProgressFile);
		}
	}

	/**
	 * Returns the number of vr certificate progress files.
	 *
	 * @return the number of vr certificate progress files
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCERTIFICATEPROGRESSFILE);

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
		return VRCertificateProgressFileModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr certificate progress file persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCertificateProgressFileImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCERTIFICATEPROGRESSFILE = "SELECT vrCertificateProgressFile FROM VRCertificateProgressFile vrCertificateProgressFile";
	private static final String _SQL_SELECT_VRCERTIFICATEPROGRESSFILE_WHERE_PKS_IN =
		"SELECT vrCertificateProgressFile FROM VRCertificateProgressFile vrCertificateProgressFile WHERE id IN (";
	private static final String _SQL_COUNT_VRCERTIFICATEPROGRESSFILE = "SELECT COUNT(vrCertificateProgressFile) FROM VRCertificateProgressFile vrCertificateProgressFile";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrCertificateProgressFile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCertificateProgressFile exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VRCertificateProgressFilePersistenceImpl.class);
}