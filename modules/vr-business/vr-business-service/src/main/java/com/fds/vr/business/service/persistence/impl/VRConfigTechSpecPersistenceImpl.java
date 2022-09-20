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

import com.fds.vr.business.exception.NoSuchVRConfigTechSpecException;
import com.fds.vr.business.model.VRConfigTechSpec;
import com.fds.vr.business.model.impl.VRConfigTechSpecImpl;
import com.fds.vr.business.model.impl.VRConfigTechSpecModelImpl;
import com.fds.vr.business.service.persistence.VRConfigTechSpecPersistence;

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
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vr config tech spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRConfigTechSpecPersistence
 * @see com.fds.vr.business.service.persistence.VRConfigTechSpecUtil
 * @generated
 */
@ProviderType
public class VRConfigTechSpecPersistenceImpl extends BasePersistenceImpl<VRConfigTechSpec>
	implements VRConfigTechSpecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRConfigTechSpecUtil} to access the vr config tech spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRConfigTechSpecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVC_VT_SC",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC =
		new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByVC_VT_SC",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @return the matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC(String vehicleClass,
		String vehicleType, String specCategory) {
		return findByVC_VT_SC(vehicleClass, vehicleType, specCategory,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC(String vehicleClass,
		String vehicleType, String specCategory, int start, int end) {
		return findByVC_VT_SC(vehicleClass, vehicleType, specCategory, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC(String vehicleClass,
		String vehicleType, String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findByVC_VT_SC(vehicleClass, vehicleType, specCategory, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC(String vehicleClass,
		String vehicleType, String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC;
		finderArgs = new Object[] {
				vehicleClass, vehicleType, specCategory,
				
				start, end, orderByComparator
			};

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRConfigTechSpec vrConfigTechSpec : list) {
					if (!StringUtil.wildcardMatches(
								vrConfigTechSpec.getVehicleClass(),
								vehicleClass, CharPool.UNDERLINE,
								CharPool.PERCENT, CharPool.BACK_SLASH, true) ||
							!Objects.equals(vehicleType,
								vrConfigTechSpec.getVehicleType()) ||
							!StringUtil.wildcardMatches(
								vrConfigTechSpec.getSpecCategory(),
								specCategory, CharPool.UNDERLINE,
								CharPool.PERCENT, CharPool.BACK_SLASH, true)) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_2);
			}

			boolean bindVehicleType = false;

			if (vehicleType == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_1);
			}
			else if (vehicleType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_3);
			}
			else {
				bindVehicleType = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindVehicleType) {
					qPos.add(vehicleType);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
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
	 * Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_VT_SC_First(String vehicleClass,
		String vehicleType, String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_VT_SC_First(vehicleClass,
				vehicleType, specCategory, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", vehicleType=");
		msg.append(vehicleType);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_VT_SC_First(String vehicleClass,
		String vehicleType, String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		List<VRConfigTechSpec> list = findByVC_VT_SC(vehicleClass, vehicleType,
				specCategory, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_VT_SC_Last(String vehicleClass,
		String vehicleType, String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_VT_SC_Last(vehicleClass,
				vehicleType, specCategory, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", vehicleType=");
		msg.append(vehicleType);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_VT_SC_Last(String vehicleClass,
		String vehicleType, String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		int count = countByVC_VT_SC(vehicleClass, vehicleType, specCategory);

		if (count == 0) {
			return null;
		}

		List<VRConfigTechSpec> list = findByVC_VT_SC(vehicleClass, vehicleType,
				specCategory, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * @param id the primary key of the current vr config tech spec
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec[] findByVC_VT_SC_PrevAndNext(long id,
		String vehicleClass, String vehicleType, String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRConfigTechSpec[] array = new VRConfigTechSpecImpl[3];

			array[0] = getByVC_VT_SC_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, vehicleType, specCategory, orderByComparator,
					true);

			array[1] = vrConfigTechSpec;

			array[2] = getByVC_VT_SC_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, vehicleType, specCategory, orderByComparator,
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

	protected VRConfigTechSpec getByVC_VT_SC_PrevAndNext(Session session,
		VRConfigTechSpec vrConfigTechSpec, String vehicleClass,
		String vehicleType, String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_2);
		}

		boolean bindVehicleType = false;

		if (vehicleType == null) {
			query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_1);
		}
		else if (vehicleType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_3);
		}
		else {
			bindVehicleType = true;

			query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_2);
		}

		boolean bindSpecCategory = false;

		if (specCategory == null) {
			query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_1);
		}
		else if (specCategory.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_3);
		}
		else {
			bindSpecCategory = true;

			query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_2);
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
			query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindVehicleType) {
			qPos.add(vehicleType);
		}

		if (bindSpecCategory) {
			qPos.add(specCategory);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrConfigTechSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRConfigTechSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleTypes the vehicle types
	 * @param specCategory the spec category
	 * @return the matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC(String vehicleClass,
		String[] vehicleTypes, String specCategory) {
		return findByVC_VT_SC(vehicleClass, vehicleTypes, specCategory,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleTypes the vehicle types
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC(String vehicleClass,
		String[] vehicleTypes, String specCategory, int start, int end) {
		return findByVC_VT_SC(vehicleClass, vehicleTypes, specCategory, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleTypes the vehicle types
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC(String vehicleClass,
		String[] vehicleTypes, String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findByVC_VT_SC(vehicleClass, vehicleTypes, specCategory, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC(String vehicleClass,
		String[] vehicleTypes, String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		if (vehicleTypes == null) {
			vehicleTypes = new String[0];
		}
		else if (vehicleTypes.length > 1) {
			vehicleTypes = ArrayUtil.distinct(vehicleTypes,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(vehicleTypes, NULL_SAFE_STRING_COMPARATOR);
		}

		if (vehicleTypes.length == 1) {
			return findByVC_VT_SC(vehicleClass, vehicleTypes[0], specCategory,
				start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] {
					vehicleClass, StringUtil.merge(vehicleTypes), specCategory
				};
		}
		else {
			finderArgs = new Object[] {
					vehicleClass, StringUtil.merge(vehicleTypes), specCategory,
					
					start, end, orderByComparator
				};
		}

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRConfigTechSpec vrConfigTechSpec : list) {
					if (!StringUtil.wildcardMatches(
								vrConfigTechSpec.getVehicleClass(),
								vehicleClass, CharPool.UNDERLINE,
								CharPool.PERCENT, CharPool.BACK_SLASH, true) ||
							!ArrayUtil.contains(vehicleTypes,
								vrConfigTechSpec.getVehicleType()) ||
							!StringUtil.wildcardMatches(
								vrConfigTechSpec.getSpecCategory(),
								specCategory, CharPool.UNDERLINE,
								CharPool.PERCENT, CharPool.BACK_SLASH, true)) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_2);
			}

			if (vehicleTypes.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < vehicleTypes.length; i++) {
					String vehicleType = vehicleTypes[i];

					if (vehicleType == null) {
						query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_4);
					}
					else if (vehicleType.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_6);
					}
					else {
						query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_5);
					}

					if ((i + 1) < vehicleTypes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_2);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				for (String vehicleType : vehicleTypes) {
					if ((vehicleType != null) && !vehicleType.isEmpty()) {
						qPos.add(vehicleType);
					}
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 */
	@Override
	public void removeByVC_VT_SC(String vehicleClass, String vehicleType,
		String specCategory) {
		for (VRConfigTechSpec vrConfigTechSpec : findByVC_VT_SC(vehicleClass,
				vehicleType, specCategory, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @return the number of matching vr config tech specs
	 */
	@Override
	public int countByVC_VT_SC(String vehicleClass, String vehicleType,
		String specCategory) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC;

		Object[] finderArgs = new Object[] {
				vehicleClass, vehicleType, specCategory
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_2);
			}

			boolean bindVehicleType = false;

			if (vehicleType == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_1);
			}
			else if (vehicleType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_3);
			}
			else {
				bindVehicleType = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindVehicleType) {
					qPos.add(vehicleType);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
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

	/**
	 * Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleTypes the vehicle types
	 * @param specCategory the spec category
	 * @return the number of matching vr config tech specs
	 */
	@Override
	public int countByVC_VT_SC(String vehicleClass, String[] vehicleTypes,
		String specCategory) {
		if (vehicleTypes == null) {
			vehicleTypes = new String[0];
		}
		else if (vehicleTypes.length > 1) {
			vehicleTypes = ArrayUtil.distinct(vehicleTypes,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(vehicleTypes, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] {
				vehicleClass, StringUtil.merge(vehicleTypes), specCategory
			};

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_2);
			}

			if (vehicleTypes.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < vehicleTypes.length; i++) {
					String vehicleType = vehicleTypes[i];

					if (vehicleType == null) {
						query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_4);
					}
					else if (vehicleType.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_6);
					}
					else {
						query.append(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_5);
					}

					if ((i + 1) < vehicleTypes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_2);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				for (String vehicleType : vehicleTypes) {
					if ((vehicleType != null) && !vehicleType.isEmpty()) {
						qPos.add(vehicleType);
					}
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_1 = "vrConfigTechSpec.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_2 = "vrConfigTechSpec.vehicleClass LIKE ? AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLECLASS_3 = "(vrConfigTechSpec.vehicleClass IS NULL OR vrConfigTechSpec.vehicleClass LIKE '') AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_1 = "vrConfigTechSpec.vehicleType IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_2 = "vrConfigTechSpec.vehicleType = ? AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_3 = "(vrConfigTechSpec.vehicleType IS NULL OR vrConfigTechSpec.vehicleType = '') AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_4 = "(" +
		removeConjunction(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_1) + ")";
	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_5 = "(" +
		removeConjunction(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_2) + ")";
	private static final String _FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_6 = "(" +
		removeConjunction(_FINDER_COLUMN_VC_VT_SC_VEHICLETYPE_3) + ")";
	private static final String _FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_1 = "vrConfigTechSpec.specCategory IS NULL";
	private static final String _FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_2 = "vrConfigTechSpec.specCategory LIKE ?";
	private static final String _FINDER_COLUMN_VC_VT_SC_SPECCATEGORY_3 = "(vrConfigTechSpec.specCategory IS NULL OR vrConfigTechSpec.specCategory LIKE '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC_MD =
		new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVC_VT_SC_MD",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC_MD =
		new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByVC_VT_SC_MD",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @return the matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC_MD(String vehicleClass,
		String vehicleType, String specCategory, String module) {
		return findByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
			module, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC_MD(String vehicleClass,
		String vehicleType, String specCategory, String module, int start,
		int end) {
		return findByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
			module, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC_MD(String vehicleClass,
		String vehicleType, String specCategory, String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
			module, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC_MD(String vehicleClass,
		String vehicleType, String specCategory, String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC_MD;
		finderArgs = new Object[] {
				vehicleClass, vehicleType, specCategory, module,
				
				start, end, orderByComparator
			};

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRConfigTechSpec vrConfigTechSpec : list) {
					if (!StringUtil.wildcardMatches(
								vrConfigTechSpec.getVehicleClass(),
								vehicleClass, CharPool.UNDERLINE,
								CharPool.PERCENT, CharPool.BACK_SLASH, true) ||
							!Objects.equals(vehicleType,
								vrConfigTechSpec.getVehicleType()) ||
							!StringUtil.wildcardMatches(
								vrConfigTechSpec.getSpecCategory(),
								specCategory, CharPool.UNDERLINE,
								CharPool.PERCENT, CharPool.BACK_SLASH, true) ||
							!Objects.equals(module, vrConfigTechSpec.getModule())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_2);
			}

			boolean bindVehicleType = false;

			if (vehicleType == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_1);
			}
			else if (vehicleType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_3);
			}
			else {
				bindVehicleType = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindVehicleType) {
					qPos.add(vehicleType);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (bindModule) {
					qPos.add(module);
				}

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
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
	 * Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_VT_SC_MD_First(String vehicleClass,
		String vehicleType, String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_VT_SC_MD_First(vehicleClass,
				vehicleType, specCategory, module, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", vehicleType=");
		msg.append(vehicleType);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(", module=");
		msg.append(module);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_VT_SC_MD_First(String vehicleClass,
		String vehicleType, String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		List<VRConfigTechSpec> list = findByVC_VT_SC_MD(vehicleClass,
				vehicleType, specCategory, module, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_VT_SC_MD_Last(String vehicleClass,
		String vehicleType, String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_VT_SC_MD_Last(vehicleClass,
				vehicleType, specCategory, module, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", vehicleType=");
		msg.append(vehicleType);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(", module=");
		msg.append(module);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_VT_SC_MD_Last(String vehicleClass,
		String vehicleType, String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		int count = countByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
				module);

		if (count == 0) {
			return null;
		}

		List<VRConfigTechSpec> list = findByVC_VT_SC_MD(vehicleClass,
				vehicleType, specCategory, module, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * @param id the primary key of the current vr config tech spec
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec[] findByVC_VT_SC_MD_PrevAndNext(long id,
		String vehicleClass, String vehicleType, String specCategory,
		String module, OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRConfigTechSpec[] array = new VRConfigTechSpecImpl[3];

			array[0] = getByVC_VT_SC_MD_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, vehicleType, specCategory, module,
					orderByComparator, true);

			array[1] = vrConfigTechSpec;

			array[2] = getByVC_VT_SC_MD_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, vehicleType, specCategory, module,
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

	protected VRConfigTechSpec getByVC_VT_SC_MD_PrevAndNext(Session session,
		VRConfigTechSpec vrConfigTechSpec, String vehicleClass,
		String vehicleType, String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_2);
		}

		boolean bindVehicleType = false;

		if (vehicleType == null) {
			query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_1);
		}
		else if (vehicleType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_3);
		}
		else {
			bindVehicleType = true;

			query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_2);
		}

		boolean bindSpecCategory = false;

		if (specCategory == null) {
			query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_1);
		}
		else if (specCategory.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_3);
		}
		else {
			bindSpecCategory = true;

			query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_2);
		}

		boolean bindModule = false;

		if (module == null) {
			query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_1);
		}
		else if (module.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_3);
		}
		else {
			bindModule = true;

			query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_2);
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
			query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindVehicleType) {
			qPos.add(vehicleType);
		}

		if (bindSpecCategory) {
			qPos.add(specCategory);
		}

		if (bindModule) {
			qPos.add(module);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrConfigTechSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRConfigTechSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleTypes the vehicle types
	 * @param specCategory the spec category
	 * @param module the module
	 * @return the matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC_MD(String vehicleClass,
		String[] vehicleTypes, String specCategory, String module) {
		return findByVC_VT_SC_MD(vehicleClass, vehicleTypes, specCategory,
			module, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleTypes the vehicle types
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC_MD(String vehicleClass,
		String[] vehicleTypes, String specCategory, String module, int start,
		int end) {
		return findByVC_VT_SC_MD(vehicleClass, vehicleTypes, specCategory,
			module, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleTypes the vehicle types
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC_MD(String vehicleClass,
		String[] vehicleTypes, String specCategory, String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findByVC_VT_SC_MD(vehicleClass, vehicleTypes, specCategory,
			module, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_VT_SC_MD(String vehicleClass,
		String[] vehicleTypes, String specCategory, String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		if (vehicleTypes == null) {
			vehicleTypes = new String[0];
		}
		else if (vehicleTypes.length > 1) {
			vehicleTypes = ArrayUtil.distinct(vehicleTypes,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(vehicleTypes, NULL_SAFE_STRING_COMPARATOR);
		}

		if (vehicleTypes.length == 1) {
			return findByVC_VT_SC_MD(vehicleClass, vehicleTypes[0],
				specCategory, module, start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] {
					vehicleClass, StringUtil.merge(vehicleTypes), specCategory,
					module
				};
		}
		else {
			finderArgs = new Object[] {
					vehicleClass, StringUtil.merge(vehicleTypes), specCategory,
					module,
					
					start, end, orderByComparator
				};
		}

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC_MD,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRConfigTechSpec vrConfigTechSpec : list) {
					if (!StringUtil.wildcardMatches(
								vrConfigTechSpec.getVehicleClass(),
								vehicleClass, CharPool.UNDERLINE,
								CharPool.PERCENT, CharPool.BACK_SLASH, true) ||
							!ArrayUtil.contains(vehicleTypes,
								vrConfigTechSpec.getVehicleType()) ||
							!StringUtil.wildcardMatches(
								vrConfigTechSpec.getSpecCategory(),
								specCategory, CharPool.UNDERLINE,
								CharPool.PERCENT, CharPool.BACK_SLASH, true) ||
							!Objects.equals(module, vrConfigTechSpec.getModule())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_2);
			}

			if (vehicleTypes.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < vehicleTypes.length; i++) {
					String vehicleType = vehicleTypes[i];

					if (vehicleType == null) {
						query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_4);
					}
					else if (vehicleType.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_6);
					}
					else {
						query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_5);
					}

					if ((i + 1) < vehicleTypes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_2);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				for (String vehicleType : vehicleTypes) {
					if ((vehicleType != null) && !vehicleType.isEmpty()) {
						qPos.add(vehicleType);
					}
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (bindModule) {
					qPos.add(module);
				}

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC_MD,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_VT_SC_MD,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 */
	@Override
	public void removeByVC_VT_SC_MD(String vehicleClass, String vehicleType,
		String specCategory, String module) {
		for (VRConfigTechSpec vrConfigTechSpec : findByVC_VT_SC_MD(
				vehicleClass, vehicleType, specCategory, module,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleType the vehicle type
	 * @param specCategory the spec category
	 * @param module the module
	 * @return the number of matching vr config tech specs
	 */
	@Override
	public int countByVC_VT_SC_MD(String vehicleClass, String vehicleType,
		String specCategory, String module) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC_MD;

		Object[] finderArgs = new Object[] {
				vehicleClass, vehicleType, specCategory, module
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_2);
			}

			boolean bindVehicleType = false;

			if (vehicleType == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_1);
			}
			else if (vehicleType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_3);
			}
			else {
				bindVehicleType = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindVehicleType) {
					qPos.add(vehicleType);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (bindModule) {
					qPos.add(module);
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

	/**
	 * Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param vehicleTypes the vehicle types
	 * @param specCategory the spec category
	 * @param module the module
	 * @return the number of matching vr config tech specs
	 */
	@Override
	public int countByVC_VT_SC_MD(String vehicleClass, String[] vehicleTypes,
		String specCategory, String module) {
		if (vehicleTypes == null) {
			vehicleTypes = new String[0];
		}
		else if (vehicleTypes.length > 1) {
			vehicleTypes = ArrayUtil.distinct(vehicleTypes,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(vehicleTypes, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] {
				vehicleClass, StringUtil.merge(vehicleTypes), specCategory,
				module
			};

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC_MD,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_2);
			}

			if (vehicleTypes.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < vehicleTypes.length; i++) {
					String vehicleType = vehicleTypes[i];

					if (vehicleType == null) {
						query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_4);
					}
					else if (vehicleType.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_6);
					}
					else {
						query.append(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_5);
					}

					if ((i + 1) < vehicleTypes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_VT_SC_MD_MODULE_2);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				for (String vehicleType : vehicleTypes) {
					if ((vehicleType != null) && !vehicleType.isEmpty()) {
						qPos.add(vehicleType);
					}
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (bindModule) {
					qPos.add(module);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC_MD,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_VC_VT_SC_MD,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_1 = "vrConfigTechSpec.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_2 = "vrConfigTechSpec.vehicleClass LIKE ? AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLECLASS_3 = "(vrConfigTechSpec.vehicleClass IS NULL OR vrConfigTechSpec.vehicleClass LIKE '') AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_1 = "vrConfigTechSpec.vehicleType IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_2 = "vrConfigTechSpec.vehicleType = ? AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_3 = "(vrConfigTechSpec.vehicleType IS NULL OR vrConfigTechSpec.vehicleType = '') AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_4 = "(" +
		removeConjunction(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_1) + ")";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_5 = "(" +
		removeConjunction(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_2) + ")";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_6 = "(" +
		removeConjunction(_FINDER_COLUMN_VC_VT_SC_MD_VEHICLETYPE_3) + ")";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_1 = "vrConfigTechSpec.specCategory IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_2 = "vrConfigTechSpec.specCategory LIKE ? AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_SPECCATEGORY_3 = "(vrConfigTechSpec.specCategory IS NULL OR vrConfigTechSpec.specCategory LIKE '') AND ";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_MODULE_1 = "vrConfigTechSpec.module IS NULL";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_MODULE_2 = "vrConfigTechSpec.module = ?";
	private static final String _FINDER_COLUMN_VC_VT_SC_MD_MODULE_3 = "(vrConfigTechSpec.module IS NULL OR vrConfigTechSpec.module = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_SC = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVC_SC",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVC_SC",
			new String[] { String.class.getName(), String.class.getName() },
			VRConfigTechSpecModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRConfigTechSpecModelImpl.SPECCATEGORY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VC_SC = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVC_SC",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @return the matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC(String vehicleClass,
		String specCategory) {
		return findByVC_SC(vehicleClass, specCategory, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC(String vehicleClass,
		String specCategory, int start, int end) {
		return findByVC_SC(vehicleClass, specCategory, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC(String vehicleClass,
		String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findByVC_SC(vehicleClass, specCategory, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC(String vehicleClass,
		String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC;
			finderArgs = new Object[] { vehicleClass, specCategory };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_SC;
			finderArgs = new Object[] {
					vehicleClass, specCategory,
					
					start, end, orderByComparator
				};
		}

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRConfigTechSpec vrConfigTechSpec : list) {
					if (!Objects.equals(vehicleClass,
								vrConfigTechSpec.getVehicleClass()) ||
							!Objects.equals(specCategory,
								vrConfigTechSpec.getSpecCategory())) {
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

			query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
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
	 * Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_SC_First(String vehicleClass,
		String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_SC_First(vehicleClass,
				specCategory, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_SC_First(String vehicleClass,
		String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		List<VRConfigTechSpec> list = findByVC_SC(vehicleClass, specCategory,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_SC_Last(String vehicleClass,
		String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_SC_Last(vehicleClass,
				specCategory, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_SC_Last(String vehicleClass,
		String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		int count = countByVC_SC(vehicleClass, specCategory);

		if (count == 0) {
			return null;
		}

		List<VRConfigTechSpec> list = findByVC_SC(vehicleClass, specCategory,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * @param id the primary key of the current vr config tech spec
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec[] findByVC_SC_PrevAndNext(long id,
		String vehicleClass, String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRConfigTechSpec[] array = new VRConfigTechSpecImpl[3];

			array[0] = getByVC_SC_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, specCategory, orderByComparator, true);

			array[1] = vrConfigTechSpec;

			array[2] = getByVC_SC_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, specCategory, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRConfigTechSpec getByVC_SC_PrevAndNext(Session session,
		VRConfigTechSpec vrConfigTechSpec, String vehicleClass,
		String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_2);
		}

		boolean bindSpecCategory = false;

		if (specCategory == null) {
			query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_1);
		}
		else if (specCategory.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_3);
		}
		else {
			bindSpecCategory = true;

			query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_2);
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
			query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindSpecCategory) {
			qPos.add(specCategory);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrConfigTechSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRConfigTechSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 */
	@Override
	public void removeByVC_SC(String vehicleClass, String specCategory) {
		for (VRConfigTechSpec vrConfigTechSpec : findByVC_SC(vehicleClass,
				specCategory, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @return the number of matching vr config tech specs
	 */
	@Override
	public int countByVC_SC(String vehicleClass, String specCategory) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VC_SC;

		Object[] finderArgs = new Object[] { vehicleClass, specCategory };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_SC_VEHICLECLASS_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_SC_SPECCATEGORY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
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

	private static final String _FINDER_COLUMN_VC_SC_VEHICLECLASS_1 = "vrConfigTechSpec.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_SC_VEHICLECLASS_2 = "vrConfigTechSpec.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_VC_SC_VEHICLECLASS_3 = "(vrConfigTechSpec.vehicleClass IS NULL OR vrConfigTechSpec.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_VC_SC_SPECCATEGORY_1 = "vrConfigTechSpec.specCategory IS NULL";
	private static final String _FINDER_COLUMN_VC_SC_SPECCATEGORY_2 = "vrConfigTechSpec.specCategory = ?";
	private static final String _FINDER_COLUMN_VC_SC_SPECCATEGORY_3 = "(vrConfigTechSpec.specCategory IS NULL OR vrConfigTechSpec.specCategory = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_SC_MD = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVC_SC_MD",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD =
		new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVC_SC_MD",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VRConfigTechSpecModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRConfigTechSpecModelImpl.SPECCATEGORY_COLUMN_BITMASK |
			VRConfigTechSpecModelImpl.MODULE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VC_SC_MD = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVC_SC_MD",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @return the matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC_MD(String vehicleClass,
		String specCategory, String module) {
		return findByVC_SC_MD(vehicleClass, specCategory, module,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC_MD(String vehicleClass,
		String specCategory, String module, int start, int end) {
		return findByVC_SC_MD(vehicleClass, specCategory, module, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC_MD(String vehicleClass,
		String specCategory, String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findByVC_SC_MD(vehicleClass, specCategory, module, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC_MD(String vehicleClass,
		String specCategory, String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD;
			finderArgs = new Object[] { vehicleClass, specCategory, module };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_SC_MD;
			finderArgs = new Object[] {
					vehicleClass, specCategory, module,
					
					start, end, orderByComparator
				};
		}

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRConfigTechSpec vrConfigTechSpec : list) {
					if (!Objects.equals(vehicleClass,
								vrConfigTechSpec.getVehicleClass()) ||
							!Objects.equals(specCategory,
								vrConfigTechSpec.getSpecCategory()) ||
							!Objects.equals(module, vrConfigTechSpec.getModule())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (bindModule) {
					qPos.add(module);
				}

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
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
	 * Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_SC_MD_First(String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_SC_MD_First(vehicleClass,
				specCategory, module, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(", module=");
		msg.append(module);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_SC_MD_First(String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		List<VRConfigTechSpec> list = findByVC_SC_MD(vehicleClass,
				specCategory, module, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_SC_MD_Last(String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_SC_MD_Last(vehicleClass,
				specCategory, module, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(", module=");
		msg.append(module);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_SC_MD_Last(String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		int count = countByVC_SC_MD(vehicleClass, specCategory, module);

		if (count == 0) {
			return null;
		}

		List<VRConfigTechSpec> list = findByVC_SC_MD(vehicleClass,
				specCategory, module, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param id the primary key of the current vr config tech spec
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec[] findByVC_SC_MD_PrevAndNext(long id,
		String vehicleClass, String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRConfigTechSpec[] array = new VRConfigTechSpecImpl[3];

			array[0] = getByVC_SC_MD_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, specCategory, module, orderByComparator, true);

			array[1] = vrConfigTechSpec;

			array[2] = getByVC_SC_MD_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, specCategory, module, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRConfigTechSpec getByVC_SC_MD_PrevAndNext(Session session,
		VRConfigTechSpec vrConfigTechSpec, String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_2);
		}

		boolean bindSpecCategory = false;

		if (specCategory == null) {
			query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_1);
		}
		else if (specCategory.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_3);
		}
		else {
			bindSpecCategory = true;

			query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_2);
		}

		boolean bindModule = false;

		if (module == null) {
			query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_1);
		}
		else if (module.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_3);
		}
		else {
			bindModule = true;

			query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_2);
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
			query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindSpecCategory) {
			qPos.add(specCategory);
		}

		if (bindModule) {
			qPos.add(module);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrConfigTechSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRConfigTechSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 */
	@Override
	public void removeByVC_SC_MD(String vehicleClass, String specCategory,
		String module) {
		for (VRConfigTechSpec vrConfigTechSpec : findByVC_SC_MD(vehicleClass,
				specCategory, module, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @return the number of matching vr config tech specs
	 */
	@Override
	public int countByVC_SC_MD(String vehicleClass, String specCategory,
		String module) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VC_SC_MD;

		Object[] finderArgs = new Object[] { vehicleClass, specCategory, module };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_SC_MD_MODULE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (bindModule) {
					qPos.add(module);
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

	private static final String _FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_1 = "vrConfigTechSpec.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_2 = "vrConfigTechSpec.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD_VEHICLECLASS_3 = "(vrConfigTechSpec.vehicleClass IS NULL OR vrConfigTechSpec.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_1 = "vrConfigTechSpec.specCategory IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_2 = "vrConfigTechSpec.specCategory = ? AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD_SPECCATEGORY_3 = "(vrConfigTechSpec.specCategory IS NULL OR vrConfigTechSpec.specCategory = '') AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD_MODULE_1 = "vrConfigTechSpec.module IS NULL";
	private static final String _FINDER_COLUMN_VC_SC_MD_MODULE_2 = "vrConfigTechSpec.module = ?";
	private static final String _FINDER_COLUMN_VC_SC_MD_MODULE_3 = "(vrConfigTechSpec.module IS NULL OR vrConfigTechSpec.module = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_SC_MD_ =
		new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVC_SC_MD_",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD_ =
		new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVC_SC_MD_",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VRConfigTechSpecModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRConfigTechSpecModelImpl.SPECCATEGORY_COLUMN_BITMASK |
			VRConfigTechSpecModelImpl.MODULE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VC_SC_MD_ = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVC_SC_MD_",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @return the matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC_MD_(String vehicleClass,
		String specCategory, String module) {
		return findByVC_SC_MD_(vehicleClass, specCategory, module,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC_MD_(String vehicleClass,
		String specCategory, String module, int start, int end) {
		return findByVC_SC_MD_(vehicleClass, specCategory, module, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC_MD_(String vehicleClass,
		String specCategory, String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findByVC_SC_MD_(vehicleClass, specCategory, module, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_SC_MD_(String vehicleClass,
		String specCategory, String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD_;
			finderArgs = new Object[] { vehicleClass, specCategory, module };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_SC_MD_;
			finderArgs = new Object[] {
					vehicleClass, specCategory, module,
					
					start, end, orderByComparator
				};
		}

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRConfigTechSpec vrConfigTechSpec : list) {
					if (!Objects.equals(vehicleClass,
								vrConfigTechSpec.getVehicleClass()) ||
							!Objects.equals(specCategory,
								vrConfigTechSpec.getSpecCategory()) ||
							!Objects.equals(module, vrConfigTechSpec.getModule())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (bindModule) {
					qPos.add(module);
				}

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
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
	 * Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_SC_MD__First(String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_SC_MD__First(vehicleClass,
				specCategory, module, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(", module=");
		msg.append(module);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_SC_MD__First(String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		List<VRConfigTechSpec> list = findByVC_SC_MD_(vehicleClass,
				specCategory, module, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_SC_MD__Last(String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_SC_MD__Last(vehicleClass,
				specCategory, module, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", specCategory=");
		msg.append(specCategory);

		msg.append(", module=");
		msg.append(module);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_SC_MD__Last(String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		int count = countByVC_SC_MD_(vehicleClass, specCategory, module);

		if (count == 0) {
			return null;
		}

		List<VRConfigTechSpec> list = findByVC_SC_MD_(vehicleClass,
				specCategory, module, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param id the primary key of the current vr config tech spec
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec[] findByVC_SC_MD__PrevAndNext(long id,
		String vehicleClass, String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRConfigTechSpec[] array = new VRConfigTechSpecImpl[3];

			array[0] = getByVC_SC_MD__PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, specCategory, module, orderByComparator, true);

			array[1] = vrConfigTechSpec;

			array[2] = getByVC_SC_MD__PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, specCategory, module, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRConfigTechSpec getByVC_SC_MD__PrevAndNext(Session session,
		VRConfigTechSpec vrConfigTechSpec, String vehicleClass,
		String specCategory, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_2);
		}

		boolean bindSpecCategory = false;

		if (specCategory == null) {
			query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_1);
		}
		else if (specCategory.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_3);
		}
		else {
			bindSpecCategory = true;

			query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_2);
		}

		boolean bindModule = false;

		if (module == null) {
			query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_1);
		}
		else if (module.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_3);
		}
		else {
			bindModule = true;

			query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_2);
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
			query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindSpecCategory) {
			qPos.add(specCategory);
		}

		if (bindModule) {
			qPos.add(module);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrConfigTechSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRConfigTechSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 */
	@Override
	public void removeByVC_SC_MD_(String vehicleClass, String specCategory,
		String module) {
		for (VRConfigTechSpec vrConfigTechSpec : findByVC_SC_MD_(vehicleClass,
				specCategory, module, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param specCategory the spec category
	 * @param module the module
	 * @return the number of matching vr config tech specs
	 */
	@Override
	public int countByVC_SC_MD_(String vehicleClass, String specCategory,
		String module) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VC_SC_MD_;

		Object[] finderArgs = new Object[] { vehicleClass, specCategory, module };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_2);
			}

			boolean bindSpecCategory = false;

			if (specCategory == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_1);
			}
			else if (specCategory.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_3);
			}
			else {
				bindSpecCategory = true;

				query.append(_FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_SC_MD__MODULE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindSpecCategory) {
					qPos.add(specCategory);
				}

				if (bindModule) {
					qPos.add(module);
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

	private static final String _FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_1 = "vrConfigTechSpec.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_2 = "vrConfigTechSpec.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD__VEHICLECLASS_3 = "(vrConfigTechSpec.vehicleClass IS NULL OR vrConfigTechSpec.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_1 = "vrConfigTechSpec.specCategory IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_2 = "vrConfigTechSpec.specCategory = ? AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD__SPECCATEGORY_3 = "(vrConfigTechSpec.specCategory IS NULL OR vrConfigTechSpec.specCategory = '') AND ";
	private static final String _FINDER_COLUMN_VC_SC_MD__MODULE_1 = "vrConfigTechSpec.module IS NULL";
	private static final String _FINDER_COLUMN_VC_SC_MD__MODULE_2 = "vrConfigTechSpec.module = ?";
	private static final String _FINDER_COLUMN_VC_SC_MD__MODULE_3 = "(vrConfigTechSpec.module IS NULL OR vrConfigTechSpec.module = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_MD = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVC_MD",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_MD = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVC_MD",
			new String[] { String.class.getName(), String.class.getName() },
			VRConfigTechSpecModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRConfigTechSpecModelImpl.MODULE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VC_MD = new FinderPath(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVC_MD",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @return the matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_MD(String vehicleClass, String module) {
		return findByVC_MD(vehicleClass, module, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_MD(String vehicleClass,
		String module, int start, int end) {
		return findByVC_MD(vehicleClass, module, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_MD(String vehicleClass,
		String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findByVC_MD(vehicleClass, module, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findByVC_MD(String vehicleClass,
		String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_MD;
			finderArgs = new Object[] { vehicleClass, module };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VC_MD;
			finderArgs = new Object[] {
					vehicleClass, module,
					
					start, end, orderByComparator
				};
		}

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRConfigTechSpec vrConfigTechSpec : list) {
					if (!Objects.equals(vehicleClass,
								vrConfigTechSpec.getVehicleClass()) ||
							!Objects.equals(module, vrConfigTechSpec.getModule())) {
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

			query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_MD_MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_MD_MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_MD_MODULE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindModule) {
					qPos.add(module);
				}

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
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
	 * Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_MD_First(String vehicleClass,
		String module, OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_MD_First(vehicleClass,
				module, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", module=");
		msg.append(module);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_MD_First(String vehicleClass,
		String module, OrderByComparator<VRConfigTechSpec> orderByComparator) {
		List<VRConfigTechSpec> list = findByVC_MD(vehicleClass, module, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec findByVC_MD_Last(String vehicleClass,
		String module, OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByVC_MD_Last(vehicleClass,
				module, orderByComparator);

		if (vrConfigTechSpec != null) {
			return vrConfigTechSpec;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", module=");
		msg.append(module);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByVC_MD_Last(String vehicleClass,
		String module, OrderByComparator<VRConfigTechSpec> orderByComparator) {
		int count = countByVC_MD(vehicleClass, module);

		if (count == 0) {
			return null;
		}

		List<VRConfigTechSpec> list = findByVC_MD(vehicleClass, module,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	 *
	 * @param id the primary key of the current vr config tech spec
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec[] findByVC_MD_PrevAndNext(long id,
		String vehicleClass, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRConfigTechSpec[] array = new VRConfigTechSpecImpl[3];

			array[0] = getByVC_MD_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, module, orderByComparator, true);

			array[1] = vrConfigTechSpec;

			array[2] = getByVC_MD_PrevAndNext(session, vrConfigTechSpec,
					vehicleClass, module, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRConfigTechSpec getByVC_MD_PrevAndNext(Session session,
		VRConfigTechSpec vrConfigTechSpec, String vehicleClass, String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_2);
		}

		boolean bindModule = false;

		if (module == null) {
			query.append(_FINDER_COLUMN_VC_MD_MODULE_1);
		}
		else if (module.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VC_MD_MODULE_3);
		}
		else {
			bindModule = true;

			query.append(_FINDER_COLUMN_VC_MD_MODULE_2);
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
			query.append(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (bindModule) {
			qPos.add(module);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrConfigTechSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRConfigTechSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr config tech specs where vehicleClass = &#63; and module = &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 */
	@Override
	public void removeByVC_MD(String vehicleClass, String module) {
		for (VRConfigTechSpec vrConfigTechSpec : findByVC_MD(vehicleClass,
				module, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr config tech specs where vehicleClass = &#63; and module = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param module the module
	 * @return the number of matching vr config tech specs
	 */
	@Override
	public int countByVC_MD(String vehicleClass, String module) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VC_MD;

		Object[] finderArgs = new Object[] { vehicleClass, module };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCONFIGTECHSPEC_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VC_MD_VEHICLECLASS_2);
			}

			boolean bindModule = false;

			if (module == null) {
				query.append(_FINDER_COLUMN_VC_MD_MODULE_1);
			}
			else if (module.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VC_MD_MODULE_3);
			}
			else {
				bindModule = true;

				query.append(_FINDER_COLUMN_VC_MD_MODULE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (bindModule) {
					qPos.add(module);
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

	private static final String _FINDER_COLUMN_VC_MD_VEHICLECLASS_1 = "vrConfigTechSpec.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VC_MD_VEHICLECLASS_2 = "vrConfigTechSpec.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_VC_MD_VEHICLECLASS_3 = "(vrConfigTechSpec.vehicleClass IS NULL OR vrConfigTechSpec.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_VC_MD_MODULE_1 = "vrConfigTechSpec.module IS NULL";
	private static final String _FINDER_COLUMN_VC_MD_MODULE_2 = "vrConfigTechSpec.module = ?";
	private static final String _FINDER_COLUMN_VC_MD_MODULE_3 = "(vrConfigTechSpec.module IS NULL OR vrConfigTechSpec.module = '')";

	public VRConfigTechSpecPersistenceImpl() {
		setModelClass(VRConfigTechSpec.class);
	}

	/**
	 * Caches the vr config tech spec in the entity cache if it is enabled.
	 *
	 * @param vrConfigTechSpec the vr config tech spec
	 */
	@Override
	public void cacheResult(VRConfigTechSpec vrConfigTechSpec) {
		entityCache.putResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, vrConfigTechSpec.getPrimaryKey(),
			vrConfigTechSpec);

		vrConfigTechSpec.resetOriginalValues();
	}

	/**
	 * Caches the vr config tech specs in the entity cache if it is enabled.
	 *
	 * @param vrConfigTechSpecs the vr config tech specs
	 */
	@Override
	public void cacheResult(List<VRConfigTechSpec> vrConfigTechSpecs) {
		for (VRConfigTechSpec vrConfigTechSpec : vrConfigTechSpecs) {
			if (entityCache.getResult(
						VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
						VRConfigTechSpecImpl.class,
						vrConfigTechSpec.getPrimaryKey()) == null) {
				cacheResult(vrConfigTechSpec);
			}
			else {
				vrConfigTechSpec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr config tech specs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRConfigTechSpecImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr config tech spec.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRConfigTechSpec vrConfigTechSpec) {
		entityCache.removeResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, vrConfigTechSpec.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRConfigTechSpec> vrConfigTechSpecs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRConfigTechSpec vrConfigTechSpec : vrConfigTechSpecs) {
			entityCache.removeResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
				VRConfigTechSpecImpl.class, vrConfigTechSpec.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr config tech spec with the primary key. Does not add the vr config tech spec to the database.
	 *
	 * @param id the primary key for the new vr config tech spec
	 * @return the new vr config tech spec
	 */
	@Override
	public VRConfigTechSpec create(long id) {
		VRConfigTechSpec vrConfigTechSpec = new VRConfigTechSpecImpl();

		vrConfigTechSpec.setNew(true);
		vrConfigTechSpec.setPrimaryKey(id);

		return vrConfigTechSpec;
	}

	/**
	 * Removes the vr config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr config tech spec
	 * @return the vr config tech spec that was removed
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec remove(long id)
		throws NoSuchVRConfigTechSpecException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr config tech spec
	 * @return the vr config tech spec that was removed
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec remove(Serializable primaryKey)
		throws NoSuchVRConfigTechSpecException {
		Session session = null;

		try {
			session = openSession();

			VRConfigTechSpec vrConfigTechSpec = (VRConfigTechSpec)session.get(VRConfigTechSpecImpl.class,
					primaryKey);

			if (vrConfigTechSpec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRConfigTechSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrConfigTechSpec);
		}
		catch (NoSuchVRConfigTechSpecException nsee) {
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
	protected VRConfigTechSpec removeImpl(VRConfigTechSpec vrConfigTechSpec) {
		vrConfigTechSpec = toUnwrappedModel(vrConfigTechSpec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrConfigTechSpec)) {
				vrConfigTechSpec = (VRConfigTechSpec)session.get(VRConfigTechSpecImpl.class,
						vrConfigTechSpec.getPrimaryKeyObj());
			}

			if (vrConfigTechSpec != null) {
				session.delete(vrConfigTechSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrConfigTechSpec != null) {
			clearCache(vrConfigTechSpec);
		}

		return vrConfigTechSpec;
	}

	@Override
	public VRConfigTechSpec updateImpl(VRConfigTechSpec vrConfigTechSpec) {
		vrConfigTechSpec = toUnwrappedModel(vrConfigTechSpec);

		boolean isNew = vrConfigTechSpec.isNew();

		VRConfigTechSpecModelImpl vrConfigTechSpecModelImpl = (VRConfigTechSpecModelImpl)vrConfigTechSpec;

		Session session = null;

		try {
			session = openSession();

			if (vrConfigTechSpec.isNew()) {
				session.save(vrConfigTechSpec);

				vrConfigTechSpec.setNew(false);
			}
			else {
				vrConfigTechSpec = (VRConfigTechSpec)session.merge(vrConfigTechSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRConfigTechSpecModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrConfigTechSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrConfigTechSpecModelImpl.getOriginalVehicleClass(),
						vrConfigTechSpecModelImpl.getOriginalSpecCategory()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VC_SC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC,
					args);

				args = new Object[] {
						vrConfigTechSpecModelImpl.getVehicleClass(),
						vrConfigTechSpecModelImpl.getSpecCategory()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VC_SC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC,
					args);
			}

			if ((vrConfigTechSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrConfigTechSpecModelImpl.getOriginalVehicleClass(),
						vrConfigTechSpecModelImpl.getOriginalSpecCategory(),
						vrConfigTechSpecModelImpl.getOriginalModule()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VC_SC_MD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD,
					args);

				args = new Object[] {
						vrConfigTechSpecModelImpl.getVehicleClass(),
						vrConfigTechSpecModelImpl.getSpecCategory(),
						vrConfigTechSpecModelImpl.getModule()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VC_SC_MD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD,
					args);
			}

			if ((vrConfigTechSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrConfigTechSpecModelImpl.getOriginalVehicleClass(),
						vrConfigTechSpecModelImpl.getOriginalSpecCategory(),
						vrConfigTechSpecModelImpl.getOriginalModule()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VC_SC_MD_, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD_,
					args);

				args = new Object[] {
						vrConfigTechSpecModelImpl.getVehicleClass(),
						vrConfigTechSpecModelImpl.getSpecCategory(),
						vrConfigTechSpecModelImpl.getModule()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VC_SC_MD_, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_SC_MD_,
					args);
			}

			if ((vrConfigTechSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_MD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrConfigTechSpecModelImpl.getOriginalVehicleClass(),
						vrConfigTechSpecModelImpl.getOriginalModule()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VC_MD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_MD,
					args);

				args = new Object[] {
						vrConfigTechSpecModelImpl.getVehicleClass(),
						vrConfigTechSpecModelImpl.getModule()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VC_MD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VC_MD,
					args);
			}
		}

		entityCache.putResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRConfigTechSpecImpl.class, vrConfigTechSpec.getPrimaryKey(),
			vrConfigTechSpec, false);

		vrConfigTechSpec.resetOriginalValues();

		return vrConfigTechSpec;
	}

	protected VRConfigTechSpec toUnwrappedModel(
		VRConfigTechSpec vrConfigTechSpec) {
		if (vrConfigTechSpec instanceof VRConfigTechSpecImpl) {
			return vrConfigTechSpec;
		}

		VRConfigTechSpecImpl vrConfigTechSpecImpl = new VRConfigTechSpecImpl();

		vrConfigTechSpecImpl.setNew(vrConfigTechSpec.isNew());
		vrConfigTechSpecImpl.setPrimaryKey(vrConfigTechSpec.getPrimaryKey());

		vrConfigTechSpecImpl.setId(vrConfigTechSpec.getId());
		vrConfigTechSpecImpl.setVehicleClass(vrConfigTechSpec.getVehicleClass());
		vrConfigTechSpecImpl.setVehicleType(vrConfigTechSpec.getVehicleType());
		vrConfigTechSpecImpl.setVehicletypeName(vrConfigTechSpec.getVehicletypeName());
		vrConfigTechSpecImpl.setSequenceNo(vrConfigTechSpec.getSequenceNo());
		vrConfigTechSpecImpl.setSpecificationName(vrConfigTechSpec.getSpecificationName());
		vrConfigTechSpecImpl.setSpecificationCode(vrConfigTechSpec.getSpecificationCode());
		vrConfigTechSpecImpl.setSpecificationDisplayName(vrConfigTechSpec.getSpecificationDisplayName());
		vrConfigTechSpecImpl.setSpecCategory(vrConfigTechSpec.getSpecCategory());
		vrConfigTechSpecImpl.setSpecificationGroup(vrConfigTechSpec.getSpecificationGroup());
		vrConfigTechSpecImpl.setSpecificationDataCollectionId(vrConfigTechSpec.getSpecificationDataCollectionId());
		vrConfigTechSpecImpl.setSpecificationBasicUnit(vrConfigTechSpec.getSpecificationBasicUnit());
		vrConfigTechSpecImpl.setSpecificationStandard(vrConfigTechSpec.getSpecificationStandard());
		vrConfigTechSpecImpl.setSpecificationEntryType(vrConfigTechSpec.getSpecificationEntryType());
		vrConfigTechSpecImpl.setSpecificationEntryPlaceholder(vrConfigTechSpec.getSpecificationEntryPlaceholder());
		vrConfigTechSpecImpl.setSpecificationMandatory(vrConfigTechSpec.getSpecificationMandatory());
		vrConfigTechSpecImpl.setModule(vrConfigTechSpec.getModule());
		vrConfigTechSpecImpl.setSynchDate(vrConfigTechSpec.getSynchDate());

		return vrConfigTechSpecImpl;
	}

	/**
	 * Returns the vr config tech spec with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr config tech spec
	 * @return the vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRConfigTechSpecException {
		VRConfigTechSpec vrConfigTechSpec = fetchByPrimaryKey(primaryKey);

		if (vrConfigTechSpec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRConfigTechSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrConfigTechSpec;
	}

	/**
	 * Returns the vr config tech spec with the primary key or throws a {@link NoSuchVRConfigTechSpecException} if it could not be found.
	 *
	 * @param id the primary key of the vr config tech spec
	 * @return the vr config tech spec
	 * @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec findByPrimaryKey(long id)
		throws NoSuchVRConfigTechSpecException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr config tech spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr config tech spec
	 * @return the vr config tech spec, or <code>null</code> if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
				VRConfigTechSpecImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRConfigTechSpec vrConfigTechSpec = (VRConfigTechSpec)serializable;

		if (vrConfigTechSpec == null) {
			Session session = null;

			try {
				session = openSession();

				vrConfigTechSpec = (VRConfigTechSpec)session.get(VRConfigTechSpecImpl.class,
						primaryKey);

				if (vrConfigTechSpec != null) {
					cacheResult(vrConfigTechSpec);
				}
				else {
					entityCache.putResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
						VRConfigTechSpecImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
					VRConfigTechSpecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrConfigTechSpec;
	}

	/**
	 * Returns the vr config tech spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr config tech spec
	 * @return the vr config tech spec, or <code>null</code> if a vr config tech spec with the primary key could not be found
	 */
	@Override
	public VRConfigTechSpec fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRConfigTechSpec> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRConfigTechSpec> map = new HashMap<Serializable, VRConfigTechSpec>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRConfigTechSpec vrConfigTechSpec = fetchByPrimaryKey(primaryKey);

			if (vrConfigTechSpec != null) {
				map.put(primaryKey, vrConfigTechSpec);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
					VRConfigTechSpecImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRConfigTechSpec)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCONFIGTECHSPEC_WHERE_PKS_IN);

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

			for (VRConfigTechSpec vrConfigTechSpec : (List<VRConfigTechSpec>)q.list()) {
				map.put(vrConfigTechSpec.getPrimaryKeyObj(), vrConfigTechSpec);

				cacheResult(vrConfigTechSpec);

				uncachedPrimaryKeys.remove(vrConfigTechSpec.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
					VRConfigTechSpecImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr config tech specs.
	 *
	 * @return the vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr config tech specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @return the range of vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findAll(int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr config tech specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr config tech specs
	 * @param end the upper bound of the range of vr config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr config tech specs
	 */
	@Override
	public List<VRConfigTechSpec> findAll(int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
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

		List<VRConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCONFIGTECHSPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCONFIGTECHSPEC;

				if (pagination) {
					sql = sql.concat(VRConfigTechSpecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRConfigTechSpec>)QueryUtil.list(q,
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
	 * Removes all the vr config tech specs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRConfigTechSpec vrConfigTechSpec : findAll()) {
			remove(vrConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr config tech specs.
	 *
	 * @return the number of vr config tech specs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCONFIGTECHSPEC);

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
		return VRConfigTechSpecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr config tech spec persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRConfigTechSpecImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCONFIGTECHSPEC = "SELECT vrConfigTechSpec FROM VRConfigTechSpec vrConfigTechSpec";
	private static final String _SQL_SELECT_VRCONFIGTECHSPEC_WHERE_PKS_IN = "SELECT vrConfigTechSpec FROM VRConfigTechSpec vrConfigTechSpec WHERE id IN (";
	private static final String _SQL_SELECT_VRCONFIGTECHSPEC_WHERE = "SELECT vrConfigTechSpec FROM VRConfigTechSpec vrConfigTechSpec WHERE ";
	private static final String _SQL_COUNT_VRCONFIGTECHSPEC = "SELECT COUNT(vrConfigTechSpec) FROM VRConfigTechSpec vrConfigTechSpec";
	private static final String _SQL_COUNT_VRCONFIGTECHSPEC_WHERE = "SELECT COUNT(vrConfigTechSpec) FROM VRConfigTechSpec vrConfigTechSpec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrConfigTechSpec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRConfigTechSpec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRConfigTechSpec exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRConfigTechSpecPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleClass", "vehicleType", "vehicletypeName", "sequenceNo",
				"specificationName", "specificationCode",
				"specificationDisplayName", "specCategory", "specificationGroup",
				"specificationDataCollectionId", "specificationBasicUnit",
				"specificationStandard", "specificationEntryType",
				"specificationEntryPlaceholder", "specificationMandatory",
				"module", "synchDate"
			});
}