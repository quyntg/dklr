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

package org.opencps.dossiermgt.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.opencps.dossiermgt.exception.NoSuchDossierTemplateException;
import org.opencps.dossiermgt.model.DossierTemplate;

/**
 * The persistence interface for the dossier template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see org.opencps.dossiermgt.service.persistence.impl.DossierTemplatePersistenceImpl
 * @see DossierTemplateUtil
 * @generated
 */
@ProviderType
public interface DossierTemplatePersistence extends BasePersistence<DossierTemplate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierTemplateUtil} to access the dossier template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dossier templates where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching dossier templates
	*/
	public java.util.List<DossierTemplate> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the dossier templates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @return the range of matching dossier templates
	*/
	public java.util.List<DossierTemplate> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the dossier templates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier templates
	*/
	public java.util.List<DossierTemplate> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator);

	/**
	* Returns an ordered range of all the dossier templates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier templates
	*/
	public java.util.List<DossierTemplate> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier template in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier template
	* @throws NoSuchDossierTemplateException if a matching dossier template could not be found
	*/
	public DossierTemplate findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator)
		throws NoSuchDossierTemplateException;

	/**
	* Returns the first dossier template in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator);

	/**
	* Returns the last dossier template in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier template
	* @throws NoSuchDossierTemplateException if a matching dossier template could not be found
	*/
	public DossierTemplate findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator)
		throws NoSuchDossierTemplateException;

	/**
	* Returns the last dossier template in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator);

	/**
	* Returns the dossier templates before and after the current dossier template in the ordered set where uuid = &#63;.
	*
	* @param dossierTemplateId the primary key of the current dossier template
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier template
	* @throws NoSuchDossierTemplateException if a dossier template with the primary key could not be found
	*/
	public DossierTemplate[] findByUuid_PrevAndNext(long dossierTemplateId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator)
		throws NoSuchDossierTemplateException;

	/**
	* Removes all the dossier templates where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of dossier templates where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching dossier templates
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the dossier template where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDossierTemplateException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier template
	* @throws NoSuchDossierTemplateException if a matching dossier template could not be found
	*/
	public DossierTemplate findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDossierTemplateException;

	/**
	* Returns the dossier template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the dossier template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the dossier template where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dossier template that was removed
	*/
	public DossierTemplate removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDossierTemplateException;

	/**
	* Returns the number of dossier templates where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching dossier templates
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the dossier templates where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching dossier templates
	*/
	public java.util.List<DossierTemplate> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the dossier templates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @return the range of matching dossier templates
	*/
	public java.util.List<DossierTemplate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the dossier templates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier templates
	*/
	public java.util.List<DossierTemplate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator);

	/**
	* Returns an ordered range of all the dossier templates where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier templates
	*/
	public java.util.List<DossierTemplate> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier template in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier template
	* @throws NoSuchDossierTemplateException if a matching dossier template could not be found
	*/
	public DossierTemplate findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator)
		throws NoSuchDossierTemplateException;

	/**
	* Returns the first dossier template in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator);

	/**
	* Returns the last dossier template in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier template
	* @throws NoSuchDossierTemplateException if a matching dossier template could not be found
	*/
	public DossierTemplate findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator)
		throws NoSuchDossierTemplateException;

	/**
	* Returns the last dossier template in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator);

	/**
	* Returns the dossier templates before and after the current dossier template in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param dossierTemplateId the primary key of the current dossier template
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier template
	* @throws NoSuchDossierTemplateException if a dossier template with the primary key could not be found
	*/
	public DossierTemplate[] findByUuid_C_PrevAndNext(long dossierTemplateId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator)
		throws NoSuchDossierTemplateException;

	/**
	* Removes all the dossier templates where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of dossier templates where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching dossier templates
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the dossier template where groupId = &#63; and templateName = &#63; or throws a {@link NoSuchDossierTemplateException} if it could not be found.
	*
	* @param groupId the group ID
	* @param templateName the template name
	* @return the matching dossier template
	* @throws NoSuchDossierTemplateException if a matching dossier template could not be found
	*/
	public DossierTemplate findByG_DT_NAME(long groupId,
		java.lang.String templateName) throws NoSuchDossierTemplateException;

	/**
	* Returns the dossier template where groupId = &#63; and templateName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param templateName the template name
	* @return the matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByG_DT_NAME(long groupId,
		java.lang.String templateName);

	/**
	* Returns the dossier template where groupId = &#63; and templateName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param templateName the template name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByG_DT_NAME(long groupId,
		java.lang.String templateName, boolean retrieveFromCache);

	/**
	* Removes the dossier template where groupId = &#63; and templateName = &#63; from the database.
	*
	* @param groupId the group ID
	* @param templateName the template name
	* @return the dossier template that was removed
	*/
	public DossierTemplate removeByG_DT_NAME(long groupId,
		java.lang.String templateName) throws NoSuchDossierTemplateException;

	/**
	* Returns the number of dossier templates where groupId = &#63; and templateName = &#63;.
	*
	* @param groupId the group ID
	* @param templateName the template name
	* @return the number of matching dossier templates
	*/
	public int countByG_DT_NAME(long groupId, java.lang.String templateName);

	/**
	* Returns the dossier template where groupId = &#63; and templateNo = &#63; or throws a {@link NoSuchDossierTemplateException} if it could not be found.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the matching dossier template
	* @throws NoSuchDossierTemplateException if a matching dossier template could not be found
	*/
	public DossierTemplate findByG_DT_TPLNO(long groupId,
		java.lang.String templateNo) throws NoSuchDossierTemplateException;

	/**
	* Returns the dossier template where groupId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByG_DT_TPLNO(long groupId,
		java.lang.String templateNo);

	/**
	* Returns the dossier template where groupId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByG_DT_TPLNO(long groupId,
		java.lang.String templateNo, boolean retrieveFromCache);

	/**
	* Removes the dossier template where groupId = &#63; and templateNo = &#63; from the database.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the dossier template that was removed
	*/
	public DossierTemplate removeByG_DT_TPLNO(long groupId,
		java.lang.String templateNo) throws NoSuchDossierTemplateException;

	/**
	* Returns the number of dossier templates where groupId = &#63; and templateNo = &#63;.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the number of matching dossier templates
	*/
	public int countByG_DT_TPLNO(long groupId, java.lang.String templateNo);

	/**
	* Returns the dossier template where groupId = &#63; and templateNo = &#63; or throws a {@link NoSuchDossierTemplateException} if it could not be found.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the matching dossier template
	* @throws NoSuchDossierTemplateException if a matching dossier template could not be found
	*/
	public DossierTemplate findByGID_DTPLNO(long groupId,
		java.lang.String templateNo) throws NoSuchDossierTemplateException;

	/**
	* Returns the dossier template where groupId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByGID_DTPLNO(long groupId,
		java.lang.String templateNo);

	/**
	* Returns the dossier template where groupId = &#63; and templateNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier template, or <code>null</code> if a matching dossier template could not be found
	*/
	public DossierTemplate fetchByGID_DTPLNO(long groupId,
		java.lang.String templateNo, boolean retrieveFromCache);

	/**
	* Removes the dossier template where groupId = &#63; and templateNo = &#63; from the database.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the dossier template that was removed
	*/
	public DossierTemplate removeByGID_DTPLNO(long groupId,
		java.lang.String templateNo) throws NoSuchDossierTemplateException;

	/**
	* Returns the number of dossier templates where groupId = &#63; and templateNo = &#63;.
	*
	* @param groupId the group ID
	* @param templateNo the template no
	* @return the number of matching dossier templates
	*/
	public int countByGID_DTPLNO(long groupId, java.lang.String templateNo);

	/**
	* Caches the dossier template in the entity cache if it is enabled.
	*
	* @param dossierTemplate the dossier template
	*/
	public void cacheResult(DossierTemplate dossierTemplate);

	/**
	* Caches the dossier templates in the entity cache if it is enabled.
	*
	* @param dossierTemplates the dossier templates
	*/
	public void cacheResult(java.util.List<DossierTemplate> dossierTemplates);

	/**
	* Creates a new dossier template with the primary key. Does not add the dossier template to the database.
	*
	* @param dossierTemplateId the primary key for the new dossier template
	* @return the new dossier template
	*/
	public DossierTemplate create(long dossierTemplateId);

	/**
	* Removes the dossier template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierTemplateId the primary key of the dossier template
	* @return the dossier template that was removed
	* @throws NoSuchDossierTemplateException if a dossier template with the primary key could not be found
	*/
	public DossierTemplate remove(long dossierTemplateId)
		throws NoSuchDossierTemplateException;

	public DossierTemplate updateImpl(DossierTemplate dossierTemplate);

	/**
	* Returns the dossier template with the primary key or throws a {@link NoSuchDossierTemplateException} if it could not be found.
	*
	* @param dossierTemplateId the primary key of the dossier template
	* @return the dossier template
	* @throws NoSuchDossierTemplateException if a dossier template with the primary key could not be found
	*/
	public DossierTemplate findByPrimaryKey(long dossierTemplateId)
		throws NoSuchDossierTemplateException;

	/**
	* Returns the dossier template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierTemplateId the primary key of the dossier template
	* @return the dossier template, or <code>null</code> if a dossier template with the primary key could not be found
	*/
	public DossierTemplate fetchByPrimaryKey(long dossierTemplateId);

	@Override
	public java.util.Map<java.io.Serializable, DossierTemplate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the dossier templates.
	*
	* @return the dossier templates
	*/
	public java.util.List<DossierTemplate> findAll();

	/**
	* Returns a range of all the dossier templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @return the range of dossier templates
	*/
	public java.util.List<DossierTemplate> findAll(int start, int end);

	/**
	* Returns an ordered range of all the dossier templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier templates
	*/
	public java.util.List<DossierTemplate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator);

	/**
	* Returns an ordered range of all the dossier templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier templates
	* @param end the upper bound of the range of dossier templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dossier templates
	*/
	public java.util.List<DossierTemplate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the dossier templates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of dossier templates.
	*
	* @return the number of dossier templates
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}