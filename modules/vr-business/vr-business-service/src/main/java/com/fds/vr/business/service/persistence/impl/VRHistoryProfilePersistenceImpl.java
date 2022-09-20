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

import com.fds.vr.business.exception.NoSuchVRHistoryProfileException;
import com.fds.vr.business.model.VRHistoryProfile;
import com.fds.vr.business.model.impl.VRHistoryProfileImpl;
import com.fds.vr.business.model.impl.VRHistoryProfileModelImpl;
import com.fds.vr.business.service.persistence.VRHistoryProfilePersistence;

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
 * The persistence implementation for the vr history profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRHistoryProfilePersistence
 * @see com.fds.vr.business.service.persistence.VRHistoryProfileUtil
 * @generated
 */
@ProviderType
public class VRHistoryProfilePersistenceImpl extends BasePersistenceImpl<VRHistoryProfile>
	implements VRHistoryProfilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRHistoryProfileUtil} to access the vr history profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRHistoryProfileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APPLICANTCODE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_ApplicantCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPLICANTCODE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_ApplicantCode",
			new String[] { String.class.getName() },
			VRHistoryProfileModelImpl.APPLICANTCODE_COLUMN_BITMASK |
			VRHistoryProfileModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_APPLICANTCODE = new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_ApplicantCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr history profiles where applicantCode = &#63;.
	 *
	 * @param applicantCode the applicant code
	 * @return the matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ApplicantCode(String applicantCode) {
		return findByF_ApplicantCode(applicantCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr history profiles where applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @return the range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ApplicantCode(String applicantCode,
		int start, int end) {
		return findByF_ApplicantCode(applicantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ApplicantCode(String applicantCode,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return findByF_ApplicantCode(applicantCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ApplicantCode(String applicantCode,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPLICANTCODE;
			finderArgs = new Object[] { applicantCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APPLICANTCODE;
			finderArgs = new Object[] {
					applicantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRHistoryProfile> list = null;

		if (retrieveFromCache) {
			list = (List<VRHistoryProfile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRHistoryProfile vrHistoryProfile : list) {
					if (!Objects.equals(applicantCode,
								vrHistoryProfile.getApplicantCode())) {
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

			query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantCode) {
					qPos.add(applicantCode);
				}

				if (!pagination) {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
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
	 * Returns the first vr history profile in the ordered set where applicantCode = &#63;.
	 *
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_ApplicantCode_First(String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_ApplicantCode_First(applicantCode,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantCode=");
		msg.append(applicantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the first vr history profile in the ordered set where applicantCode = &#63;.
	 *
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_ApplicantCode_First(String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		List<VRHistoryProfile> list = findByF_ApplicantCode(applicantCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr history profile in the ordered set where applicantCode = &#63;.
	 *
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_ApplicantCode_Last(String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_ApplicantCode_Last(applicantCode,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantCode=");
		msg.append(applicantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the last vr history profile in the ordered set where applicantCode = &#63;.
	 *
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_ApplicantCode_Last(String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		int count = countByF_ApplicantCode(applicantCode);

		if (count == 0) {
			return null;
		}

		List<VRHistoryProfile> list = findByF_ApplicantCode(applicantCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr history profiles before and after the current vr history profile in the ordered set where applicantCode = &#63;.
	 *
	 * @param id the primary key of the current vr history profile
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr history profile
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile[] findByF_ApplicantCode_PrevAndNext(long id,
		String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRHistoryProfile[] array = new VRHistoryProfileImpl[3];

			array[0] = getByF_ApplicantCode_PrevAndNext(session,
					vrHistoryProfile, applicantCode, orderByComparator, true);

			array[1] = vrHistoryProfile;

			array[2] = getByF_ApplicantCode_PrevAndNext(session,
					vrHistoryProfile, applicantCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRHistoryProfile getByF_ApplicantCode_PrevAndNext(
		Session session, VRHistoryProfile vrHistoryProfile,
		String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

		boolean bindApplicantCode = false;

		if (applicantCode == null) {
			query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_1);
		}
		else if (applicantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_3);
		}
		else {
			bindApplicantCode = true;

			query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_2);
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
			query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantCode) {
			qPos.add(applicantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrHistoryProfile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRHistoryProfile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr history profiles where applicantCode = &#63; from the database.
	 *
	 * @param applicantCode the applicant code
	 */
	@Override
	public void removeByF_ApplicantCode(String applicantCode) {
		for (VRHistoryProfile vrHistoryProfile : findByF_ApplicantCode(
				applicantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrHistoryProfile);
		}
	}

	/**
	 * Returns the number of vr history profiles where applicantCode = &#63;.
	 *
	 * @param applicantCode the applicant code
	 * @return the number of matching vr history profiles
	 */
	@Override
	public int countByF_ApplicantCode(String applicantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_APPLICANTCODE;

		Object[] finderArgs = new Object[] { applicantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRHISTORYPROFILE_WHERE);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantCode) {
					qPos.add(applicantCode);
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

	private static final String _FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_1 = "vrHistoryProfile.applicantCode IS NULL";
	private static final String _FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_2 = "vrHistoryProfile.applicantCode = ?";
	private static final String _FINDER_COLUMN_F_APPLICANTCODE_APPLICANTCODE_3 = "(vrHistoryProfile.applicantCode IS NULL OR vrHistoryProfile.applicantCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_PRODUCTIONPLANTCODE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_ProductionPlantCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PRODUCTIONPLANTCODE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_ProductionPlantCode",
			new String[] { String.class.getName() },
			VRHistoryProfileModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRHistoryProfileModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE = new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_ProductionPlantCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr history profiles where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ProductionPlantCode(
		String productionPlantCode) {
		return findByF_ProductionPlantCode(productionPlantCode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr history profiles where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @return the range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ProductionPlantCode(
		String productionPlantCode, int start, int end) {
		return findByF_ProductionPlantCode(productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ProductionPlantCode(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return findByF_ProductionPlantCode(productionPlantCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ProductionPlantCode(
		String productionPlantCode, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] { productionPlantCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					productionPlantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRHistoryProfile> list = null;

		if (retrieveFromCache) {
			list = (List<VRHistoryProfile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRHistoryProfile vrHistoryProfile : list) {
					if (!Objects.equals(productionPlantCode,
								vrHistoryProfile.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (!pagination) {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
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
	 * Returns the first vr history profile in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_ProductionPlantCode_First(
		String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_ProductionPlantCode_First(productionPlantCode,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the first vr history profile in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_ProductionPlantCode_First(
		String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		List<VRHistoryProfile> list = findByF_ProductionPlantCode(productionPlantCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr history profile in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_ProductionPlantCode_Last(
		String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_ProductionPlantCode_Last(productionPlantCode,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the last vr history profile in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_ProductionPlantCode_Last(
		String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		int count = countByF_ProductionPlantCode(productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRHistoryProfile> list = findByF_ProductionPlantCode(productionPlantCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr history profiles before and after the current vr history profile in the ordered set where productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vr history profile
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr history profile
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile[] findByF_ProductionPlantCode_PrevAndNext(long id,
		String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRHistoryProfile[] array = new VRHistoryProfileImpl[3];

			array[0] = getByF_ProductionPlantCode_PrevAndNext(session,
					vrHistoryProfile, productionPlantCode, orderByComparator,
					true);

			array[1] = vrHistoryProfile;

			array[2] = getByF_ProductionPlantCode_PrevAndNext(session,
					vrHistoryProfile, productionPlantCode, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRHistoryProfile getByF_ProductionPlantCode_PrevAndNext(
		Session session, VRHistoryProfile vrHistoryProfile,
		String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
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
			query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrHistoryProfile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRHistoryProfile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr history profiles where productionPlantCode = &#63; from the database.
	 *
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByF_ProductionPlantCode(String productionPlantCode) {
		for (VRHistoryProfile vrHistoryProfile : findByF_ProductionPlantCode(
				productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrHistoryProfile);
		}
	}

	/**
	 * Returns the number of vr history profiles where productionPlantCode = &#63;.
	 *
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vr history profiles
	 */
	@Override
	public int countByF_ProductionPlantCode(String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE;

		Object[] finderArgs = new Object[] { productionPlantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRHISTORYPROFILE_WHERE);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
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

	private static final String _FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1 =
		"vrHistoryProfile.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2 =
		"vrHistoryProfile.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_F_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3 =
		"(vrHistoryProfile.productionPlantCode IS NULL OR vrHistoryProfile.productionPlantCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOSSIERID =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERID =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_DossierId",
			new String[] { Long.class.getName() },
			VRHistoryProfileModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRHistoryProfileModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DOSSIERID = new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr history profiles where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_DossierId(long dossierId) {
		return findByF_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr history profiles where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @return the range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_DossierId(long dossierId, int start,
		int end) {
		return findByF_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_DossierId(long dossierId, int start,
		int end, OrderByComparator<VRHistoryProfile> orderByComparator) {
		return findByF_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_DossierId(long dossierId, int start,
		int end, OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERID;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOSSIERID;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<VRHistoryProfile> list = null;

		if (retrieveFromCache) {
			list = (List<VRHistoryProfile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRHistoryProfile vrHistoryProfile : list) {
					if ((dossierId != vrHistoryProfile.getDossierId())) {
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

			query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

			query.append(_FINDER_COLUMN_F_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
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
	 * Returns the first vr history profile in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_DossierId_First(long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_DossierId_First(dossierId,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the first vr history profile in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_DossierId_First(long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		List<VRHistoryProfile> list = findByF_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr history profile in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_DossierId_Last(long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_DossierId_Last(dossierId,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the last vr history profile in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_DossierId_Last(long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		int count = countByF_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRHistoryProfile> list = findByF_DossierId(dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr history profiles before and after the current vr history profile in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr history profile
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr history profile
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile[] findByF_DossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRHistoryProfile[] array = new VRHistoryProfileImpl[3];

			array[0] = getByF_DossierId_PrevAndNext(session, vrHistoryProfile,
					dossierId, orderByComparator, true);

			array[1] = vrHistoryProfile;

			array[2] = getByF_DossierId_PrevAndNext(session, vrHistoryProfile,
					dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRHistoryProfile getByF_DossierId_PrevAndNext(Session session,
		VRHistoryProfile vrHistoryProfile, long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

		query.append(_FINDER_COLUMN_F_DOSSIERID_DOSSIERID_2);

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
			query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrHistoryProfile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRHistoryProfile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr history profiles where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeByF_DossierId(long dossierId) {
		for (VRHistoryProfile vrHistoryProfile : findByF_DossierId(dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrHistoryProfile);
		}
	}

	/**
	 * Returns the number of vr history profiles where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr history profiles
	 */
	@Override
	public int countByF_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRHISTORYPROFILE_WHERE);

			query.append(_FINDER_COLUMN_F_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

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

	private static final String _FINDER_COLUMN_F_DOSSIERID_DOSSIERID_2 = "vrHistoryProfile.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOSSIERIDCTN =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_dossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_dossierIdCTN",
			new String[] { String.class.getName() },
			VRHistoryProfileModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRHistoryProfileModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN = new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_dossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr history profiles where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_dossierIdCTN(String dossierIdCTN) {
		return findByF_dossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr history profiles where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @return the range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_dossierIdCTN(String dossierIdCTN,
		int start, int end) {
		return findByF_dossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_dossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return findByF_dossierIdCTN(dossierIdCTN, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_dossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN;
			finderArgs = new Object[] { dossierIdCTN };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOSSIERIDCTN;
			finderArgs = new Object[] {
					dossierIdCTN,
					
					start, end, orderByComparator
				};
		}

		List<VRHistoryProfile> list = null;

		if (retrieveFromCache) {
			list = (List<VRHistoryProfile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRHistoryProfile vrHistoryProfile : list) {
					if (!Objects.equals(dossierIdCTN,
								vrHistoryProfile.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
				}

				if (!pagination) {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
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
	 * Returns the first vr history profile in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_dossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_dossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the first vr history profile in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_dossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		List<VRHistoryProfile> list = findByF_dossierIdCTN(dossierIdCTN, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr history profile in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_dossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_dossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the last vr history profile in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_dossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		int count = countByF_dossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRHistoryProfile> list = findByF_dossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr history profiles before and after the current vr history profile in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr history profile
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr history profile
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile[] findByF_dossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRHistoryProfile[] array = new VRHistoryProfileImpl[3];

			array[0] = getByF_dossierIdCTN_PrevAndNext(session,
					vrHistoryProfile, dossierIdCTN, orderByComparator, true);

			array[1] = vrHistoryProfile;

			array[2] = getByF_dossierIdCTN_PrevAndNext(session,
					vrHistoryProfile, dossierIdCTN, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRHistoryProfile getByF_dossierIdCTN_PrevAndNext(
		Session session, VRHistoryProfile vrHistoryProfile,
		String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

		boolean bindDossierIdCTN = false;

		if (dossierIdCTN == null) {
			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_1);
		}
		else if (dossierIdCTN.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_3);
		}
		else {
			bindDossierIdCTN = true;

			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_2);
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
			query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierIdCTN) {
			qPos.add(dossierIdCTN);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrHistoryProfile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRHistoryProfile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr history profiles where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByF_dossierIdCTN(String dossierIdCTN) {
		for (VRHistoryProfile vrHistoryProfile : findByF_dossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrHistoryProfile);
		}
	}

	/**
	 * Returns the number of vr history profiles where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr history profiles
	 */
	@Override
	public int countByF_dossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRHISTORYPROFILE_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
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

	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrHistoryProfile.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrHistoryProfile.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrHistoryProfile.dossierIdCTN IS NULL OR vrHistoryProfile.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_dossierIdCTN_contentFileTemplate",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_dossierIdCTN_contentFileTemplate",
			new String[] { String.class.getName(), String.class.getName() },
			VRHistoryProfileModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRHistoryProfileModelImpl.CONTENTFILETEMPLATE_COLUMN_BITMASK |
			VRHistoryProfileModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_dossierIdCTN_contentFileTemplate",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @return the matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		String dossierIdCTN, String contentFileTemplate) {
		return findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @return the range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		String dossierIdCTN, String contentFileTemplate, int start, int end) {
		return findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		String dossierIdCTN, String contentFileTemplate, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		String dossierIdCTN, String contentFileTemplate, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE;
			finderArgs = new Object[] { dossierIdCTN, contentFileTemplate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE;
			finderArgs = new Object[] {
					dossierIdCTN, contentFileTemplate,
					
					start, end, orderByComparator
				};
		}

		List<VRHistoryProfile> list = null;

		if (retrieveFromCache) {
			list = (List<VRHistoryProfile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRHistoryProfile vrHistoryProfile : list) {
					if (!Objects.equals(dossierIdCTN,
								vrHistoryProfile.getDossierIdCTN()) ||
							!Objects.equals(contentFileTemplate,
								vrHistoryProfile.getContentFileTemplate())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_2);
			}

			boolean bindContentFileTemplate = false;

			if (contentFileTemplate == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1);
			}
			else if (contentFileTemplate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3);
			}
			else {
				bindContentFileTemplate = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
				}

				if (bindContentFileTemplate) {
					qPos.add(contentFileTemplate);
				}

				if (!pagination) {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
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
	 * Returns the first vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_dossierIdCTN_contentFileTemplate_First(
		String dossierIdCTN, String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_dossierIdCTN_contentFileTemplate_First(dossierIdCTN,
				contentFileTemplate, orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(", contentFileTemplate=");
		msg.append(contentFileTemplate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the first vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_dossierIdCTN_contentFileTemplate_First(
		String dossierIdCTN, String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		List<VRHistoryProfile> list = findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
				contentFileTemplate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_dossierIdCTN_contentFileTemplate_Last(
		String dossierIdCTN, String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_dossierIdCTN_contentFileTemplate_Last(dossierIdCTN,
				contentFileTemplate, orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(", contentFileTemplate=");
		msg.append(contentFileTemplate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the last vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_dossierIdCTN_contentFileTemplate_Last(
		String dossierIdCTN, String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		int count = countByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
				contentFileTemplate);

		if (count == 0) {
			return null;
		}

		List<VRHistoryProfile> list = findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
				contentFileTemplate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr history profiles before and after the current vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param id the primary key of the current vr history profile
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr history profile
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile[] findByF_dossierIdCTN_contentFileTemplate_PrevAndNext(
		long id, String dossierIdCTN, String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRHistoryProfile[] array = new VRHistoryProfileImpl[3];

			array[0] = getByF_dossierIdCTN_contentFileTemplate_PrevAndNext(session,
					vrHistoryProfile, dossierIdCTN, contentFileTemplate,
					orderByComparator, true);

			array[1] = vrHistoryProfile;

			array[2] = getByF_dossierIdCTN_contentFileTemplate_PrevAndNext(session,
					vrHistoryProfile, dossierIdCTN, contentFileTemplate,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRHistoryProfile getByF_dossierIdCTN_contentFileTemplate_PrevAndNext(
		Session session, VRHistoryProfile vrHistoryProfile,
		String dossierIdCTN, String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

		boolean bindDossierIdCTN = false;

		if (dossierIdCTN == null) {
			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_1);
		}
		else if (dossierIdCTN.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_3);
		}
		else {
			bindDossierIdCTN = true;

			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_2);
		}

		boolean bindContentFileTemplate = false;

		if (contentFileTemplate == null) {
			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1);
		}
		else if (contentFileTemplate.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3);
		}
		else {
			bindContentFileTemplate = true;

			query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2);
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
			query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierIdCTN) {
			qPos.add(dossierIdCTN);
		}

		if (bindContentFileTemplate) {
			qPos.add(contentFileTemplate);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrHistoryProfile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRHistoryProfile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 */
	@Override
	public void removeByF_dossierIdCTN_contentFileTemplate(
		String dossierIdCTN, String contentFileTemplate) {
		for (VRHistoryProfile vrHistoryProfile : findByF_dossierIdCTN_contentFileTemplate(
				dossierIdCTN, contentFileTemplate, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrHistoryProfile);
		}
	}

	/**
	 * Returns the number of vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param contentFileTemplate the content file template
	 * @return the number of matching vr history profiles
	 */
	@Override
	public int countByF_dossierIdCTN_contentFileTemplate(String dossierIdCTN,
		String contentFileTemplate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE;

		Object[] finderArgs = new Object[] { dossierIdCTN, contentFileTemplate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRHISTORYPROFILE_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_2);
			}

			boolean bindContentFileTemplate = false;

			if (contentFileTemplate == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1);
			}
			else if (contentFileTemplate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3);
			}
			else {
				bindContentFileTemplate = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
				}

				if (bindContentFileTemplate) {
					qPos.add(contentFileTemplate);
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

	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_1 =
		"vrHistoryProfile.dossierIdCTN IS NULL AND ";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_2 =
		"vrHistoryProfile.dossierIdCTN = ? AND ";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_DOSSIERIDCTN_3 =
		"(vrHistoryProfile.dossierIdCTN IS NULL OR vrHistoryProfile.dossierIdCTN = '') AND ";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_1 =
		"vrHistoryProfile.contentFileTemplate IS NULL";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_2 =
		"vrHistoryProfile.contentFileTemplate = ?";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_CONTENTFILETEMPLATE_CONTENTFILETEMPLATE_3 =
		"(vrHistoryProfile.contentFileTemplate IS NULL OR vrHistoryProfile.contentFileTemplate = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_CONTENTTYPE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_ContentType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE =
		new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED,
			VRHistoryProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_ContentType",
			new String[] { String.class.getName() },
			VRHistoryProfileModelImpl.CONTENTTYPE_COLUMN_BITMASK |
			VRHistoryProfileModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_CONTENTTYPE = new FinderPath(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_ContentType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr history profiles where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @return the matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ContentType(String contentType) {
		return findByF_ContentType(contentType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr history profiles where contentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contentType the content type
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @return the range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ContentType(String contentType,
		int start, int end) {
		return findByF_ContentType(contentType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where contentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contentType the content type
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ContentType(String contentType,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return findByF_ContentType(contentType, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr history profiles where contentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contentType the content type
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findByF_ContentType(String contentType,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE;
			finderArgs = new Object[] { contentType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_CONTENTTYPE;
			finderArgs = new Object[] { contentType, start, end, orderByComparator };
		}

		List<VRHistoryProfile> list = null;

		if (retrieveFromCache) {
			list = (List<VRHistoryProfile>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRHistoryProfile vrHistoryProfile : list) {
					if (!Objects.equals(contentType,
								vrHistoryProfile.getContentType())) {
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

			query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

			boolean bindContentType = false;

			if (contentType == null) {
				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_1);
			}
			else if (contentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_3);
			}
			else {
				bindContentType = true;

				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContentType) {
					qPos.add(contentType);
				}

				if (!pagination) {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
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
	 * Returns the first vr history profile in the ordered set where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_ContentType_First(String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_ContentType_First(contentType,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contentType=");
		msg.append(contentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the first vr history profile in the ordered set where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_ContentType_First(String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		List<VRHistoryProfile> list = findByF_ContentType(contentType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr history profile in the ordered set where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile
	 * @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile findByF_ContentType_Last(String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByF_ContentType_Last(contentType,
				orderByComparator);

		if (vrHistoryProfile != null) {
			return vrHistoryProfile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contentType=");
		msg.append(contentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRHistoryProfileException(msg.toString());
	}

	/**
	 * Returns the last vr history profile in the ordered set where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	 */
	@Override
	public VRHistoryProfile fetchByF_ContentType_Last(String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		int count = countByF_ContentType(contentType);

		if (count == 0) {
			return null;
		}

		List<VRHistoryProfile> list = findByF_ContentType(contentType,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr history profiles before and after the current vr history profile in the ordered set where contentType = &#63;.
	 *
	 * @param id the primary key of the current vr history profile
	 * @param contentType the content type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr history profile
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile[] findByF_ContentType_PrevAndNext(long id,
		String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRHistoryProfile[] array = new VRHistoryProfileImpl[3];

			array[0] = getByF_ContentType_PrevAndNext(session,
					vrHistoryProfile, contentType, orderByComparator, true);

			array[1] = vrHistoryProfile;

			array[2] = getByF_ContentType_PrevAndNext(session,
					vrHistoryProfile, contentType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRHistoryProfile getByF_ContentType_PrevAndNext(Session session,
		VRHistoryProfile vrHistoryProfile, String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE);

		boolean bindContentType = false;

		if (contentType == null) {
			query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_1);
		}
		else if (contentType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_3);
		}
		else {
			bindContentType = true;

			query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_2);
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
			query.append(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindContentType) {
			qPos.add(contentType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrHistoryProfile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRHistoryProfile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr history profiles where contentType = &#63; from the database.
	 *
	 * @param contentType the content type
	 */
	@Override
	public void removeByF_ContentType(String contentType) {
		for (VRHistoryProfile vrHistoryProfile : findByF_ContentType(
				contentType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrHistoryProfile);
		}
	}

	/**
	 * Returns the number of vr history profiles where contentType = &#63;.
	 *
	 * @param contentType the content type
	 * @return the number of matching vr history profiles
	 */
	@Override
	public int countByF_ContentType(String contentType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_CONTENTTYPE;

		Object[] finderArgs = new Object[] { contentType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRHISTORYPROFILE_WHERE);

			boolean bindContentType = false;

			if (contentType == null) {
				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_1);
			}
			else if (contentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_3);
			}
			else {
				bindContentType = true;

				query.append(_FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContentType) {
					qPos.add(contentType);
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

	private static final String _FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_1 = "vrHistoryProfile.contentType IS NULL";
	private static final String _FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_2 = "vrHistoryProfile.contentType = ?";
	private static final String _FINDER_COLUMN_F_CONTENTTYPE_CONTENTTYPE_3 = "(vrHistoryProfile.contentType IS NULL OR vrHistoryProfile.contentType = '')";

	public VRHistoryProfilePersistenceImpl() {
		setModelClass(VRHistoryProfile.class);
	}

	/**
	 * Caches the vr history profile in the entity cache if it is enabled.
	 *
	 * @param vrHistoryProfile the vr history profile
	 */
	@Override
	public void cacheResult(VRHistoryProfile vrHistoryProfile) {
		entityCache.putResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileImpl.class, vrHistoryProfile.getPrimaryKey(),
			vrHistoryProfile);

		vrHistoryProfile.resetOriginalValues();
	}

	/**
	 * Caches the vr history profiles in the entity cache if it is enabled.
	 *
	 * @param vrHistoryProfiles the vr history profiles
	 */
	@Override
	public void cacheResult(List<VRHistoryProfile> vrHistoryProfiles) {
		for (VRHistoryProfile vrHistoryProfile : vrHistoryProfiles) {
			if (entityCache.getResult(
						VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
						VRHistoryProfileImpl.class,
						vrHistoryProfile.getPrimaryKey()) == null) {
				cacheResult(vrHistoryProfile);
			}
			else {
				vrHistoryProfile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr history profiles.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRHistoryProfileImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr history profile.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRHistoryProfile vrHistoryProfile) {
		entityCache.removeResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileImpl.class, vrHistoryProfile.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRHistoryProfile> vrHistoryProfiles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRHistoryProfile vrHistoryProfile : vrHistoryProfiles) {
			entityCache.removeResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
				VRHistoryProfileImpl.class, vrHistoryProfile.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr history profile with the primary key. Does not add the vr history profile to the database.
	 *
	 * @param id the primary key for the new vr history profile
	 * @return the new vr history profile
	 */
	@Override
	public VRHistoryProfile create(long id) {
		VRHistoryProfile vrHistoryProfile = new VRHistoryProfileImpl();

		vrHistoryProfile.setNew(true);
		vrHistoryProfile.setPrimaryKey(id);

		return vrHistoryProfile;
	}

	/**
	 * Removes the vr history profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr history profile
	 * @return the vr history profile that was removed
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile remove(long id)
		throws NoSuchVRHistoryProfileException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr history profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr history profile
	 * @return the vr history profile that was removed
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile remove(Serializable primaryKey)
		throws NoSuchVRHistoryProfileException {
		Session session = null;

		try {
			session = openSession();

			VRHistoryProfile vrHistoryProfile = (VRHistoryProfile)session.get(VRHistoryProfileImpl.class,
					primaryKey);

			if (vrHistoryProfile == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRHistoryProfileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrHistoryProfile);
		}
		catch (NoSuchVRHistoryProfileException nsee) {
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
	protected VRHistoryProfile removeImpl(VRHistoryProfile vrHistoryProfile) {
		vrHistoryProfile = toUnwrappedModel(vrHistoryProfile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrHistoryProfile)) {
				vrHistoryProfile = (VRHistoryProfile)session.get(VRHistoryProfileImpl.class,
						vrHistoryProfile.getPrimaryKeyObj());
			}

			if (vrHistoryProfile != null) {
				session.delete(vrHistoryProfile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrHistoryProfile != null) {
			clearCache(vrHistoryProfile);
		}

		return vrHistoryProfile;
	}

	@Override
	public VRHistoryProfile updateImpl(VRHistoryProfile vrHistoryProfile) {
		vrHistoryProfile = toUnwrappedModel(vrHistoryProfile);

		boolean isNew = vrHistoryProfile.isNew();

		VRHistoryProfileModelImpl vrHistoryProfileModelImpl = (VRHistoryProfileModelImpl)vrHistoryProfile;

		Session session = null;

		try {
			session = openSession();

			if (vrHistoryProfile.isNew()) {
				session.save(vrHistoryProfile);

				vrHistoryProfile.setNew(false);
			}
			else {
				vrHistoryProfile = (VRHistoryProfile)session.merge(vrHistoryProfile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRHistoryProfileModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrHistoryProfileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPLICANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrHistoryProfileModelImpl.getOriginalApplicantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APPLICANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPLICANTCODE,
					args);

				args = new Object[] { vrHistoryProfileModelImpl.getApplicantCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APPLICANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APPLICANTCODE,
					args);
			}

			if ((vrHistoryProfileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PRODUCTIONPLANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrHistoryProfileModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PRODUCTIONPLANTCODE,
					args);

				args = new Object[] {
						vrHistoryProfileModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_PRODUCTIONPLANTCODE,
					args);
			}

			if ((vrHistoryProfileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrHistoryProfileModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERID,
					args);

				args = new Object[] { vrHistoryProfileModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERID,
					args);
			}

			if ((vrHistoryProfileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrHistoryProfileModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN,
					args);

				args = new Object[] { vrHistoryProfileModelImpl.getDossierIdCTN() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN,
					args);
			}

			if ((vrHistoryProfileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrHistoryProfileModelImpl.getOriginalDossierIdCTN(),
						vrHistoryProfileModelImpl.getOriginalContentFileTemplate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
					args);

				args = new Object[] {
						vrHistoryProfileModelImpl.getDossierIdCTN(),
						vrHistoryProfileModelImpl.getContentFileTemplate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_DOSSIERIDCTN_CONTENTFILETEMPLATE,
					args);
			}

			if ((vrHistoryProfileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrHistoryProfileModelImpl.getOriginalContentType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_CONTENTTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE,
					args);

				args = new Object[] { vrHistoryProfileModelImpl.getContentType() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_CONTENTTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_CONTENTTYPE,
					args);
			}
		}

		entityCache.putResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRHistoryProfileImpl.class, vrHistoryProfile.getPrimaryKey(),
			vrHistoryProfile, false);

		vrHistoryProfile.resetOriginalValues();

		return vrHistoryProfile;
	}

	protected VRHistoryProfile toUnwrappedModel(
		VRHistoryProfile vrHistoryProfile) {
		if (vrHistoryProfile instanceof VRHistoryProfileImpl) {
			return vrHistoryProfile;
		}

		VRHistoryProfileImpl vrHistoryProfileImpl = new VRHistoryProfileImpl();

		vrHistoryProfileImpl.setNew(vrHistoryProfile.isNew());
		vrHistoryProfileImpl.setPrimaryKey(vrHistoryProfile.getPrimaryKey());

		vrHistoryProfileImpl.setId(vrHistoryProfile.getId());
		vrHistoryProfileImpl.setApplicantCode(vrHistoryProfile.getApplicantCode());
		vrHistoryProfileImpl.setProductionPlantCode(vrHistoryProfile.getProductionPlantCode());
		vrHistoryProfileImpl.setContentType(vrHistoryProfile.getContentType());
		vrHistoryProfileImpl.setContentFileTemplate(vrHistoryProfile.getContentFileTemplate());
		vrHistoryProfileImpl.setContentFileEntryId(vrHistoryProfile.getContentFileEntryId());
		vrHistoryProfileImpl.setContentjsonFileEntryId(vrHistoryProfile.getContentjsonFileEntryId());
		vrHistoryProfileImpl.setDossierId(vrHistoryProfile.getDossierId());
		vrHistoryProfileImpl.setDossierIdCTN(vrHistoryProfile.getDossierIdCTN());
		vrHistoryProfileImpl.setDossierNo(vrHistoryProfile.getDossierNo());
		vrHistoryProfileImpl.setModifyUserId(vrHistoryProfile.getModifyUserId());
		vrHistoryProfileImpl.setCreatedDate(vrHistoryProfile.getCreatedDate());
		vrHistoryProfileImpl.setModifyDate(vrHistoryProfile.getModifyDate());
		vrHistoryProfileImpl.setSyncDate(vrHistoryProfile.getSyncDate());

		return vrHistoryProfileImpl;
	}

	/**
	 * Returns the vr history profile with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr history profile
	 * @return the vr history profile
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRHistoryProfileException {
		VRHistoryProfile vrHistoryProfile = fetchByPrimaryKey(primaryKey);

		if (vrHistoryProfile == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRHistoryProfileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrHistoryProfile;
	}

	/**
	 * Returns the vr history profile with the primary key or throws a {@link NoSuchVRHistoryProfileException} if it could not be found.
	 *
	 * @param id the primary key of the vr history profile
	 * @return the vr history profile
	 * @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile findByPrimaryKey(long id)
		throws NoSuchVRHistoryProfileException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr history profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr history profile
	 * @return the vr history profile, or <code>null</code> if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
				VRHistoryProfileImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRHistoryProfile vrHistoryProfile = (VRHistoryProfile)serializable;

		if (vrHistoryProfile == null) {
			Session session = null;

			try {
				session = openSession();

				vrHistoryProfile = (VRHistoryProfile)session.get(VRHistoryProfileImpl.class,
						primaryKey);

				if (vrHistoryProfile != null) {
					cacheResult(vrHistoryProfile);
				}
				else {
					entityCache.putResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
						VRHistoryProfileImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
					VRHistoryProfileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrHistoryProfile;
	}

	/**
	 * Returns the vr history profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr history profile
	 * @return the vr history profile, or <code>null</code> if a vr history profile with the primary key could not be found
	 */
	@Override
	public VRHistoryProfile fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRHistoryProfile> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRHistoryProfile> map = new HashMap<Serializable, VRHistoryProfile>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRHistoryProfile vrHistoryProfile = fetchByPrimaryKey(primaryKey);

			if (vrHistoryProfile != null) {
				map.put(primaryKey, vrHistoryProfile);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
					VRHistoryProfileImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRHistoryProfile)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRHISTORYPROFILE_WHERE_PKS_IN);

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

			for (VRHistoryProfile vrHistoryProfile : (List<VRHistoryProfile>)q.list()) {
				map.put(vrHistoryProfile.getPrimaryKeyObj(), vrHistoryProfile);

				cacheResult(vrHistoryProfile);

				uncachedPrimaryKeys.remove(vrHistoryProfile.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRHistoryProfileModelImpl.ENTITY_CACHE_ENABLED,
					VRHistoryProfileImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr history profiles.
	 *
	 * @return the vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr history profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @return the range of vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr history profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findAll(int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr history profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr history profiles
	 * @param end the upper bound of the range of vr history profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr history profiles
	 */
	@Override
	public List<VRHistoryProfile> findAll(int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
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

		List<VRHistoryProfile> list = null;

		if (retrieveFromCache) {
			list = (List<VRHistoryProfile>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRHISTORYPROFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRHISTORYPROFILE;

				if (pagination) {
					sql = sql.concat(VRHistoryProfileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRHistoryProfile>)QueryUtil.list(q,
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
	 * Removes all the vr history profiles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRHistoryProfile vrHistoryProfile : findAll()) {
			remove(vrHistoryProfile);
		}
	}

	/**
	 * Returns the number of vr history profiles.
	 *
	 * @return the number of vr history profiles
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRHISTORYPROFILE);

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
		return VRHistoryProfileModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr history profile persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRHistoryProfileImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRHISTORYPROFILE = "SELECT vrHistoryProfile FROM VRHistoryProfile vrHistoryProfile";
	private static final String _SQL_SELECT_VRHISTORYPROFILE_WHERE_PKS_IN = "SELECT vrHistoryProfile FROM VRHistoryProfile vrHistoryProfile WHERE id IN (";
	private static final String _SQL_SELECT_VRHISTORYPROFILE_WHERE = "SELECT vrHistoryProfile FROM VRHistoryProfile vrHistoryProfile WHERE ";
	private static final String _SQL_COUNT_VRHISTORYPROFILE = "SELECT COUNT(vrHistoryProfile) FROM VRHistoryProfile vrHistoryProfile";
	private static final String _SQL_COUNT_VRHISTORYPROFILE_WHERE = "SELECT COUNT(vrHistoryProfile) FROM VRHistoryProfile vrHistoryProfile WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrHistoryProfile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRHistoryProfile exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRHistoryProfile exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRHistoryProfilePersistenceImpl.class);
}