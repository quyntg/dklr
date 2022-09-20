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

import com.fds.vr.business.exception.NoSuchVRReportCategoryException;
import com.fds.vr.business.model.VRReportCategory;
import com.fds.vr.business.model.impl.VRReportCategoryImpl;
import com.fds.vr.business.model.impl.VRReportCategoryModelImpl;
import com.fds.vr.business.service.persistence.VRReportCategoryPersistence;

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
 * The persistence implementation for the vr report category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRReportCategoryPersistence
 * @see com.fds.vr.business.service.persistence.VRReportCategoryUtil
 * @generated
 */
@ProviderType
public class VRReportCategoryPersistenceImpl extends BasePersistenceImpl<VRReportCategory>
	implements VRReportCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRReportCategoryUtil} to access the vr report category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRReportCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			VRReportCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			VRReportCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_RPTCODE = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			VRReportCategoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByrptCode", new String[] { String.class.getName() },
			VRReportCategoryModelImpl.RPTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RPTCODE = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrptCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr report category where rptCode = &#63; or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	 *
	 * @param rptCode the rpt code
	 * @return the matching vr report category
	 * @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory findByrptCode(String rptCode)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = fetchByrptCode(rptCode);

		if (vrReportCategory == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("rptCode=");
			msg.append(rptCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRReportCategoryException(msg.toString());
		}

		return vrReportCategory;
	}

	/**
	 * Returns the vr report category where rptCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param rptCode the rpt code
	 * @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory fetchByrptCode(String rptCode) {
		return fetchByrptCode(rptCode, true);
	}

	/**
	 * Returns the vr report category where rptCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param rptCode the rpt code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory fetchByrptCode(String rptCode,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { rptCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_RPTCODE,
					finderArgs, this);
		}

		if (result instanceof VRReportCategory) {
			VRReportCategory vrReportCategory = (VRReportCategory)result;

			if (!Objects.equals(rptCode, vrReportCategory.getRptCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRREPORTCATEGORY_WHERE);

			boolean bindRptCode = false;

			if (rptCode == null) {
				query.append(_FINDER_COLUMN_RPTCODE_RPTCODE_1);
			}
			else if (rptCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RPTCODE_RPTCODE_3);
			}
			else {
				bindRptCode = true;

				query.append(_FINDER_COLUMN_RPTCODE_RPTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRptCode) {
					qPos.add(rptCode);
				}

				List<VRReportCategory> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_RPTCODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRReportCategoryPersistenceImpl.fetchByrptCode(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRReportCategory vrReportCategory = list.get(0);

					result = vrReportCategory;

					cacheResult(vrReportCategory);

					if ((vrReportCategory.getRptCode() == null) ||
							!vrReportCategory.getRptCode().equals(rptCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_RPTCODE,
							finderArgs, vrReportCategory);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_RPTCODE,
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
			return (VRReportCategory)result;
		}
	}

	/**
	 * Removes the vr report category where rptCode = &#63; from the database.
	 *
	 * @param rptCode the rpt code
	 * @return the vr report category that was removed
	 */
	@Override
	public VRReportCategory removeByrptCode(String rptCode)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = findByrptCode(rptCode);

		return remove(vrReportCategory);
	}

	/**
	 * Returns the number of vr report categories where rptCode = &#63;.
	 *
	 * @param rptCode the rpt code
	 * @return the number of matching vr report categories
	 */
	@Override
	public int countByrptCode(String rptCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RPTCODE;

		Object[] finderArgs = new Object[] { rptCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRREPORTCATEGORY_WHERE);

			boolean bindRptCode = false;

			if (rptCode == null) {
				query.append(_FINDER_COLUMN_RPTCODE_RPTCODE_1);
			}
			else if (rptCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RPTCODE_RPTCODE_3);
			}
			else {
				bindRptCode = true;

				query.append(_FINDER_COLUMN_RPTCODE_RPTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRptCode) {
					qPos.add(rptCode);
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

	private static final String _FINDER_COLUMN_RPTCODE_RPTCODE_1 = "vrReportCategory.rptCode IS NULL";
	private static final String _FINDER_COLUMN_RPTCODE_RPTCODE_2 = "vrReportCategory.rptCode = ?";
	private static final String _FINDER_COLUMN_RPTCODE_RPTCODE_3 = "(vrReportCategory.rptCode IS NULL OR vrReportCategory.rptCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RPTGROUP = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			VRReportCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByrptGroup",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTGROUP =
		new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			VRReportCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByrptGroup",
			new String[] { String.class.getName() },
			VRReportCategoryModelImpl.RPTGROUP_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RPTGROUP = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrptGroup",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr report categories where rptGroup = &#63;.
	 *
	 * @param rptGroup the rpt group
	 * @return the matching vr report categories
	 */
	@Override
	public List<VRReportCategory> findByrptGroup(String rptGroup) {
		return findByrptGroup(rptGroup, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr report categories where rptGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param rptGroup the rpt group
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @return the range of matching vr report categories
	 */
	@Override
	public List<VRReportCategory> findByrptGroup(String rptGroup, int start,
		int end) {
		return findByrptGroup(rptGroup, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr report categories where rptGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param rptGroup the rpt group
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr report categories
	 */
	@Override
	public List<VRReportCategory> findByrptGroup(String rptGroup, int start,
		int end, OrderByComparator<VRReportCategory> orderByComparator) {
		return findByrptGroup(rptGroup, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr report categories where rptGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param rptGroup the rpt group
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr report categories
	 */
	@Override
	public List<VRReportCategory> findByrptGroup(String rptGroup, int start,
		int end, OrderByComparator<VRReportCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTGROUP;
			finderArgs = new Object[] { rptGroup };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RPTGROUP;
			finderArgs = new Object[] { rptGroup, start, end, orderByComparator };
		}

		List<VRReportCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VRReportCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRReportCategory vrReportCategory : list) {
					if (!Objects.equals(rptGroup, vrReportCategory.getRptGroup())) {
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

			query.append(_SQL_SELECT_VRREPORTCATEGORY_WHERE);

			boolean bindRptGroup = false;

			if (rptGroup == null) {
				query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_1);
			}
			else if (rptGroup.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_3);
			}
			else {
				bindRptGroup = true;

				query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRReportCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRptGroup) {
					qPos.add(rptGroup);
				}

				if (!pagination) {
					list = (List<VRReportCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRReportCategory>)QueryUtil.list(q,
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
	 * Returns the first vr report category in the ordered set where rptGroup = &#63;.
	 *
	 * @param rptGroup the rpt group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr report category
	 * @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory findByrptGroup_First(String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = fetchByrptGroup_First(rptGroup,
				orderByComparator);

		if (vrReportCategory != null) {
			return vrReportCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("rptGroup=");
		msg.append(rptGroup);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRReportCategoryException(msg.toString());
	}

	/**
	 * Returns the first vr report category in the ordered set where rptGroup = &#63;.
	 *
	 * @param rptGroup the rpt group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr report category, or <code>null</code> if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory fetchByrptGroup_First(String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator) {
		List<VRReportCategory> list = findByrptGroup(rptGroup, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr report category in the ordered set where rptGroup = &#63;.
	 *
	 * @param rptGroup the rpt group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr report category
	 * @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory findByrptGroup_Last(String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = fetchByrptGroup_Last(rptGroup,
				orderByComparator);

		if (vrReportCategory != null) {
			return vrReportCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("rptGroup=");
		msg.append(rptGroup);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRReportCategoryException(msg.toString());
	}

	/**
	 * Returns the last vr report category in the ordered set where rptGroup = &#63;.
	 *
	 * @param rptGroup the rpt group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr report category, or <code>null</code> if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory fetchByrptGroup_Last(String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator) {
		int count = countByrptGroup(rptGroup);

		if (count == 0) {
			return null;
		}

		List<VRReportCategory> list = findByrptGroup(rptGroup, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr report categories before and after the current vr report category in the ordered set where rptGroup = &#63;.
	 *
	 * @param id the primary key of the current vr report category
	 * @param rptGroup the rpt group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr report category
	 * @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	 */
	@Override
	public VRReportCategory[] findByrptGroup_PrevAndNext(int id,
		String rptGroup, OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRReportCategory[] array = new VRReportCategoryImpl[3];

			array[0] = getByrptGroup_PrevAndNext(session, vrReportCategory,
					rptGroup, orderByComparator, true);

			array[1] = vrReportCategory;

			array[2] = getByrptGroup_PrevAndNext(session, vrReportCategory,
					rptGroup, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRReportCategory getByrptGroup_PrevAndNext(Session session,
		VRReportCategory vrReportCategory, String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRREPORTCATEGORY_WHERE);

		boolean bindRptGroup = false;

		if (rptGroup == null) {
			query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_1);
		}
		else if (rptGroup.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_3);
		}
		else {
			bindRptGroup = true;

			query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_2);
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
			query.append(VRReportCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRptGroup) {
			qPos.add(rptGroup);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrReportCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRReportCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr report categories where rptGroup = &#63; from the database.
	 *
	 * @param rptGroup the rpt group
	 */
	@Override
	public void removeByrptGroup(String rptGroup) {
		for (VRReportCategory vrReportCategory : findByrptGroup(rptGroup,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrReportCategory);
		}
	}

	/**
	 * Returns the number of vr report categories where rptGroup = &#63;.
	 *
	 * @param rptGroup the rpt group
	 * @return the number of matching vr report categories
	 */
	@Override
	public int countByrptGroup(String rptGroup) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RPTGROUP;

		Object[] finderArgs = new Object[] { rptGroup };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRREPORTCATEGORY_WHERE);

			boolean bindRptGroup = false;

			if (rptGroup == null) {
				query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_1);
			}
			else if (rptGroup.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_3);
			}
			else {
				bindRptGroup = true;

				query.append(_FINDER_COLUMN_RPTGROUP_RPTGROUP_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRptGroup) {
					qPos.add(rptGroup);
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

	private static final String _FINDER_COLUMN_RPTGROUP_RPTGROUP_1 = "vrReportCategory.rptGroup IS NULL";
	private static final String _FINDER_COLUMN_RPTGROUP_RPTGROUP_2 = "vrReportCategory.rptGroup = ?";
	private static final String _FINDER_COLUMN_RPTGROUP_RPTGROUP_3 = "(vrReportCategory.rptGroup IS NULL OR vrReportCategory.rptGroup = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RPTLEVEL = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			VRReportCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByrptLevel",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTLEVEL =
		new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			VRReportCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByrptLevel",
			new String[] { Integer.class.getName() },
			VRReportCategoryModelImpl.RPTLEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RPTLEVEL = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrptLevel",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the vr report categories where rptLevel = &#63;.
	 *
	 * @param rptLevel the rpt level
	 * @return the matching vr report categories
	 */
	@Override
	public List<VRReportCategory> findByrptLevel(int rptLevel) {
		return findByrptLevel(rptLevel, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr report categories where rptLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param rptLevel the rpt level
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @return the range of matching vr report categories
	 */
	@Override
	public List<VRReportCategory> findByrptLevel(int rptLevel, int start,
		int end) {
		return findByrptLevel(rptLevel, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr report categories where rptLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param rptLevel the rpt level
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr report categories
	 */
	@Override
	public List<VRReportCategory> findByrptLevel(int rptLevel, int start,
		int end, OrderByComparator<VRReportCategory> orderByComparator) {
		return findByrptLevel(rptLevel, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr report categories where rptLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param rptLevel the rpt level
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr report categories
	 */
	@Override
	public List<VRReportCategory> findByrptLevel(int rptLevel, int start,
		int end, OrderByComparator<VRReportCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTLEVEL;
			finderArgs = new Object[] { rptLevel };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RPTLEVEL;
			finderArgs = new Object[] { rptLevel, start, end, orderByComparator };
		}

		List<VRReportCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VRReportCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRReportCategory vrReportCategory : list) {
					if ((rptLevel != vrReportCategory.getRptLevel())) {
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

			query.append(_SQL_SELECT_VRREPORTCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_RPTLEVEL_RPTLEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRReportCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(rptLevel);

				if (!pagination) {
					list = (List<VRReportCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRReportCategory>)QueryUtil.list(q,
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
	 * Returns the first vr report category in the ordered set where rptLevel = &#63;.
	 *
	 * @param rptLevel the rpt level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr report category
	 * @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory findByrptLevel_First(int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = fetchByrptLevel_First(rptLevel,
				orderByComparator);

		if (vrReportCategory != null) {
			return vrReportCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("rptLevel=");
		msg.append(rptLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRReportCategoryException(msg.toString());
	}

	/**
	 * Returns the first vr report category in the ordered set where rptLevel = &#63;.
	 *
	 * @param rptLevel the rpt level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr report category, or <code>null</code> if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory fetchByrptLevel_First(int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator) {
		List<VRReportCategory> list = findByrptLevel(rptLevel, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr report category in the ordered set where rptLevel = &#63;.
	 *
	 * @param rptLevel the rpt level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr report category
	 * @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory findByrptLevel_Last(int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = fetchByrptLevel_Last(rptLevel,
				orderByComparator);

		if (vrReportCategory != null) {
			return vrReportCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("rptLevel=");
		msg.append(rptLevel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRReportCategoryException(msg.toString());
	}

	/**
	 * Returns the last vr report category in the ordered set where rptLevel = &#63;.
	 *
	 * @param rptLevel the rpt level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr report category, or <code>null</code> if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory fetchByrptLevel_Last(int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator) {
		int count = countByrptLevel(rptLevel);

		if (count == 0) {
			return null;
		}

		List<VRReportCategory> list = findByrptLevel(rptLevel, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr report categories before and after the current vr report category in the ordered set where rptLevel = &#63;.
	 *
	 * @param id the primary key of the current vr report category
	 * @param rptLevel the rpt level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr report category
	 * @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	 */
	@Override
	public VRReportCategory[] findByrptLevel_PrevAndNext(int id, int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRReportCategory[] array = new VRReportCategoryImpl[3];

			array[0] = getByrptLevel_PrevAndNext(session, vrReportCategory,
					rptLevel, orderByComparator, true);

			array[1] = vrReportCategory;

			array[2] = getByrptLevel_PrevAndNext(session, vrReportCategory,
					rptLevel, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRReportCategory getByrptLevel_PrevAndNext(Session session,
		VRReportCategory vrReportCategory, int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRREPORTCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_RPTLEVEL_RPTLEVEL_2);

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
			query.append(VRReportCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(rptLevel);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrReportCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRReportCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr report categories where rptLevel = &#63; from the database.
	 *
	 * @param rptLevel the rpt level
	 */
	@Override
	public void removeByrptLevel(int rptLevel) {
		for (VRReportCategory vrReportCategory : findByrptLevel(rptLevel,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrReportCategory);
		}
	}

	/**
	 * Returns the number of vr report categories where rptLevel = &#63;.
	 *
	 * @param rptLevel the rpt level
	 * @return the number of matching vr report categories
	 */
	@Override
	public int countByrptLevel(int rptLevel) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RPTLEVEL;

		Object[] finderArgs = new Object[] { rptLevel };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRREPORTCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_RPTLEVEL_RPTLEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(rptLevel);

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

	private static final String _FINDER_COLUMN_RPTLEVEL_RPTLEVEL_2 = "vrReportCategory.rptLevel = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_RPTDESCRIPTION = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			VRReportCategoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByrptDescription", new String[] { String.class.getName() },
			VRReportCategoryModelImpl.RPTDESCRIPTION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RPTDESCRIPTION = new FinderPath(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrptDescription",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr report category where rptDescription = &#63; or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	 *
	 * @param rptDescription the rpt description
	 * @return the matching vr report category
	 * @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory findByrptDescription(String rptDescription)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = fetchByrptDescription(rptDescription);

		if (vrReportCategory == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("rptDescription=");
			msg.append(rptDescription);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRReportCategoryException(msg.toString());
		}

		return vrReportCategory;
	}

	/**
	 * Returns the vr report category where rptDescription = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param rptDescription the rpt description
	 * @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory fetchByrptDescription(String rptDescription) {
		return fetchByrptDescription(rptDescription, true);
	}

	/**
	 * Returns the vr report category where rptDescription = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param rptDescription the rpt description
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	 */
	@Override
	public VRReportCategory fetchByrptDescription(String rptDescription,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { rptDescription };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_RPTDESCRIPTION,
					finderArgs, this);
		}

		if (result instanceof VRReportCategory) {
			VRReportCategory vrReportCategory = (VRReportCategory)result;

			if (!Objects.equals(rptDescription,
						vrReportCategory.getRptDescription())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRREPORTCATEGORY_WHERE);

			boolean bindRptDescription = false;

			if (rptDescription == null) {
				query.append(_FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_1);
			}
			else if (rptDescription.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_3);
			}
			else {
				bindRptDescription = true;

				query.append(_FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRptDescription) {
					qPos.add(rptDescription);
				}

				List<VRReportCategory> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_RPTDESCRIPTION,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRReportCategoryPersistenceImpl.fetchByrptDescription(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRReportCategory vrReportCategory = list.get(0);

					result = vrReportCategory;

					cacheResult(vrReportCategory);

					if ((vrReportCategory.getRptDescription() == null) ||
							!vrReportCategory.getRptDescription()
												 .equals(rptDescription)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_RPTDESCRIPTION,
							finderArgs, vrReportCategory);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_RPTDESCRIPTION,
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
			return (VRReportCategory)result;
		}
	}

	/**
	 * Removes the vr report category where rptDescription = &#63; from the database.
	 *
	 * @param rptDescription the rpt description
	 * @return the vr report category that was removed
	 */
	@Override
	public VRReportCategory removeByrptDescription(String rptDescription)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = findByrptDescription(rptDescription);

		return remove(vrReportCategory);
	}

	/**
	 * Returns the number of vr report categories where rptDescription = &#63;.
	 *
	 * @param rptDescription the rpt description
	 * @return the number of matching vr report categories
	 */
	@Override
	public int countByrptDescription(String rptDescription) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RPTDESCRIPTION;

		Object[] finderArgs = new Object[] { rptDescription };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRREPORTCATEGORY_WHERE);

			boolean bindRptDescription = false;

			if (rptDescription == null) {
				query.append(_FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_1);
			}
			else if (rptDescription.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_3);
			}
			else {
				bindRptDescription = true;

				query.append(_FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRptDescription) {
					qPos.add(rptDescription);
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

	private static final String _FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_1 = "vrReportCategory.rptDescription IS NULL";
	private static final String _FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_2 = "vrReportCategory.rptDescription = ?";
	private static final String _FINDER_COLUMN_RPTDESCRIPTION_RPTDESCRIPTION_3 = "(vrReportCategory.rptDescription IS NULL OR vrReportCategory.rptDescription = '')";

	public VRReportCategoryPersistenceImpl() {
		setModelClass(VRReportCategory.class);
	}

	/**
	 * Caches the vr report category in the entity cache if it is enabled.
	 *
	 * @param vrReportCategory the vr report category
	 */
	@Override
	public void cacheResult(VRReportCategory vrReportCategory) {
		entityCache.putResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryImpl.class, vrReportCategory.getPrimaryKey(),
			vrReportCategory);

		finderCache.putResult(FINDER_PATH_FETCH_BY_RPTCODE,
			new Object[] { vrReportCategory.getRptCode() }, vrReportCategory);

		finderCache.putResult(FINDER_PATH_FETCH_BY_RPTDESCRIPTION,
			new Object[] { vrReportCategory.getRptDescription() },
			vrReportCategory);

		vrReportCategory.resetOriginalValues();
	}

	/**
	 * Caches the vr report categories in the entity cache if it is enabled.
	 *
	 * @param vrReportCategories the vr report categories
	 */
	@Override
	public void cacheResult(List<VRReportCategory> vrReportCategories) {
		for (VRReportCategory vrReportCategory : vrReportCategories) {
			if (entityCache.getResult(
						VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
						VRReportCategoryImpl.class,
						vrReportCategory.getPrimaryKey()) == null) {
				cacheResult(vrReportCategory);
			}
			else {
				vrReportCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr report categories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRReportCategoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr report category.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRReportCategory vrReportCategory) {
		entityCache.removeResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryImpl.class, vrReportCategory.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRReportCategoryModelImpl)vrReportCategory,
			true);
	}

	@Override
	public void clearCache(List<VRReportCategory> vrReportCategories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRReportCategory vrReportCategory : vrReportCategories) {
			entityCache.removeResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
				VRReportCategoryImpl.class, vrReportCategory.getPrimaryKey());

			clearUniqueFindersCache((VRReportCategoryModelImpl)vrReportCategory,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRReportCategoryModelImpl vrReportCategoryModelImpl) {
		Object[] args = new Object[] { vrReportCategoryModelImpl.getRptCode() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_RPTCODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_RPTCODE, args,
			vrReportCategoryModelImpl, false);

		args = new Object[] { vrReportCategoryModelImpl.getRptDescription() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_RPTDESCRIPTION, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_RPTDESCRIPTION, args,
			vrReportCategoryModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRReportCategoryModelImpl vrReportCategoryModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { vrReportCategoryModelImpl.getRptCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_RPTCODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_RPTCODE, args);
		}

		if ((vrReportCategoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_RPTCODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrReportCategoryModelImpl.getOriginalRptCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_RPTCODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_RPTCODE, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrReportCategoryModelImpl.getRptDescription()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_RPTDESCRIPTION, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_RPTDESCRIPTION, args);
		}

		if ((vrReportCategoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_RPTDESCRIPTION.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrReportCategoryModelImpl.getOriginalRptDescription()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_RPTDESCRIPTION, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_RPTDESCRIPTION, args);
		}
	}

	/**
	 * Creates a new vr report category with the primary key. Does not add the vr report category to the database.
	 *
	 * @param id the primary key for the new vr report category
	 * @return the new vr report category
	 */
	@Override
	public VRReportCategory create(int id) {
		VRReportCategory vrReportCategory = new VRReportCategoryImpl();

		vrReportCategory.setNew(true);
		vrReportCategory.setPrimaryKey(id);

		return vrReportCategory;
	}

	/**
	 * Removes the vr report category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr report category
	 * @return the vr report category that was removed
	 * @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	 */
	@Override
	public VRReportCategory remove(int id)
		throws NoSuchVRReportCategoryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr report category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr report category
	 * @return the vr report category that was removed
	 * @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	 */
	@Override
	public VRReportCategory remove(Serializable primaryKey)
		throws NoSuchVRReportCategoryException {
		Session session = null;

		try {
			session = openSession();

			VRReportCategory vrReportCategory = (VRReportCategory)session.get(VRReportCategoryImpl.class,
					primaryKey);

			if (vrReportCategory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRReportCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrReportCategory);
		}
		catch (NoSuchVRReportCategoryException nsee) {
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
	protected VRReportCategory removeImpl(VRReportCategory vrReportCategory) {
		vrReportCategory = toUnwrappedModel(vrReportCategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrReportCategory)) {
				vrReportCategory = (VRReportCategory)session.get(VRReportCategoryImpl.class,
						vrReportCategory.getPrimaryKeyObj());
			}

			if (vrReportCategory != null) {
				session.delete(vrReportCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrReportCategory != null) {
			clearCache(vrReportCategory);
		}

		return vrReportCategory;
	}

	@Override
	public VRReportCategory updateImpl(VRReportCategory vrReportCategory) {
		vrReportCategory = toUnwrappedModel(vrReportCategory);

		boolean isNew = vrReportCategory.isNew();

		VRReportCategoryModelImpl vrReportCategoryModelImpl = (VRReportCategoryModelImpl)vrReportCategory;

		Session session = null;

		try {
			session = openSession();

			if (vrReportCategory.isNew()) {
				session.save(vrReportCategory);

				vrReportCategory.setNew(false);
			}
			else {
				vrReportCategory = (VRReportCategory)session.merge(vrReportCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRReportCategoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrReportCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTGROUP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrReportCategoryModelImpl.getOriginalRptGroup()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_RPTGROUP, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTGROUP,
					args);

				args = new Object[] { vrReportCategoryModelImpl.getRptGroup() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_RPTGROUP, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTGROUP,
					args);
			}

			if ((vrReportCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTLEVEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrReportCategoryModelImpl.getOriginalRptLevel()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_RPTLEVEL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTLEVEL,
					args);

				args = new Object[] { vrReportCategoryModelImpl.getRptLevel() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_RPTLEVEL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RPTLEVEL,
					args);
			}
		}

		entityCache.putResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VRReportCategoryImpl.class, vrReportCategory.getPrimaryKey(),
			vrReportCategory, false);

		clearUniqueFindersCache(vrReportCategoryModelImpl, false);
		cacheUniqueFindersCache(vrReportCategoryModelImpl);

		vrReportCategory.resetOriginalValues();

		return vrReportCategory;
	}

	protected VRReportCategory toUnwrappedModel(
		VRReportCategory vrReportCategory) {
		if (vrReportCategory instanceof VRReportCategoryImpl) {
			return vrReportCategory;
		}

		VRReportCategoryImpl vrReportCategoryImpl = new VRReportCategoryImpl();

		vrReportCategoryImpl.setNew(vrReportCategory.isNew());
		vrReportCategoryImpl.setPrimaryKey(vrReportCategory.getPrimaryKey());

		vrReportCategoryImpl.setId(vrReportCategory.getId());
		vrReportCategoryImpl.setRptCode(vrReportCategory.getRptCode());
		vrReportCategoryImpl.setRptName(vrReportCategory.getRptName());
		vrReportCategoryImpl.setRptDescription(vrReportCategory.getRptDescription());
		vrReportCategoryImpl.setRptGroup(vrReportCategory.getRptGroup());
		vrReportCategoryImpl.setRptLevel(vrReportCategory.getRptLevel());
		vrReportCategoryImpl.setSequenceNo(vrReportCategory.getSequenceNo());
		vrReportCategoryImpl.setJasperFileTemplate(vrReportCategory.getJasperFileTemplate());
		vrReportCategoryImpl.setExcelFileTemplate(vrReportCategory.getExcelFileTemplate());
		vrReportCategoryImpl.setModifiedDate(vrReportCategory.getModifiedDate());

		return vrReportCategoryImpl;
	}

	/**
	 * Returns the vr report category with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr report category
	 * @return the vr report category
	 * @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	 */
	@Override
	public VRReportCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRReportCategoryException {
		VRReportCategory vrReportCategory = fetchByPrimaryKey(primaryKey);

		if (vrReportCategory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRReportCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrReportCategory;
	}

	/**
	 * Returns the vr report category with the primary key or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	 *
	 * @param id the primary key of the vr report category
	 * @return the vr report category
	 * @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	 */
	@Override
	public VRReportCategory findByPrimaryKey(int id)
		throws NoSuchVRReportCategoryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr report category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr report category
	 * @return the vr report category, or <code>null</code> if a vr report category with the primary key could not be found
	 */
	@Override
	public VRReportCategory fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
				VRReportCategoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRReportCategory vrReportCategory = (VRReportCategory)serializable;

		if (vrReportCategory == null) {
			Session session = null;

			try {
				session = openSession();

				vrReportCategory = (VRReportCategory)session.get(VRReportCategoryImpl.class,
						primaryKey);

				if (vrReportCategory != null) {
					cacheResult(vrReportCategory);
				}
				else {
					entityCache.putResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
						VRReportCategoryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
					VRReportCategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrReportCategory;
	}

	/**
	 * Returns the vr report category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr report category
	 * @return the vr report category, or <code>null</code> if a vr report category with the primary key could not be found
	 */
	@Override
	public VRReportCategory fetchByPrimaryKey(int id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRReportCategory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRReportCategory> map = new HashMap<Serializable, VRReportCategory>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRReportCategory vrReportCategory = fetchByPrimaryKey(primaryKey);

			if (vrReportCategory != null) {
				map.put(primaryKey, vrReportCategory);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
					VRReportCategoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRReportCategory)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRREPORTCATEGORY_WHERE_PKS_IN);

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

			for (VRReportCategory vrReportCategory : (List<VRReportCategory>)q.list()) {
				map.put(vrReportCategory.getPrimaryKeyObj(), vrReportCategory);

				cacheResult(vrReportCategory);

				uncachedPrimaryKeys.remove(vrReportCategory.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
					VRReportCategoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr report categories.
	 *
	 * @return the vr report categories
	 */
	@Override
	public List<VRReportCategory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr report categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @return the range of vr report categories
	 */
	@Override
	public List<VRReportCategory> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr report categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr report categories
	 */
	@Override
	public List<VRReportCategory> findAll(int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr report categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr report categories
	 * @param end the upper bound of the range of vr report categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr report categories
	 */
	@Override
	public List<VRReportCategory> findAll(int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator,
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

		List<VRReportCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VRReportCategory>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRREPORTCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRREPORTCATEGORY;

				if (pagination) {
					sql = sql.concat(VRReportCategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRReportCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRReportCategory>)QueryUtil.list(q,
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
	 * Removes all the vr report categories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRReportCategory vrReportCategory : findAll()) {
			remove(vrReportCategory);
		}
	}

	/**
	 * Returns the number of vr report categories.
	 *
	 * @return the number of vr report categories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRREPORTCATEGORY);

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
		return VRReportCategoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr report category persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRReportCategoryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRREPORTCATEGORY = "SELECT vrReportCategory FROM VRReportCategory vrReportCategory";
	private static final String _SQL_SELECT_VRREPORTCATEGORY_WHERE_PKS_IN = "SELECT vrReportCategory FROM VRReportCategory vrReportCategory WHERE id IN (";
	private static final String _SQL_SELECT_VRREPORTCATEGORY_WHERE = "SELECT vrReportCategory FROM VRReportCategory vrReportCategory WHERE ";
	private static final String _SQL_COUNT_VRREPORTCATEGORY = "SELECT COUNT(vrReportCategory) FROM VRReportCategory vrReportCategory";
	private static final String _SQL_COUNT_VRREPORTCATEGORY_WHERE = "SELECT COUNT(vrReportCategory) FROM VRReportCategory vrReportCategory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrReportCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRReportCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRReportCategory exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRReportCategoryPersistenceImpl.class);
}