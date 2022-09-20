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

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRExpireCertificate;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for VRExpireCertificate. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRExpireCertificateLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRExpireCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRExpireCertificateLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRExpireCertificateLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRExpireCertificateLocalServiceUtil} to access the vr expire certificate local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRExpireCertificateLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr expire certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vrExpireCertificate the vr expire certificate
	* @return the vr expire certificate that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRExpireCertificate addVRExpireCertificate(
		VRExpireCertificate vrExpireCertificate);

	/**
	* Creates a new vr expire certificate with the primary key. Does not add the vr expire certificate to the database.
	*
	* @param id the primary key for the new vr expire certificate
	* @return the new vr expire certificate
	*/
	public VRExpireCertificate createVRExpireCertificate(long id);

	/**
	* Deletes the vr expire certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vrExpireCertificate the vr expire certificate
	* @return the vr expire certificate that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRExpireCertificate deleteVRExpireCertificate(
		VRExpireCertificate vrExpireCertificate);

	/**
	* Deletes the vr expire certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate that was removed
	* @throws PortalException if a vr expire certificate with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRExpireCertificate deleteVRExpireCertificate(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRExpireCertificate fetchVRExpireCertificate(long id);

	public VRExpireCertificate findByDossierId(long dossierId);

	public VRExpireCertificate findByVehicleTypeCertificateId(
		long vehicleTypeCertificateId);

	/**
	* Returns the vr expire certificate with the primary key.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate
	* @throws PortalException if a vr expire certificate with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRExpireCertificate getVRExpireCertificate(long id)
		throws PortalException;

	/**
	* Updates the vr expire certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrExpireCertificate the vr expire certificate
	* @return the vr expire certificate that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRExpireCertificate updateVRExpireCertificate(
		VRExpireCertificate vrExpireCertificate);

	public VRExpireCertificate updateVRExpireCertificate(long id, long mtCore,
		long convertAssembleId, long validDossierId,
		java.lang.String validDossierIdCTN, java.lang.String validDossierNo,
		long vehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.lang.String dossierStatus, Date previousExpireDate,
		java.lang.String certificateRecordNo, Date certificateRecordDate,
		Date certificateRecordExpireDate, int expiredStatus,
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedVehicleTypeDescription,
		java.lang.String certifiedTrademark,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode,
		java.lang.String productionCountry,
		java.lang.String safetytestReportNo, Date safetytestReportDate,
		java.lang.String emissionTestReportNo, Date emissionTestReportDate,
		java.lang.String commonSafetyStandard,
		java.lang.String commonSafetyDescription,
		java.lang.String emissionStandard,
		java.lang.String emissionDescription,
		java.lang.String othertestReportNo, Date othertestReportDate,
		java.lang.String copReportNo, Date copReportDate,
		Date copReportExpireDate, java.lang.String validRequestNo,
		Date validRequestDate, java.lang.String validInspectionRecordNo,
		Date validInspectionRecordDate, long validCorporationId,
		long validInspectorId, java.lang.String validInspectorName,
		java.lang.String validRemarks, java.lang.String validInspectionNote,
		long deliverableFileEntryId, long documentFileEntryId, Date syncDate,
		java.lang.String typeUpdate, Company company);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of vr expire certificates.
	*
	* @return the number of vr expire certificates
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRExpireCertificatesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	public List<VRExpireCertificate> findByDossierStatus(
		java.lang.String dossierStatus, int start, int end);

	/**
	* Returns a range of all the vr expire certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr expire certificates
	* @param end the upper bound of the range of vr expire certificates (not inclusive)
	* @return the range of vr expire certificates
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRExpireCertificate> getVRExpireCertificates(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}