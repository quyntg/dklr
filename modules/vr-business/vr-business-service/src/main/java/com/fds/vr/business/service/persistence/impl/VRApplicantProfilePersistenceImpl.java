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

import com.fds.vr.business.exception.NoSuchVRApplicantProfileException;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.impl.VRApplicantProfileImpl;
import com.fds.vr.business.model.impl.VRApplicantProfileModelImpl;
import com.fds.vr.business.service.persistence.VRApplicantProfilePersistence;

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
 * The persistence implementation for the vr applicant profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfilePersistence
 * @see com.fds.vr.business.service.persistence.VRApplicantProfileUtil
 * @generated
 */
@ProviderType
public class VRApplicantProfilePersistenceImpl extends BasePersistenceImpl<VRApplicantProfile>
	implements VRApplicantProfilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRApplicantProfileUtil} to access the vr applicant profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRApplicantProfileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_APPLICANTCODE = new FinderPath(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByapplicantCode", new String[] { String.class.getName() },
			VRApplicantProfileModelImpl.APPLICANTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTCODE = new FinderPath(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByapplicantCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the vr applicant profile where applicantCode = &#63; or throws a {@link NoSuchVRApplicantProfileException} if it could not be found.
	 *
	 * @param applicantCode the applicant code
	 * @return the matching vr applicant profile
	 * @throws NoSuchVRApplicantProfileException if a matching vr applicant profile could not be found
	 */
	@Override
	public VRApplicantProfile findByapplicantCode(String applicantCode)
		throws NoSuchVRApplicantProfileException {
		VRApplicantProfile vrApplicantProfile = fetchByapplicantCode(applicantCode);

		if (vrApplicantProfile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("applicantCode=");
			msg.append(applicantCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRApplicantProfileException(msg.toString());
		}

		return vrApplicantProfile;
	}

	/**
	 * Returns the vr applicant profile where applicantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicantCode the applicant code
	 * @return the matching vr applicant profile, or <code>null</code> if a matching vr applicant profile could not be found
	 */
	@Override
	public VRApplicantProfile fetchByapplicantCode(String applicantCode) {
		return fetchByapplicantCode(applicantCode, true);
	}

	/**
	 * Returns the vr applicant profile where applicantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicantCode the applicant code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr applicant profile, or <code>null</code> if a matching vr applicant profile could not be found
	 */
	@Override
	public VRApplicantProfile fetchByapplicantCode(String applicantCode,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { applicantCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_APPLICANTCODE,
					finderArgs, this);
		}

		if (result instanceof VRApplicantProfile) {
			VRApplicantProfile vrApplicantProfile = (VRApplicantProfile)result;

			if (!Objects.equals(applicantCode,
						vrApplicantProfile.getApplicantCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRAPPLICANTPROFILE_WHERE);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2);
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

				List<VRApplicantProfile> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_APPLICANTCODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRApplicantProfilePersistenceImpl.fetchByapplicantCode(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRApplicantProfile vrApplicantProfile = list.get(0);

					result = vrApplicantProfile;

					cacheResult(vrApplicantProfile);

					if ((vrApplicantProfile.getApplicantCode() == null) ||
							!vrApplicantProfile.getApplicantCode()
												   .equals(applicantCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_APPLICANTCODE,
							finderArgs, vrApplicantProfile);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_APPLICANTCODE,
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
			return (VRApplicantProfile)result;
		}
	}

	/**
	 * Removes the vr applicant profile where applicantCode = &#63; from the database.
	 *
	 * @param applicantCode the applicant code
	 * @return the vr applicant profile that was removed
	 */
	@Override
	public VRApplicantProfile removeByapplicantCode(String applicantCode)
		throws NoSuchVRApplicantProfileException {
		VRApplicantProfile vrApplicantProfile = findByapplicantCode(applicantCode);

		return remove(vrApplicantProfile);
	}

	/**
	 * Returns the number of vr applicant profiles where applicantCode = &#63;.
	 *
	 * @param applicantCode the applicant code
	 * @return the number of matching vr applicant profiles
	 */
	@Override
	public int countByapplicantCode(String applicantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTCODE;

		Object[] finderArgs = new Object[] { applicantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRAPPLICANTPROFILE_WHERE);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2);
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

	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1 = "vrApplicantProfile.applicantCode IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2 = "vrApplicantProfile.applicantCode = ?";
	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3 = "(vrApplicantProfile.applicantCode IS NULL OR vrApplicantProfile.applicantCode = '')";

	public VRApplicantProfilePersistenceImpl() {
		setModelClass(VRApplicantProfile.class);
	}

	/**
	 * Caches the vr applicant profile in the entity cache if it is enabled.
	 *
	 * @param vrApplicantProfile the vr applicant profile
	 */
	@Override
	public void cacheResult(VRApplicantProfile vrApplicantProfile) {
		entityCache.putResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileImpl.class, vrApplicantProfile.getPrimaryKey(),
			vrApplicantProfile);

		finderCache.putResult(FINDER_PATH_FETCH_BY_APPLICANTCODE,
			new Object[] { vrApplicantProfile.getApplicantCode() },
			vrApplicantProfile);

		vrApplicantProfile.resetOriginalValues();
	}

	/**
	 * Caches the vr applicant profiles in the entity cache if it is enabled.
	 *
	 * @param vrApplicantProfiles the vr applicant profiles
	 */
	@Override
	public void cacheResult(List<VRApplicantProfile> vrApplicantProfiles) {
		for (VRApplicantProfile vrApplicantProfile : vrApplicantProfiles) {
			if (entityCache.getResult(
						VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
						VRApplicantProfileImpl.class,
						vrApplicantProfile.getPrimaryKey()) == null) {
				cacheResult(vrApplicantProfile);
			}
			else {
				vrApplicantProfile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr applicant profiles.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRApplicantProfileImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr applicant profile.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRApplicantProfile vrApplicantProfile) {
		entityCache.removeResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileImpl.class, vrApplicantProfile.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRApplicantProfileModelImpl)vrApplicantProfile,
			true);
	}

	@Override
	public void clearCache(List<VRApplicantProfile> vrApplicantProfiles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRApplicantProfile vrApplicantProfile : vrApplicantProfiles) {
			entityCache.removeResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
				VRApplicantProfileImpl.class, vrApplicantProfile.getPrimaryKey());

			clearUniqueFindersCache((VRApplicantProfileModelImpl)vrApplicantProfile,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRApplicantProfileModelImpl vrApplicantProfileModelImpl) {
		Object[] args = new Object[] {
				vrApplicantProfileModelImpl.getApplicantCode()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_APPLICANTCODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_APPLICANTCODE, args,
			vrApplicantProfileModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRApplicantProfileModelImpl vrApplicantProfileModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrApplicantProfileModelImpl.getApplicantCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTCODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_APPLICANTCODE, args);
		}

		if ((vrApplicantProfileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_APPLICANTCODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrApplicantProfileModelImpl.getOriginalApplicantCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTCODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_APPLICANTCODE, args);
		}
	}

	/**
	 * Creates a new vr applicant profile with the primary key. Does not add the vr applicant profile to the database.
	 *
	 * @param id the primary key for the new vr applicant profile
	 * @return the new vr applicant profile
	 */
	@Override
	public VRApplicantProfile create(long id) {
		VRApplicantProfile vrApplicantProfile = new VRApplicantProfileImpl();

		vrApplicantProfile.setNew(true);
		vrApplicantProfile.setPrimaryKey(id);

		return vrApplicantProfile;
	}

	/**
	 * Removes the vr applicant profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr applicant profile
	 * @return the vr applicant profile that was removed
	 * @throws NoSuchVRApplicantProfileException if a vr applicant profile with the primary key could not be found
	 */
	@Override
	public VRApplicantProfile remove(long id)
		throws NoSuchVRApplicantProfileException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr applicant profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr applicant profile
	 * @return the vr applicant profile that was removed
	 * @throws NoSuchVRApplicantProfileException if a vr applicant profile with the primary key could not be found
	 */
	@Override
	public VRApplicantProfile remove(Serializable primaryKey)
		throws NoSuchVRApplicantProfileException {
		Session session = null;

		try {
			session = openSession();

			VRApplicantProfile vrApplicantProfile = (VRApplicantProfile)session.get(VRApplicantProfileImpl.class,
					primaryKey);

			if (vrApplicantProfile == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRApplicantProfileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrApplicantProfile);
		}
		catch (NoSuchVRApplicantProfileException nsee) {
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
	protected VRApplicantProfile removeImpl(
		VRApplicantProfile vrApplicantProfile) {
		vrApplicantProfile = toUnwrappedModel(vrApplicantProfile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrApplicantProfile)) {
				vrApplicantProfile = (VRApplicantProfile)session.get(VRApplicantProfileImpl.class,
						vrApplicantProfile.getPrimaryKeyObj());
			}

			if (vrApplicantProfile != null) {
				session.delete(vrApplicantProfile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrApplicantProfile != null) {
			clearCache(vrApplicantProfile);
		}

		return vrApplicantProfile;
	}

	@Override
	public VRApplicantProfile updateImpl(VRApplicantProfile vrApplicantProfile) {
		vrApplicantProfile = toUnwrappedModel(vrApplicantProfile);

		boolean isNew = vrApplicantProfile.isNew();

		VRApplicantProfileModelImpl vrApplicantProfileModelImpl = (VRApplicantProfileModelImpl)vrApplicantProfile;

		Session session = null;

		try {
			session = openSession();

			if (vrApplicantProfile.isNew()) {
				session.save(vrApplicantProfile);

				vrApplicantProfile.setNew(false);
			}
			else {
				vrApplicantProfile = (VRApplicantProfile)session.merge(vrApplicantProfile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRApplicantProfileModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileImpl.class, vrApplicantProfile.getPrimaryKey(),
			vrApplicantProfile, false);

		clearUniqueFindersCache(vrApplicantProfileModelImpl, false);
		cacheUniqueFindersCache(vrApplicantProfileModelImpl);

		vrApplicantProfile.resetOriginalValues();

		return vrApplicantProfile;
	}

	protected VRApplicantProfile toUnwrappedModel(
		VRApplicantProfile vrApplicantProfile) {
		if (vrApplicantProfile instanceof VRApplicantProfileImpl) {
			return vrApplicantProfile;
		}

		VRApplicantProfileImpl vrApplicantProfileImpl = new VRApplicantProfileImpl();

		vrApplicantProfileImpl.setNew(vrApplicantProfile.isNew());
		vrApplicantProfileImpl.setPrimaryKey(vrApplicantProfile.getPrimaryKey());

		vrApplicantProfileImpl.setId(vrApplicantProfile.getId());
		vrApplicantProfileImpl.setMtCore(vrApplicantProfile.getMtCore());
		vrApplicantProfileImpl.setMappingMA_CTY(vrApplicantProfile.getMappingMA_CTY());
		vrApplicantProfileImpl.setMappingTEN_CTY(vrApplicantProfile.getMappingTEN_CTY());
		vrApplicantProfileImpl.setMappingDIA_CHI_CTY(vrApplicantProfile.getMappingDIA_CHI_CTY());
		vrApplicantProfileImpl.setMappingNote(vrApplicantProfile.getMappingNote());
		vrApplicantProfileImpl.setMappingStatus(vrApplicantProfile.getMappingStatus());
		vrApplicantProfileImpl.setApplicantCode(vrApplicantProfile.getApplicantCode());
		vrApplicantProfileImpl.setApplicantName(vrApplicantProfile.getApplicantName());
		vrApplicantProfileImpl.setApplicantAddress(vrApplicantProfile.getApplicantAddress());
		vrApplicantProfileImpl.setApplicantPhone(vrApplicantProfile.getApplicantPhone());
		vrApplicantProfileImpl.setApplicantEmail(vrApplicantProfile.getApplicantEmail());
		vrApplicantProfileImpl.setApplicantFax(vrApplicantProfile.getApplicantFax());
		vrApplicantProfileImpl.setApplicantWebsite(vrApplicantProfile.getApplicantWebsite());
		vrApplicantProfileImpl.setApplicantRepresentativePhone(vrApplicantProfile.getApplicantRepresentativePhone());
		vrApplicantProfileImpl.setApplicantRepresentative(vrApplicantProfile.getApplicantRepresentative());
		vrApplicantProfileImpl.setApplicantRepresentativeTitle(vrApplicantProfile.getApplicantRepresentativeTitle());
		vrApplicantProfileImpl.setApplicantContactName(vrApplicantProfile.getApplicantContactName());
		vrApplicantProfileImpl.setApplicantContactEmail(vrApplicantProfile.getApplicantContactEmail());
		vrApplicantProfileImpl.setApplicantContactPhone(vrApplicantProfile.getApplicantContactPhone());
		vrApplicantProfileImpl.setApplicantNationality(vrApplicantProfile.getApplicantNationality());
		vrApplicantProfileImpl.setApplicantNationalityCode(vrApplicantProfile.getApplicantNationalityCode());
		vrApplicantProfileImpl.setApplicantRegion(vrApplicantProfile.getApplicantRegion());
		vrApplicantProfileImpl.setApplicantRegionCode(vrApplicantProfile.getApplicantRegionCode());
		vrApplicantProfileImpl.setApplicantCity(vrApplicantProfile.getApplicantCity());
		vrApplicantProfileImpl.setApplicantCityCode(vrApplicantProfile.getApplicantCityCode());
		vrApplicantProfileImpl.setApplicantDistrictCode(vrApplicantProfile.getApplicantDistrictCode());
		vrApplicantProfileImpl.setApplicantDistrictName(vrApplicantProfile.getApplicantDistrictName());
		vrApplicantProfileImpl.setApplicantWardCode(vrApplicantProfile.getApplicantWardCode());
		vrApplicantProfileImpl.setApplicantWardName(vrApplicantProfile.getApplicantWardName());
		vrApplicantProfileImpl.setMarkupCorporation(vrApplicantProfile.getMarkupCorporation());
		vrApplicantProfileImpl.setCorporationId(vrApplicantProfile.getCorporationId());
		vrApplicantProfileImpl.setMarkupDesigner(vrApplicantProfile.getMarkupDesigner());
		vrApplicantProfileImpl.setMarkupOverseasManufacturer(vrApplicantProfile.getMarkupOverseasManufacturer());
		vrApplicantProfileImpl.setMarkupDomesticsManufacturer(vrApplicantProfile.getMarkupDomesticsManufacturer());
		vrApplicantProfileImpl.setMarkupMaintainer(vrApplicantProfile.getMarkupMaintainer());
		vrApplicantProfileImpl.setMarkupImporter(vrApplicantProfile.getMarkupImporter());
		vrApplicantProfileImpl.setMarkupComponentXCG(vrApplicantProfile.getMarkupComponentXCG());
		vrApplicantProfileImpl.setMarkupComponentXMY(vrApplicantProfile.getMarkupComponentXMY());
		vrApplicantProfileImpl.setMarkupComponentXCD(vrApplicantProfile.getMarkupComponentXCD());
		vrApplicantProfileImpl.setMarkupComponentXDD(vrApplicantProfile.getMarkupComponentXDD());
		vrApplicantProfileImpl.setMarkupComponentXCN(vrApplicantProfile.getMarkupComponentXCN());
		vrApplicantProfileImpl.setMarkupComponentXCH(vrApplicantProfile.getMarkupComponentXCH());
		vrApplicantProfileImpl.setMarkupXCG(vrApplicantProfile.getMarkupXCG());
		vrApplicantProfileImpl.setMarkupXMY(vrApplicantProfile.getMarkupXMY());
		vrApplicantProfileImpl.setMarkupXCD(vrApplicantProfile.getMarkupXCD());
		vrApplicantProfileImpl.setMarkupXDD(vrApplicantProfile.getMarkupXDD());
		vrApplicantProfileImpl.setMarkupXCN(vrApplicantProfile.getMarkupXCN());
		vrApplicantProfileImpl.setMarkupXCH(vrApplicantProfile.getMarkupXCH());
		vrApplicantProfileImpl.setIssueTypeXCG(vrApplicantProfile.getIssueTypeXCG());
		vrApplicantProfileImpl.setIssueTypeXMY(vrApplicantProfile.getIssueTypeXMY());
		vrApplicantProfileImpl.setIssueTypeXCD(vrApplicantProfile.getIssueTypeXCD());
		vrApplicantProfileImpl.setIssueTypeXDD(vrApplicantProfile.getIssueTypeXDD());
		vrApplicantProfileImpl.setIssueTypeXCN(vrApplicantProfile.getIssueTypeXCN());
		vrApplicantProfileImpl.setIssueTypeXCH(vrApplicantProfile.getIssueTypeXCH());
		vrApplicantProfileImpl.setIssueTypeDescription(vrApplicantProfile.getIssueTypeDescription());
		vrApplicantProfileImpl.setApplicantCeremonyDate(vrApplicantProfile.getApplicantCeremonyDate());
		vrApplicantProfileImpl.setApplicantOperationPeriod(vrApplicantProfile.getApplicantOperationPeriod());
		vrApplicantProfileImpl.setApplicantBusinessType(vrApplicantProfile.getApplicantBusinessType());
		vrApplicantProfileImpl.setApplicantIdentityType(vrApplicantProfile.getApplicantIdentityType());
		vrApplicantProfileImpl.setApplicantIdentityDescription(vrApplicantProfile.getApplicantIdentityDescription());
		vrApplicantProfileImpl.setApplicantIdentityFileName(vrApplicantProfile.getApplicantIdentityFileName());
		vrApplicantProfileImpl.setApplicantIdentityFileEntryId(vrApplicantProfile.getApplicantIdentityFileEntryId());
		vrApplicantProfileImpl.setApplicantXcgFileName(vrApplicantProfile.getApplicantXcgFileName());
		vrApplicantProfileImpl.setApplicantXcgFileEntryId(vrApplicantProfile.getApplicantXcgFileEntryId());
		vrApplicantProfileImpl.setApplicantMetadata(vrApplicantProfile.getApplicantMetadata());
		vrApplicantProfileImpl.setApplicantStatus(vrApplicantProfile.getApplicantStatus());
		vrApplicantProfileImpl.setModifyDate(vrApplicantProfile.getModifyDate());
		vrApplicantProfileImpl.setSyncDate(vrApplicantProfile.getSyncDate());

		return vrApplicantProfileImpl;
	}

	/**
	 * Returns the vr applicant profile with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr applicant profile
	 * @return the vr applicant profile
	 * @throws NoSuchVRApplicantProfileException if a vr applicant profile with the primary key could not be found
	 */
	@Override
	public VRApplicantProfile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRApplicantProfileException {
		VRApplicantProfile vrApplicantProfile = fetchByPrimaryKey(primaryKey);

		if (vrApplicantProfile == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRApplicantProfileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrApplicantProfile;
	}

	/**
	 * Returns the vr applicant profile with the primary key or throws a {@link NoSuchVRApplicantProfileException} if it could not be found.
	 *
	 * @param id the primary key of the vr applicant profile
	 * @return the vr applicant profile
	 * @throws NoSuchVRApplicantProfileException if a vr applicant profile with the primary key could not be found
	 */
	@Override
	public VRApplicantProfile findByPrimaryKey(long id)
		throws NoSuchVRApplicantProfileException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr applicant profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr applicant profile
	 * @return the vr applicant profile, or <code>null</code> if a vr applicant profile with the primary key could not be found
	 */
	@Override
	public VRApplicantProfile fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
				VRApplicantProfileImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRApplicantProfile vrApplicantProfile = (VRApplicantProfile)serializable;

		if (vrApplicantProfile == null) {
			Session session = null;

			try {
				session = openSession();

				vrApplicantProfile = (VRApplicantProfile)session.get(VRApplicantProfileImpl.class,
						primaryKey);

				if (vrApplicantProfile != null) {
					cacheResult(vrApplicantProfile);
				}
				else {
					entityCache.putResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
						VRApplicantProfileImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
					VRApplicantProfileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrApplicantProfile;
	}

	/**
	 * Returns the vr applicant profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr applicant profile
	 * @return the vr applicant profile, or <code>null</code> if a vr applicant profile with the primary key could not be found
	 */
	@Override
	public VRApplicantProfile fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRApplicantProfile> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRApplicantProfile> map = new HashMap<Serializable, VRApplicantProfile>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRApplicantProfile vrApplicantProfile = fetchByPrimaryKey(primaryKey);

			if (vrApplicantProfile != null) {
				map.put(primaryKey, vrApplicantProfile);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
					VRApplicantProfileImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRApplicantProfile)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRAPPLICANTPROFILE_WHERE_PKS_IN);

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

			for (VRApplicantProfile vrApplicantProfile : (List<VRApplicantProfile>)q.list()) {
				map.put(vrApplicantProfile.getPrimaryKeyObj(),
					vrApplicantProfile);

				cacheResult(vrApplicantProfile);

				uncachedPrimaryKeys.remove(vrApplicantProfile.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRApplicantProfileModelImpl.ENTITY_CACHE_ENABLED,
					VRApplicantProfileImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr applicant profiles.
	 *
	 * @return the vr applicant profiles
	 */
	@Override
	public List<VRApplicantProfile> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr applicant profiles
	 * @param end the upper bound of the range of vr applicant profiles (not inclusive)
	 * @return the range of vr applicant profiles
	 */
	@Override
	public List<VRApplicantProfile> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr applicant profiles
	 * @param end the upper bound of the range of vr applicant profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr applicant profiles
	 */
	@Override
	public List<VRApplicantProfile> findAll(int start, int end,
		OrderByComparator<VRApplicantProfile> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr applicant profiles
	 * @param end the upper bound of the range of vr applicant profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr applicant profiles
	 */
	@Override
	public List<VRApplicantProfile> findAll(int start, int end,
		OrderByComparator<VRApplicantProfile> orderByComparator,
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

		List<VRApplicantProfile> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfile>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRAPPLICANTPROFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRAPPLICANTPROFILE;

				if (pagination) {
					sql = sql.concat(VRApplicantProfileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRApplicantProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfile>)QueryUtil.list(q,
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
	 * Removes all the vr applicant profiles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRApplicantProfile vrApplicantProfile : findAll()) {
			remove(vrApplicantProfile);
		}
	}

	/**
	 * Returns the number of vr applicant profiles.
	 *
	 * @return the number of vr applicant profiles
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRAPPLICANTPROFILE);

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
		return VRApplicantProfileModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr applicant profile persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRApplicantProfileImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRAPPLICANTPROFILE = "SELECT vrApplicantProfile FROM VRApplicantProfile vrApplicantProfile";
	private static final String _SQL_SELECT_VRAPPLICANTPROFILE_WHERE_PKS_IN = "SELECT vrApplicantProfile FROM VRApplicantProfile vrApplicantProfile WHERE id IN (";
	private static final String _SQL_SELECT_VRAPPLICANTPROFILE_WHERE = "SELECT vrApplicantProfile FROM VRApplicantProfile vrApplicantProfile WHERE ";
	private static final String _SQL_COUNT_VRAPPLICANTPROFILE = "SELECT COUNT(vrApplicantProfile) FROM VRApplicantProfile vrApplicantProfile";
	private static final String _SQL_COUNT_VRAPPLICANTPROFILE_WHERE = "SELECT COUNT(vrApplicantProfile) FROM VRApplicantProfile vrApplicantProfile WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrApplicantProfile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRApplicantProfile exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRApplicantProfile exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRApplicantProfilePersistenceImpl.class);
}