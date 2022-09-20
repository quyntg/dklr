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

package com.fds.vr.filterconfig.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.filterconfig.exception.NoSuchVRConditionException;
import com.fds.vr.filterconfig.model.VRCondition;
import com.fds.vr.filterconfig.model.impl.VRConditionImpl;
import com.fds.vr.filterconfig.model.impl.VRConditionModelImpl;
import com.fds.vr.filterconfig.service.persistence.VRConditionPersistence;

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
 * The persistence implementation for the vr condition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanHoang
 * @see VRConditionPersistence
 * @see com.fds.vr.filterconfig.service.persistence.VRConditionUtil
 * @generated
 */
@ProviderType
public class VRConditionPersistenceImpl extends BasePersistenceImpl<VRCondition>
	implements VRConditionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRConditionUtil} to access the vr condition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRConditionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionModelImpl.FINDER_CACHE_ENABLED, VRConditionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionModelImpl.FINDER_CACHE_ENABLED, VRConditionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_SPEC_CODE = new FinderPath(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionModelImpl.FINDER_CACHE_ENABLED, VRConditionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBySPEC_CODE",
			new String[] { String.class.getName() },
			VRConditionModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPEC_CODE = new FinderPath(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySPEC_CODE",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr condition where specificationCode = &#63; or throws a {@link NoSuchVRConditionException} if it could not be found.
	 *
	 * @param specificationCode the specification code
	 * @return the matching vr condition
	 * @throws NoSuchVRConditionException if a matching vr condition could not be found
	 */
	@Override
	public VRCondition findBySPEC_CODE(String specificationCode)
		throws NoSuchVRConditionException {
		VRCondition vrCondition = fetchBySPEC_CODE(specificationCode);

		if (vrCondition == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("specificationCode=");
			msg.append(specificationCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRConditionException(msg.toString());
		}

		return vrCondition;
	}

	/**
	 * Returns the vr condition where specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param specificationCode the specification code
	 * @return the matching vr condition, or <code>null</code> if a matching vr condition could not be found
	 */
	@Override
	public VRCondition fetchBySPEC_CODE(String specificationCode) {
		return fetchBySPEC_CODE(specificationCode, true);
	}

	/**
	 * Returns the vr condition where specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param specificationCode the specification code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr condition, or <code>null</code> if a matching vr condition could not be found
	 */
	@Override
	public VRCondition fetchBySPEC_CODE(String specificationCode,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { specificationCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_SPEC_CODE,
					finderArgs, this);
		}

		if (result instanceof VRCondition) {
			VRCondition vrCondition = (VRCondition)result;

			if (!Objects.equals(specificationCode,
						vrCondition.getSpecificationCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRCONDITION_WHERE);

			boolean bindSpecificationCode = false;

			if (specificationCode == null) {
				query.append(_FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_1);
			}
			else if (specificationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationCode = true;

				query.append(_FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationCode) {
					qPos.add(specificationCode);
				}

				List<VRCondition> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_SPEC_CODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRConditionPersistenceImpl.fetchBySPEC_CODE(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRCondition vrCondition = list.get(0);

					result = vrCondition;

					cacheResult(vrCondition);

					if ((vrCondition.getSpecificationCode() == null) ||
							!vrCondition.getSpecificationCode()
											.equals(specificationCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_SPEC_CODE,
							finderArgs, vrCondition);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_SPEC_CODE,
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
			return (VRCondition)result;
		}
	}

	/**
	 * Removes the vr condition where specificationCode = &#63; from the database.
	 *
	 * @param specificationCode the specification code
	 * @return the vr condition that was removed
	 */
	@Override
	public VRCondition removeBySPEC_CODE(String specificationCode)
		throws NoSuchVRConditionException {
		VRCondition vrCondition = findBySPEC_CODE(specificationCode);

		return remove(vrCondition);
	}

	/**
	 * Returns the number of vr conditions where specificationCode = &#63;.
	 *
	 * @param specificationCode the specification code
	 * @return the number of matching vr conditions
	 */
	@Override
	public int countBySPEC_CODE(String specificationCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPEC_CODE;

		Object[] finderArgs = new Object[] { specificationCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCONDITION_WHERE);

			boolean bindSpecificationCode = false;

			if (specificationCode == null) {
				query.append(_FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_1);
			}
			else if (specificationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationCode = true;

				query.append(_FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationCode) {
					qPos.add(specificationCode);
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

	private static final String _FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_1 = "vrCondition.specificationCode IS NULL";
	private static final String _FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_2 = "vrCondition.specificationCode = ?";
	private static final String _FINDER_COLUMN_SPEC_CODE_SPECIFICATIONCODE_3 = "(vrCondition.specificationCode IS NULL OR vrCondition.specificationCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTER_MODULE_CODE =
		new FinderPath(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionModelImpl.FINDER_CACHE_ENABLED, VRConditionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFILTER_MODULE_CODE",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTER_MODULE_CODE =
		new FinderPath(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionModelImpl.FINDER_CACHE_ENABLED, VRConditionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFILTER_MODULE_CODE",
			new String[] { String.class.getName() },
			VRConditionModelImpl.FILTERMODULECODE_COLUMN_BITMASK |
			VRConditionModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILTER_MODULE_CODE = new FinderPath(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFILTER_MODULE_CODE", new String[] { String.class.getName() });

	/**
	 * Returns all the vr conditions where filterModuleCode = &#63;.
	 *
	 * @param filterModuleCode the filter module code
	 * @return the matching vr conditions
	 */
	@Override
	public List<VRCondition> findByFILTER_MODULE_CODE(String filterModuleCode) {
		return findByFILTER_MODULE_CODE(filterModuleCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr conditions where filterModuleCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param filterModuleCode the filter module code
	 * @param start the lower bound of the range of vr conditions
	 * @param end the upper bound of the range of vr conditions (not inclusive)
	 * @return the range of matching vr conditions
	 */
	@Override
	public List<VRCondition> findByFILTER_MODULE_CODE(String filterModuleCode,
		int start, int end) {
		return findByFILTER_MODULE_CODE(filterModuleCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr conditions where filterModuleCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param filterModuleCode the filter module code
	 * @param start the lower bound of the range of vr conditions
	 * @param end the upper bound of the range of vr conditions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr conditions
	 */
	@Override
	public List<VRCondition> findByFILTER_MODULE_CODE(String filterModuleCode,
		int start, int end, OrderByComparator<VRCondition> orderByComparator) {
		return findByFILTER_MODULE_CODE(filterModuleCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr conditions where filterModuleCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param filterModuleCode the filter module code
	 * @param start the lower bound of the range of vr conditions
	 * @param end the upper bound of the range of vr conditions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr conditions
	 */
	@Override
	public List<VRCondition> findByFILTER_MODULE_CODE(String filterModuleCode,
		int start, int end, OrderByComparator<VRCondition> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTER_MODULE_CODE;
			finderArgs = new Object[] { filterModuleCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTER_MODULE_CODE;
			finderArgs = new Object[] {
					filterModuleCode,
					
					start, end, orderByComparator
				};
		}

		List<VRCondition> list = null;

		if (retrieveFromCache) {
			list = (List<VRCondition>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCondition vrCondition : list) {
					if (!Objects.equals(filterModuleCode,
								vrCondition.getFilterModuleCode())) {
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

			query.append(_SQL_SELECT_VRCONDITION_WHERE);

			boolean bindFilterModuleCode = false;

			if (filterModuleCode == null) {
				query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_1);
			}
			else if (filterModuleCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_3);
			}
			else {
				bindFilterModuleCode = true;

				query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConditionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFilterModuleCode) {
					qPos.add(filterModuleCode);
				}

				if (!pagination) {
					list = (List<VRCondition>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCondition>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr condition in the ordered set where filterModuleCode = &#63;.
	 *
	 * @param filterModuleCode the filter module code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr condition
	 * @throws NoSuchVRConditionException if a matching vr condition could not be found
	 */
	@Override
	public VRCondition findByFILTER_MODULE_CODE_First(String filterModuleCode,
		OrderByComparator<VRCondition> orderByComparator)
		throws NoSuchVRConditionException {
		VRCondition vrCondition = fetchByFILTER_MODULE_CODE_First(filterModuleCode,
				orderByComparator);

		if (vrCondition != null) {
			return vrCondition;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("filterModuleCode=");
		msg.append(filterModuleCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConditionException(msg.toString());
	}

	/**
	 * Returns the first vr condition in the ordered set where filterModuleCode = &#63;.
	 *
	 * @param filterModuleCode the filter module code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr condition, or <code>null</code> if a matching vr condition could not be found
	 */
	@Override
	public VRCondition fetchByFILTER_MODULE_CODE_First(
		String filterModuleCode,
		OrderByComparator<VRCondition> orderByComparator) {
		List<VRCondition> list = findByFILTER_MODULE_CODE(filterModuleCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr condition in the ordered set where filterModuleCode = &#63;.
	 *
	 * @param filterModuleCode the filter module code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr condition
	 * @throws NoSuchVRConditionException if a matching vr condition could not be found
	 */
	@Override
	public VRCondition findByFILTER_MODULE_CODE_Last(String filterModuleCode,
		OrderByComparator<VRCondition> orderByComparator)
		throws NoSuchVRConditionException {
		VRCondition vrCondition = fetchByFILTER_MODULE_CODE_Last(filterModuleCode,
				orderByComparator);

		if (vrCondition != null) {
			return vrCondition;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("filterModuleCode=");
		msg.append(filterModuleCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConditionException(msg.toString());
	}

	/**
	 * Returns the last vr condition in the ordered set where filterModuleCode = &#63;.
	 *
	 * @param filterModuleCode the filter module code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr condition, or <code>null</code> if a matching vr condition could not be found
	 */
	@Override
	public VRCondition fetchByFILTER_MODULE_CODE_Last(String filterModuleCode,
		OrderByComparator<VRCondition> orderByComparator) {
		int count = countByFILTER_MODULE_CODE(filterModuleCode);

		if (count == 0) {
			return null;
		}

		List<VRCondition> list = findByFILTER_MODULE_CODE(filterModuleCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr conditions before and after the current vr condition in the ordered set where filterModuleCode = &#63;.
	 *
	 * @param id the primary key of the current vr condition
	 * @param filterModuleCode the filter module code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr condition
	 * @throws NoSuchVRConditionException if a vr condition with the primary key could not be found
	 */
	@Override
	public VRCondition[] findByFILTER_MODULE_CODE_PrevAndNext(long id,
		String filterModuleCode,
		OrderByComparator<VRCondition> orderByComparator)
		throws NoSuchVRConditionException {
		VRCondition vrCondition = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCondition[] array = new VRConditionImpl[3];

			array[0] = getByFILTER_MODULE_CODE_PrevAndNext(session,
					vrCondition, filterModuleCode, orderByComparator, true);

			array[1] = vrCondition;

			array[2] = getByFILTER_MODULE_CODE_PrevAndNext(session,
					vrCondition, filterModuleCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCondition getByFILTER_MODULE_CODE_PrevAndNext(Session session,
		VRCondition vrCondition, String filterModuleCode,
		OrderByComparator<VRCondition> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRCONDITION_WHERE);

		boolean bindFilterModuleCode = false;

		if (filterModuleCode == null) {
			query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_1);
		}
		else if (filterModuleCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_3);
		}
		else {
			bindFilterModuleCode = true;

			query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_2);
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
			query.append(VRConditionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFilterModuleCode) {
			qPos.add(filterModuleCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrCondition);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCondition> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr conditions where filterModuleCode = &#63; from the database.
	 *
	 * @param filterModuleCode the filter module code
	 */
	@Override
	public void removeByFILTER_MODULE_CODE(String filterModuleCode) {
		for (VRCondition vrCondition : findByFILTER_MODULE_CODE(
				filterModuleCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrCondition);
		}
	}

	/**
	 * Returns the number of vr conditions where filterModuleCode = &#63;.
	 *
	 * @param filterModuleCode the filter module code
	 * @return the number of matching vr conditions
	 */
	@Override
	public int countByFILTER_MODULE_CODE(String filterModuleCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FILTER_MODULE_CODE;

		Object[] finderArgs = new Object[] { filterModuleCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCONDITION_WHERE);

			boolean bindFilterModuleCode = false;

			if (filterModuleCode == null) {
				query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_1);
			}
			else if (filterModuleCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_3);
			}
			else {
				bindFilterModuleCode = true;

				query.append(_FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFilterModuleCode) {
					qPos.add(filterModuleCode);
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

	private static final String _FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_1 =
		"vrCondition.filterModuleCode IS NULL";
	private static final String _FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_2 =
		"vrCondition.filterModuleCode = ?";
	private static final String _FINDER_COLUMN_FILTER_MODULE_CODE_FILTERMODULECODE_3 =
		"(vrCondition.filterModuleCode IS NULL OR vrCondition.filterModuleCode = '')";

	public VRConditionPersistenceImpl() {
		setModelClass(VRCondition.class);
	}

	/**
	 * Caches the vr condition in the entity cache if it is enabled.
	 *
	 * @param vrCondition the vr condition
	 */
	@Override
	public void cacheResult(VRCondition vrCondition) {
		entityCache.putResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionImpl.class, vrCondition.getPrimaryKey(), vrCondition);

		finderCache.putResult(FINDER_PATH_FETCH_BY_SPEC_CODE,
			new Object[] { vrCondition.getSpecificationCode() }, vrCondition);

		vrCondition.resetOriginalValues();
	}

	/**
	 * Caches the vr conditions in the entity cache if it is enabled.
	 *
	 * @param vrConditions the vr conditions
	 */
	@Override
	public void cacheResult(List<VRCondition> vrConditions) {
		for (VRCondition vrCondition : vrConditions) {
			if (entityCache.getResult(
						VRConditionModelImpl.ENTITY_CACHE_ENABLED,
						VRConditionImpl.class, vrCondition.getPrimaryKey()) == null) {
				cacheResult(vrCondition);
			}
			else {
				vrCondition.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr conditions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRConditionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr condition.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCondition vrCondition) {
		entityCache.removeResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionImpl.class, vrCondition.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRConditionModelImpl)vrCondition, true);
	}

	@Override
	public void clearCache(List<VRCondition> vrConditions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCondition vrCondition : vrConditions) {
			entityCache.removeResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
				VRConditionImpl.class, vrCondition.getPrimaryKey());

			clearUniqueFindersCache((VRConditionModelImpl)vrCondition, true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRConditionModelImpl vrConditionModelImpl) {
		Object[] args = new Object[] { vrConditionModelImpl.getSpecificationCode() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_SPEC_CODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_SPEC_CODE, args,
			vrConditionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRConditionModelImpl vrConditionModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrConditionModelImpl.getSpecificationCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPEC_CODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_SPEC_CODE, args);
		}

		if ((vrConditionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SPEC_CODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrConditionModelImpl.getOriginalSpecificationCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPEC_CODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_SPEC_CODE, args);
		}
	}

	/**
	 * Creates a new vr condition with the primary key. Does not add the vr condition to the database.
	 *
	 * @param id the primary key for the new vr condition
	 * @return the new vr condition
	 */
	@Override
	public VRCondition create(long id) {
		VRCondition vrCondition = new VRConditionImpl();

		vrCondition.setNew(true);
		vrCondition.setPrimaryKey(id);

		return vrCondition;
	}

	/**
	 * Removes the vr condition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr condition
	 * @return the vr condition that was removed
	 * @throws NoSuchVRConditionException if a vr condition with the primary key could not be found
	 */
	@Override
	public VRCondition remove(long id) throws NoSuchVRConditionException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr condition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr condition
	 * @return the vr condition that was removed
	 * @throws NoSuchVRConditionException if a vr condition with the primary key could not be found
	 */
	@Override
	public VRCondition remove(Serializable primaryKey)
		throws NoSuchVRConditionException {
		Session session = null;

		try {
			session = openSession();

			VRCondition vrCondition = (VRCondition)session.get(VRConditionImpl.class,
					primaryKey);

			if (vrCondition == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRConditionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrCondition);
		}
		catch (NoSuchVRConditionException nsee) {
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
	protected VRCondition removeImpl(VRCondition vrCondition) {
		vrCondition = toUnwrappedModel(vrCondition);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrCondition)) {
				vrCondition = (VRCondition)session.get(VRConditionImpl.class,
						vrCondition.getPrimaryKeyObj());
			}

			if (vrCondition != null) {
				session.delete(vrCondition);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrCondition != null) {
			clearCache(vrCondition);
		}

		return vrCondition;
	}

	@Override
	public VRCondition updateImpl(VRCondition vrCondition) {
		vrCondition = toUnwrappedModel(vrCondition);

		boolean isNew = vrCondition.isNew();

		VRConditionModelImpl vrConditionModelImpl = (VRConditionModelImpl)vrCondition;

		Session session = null;

		try {
			session = openSession();

			if (vrCondition.isNew()) {
				session.save(vrCondition);

				vrCondition.setNew(false);
			}
			else {
				vrCondition = (VRCondition)session.merge(vrCondition);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRConditionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrConditionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTER_MODULE_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrConditionModelImpl.getOriginalFilterModuleCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FILTER_MODULE_CODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTER_MODULE_CODE,
					args);

				args = new Object[] { vrConditionModelImpl.getFilterModuleCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FILTER_MODULE_CODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTER_MODULE_CODE,
					args);
			}
		}

		entityCache.putResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
			VRConditionImpl.class, vrCondition.getPrimaryKey(), vrCondition,
			false);

		clearUniqueFindersCache(vrConditionModelImpl, false);
		cacheUniqueFindersCache(vrConditionModelImpl);

		vrCondition.resetOriginalValues();

		return vrCondition;
	}

	protected VRCondition toUnwrappedModel(VRCondition vrCondition) {
		if (vrCondition instanceof VRConditionImpl) {
			return vrCondition;
		}

		VRConditionImpl vrConditionImpl = new VRConditionImpl();

		vrConditionImpl.setNew(vrCondition.isNew());
		vrConditionImpl.setPrimaryKey(vrCondition.getPrimaryKey());

		vrConditionImpl.setId(vrCondition.getId());
		vrConditionImpl.setFilterModuleCode(vrCondition.getFilterModuleCode());
		vrConditionImpl.setFilterTableField(vrCondition.getFilterTableField());
		vrConditionImpl.setFilterTableName(vrCondition.getFilterTableName());
		vrConditionImpl.setSpecificationCode(vrCondition.getSpecificationCode());
		vrConditionImpl.setSpecificationDisplayName(vrCondition.getSpecificationDisplayName());
		vrConditionImpl.setSpecificationDataCollectionID(vrCondition.getSpecificationDataCollectionID());
		vrConditionImpl.setSequenceNo(vrCondition.getSequenceNo());
		vrConditionImpl.setSpecificationBasicUnit(vrCondition.getSpecificationBasicUnit());
		vrConditionImpl.setSpecificationStandard(vrCondition.getSpecificationStandard());
		vrConditionImpl.setSpecificationGroup(vrCondition.getSpecificationGroup());
		vrConditionImpl.setModifyDate(vrCondition.getModifyDate());
		vrConditionImpl.setSyncDate(vrCondition.getSyncDate());

		return vrConditionImpl;
	}

	/**
	 * Returns the vr condition with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr condition
	 * @return the vr condition
	 * @throws NoSuchVRConditionException if a vr condition with the primary key could not be found
	 */
	@Override
	public VRCondition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRConditionException {
		VRCondition vrCondition = fetchByPrimaryKey(primaryKey);

		if (vrCondition == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRConditionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrCondition;
	}

	/**
	 * Returns the vr condition with the primary key or throws a {@link NoSuchVRConditionException} if it could not be found.
	 *
	 * @param id the primary key of the vr condition
	 * @return the vr condition
	 * @throws NoSuchVRConditionException if a vr condition with the primary key could not be found
	 */
	@Override
	public VRCondition findByPrimaryKey(long id)
		throws NoSuchVRConditionException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr condition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr condition
	 * @return the vr condition, or <code>null</code> if a vr condition with the primary key could not be found
	 */
	@Override
	public VRCondition fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
				VRConditionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCondition vrCondition = (VRCondition)serializable;

		if (vrCondition == null) {
			Session session = null;

			try {
				session = openSession();

				vrCondition = (VRCondition)session.get(VRConditionImpl.class,
						primaryKey);

				if (vrCondition != null) {
					cacheResult(vrCondition);
				}
				else {
					entityCache.putResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
						VRConditionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
					VRConditionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrCondition;
	}

	/**
	 * Returns the vr condition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr condition
	 * @return the vr condition, or <code>null</code> if a vr condition with the primary key could not be found
	 */
	@Override
	public VRCondition fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCondition> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCondition> map = new HashMap<Serializable, VRCondition>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCondition vrCondition = fetchByPrimaryKey(primaryKey);

			if (vrCondition != null) {
				map.put(primaryKey, vrCondition);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
					VRConditionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCondition)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCONDITION_WHERE_PKS_IN);

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

			for (VRCondition vrCondition : (List<VRCondition>)q.list()) {
				map.put(vrCondition.getPrimaryKeyObj(), vrCondition);

				cacheResult(vrCondition);

				uncachedPrimaryKeys.remove(vrCondition.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRConditionModelImpl.ENTITY_CACHE_ENABLED,
					VRConditionImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr conditions.
	 *
	 * @return the vr conditions
	 */
	@Override
	public List<VRCondition> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr conditions
	 * @param end the upper bound of the range of vr conditions (not inclusive)
	 * @return the range of vr conditions
	 */
	@Override
	public List<VRCondition> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr conditions
	 * @param end the upper bound of the range of vr conditions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr conditions
	 */
	@Override
	public List<VRCondition> findAll(int start, int end,
		OrderByComparator<VRCondition> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr conditions
	 * @param end the upper bound of the range of vr conditions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr conditions
	 */
	@Override
	public List<VRCondition> findAll(int start, int end,
		OrderByComparator<VRCondition> orderByComparator,
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

		List<VRCondition> list = null;

		if (retrieveFromCache) {
			list = (List<VRCondition>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCONDITION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCONDITION;

				if (pagination) {
					sql = sql.concat(VRConditionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCondition>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCondition>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr conditions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCondition vrCondition : findAll()) {
			remove(vrCondition);
		}
	}

	/**
	 * Returns the number of vr conditions.
	 *
	 * @return the number of vr conditions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCONDITION);

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
		return VRConditionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr condition persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRConditionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCONDITION = "SELECT vrCondition FROM VRCondition vrCondition";
	private static final String _SQL_SELECT_VRCONDITION_WHERE_PKS_IN = "SELECT vrCondition FROM VRCondition vrCondition WHERE id IN (";
	private static final String _SQL_SELECT_VRCONDITION_WHERE = "SELECT vrCondition FROM VRCondition vrCondition WHERE ";
	private static final String _SQL_COUNT_VRCONDITION = "SELECT COUNT(vrCondition) FROM VRCondition vrCondition";
	private static final String _SQL_COUNT_VRCONDITION_WHERE = "SELECT COUNT(vrCondition) FROM VRCondition vrCondition WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrCondition.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCondition exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCondition exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRConditionPersistenceImpl.class);
}