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

import com.fds.vr.business.exception.NoSuchVRLimitConfigTechSpecException;
import com.fds.vr.business.model.VRLimitConfigTechSpec;
import com.fds.vr.business.model.impl.VRLimitConfigTechSpecImpl;
import com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl;
import com.fds.vr.business.service.persistence.VRLimitConfigTechSpecPersistence;

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
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vr limit config tech spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRLimitConfigTechSpecPersistence
 * @see com.fds.vr.business.service.persistence.VRLimitConfigTechSpecUtil
 * @generated
 */
@ProviderType
public class VRLimitConfigTechSpecPersistenceImpl extends BasePersistenceImpl<VRLimitConfigTechSpec>
	implements VRLimitConfigTechSpecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRLimitConfigTechSpecUtil} to access the vr limit config tech spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRLimitConfigTechSpecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRLimitConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRLimitConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VT_MU_DC = new FinderPath(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRLimitConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVT_MU_DC",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VT_MU_DC =
		new FinderPath(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecModelImpl.FINDER_CACHE_ENABLED,
			VRLimitConfigTechSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVT_MU_DC",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			VRLimitConfigTechSpecModelImpl.VEHICLETYPE_COLUMN_BITMASK |
			VRLimitConfigTechSpecModelImpl.MARKUPSMRM_COLUMN_BITMASK |
			VRLimitConfigTechSpecModelImpl.SEARCHINGDRIVECONFIG_COLUMN_BITMASK |
			VRLimitConfigTechSpecModelImpl.SEQUENCENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VT_MU_DC = new FinderPath(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVT_MU_DC",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @return the matching vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> findByVT_MU_DC(String vehicleType,
		String markupSMRM, long searchingDriveConfig) {
		return findByVT_MU_DC(vehicleType, markupSMRM, searchingDriveConfig,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @param start the lower bound of the range of vr limit config tech specs
	 * @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	 * @return the range of matching vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> findByVT_MU_DC(String vehicleType,
		String markupSMRM, long searchingDriveConfig, int start, int end) {
		return findByVT_MU_DC(vehicleType, markupSMRM, searchingDriveConfig,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @param start the lower bound of the range of vr limit config tech specs
	 * @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> findByVT_MU_DC(String vehicleType,
		String markupSMRM, long searchingDriveConfig, int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		return findByVT_MU_DC(vehicleType, markupSMRM, searchingDriveConfig,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @param start the lower bound of the range of vr limit config tech specs
	 * @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> findByVT_MU_DC(String vehicleType,
		String markupSMRM, long searchingDriveConfig, int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VT_MU_DC;
			finderArgs = new Object[] {
					vehicleType, markupSMRM, searchingDriveConfig
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VT_MU_DC;
			finderArgs = new Object[] {
					vehicleType, markupSMRM, searchingDriveConfig,
					
					start, end, orderByComparator
				};
		}

		List<VRLimitConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRLimitConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRLimitConfigTechSpec vrLimitConfigTechSpec : list) {
					if (!Objects.equals(vehicleType,
								vrLimitConfigTechSpec.getVehicleType()) ||
							!Objects.equals(markupSMRM,
								vrLimitConfigTechSpec.getMarkupSMRM()) ||
							(searchingDriveConfig != vrLimitConfigTechSpec.getSearchingDriveConfig())) {
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

			query.append(_SQL_SELECT_VRLIMITCONFIGTECHSPEC_WHERE);

			boolean bindVehicleType = false;

			if (vehicleType == null) {
				query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_1);
			}
			else if (vehicleType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_3);
			}
			else {
				bindVehicleType = true;

				query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_2);
			}

			boolean bindMarkupSMRM = false;

			if (markupSMRM == null) {
				query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_1);
			}
			else if (markupSMRM.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_3);
			}
			else {
				bindMarkupSMRM = true;

				query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_2);
			}

			query.append(_FINDER_COLUMN_VT_MU_DC_SEARCHINGDRIVECONFIG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRLimitConfigTechSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleType) {
					qPos.add(vehicleType);
				}

				if (bindMarkupSMRM) {
					qPos.add(markupSMRM);
				}

				qPos.add(searchingDriveConfig);

				if (!pagination) {
					list = (List<VRLimitConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRLimitConfigTechSpec>)QueryUtil.list(q,
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
	 * Returns the first vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr limit config tech spec
	 * @throws NoSuchVRLimitConfigTechSpecException if a matching vr limit config tech spec could not be found
	 */
	@Override
	public VRLimitConfigTechSpec findByVT_MU_DC_First(String vehicleType,
		String markupSMRM, long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws NoSuchVRLimitConfigTechSpecException {
		VRLimitConfigTechSpec vrLimitConfigTechSpec = fetchByVT_MU_DC_First(vehicleType,
				markupSMRM, searchingDriveConfig, orderByComparator);

		if (vrLimitConfigTechSpec != null) {
			return vrLimitConfigTechSpec;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleType=");
		msg.append(vehicleType);

		msg.append(", markupSMRM=");
		msg.append(markupSMRM);

		msg.append(", searchingDriveConfig=");
		msg.append(searchingDriveConfig);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRLimitConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the first vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr limit config tech spec, or <code>null</code> if a matching vr limit config tech spec could not be found
	 */
	@Override
	public VRLimitConfigTechSpec fetchByVT_MU_DC_First(String vehicleType,
		String markupSMRM, long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		List<VRLimitConfigTechSpec> list = findByVT_MU_DC(vehicleType,
				markupSMRM, searchingDriveConfig, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr limit config tech spec
	 * @throws NoSuchVRLimitConfigTechSpecException if a matching vr limit config tech spec could not be found
	 */
	@Override
	public VRLimitConfigTechSpec findByVT_MU_DC_Last(String vehicleType,
		String markupSMRM, long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws NoSuchVRLimitConfigTechSpecException {
		VRLimitConfigTechSpec vrLimitConfigTechSpec = fetchByVT_MU_DC_Last(vehicleType,
				markupSMRM, searchingDriveConfig, orderByComparator);

		if (vrLimitConfigTechSpec != null) {
			return vrLimitConfigTechSpec;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleType=");
		msg.append(vehicleType);

		msg.append(", markupSMRM=");
		msg.append(markupSMRM);

		msg.append(", searchingDriveConfig=");
		msg.append(searchingDriveConfig);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRLimitConfigTechSpecException(msg.toString());
	}

	/**
	 * Returns the last vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr limit config tech spec, or <code>null</code> if a matching vr limit config tech spec could not be found
	 */
	@Override
	public VRLimitConfigTechSpec fetchByVT_MU_DC_Last(String vehicleType,
		String markupSMRM, long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		int count = countByVT_MU_DC(vehicleType, markupSMRM,
				searchingDriveConfig);

		if (count == 0) {
			return null;
		}

		List<VRLimitConfigTechSpec> list = findByVT_MU_DC(vehicleType,
				markupSMRM, searchingDriveConfig, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr limit config tech specs before and after the current vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * @param id the primary key of the current vr limit config tech spec
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr limit config tech spec
	 * @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	 */
	@Override
	public VRLimitConfigTechSpec[] findByVT_MU_DC_PrevAndNext(long id,
		String vehicleType, String markupSMRM, long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws NoSuchVRLimitConfigTechSpecException {
		VRLimitConfigTechSpec vrLimitConfigTechSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRLimitConfigTechSpec[] array = new VRLimitConfigTechSpecImpl[3];

			array[0] = getByVT_MU_DC_PrevAndNext(session,
					vrLimitConfigTechSpec, vehicleType, markupSMRM,
					searchingDriveConfig, orderByComparator, true);

			array[1] = vrLimitConfigTechSpec;

			array[2] = getByVT_MU_DC_PrevAndNext(session,
					vrLimitConfigTechSpec, vehicleType, markupSMRM,
					searchingDriveConfig, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRLimitConfigTechSpec getByVT_MU_DC_PrevAndNext(Session session,
		VRLimitConfigTechSpec vrLimitConfigTechSpec, String vehicleType,
		String markupSMRM, long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRLIMITCONFIGTECHSPEC_WHERE);

		boolean bindVehicleType = false;

		if (vehicleType == null) {
			query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_1);
		}
		else if (vehicleType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_3);
		}
		else {
			bindVehicleType = true;

			query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_2);
		}

		boolean bindMarkupSMRM = false;

		if (markupSMRM == null) {
			query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_1);
		}
		else if (markupSMRM.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_3);
		}
		else {
			bindMarkupSMRM = true;

			query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_2);
		}

		query.append(_FINDER_COLUMN_VT_MU_DC_SEARCHINGDRIVECONFIG_2);

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
			query.append(VRLimitConfigTechSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleType) {
			qPos.add(vehicleType);
		}

		if (bindMarkupSMRM) {
			qPos.add(markupSMRM);
		}

		qPos.add(searchingDriveConfig);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrLimitConfigTechSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRLimitConfigTechSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63; from the database.
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 */
	@Override
	public void removeByVT_MU_DC(String vehicleType, String markupSMRM,
		long searchingDriveConfig) {
		for (VRLimitConfigTechSpec vrLimitConfigTechSpec : findByVT_MU_DC(
				vehicleType, markupSMRM, searchingDriveConfig,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrLimitConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	 *
	 * @param vehicleType the vehicle type
	 * @param markupSMRM the markup smrm
	 * @param searchingDriveConfig the searching drive config
	 * @return the number of matching vr limit config tech specs
	 */
	@Override
	public int countByVT_MU_DC(String vehicleType, String markupSMRM,
		long searchingDriveConfig) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VT_MU_DC;

		Object[] finderArgs = new Object[] {
				vehicleType, markupSMRM, searchingDriveConfig
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRLIMITCONFIGTECHSPEC_WHERE);

			boolean bindVehicleType = false;

			if (vehicleType == null) {
				query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_1);
			}
			else if (vehicleType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_3);
			}
			else {
				bindVehicleType = true;

				query.append(_FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_2);
			}

			boolean bindMarkupSMRM = false;

			if (markupSMRM == null) {
				query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_1);
			}
			else if (markupSMRM.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_3);
			}
			else {
				bindMarkupSMRM = true;

				query.append(_FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_2);
			}

			query.append(_FINDER_COLUMN_VT_MU_DC_SEARCHINGDRIVECONFIG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleType) {
					qPos.add(vehicleType);
				}

				if (bindMarkupSMRM) {
					qPos.add(markupSMRM);
				}

				qPos.add(searchingDriveConfig);

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

	private static final String _FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_1 = "vrLimitConfigTechSpec.vehicleType IS NULL AND ";
	private static final String _FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_2 = "vrLimitConfigTechSpec.vehicleType = ? AND ";
	private static final String _FINDER_COLUMN_VT_MU_DC_VEHICLETYPE_3 = "(vrLimitConfigTechSpec.vehicleType IS NULL OR vrLimitConfigTechSpec.vehicleType = '') AND ";
	private static final String _FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_1 = "vrLimitConfigTechSpec.markupSMRM IS NULL AND ";
	private static final String _FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_2 = "vrLimitConfigTechSpec.markupSMRM = ? AND ";
	private static final String _FINDER_COLUMN_VT_MU_DC_MARKUPSMRM_3 = "(vrLimitConfigTechSpec.markupSMRM IS NULL OR vrLimitConfigTechSpec.markupSMRM = '') AND ";
	private static final String _FINDER_COLUMN_VT_MU_DC_SEARCHINGDRIVECONFIG_2 = "vrLimitConfigTechSpec.searchingDriveConfig = ?";

	public VRLimitConfigTechSpecPersistenceImpl() {
		setModelClass(VRLimitConfigTechSpec.class);
	}

	/**
	 * Caches the vr limit config tech spec in the entity cache if it is enabled.
	 *
	 * @param vrLimitConfigTechSpec the vr limit config tech spec
	 */
	@Override
	public void cacheResult(VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		entityCache.putResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecImpl.class,
			vrLimitConfigTechSpec.getPrimaryKey(), vrLimitConfigTechSpec);

		vrLimitConfigTechSpec.resetOriginalValues();
	}

	/**
	 * Caches the vr limit config tech specs in the entity cache if it is enabled.
	 *
	 * @param vrLimitConfigTechSpecs the vr limit config tech specs
	 */
	@Override
	public void cacheResult(List<VRLimitConfigTechSpec> vrLimitConfigTechSpecs) {
		for (VRLimitConfigTechSpec vrLimitConfigTechSpec : vrLimitConfigTechSpecs) {
			if (entityCache.getResult(
						VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
						VRLimitConfigTechSpecImpl.class,
						vrLimitConfigTechSpec.getPrimaryKey()) == null) {
				cacheResult(vrLimitConfigTechSpec);
			}
			else {
				vrLimitConfigTechSpec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr limit config tech specs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRLimitConfigTechSpecImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr limit config tech spec.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		entityCache.removeResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecImpl.class,
			vrLimitConfigTechSpec.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRLimitConfigTechSpec> vrLimitConfigTechSpecs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRLimitConfigTechSpec vrLimitConfigTechSpec : vrLimitConfigTechSpecs) {
			entityCache.removeResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
				VRLimitConfigTechSpecImpl.class,
				vrLimitConfigTechSpec.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr limit config tech spec with the primary key. Does not add the vr limit config tech spec to the database.
	 *
	 * @param id the primary key for the new vr limit config tech spec
	 * @return the new vr limit config tech spec
	 */
	@Override
	public VRLimitConfigTechSpec create(long id) {
		VRLimitConfigTechSpec vrLimitConfigTechSpec = new VRLimitConfigTechSpecImpl();

		vrLimitConfigTechSpec.setNew(true);
		vrLimitConfigTechSpec.setPrimaryKey(id);

		return vrLimitConfigTechSpec;
	}

	/**
	 * Removes the vr limit config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr limit config tech spec
	 * @return the vr limit config tech spec that was removed
	 * @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	 */
	@Override
	public VRLimitConfigTechSpec remove(long id)
		throws NoSuchVRLimitConfigTechSpecException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr limit config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr limit config tech spec
	 * @return the vr limit config tech spec that was removed
	 * @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	 */
	@Override
	public VRLimitConfigTechSpec remove(Serializable primaryKey)
		throws NoSuchVRLimitConfigTechSpecException {
		Session session = null;

		try {
			session = openSession();

			VRLimitConfigTechSpec vrLimitConfigTechSpec = (VRLimitConfigTechSpec)session.get(VRLimitConfigTechSpecImpl.class,
					primaryKey);

			if (vrLimitConfigTechSpec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRLimitConfigTechSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrLimitConfigTechSpec);
		}
		catch (NoSuchVRLimitConfigTechSpecException nsee) {
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
	protected VRLimitConfigTechSpec removeImpl(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		vrLimitConfigTechSpec = toUnwrappedModel(vrLimitConfigTechSpec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrLimitConfigTechSpec)) {
				vrLimitConfigTechSpec = (VRLimitConfigTechSpec)session.get(VRLimitConfigTechSpecImpl.class,
						vrLimitConfigTechSpec.getPrimaryKeyObj());
			}

			if (vrLimitConfigTechSpec != null) {
				session.delete(vrLimitConfigTechSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrLimitConfigTechSpec != null) {
			clearCache(vrLimitConfigTechSpec);
		}

		return vrLimitConfigTechSpec;
	}

	@Override
	public VRLimitConfigTechSpec updateImpl(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		vrLimitConfigTechSpec = toUnwrappedModel(vrLimitConfigTechSpec);

		boolean isNew = vrLimitConfigTechSpec.isNew();

		VRLimitConfigTechSpecModelImpl vrLimitConfigTechSpecModelImpl = (VRLimitConfigTechSpecModelImpl)vrLimitConfigTechSpec;

		Session session = null;

		try {
			session = openSession();

			if (vrLimitConfigTechSpec.isNew()) {
				session.save(vrLimitConfigTechSpec);

				vrLimitConfigTechSpec.setNew(false);
			}
			else {
				vrLimitConfigTechSpec = (VRLimitConfigTechSpec)session.merge(vrLimitConfigTechSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRLimitConfigTechSpecModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrLimitConfigTechSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VT_MU_DC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrLimitConfigTechSpecModelImpl.getOriginalVehicleType(),
						vrLimitConfigTechSpecModelImpl.getOriginalMarkupSMRM(),
						vrLimitConfigTechSpecModelImpl.getOriginalSearchingDriveConfig()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VT_MU_DC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VT_MU_DC,
					args);

				args = new Object[] {
						vrLimitConfigTechSpecModelImpl.getVehicleType(),
						vrLimitConfigTechSpecModelImpl.getMarkupSMRM(),
						vrLimitConfigTechSpecModelImpl.getSearchingDriveConfig()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VT_MU_DC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VT_MU_DC,
					args);
			}
		}

		entityCache.putResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
			VRLimitConfigTechSpecImpl.class,
			vrLimitConfigTechSpec.getPrimaryKey(), vrLimitConfigTechSpec, false);

		vrLimitConfigTechSpec.resetOriginalValues();

		return vrLimitConfigTechSpec;
	}

	protected VRLimitConfigTechSpec toUnwrappedModel(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		if (vrLimitConfigTechSpec instanceof VRLimitConfigTechSpecImpl) {
			return vrLimitConfigTechSpec;
		}

		VRLimitConfigTechSpecImpl vrLimitConfigTechSpecImpl = new VRLimitConfigTechSpecImpl();

		vrLimitConfigTechSpecImpl.setNew(vrLimitConfigTechSpec.isNew());
		vrLimitConfigTechSpecImpl.setPrimaryKey(vrLimitConfigTechSpec.getPrimaryKey());

		vrLimitConfigTechSpecImpl.setId(vrLimitConfigTechSpec.getId());
		vrLimitConfigTechSpecImpl.setVehicleType(vrLimitConfigTechSpec.getVehicleType());
		vrLimitConfigTechSpecImpl.setVehicleTypeName(vrLimitConfigTechSpec.getVehicleTypeName());
		vrLimitConfigTechSpecImpl.setMarkupSMRM(vrLimitConfigTechSpec.getMarkupSMRM());
		vrLimitConfigTechSpecImpl.setSearchingDriveConfig(vrLimitConfigTechSpec.getSearchingDriveConfig());
		vrLimitConfigTechSpecImpl.setSearchingDriveConfigDesc(vrLimitConfigTechSpec.getSearchingDriveConfigDesc());
		vrLimitConfigTechSpecImpl.setSequenceNo(vrLimitConfigTechSpec.getSequenceNo());
		vrLimitConfigTechSpecImpl.setSpecificationCode(vrLimitConfigTechSpec.getSpecificationCode());
		vrLimitConfigTechSpecImpl.setSpecificationName(vrLimitConfigTechSpec.getSpecificationName());
		vrLimitConfigTechSpecImpl.setSynchDate(vrLimitConfigTechSpec.getSynchDate());

		return vrLimitConfigTechSpecImpl;
	}

	/**
	 * Returns the vr limit config tech spec with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr limit config tech spec
	 * @return the vr limit config tech spec
	 * @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	 */
	@Override
	public VRLimitConfigTechSpec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRLimitConfigTechSpecException {
		VRLimitConfigTechSpec vrLimitConfigTechSpec = fetchByPrimaryKey(primaryKey);

		if (vrLimitConfigTechSpec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRLimitConfigTechSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrLimitConfigTechSpec;
	}

	/**
	 * Returns the vr limit config tech spec with the primary key or throws a {@link NoSuchVRLimitConfigTechSpecException} if it could not be found.
	 *
	 * @param id the primary key of the vr limit config tech spec
	 * @return the vr limit config tech spec
	 * @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	 */
	@Override
	public VRLimitConfigTechSpec findByPrimaryKey(long id)
		throws NoSuchVRLimitConfigTechSpecException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr limit config tech spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr limit config tech spec
	 * @return the vr limit config tech spec, or <code>null</code> if a vr limit config tech spec with the primary key could not be found
	 */
	@Override
	public VRLimitConfigTechSpec fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
				VRLimitConfigTechSpecImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRLimitConfigTechSpec vrLimitConfigTechSpec = (VRLimitConfigTechSpec)serializable;

		if (vrLimitConfigTechSpec == null) {
			Session session = null;

			try {
				session = openSession();

				vrLimitConfigTechSpec = (VRLimitConfigTechSpec)session.get(VRLimitConfigTechSpecImpl.class,
						primaryKey);

				if (vrLimitConfigTechSpec != null) {
					cacheResult(vrLimitConfigTechSpec);
				}
				else {
					entityCache.putResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
						VRLimitConfigTechSpecImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
					VRLimitConfigTechSpecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrLimitConfigTechSpec;
	}

	/**
	 * Returns the vr limit config tech spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr limit config tech spec
	 * @return the vr limit config tech spec, or <code>null</code> if a vr limit config tech spec with the primary key could not be found
	 */
	@Override
	public VRLimitConfigTechSpec fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRLimitConfigTechSpec> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRLimitConfigTechSpec> map = new HashMap<Serializable, VRLimitConfigTechSpec>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRLimitConfigTechSpec vrLimitConfigTechSpec = fetchByPrimaryKey(primaryKey);

			if (vrLimitConfigTechSpec != null) {
				map.put(primaryKey, vrLimitConfigTechSpec);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
					VRLimitConfigTechSpecImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRLimitConfigTechSpec)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRLIMITCONFIGTECHSPEC_WHERE_PKS_IN);

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

			for (VRLimitConfigTechSpec vrLimitConfigTechSpec : (List<VRLimitConfigTechSpec>)q.list()) {
				map.put(vrLimitConfigTechSpec.getPrimaryKeyObj(),
					vrLimitConfigTechSpec);

				cacheResult(vrLimitConfigTechSpec);

				uncachedPrimaryKeys.remove(vrLimitConfigTechSpec.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRLimitConfigTechSpecModelImpl.ENTITY_CACHE_ENABLED,
					VRLimitConfigTechSpecImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr limit config tech specs.
	 *
	 * @return the vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr limit config tech specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr limit config tech specs
	 * @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	 * @return the range of vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr limit config tech specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr limit config tech specs
	 * @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> findAll(int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr limit config tech specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr limit config tech specs
	 * @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> findAll(int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator,
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

		List<VRLimitConfigTechSpec> list = null;

		if (retrieveFromCache) {
			list = (List<VRLimitConfigTechSpec>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRLIMITCONFIGTECHSPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRLIMITCONFIGTECHSPEC;

				if (pagination) {
					sql = sql.concat(VRLimitConfigTechSpecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRLimitConfigTechSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRLimitConfigTechSpec>)QueryUtil.list(q,
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
	 * Removes all the vr limit config tech specs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRLimitConfigTechSpec vrLimitConfigTechSpec : findAll()) {
			remove(vrLimitConfigTechSpec);
		}
	}

	/**
	 * Returns the number of vr limit config tech specs.
	 *
	 * @return the number of vr limit config tech specs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRLIMITCONFIGTECHSPEC);

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
		return VRLimitConfigTechSpecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr limit config tech spec persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRLimitConfigTechSpecImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRLIMITCONFIGTECHSPEC = "SELECT vrLimitConfigTechSpec FROM VRLimitConfigTechSpec vrLimitConfigTechSpec";
	private static final String _SQL_SELECT_VRLIMITCONFIGTECHSPEC_WHERE_PKS_IN = "SELECT vrLimitConfigTechSpec FROM VRLimitConfigTechSpec vrLimitConfigTechSpec WHERE id IN (";
	private static final String _SQL_SELECT_VRLIMITCONFIGTECHSPEC_WHERE = "SELECT vrLimitConfigTechSpec FROM VRLimitConfigTechSpec vrLimitConfigTechSpec WHERE ";
	private static final String _SQL_COUNT_VRLIMITCONFIGTECHSPEC = "SELECT COUNT(vrLimitConfigTechSpec) FROM VRLimitConfigTechSpec vrLimitConfigTechSpec";
	private static final String _SQL_COUNT_VRLIMITCONFIGTECHSPEC_WHERE = "SELECT COUNT(vrLimitConfigTechSpec) FROM VRLimitConfigTechSpec vrLimitConfigTechSpec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrLimitConfigTechSpec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRLimitConfigTechSpec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRLimitConfigTechSpec exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRLimitConfigTechSpecPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleType", "vehicleTypeName", "markupSMRM",
				"searchingDriveConfig", "searchingDriveConfigDesc", "sequenceNo",
				"specificationCode", "specificationName", "synchDate"
			});
}