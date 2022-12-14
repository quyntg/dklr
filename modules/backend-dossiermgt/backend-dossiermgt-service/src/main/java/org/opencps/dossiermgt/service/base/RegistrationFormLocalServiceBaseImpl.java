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

package org.opencps.dossiermgt.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import org.opencps.dossiermgt.model.RegistrationForm;
import org.opencps.dossiermgt.service.RegistrationFormLocalService;
import org.opencps.dossiermgt.service.persistence.DeliverableFinder;
import org.opencps.dossiermgt.service.persistence.DeliverableLogPersistence;
import org.opencps.dossiermgt.service.persistence.DeliverablePersistence;
import org.opencps.dossiermgt.service.persistence.DeliverableTypePersistence;
import org.opencps.dossiermgt.service.persistence.DossierActionPersistence;
import org.opencps.dossiermgt.service.persistence.DossierActionSyncPersistence;
import org.opencps.dossiermgt.service.persistence.DossierActionUserPersistence;
import org.opencps.dossiermgt.service.persistence.DossierFilePersistence;
import org.opencps.dossiermgt.service.persistence.DossierFinder;
import org.opencps.dossiermgt.service.persistence.DossierLogPersistence;
import org.opencps.dossiermgt.service.persistence.DossierMarkPersistence;
import org.opencps.dossiermgt.service.persistence.DossierPartPersistence;
import org.opencps.dossiermgt.service.persistence.DossierPersistence;
import org.opencps.dossiermgt.service.persistence.DossierRequestUDPersistence;
import org.opencps.dossiermgt.service.persistence.DossierStatisticPersistence;
import org.opencps.dossiermgt.service.persistence.DossierSyncPersistence;
import org.opencps.dossiermgt.service.persistence.DossierTemplatePersistence;
import org.opencps.dossiermgt.service.persistence.PaymentConfigPersistence;
import org.opencps.dossiermgt.service.persistence.PaymentFilePersistence;
import org.opencps.dossiermgt.service.persistence.ProcessActionPersistence;
import org.opencps.dossiermgt.service.persistence.ProcessOptionPersistence;
import org.opencps.dossiermgt.service.persistence.ProcessPluginPersistence;
import org.opencps.dossiermgt.service.persistence.ProcessStepFinder;
import org.opencps.dossiermgt.service.persistence.ProcessStepPersistence;
import org.opencps.dossiermgt.service.persistence.ProcessStepRolePersistence;
import org.opencps.dossiermgt.service.persistence.RegistrationFormPersistence;
import org.opencps.dossiermgt.service.persistence.RegistrationLogPersistence;
import org.opencps.dossiermgt.service.persistence.RegistrationPersistence;
import org.opencps.dossiermgt.service.persistence.RegistrationTemplatesPersistence;
import org.opencps.dossiermgt.service.persistence.ServiceConfigPersistence;
import org.opencps.dossiermgt.service.persistence.ServiceFileTemplatePersistence;
import org.opencps.dossiermgt.service.persistence.ServiceInfoPersistence;
import org.opencps.dossiermgt.service.persistence.ServiceProcessPersistence;
import org.opencps.dossiermgt.service.persistence.ServiceProcessRolePersistence;
import org.opencps.dossiermgt.service.persistence.UserInfoLogPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the registration form local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.dossiermgt.service.impl.RegistrationFormLocalServiceImpl}.
 * </p>
 *
 * @author huymq
 * @see org.opencps.dossiermgt.service.impl.RegistrationFormLocalServiceImpl
 * @see org.opencps.dossiermgt.service.RegistrationFormLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class RegistrationFormLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements RegistrationFormLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.dossiermgt.service.RegistrationFormLocalServiceUtil} to access the registration form local service.
	 */

	/**
	 * Adds the registration form to the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrationForm the registration form
	 * @return the registration form that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public RegistrationForm addRegistrationForm(
		RegistrationForm registrationForm) {
		registrationForm.setNew(true);

		return registrationFormPersistence.update(registrationForm);
	}

	/**
	 * Creates a new registration form with the primary key. Does not add the registration form to the database.
	 *
	 * @param registrationFormId the primary key for the new registration form
	 * @return the new registration form
	 */
	@Override
	public RegistrationForm createRegistrationForm(long registrationFormId) {
		return registrationFormPersistence.create(registrationFormId);
	}

	/**
	 * Deletes the registration form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrationFormId the primary key of the registration form
	 * @return the registration form that was removed
	 * @throws PortalException if a registration form with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public RegistrationForm deleteRegistrationForm(long registrationFormId)
		throws PortalException {
		return registrationFormPersistence.remove(registrationFormId);
	}

	/**
	 * Deletes the registration form from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrationForm the registration form
	 * @return the registration form that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public RegistrationForm deleteRegistrationForm(
		RegistrationForm registrationForm) {
		return registrationFormPersistence.remove(registrationForm);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(RegistrationForm.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return registrationFormPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return registrationFormPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return registrationFormPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return registrationFormPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return registrationFormPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public RegistrationForm fetchRegistrationForm(long registrationFormId) {
		return registrationFormPersistence.fetchByPrimaryKey(registrationFormId);
	}

	/**
	 * Returns the registration form matching the UUID and group.
	 *
	 * @param uuid the registration form's UUID
	 * @param groupId the primary key of the group
	 * @return the matching registration form, or <code>null</code> if a matching registration form could not be found
	 */
	@Override
	public RegistrationForm fetchRegistrationFormByUuidAndGroupId(String uuid,
		long groupId) {
		return registrationFormPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the registration form with the primary key.
	 *
	 * @param registrationFormId the primary key of the registration form
	 * @return the registration form
	 * @throws PortalException if a registration form with the primary key could not be found
	 */
	@Override
	public RegistrationForm getRegistrationForm(long registrationFormId)
		throws PortalException {
		return registrationFormPersistence.findByPrimaryKey(registrationFormId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(registrationFormLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(RegistrationForm.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("registrationFormId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(registrationFormLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(RegistrationForm.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"registrationFormId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(registrationFormLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(RegistrationForm.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("registrationFormId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {
		final ExportActionableDynamicQuery exportActionableDynamicQuery = new ExportActionableDynamicQuery() {
				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(stagedModelType,
						modelAdditionCount);

					long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(portletDataContext,
							stagedModelType);

					manifestSummary.addModelDeletionCount(stagedModelType,
						modelDeletionCount);

					return modelAdditionCount;
				}
			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(dynamicQuery,
						"modifiedDate");
				}
			});

		exportActionableDynamicQuery.setCompanyId(portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<RegistrationForm>() {
				@Override
				public void performAction(RegistrationForm registrationForm)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						registrationForm);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(RegistrationForm.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return registrationFormLocalService.deleteRegistrationForm((RegistrationForm)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return registrationFormPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the registration forms matching the UUID and company.
	 *
	 * @param uuid the UUID of the registration forms
	 * @param companyId the primary key of the company
	 * @return the matching registration forms, or an empty list if no matches were found
	 */
	@Override
	public List<RegistrationForm> getRegistrationFormsByUuidAndCompanyId(
		String uuid, long companyId) {
		return registrationFormPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of registration forms matching the UUID and company.
	 *
	 * @param uuid the UUID of the registration forms
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of registration forms
	 * @param end the upper bound of the range of registration forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching registration forms, or an empty list if no matches were found
	 */
	@Override
	public List<RegistrationForm> getRegistrationFormsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RegistrationForm> orderByComparator) {
		return registrationFormPersistence.findByUuid_C(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	 * Returns the registration form matching the UUID and group.
	 *
	 * @param uuid the registration form's UUID
	 * @param groupId the primary key of the group
	 * @return the matching registration form
	 * @throws PortalException if a matching registration form could not be found
	 */
	@Override
	public RegistrationForm getRegistrationFormByUuidAndGroupId(String uuid,
		long groupId) throws PortalException {
		return registrationFormPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the registration forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registration forms
	 * @param end the upper bound of the range of registration forms (not inclusive)
	 * @return the range of registration forms
	 */
	@Override
	public List<RegistrationForm> getRegistrationForms(int start, int end) {
		return registrationFormPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of registration forms.
	 *
	 * @return the number of registration forms
	 */
	@Override
	public int getRegistrationFormsCount() {
		return registrationFormPersistence.countAll();
	}

	/**
	 * Updates the registration form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param registrationForm the registration form
	 * @return the registration form that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public RegistrationForm updateRegistrationForm(
		RegistrationForm registrationForm) {
		return registrationFormPersistence.update(registrationForm);
	}

	/**
	 * Returns the deliverable local service.
	 *
	 * @return the deliverable local service
	 */
	public org.opencps.dossiermgt.service.DeliverableLocalService getDeliverableLocalService() {
		return deliverableLocalService;
	}

	/**
	 * Sets the deliverable local service.
	 *
	 * @param deliverableLocalService the deliverable local service
	 */
	public void setDeliverableLocalService(
		org.opencps.dossiermgt.service.DeliverableLocalService deliverableLocalService) {
		this.deliverableLocalService = deliverableLocalService;
	}

	/**
	 * Returns the deliverable persistence.
	 *
	 * @return the deliverable persistence
	 */
	public DeliverablePersistence getDeliverablePersistence() {
		return deliverablePersistence;
	}

	/**
	 * Sets the deliverable persistence.
	 *
	 * @param deliverablePersistence the deliverable persistence
	 */
	public void setDeliverablePersistence(
		DeliverablePersistence deliverablePersistence) {
		this.deliverablePersistence = deliverablePersistence;
	}

	/**
	 * Returns the deliverable finder.
	 *
	 * @return the deliverable finder
	 */
	public DeliverableFinder getDeliverableFinder() {
		return deliverableFinder;
	}

	/**
	 * Sets the deliverable finder.
	 *
	 * @param deliverableFinder the deliverable finder
	 */
	public void setDeliverableFinder(DeliverableFinder deliverableFinder) {
		this.deliverableFinder = deliverableFinder;
	}

	/**
	 * Returns the deliverable log local service.
	 *
	 * @return the deliverable log local service
	 */
	public org.opencps.dossiermgt.service.DeliverableLogLocalService getDeliverableLogLocalService() {
		return deliverableLogLocalService;
	}

	/**
	 * Sets the deliverable log local service.
	 *
	 * @param deliverableLogLocalService the deliverable log local service
	 */
	public void setDeliverableLogLocalService(
		org.opencps.dossiermgt.service.DeliverableLogLocalService deliverableLogLocalService) {
		this.deliverableLogLocalService = deliverableLogLocalService;
	}

	/**
	 * Returns the deliverable log persistence.
	 *
	 * @return the deliverable log persistence
	 */
	public DeliverableLogPersistence getDeliverableLogPersistence() {
		return deliverableLogPersistence;
	}

	/**
	 * Sets the deliverable log persistence.
	 *
	 * @param deliverableLogPersistence the deliverable log persistence
	 */
	public void setDeliverableLogPersistence(
		DeliverableLogPersistence deliverableLogPersistence) {
		this.deliverableLogPersistence = deliverableLogPersistence;
	}

	/**
	 * Returns the deliverable type local service.
	 *
	 * @return the deliverable type local service
	 */
	public org.opencps.dossiermgt.service.DeliverableTypeLocalService getDeliverableTypeLocalService() {
		return deliverableTypeLocalService;
	}

	/**
	 * Sets the deliverable type local service.
	 *
	 * @param deliverableTypeLocalService the deliverable type local service
	 */
	public void setDeliverableTypeLocalService(
		org.opencps.dossiermgt.service.DeliverableTypeLocalService deliverableTypeLocalService) {
		this.deliverableTypeLocalService = deliverableTypeLocalService;
	}

	/**
	 * Returns the deliverable type persistence.
	 *
	 * @return the deliverable type persistence
	 */
	public DeliverableTypePersistence getDeliverableTypePersistence() {
		return deliverableTypePersistence;
	}

	/**
	 * Sets the deliverable type persistence.
	 *
	 * @param deliverableTypePersistence the deliverable type persistence
	 */
	public void setDeliverableTypePersistence(
		DeliverableTypePersistence deliverableTypePersistence) {
		this.deliverableTypePersistence = deliverableTypePersistence;
	}

	/**
	 * Returns the dossier local service.
	 *
	 * @return the dossier local service
	 */
	public org.opencps.dossiermgt.service.DossierLocalService getDossierLocalService() {
		return dossierLocalService;
	}

	/**
	 * Sets the dossier local service.
	 *
	 * @param dossierLocalService the dossier local service
	 */
	public void setDossierLocalService(
		org.opencps.dossiermgt.service.DossierLocalService dossierLocalService) {
		this.dossierLocalService = dossierLocalService;
	}

	/**
	 * Returns the dossier persistence.
	 *
	 * @return the dossier persistence
	 */
	public DossierPersistence getDossierPersistence() {
		return dossierPersistence;
	}

	/**
	 * Sets the dossier persistence.
	 *
	 * @param dossierPersistence the dossier persistence
	 */
	public void setDossierPersistence(DossierPersistence dossierPersistence) {
		this.dossierPersistence = dossierPersistence;
	}

	/**
	 * Returns the dossier finder.
	 *
	 * @return the dossier finder
	 */
	public DossierFinder getDossierFinder() {
		return dossierFinder;
	}

	/**
	 * Sets the dossier finder.
	 *
	 * @param dossierFinder the dossier finder
	 */
	public void setDossierFinder(DossierFinder dossierFinder) {
		this.dossierFinder = dossierFinder;
	}

	/**
	 * Returns the dossier action local service.
	 *
	 * @return the dossier action local service
	 */
	public org.opencps.dossiermgt.service.DossierActionLocalService getDossierActionLocalService() {
		return dossierActionLocalService;
	}

	/**
	 * Sets the dossier action local service.
	 *
	 * @param dossierActionLocalService the dossier action local service
	 */
	public void setDossierActionLocalService(
		org.opencps.dossiermgt.service.DossierActionLocalService dossierActionLocalService) {
		this.dossierActionLocalService = dossierActionLocalService;
	}

	/**
	 * Returns the dossier action persistence.
	 *
	 * @return the dossier action persistence
	 */
	public DossierActionPersistence getDossierActionPersistence() {
		return dossierActionPersistence;
	}

	/**
	 * Sets the dossier action persistence.
	 *
	 * @param dossierActionPersistence the dossier action persistence
	 */
	public void setDossierActionPersistence(
		DossierActionPersistence dossierActionPersistence) {
		this.dossierActionPersistence = dossierActionPersistence;
	}

	/**
	 * Returns the dossier action sync local service.
	 *
	 * @return the dossier action sync local service
	 */
	public org.opencps.dossiermgt.service.DossierActionSyncLocalService getDossierActionSyncLocalService() {
		return dossierActionSyncLocalService;
	}

	/**
	 * Sets the dossier action sync local service.
	 *
	 * @param dossierActionSyncLocalService the dossier action sync local service
	 */
	public void setDossierActionSyncLocalService(
		org.opencps.dossiermgt.service.DossierActionSyncLocalService dossierActionSyncLocalService) {
		this.dossierActionSyncLocalService = dossierActionSyncLocalService;
	}

	/**
	 * Returns the dossier action sync persistence.
	 *
	 * @return the dossier action sync persistence
	 */
	public DossierActionSyncPersistence getDossierActionSyncPersistence() {
		return dossierActionSyncPersistence;
	}

	/**
	 * Sets the dossier action sync persistence.
	 *
	 * @param dossierActionSyncPersistence the dossier action sync persistence
	 */
	public void setDossierActionSyncPersistence(
		DossierActionSyncPersistence dossierActionSyncPersistence) {
		this.dossierActionSyncPersistence = dossierActionSyncPersistence;
	}

	/**
	 * Returns the dossier action user local service.
	 *
	 * @return the dossier action user local service
	 */
	public org.opencps.dossiermgt.service.DossierActionUserLocalService getDossierActionUserLocalService() {
		return dossierActionUserLocalService;
	}

	/**
	 * Sets the dossier action user local service.
	 *
	 * @param dossierActionUserLocalService the dossier action user local service
	 */
	public void setDossierActionUserLocalService(
		org.opencps.dossiermgt.service.DossierActionUserLocalService dossierActionUserLocalService) {
		this.dossierActionUserLocalService = dossierActionUserLocalService;
	}

	/**
	 * Returns the dossier action user persistence.
	 *
	 * @return the dossier action user persistence
	 */
	public DossierActionUserPersistence getDossierActionUserPersistence() {
		return dossierActionUserPersistence;
	}

	/**
	 * Sets the dossier action user persistence.
	 *
	 * @param dossierActionUserPersistence the dossier action user persistence
	 */
	public void setDossierActionUserPersistence(
		DossierActionUserPersistence dossierActionUserPersistence) {
		this.dossierActionUserPersistence = dossierActionUserPersistence;
	}

	/**
	 * Returns the dossier file local service.
	 *
	 * @return the dossier file local service
	 */
	public org.opencps.dossiermgt.service.DossierFileLocalService getDossierFileLocalService() {
		return dossierFileLocalService;
	}

	/**
	 * Sets the dossier file local service.
	 *
	 * @param dossierFileLocalService the dossier file local service
	 */
	public void setDossierFileLocalService(
		org.opencps.dossiermgt.service.DossierFileLocalService dossierFileLocalService) {
		this.dossierFileLocalService = dossierFileLocalService;
	}

	/**
	 * Returns the dossier file persistence.
	 *
	 * @return the dossier file persistence
	 */
	public DossierFilePersistence getDossierFilePersistence() {
		return dossierFilePersistence;
	}

	/**
	 * Sets the dossier file persistence.
	 *
	 * @param dossierFilePersistence the dossier file persistence
	 */
	public void setDossierFilePersistence(
		DossierFilePersistence dossierFilePersistence) {
		this.dossierFilePersistence = dossierFilePersistence;
	}

	/**
	 * Returns the dossier log local service.
	 *
	 * @return the dossier log local service
	 */
	public org.opencps.dossiermgt.service.DossierLogLocalService getDossierLogLocalService() {
		return dossierLogLocalService;
	}

	/**
	 * Sets the dossier log local service.
	 *
	 * @param dossierLogLocalService the dossier log local service
	 */
	public void setDossierLogLocalService(
		org.opencps.dossiermgt.service.DossierLogLocalService dossierLogLocalService) {
		this.dossierLogLocalService = dossierLogLocalService;
	}

	/**
	 * Returns the dossier log persistence.
	 *
	 * @return the dossier log persistence
	 */
	public DossierLogPersistence getDossierLogPersistence() {
		return dossierLogPersistence;
	}

	/**
	 * Sets the dossier log persistence.
	 *
	 * @param dossierLogPersistence the dossier log persistence
	 */
	public void setDossierLogPersistence(
		DossierLogPersistence dossierLogPersistence) {
		this.dossierLogPersistence = dossierLogPersistence;
	}

	/**
	 * Returns the dossier mark local service.
	 *
	 * @return the dossier mark local service
	 */
	public org.opencps.dossiermgt.service.DossierMarkLocalService getDossierMarkLocalService() {
		return dossierMarkLocalService;
	}

	/**
	 * Sets the dossier mark local service.
	 *
	 * @param dossierMarkLocalService the dossier mark local service
	 */
	public void setDossierMarkLocalService(
		org.opencps.dossiermgt.service.DossierMarkLocalService dossierMarkLocalService) {
		this.dossierMarkLocalService = dossierMarkLocalService;
	}

	/**
	 * Returns the dossier mark persistence.
	 *
	 * @return the dossier mark persistence
	 */
	public DossierMarkPersistence getDossierMarkPersistence() {
		return dossierMarkPersistence;
	}

	/**
	 * Sets the dossier mark persistence.
	 *
	 * @param dossierMarkPersistence the dossier mark persistence
	 */
	public void setDossierMarkPersistence(
		DossierMarkPersistence dossierMarkPersistence) {
		this.dossierMarkPersistence = dossierMarkPersistence;
	}

	/**
	 * Returns the dossier part local service.
	 *
	 * @return the dossier part local service
	 */
	public org.opencps.dossiermgt.service.DossierPartLocalService getDossierPartLocalService() {
		return dossierPartLocalService;
	}

	/**
	 * Sets the dossier part local service.
	 *
	 * @param dossierPartLocalService the dossier part local service
	 */
	public void setDossierPartLocalService(
		org.opencps.dossiermgt.service.DossierPartLocalService dossierPartLocalService) {
		this.dossierPartLocalService = dossierPartLocalService;
	}

	/**
	 * Returns the dossier part persistence.
	 *
	 * @return the dossier part persistence
	 */
	public DossierPartPersistence getDossierPartPersistence() {
		return dossierPartPersistence;
	}

	/**
	 * Sets the dossier part persistence.
	 *
	 * @param dossierPartPersistence the dossier part persistence
	 */
	public void setDossierPartPersistence(
		DossierPartPersistence dossierPartPersistence) {
		this.dossierPartPersistence = dossierPartPersistence;
	}

	/**
	 * Returns the dossier request ud local service.
	 *
	 * @return the dossier request ud local service
	 */
	public org.opencps.dossiermgt.service.DossierRequestUDLocalService getDossierRequestUDLocalService() {
		return dossierRequestUDLocalService;
	}

	/**
	 * Sets the dossier request ud local service.
	 *
	 * @param dossierRequestUDLocalService the dossier request ud local service
	 */
	public void setDossierRequestUDLocalService(
		org.opencps.dossiermgt.service.DossierRequestUDLocalService dossierRequestUDLocalService) {
		this.dossierRequestUDLocalService = dossierRequestUDLocalService;
	}

	/**
	 * Returns the dossier request ud persistence.
	 *
	 * @return the dossier request ud persistence
	 */
	public DossierRequestUDPersistence getDossierRequestUDPersistence() {
		return dossierRequestUDPersistence;
	}

	/**
	 * Sets the dossier request ud persistence.
	 *
	 * @param dossierRequestUDPersistence the dossier request ud persistence
	 */
	public void setDossierRequestUDPersistence(
		DossierRequestUDPersistence dossierRequestUDPersistence) {
		this.dossierRequestUDPersistence = dossierRequestUDPersistence;
	}

	/**
	 * Returns the dossier statistic local service.
	 *
	 * @return the dossier statistic local service
	 */
	public org.opencps.dossiermgt.service.DossierStatisticLocalService getDossierStatisticLocalService() {
		return dossierStatisticLocalService;
	}

	/**
	 * Sets the dossier statistic local service.
	 *
	 * @param dossierStatisticLocalService the dossier statistic local service
	 */
	public void setDossierStatisticLocalService(
		org.opencps.dossiermgt.service.DossierStatisticLocalService dossierStatisticLocalService) {
		this.dossierStatisticLocalService = dossierStatisticLocalService;
	}

	/**
	 * Returns the dossier statistic persistence.
	 *
	 * @return the dossier statistic persistence
	 */
	public DossierStatisticPersistence getDossierStatisticPersistence() {
		return dossierStatisticPersistence;
	}

	/**
	 * Sets the dossier statistic persistence.
	 *
	 * @param dossierStatisticPersistence the dossier statistic persistence
	 */
	public void setDossierStatisticPersistence(
		DossierStatisticPersistence dossierStatisticPersistence) {
		this.dossierStatisticPersistence = dossierStatisticPersistence;
	}

	/**
	 * Returns the dossier sync local service.
	 *
	 * @return the dossier sync local service
	 */
	public org.opencps.dossiermgt.service.DossierSyncLocalService getDossierSyncLocalService() {
		return dossierSyncLocalService;
	}

	/**
	 * Sets the dossier sync local service.
	 *
	 * @param dossierSyncLocalService the dossier sync local service
	 */
	public void setDossierSyncLocalService(
		org.opencps.dossiermgt.service.DossierSyncLocalService dossierSyncLocalService) {
		this.dossierSyncLocalService = dossierSyncLocalService;
	}

	/**
	 * Returns the dossier sync persistence.
	 *
	 * @return the dossier sync persistence
	 */
	public DossierSyncPersistence getDossierSyncPersistence() {
		return dossierSyncPersistence;
	}

	/**
	 * Sets the dossier sync persistence.
	 *
	 * @param dossierSyncPersistence the dossier sync persistence
	 */
	public void setDossierSyncPersistence(
		DossierSyncPersistence dossierSyncPersistence) {
		this.dossierSyncPersistence = dossierSyncPersistence;
	}

	/**
	 * Returns the dossier template local service.
	 *
	 * @return the dossier template local service
	 */
	public org.opencps.dossiermgt.service.DossierTemplateLocalService getDossierTemplateLocalService() {
		return dossierTemplateLocalService;
	}

	/**
	 * Sets the dossier template local service.
	 *
	 * @param dossierTemplateLocalService the dossier template local service
	 */
	public void setDossierTemplateLocalService(
		org.opencps.dossiermgt.service.DossierTemplateLocalService dossierTemplateLocalService) {
		this.dossierTemplateLocalService = dossierTemplateLocalService;
	}

	/**
	 * Returns the dossier template persistence.
	 *
	 * @return the dossier template persistence
	 */
	public DossierTemplatePersistence getDossierTemplatePersistence() {
		return dossierTemplatePersistence;
	}

	/**
	 * Sets the dossier template persistence.
	 *
	 * @param dossierTemplatePersistence the dossier template persistence
	 */
	public void setDossierTemplatePersistence(
		DossierTemplatePersistence dossierTemplatePersistence) {
		this.dossierTemplatePersistence = dossierTemplatePersistence;
	}

	/**
	 * Returns the payment config local service.
	 *
	 * @return the payment config local service
	 */
	public org.opencps.dossiermgt.service.PaymentConfigLocalService getPaymentConfigLocalService() {
		return paymentConfigLocalService;
	}

	/**
	 * Sets the payment config local service.
	 *
	 * @param paymentConfigLocalService the payment config local service
	 */
	public void setPaymentConfigLocalService(
		org.opencps.dossiermgt.service.PaymentConfigLocalService paymentConfigLocalService) {
		this.paymentConfigLocalService = paymentConfigLocalService;
	}

	/**
	 * Returns the payment config persistence.
	 *
	 * @return the payment config persistence
	 */
	public PaymentConfigPersistence getPaymentConfigPersistence() {
		return paymentConfigPersistence;
	}

	/**
	 * Sets the payment config persistence.
	 *
	 * @param paymentConfigPersistence the payment config persistence
	 */
	public void setPaymentConfigPersistence(
		PaymentConfigPersistence paymentConfigPersistence) {
		this.paymentConfigPersistence = paymentConfigPersistence;
	}

	/**
	 * Returns the payment file local service.
	 *
	 * @return the payment file local service
	 */
	public org.opencps.dossiermgt.service.PaymentFileLocalService getPaymentFileLocalService() {
		return paymentFileLocalService;
	}

	/**
	 * Sets the payment file local service.
	 *
	 * @param paymentFileLocalService the payment file local service
	 */
	public void setPaymentFileLocalService(
		org.opencps.dossiermgt.service.PaymentFileLocalService paymentFileLocalService) {
		this.paymentFileLocalService = paymentFileLocalService;
	}

	/**
	 * Returns the payment file persistence.
	 *
	 * @return the payment file persistence
	 */
	public PaymentFilePersistence getPaymentFilePersistence() {
		return paymentFilePersistence;
	}

	/**
	 * Sets the payment file persistence.
	 *
	 * @param paymentFilePersistence the payment file persistence
	 */
	public void setPaymentFilePersistence(
		PaymentFilePersistence paymentFilePersistence) {
		this.paymentFilePersistence = paymentFilePersistence;
	}

	/**
	 * Returns the process action local service.
	 *
	 * @return the process action local service
	 */
	public org.opencps.dossiermgt.service.ProcessActionLocalService getProcessActionLocalService() {
		return processActionLocalService;
	}

	/**
	 * Sets the process action local service.
	 *
	 * @param processActionLocalService the process action local service
	 */
	public void setProcessActionLocalService(
		org.opencps.dossiermgt.service.ProcessActionLocalService processActionLocalService) {
		this.processActionLocalService = processActionLocalService;
	}

	/**
	 * Returns the process action persistence.
	 *
	 * @return the process action persistence
	 */
	public ProcessActionPersistence getProcessActionPersistence() {
		return processActionPersistence;
	}

	/**
	 * Sets the process action persistence.
	 *
	 * @param processActionPersistence the process action persistence
	 */
	public void setProcessActionPersistence(
		ProcessActionPersistence processActionPersistence) {
		this.processActionPersistence = processActionPersistence;
	}

	/**
	 * Returns the process option local service.
	 *
	 * @return the process option local service
	 */
	public org.opencps.dossiermgt.service.ProcessOptionLocalService getProcessOptionLocalService() {
		return processOptionLocalService;
	}

	/**
	 * Sets the process option local service.
	 *
	 * @param processOptionLocalService the process option local service
	 */
	public void setProcessOptionLocalService(
		org.opencps.dossiermgt.service.ProcessOptionLocalService processOptionLocalService) {
		this.processOptionLocalService = processOptionLocalService;
	}

	/**
	 * Returns the process option persistence.
	 *
	 * @return the process option persistence
	 */
	public ProcessOptionPersistence getProcessOptionPersistence() {
		return processOptionPersistence;
	}

	/**
	 * Sets the process option persistence.
	 *
	 * @param processOptionPersistence the process option persistence
	 */
	public void setProcessOptionPersistence(
		ProcessOptionPersistence processOptionPersistence) {
		this.processOptionPersistence = processOptionPersistence;
	}

	/**
	 * Returns the process plugin local service.
	 *
	 * @return the process plugin local service
	 */
	public org.opencps.dossiermgt.service.ProcessPluginLocalService getProcessPluginLocalService() {
		return processPluginLocalService;
	}

	/**
	 * Sets the process plugin local service.
	 *
	 * @param processPluginLocalService the process plugin local service
	 */
	public void setProcessPluginLocalService(
		org.opencps.dossiermgt.service.ProcessPluginLocalService processPluginLocalService) {
		this.processPluginLocalService = processPluginLocalService;
	}

	/**
	 * Returns the process plugin persistence.
	 *
	 * @return the process plugin persistence
	 */
	public ProcessPluginPersistence getProcessPluginPersistence() {
		return processPluginPersistence;
	}

	/**
	 * Sets the process plugin persistence.
	 *
	 * @param processPluginPersistence the process plugin persistence
	 */
	public void setProcessPluginPersistence(
		ProcessPluginPersistence processPluginPersistence) {
		this.processPluginPersistence = processPluginPersistence;
	}

	/**
	 * Returns the process step local service.
	 *
	 * @return the process step local service
	 */
	public org.opencps.dossiermgt.service.ProcessStepLocalService getProcessStepLocalService() {
		return processStepLocalService;
	}

	/**
	 * Sets the process step local service.
	 *
	 * @param processStepLocalService the process step local service
	 */
	public void setProcessStepLocalService(
		org.opencps.dossiermgt.service.ProcessStepLocalService processStepLocalService) {
		this.processStepLocalService = processStepLocalService;
	}

	/**
	 * Returns the process step persistence.
	 *
	 * @return the process step persistence
	 */
	public ProcessStepPersistence getProcessStepPersistence() {
		return processStepPersistence;
	}

	/**
	 * Sets the process step persistence.
	 *
	 * @param processStepPersistence the process step persistence
	 */
	public void setProcessStepPersistence(
		ProcessStepPersistence processStepPersistence) {
		this.processStepPersistence = processStepPersistence;
	}

	/**
	 * Returns the process step finder.
	 *
	 * @return the process step finder
	 */
	public ProcessStepFinder getProcessStepFinder() {
		return processStepFinder;
	}

	/**
	 * Sets the process step finder.
	 *
	 * @param processStepFinder the process step finder
	 */
	public void setProcessStepFinder(ProcessStepFinder processStepFinder) {
		this.processStepFinder = processStepFinder;
	}

	/**
	 * Returns the process step role local service.
	 *
	 * @return the process step role local service
	 */
	public org.opencps.dossiermgt.service.ProcessStepRoleLocalService getProcessStepRoleLocalService() {
		return processStepRoleLocalService;
	}

	/**
	 * Sets the process step role local service.
	 *
	 * @param processStepRoleLocalService the process step role local service
	 */
	public void setProcessStepRoleLocalService(
		org.opencps.dossiermgt.service.ProcessStepRoleLocalService processStepRoleLocalService) {
		this.processStepRoleLocalService = processStepRoleLocalService;
	}

	/**
	 * Returns the process step role persistence.
	 *
	 * @return the process step role persistence
	 */
	public ProcessStepRolePersistence getProcessStepRolePersistence() {
		return processStepRolePersistence;
	}

	/**
	 * Sets the process step role persistence.
	 *
	 * @param processStepRolePersistence the process step role persistence
	 */
	public void setProcessStepRolePersistence(
		ProcessStepRolePersistence processStepRolePersistence) {
		this.processStepRolePersistence = processStepRolePersistence;
	}

	/**
	 * Returns the registration local service.
	 *
	 * @return the registration local service
	 */
	public org.opencps.dossiermgt.service.RegistrationLocalService getRegistrationLocalService() {
		return registrationLocalService;
	}

	/**
	 * Sets the registration local service.
	 *
	 * @param registrationLocalService the registration local service
	 */
	public void setRegistrationLocalService(
		org.opencps.dossiermgt.service.RegistrationLocalService registrationLocalService) {
		this.registrationLocalService = registrationLocalService;
	}

	/**
	 * Returns the registration persistence.
	 *
	 * @return the registration persistence
	 */
	public RegistrationPersistence getRegistrationPersistence() {
		return registrationPersistence;
	}

	/**
	 * Sets the registration persistence.
	 *
	 * @param registrationPersistence the registration persistence
	 */
	public void setRegistrationPersistence(
		RegistrationPersistence registrationPersistence) {
		this.registrationPersistence = registrationPersistence;
	}

	/**
	 * Returns the registration form local service.
	 *
	 * @return the registration form local service
	 */
	public RegistrationFormLocalService getRegistrationFormLocalService() {
		return registrationFormLocalService;
	}

	/**
	 * Sets the registration form local service.
	 *
	 * @param registrationFormLocalService the registration form local service
	 */
	public void setRegistrationFormLocalService(
		RegistrationFormLocalService registrationFormLocalService) {
		this.registrationFormLocalService = registrationFormLocalService;
	}

	/**
	 * Returns the registration form persistence.
	 *
	 * @return the registration form persistence
	 */
	public RegistrationFormPersistence getRegistrationFormPersistence() {
		return registrationFormPersistence;
	}

	/**
	 * Sets the registration form persistence.
	 *
	 * @param registrationFormPersistence the registration form persistence
	 */
	public void setRegistrationFormPersistence(
		RegistrationFormPersistence registrationFormPersistence) {
		this.registrationFormPersistence = registrationFormPersistence;
	}

	/**
	 * Returns the registration log local service.
	 *
	 * @return the registration log local service
	 */
	public org.opencps.dossiermgt.service.RegistrationLogLocalService getRegistrationLogLocalService() {
		return registrationLogLocalService;
	}

	/**
	 * Sets the registration log local service.
	 *
	 * @param registrationLogLocalService the registration log local service
	 */
	public void setRegistrationLogLocalService(
		org.opencps.dossiermgt.service.RegistrationLogLocalService registrationLogLocalService) {
		this.registrationLogLocalService = registrationLogLocalService;
	}

	/**
	 * Returns the registration log persistence.
	 *
	 * @return the registration log persistence
	 */
	public RegistrationLogPersistence getRegistrationLogPersistence() {
		return registrationLogPersistence;
	}

	/**
	 * Sets the registration log persistence.
	 *
	 * @param registrationLogPersistence the registration log persistence
	 */
	public void setRegistrationLogPersistence(
		RegistrationLogPersistence registrationLogPersistence) {
		this.registrationLogPersistence = registrationLogPersistence;
	}

	/**
	 * Returns the registration templates local service.
	 *
	 * @return the registration templates local service
	 */
	public org.opencps.dossiermgt.service.RegistrationTemplatesLocalService getRegistrationTemplatesLocalService() {
		return registrationTemplatesLocalService;
	}

	/**
	 * Sets the registration templates local service.
	 *
	 * @param registrationTemplatesLocalService the registration templates local service
	 */
	public void setRegistrationTemplatesLocalService(
		org.opencps.dossiermgt.service.RegistrationTemplatesLocalService registrationTemplatesLocalService) {
		this.registrationTemplatesLocalService = registrationTemplatesLocalService;
	}

	/**
	 * Returns the registration templates persistence.
	 *
	 * @return the registration templates persistence
	 */
	public RegistrationTemplatesPersistence getRegistrationTemplatesPersistence() {
		return registrationTemplatesPersistence;
	}

	/**
	 * Sets the registration templates persistence.
	 *
	 * @param registrationTemplatesPersistence the registration templates persistence
	 */
	public void setRegistrationTemplatesPersistence(
		RegistrationTemplatesPersistence registrationTemplatesPersistence) {
		this.registrationTemplatesPersistence = registrationTemplatesPersistence;
	}

	/**
	 * Returns the service config local service.
	 *
	 * @return the service config local service
	 */
	public org.opencps.dossiermgt.service.ServiceConfigLocalService getServiceConfigLocalService() {
		return serviceConfigLocalService;
	}

	/**
	 * Sets the service config local service.
	 *
	 * @param serviceConfigLocalService the service config local service
	 */
	public void setServiceConfigLocalService(
		org.opencps.dossiermgt.service.ServiceConfigLocalService serviceConfigLocalService) {
		this.serviceConfigLocalService = serviceConfigLocalService;
	}

	/**
	 * Returns the service config persistence.
	 *
	 * @return the service config persistence
	 */
	public ServiceConfigPersistence getServiceConfigPersistence() {
		return serviceConfigPersistence;
	}

	/**
	 * Sets the service config persistence.
	 *
	 * @param serviceConfigPersistence the service config persistence
	 */
	public void setServiceConfigPersistence(
		ServiceConfigPersistence serviceConfigPersistence) {
		this.serviceConfigPersistence = serviceConfigPersistence;
	}

	/**
	 * Returns the service file template local service.
	 *
	 * @return the service file template local service
	 */
	public org.opencps.dossiermgt.service.ServiceFileTemplateLocalService getServiceFileTemplateLocalService() {
		return serviceFileTemplateLocalService;
	}

	/**
	 * Sets the service file template local service.
	 *
	 * @param serviceFileTemplateLocalService the service file template local service
	 */
	public void setServiceFileTemplateLocalService(
		org.opencps.dossiermgt.service.ServiceFileTemplateLocalService serviceFileTemplateLocalService) {
		this.serviceFileTemplateLocalService = serviceFileTemplateLocalService;
	}

	/**
	 * Returns the service file template persistence.
	 *
	 * @return the service file template persistence
	 */
	public ServiceFileTemplatePersistence getServiceFileTemplatePersistence() {
		return serviceFileTemplatePersistence;
	}

	/**
	 * Sets the service file template persistence.
	 *
	 * @param serviceFileTemplatePersistence the service file template persistence
	 */
	public void setServiceFileTemplatePersistence(
		ServiceFileTemplatePersistence serviceFileTemplatePersistence) {
		this.serviceFileTemplatePersistence = serviceFileTemplatePersistence;
	}

	/**
	 * Returns the service info local service.
	 *
	 * @return the service info local service
	 */
	public org.opencps.dossiermgt.service.ServiceInfoLocalService getServiceInfoLocalService() {
		return serviceInfoLocalService;
	}

	/**
	 * Sets the service info local service.
	 *
	 * @param serviceInfoLocalService the service info local service
	 */
	public void setServiceInfoLocalService(
		org.opencps.dossiermgt.service.ServiceInfoLocalService serviceInfoLocalService) {
		this.serviceInfoLocalService = serviceInfoLocalService;
	}

	/**
	 * Returns the service info persistence.
	 *
	 * @return the service info persistence
	 */
	public ServiceInfoPersistence getServiceInfoPersistence() {
		return serviceInfoPersistence;
	}

	/**
	 * Sets the service info persistence.
	 *
	 * @param serviceInfoPersistence the service info persistence
	 */
	public void setServiceInfoPersistence(
		ServiceInfoPersistence serviceInfoPersistence) {
		this.serviceInfoPersistence = serviceInfoPersistence;
	}

	/**
	 * Returns the service process local service.
	 *
	 * @return the service process local service
	 */
	public org.opencps.dossiermgt.service.ServiceProcessLocalService getServiceProcessLocalService() {
		return serviceProcessLocalService;
	}

	/**
	 * Sets the service process local service.
	 *
	 * @param serviceProcessLocalService the service process local service
	 */
	public void setServiceProcessLocalService(
		org.opencps.dossiermgt.service.ServiceProcessLocalService serviceProcessLocalService) {
		this.serviceProcessLocalService = serviceProcessLocalService;
	}

	/**
	 * Returns the service process persistence.
	 *
	 * @return the service process persistence
	 */
	public ServiceProcessPersistence getServiceProcessPersistence() {
		return serviceProcessPersistence;
	}

	/**
	 * Sets the service process persistence.
	 *
	 * @param serviceProcessPersistence the service process persistence
	 */
	public void setServiceProcessPersistence(
		ServiceProcessPersistence serviceProcessPersistence) {
		this.serviceProcessPersistence = serviceProcessPersistence;
	}

	/**
	 * Returns the service process role local service.
	 *
	 * @return the service process role local service
	 */
	public org.opencps.dossiermgt.service.ServiceProcessRoleLocalService getServiceProcessRoleLocalService() {
		return serviceProcessRoleLocalService;
	}

	/**
	 * Sets the service process role local service.
	 *
	 * @param serviceProcessRoleLocalService the service process role local service
	 */
	public void setServiceProcessRoleLocalService(
		org.opencps.dossiermgt.service.ServiceProcessRoleLocalService serviceProcessRoleLocalService) {
		this.serviceProcessRoleLocalService = serviceProcessRoleLocalService;
	}

	/**
	 * Returns the service process role persistence.
	 *
	 * @return the service process role persistence
	 */
	public ServiceProcessRolePersistence getServiceProcessRolePersistence() {
		return serviceProcessRolePersistence;
	}

	/**
	 * Sets the service process role persistence.
	 *
	 * @param serviceProcessRolePersistence the service process role persistence
	 */
	public void setServiceProcessRolePersistence(
		ServiceProcessRolePersistence serviceProcessRolePersistence) {
		this.serviceProcessRolePersistence = serviceProcessRolePersistence;
	}

	/**
	 * Returns the user info log local service.
	 *
	 * @return the user info log local service
	 */
	public org.opencps.dossiermgt.service.UserInfoLogLocalService getUserInfoLogLocalService() {
		return userInfoLogLocalService;
	}

	/**
	 * Sets the user info log local service.
	 *
	 * @param userInfoLogLocalService the user info log local service
	 */
	public void setUserInfoLogLocalService(
		org.opencps.dossiermgt.service.UserInfoLogLocalService userInfoLogLocalService) {
		this.userInfoLogLocalService = userInfoLogLocalService;
	}

	/**
	 * Returns the user info log persistence.
	 *
	 * @return the user info log persistence
	 */
	public UserInfoLogPersistence getUserInfoLogPersistence() {
		return userInfoLogPersistence;
	}

	/**
	 * Sets the user info log persistence.
	 *
	 * @param userInfoLogPersistence the user info log persistence
	 */
	public void setUserInfoLogPersistence(
		UserInfoLogPersistence userInfoLogPersistence) {
		this.userInfoLogPersistence = userInfoLogPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("org.opencps.dossiermgt.model.RegistrationForm",
			registrationFormLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"org.opencps.dossiermgt.model.RegistrationForm");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return RegistrationFormLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return RegistrationForm.class;
	}

	protected String getModelClassName() {
		return RegistrationForm.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = registrationFormPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.dossiermgt.service.DeliverableLocalService.class)
	protected org.opencps.dossiermgt.service.DeliverableLocalService deliverableLocalService;
	@BeanReference(type = DeliverablePersistence.class)
	protected DeliverablePersistence deliverablePersistence;
	@BeanReference(type = DeliverableFinder.class)
	protected DeliverableFinder deliverableFinder;
	@BeanReference(type = org.opencps.dossiermgt.service.DeliverableLogLocalService.class)
	protected org.opencps.dossiermgt.service.DeliverableLogLocalService deliverableLogLocalService;
	@BeanReference(type = DeliverableLogPersistence.class)
	protected DeliverableLogPersistence deliverableLogPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DeliverableTypeLocalService.class)
	protected org.opencps.dossiermgt.service.DeliverableTypeLocalService deliverableTypeLocalService;
	@BeanReference(type = DeliverableTypePersistence.class)
	protected DeliverableTypePersistence deliverableTypePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierLocalService.class)
	protected org.opencps.dossiermgt.service.DossierLocalService dossierLocalService;
	@BeanReference(type = DossierPersistence.class)
	protected DossierPersistence dossierPersistence;
	@BeanReference(type = DossierFinder.class)
	protected DossierFinder dossierFinder;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierActionLocalService.class)
	protected org.opencps.dossiermgt.service.DossierActionLocalService dossierActionLocalService;
	@BeanReference(type = DossierActionPersistence.class)
	protected DossierActionPersistence dossierActionPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierActionSyncLocalService.class)
	protected org.opencps.dossiermgt.service.DossierActionSyncLocalService dossierActionSyncLocalService;
	@BeanReference(type = DossierActionSyncPersistence.class)
	protected DossierActionSyncPersistence dossierActionSyncPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierActionUserLocalService.class)
	protected org.opencps.dossiermgt.service.DossierActionUserLocalService dossierActionUserLocalService;
	@BeanReference(type = DossierActionUserPersistence.class)
	protected DossierActionUserPersistence dossierActionUserPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierFileLocalService.class)
	protected org.opencps.dossiermgt.service.DossierFileLocalService dossierFileLocalService;
	@BeanReference(type = DossierFilePersistence.class)
	protected DossierFilePersistence dossierFilePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierLogLocalService.class)
	protected org.opencps.dossiermgt.service.DossierLogLocalService dossierLogLocalService;
	@BeanReference(type = DossierLogPersistence.class)
	protected DossierLogPersistence dossierLogPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierMarkLocalService.class)
	protected org.opencps.dossiermgt.service.DossierMarkLocalService dossierMarkLocalService;
	@BeanReference(type = DossierMarkPersistence.class)
	protected DossierMarkPersistence dossierMarkPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierPartLocalService.class)
	protected org.opencps.dossiermgt.service.DossierPartLocalService dossierPartLocalService;
	@BeanReference(type = DossierPartPersistence.class)
	protected DossierPartPersistence dossierPartPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierRequestUDLocalService.class)
	protected org.opencps.dossiermgt.service.DossierRequestUDLocalService dossierRequestUDLocalService;
	@BeanReference(type = DossierRequestUDPersistence.class)
	protected DossierRequestUDPersistence dossierRequestUDPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierStatisticLocalService.class)
	protected org.opencps.dossiermgt.service.DossierStatisticLocalService dossierStatisticLocalService;
	@BeanReference(type = DossierStatisticPersistence.class)
	protected DossierStatisticPersistence dossierStatisticPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierSyncLocalService.class)
	protected org.opencps.dossiermgt.service.DossierSyncLocalService dossierSyncLocalService;
	@BeanReference(type = DossierSyncPersistence.class)
	protected DossierSyncPersistence dossierSyncPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierTemplateLocalService.class)
	protected org.opencps.dossiermgt.service.DossierTemplateLocalService dossierTemplateLocalService;
	@BeanReference(type = DossierTemplatePersistence.class)
	protected DossierTemplatePersistence dossierTemplatePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.PaymentConfigLocalService.class)
	protected org.opencps.dossiermgt.service.PaymentConfigLocalService paymentConfigLocalService;
	@BeanReference(type = PaymentConfigPersistence.class)
	protected PaymentConfigPersistence paymentConfigPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.PaymentFileLocalService.class)
	protected org.opencps.dossiermgt.service.PaymentFileLocalService paymentFileLocalService;
	@BeanReference(type = PaymentFilePersistence.class)
	protected PaymentFilePersistence paymentFilePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ProcessActionLocalService.class)
	protected org.opencps.dossiermgt.service.ProcessActionLocalService processActionLocalService;
	@BeanReference(type = ProcessActionPersistence.class)
	protected ProcessActionPersistence processActionPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ProcessOptionLocalService.class)
	protected org.opencps.dossiermgt.service.ProcessOptionLocalService processOptionLocalService;
	@BeanReference(type = ProcessOptionPersistence.class)
	protected ProcessOptionPersistence processOptionPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ProcessPluginLocalService.class)
	protected org.opencps.dossiermgt.service.ProcessPluginLocalService processPluginLocalService;
	@BeanReference(type = ProcessPluginPersistence.class)
	protected ProcessPluginPersistence processPluginPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ProcessStepLocalService.class)
	protected org.opencps.dossiermgt.service.ProcessStepLocalService processStepLocalService;
	@BeanReference(type = ProcessStepPersistence.class)
	protected ProcessStepPersistence processStepPersistence;
	@BeanReference(type = ProcessStepFinder.class)
	protected ProcessStepFinder processStepFinder;
	@BeanReference(type = org.opencps.dossiermgt.service.ProcessStepRoleLocalService.class)
	protected org.opencps.dossiermgt.service.ProcessStepRoleLocalService processStepRoleLocalService;
	@BeanReference(type = ProcessStepRolePersistence.class)
	protected ProcessStepRolePersistence processStepRolePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.RegistrationLocalService.class)
	protected org.opencps.dossiermgt.service.RegistrationLocalService registrationLocalService;
	@BeanReference(type = RegistrationPersistence.class)
	protected RegistrationPersistence registrationPersistence;
	@BeanReference(type = RegistrationFormLocalService.class)
	protected RegistrationFormLocalService registrationFormLocalService;
	@BeanReference(type = RegistrationFormPersistence.class)
	protected RegistrationFormPersistence registrationFormPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.RegistrationLogLocalService.class)
	protected org.opencps.dossiermgt.service.RegistrationLogLocalService registrationLogLocalService;
	@BeanReference(type = RegistrationLogPersistence.class)
	protected RegistrationLogPersistence registrationLogPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.RegistrationTemplatesLocalService.class)
	protected org.opencps.dossiermgt.service.RegistrationTemplatesLocalService registrationTemplatesLocalService;
	@BeanReference(type = RegistrationTemplatesPersistence.class)
	protected RegistrationTemplatesPersistence registrationTemplatesPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ServiceConfigLocalService.class)
	protected org.opencps.dossiermgt.service.ServiceConfigLocalService serviceConfigLocalService;
	@BeanReference(type = ServiceConfigPersistence.class)
	protected ServiceConfigPersistence serviceConfigPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ServiceFileTemplateLocalService.class)
	protected org.opencps.dossiermgt.service.ServiceFileTemplateLocalService serviceFileTemplateLocalService;
	@BeanReference(type = ServiceFileTemplatePersistence.class)
	protected ServiceFileTemplatePersistence serviceFileTemplatePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ServiceInfoLocalService.class)
	protected org.opencps.dossiermgt.service.ServiceInfoLocalService serviceInfoLocalService;
	@BeanReference(type = ServiceInfoPersistence.class)
	protected ServiceInfoPersistence serviceInfoPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ServiceProcessLocalService.class)
	protected org.opencps.dossiermgt.service.ServiceProcessLocalService serviceProcessLocalService;
	@BeanReference(type = ServiceProcessPersistence.class)
	protected ServiceProcessPersistence serviceProcessPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ServiceProcessRoleLocalService.class)
	protected org.opencps.dossiermgt.service.ServiceProcessRoleLocalService serviceProcessRoleLocalService;
	@BeanReference(type = ServiceProcessRolePersistence.class)
	protected ServiceProcessRolePersistence serviceProcessRolePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.UserInfoLogLocalService.class)
	protected org.opencps.dossiermgt.service.UserInfoLogLocalService userInfoLogLocalService;
	@BeanReference(type = UserInfoLogPersistence.class)
	protected UserInfoLogPersistence userInfoLogPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}