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

package org.opencps.dossiermgt.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentFileLocalService}.
 *
 * @author huymq
 * @see PaymentFileLocalService
 * @generated
 */
@ProviderType
public class PaymentFileLocalServiceWrapper implements PaymentFileLocalService,
	ServiceWrapper<PaymentFileLocalService> {
	public PaymentFileLocalServiceWrapper(
		PaymentFileLocalService paymentFileLocalService) {
		_paymentFileLocalService = paymentFileLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _paymentFileLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentFileLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _paymentFileLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _paymentFileLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paymentFileLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paymentFileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Get list payment File using SearchLucene
	*
	* @param
	* @return Hits
	*/
	@Override
	public com.liferay.portal.kernel.search.Hits searchLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.Sort[] sorts, int start, int end,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return _paymentFileLocalService.searchLucene(params, sorts, start, end,
			searchContext);
	}

	/**
	* Returns the number of payment files.
	*
	* @return the number of payment files
	*/
	@Override
	public int getPaymentFilesCount() {
		return _paymentFileLocalService.getPaymentFilesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _paymentFileLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _paymentFileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _paymentFileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _paymentFileLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.PaymentFile> getByDID_ISN(
		long dossierId, boolean isNew) {
		return _paymentFileLocalService.getByDID_ISN(dossierId, isNew);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.PaymentFile> getByDossierId(
		long dossierId) {
		return _paymentFileLocalService.getByDossierId(dossierId);
	}

	/**
	* Returns a range of all the payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of payment files
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.PaymentFile> getPaymentFiles(
		int start, int end) {
		return _paymentFileLocalService.getPaymentFiles(start, end);
	}

	/**
	* Returns all the payment files matching the UUID and company.
	*
	* @param uuid the UUID of the payment files
	* @param companyId the primary key of the company
	* @return the matching payment files, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.PaymentFile> getPaymentFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _paymentFileLocalService.getPaymentFilesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of payment files matching the UUID and company.
	*
	* @param uuid the UUID of the payment files
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching payment files, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.PaymentFile> getPaymentFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.PaymentFile> orderByComparator) {
		return _paymentFileLocalService.getPaymentFilesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.PaymentFile> getSyncPaymentFile(
		long groupId, boolean isNew) {
		return _paymentFileLocalService.getSyncPaymentFile(groupId, isNew);
	}

	/**
	* Count number payment File using countLucene
	*
	* @param
	* @return Long
	*/
	@Override
	public long countLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return _paymentFileLocalService.countLucene(params, searchContext);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _paymentFileLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _paymentFileLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the payment file to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was added
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile addPaymentFile(
		org.opencps.dossiermgt.model.PaymentFile paymentFile) {
		return _paymentFileLocalService.addPaymentFile(paymentFile);
	}

	/**
	* Creates a new payment file with the primary key. Does not add the payment file to the database.
	*
	* @param paymentFileId the primary key for the new payment file
	* @return the new payment file
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile createPaymentFile(
		long paymentFileId) {
		return _paymentFileLocalService.createPaymentFile(paymentFileId);
	}

	/**
	* Create a payment File
	*
	* @param
	* @return PaymentFile
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile createPaymentFiles(
		long userId, long groupId, long dossierId,
		java.lang.String referenceUid, java.lang.String paymentFee,
		long paymentAmount, java.lang.String paymentNote,
		java.lang.String epaymentProfile, java.lang.String bankInfo,
		int paymentStatus, java.lang.String paymentMethod,
		java.lang.String paymentFormData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paymentFileLocalService.createPaymentFiles(userId, groupId,
			dossierId, referenceUid, paymentFee, paymentAmount, paymentNote,
			epaymentProfile, bankInfo, paymentStatus, paymentMethod,
			paymentFormData, serviceContext);
	}

	/**
	* Deletes the payment file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file that was removed
	* @throws PortalException if a payment file with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile deletePaymentFile(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paymentFileLocalService.deletePaymentFile(paymentFileId);
	}

	/**
	* Deletes the payment file from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was removed
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile deletePaymentFile(
		org.opencps.dossiermgt.model.PaymentFile paymentFile) {
		return _paymentFileLocalService.deletePaymentFile(paymentFile);
	}

	@Override
	public org.opencps.dossiermgt.model.PaymentFile fectPaymentFile(
		long dossierId, java.lang.String refId) {
		return _paymentFileLocalService.fectPaymentFile(dossierId, refId);
	}

	@Override
	public org.opencps.dossiermgt.model.PaymentFile fetchPaymentFile(
		long paymentFileId) {
		return _paymentFileLocalService.fetchPaymentFile(paymentFileId);
	}

	/**
	* Returns the payment file matching the UUID and group.
	*
	* @param uuid the payment file's UUID
	* @param groupId the primary key of the group
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile fetchPaymentFileByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _paymentFileLocalService.fetchPaymentFileByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public org.opencps.dossiermgt.model.PaymentFile getByG_ID(long groupId,
		long dossierId) {
		return _paymentFileLocalService.getByG_ID(groupId, dossierId);
	}

	/**
	* Get info Epayment Profile
	*
	* @param
	* @return PaymentFile
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile getEpaymentProfile(
		long dossierId, java.lang.String referenceUid) {
		return _paymentFileLocalService.getEpaymentProfile(dossierId,
			referenceUid);
	}

	@Override
	public org.opencps.dossiermgt.model.PaymentFile getPaymentFile(
		long dossierId, java.lang.String referenceUid) {
		return _paymentFileLocalService.getPaymentFile(dossierId, referenceUid);
	}

	/**
	* Returns the payment file with the primary key.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file
	* @throws PortalException if a payment file with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile getPaymentFile(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paymentFileLocalService.getPaymentFile(paymentFileId);
	}

	@Override
	public org.opencps.dossiermgt.model.PaymentFile getPaymentFileByReferenceUid(
		long dossierId, java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paymentFileLocalService.getPaymentFileByReferenceUid(dossierId,
			referenceUid);
	}

	/**
	* Returns the payment file matching the UUID and group.
	*
	* @param uuid the payment file's UUID
	* @param groupId the primary key of the group
	* @return the matching payment file
	* @throws PortalException if a matching payment file could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile getPaymentFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paymentFileLocalService.getPaymentFileByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public org.opencps.dossiermgt.model.PaymentFile updateApplicantFeeAmount(
		long paymentFileId, int requestPayment, java.lang.String paymentNote) {
		return _paymentFileLocalService.updateApplicantFeeAmount(paymentFileId,
			requestPayment, paymentNote);
	}

	/**
	* Update info Epayment Profile
	*
	* @param
	* @return PaymentFile
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile updateEProfile(
		long dossierId, java.lang.String referenceUid,
		java.lang.String strInput,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paymentFileLocalService.updateEProfile(dossierId, referenceUid,
			strInput, context);
	}

	/**
	* Update payment File Approval
	*
	* @param
	* @return PaymentFile
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile updateFileApproval(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String approveDatetime, java.lang.String accountUserName,
		java.lang.String govAgencyTaxNo, java.lang.String invoiceTemplateNo,
		java.lang.String invoiceIssueNo, java.lang.String invoiceNo,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.text.ParseException {
		return _paymentFileLocalService.updateFileApproval(groupId, dossierId,
			referenceUid, approveDatetime, accountUserName, govAgencyTaxNo,
			invoiceTemplateNo, invoiceIssueNo, invoiceNo, serviceContext);
	}

	@Override
	public org.opencps.dossiermgt.model.PaymentFile updateFileApproval(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String approveDatetime, java.lang.String accountUserName,
		java.lang.String govAgencyTaxNo, java.lang.String invoiceTemplateNo,
		java.lang.String invoiceIssueNo, java.lang.String invoiceNo,
		java.lang.String sourceFileName, long fileSize,
		java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.text.ParseException {
		return _paymentFileLocalService.updateFileApproval(groupId, dossierId,
			referenceUid, approveDatetime, accountUserName, govAgencyTaxNo,
			invoiceTemplateNo, invoiceIssueNo, invoiceNo, sourceFileName,
			fileSize, inputStream, serviceContext);
	}

	/**
	* update payment File Confirm
	*
	* @param
	* @return PaymentFile
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile updateFileConfirm(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String confirmNote, java.lang.String paymentMethod,
		java.lang.String confirmPayload,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.updateFileConfirm(groupId, dossierId,
			referenceUid, confirmNote, paymentMethod, confirmPayload,
			serviceContext);
	}

	/**
	* update payment File Confirm
	*
	* @param
	* @return PaymentFile
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile updateFileConfirm(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String confirmNote, java.lang.String paymentMethod,
		java.lang.String confirmPayload, java.lang.String sourceFileName,
		long fileSize, java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.updateFileConfirm(groupId, dossierId,
			referenceUid, confirmNote, paymentMethod, confirmPayload,
			sourceFileName, fileSize, inputStream, serviceContext);
	}

	/**
	* Updates the payment file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was updated
	*/
	@Override
	public org.opencps.dossiermgt.model.PaymentFile updatePaymentFile(
		org.opencps.dossiermgt.model.PaymentFile paymentFile) {
		return _paymentFileLocalService.updatePaymentFile(paymentFile);
	}

	@Override
	public PaymentFileLocalService getWrappedService() {
		return _paymentFileLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentFileLocalService paymentFileLocalService) {
		_paymentFileLocalService = paymentFileLocalService;
	}

	private PaymentFileLocalService _paymentFileLocalService;
}