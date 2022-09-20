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

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.PaymentFile;

import java.io.InputStream;
import java.io.Serializable;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Provides the local service interface for PaymentFile. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see PaymentFileLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.PaymentFileLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.PaymentFileLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface PaymentFileLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentFileLocalServiceUtil} to access the payment file local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.PaymentFileLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

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
	* Get list payment File using SearchLucene
	*
	* @param
	* @return Hits
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Hits searchLucene(
		LinkedHashMap<java.lang.String, java.lang.Object> params, Sort[] sorts,
		int start, int end, SearchContext searchContext)
		throws ParseException, SearchException;

	/**
	* Returns the number of payment files.
	*
	* @return the number of payment files
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPaymentFilesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PaymentFile> getByDID_ISN(long dossierId, boolean isNew);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PaymentFile> getByDossierId(long dossierId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PaymentFile> getPaymentFiles(int start, int end);

	/**
	* Returns all the payment files matching the UUID and company.
	*
	* @param uuid the UUID of the payment files
	* @param companyId the primary key of the company
	* @return the matching payment files, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PaymentFile> getPaymentFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PaymentFile> getPaymentFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<PaymentFile> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PaymentFile> getSyncPaymentFile(long groupId, boolean isNew);

	/**
	* Count number payment File using countLucene
	*
	* @param
	* @return Long
	*/
	public long countLucene(
		LinkedHashMap<java.lang.String, java.lang.Object> params,
		SearchContext searchContext) throws ParseException, SearchException;

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

	/**
	* Adds the payment file to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile addPaymentFile(PaymentFile paymentFile);

	/**
	* Creates a new payment file with the primary key. Does not add the payment file to the database.
	*
	* @param paymentFileId the primary key for the new payment file
	* @return the new payment file
	*/
	public PaymentFile createPaymentFile(long paymentFileId);

	/**
	* Create a payment File
	*
	* @param
	* @return PaymentFile
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile createPaymentFiles(long userId, long groupId,
		long dossierId, java.lang.String referenceUid,
		java.lang.String paymentFee, long paymentAmount,
		java.lang.String paymentNote, java.lang.String epaymentProfile,
		java.lang.String bankInfo, int paymentStatus,
		java.lang.String paymentMethod, java.lang.String paymentFormData,
		ServiceContext serviceContext) throws PortalException;

	/**
	* Deletes the payment file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file that was removed
	* @throws PortalException if a payment file with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public PaymentFile deletePaymentFile(long paymentFileId)
		throws PortalException;

	/**
	* Deletes the payment file from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public PaymentFile deletePaymentFile(PaymentFile paymentFile);

	public PaymentFile fectPaymentFile(long dossierId, java.lang.String refId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PaymentFile fetchPaymentFile(long paymentFileId);

	/**
	* Returns the payment file matching the UUID and group.
	*
	* @param uuid the payment file's UUID
	* @param groupId the primary key of the group
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PaymentFile fetchPaymentFileByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PaymentFile getByG_ID(long groupId, long dossierId);

	/**
	* Get info Epayment Profile
	*
	* @param
	* @return PaymentFile
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PaymentFile getEpaymentProfile(long dossierId,
		java.lang.String referenceUid);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PaymentFile getPaymentFile(long dossierId,
		java.lang.String referenceUid);

	/**
	* Returns the payment file with the primary key.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file
	* @throws PortalException if a payment file with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PaymentFile getPaymentFile(long paymentFileId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PaymentFile getPaymentFileByReferenceUid(long dossierId,
		java.lang.String referenceUid) throws PortalException;

	/**
	* Returns the payment file matching the UUID and group.
	*
	* @param uuid the payment file's UUID
	* @param groupId the primary key of the group
	* @return the matching payment file
	* @throws PortalException if a matching payment file could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PaymentFile getPaymentFileByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile updateApplicantFeeAmount(long paymentFileId,
		int requestPayment, java.lang.String paymentNote);

	/**
	* Update info Epayment Profile
	*
	* @param
	* @return PaymentFile
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile updateEProfile(long dossierId,
		java.lang.String referenceUid, java.lang.String strInput,
		ServiceContext context) throws PortalException;

	/**
	* Update payment File Approval
	*
	* @param
	* @return PaymentFile
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile updateFileApproval(long groupId, long dossierId,
		java.lang.String referenceUid, java.lang.String approveDatetime,
		java.lang.String accountUserName, java.lang.String govAgencyTaxNo,
		java.lang.String invoiceTemplateNo, java.lang.String invoiceIssueNo,
		java.lang.String invoiceNo, ServiceContext serviceContext)
		throws PortalException, SystemException, java.text.ParseException;

	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile updateFileApproval(long groupId, long dossierId,
		java.lang.String referenceUid, java.lang.String approveDatetime,
		java.lang.String accountUserName, java.lang.String govAgencyTaxNo,
		java.lang.String invoiceTemplateNo, java.lang.String invoiceIssueNo,
		java.lang.String invoiceNo, java.lang.String sourceFileName,
		long fileSize, InputStream inputStream, ServiceContext serviceContext)
		throws PortalException, SystemException, java.text.ParseException;

	/**
	* update payment File Confirm
	*
	* @param
	* @return PaymentFile
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile updateFileConfirm(long groupId, long dossierId,
		java.lang.String referenceUid, java.lang.String confirmNote,
		java.lang.String paymentMethod, java.lang.String confirmPayload,
		ServiceContext serviceContext) throws PortalException, SystemException;

	/**
	* update payment File Confirm
	*
	* @param
	* @return PaymentFile
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile updateFileConfirm(long groupId, long dossierId,
		java.lang.String referenceUid, java.lang.String confirmNote,
		java.lang.String paymentMethod, java.lang.String confirmPayload,
		java.lang.String sourceFileName, long fileSize,
		InputStream inputStream, ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	* Updates the payment file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the payment file
	* @return the payment file that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile updatePaymentFile(PaymentFile paymentFile);
}