package org.opencps.api.controller.impl;

import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusException;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.opencps.api.controller.PaymentFileManagement;
import org.opencps.api.controller.exception.ErrorMsg;
import org.opencps.api.controller.util.PaymentFileUtils;
import org.opencps.api.paymentfile.model.PaymentFileInputModel;
import org.opencps.api.paymentfile.model.PaymentFileModel;
import org.opencps.api.paymentfile.model.PaymentFileResultModel;
import org.opencps.api.paymentfile.model.PaymentFileSearchModel;
import org.opencps.api.paymentfile.model.PaymentFileSearchResultModel;
import org.opencps.auth.api.BackendAuth;
import org.opencps.auth.api.BackendAuthImpl;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;
import org.opencps.auth.api.keys.ActionKeys;
import org.opencps.dossiermgt.action.PaymentFileActions;
import org.opencps.dossiermgt.action.impl.PaymentFileActionsImpl;
import org.opencps.dossiermgt.action.util.DossierMgtUtils;
import org.opencps.dossiermgt.constants.PaymentFileTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.PaymentConfig;
import org.opencps.dossiermgt.model.PaymentFile;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.PaymentConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.PaymentFileLocalServiceUtil;
import org.opencps.usermgt.model.WorkingUnit;
import org.opencps.usermgt.service.WorkingUnitLocalServiceUtil;

public class PaymentFileManagementImpl implements PaymentFileManagement {

	/**
	 * Get all PaymentFile of DossierId
	 * 
	 * @param dossierId
	 * @return Response
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Response getPaymentFilesByDossierId(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, PaymentFileSearchModel search) {

		BackendAuth auth = new BackendAuthImpl();
		try {

			// Check user is login
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			if (search.getEnd() == 0) {
				search.setStart(-1);
				search.setEnd(-1);
			}

			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
			long dossierId = GetterUtil.getLong(id);

			// Default sort by modifiedDate
			Sort[] sorts = new Sort[] {
					SortFactoryUtil.create(Field.MODIFIED_DATE + "_sortable", Sort.STRING_TYPE, true) };

			if (Validator.isNotNull(search.getSort()) && Validator.isNotNull(search.getOrder())) {
				sorts = new Sort[] { SortFactoryUtil.create(search.getSort() + "_sortable", Sort.STRING_TYPE,
						GetterUtil.getBoolean(search.getOrder())) };
			}

			PaymentFileActions actions = new PaymentFileActionsImpl();
			PaymentFileResultModel results = new PaymentFileResultModel();

			// get JSON data by dossierId
			JSONObject jsonData = actions.getByDossierId(dossierId, serviceContext.getCompanyId(), groupId, sorts,
					search.getStart(), search.getEnd(), serviceContext);

			// Parse JSONObejct to PaymentFileResultModel Object
			results.setTotal(jsonData.getInt("total"));
			results.getData().addAll(PaymentFileUtils.mappingToPaymentFileModel((List<Document>) jsonData.get("data")));

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			ErrorMsg error = new ErrorMsg();

			error.setMessage("not found!");
			error.setCode(404);
			error.setDescription("not found!");

			return Response.status(404).entity(error).build();
		}
	}

	/**
	 * Create PaymentFile of DossierId
	 * 
	 * @param form
	 *            params
	 * @return Response
	 */
//	@Override
//	public Response createPaymentFileByDossierId(HttpServletRequest request, HttpHeaders header, Company company,
//			Locale locale, User user, ServiceContext serviceContext, String id, PaymentFileInputModel input) {
//
//		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
//		
//		_log.info("groupId_"+groupId);
//		_log.info("groupId_"+id);
//
//		long userId = serviceContext.getUserId();
//		
//
//		// TODO get Dossier by referenceUid if dossierId = 0
//		// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;
//
//		BackendAuth auth = new BackendAuthImpl();
//
//		try {
//			/* Check user is login - START */
//			if (!auth.isAuth(serviceContext)) {
//				throw new UnauthenticationException();
//			}
//			Dossier dossier = getDossier(id, groupId);
//
//			long dossierId = dossier.getPrimaryKey();
//
//			if (!auth.hasResource(serviceContext, PaymentFile.class.getName(), ActionKeys.ADD_ENTRY)) {
//				throw new UnauthorizationException();
//			}
//			/* Check user is login - END */
//
//			PaymentFileActions actions = new PaymentFileActionsImpl();
//
//			PaymentFileInputModel PaymentFileInput = new PaymentFileInputModel();
//
//			PaymentFile paymentFile = actions.createPaymentFile(userId, groupId, dossierId, input.getReferenceUid(),
//					input.getGovAgencyCode(), input.getGovAgencyName(), input.getApplicantName(),
//					input.getApplicantIdNo(), input.getPaymentFee(), input.getPaymentAmount(), input.getPaymentNote(),
//					input.getEpaymentProfile(), input.getBankInfo(), serviceContext);
//			
//			paymentFile.setInvoiceTemplateNo(input.getInvoiceTemplateNo());
//			
//			PaymentFileLocalServiceUtil.updatePaymentFile(paymentFile);
//
//			PaymentFileInput = PaymentFileUtils.mappingToPaymentFileInputModel(paymentFile);
//
//			return Response.status(200).entity(PaymentFileInput).build();
//
//		} catch (Exception e) {
//			return processException(e);
//		}
//	}

	/**
	 * Get detail PaymentFile of DossierId and referenceUid
	 * 
	 * @param dossierId,
	 * @param referenceUid
	 * @return Response
	 */
	@Override
	public Response getPaymentFileByReferenceUid(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, Long id, String referenceUid) {

		// long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		long dossierId = GetterUtil.getLong(id);

		// TODO get Dossier by referenceUid if dossierId = 0
		// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;
		BackendAuth auth = new BackendAuthImpl();

		try {

			// Check user is login
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			// Search full query
			// int start = -1;
			// int end = -1;

			// TODO: Condition sort
			// Sort[] sorts = new Sort[] {};
			// Sort[] sorts = new Sort[] {SortFactoryUtil.create(query.getSort()
			// + "_sortable",Sort.STRING_TYPE,
			// GetterUtil.getBoolean(query.getOrder())) };

			PaymentFileActions actions = new PaymentFileActionsImpl();
			// PaymentFileResultModel PaymentFileDetail = new
			// PaymentFileResultModel();
			// PaymentFile paymentFile = actions.getPaymentFileDetail(dossierId,
			// referenceUid);

			// get JSON data by dossierId

			// List<Document> data = actions.getPaymentFileDetail(dossierId,
			// referenceUid, serviceContext.getCompanyId(),
			// groupId, sorts, start, end, serviceContext);

			// List<PaymentFileModel> paymentFileDetail =
			// PaymentFileUtils.mappingToPaymentFileModel(data);
			// dossierPermission.hasGetDetailDossier(groupId, user.getUserId(),
			// dossier, option.getServiceProcessId());

			// DossierDetailModel result =
			// DossierUtils.mappingForGetDetail(dossier);
			// PaymentFileModel results = paymentFileDetail.get(0);

			PaymentFile paymentFile = actions.getPaymentFile(dossierId, referenceUid);

			PaymentFileModel result = PaymentFileUtils.mappingToPaymentFileModel(paymentFile);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	/**
	 * Get info EpaymentProfile of DossierId and referenceUid
	 * 
	 * @param dossierId
	 * @param referenceUid
	 * @return Response
	 */
	@Override
	public Response getEpaymentProfile(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, String referenceUid) {
		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			PaymentFileActions actions = new PaymentFileActionsImpl();

			long dossierId = GetterUtil.getLong(id);

			// TODO get Dossier by referenceUid if dossierId = 0
			// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;

			PaymentFile paymentFile = actions.getPaymentFile(dossierId, referenceUid);

			String ePaymentProfile = paymentFile.getEpaymentProfile();

			JSONObject result = JSONFactoryUtil.createJSONObject(ePaymentProfile);

			return Response.status(200).entity(result.toJSONString()).build();

		} catch (Exception e) {
			ErrorMsg error = new ErrorMsg();

			error.setMessage("Content not found!");
			error.setCode(404);
			error.setDescription(e.getMessage());

			return Response.status(404).entity(error).build();
		}
	}

	/**
	 * Update info EpaymentProfile of DossierId and referenceUid
	 * 
	 * @param form
	 *            params
	 * @return Response
	 */
	@Override
	public Response updateEpaymentProfile(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, String referenceUid,
			PaymentFileInputModel input) {
		BackendAuth auth = new BackendAuthImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			if (!auth.hasResource(serviceContext, PaymentConfig.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}

			long dossierId = GetterUtil.getLong(id);

			// TODO get Dossier by referenceUid if dossierId = 0
			// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;

			PaymentFileActions actions = new PaymentFileActionsImpl();

			PaymentFile paymentFile = actions.updateEProfile(dossierId, referenceUid, input.getEpaymentProfile(),
					serviceContext);

			String result = paymentFile.getEpaymentProfile();

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	/**
	 * Update Payment File Confirm of DossierId and referenceUid
	 * 
	 * @param form
	 *            params
	 * @return Response
	 */
	@Override
	public Response updatePaymentFileConfirm(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, String referenceUid, Attachment file,
			String confirmNote, String paymentMethod, String confirmPayload) {

		BackendAuth auth = new BackendAuthImpl();

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		long dossierId = GetterUtil.getLong(id);

		// TODO get Dossier by referenceUid if dossierId = 0
		// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			DataHandler dataHandler = null;

			if (file != null) {
				dataHandler = file.getDataHandler();
			}

			PaymentFileActions action = new PaymentFileActionsImpl();

			PaymentFile paymentFile = action.updateFileConfirm(groupId, dossierId, referenceUid, confirmNote,
					paymentMethod, confirmPayload, dataHandler != null ? dataHandler.getName() : StringPool.BLANK, 0L,
					dataHandler != null ? dataHandler.getInputStream() : null, serviceContext);

			PaymentFileModel result = PaymentFileUtils.mappingToPaymentFileModel(paymentFile);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			e.printStackTrace();

			return processException(e);
		}
	}

	@Override
	public Response updatePaymentFileConfirmNoAttachment(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, String id, String referenceUid,
			PaymentFileInputModel input) {

		BackendAuth auth = new BackendAuthImpl();

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		long dossierId = GetterUtil.getLong(id);

		// TODO get Dossier by referenceUid if dossierId = 0
		// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			PaymentFileActions action = new PaymentFileActionsImpl();

			PaymentFile paymentFile = action.updateFileConfirm(groupId, dossierId, referenceUid, input.getConfirmNote(),
					input.getPaymentMethod(), input.getConfirmPayload(), serviceContext);

			PaymentFileModel result = PaymentFileUtils.mappingToPaymentFileModel(paymentFile);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			e.printStackTrace();

			return processException(e);
		}
	}

	/**
	 * Update Payment File Approval of DossierId and referenceUid
	 * 
	 * @param form
	 *            params
	 * @return Response
	 */
	@Override
	public Response updatePaymentFileApproval(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, String referenceUid, Attachment file,
			String approveDatetime, String accountUserName, String govAgencyTaxNo, String invoiceTemplateNo,
			String invoiceIssueNo, String invoiceNo) {
		BackendAuth auth = new BackendAuthImpl();
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		long dossierId = GetterUtil.getLong(id);

		// TODO get Dossier by referenceUid if dossierId = 0
		// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			DataHandler dataHandler = null;

			if (file != null) {
				dataHandler = file.getDataHandler();
			}

			PaymentFileActions action = new PaymentFileActionsImpl();

			PaymentFile paymentFile = action.updateFileApproval(groupId, dossierId, referenceUid, approveDatetime,
					accountUserName, govAgencyTaxNo, invoiceTemplateNo, invoiceIssueNo, invoiceNo,
					dataHandler != null ? dataHandler.getName() : StringPool.BLANK, 0L,
					dataHandler != null ? dataHandler.getInputStream() : null, serviceContext);

			PaymentFileModel result = PaymentFileUtils.mappingToPaymentFileModel(paymentFile);

			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	@Override
	public Response updatePaymentFileApprovalNoAttachment(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, String id, String referenceUid,
			PaymentFileInputModel input) {
		BackendAuth auth = new BackendAuthImpl();
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		long dossierId = GetterUtil.getLong(id);

		// TODO get Dossier by referenceUid if dossierId = 0
		// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;
		
		
		Dossier dossier = null;

		if (dossierId != 0) {
			dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
			if (Validator.isNull(dossier)) {
				dossier = DossierLocalServiceUtil.getByRef(groupId, id);
			}
		} else {
			dossier = DossierLocalServiceUtil.getByRef(groupId, id);
			
		}
				
		if (Validator.isNotNull(dossier))
			dossierId = dossier.getDossierId();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			PaymentFileActions action = new PaymentFileActionsImpl();

			//boolean isSync = GetterUtil.getBoolean(input.getIsSync());
			boolean isSync = true;
			PaymentFile paymentFile = action.updateFileApproval(groupId, dossierId, referenceUid,
					input.getApproveDatetime(), input.getAccountUserName(), input.getGovAgencyTaxNo(),
					input.getInvoiceTemplateNo(), input.getInvoiceIssueNo(), input.getInvoiceNo(), isSync, serviceContext);
			
			if (isSync) {
				paymentFile.setIsNew(false);
				
				PaymentFileLocalServiceUtil.updatePaymentFile(paymentFile);
			}
						
			PaymentFileModel result = PaymentFileUtils.mappingToPaymentFileModel(paymentFile);
			return Response.status(200).entity(result).build();

		} catch (Exception e) {
			_log.error(e);
			return processException(e);
		}
	}

	/**
	 * Download payment File Confirm
	 * 
	 * @param
	 * @return Response
	 */
	@Override
	public Response downloadConfirmFile(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, String referenceUid) {

		BackendAuth auth = new BackendAuthImpl();

		long dossierId = GetterUtil.getLong(id);

		// TODO get Dossier by referenceUid if dossierId = 0
		// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			PaymentFileActions action = new PaymentFileActionsImpl();
			PaymentFile paymentFile = action.getPaymentFileByReferenceUid(dossierId, referenceUid);

			if (paymentFile.getConfirmFileEntryId() > 0) {

				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(paymentFile.getConfirmFileEntryId());

				File file = DLFileEntryLocalServiceUtil.getFile(fileEntry.getFileEntryId(), fileEntry.getVersion(),
						true);

				ResponseBuilder responseBuilder = Response.ok((Object) file);

				responseBuilder.header("Content-Disposition",
						"attachment; filename=\"" + fileEntry.getFileName() + "\"");
				responseBuilder.header("Content-Type", fileEntry.getMimeType());

				return responseBuilder.build();

			} else {
				return Response.status(HttpURLConnection.HTTP_NO_CONTENT).build();
			}

		} catch (Exception e) {
			return processException(e);
		}
	}

	/**
	 * Download Invoice File Confirm
	 * 
	 * @param
	 * @return Response
	 */
	@Override
	public Response downloadInvoiceFile(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, String referenceUid) {
		BackendAuth auth = new BackendAuthImpl();

		long dossierId = GetterUtil.getLong(id);

		// TODO get Dossier by referenceUid if dossierId = 0
		// String referenceUid = dossierId == 0 ? id : StringPool.BLANK;

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			PaymentFileActions action = new PaymentFileActionsImpl();

			PaymentFile paymentFile = action.getPaymentFileByReferenceUid(dossierId, referenceUid);

			if (paymentFile.getInvoiceFileEntryId() > 0) {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(paymentFile.getInvoiceFileEntryId());

				File file = DLFileEntryLocalServiceUtil.getFile(fileEntry.getFileEntryId(), fileEntry.getVersion(),
						true);

				ResponseBuilder responseBuilder = Response.ok((Object) file);

				responseBuilder.header("Content-Disposition",
						"attachment; filename=\"" + fileEntry.getFileName() + "\"");
				responseBuilder.header("Content-Type", fileEntry.getMimeType());

				return responseBuilder.build();
			} else {
				return Response.status(HttpURLConnection.HTTP_NO_CONTENT).build();
			}

		} catch (Exception e) {
			return processException(e);
		}
	}

	/**
	 * Get all Payment File
	 * 
	 * @param
	 * @return Response
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Response getPaymentFiles(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, PaymentFileSearchModel search) {

		BackendAuth auth = new BackendAuthImpl();

		try {
			// Check user is login
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			/* Search full Query -START */
			if (search.getEnd() == 0) {
				search.setStart(-1);
				search.setEnd(-1);
			}
			/* Search full Query -END */
			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

			PaymentFileSearchResultModel results = new PaymentFileSearchResultModel();
			PaymentFileActions action = new PaymentFileActionsImpl();

			/* Add params in Map - START */
			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(Field.KEYWORD_SEARCH, search.getKeyword());
			params.put(PaymentFileTerm.SERVICE, search.getService());
			params.put(PaymentFileTerm.AGENCY, search.getAgency());
			params.put(PaymentFileTerm.STATUS, search.getStatus());
			params.put(PaymentFileTerm.IS_NEW, search.getIsNew());
			/* Add params in Map - END */

			// Default sort by modifiedDate
			Sort[] sorts = new Sort[] {
					SortFactoryUtil.create(Field.MODIFIED_DATE + "_sortable", Sort.STRING_TYPE, true) };

			if (Validator.isNotNull(search.getSort()) && Validator.isNotNull(search.getOrder())) {
				sorts = new Sort[] { SortFactoryUtil.create(search.getSort() + "_sortable", Sort.STRING_TYPE,
						GetterUtil.getBoolean(search.getOrder())) };
			}
			
			//_log.info("go****");

			JSONObject paymentFileJsonObject = action.getPaymentFiles(serviceContext.getUserId(),
					serviceContext.getCompanyId(), groupId, params, sorts, search.getStart(), search.getEnd(),
					serviceContext);
			//_log.info("go****2");

			List<Document> documents = (List<Document>) paymentFileJsonObject.get("data");

			results.setTotal(paymentFileJsonObject.getInt("total"));

			results.getData().addAll(PaymentFileUtils.mappingToPaymentFileSearchResultModel(documents));
			//_log.info("go****3");
			
			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			return processException(e);
		}
	}

	private Response processException(Exception e) {
		ErrorMsg error = new ErrorMsg();

		if (e instanceof UnauthenticationException) {
			error.setMessage("Non-Authoritative Information.");
			error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
			error.setDescription("Non-Authoritative Information.");

			return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
		} else {
			if (e instanceof UnauthorizationException) {
				error.setMessage("Unauthorized.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Unauthorized.");

				return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

			} else {
				
				error.setMessage("No Content.");
				error.setCode(HttpURLConnection.HTTP_FORBIDDEN);
				error.setDescription(e.getMessage());
				
				//_log.error(e);

				return Response.status(HttpURLConnection.HTTP_FORBIDDEN).entity(error).build();

			}
		}
	}

	@Override
	public Response processingKeyPay(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String dossierUUid, String paymentFileUUid) {
		// TODO Auto-generated method stub
		//URI uri = null;
		try {
			
			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
			Dossier dossier = DossierLocalServiceUtil.getByRef(groupId, dossierUUid);
			
			PaymentFile paymentFile = PaymentFileLocalServiceUtil.getPaymentFileByReferenceUid(dossier.getDossierId(), paymentFileUUid);
			
			PaymentFileActions actions = new PaymentFileActionsImpl();
			
			// Change payment Status = 2
			actions.updateFileConfirm(paymentFile.getGroupId(), paymentFile.getDossierId(), paymentFile.getReferenceUid(), StringPool.BLANK, "N\u1ED9p online", JSONFactoryUtil.createJSONObject().toJSONString(), serviceContext);
			
			JSONObject result = JSONFactoryUtil.createJSONObject();
			result.put("dossierNo", dossier.getDossierNo());
			result.put("serviceName", dossier.getServiceName());
			result.put("govAgencyName", dossier.getGovAgencyName());
			result.put("paymentFee", paymentFile.getPaymentFee());
			result.put("paymentAmount", paymentFile.getPaymentAmount());
			result.put("paymentPortal", "KEYPAY");
			
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			_log.error(e);
			return Response.noContent().build();
		}
		
	}

	@Override
	public Response createPaymentFileByDossierId(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String id, PaymentFileInputModel input) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		
		_log.info("SONDT API CREATE PAYMENTFILE INPUT ====================== " + JSONFactoryUtil.looseSerialize(input));
		
		long userId = serviceContext.getUserId();
		
		BackendAuth auth = new BackendAuthImpl();

		try {
			/* Check user is login - START */
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);
//			_log.info("SONDT CREATE PAYMENTFILE dossier ====================== " + JSONFactoryUtil.looseSerialize(dossier));
			long dossierId = dossier.getPrimaryKey();

			if (!auth.hasResource(serviceContext, PaymentFile.class.getName(), ActionKeys.ADD_ENTRY)) {
				throw new UnauthorizationException();
			}
			/* Check user is login - END */

			PaymentFileActions actions = new PaymentFileActionsImpl();

			PaymentFileInputModel paymentFileInput;

			PaymentFile oldPaymentFile = PaymentFileLocalServiceUtil.getByG_ID(groupId, dossier.getDossierId());
			//_log.info("SONDT FROM API CREATE PAYMENTFILE dossierId ============ " + dossier.getDossierId()+" ======== GROUPID ===== "+groupId);
			//_log.info("SONDT FROM API CREATE PAYMENTFILE oldPaymentFile ====================== " + JSONFactoryUtil.looseSerialize(oldPaymentFile));
			PaymentFile paymentFile = null;
			
			if (oldPaymentFile != null) {
				paymentFile = oldPaymentFile;
			}
			else {
				paymentFile = actions.createPaymentFile(userId, groupId, dossierId, input.getReferenceUid(),
						input.getPaymentFee(), input.getPaymentAmount(), input.getPaymentNote(),
						input.getEpaymentProfile(), input.getBankInfo(), 0, input.getPaymentMethod(),
						input.getPaymentFormData(), serviceContext);
			}
			
			paymentFile.setInvoiceTemplateNo(input.getInvoiceTemplateNo());
			if(Validator.isNotNull(input.getConfirmFileEntryId())){
				paymentFile.setConfirmFileEntryId(input.getConfirmFileEntryId());
			}
			if(Validator.isNotNull(input.getPaymentStatus())){
				paymentFile.setPaymentStatus(input.getPaymentStatus());
			}
			if(Validator.isNotNull(input.getEinvoice())) {
				paymentFile.setEinvoice(input.getEinvoice());
			}
			if(Validator.isNotNull(input.getPaymentAmount())) {
				paymentFile.setPaymentAmount(input.getPaymentAmount());
			}
			if(Validator.isNotNull(input.getPaymentMethod())){
				paymentFile.setPaymentMethod(input.getPaymentMethod());
			}
			if(Validator.isNotNull(input.getGovAgencyCode())){
				paymentFile.setGovAgencyCode(input.getGovAgencyCode());
			}
			if(Validator.isNotNull(input.getGovAgencyName())){
				paymentFile.setGovAgencyName(input.getGovAgencyName());
			}
			if(Validator.isNotNull(input.getGovAgencyTaxNo())){
				paymentFile.setGovAgencyTaxNo(input.getGovAgencyTaxNo());
			}

			PaymentFileLocalServiceUtil.updatePaymentFile(paymentFile);

			paymentFileInput = PaymentFileUtils.mappingToPaymentFileInputModel(paymentFile);
			_log.info("PaymentFileInput: "+paymentFileInput);

			return Response.status(200).entity(paymentFileInput).build();

		} catch (Exception e) {
			_log.error(e);
			return processException(e);
		}	
	}

	@Override
	public Response previewInvoiceFile(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, String referenceUid) {
		BackendAuth auth = new BackendAuthImpl();
		
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			if (dossier != null) {
				PaymentFileActions action = new PaymentFileActionsImpl();
				PaymentFile paymentFile = action.getPaymentFileByReferenceUid(dossier.getDossierId(), referenceUid);
				if (paymentFile != null) {
					PaymentConfig paymentConfig = PaymentConfigLocalServiceUtil.getByInvoiceTemplateNo(groupId, paymentFile.getInvoiceTemplateNo());
					if (paymentConfig != null) {
						String formData = JSONFactoryUtil.looseSerialize(paymentFile);
						String formReport = paymentConfig.getInvoiceForm();

						JSONObject jsonData = JSONFactoryUtil.createJSONObject(formData);
						//
						if (paymentFile != null) {
							String paymentFormData = paymentFile.getPaymentFormData();
							if (Validator.isNotNull(paymentFormData)) {
								JSONObject jsonPaymentFormData = JSONFactoryUtil.createJSONObject(paymentFormData);
								//
								Iterator<String> keys = jsonPaymentFormData.keys();

								while (keys.hasNext()) {
									String key = keys.next();
									jsonData.put(key, jsonPaymentFormData.getString(key));
								}
							}
						}

						jsonData.put("applicantName", dossier.getApplicantName());

						StringBuilder address = new StringBuilder();
						address.append(dossier.getAddress());
						address.append(", ");
						address.append(dossier.getWardName());
						address.append(", ");
						address.append(dossier.getDistrictName());
						address.append(", ");
						address.append(dossier.getCityName());

						jsonData.put("address", address.toString());

						String num = PaymentFileUtils.readNum(Long.toString(paymentFile.getPaymentAmount()));
						jsonData.put("numToWord", num);
						jsonData.put("invoiceTemplateNo", paymentConfig.getInvoiceTemplateNo());
						jsonData.put("invoiceIssueNo", paymentConfig.getInvoiceIssueNo());
						jsonData.put("govAgencyTaxNo", paymentConfig.getGovAgencyTaxNo());

						WorkingUnit workingUnit = WorkingUnitLocalServiceUtil.fetchByF_govAgencyCode(groupId,
								dossier.getGovAgencyCode());
						if (Validator.isNotNull(workingUnit)) {
							jsonData.put("govAddress", workingUnit.getAddress());
						} else {
							jsonData.put("govAddress", "");
						}

						// formData = mapper.writeValueAsString(map);
						_log.info("PREVIEW PAYMENTFILE FORMDATA ============================== " + jsonData);
						
						Message message = new Message();

						message.put("formReport", formReport);
						message.put("formData", jsonData.toJSONString());

						message.setResponseId(String.valueOf(dossier.getPrimaryKeyObj()));
						message.setResponseDestinationName("jasper/engine/preview/callback");

						try {
							String previewResponse = (String) MessageBusUtil
									.sendSynchronousMessage("jasper/engine/preview/destination", message, 10000);

							File file = new File(previewResponse);

							ResponseBuilder responseBuilder = Response.ok((Object) file);

							responseBuilder.header("Content-Disposition",
										"attachment; filename=\"" + file.getName() + "\"");
							responseBuilder.header("Content-Type", "application/pdf");

							return responseBuilder.build();

						} catch (MessageBusException e) {
							_log.error(e);
							throw new Exception("Preview rendering not available");
						}
					}
				}
			}

			return Response.status(200).entity("Not invoice preview").build();
		} catch (Exception e) {
			_log.error(e);
			return processException(e);
		}		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response resolveConflictPayments(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		//long userId = user.getUserId();
		PaymentFileActions action = new PaymentFileActionsImpl();
		Indexer<PaymentFile> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(PaymentFile.class);
		
		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
		params.put(Field.GROUP_ID, String.valueOf(groupId));

		//DossierResultsModel results = new DossierResultsModel();

		JSONObject jsonData = action.getPaymentFiles(serviceContext.getUserId(),
				serviceContext.getCompanyId(), groupId, params, null, -1, -1,
				serviceContext);
		
		//List<Dossier> lstInDbs = DossierLocalServiceUtil.getDossiers(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		long total = jsonData.getLong("total");
		//JSONArray dossierArr = JSONFactoryUtil.createJSONArray();
		
		if (total > 0) {
			List<Document> lstDocuments = (List<Document>) jsonData.get("data");	
			for (Document document : lstDocuments) {
				long paymentFileId = GetterUtil.getLong(document.get(PaymentFileTerm.PAYMENT_FILE_ID));
				long companyId = GetterUtil.getLong(document.get(Field.COMPANY_ID));
				String uid = document.get(Field.UID);
				PaymentFile oldPaymentFile = PaymentFileLocalServiceUtil.fetchPaymentFile(paymentFileId);
				if (oldPaymentFile == null) {
					try {
						indexer.delete(companyId, uid);
					} catch (SearchException e) {
					}
				}
			}
		}
		else {
		}

		return Response.status(200).entity("Dữ liệu đã được clean").build();
	}

	Log _log = LogFactoryUtil.getLog(PaymentFileManagementImpl.class);
	
}
