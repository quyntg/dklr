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

import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.model.VRRegistration;
import com.fds.vr.business.model.VRVehicleTypeCertificate;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
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
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Provides the local service interface for VRVehicleTypeCertificate. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRVehicleTypeCertificateLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRVehicleTypeCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRVehicleTypeCertificateLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRVehicleTypeCertificateLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRVehicleTypeCertificateLocalServiceUtil} to access the vr vehicle type certificate local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRVehicleTypeCertificateLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public boolean updateVRTechnicalSpec_ALL(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		Date modifyDate, java.lang.String VehicleClass,
		java.lang.String deliverableCode);

	/**
	* Adds the vr vehicle type certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRVehicleTypeCertificate addVRVehicleTypeCertificate(
		VRVehicleTypeCertificate vrVehicleTypeCertificate);

	public VRVehicleTypeCertificate createVRVehicleTypeCertificate(
		VRVehicleTypeCertificate object) throws SystemException;

	/**
	* Creates a new vr vehicle type certificate with the primary key. Does not add the vr vehicle type certificate to the database.
	*
	* @param id the primary key for the new vr vehicle type certificate
	* @return the new vr vehicle type certificate
	*/
	public VRVehicleTypeCertificate createVRVehicleTypeCertificate(long id);

	/**
	* Deletes the vr vehicle type certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRVehicleTypeCertificate deleteVRVehicleTypeCertificate(
		VRVehicleTypeCertificate vrVehicleTypeCertificate);

	/**
	* Deletes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	* @throws PortalException if a vr vehicle type certificate with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRVehicleTypeCertificate deleteVRVehicleTypeCertificate(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRVehicleTypeCertificate fetchVRVehicleTypeCertificate(long id);

	public VRVehicleTypeCertificate findByDossierId_MtCore(long dossierId,
		long mtCore);

	/**
	* Returns the vr vehicle type certificate with the primary key.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate
	* @throws PortalException if a vr vehicle type certificate with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRVehicleTypeCertificate getVRVehicleTypeCertificate(long id)
		throws PortalException;

	public VRVehicleTypeCertificate update432014TTLTBGTVTBCTTTNLNK_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date modifiedDate, VRRegistration registration,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate update432014TTLTBGTVTBCTTTNLSXLR_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date modifiedDate, VRRegistration registration,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT192012TTBGTVTDGLD_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date modifiedDate, VRRegistration registration,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLLKXCG_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLLKXM_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXBBCH_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXBBCN_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXCG_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXDD_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXMTGM_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTCOP_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date modifiedDate, VRRegistration registration,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTKTSPMXBBCN_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTKTSPMXCG_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTKTTBLANDAU_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date modifiedDate, VRRegistration registration,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTTDTKXMCD_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateTT302011BGTVTTTKXCG_VehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date applicantIdDate, VRApplicantProfile appProfile,
		VRDossierFile dossierFile) throws PortalException, SystemException;

	public VRVehicleTypeCertificate updateVRVehicleTypeCertificate(
		VRVehicleTypeCertificate object, Company company);

	/**
	* Updates the vr vehicle type certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRVehicleTypeCertificate updateVRVehicleTypeCertificate(
		VRVehicleTypeCertificate vrVehicleTypeCertificate);

	public VRVehicleTypeCertificate updateVehicleTypeCertificate(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		Date modifiedDate, VRRegistration registration,
		VRDossierFile dossierFile);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	public JSONArray findData(java.lang.String sql,
		List<java.lang.String> columnNames, List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end) throws SystemException;

	public JSONObject adminProcessData(JSONObject objectData,
		JSONArray arrayVRVehicleSpecification,
		JSONArray arrayVRInspectionStandard, JSONArray arrayLKXCG,
		JSONArray arrayXCG, JSONArray arrayLKXMY, JSONArray arrayXMY,
		JSONArray arrayXCH, JSONArray arrayXCN, JSONArray arrayXDD);

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
	* Returns the number of vr vehicle type certificates.
	*
	* @return the number of vr vehicle type certificates
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRVehicleTypeCertificatesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRVehicleTypeCertificate> finByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus);

	public List<VRVehicleTypeCertificate> finByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certNo);

	public List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore) throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo) throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo) throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId) throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode) throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol) throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus) throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus);

	public List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatus)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatus)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByInspectorId(long inspectorId)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode) throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode);

	public List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo)
		throws PortalException, SystemException;

	public List<VRVehicleTypeCertificate> findExpiredCertificates(int day,
		java.lang.String expiredStatus);

	/**
	* Returns a range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of vr vehicle type certificates
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRVehicleTypeCertificate> getVRVehicleTypeCertificates(
		int start, int end);

	public long counData(java.lang.String sql) throws SystemException;

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